package com.yooba.yoo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


/**
 * Created by flyye on 2018/6/23.
 */

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, YooReactActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra(NavigatorModule.REACT_SCREEN, "YooMain");
        startActivity(intent);
    }
}
