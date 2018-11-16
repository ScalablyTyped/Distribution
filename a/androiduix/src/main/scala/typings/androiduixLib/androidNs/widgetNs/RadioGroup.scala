package typings
package androiduixLib.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.RadioGroup")
@js.native
class RadioGroup protected () extends LinearLayout {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement, defStyle: stdLib.Map[java.lang.String, java.lang.String]) = this()
  var mCheckedId: js.Any = js.native
  var mChildOnCheckedChangeListener: js.Any = js.native
  var mOnCheckedChangeListener: js.Any = js.native
  var mPassThroughListener: js.Any = js.native
  var mProtectFromCheckedChange: js.Any = js.native
  def check(id: java.lang.String): scala.Unit = js.native
  def clearCheck(): scala.Unit = js.native
  def getCheckedRadioButtonId(): java.lang.String = js.native
  /* private */ def init(): js.Any = js.native
  /* private */ def setCheckedId(id: js.Any): js.Any = js.native
  /* private */ def setCheckedStateForView(viewId: js.Any, checked: js.Any): js.Any = js.native
  def setOnCheckedChangeListener(listener: androiduixLib.androidNs.widgetNs.RadioGroupNs.OnCheckedChangeListener): scala.Unit = js.native
}

