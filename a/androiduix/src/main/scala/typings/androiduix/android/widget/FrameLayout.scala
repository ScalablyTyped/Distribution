package typings.androiduix.android.widget

import typings.androiduix.android.content.Context
import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.view.ViewGroup
import typings.androiduix.android.view.ViewGroup.MarginLayoutParams
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.FrameLayout")
@js.native
class FrameLayout protected () extends ViewGroup {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
  var mForeground: Drawable = js.native
  var mForegroundBoundsChanged: Boolean = js.native
  var mForegroundGravity: js.Any = js.native
  var mForegroundInPadding: Boolean = js.native
  var mForegroundPaddingBottom: js.Any = js.native
  var mForegroundPaddingLeft: js.Any = js.native
  var mForegroundPaddingRight: js.Any = js.native
  var mForegroundPaddingTop: js.Any = js.native
  var mMatchParentChildren: js.Any = js.native
  var mMeasureAllChildren: Boolean = js.native
  var mOverlayBounds: js.Any = js.native
  var mSelfBounds: js.Any = js.native
  def getForeground(): Drawable = js.native
  def getForegroundGravity(): Double = js.native
  def getMeasureAllChildren(): Boolean = js.native
  def getPaddingBottomWithForeground(): Double = js.native
  def getPaddingLeftWithForeground(): Double = js.native
  def getPaddingRightWithForeground(): Double = js.native
  def getPaddingTopWithForeground(): Double = js.native
  def layoutChildren(left: Double, top: Double, right: Double, bottom: Double, forceLeftGravity: Boolean): Unit = js.native
  def setForeground(drawable: Drawable): Unit = js.native
  def setForegroundGravity(foregroundGravity: Double): Unit = js.native
  def setMeasureAllChildren(measureAll: Boolean): Unit = js.native
}

/* static members */
@JSGlobal("android.widget.FrameLayout")
@js.native
object FrameLayout extends js.Object {
  @js.native
  class LayoutParams () extends MarginLayoutParams {
    def this(source: typings.androiduix.android.view.ViewGroup.LayoutParams) = this()
    def this(context: Context, attrs: HTMLElement) = this()
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, gravity: Double) = this()
    var gravity: Double = js.native
  }
  
  var DEFAULT_CHILD_GRAVITY: Double = js.native
}

