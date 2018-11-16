package typings
package androiduixLib.androidNs.widgetNs.SpinnerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.Spinner.DialogPopup")
@js.native
class DialogPopup protected ()
  extends SpinnerPopup
     with androiduixLib.androidNs.contentNs.DialogInterfaceNs.OnClickListener {
  def this(arg: androiduixLib.androidNs.widgetNs.Spinner) = this()
  var _Spinner_this: androiduixLib.androidNs.widgetNs.Spinner = js.native
  var mListAdapter: js.Any = js.native
  var mPopup: js.Any = js.native
  var mPrompt: js.Any = js.native
  /* CompleteClass */
  override def dismiss(): scala.Unit = js.native
  /* CompleteClass */
  override def getBackground(): androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  /* CompleteClass */
  override def getHintText(): java.lang.String = js.native
  /* CompleteClass */
  override def getHorizontalOffset(): scala.Double = js.native
  /* CompleteClass */
  override def getVerticalOffset(): scala.Double = js.native
  /* CompleteClass */
  override def isShowing(): scala.Boolean = js.native
  /* CompleteClass */
  override def onClick(dialog: androiduixLib.androidNs.contentNs.DialogInterface, which: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def setAdapter(adapter: androiduixLib.androidNs.widgetNs.ListAdapter): scala.Unit = js.native
  /* CompleteClass */
  override def setBackgroundDrawable(bg: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit = js.native
  /* CompleteClass */
  override def setHorizontalOffset(px: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def setPromptText(hintText: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def setVerticalOffset(px: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def showPopup(textDirection: scala.Double, textAlignment: scala.Double): scala.Unit = js.native
}

