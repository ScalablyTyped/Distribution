package typings
package androiduixLib.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.CompoundButton")
@js.native
abstract class CompoundButton protected ()
  extends Button
     with Checkable {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement, defStyle: stdLib.Map[java.lang.String, java.lang.String]) = this()
  var mBroadcasting: js.Any = js.native
  var mButtonDrawable: js.Any = js.native
  var mButtonResource: js.Any = js.native
  var mChecked: js.Any = js.native
  var mOnCheckedChangeListener: js.Any = js.native
  var mOnCheckedChangeWidgetListener: js.Any = js.native
  @JSName("drawableSizeChange")
  def drawableSizeChange_MCompoundButton(d: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit = js.native
  /* CompleteClass */
  override def isChecked(): scala.Boolean = js.native
  def setButtonDrawable(d: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit = js.native
  /* CompleteClass */
  override def setChecked(checked: scala.Boolean): scala.Unit = js.native
  def setOnCheckedChangeListener(listener: androiduixLib.androidNs.widgetNs.CompoundButtonNs.OnCheckedChangeListener): scala.Unit = js.native
  def setOnCheckedChangeWidgetListener(listener: androiduixLib.androidNs.widgetNs.CompoundButtonNs.OnCheckedChangeListener): scala.Unit = js.native
  /* CompleteClass */
  override def toggle(): scala.Unit = js.native
}

/* static members */
@JSGlobal("android.widget.CompoundButton")
@js.native
object CompoundButton extends js.Object {
  var CHECKED_STATE_SET: js.Any = js.native
}

