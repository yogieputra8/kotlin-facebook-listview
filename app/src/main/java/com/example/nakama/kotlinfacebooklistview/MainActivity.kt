package com.example.nakama.kotlinfacebooklistview

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView
import kotlinx.android.synthetic.main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listview = findViewById<ListView>(R.id.main_listview)
        listview.adapter = MyCustomAdapter(context = this)
    }

    private class MyCustomAdapter(context: Context): BaseAdapter(){
        private val mContext: Context

        init {
            mContext = context
        }

        override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?): View {
            val textView = TextView(mContext)
            textView.text = "Here is my row for Listview"
            return textView
        }

        override fun getItem(position: Int): Any {
            return "TEST STRING"
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getCount(): Int {
            return 5
        }

    }
}
