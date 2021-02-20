package typings.androiduix.android.view

import typings.androiduix.android.content.res.TypedArray
import typings.androiduix.android.graphics.Canvas
import typings.androiduix.android.graphics.Point
import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.graphics.RectF
import typings.androiduix.android.view.ViewGroup.LayoutParams
import typings.androiduix.android.view.ViewGroup.OnHierarchyChangeListener
import typings.androiduix.android.view.animation.Animation
import typings.androiduix.android.view.animation.Transformation
import typings.androiduix.androidui.attr.AttrBinder
import typings.androiduix.androidui.attr.AttrBinder.ClassBinderMap
import typings.androiduix.java_.lang.JavaObject
import typings.androiduix.java_.util.ArrayList
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewGroup
  extends View
     with ViewParent {
  
  /* private */ def addDisappearingView(v: js.Any): js.Any = js.native
  
  /* private */ def addInArray(child: js.Any, index: js.Any): js.Any = js.native
  
  def addStatesFromChildren(): Boolean = js.native
  
  /* private */ def addToBindElement(childElement: js.Any, insertBeforeElement: js.Any): js.Any = js.native
  
  /* private */ def addTouchTarget(child: js.Any, pointerIdBits: js.Any): js.Any = js.native
  
  def addView(args: js.Any*): js.Any = js.native
  def addView(view: View): js.Any = js.native
  def addView(view: View, index: Double): js.Any = js.native
  def addView(view: View, index: Double, params: LayoutParams): js.Any = js.native
  def addView(view: View, params: LayoutParams): js.Any = js.native
  def addView(view: View, width: Double, height: Double): js.Any = js.native
  
  def addViewInLayout(child: View, index: Double, params: LayoutParams): Boolean = js.native
  def addViewInLayout(child: View, index: Double, params: LayoutParams, preventRequestLayout: Boolean): Boolean = js.native
  
  def addViewInner(child: View, index: Double, params: LayoutParams, preventRequestLayout: Boolean): Unit = js.native
  
  def attachViewToParent(child: View, index: Double, params: LayoutParams): Unit = js.native
  
  def canAnimate(): Boolean = js.native
  
  /* private */ def cancelAndClearTouchTargets(event: js.Any): js.Any = js.native
  
  /* private */ def cancelTouchTarget(view: js.Any): js.Any = js.native
  
  /* protected */ def checkLayoutParams(p: LayoutParams): Boolean = js.native
  
  def cleanupLayoutState(child: View): Unit = js.native
  
  def clearCachedLayoutMode(): Unit = js.native
  
  def clearDisappearingChildren(): Unit = js.native
  
  /* private */ def clearTouchTargets(): js.Any = js.native
  
  def detachAllViewsFromParent(): Unit = js.native
  
  def detachViewFromParent(child: Double): Unit = js.native
  def detachViewFromParent(child: View): Unit = js.native
  
  def detachViewsFromParent(start: Double): Unit = js.native
  def detachViewsFromParent(start: Double, count: Double): Unit = js.native
  
  /* private */ def dispatchTransformedGenericPointerEvent(event: js.Any, child: js.Any): js.Any = js.native
  
  /* private */ def dispatchTransformedTouchEvent(event: js.Any, cancel: js.Any, child: js.Any, desiredPointerIdBits: js.Any): js.Any = js.native
  
  /* protected */ def drawChild(canvas: Canvas, child: View, drawingTime: Double): Boolean = js.native
  
  def finishAnimatingView(view: View, animation: Animation): Unit = js.native
  
  /* protected */ def generateDefaultLayoutParams(): LayoutParams = js.native
  
  /* protected */ def generateLayoutParams(p: LayoutParams): LayoutParams = js.native
  
  def generateLayoutParamsFromAttr(attrs: HTMLElement): LayoutParams = js.native
  
  def getChildAt(index: Double): View = js.native
  
  def getChildCount(): Double = js.native
  
  def getChildDrawingOrder(childCount: Double, i: Double): Double = js.native
  
  /* protected */ def getChildStaticTransformation(child: View, t: Transformation): Boolean = js.native
  
  def getChildTransformation(): Transformation = js.native
  
  def getClipChildren(): Boolean = js.native
  
  def getDescendantFocusability(): Double = js.native
  
  def getFocusedChild(): View = js.native
  
  /* InferMemberOverrides */
  override def getParent(): ViewParent = js.native
  
  def getPersistentDrawingCache(): Double = js.native
  
  /* private */ def getTouchTarget(child: js.Any): js.Any = js.native
  
  def hasBooleanFlag(flag: Double): Boolean = js.native
  
  def indexOfChild(child: View): Double = js.native
  
  /* private */ def initFromAttributes(context: js.Any, attrs: js.Any, defStyle: js.Any): js.Any = js.native
  
  /* private */ def initViewGroup(): js.Any = js.native
  
  def invalidateChildFast(child: View, dirty: Rect): Unit = js.native
  
  def invalidateChildInParentFast(left: Double, top: Double, dirty: Rect): ViewParent = js.native
  
  def isAlwaysDrawnWithCacheEnabled(): Boolean = js.native
  
  def isAnimationCacheEnabled(): Boolean = js.native
  
  def isChildrenDrawingOrderEnabled(): Boolean = js.native
  
  def isChildrenDrawnWithCacheEnabled(): Boolean = js.native
  
  def isClipToPadding(): Boolean = js.native
  
  /* InferMemberOverrides */
  override def isLayoutRequested(): Boolean = js.native
  
  def isLayoutSuppressed(): Boolean = js.native
  
  def isMotionEventSplittingEnabled(): Boolean = js.native
  
  /* protected */ def isTransformedTouchPointInView(x: Double, y: Double, child: View, outLocalPoint: Point): Boolean = js.native
  
  var mChildCountWithTransientState: js.Any = js.native
  
  var mChildTransformation: js.Any = js.native
  
  var mChildren: js.Array[View] = js.native
  
  val mChildrenCount: Double = js.native
  
  var mDisappearingChildren: ArrayList[View] = js.native
  
  var mFirstTouchTarget: js.Any = js.native
  
  var mFocused: js.Any = js.native
  
  var mGroupFlags: Double = js.native
  
  var mInvalidateRegion: RectF = js.native
  
  var mLastTouchDownIndex: js.Any = js.native
  
  var mLastTouchDownTime: js.Any = js.native
  
  var mLastTouchDownX: js.Any = js.native
  
  var mLastTouchDownY: js.Any = js.native
  
  var mLayoutCalledWhileSuppressed: js.Any = js.native
  
  var mLayoutMode: Double = js.native
  
  var mOnHierarchyChangeListener: OnHierarchyChangeListener = js.native
  
  var mPersistentDrawingCache: Double = js.native
  
  var mSuppressLayout: Boolean = js.native
  
  /* protected */ def measureChild(child: View, parentWidthMeasureSpec: Double, parentHeightMeasureSpec: Double): Unit = js.native
  
  /* protected */ def measureChildWithMargins(
    child: View,
    parentWidthMeasureSpec: Double,
    widthUsed: Double,
    parentHeightMeasureSpec: Double,
    heightUsed: Double
  ): Unit = js.native
  
  def measureChildren(widthMeasureSpec: Double, heightMeasureSpec: Double): Unit = js.native
  
  def offsetChildrenTopAndBottom(offset: Double): Unit = js.native
  
  def offsetDescendantRectToMyCoords(descendant: View, rect: Rect): Unit = js.native
  
  def offsetRectBetweenParentAndChild(descendant: View, rect: Rect, offsetFromChildToParent: Boolean, clipToBounds: Boolean): Unit = js.native
  
  def offsetRectIntoDescendantCoords(descendant: View, rect: Rect): Unit = js.native
  
  def onChildVisibilityChanged(child: View, oldVisibility: Double, newVisibility: Double): Unit = js.native
  
  def onInterceptTouchEvent(ev: MotionEvent): Boolean = js.native
  
  /* protected */ def onRequestFocusInDescendants(direction: Double, previouslyFocusedRect: Rect): Boolean = js.native
  
  def onSetLayoutParams(child: View, layoutParams: LayoutParams): Unit = js.native
  
  /* protected */ def onViewAdded(child: View): Unit = js.native
  
  /* protected */ def onViewRemoved(child: View): Unit = js.native
  
  def removeAllViews(): Unit = js.native
  
  def removeAllViewsInLayout(): Unit = js.native
  
  /* private */ def removeChildElement(childElement: js.Any): js.Any = js.native
  
  def removeDetachedView(child: View, animate: Boolean): Unit = js.native
  
  /* private */ def removeFromArray(index: js.Any, count: js.Any): js.Any = js.native
  
  /* private */ def removePointersFromTouchTargets(pointerIdBits: js.Any): js.Any = js.native
  
  def removeView(view: View): Unit = js.native
  
  def removeViewAt(index: Double): Unit = js.native
  
  def removeViewInLayout(view: View): Unit = js.native
  
  /* private */ def removeViewInternal(view: js.Any): js.Any = js.native
  
  def removeViews(start: Double, count: Double): Unit = js.native
  
  def removeViewsInLayout(start: Double, count: Double): Unit = js.native
  
  /* private */ def removeViewsInternal(start: js.Any, count: js.Any): js.Any = js.native
  
  /* InferMemberOverrides */
  override def requestLayout(): js.Any with Unit = js.native
  
  /* private */ def resetTouchState(): js.Any = js.native
  
  def setAddStatesFromChildren(addsStates: Boolean): Unit = js.native
  
  def setAlwaysDrawnWithCacheEnabled(always: Boolean): Unit = js.native
  
  def setAnimationCacheEnabled(enabled: Boolean): Unit = js.native
  
  def setBooleanFlag(flag: Double, value: Boolean): Unit = js.native
  
  def setChildrenDrawingCacheEnabled(enabled: Boolean): Unit = js.native
  
  def setChildrenDrawingOrderEnabled(enabled: Boolean): Unit = js.native
  
  def setChildrenDrawnWithCacheEnabled(enabled: Boolean): Unit = js.native
  
  def setClipChildren(clipChildren: Boolean): Unit = js.native
  
  def setClipToPadding(clipToPadding: Boolean): Unit = js.native
  
  def setDescendantFocusability(focusability: Double): Unit = js.native
  
  def setMotionEventSplittingEnabled(split: Boolean): Unit = js.native
  
  def setOnHierarchyChangeListener(listener: OnHierarchyChangeListener): Unit = js.native
  
  def setPersistentDrawingCache(drawingCacheToKeep: Double): Unit = js.native
  
  def shouldDelayChildPressedState(): Boolean = js.native
  
  def suppressLayout(suppress: Boolean): Unit = js.native
}
object ViewGroup {
  
