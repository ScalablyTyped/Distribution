package typings.androiduix.androidNs.widgetNs

import typings.androiduix.androidNs.contentNs.Context
import typings.androiduix.androidNs.graphicsNs.drawableNs.Drawable
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.CheckedTextView")
@js.native
class CheckedTextView protected ()
  extends TextView
     with Checkable {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
  var mBasePadding: js.Any = js.native
  var mCheckMarkDrawable: js.Any = js.native
  var mCheckMarkResource: js.Any = js.native
  var mCheckMarkWidth: js.Any = js.native
  var mChecked: js.Any = js.native
  var mNeedRequestlayout: js.Any = js.native
  def getCheckMarkDrawable(): Drawable = js.native
  /* CompleteClass */
  override def isChecked(): Boolean = js.native
  /* private */ def setBasePadding(isLayoutRtl: js.Any): js.Any = js.native
  def setCheckMarkDrawable(d: Drawable): Unit = js.native
  /* CompleteClass */
  override def setChecked(checked: Boolean): Unit = js.native
  /* CompleteClass */
  override def toggle(): Unit = js.native
  /* private */ def updatePadding(): js.Any = js.native
}

/* static members */
@JSGlobal("android.widget.CheckedTextView")
@js.native
object CheckedTextView extends js.Object {
  var CHECKED_STATE_SET: js.Any = js.native
}

