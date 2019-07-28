package typings.androiduix.androidNs.widgetNs

import typings.androiduix.androidNs.contentNs.Context
import typings.androiduix.androidNs.contentNs.DialogInterface
import typings.androiduix.androidNs.contentNs.DialogInterfaceNs.OnClickListener
import typings.androiduix.androidNs.graphicsNs.drawableNs.Drawable
import typings.androiduix.androidNs.viewNs.ViewParent
import typings.androiduix.androidNs.widgetNs.AdapterViewNs.OnItemClickListener
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.Spinner")
@js.native
class Spinner protected ()
  extends AbsSpinner
     with OnClickListener {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String], mode: Double) = this()
  var mDisableChildrenWhenDisabled: js.Any = js.native
  var mDropDownWidth: Double = js.native
  var mGravity: js.Any = js.native
  var mPopup: js.Any = js.native
  var mTempAdapter: js.Any = js.native
  var mTempRect: js.Any = js.native
  def getDropDownHorizontalOffset(): Double = js.native
  def getDropDownVerticalOffset(): Double = js.native
  def getDropDownWidth(): Double = js.native
  def getGravity(): Double = js.native
  /* InferMemberOverrides */
  override def getParent(): ViewParent = js.native
  def getPopupBackground(): Drawable = js.native
  def getPrompt(): String = js.native
  /* InferMemberOverrides */
  override def isLayoutRequested(): Boolean = js.native
  /* private */ def makeView(position: js.Any, addChild: js.Any): js.Any = js.native
  def measureContentWidth(adapter: SpinnerAdapter, background: Drawable): Double = js.native
  /* CompleteClass */
  override def onClick(dialog: DialogInterface, which: Double): Unit = js.native
  /* InferMemberOverrides */
  override def requestLayout(): js.Any with Unit = js.native
  def setDropDownHorizontalOffset(pixels: Double): Unit = js.native
  def setDropDownVerticalOffset(pixels: Double): Unit = js.native
  def setDropDownWidth(pixels: Double): Unit = js.native
  def setGravity(gravity: Double): Unit = js.native
  def setOnItemClickListenerInt(l: OnItemClickListener): Unit = js.native
  def setPopupBackgroundDrawable(background: Drawable): Unit = js.native
  def setPrompt(prompt: String): Unit = js.native
  /* private */ def setUpChild(child: js.Any, addChild: js.Any): js.Any = js.native
}

/* static members */
@JSGlobal("android.widget.Spinner")
@js.native
object Spinner extends js.Object {
  var MAX_ITEMS_MEASURED: js.Any = js.native
  var MODE_DIALOG: Double = js.native
  var MODE_DROPDOWN: Double = js.native
  var MODE_THEME: js.Any = js.native
  var TAG: String = js.native
}

