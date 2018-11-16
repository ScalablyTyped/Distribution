package typings
package androiduixLib.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.LinearLayout")
@js.native
class LinearLayout protected ()
  extends androiduixLib.androidNs.viewNs.ViewGroup {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement, defStyle: stdLib.Map[java.lang.String, java.lang.String]) = this()
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
  def drawDividersHorizontal(canvas: androiduixLib.androidNs.graphicsNs.Canvas): scala.Unit = js.native
  def drawDividersVertical(canvas: androiduixLib.androidNs.graphicsNs.Canvas): scala.Unit = js.native
  def drawHorizontalDivider(canvas: androiduixLib.androidNs.graphicsNs.Canvas, top: scala.Double): scala.Unit = js.native
  def drawVerticalDivider(canvas: androiduixLib.androidNs.graphicsNs.Canvas, left: scala.Double): scala.Unit = js.native
  /* private */ def forceUniformHeight(count: js.Any, widthMeasureSpec: js.Any): js.Any = js.native
  def forceUniformWidth(count: scala.Double, heightMeasureSpec: scala.Double): scala.Unit = js.native
  def getBaselineAlignedChildIndex(): scala.Double = js.native
  def getChildrenSkipCount(child: androiduixLib.androidNs.viewNs.View, index: scala.Double): scala.Double = js.native
  def getDividerDrawable(): androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  def getDividerPadding(): scala.Double = js.native
  def getDividerWidth(): scala.Double = js.native
  def getLocationOffset(child: androiduixLib.androidNs.viewNs.View): scala.Double = js.native
  def getNextLocationOffset(child: androiduixLib.androidNs.viewNs.View): scala.Double = js.native
  def getOrientation(): scala.Double = js.native
  def getShowDividers(): scala.Double = js.native
  def getVirtualChildAt(index: scala.Double): androiduixLib.androidNs.viewNs.View = js.native
  def getVirtualChildCount(): scala.Double = js.native
  def getWeightSum(): scala.Double = js.native
  def hasDividerBeforeChildAt(childIndex: scala.Double): scala.Boolean = js.native
  def isBaselineAligned(): scala.Boolean = js.native
  def isMeasureWithLargestChildEnabled(): scala.Boolean = js.native
  def layoutHorizontal(left: scala.Double, top: scala.Double, right: scala.Double, bottom: scala.Double): scala.Unit = js.native
  def layoutVertical(left: scala.Double, top: scala.Double, right: scala.Double, bottom: scala.Double): scala.Unit = js.native
  def measureChildBeforeLayout(
    child: androiduixLib.androidNs.viewNs.View,
    childIndex: scala.Double,
    widthMeasureSpec: scala.Double,
    totalWidth: scala.Double,
    heightMeasureSpec: scala.Double,
    totalHeight: scala.Double
  ): scala.Unit = js.native
  def measureHorizontal(widthMeasureSpec: scala.Double, heightMeasureSpec: scala.Double): scala.Unit = js.native
  def measureNullChild(childIndex: scala.Double): scala.Double = js.native
  def measureVertical(widthMeasureSpec: scala.Double, heightMeasureSpec: scala.Double): scala.Unit = js.native
  /* protected */ def onMeasure(widthMeasureSpec: js.Any, heightMeasureSpec: js.Any): scala.Unit = js.native
  def setBaselineAligned(baselineAligned: scala.Boolean): scala.Unit = js.native
  def setBaselineAlignedChildIndex(i: scala.Double): scala.Unit = js.native
  /* private */ def setChildFrame(child: js.Any, left: js.Any, top: js.Any, width: js.Any, height: js.Any): js.Any = js.native
  def setDividerDrawable(divider: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit = js.native
  def setDividerPadding(padding: scala.Double): scala.Unit = js.native
  def setGravity(gravity: scala.Double): scala.Unit = js.native
  def setHorizontalGravity(horizontalGravity: scala.Double): scala.Unit = js.native
  def setMeasureWithLargestChildEnabled(enabled: scala.Boolean): scala.Unit = js.native
  def setOrientation(orientation: scala.Double): scala.Unit = js.native
  def setShowDividers(showDividers: scala.Double): scala.Unit = js.native
  def setVerticalGravity(verticalGravity: scala.Double): scala.Unit = js.native
  def setWeightSum(weightSum: scala.Double): scala.Unit = js.native
}

@JSGlobal("android.widget.LinearLayout")
@js.native
object LinearLayout extends js.Object {
  var HORIZONTAL: scala.Double = js.native
  var INDEX_BOTTOM: js.Any = js.native
  var INDEX_CENTER_VERTICAL: js.Any = js.native
  var INDEX_FILL: js.Any = js.native
  var INDEX_TOP: js.Any = js.native
  var SHOW_DIVIDER_BEGINNING: scala.Double = js.native
  var SHOW_DIVIDER_END: scala.Double = js.native
  var SHOW_DIVIDER_MIDDLE: scala.Double = js.native
  var SHOW_DIVIDER_NONE: scala.Double = js.native
  var VERTICAL: scala.Double = js.native
  var VERTICAL_GRAVITY_COUNT: js.Any = js.native
}

