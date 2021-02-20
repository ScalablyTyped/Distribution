package typings.androiduix.android.widget

import typings.androiduix.android.content.res.TypedArray
import typings.androiduix.android.graphics.Canvas
import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.view.View
import typings.androiduix.android.view.ViewGroup
import typings.androiduix.android.view.ViewGroup.MarginLayoutParams
import typings.androiduix.androidui.attr.AttrBinder
import typings.androiduix.androidui.attr.AttrBinder.ClassBinderMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinearLayout extends ViewGroup {
  
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
object LinearLayout {
  
  @js.native
  trait LayoutParams extends MarginLayoutParams {
    
    var gravity: Double = js.native
    
    var weight: Double = js.native
  }
  object LayoutParams {
    
    @scala.inline
    def apply(
      _attrBinder: js.Any,
      bottomMargin: Double,
      createClassAttrBinder: () => ClassBinderMap,
      equals_ : js.Any => Boolean,
      getAttrBinder: () => AttrBinder,
      getLayoutDirection: () => Double,
      gravity: Double,
      hash: js.Any,
      height: Double,
      initBindAttr: () => js.Any,
      isLayoutRtl: () => Boolean,
      leftMargin: Double,
      resolveLayoutDirection: Double => Unit,
      rightMargin: Double,
      setBaseAttributes: (TypedArray, String, String) => Unit,
      setLayoutDirection: Double => Unit,
      setMargins: (Double, Double, Double, Double) => Unit,
      topMargin: Double,
      weight: Double,
      width: Double
    ): LayoutParams = {
      val __obj = js.Dynamic.literal(_attrBinder = _attrBinder.asInstanceOf[js.Any], bottomMargin = bottomMargin.asInstanceOf[js.Any], createClassAttrBinder = js.Any.fromFunction0(createClassAttrBinder), getAttrBinder = js.Any.fromFunction0(getAttrBinder), getLayoutDirection = js.Any.fromFunction0(getLayoutDirection), gravity = gravity.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], initBindAttr = js.Any.fromFunction0(initBindAttr), isLayoutRtl = js.Any.fromFunction0(isLayoutRtl), leftMargin = leftMargin.asInstanceOf[js.Any], resolveLayoutDirection = js.Any.fromFunction1(resolveLayoutDirection), rightMargin = rightMargin.asInstanceOf[js.Any], setBaseAttributes = js.Any.fromFunction3(setBaseAttributes), setLayoutDirection = js.Any.fromFunction1(setLayoutDirection), setMargins = js.Any.fromFunction4(setMargins), topMargin = topMargin.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[LayoutParams]
    }
    
    @scala.inline
    implicit class LayoutParamsMutableBuilder[Self <: LayoutParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGravity(value: Double): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    }
  }
}
