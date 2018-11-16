package typings
package androiduixLib.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.CheckedTextView")
@js.native
class CheckedTextView protected ()
  extends TextView
     with Checkable {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement, defStyle: stdLib.Map[java.lang.String, java.lang.String]) = this()
  var mBasePadding: js.Any = js.native
  var mCheckMarkDrawable: js.Any = js.native
  var mCheckMarkResource: js.Any = js.native
  var mCheckMarkWidth: js.Any = js.native
  var mChecked: js.Any = js.native
  var mNeedRequestlayout: js.Any = js.native
  def getCheckMarkDrawable(): androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  /* CompleteClass */
  override def isChecked(): scala.Boolean = js.native
  /* private */ def setBasePadding(isLayoutRtl: js.Any): js.Any = js.native
  def setCheckMarkDrawable(d: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit = js.native
  /* CompleteClass */
  override def setChecked(checked: scala.Boolean): scala.Unit = js.native
  /* CompleteClass */
  override def toggle(): scala.Unit = js.native
  /* private */ def updatePadding(): js.Any = js.native
}

@JSGlobal("android.widget.CheckedTextView")
@js.native
object CheckedTextView extends js.Object {
  var CHECKED_STATE_SET: js.Any = js.native
}

