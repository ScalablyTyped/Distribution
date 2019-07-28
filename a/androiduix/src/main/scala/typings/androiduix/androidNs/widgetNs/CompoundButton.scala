package typings.androiduix.androidNs.widgetNs

import typings.androiduix.androidNs.contentNs.Context
import typings.androiduix.androidNs.graphicsNs.drawableNs.Drawable
import typings.androiduix.androidNs.widgetNs.CompoundButtonNs.OnCheckedChangeListener
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.CompoundButton")
@js.native
abstract class CompoundButton protected ()
  extends Button
     with Checkable {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
  var mBroadcasting: js.Any = js.native
  var mButtonDrawable: js.Any = js.native
  var mButtonResource: js.Any = js.native
  var mChecked: js.Any = js.native
  var mOnCheckedChangeListener: js.Any = js.native
  var mOnCheckedChangeWidgetListener: js.Any = js.native
  @JSName("drawableSizeChange")
  def drawableSizeChange_MCompoundButton(d: Drawable): Unit = js.native
  /* CompleteClass */
  override def isChecked(): Boolean = js.native
  def setButtonDrawable(d: Drawable): Unit = js.native
  /* CompleteClass */
  override def setChecked(checked: Boolean): Unit = js.native
  def setOnCheckedChangeListener(listener: OnCheckedChangeListener): Unit = js.native
  def setOnCheckedChangeWidgetListener(listener: OnCheckedChangeListener): Unit = js.native
  /* CompleteClass */
  override def toggle(): Unit = js.native
}

/* static members */
@JSGlobal("android.widget.CompoundButton")
@js.native
object CompoundButton extends js.Object {
  var CHECKED_STATE_SET: js.Any = js.native
}

