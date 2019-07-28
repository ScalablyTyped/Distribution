package typings.androiduix.androidNs.viewNs

import typings.androiduix.androidNs.contentNs.Context
import typings.androiduix.androidNs.graphicsNs.Canvas
import typings.androiduix.androidNs.graphicsNs.Point
import typings.androiduix.androidNs.graphicsNs.Rect
import typings.androiduix.androidNs.graphicsNs.RectF
import typings.androiduix.androidNs.viewNs.ViewGroupNs.LayoutParams
import typings.androiduix.androidNs.viewNs.ViewGroupNs.OnHierarchyChangeListener
import typings.androiduix.androidNs.viewNs.animationNs.Animation
import typings.androiduix.androidNs.viewNs.animationNs.Transformation
import typings.androiduix.javaNs.utilNs.ArrayList
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.ViewGroup")
@js.native
abstract class ViewGroup protected ()
  extends View
     with ViewParent {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
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
  /* CompleteClass */
  override def bringChildToFront(child: View): js.Any = js.native
  def canAnimate(): Boolean = js.native
  /* private */ def cancelAndClearTouchTargets(event: js.Any): js.Any = js.native
  /* private */ def cancelTouchTarget(view: js.Any): js.Any = js.native
  /* protected */ def checkLayoutParams(p: LayoutParams): Boolean = js.native
  /* CompleteClass */
  override def childDrawableStateChanged(child: View): js.Any = js.native
  /* CompleteClass */
  override def childHasTransientStateChanged(child: View, hasTransientState: Boolean): js.Any = js.native
  def cleanupLayoutState(child: View): Unit = js.native
  def clearCachedLayoutMode(): Unit = js.native
  /* CompleteClass */
  override def clearChildFocus(child: View): js.Any = js.native
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
  /* CompleteClass */
  override def focusSearch(v: View, direction: Double): View = js.native
  /* CompleteClass */
  override def focusableViewAvailable(v: View): js.Any = js.native
  /* protected */ def generateDefaultLayoutParams(): LayoutParams = js.native
  /* protected */ def generateLayoutParams(p: LayoutParams): LayoutParams = js.native
  def generateLayoutParamsFromAttr(attrs: HTMLElement): LayoutParams = js.native
  def getChildAt(index: Double): View = js.native
  def getChildCount(): Double = js.native
  def getChildDrawingOrder(childCount: Double, i: Double): Double = js.native
  /* protected */ def getChildStaticTransformation(child: View, t: Transformation): Boolean = js.native
  def getChildTransformation(): Transformation = js.native
  /* CompleteClass */
  override def getChildVisibleRect(child: View, r: Rect, offset: Point): Boolean = js.native
  def getClipChildren(): Boolean = js.native
  def getDescendantFocusability(): Double = js.native
  def getFocusedChild(): View = js.native
  /* InferMemberOverrides */
  override def getParent(): ViewParent = js.native
  def getPersistentDrawingCache(): Double = js.native
  /* private */ def getTouchTarget(child: js.Any): js.Any = js.native
  def hasBooleanFlag(flag: Double): Boolean = js.native
  def indexOfChild(child: View): Double = js.native
  /* private */ def initFromAttributes(context: js.Any, attrs: js.Any): js.Any = js.native
  /* private */ def initFromAttributes(context: js.Any, attrs: js.Any, defStyle: js.Any): js.Any = js.native
  /* private */ def initViewGroup(): js.Any = js.native
  /* CompleteClass */
  override def invalidateChild(child: View, r: Rect): js.Any = js.native
  def invalidateChildFast(child: View, dirty: Rect): Unit = js.native
  /* CompleteClass */
  override def invalidateChildInParent(location: js.Array[Double], r: Rect): ViewParent = js.native
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
  /* private */ def removeFromArray(index: js.Any): js.Any = js.native
  /* private */ def removeFromArray(index: js.Any, count: js.Any): js.Any = js.native
  /* private */ def removePointersFromTouchTargets(pointerIdBits: js.Any): js.Any = js.native
  def removeView(view: View): Unit = js.native
  def removeViewAt(index: Double): Unit = js.native
  def removeViewInLayout(view: View): Unit = js.native
  /* private */ def removeViewInternal(view: js.Any): js.Any = js.native
  def removeViews(start: Double, count: Double): Unit = js.native
  def removeViewsInLayout(start: Double, count: Double): Unit = js.native
  /* private */ def removeViewsInternal(start: js.Any, count: js.Any): js.Any = js.native
  /* CompleteClass */
  override def requestChildFocus(child: View, focused: View): js.Any = js.native
  /* CompleteClass */
  override def requestChildRectangleOnScreen(child: View, rectangle: Rect, immediate: Boolean): Boolean = js.native
  /* CompleteClass */
  override def requestDisallowInterceptTouchEvent(disallowIntercept: Boolean): js.Any = js.native
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

/* static members */
@JSGlobal("android.view.ViewGroup")
@js.native
object ViewGroup extends js.Object {
  var CLIP_TO_PADDING_MASK: Double = js.native
  var FLAG_ADD_STATES_FROM_CHILDREN: Double = js.native
  var FLAG_ALPHA_LOWER_THAN_ONE: Double = js.native
  var FLAG_ALWAYS_DRAWN_WITH_CACHE: Double = js.native
  var FLAG_ANIMATION_CACHE: Double = js.native
  var FLAG_ANIMATION_DONE: Double = js.native
  var FLAG_CHILDREN_DRAWN_WITH_CACHE: Double = js.native
  var FLAG_CLEAR_TRANSFORMATION: Double = js.native
  var FLAG_CLIP_CHILDREN: Double = js.native
  var FLAG_CLIP_TO_PADDING: Double = js.native
  var FLAG_DISALLOW_INTERCEPT: Double = js.native
  var FLAG_INVALIDATE_REQUIRED: Double = js.native
  var FLAG_LAYOUT_MODE_WAS_EXPLICITLY_SET: Double = js.native
  var FLAG_MASK_FOCUSABILITY: Double = js.native
  var FLAG_NOTIFY_ANIMATION_LISTENER: Double = js.native
  var FLAG_NOTIFY_CHILDREN_ON_DRAWABLE_STATE_CHANGE: Double = js.native
  var FLAG_OPTIMIZE_INVALIDATE: Double = js.native
  var FLAG_PADDING_NOT_NULL: Double = js.native
  var FLAG_PREVENT_DISPATCH_ATTACHED_TO_WINDOW: Double = js.native
  var FLAG_RUN_ANIMATION: Double = js.native
  var FLAG_SPLIT_MOTION_EVENTS: Double = js.native
  var FLAG_SUPPORT_STATIC_TRANSFORMATIONS: Double = js.native
  var FLAG_USE_CHILD_DRAWING_ORDER: Double = js.native
  var FOCUS_AFTER_DESCENDANTS: Double = js.native
  var FOCUS_BEFORE_DESCENDANTS: Double = js.native
  var FOCUS_BLOCK_DESCENDANTS: Double = js.native
  var LAYOUT_MODE_CLIP_BOUNDS: Double = js.native
  var LAYOUT_MODE_DEFAULT: Double = js.native
  var LAYOUT_MODE_UNDEFINED: Double = js.native
  var PERSISTENT_ALL_CACHES: Double = js.native
  var PERSISTENT_ANIMATION_CACHE: Double = js.native
  var PERSISTENT_NO_CACHE: Double = js.native
  var PERSISTENT_SCROLLING_CACHE: Double = js.native
  var ViewGroupClassAttrBind: js.Any = js.native
  /* private */ def canViewReceivePointerEvents(child: js.Any): js.Any = js.native
  def getChildMeasureSpec(spec: Double, padding: Double, childDimension: Double): Double = js.native
  /* private */ def resetCancelNextUpFlag(view: js.Any): js.Any = js.native
}

