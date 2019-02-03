package typings
package androiduixLib.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.Spinner")
@js.native
class Spinner protected ()
  extends AbsSpinner
     with androiduixLib.androidNs.contentNs.DialogInterfaceNs.OnClickListener {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement, defStyle: stdLib.Map[java.lang.String, java.lang.String]) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement, defStyle: stdLib.Map[java.lang.String, java.lang.String], mode: scala.Double) = this()
  var mDisableChildrenWhenDisabled: js.Any = js.native
  var mDropDownWidth: scala.Double = js.native
  var mGravity: js.Any = js.native
  var mPopup: js.Any = js.native
  var mTempAdapter: js.Any = js.native
  var mTempRect: js.Any = js.native
  def getDropDownHorizontalOffset(): scala.Double = js.native
  def getDropDownVerticalOffset(): scala.Double = js.native
  def getDropDownWidth(): scala.Double = js.native
  def getGravity(): scala.Double = js.native
  /* InferMemberOverrides */
  override def getParent(): androiduixLib.androidNs.viewNs.ViewParent = js.native
  def getPopupBackground(): androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  def getPrompt(): java.lang.String = js.native
  /* InferMemberOverrides */
  override def isLayoutRequested(): scala.Boolean = js.native
  /* private */ def makeView(position: js.Any, addChild: js.Any): js.Any = js.native
  def measureContentWidth(adapter: SpinnerAdapter, background: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Double = js.native
  /* CompleteClass */
  override def onClick(dialog: androiduixLib.androidNs.contentNs.DialogInterface, which: scala.Double): scala.Unit = js.native
  /* InferMemberOverrides */
  override def requestLayout(): scala.Unit with js.Any = js.native
  def setDropDownHorizontalOffset(pixels: scala.Double): scala.Unit = js.native
  def setDropDownVerticalOffset(pixels: scala.Double): scala.Unit = js.native
  def setDropDownWidth(pixels: scala.Double): scala.Unit = js.native
  def setGravity(gravity: scala.Double): scala.Unit = js.native
  def setOnItemClickListenerInt(l: androiduixLib.androidNs.widgetNs.AdapterViewNs.OnItemClickListener): scala.Unit = js.native
  def setPopupBackgroundDrawable(background: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit = js.native
  def setPrompt(prompt: java.lang.String): scala.Unit = js.native
  /* private */ def setUpChild(child: js.Any, addChild: js.Any): js.Any = js.native
}

/* static members */
@JSGlobal("android.widget.Spinner")
@js.native
object Spinner extends js.Object {
  var MAX_ITEMS_MEASURED: js.Any = js.native
  var MODE_DIALOG: scala.Double = js.native
  var MODE_DROPDOWN: scala.Double = js.native
  var MODE_THEME: js.Any = js.native
  var TAG: java.lang.String = js.native
}