  @js.native
  trait LayoutParams extends JavaObject {
    
    var _attrBinder: js.Any = js.native
    
    /* protected */ def createClassAttrBinder(): ClassBinderMap = js.native
    
    def getAttrBinder(): AttrBinder = js.native
    
    var height: Double = js.native
    
    /* private */ def initBindAttr(): js.Any = js.native
    
    /* protected */ def setBaseAttributes(a: TypedArray, widthAttr: String, heightAttr: String): Unit = js.native
    
    var width: Double = js.native
  }
  object LayoutParams {
    
    @scala.inline
    def apply(
      _attrBinder: js.Any,
      createClassAttrBinder: () => ClassBinderMap,
      equals_ : js.Any => Boolean,
      getAttrBinder: () => AttrBinder,
      hash: js.Any,
      height: Double,
      initBindAttr: () => js.Any,
      setBaseAttributes: (TypedArray, String, String) => Unit,
      width: Double
    ): LayoutParams = {
      val __obj = js.Dynamic.literal(_attrBinder = _attrBinder.asInstanceOf[js.Any], createClassAttrBinder = js.Any.fromFunction0(createClassAttrBinder), getAttrBinder = js.Any.fromFunction0(getAttrBinder), hash = hash.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], initBindAttr = js.Any.fromFunction0(initBindAttr), setBaseAttributes = js.Any.fromFunction3(setBaseAttributes), width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[LayoutParams]
    }
    
