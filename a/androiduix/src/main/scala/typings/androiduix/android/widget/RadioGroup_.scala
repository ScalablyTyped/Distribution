package typings.androiduix.android.widget

import typings.androiduix.android.widget.RadioGroup.OnCheckedChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadioGroup_ extends LinearLayout {
  
  def check(id: String): Unit = js.native
  
  def clearCheck(): Unit = js.native
  
  def getCheckedRadioButtonId(): String = js.native
  
  /* private */ def init(): js.Any = js.native
  
  var mCheckedId: js.Any = js.native
  
  var mChildOnCheckedChangeListener: js.Any = js.native
  
  var mOnCheckedChangeListener: js.Any = js.native
  
  var mPassThroughListener: js.Any = js.native
  
  var mProtectFromCheckedChange: js.Any = js.native
  
  /* private */ def setCheckedId(id: js.Any): js.Any = js.native
  
  /* private */ def setCheckedStateForView(viewId: js.Any, checked: js.Any): js.Any = js.native
  
  def setOnCheckedChangeListener(listener: OnCheckedChangeListener): Unit = js.native
}
