package typings.androiduix.androidNs.widgetNs

import typings.androiduix.androidNs.contentNs.Context
import typings.androiduix.androidNs.graphicsNs.Canvas
import typings.androiduix.androidNs.graphicsNs.drawableNs.Drawable
import typings.androiduix.androidNs.viewNs.View
import typings.androiduix.androidNs.viewNs.ViewGroup
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.LinearLayout")
@js.native
class LinearLayout protected () extends ViewGroup {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
  var mBaselineAligned: js.Any = js.native
  var mBaselineAlignedChildIndex: js.Any = js.native
  var mBaselineChildTop: js.Any = js.native
  var mDivider: js.Any = js.native
  var mDividerHeight: js.Any = js.native
  var mDividerPadding: js.Any = js.native
  var mDividerWidth: js.Any = js.native
  var mGravity: js.Any = js.native
  var mMaxAscent: js.Any = js.native
  var mMaxDescent: js.Any = js.native
  var mOrientation: js.Any = js.native
  var mShowDividers: js.Any = js.native
  var mTotalLength: js.Any = js.native
  var mUseLargestChild: js.Any = js.native
  var mWeightSum: js.Any = js.native
  def drawDividersHorizontal(canvas: Canvas): Unit = js.native
  def drawDividersVertical(canvas: Canvas): Unit = js.native
  def drawHorizontalDivider(canvas: Canvas, top: Double): Unit = js.native
  def drawVerticalDivider(canvas: Canvas, left: Double): Unit = js.native
  /* private */ def forceUniformHeight(count: js.Any, widthMeasureSpec: js.Any): js.Any = js.native
  def forceUniformWidth(count: Double, heightMeasureSpec: Double): Unit = js.native
  def getBaselineAlignedChildIndex(): Double = js.native
  def getChildrenSkipCount(child: View, index: Double): Double = js.native
  def getDividerDrawable(): Drawable = js.native
  def getDividerPadding(): Double = js.native
  def getDividerWidth(): Double = js.native
  def getLocationOffset(child: View): Double = js.native
  def getNextLocationOffset(child: View): Double = js.native
  def getOrientation(): Double = js.native
  def getShowDividers(): Double = js.native
  def getVirtualChildAt(index: Double): View = js.native
  def getVirtualChildCount(): Double = js.native
  def getWeightSum(): Double = js.native
  def hasDividerBeforeChildAt(childIndex: Double): Boolean = js.native
  def isBaselineAligned(): Boolean = js.native
  def isMeasureWithLargestChildEnabled(): Boolean = js.native
  def layoutHorizontal(left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
  def layoutVertical(left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
  def measureChildBeforeLayout(
    child: View,
    childIndex: Double,
    widthMeasureSpec: Double,
    totalWidth: Double,
    heightMeasureSpec: Double,
    totalHeight: Double
  ): Unit = js.native
  def measureHorizontal(widthMeasureSpec: Double, heightMeasureSpec: Double): Unit = js.native
  def measureNullChild(childIndex: Double): Double = js.native
  def measureVertical(widthMeasureSpec: Double, heightMeasureSpec: Double): Unit = js.native
  /* protected */ def onMeasure(widthMeasureSpec: js.Any, heightMeasureSpec: js.Any): Unit = js.native
  def setBaselineAligned(baselineAligned: Boolean): Unit = js.native
  def setBaselineAlignedChildIndex(i: Double): Unit = js.native
  /* private */ def setChildFrame(child: js.Any, left: js.Any, top: js.Any, width: js.Any, height: js.Any): js.Any = js.native
  def setDividerDrawable(divider: Drawable): Unit = js.native
  def setDividerPadding(padding: Double): Unit = js.native
  def setGravity(gravity: Double): Unit = js.native
  def setHorizontalGravity(horizontalGravity: Double): Unit = js.native
  def setMeasureWithLargestChildEnabled(enabled: Boolean): Unit = js.native
  def setOrientation(orientation: Double): Unit = js.native
  def setShowDividers(showDividers: Double): Unit = js.native
  def setVerticalGravity(verticalGravity: Double): Unit = js.native
  def setWeightSum(weightSum: Double): Unit = js.native
}

/* static members */
@JSGlobal("android.widget.LinearLayout")
@js.native
object LinearLayout extends js.Object {
  var HORIZONTAL: Double = js.native
  var INDEX_BOTTOM: js.Any = js.native
  var INDEX_CENTER_VERTICAL: js.Any = js.native
  var INDEX_FILL: js.Any = js.native
  var INDEX_TOP: js.Any = js.native
  var SHOW_DIVIDER_BEGINNING: Double = js.native
  var SHOW_DIVIDER_END: Double = js.native
  var SHOW_DIVIDER_MIDDLE: Double = js.native
  var SHOW_DIVIDER_NONE: Double = js.native
  var VERTICAL: Double = js.native
  var VERTICAL_GRAVITY_COUNT: js.Any = js.native
}

