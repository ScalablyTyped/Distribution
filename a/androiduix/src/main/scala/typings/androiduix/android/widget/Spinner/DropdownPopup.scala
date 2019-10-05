package typings.androiduix.android.widget.Spinner

import typings.androiduix.android.content.Context
import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.widget.ListAdapter
import typings.androiduix.android.widget.ListPopupWindow
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.Spinner.DropdownPopup")
@js.native
class DropdownPopup protected ()
  extends ListPopupWindow
     with SpinnerPopup {
  def this(context: Context, defStyleRes: Map[String, String], arg: typings.androiduix.android.widget.Spinner) = this()
  var _Spinner_this: typings.androiduix.android.widget.Spinner = js.native
  var mHintText: js.Any = js.native
  def computeContentWidth(): Unit = js.native
  /* InferMemberOverrides */
  override def dismiss(): Unit = js.native
  /* InferMemberOverrides */
  override def getBackground(): Drawable = js.native
  /* CompleteClass */
  override def getHintText(): String = js.native
  /* InferMemberOverrides */
  override def getHorizontalOffset(): Double = js.native
  /* InferMemberOverrides */
  override def getVerticalOffset(): Double = js.native
  /* InferMemberOverrides */
  override def isShowing(): Boolean = js.native
  /* InferMemberOverrides */
  override def setAdapter(adapter: ListAdapter): Unit = js.native
  /* InferMemberOverrides */
  override def setBackgroundDrawable(d: Drawable): Unit = js.native
  /* InferMemberOverrides */
  override def setHorizontalOffset(offset: Double): Unit = js.native
  /* CompleteClass */
  override def setPromptText(hintText: String): Unit = js.native
  /* InferMemberOverrides */
  override def setVerticalOffset(offset: Double): Unit = js.native
  /* CompleteClass */
  override def showPopup(textDirection: Double, textAlignment: Double): Unit = js.native
}

