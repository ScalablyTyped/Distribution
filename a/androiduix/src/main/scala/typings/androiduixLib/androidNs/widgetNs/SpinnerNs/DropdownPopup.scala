package typings
package androiduixLib.androidNs.widgetNs.SpinnerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.Spinner.DropdownPopup")
@js.native
class DropdownPopup protected ()
  extends androiduixLib.androidNs.widgetNs.ListPopupWindow
     with SpinnerPopup {
  def this(context: androiduixLib.androidNs.contentNs.Context, defStyleRes: stdLib.Map[java.lang.String, java.lang.String], arg: androiduixLib.androidNs.widgetNs.Spinner) = this()
  var _Spinner_this: androiduixLib.androidNs.widgetNs.Spinner = js.native
  var mHintText: js.Any = js.native
  def computeContentWidth(): scala.Unit = js.native
  /* InferMemberOverrides */
  override def dismiss(): scala.Unit = js.native
  /* InferMemberOverrides */
  override def getBackground(): androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  /* CompleteClass */
  override def getHintText(): java.lang.String = js.native
  /* InferMemberOverrides */
  override def getHorizontalOffset(): scala.Double = js.native
  /* InferMemberOverrides */
  override def getVerticalOffset(): scala.Double = js.native
  /* InferMemberOverrides */
  override def isShowing(): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def setAdapter(adapter: androiduixLib.androidNs.widgetNs.ListAdapter): scala.Unit = js.native
  /* InferMemberOverrides */
  override def setBackgroundDrawable(d: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit = js.native
  /* InferMemberOverrides */
  override def setHorizontalOffset(offset: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def setPromptText(hintText: java.lang.String): scala.Unit = js.native
  /* InferMemberOverrides */
  override def setVerticalOffset(offset: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def showPopup(textDirection: scala.Double, textAlignment: scala.Double): scala.Unit = js.native
}

