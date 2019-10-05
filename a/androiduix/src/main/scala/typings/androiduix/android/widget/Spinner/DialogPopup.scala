package typings.androiduix.android.widget.Spinner

import typings.androiduix.android.content.DialogInterface
import typings.androiduix.android.content.DialogInterface.OnClickListener
import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.widget.ListAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.Spinner.DialogPopup")
@js.native
class DialogPopup protected ()
  extends SpinnerPopup
     with OnClickListener {
  def this(arg: typings.androiduix.android.widget.Spinner) = this()
  var _Spinner_this: typings.androiduix.android.widget.Spinner = js.native
  var mListAdapter: js.Any = js.native
  var mPopup: js.Any = js.native
  var mPrompt: js.Any = js.native
  /* CompleteClass */
  override def dismiss(): Unit = js.native
  /* CompleteClass */
  override def getBackground(): Drawable = js.native
  /* CompleteClass */
  override def getHintText(): String = js.native
  /* CompleteClass */
  override def getHorizontalOffset(): Double = js.native
  /* CompleteClass */
  override def getVerticalOffset(): Double = js.native
  /* CompleteClass */
  override def isShowing(): Boolean = js.native
  /* CompleteClass */
  override def onClick(dialog: DialogInterface, which: Double): Unit = js.native
  /* CompleteClass */
  override def setAdapter(adapter: ListAdapter): Unit = js.native
  /* CompleteClass */
  override def setBackgroundDrawable(bg: Drawable): Unit = js.native
  /* CompleteClass */
  override def setHorizontalOffset(px: Double): Unit = js.native
  /* CompleteClass */
  override def setPromptText(hintText: String): Unit = js.native
  /* CompleteClass */
  override def setVerticalOffset(px: Double): Unit = js.native
  /* CompleteClass */
  override def showPopup(textDirection: Double, textAlignment: Double): Unit = js.native
}

