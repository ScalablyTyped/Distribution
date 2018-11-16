package typings
package androiduixLib.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.FrameLayout")
@js.native
class FrameLayout protected ()
  extends androiduixLib.androidNs.viewNs.ViewGroup {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement, defStyle: stdLib.Map[java.lang.String, java.lang.String]) = this()
  var mForeground: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  var mForegroundBoundsChanged: scala.Boolean = js.native
  var mForegroundGravity: js.Any = js.native
  var mForegroundInPadding: scala.Boolean = js.native
  var mForegroundPaddingBottom: js.Any = js.native
  var mForegroundPaddingLeft: js.Any = js.native
  var mForegroundPaddingRight: js.Any = js.native
  var mForegroundPaddingTop: js.Any = js.native
  var mMatchParentChildren: js.Any = js.native
  var mMeasureAllChildren: scala.Boolean = js.native
  var mOverlayBounds: js.Any = js.native
  var mSelfBounds: js.Any = js.native
  def getForeground(): androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  def getForegroundGravity(): scala.Double = js.native
  def getMeasureAllChildren(): scala.Boolean = js.native
  def getPaddingBottomWithForeground(): scala.Double = js.native
  def getPaddingLeftWithForeground(): scala.Double = js.native
  def getPaddingRightWithForeground(): scala.Double = js.native
  def getPaddingTopWithForeground(): scala.Double = js.native
  def layoutChildren(
    left: scala.Double,
    top: scala.Double,
    right: scala.Double,
    bottom: scala.Double,
    forceLeftGravity: scala.Boolean
  ): scala.Unit = js.native
  def setForeground(drawable: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit = js.native
  def setForegroundGravity(foregroundGravity: scala.Double): scala.Unit = js.native
  def setMeasureAllChildren(measureAll: scala.Boolean): scala.Unit = js.native
}

@JSGlobal("android.widget.FrameLayout")
@js.native
object FrameLayout extends js.Object {
  var DEFAULT_CHILD_GRAVITY: scala.Double = js.native
}