    @scala.inline
    implicit class LayoutParamsMutableBuilder[Self <: LayoutParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateClassAttrBinder(value: () => ClassBinderMap): Self = StObject.set(x, "createClassAttrBinder", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAttrBinder(value: () => AttrBinder): Self = StObject.set(x, "getAttrBinder", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitBindAttr(value: () => js.Any): Self = StObject.set(x, "initBindAttr", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetBaseAttributes(value: (TypedArray, String, String) => Unit): Self = StObject.set(x, "setBaseAttributes", js.Any.fromFunction3(value))
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_attrBinder(value: js.Any): Self = StObject.set(x, "_attrBinder", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MarginLayoutParams extends LayoutParams {
    
    var bottomMargin: Double = js.native
    
    def getLayoutDirection(): Double = js.native
    
    def isLayoutRtl(): Boolean = js.native
    
    var leftMargin: Double = js.native
    
    def resolveLayoutDirection(layoutDirection: Double): Unit = js.native
    
    var rightMargin: Double = js.native
    
    def setLayoutDirection(layoutDirection: Double): Unit = js.native
    
    def setMargins(left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
    
    var topMargin: Double = js.native
  }
  object MarginLayoutParams {
    
    @scala.inline
    def apply(
      _attrBinder: js.Any,
      bottomMargin: Double,
      createClassAttrBinder: () => ClassBinderMap,
      equals_ : js.Any => Boolean,
      getAttrBinder: () => AttrBinder,
      getLayoutDirection: () => Double,
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
      width: Double
    ): MarginLayoutParams = {
      val __obj = js.Dynamic.literal(_attrBinder = _attrBinder.asInstanceOf[js.Any], bottomMargin = bottomMargin.asInstanceOf[js.Any], createClassAttrBinder = js.Any.fromFunction0(createClassAttrBinder), getAttrBinder = js.Any.fromFunction0(getAttrBinder), getLayoutDirection = js.Any.fromFunction0(getLayoutDirection), hash = hash.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], initBindAttr = js.Any.fromFunction0(initBindAttr), isLayoutRtl = js.Any.fromFunction0(isLayoutRtl), leftMargin = leftMargin.asInstanceOf[js.Any], resolveLayoutDirection = js.Any.fromFunction1(resolveLayoutDirection), rightMargin = rightMargin.asInstanceOf[js.Any], setBaseAttributes = js.Any.fromFunction3(setBaseAttributes), setLayoutDirection = js.Any.fromFunction1(setLayoutDirection), setMargins = js.Any.fromFunction4(setMargins), topMargin = topMargin.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[MarginLayoutParams]
    }
    
    @scala.inline
    implicit class MarginLayoutParamsMutableBuilder[Self <: MarginLayoutParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottomMargin(value: Double): Self = StObject.set(x, "bottomMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetLayoutDirection(value: () => Double): Self = StObject.set(x, "getLayoutDirection", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsLayoutRtl(value: () => Boolean): Self = StObject.set(x, "isLayoutRtl", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLeftMargin(value: Double): Self = StObject.set(x, "leftMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveLayoutDirection(value: Double => Unit): Self = StObject.set(x, "resolveLayoutDirection", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRightMargin(value: Double): Self = StObject.set(x, "rightMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetLayoutDirection(value: Double => Unit): Self = StObject.set(x, "setLayoutDirection", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMargins(value: (Double, Double, Double, Double) => Unit): Self = StObject.set(x, "setMargins", js.Any.fromFunction4(value))
      
      @scala.inline
      def setTopMargin(value: Double): Self = StObject.set(x, "topMargin", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OnHierarchyChangeListener extends StObject {
    
    def onChildViewAdded(parent: View, child: View): js.Any = js.native
    
    def onChildViewRemoved(parent: View, child: View): js.Any = js.native
  }
  object OnHierarchyChangeListener {
    
    @scala.inline
    def apply(onChildViewAdded: (View, View) => js.Any, onChildViewRemoved: (View, View) => js.Any): OnHierarchyChangeListener = {
      val __obj = js.Dynamic.literal(onChildViewAdded = js.Any.fromFunction2(onChildViewAdded), onChildViewRemoved = js.Any.fromFunction2(onChildViewRemoved))
      __obj.asInstanceOf[OnHierarchyChangeListener]
    }
    
    @scala.inline
    implicit class OnHierarchyChangeListenerMutableBuilder[Self <: OnHierarchyChangeListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnChildViewAdded(value: (View, View) => js.Any): Self = StObject.set(x, "onChildViewAdded", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChildViewRemoved(value: (View, View) => js.Any): Self = StObject.set(x, "onChildViewRemoved", js.Any.fromFunction2(value))
    }
  }
}
