package typings.androiduix.android.widget

import typings.androiduix.android.content.Context
import typings.androiduix.android.widget.RadioGroup.OnCheckedChangeListener
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.RadioGroup")
@js.native
class RadioGroup_ protected () extends LinearLayout {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
  var mCheckedId: js.Any = js.native
  var mChildOnCheckedChangeListener: js.Any = js.native
  var mOnCheckedChangeListener: js.Any = js.native
  var mPassThroughListener: js.Any = js.native
  var mProtectFromCheckedChange: js.Any = js.native
  def check(id: String): Unit = js.native
  def clearCheck(): Unit = js.native
  def getCheckedRadioButtonId(): String = js.native
  /* private */ def init(): js.Any = js.native
  /* private */ def setCheckedId(id: js.Any): js.Any = js.native
  /* private */ def setCheckedStateForView(viewId: js.Any, checked: js.Any): js.Any = js.native
  def setOnCheckedChangeListener(listener: OnCheckedChangeListener): Unit = js.native
}

