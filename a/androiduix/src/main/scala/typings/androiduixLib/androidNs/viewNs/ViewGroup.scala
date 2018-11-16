package typings
package androiduixLib.androidNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.ViewGroup")
@js.native
abstract class ViewGroup protected ()
  extends View
     with ViewParent {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement, defStyle: stdLib.Map[java.lang.String, java.lang.String]) = this()
  var mChildCountWithTransientState: js.Any = js.native
  var mChildTransformation: js.Any = js.native
  var mChildren: js.Array[View] = js.native
  val mChildrenCount: scala.Double = js.native
  var mDisappearingChildren: androiduixLib.javaNs.utilNs.ArrayList[View] = js.native
  var mFirstTouchTarget: js.Any = js.native
  var mFocused: js.Any = js.native
  var mGroupFlags: scala.Double = js.native
  var mInvalidateRegion: androiduixLib.androidNs.graphicsNs.RectF = js.native
  var mLastTouchDownIndex: js.Any = js.native
  var mLastTouchDownTime: js.Any = js.native
  var mLastTouchDownX: js.Any = js.native
  var mLastTouchDownY: js.Any = js.native
  var mLayoutCalledWhileSuppressed: js.Any = js.native
  var mLayoutMode: scala.Double = js.native
  var mOnHierarchyChangeListener: androiduixLib.androidNs.viewNs.ViewGroupNs.OnHierarchyChangeListener = js.native
  var mPersistentDrawingCache: scala.Double = js.native
  var mSuppressLayout: scala.Boolean = js.native
  /* private */ def addDisappearingView(v: js.Any): js.Any = js.native
  /* private */ def addInArray(child: js.Any, index: js.Any): js.Any = js.native
  def addStatesFromChildren(): scala.Boolean = js.native
  /* private */ def addToBindElement(childElement: js.Any, insertBeforeElement: js.Any): js.Any = js.native
  /* private */ def addTouchTarget(child: js.Any, pointerIdBits: js.Any): js.Any = js.native
  def addView(args: js.Any*): js.Any = js.native
  def addView(view: View): js.Any = js.native
  def addView(view: View, index: scala.Double): js.Any = js.native
  def addView(view: View, index: scala.Double, params: androiduixLib.androidNs.viewNs.ViewGroupNs.LayoutParams): js.Any = js.native
  def addView(view: View, params: androiduixLib.androidNs.viewNs.ViewGroupNs.LayoutParams): js.Any = js.native
  def addView(view: View, width: scala.Double, height: scala.Double): js.Any = js.native
  def addViewInLayout(child: View, index: scala.Double, params: androiduixLib.androidNs.viewNs.ViewGroupNs.LayoutParams): scala.Boolean = js.native
  def addViewInLayout(
    child: View,
    index: scala.Double,
    params: androiduixLib.androidNs.viewNs.ViewGroupNs.LayoutParams,
    preventRequestLayout: scala.Boolean
  ): scala.Boolean = js.native
  def addViewInner(
    child: View,
    index: scala.Double,
    params: androiduixLib.androidNs.viewNs.ViewGroupNs.LayoutParams,
    preventRequestLayout: scala.Boolean
  ): scala.Unit = js.native
  def attachViewToParent(child: View, index: scala.Double, params: androiduixLib.androidNs.viewNs.ViewGroupNs.LayoutParams): scala.Unit = js.native
  /* CompleteClass */
  override def bringChildToFront(child: View): js.Any = js.native
  def canAnimate(): scala.Boolean = js.native
  /* private */ def cancelAndClearTouchTargets(event: js.Any): js.Any = js.native
  /* private */ def cancelTouchTarget(view: js.Any): js.Any = js.native
  /* protected */ def checkLayoutParams(p: androiduixLib.androidNs.viewNs.ViewGroupNs.LayoutParams): scala.Boolean = js.native
  /* CompleteClass */
  override def childDrawableStateChanged(child: View): js.Any = js.native
  /* CompleteClass */
  override def childHasTransientStateChanged(child: View, hasTransientState: scala.Boolean): js.Any = js.native
  def cleanupLayoutState(child: View): scala.Unit = js.native
  def clearCachedLayoutMode(): scala.Unit = js.native
  /* CompleteClass */
  override def clearChildFocus(child: View): js.Any = js.native
  def clearDisappearingChildren(): scala.Unit = js.native
  /* private */ def clearTouchTargets(): js.Any = js.native
  def detachAllViewsFromParent(): scala.Unit = js.native
  def detachViewFromParent(child: View): scala.Unit = js.native
  def detachViewFromParent(child: scala.Double): scala.Unit = js.native
  def detachViewsFromParent(start: scala.Double): scala.Unit = js.native
  def detachViewsFromParent(start: scala.Double, count: scala.Double): scala.Unit = js.native
  /* private */ def dispatchTransformedGenericPointerEvent(event: js.Any, child: js.Any): js.Any = js.native
  /* private */ def dispatchTransformedTouchEvent(event: js.Any, cancel: js.Any, child: js.Any, desiredPointerIdBits: js.Any): js.Any = js.native
  /* protected */ def drawChild(canvas: androiduixLib.androidNs.graphicsNs.Canvas, child: View, drawingTime: scala.Double): scala.Boolean = js.native
  def finishAnimatingView(view: View, animation: androiduixLib.androidNs.viewNs.animationNs.Animation): scala.Unit = js.native
  /* CompleteClass */
  override def focusSearch(v: View, direction: scala.Double): View = js.native
  /* CompleteClass */
  override def focusableViewAvailable(v: View): js.Any = js.native
  /* protected */ def generateDefaultLayoutParams(): androiduixLib.androidNs.viewNs.ViewGroupNs.LayoutParams = js.native
  /* protected */ def generateLayoutParams(p: androiduixLib.androidNs.viewNs.ViewGroupNs.LayoutParams): androiduixLib.androidNs.viewNs.ViewGroupNs.LayoutParams = js.native
  def generateLayoutParamsFromAttr(attrs: stdLib.HTMLElement): androiduixLib.androidNs.viewNs.ViewGroupNs.LayoutParams = js.native
  def getChildAt(index: scala.Double): View = js.native
  def getChildCount(): scala.Double = js.native
  def getChildDrawingOrder(childCount: scala.Double, i: scala.Double): scala.Double = js.native
  /* protected */ def getChildStaticTransformation(child: View, t: androiduixLib.androidNs.viewNs.animationNs.Transformation): scala.Boolean = js.native
  def getChildTransformation(): androiduixLib.androidNs.viewNs.animationNs.Transformation = js.native
  /* CompleteClass */
  override def getChildVisibleRect(
    child: View,
    r: androiduixLib.androidNs.graphicsNs.Rect,
    offset: androiduixLib.androidNs.graphicsNs.Point
  ): scala.Boolean = js.native
  def getClipChildren(): scala.Boolean = js.native
  def getDescendantFocusability(): scala.Double = js.native
  def getFocusedChild(): View = js.native
  /* InferMemberOverrides */
  override def getParent(): ViewParent = js.native
  def getPersistentDrawingCache(): scala.Double = js.native
  /* private */ def getTouchTarget(child: js.Any): js.Any = js.native
  def hasBooleanFlag(flag: scala.Double): scala.Boolean = js.native
  def indexOfChild(child: View): scala.Double = js.native
  /* private */ def initFromAttributes(context: js.Any, attrs: js.Any): js.Any = js.native
  /* private */ def initFromAttributes(context: js.Any, attrs: js.Any, defStyle: js.Any): js.Any = js.native
  /* private */ def initViewGroup(): js.Any = js.native
  /* CompleteClass */
  override def invalidateChild(child: View, r: androiduixLib.androidNs.graphicsNs.Rect): js.Any = js.native
  def invalidateChildFast(child: View, dirty: androiduixLib.androidNs.graphicsNs.Rect): scala.Unit = js.native
  /* CompleteClass */
  override def invalidateChildInParent(location: js.Array[scala.Double], r: androiduixLib.androidNs.graphicsNs.Rect): ViewParent = js.native
  def invalidateChildInParentFast(left: scala.Double, top: scala.Double, dirty: androiduixLib.androidNs.graphicsNs.Rect): ViewParent = js.native
  def isAlwaysDrawnWithCacheEnabled(): scala.Boolean = js.native
  def isAnimationCacheEnabled(): scala.Boolean = js.native
  def isChildrenDrawingOrderEnabled(): scala.Boolean = js.native
  def isChildrenDrawnWithCacheEnabled(): scala.Boolean = js.native
  def isClipToPadding(): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def isLayoutRequested(): scala.Boolean = js.native
  def isLayoutSuppressed(): scala.Boolean = js.native
  def isMotionEventSplittingEnabled(): scala.Boolean = js.native
  /* protected */ def isTransformedTouchPointInView(
    x: scala.Double,
    y: scala.Double,
    child: View,
    outLocalPoint: androiduixLib.androidNs.graphicsNs.Point
  ): scala.Boolean = js.native
  /* protected */ def measureChild(child: View, parentWidthMeasureSpec: scala.Double, parentHeightMeasureSpec: scala.Double): scala.Unit = js.native
  /* protected */ def measureChildWithMargins(
    child: View,
    parentWidthMeasureSpec: scala.Double,
    widthUsed: scala.Double,
    parentHeightMeasureSpec: scala.Double,
    heightUsed: scala.Double
  ): scala.Unit = js.native
  def measureChildren(widthMeasureSpec: scala.Double, heightMeasureSpec: scala.Double): scala.Unit = js.native
  def offsetChildrenTopAndBottom(offset: scala.Double): scala.Unit = js.native
  def offsetDescendantRectToMyCoords(descendant: View, rect: androiduixLib.androidNs.graphicsNs.Rect): scala.Unit = js.native
  def offsetRectBetweenParentAndChild(
    descendant: View,
    rect: androiduixLib.androidNs.graphicsNs.Rect,
    offsetFromChildToParent: scala.Boolean,
    clipToBounds: scala.Boolean
  ): scala.Unit = js.native
  def offsetRectIntoDescendantCoords(descendant: View, rect: androiduixLib.androidNs.graphicsNs.Rect): scala.Unit = js.native
  def onChildVisibilityChanged(child: View, oldVisibility: scala.Double, newVisibility: scala.Double): scala.Unit = js.native
  def onInterceptTouchEvent(ev: MotionEvent): scala.Boolean = js.native
  /* protected */ def onRequestFocusInDescendants(direction: scala.Double, previouslyFocusedRect: androiduixLib.androidNs.graphicsNs.Rect): scala.Boolean = js.native
  def onSetLayoutParams(child: View, layoutParams: androiduixLib.androidNs.viewNs.ViewGroupNs.LayoutParams): scala.Unit = js.native
  /* protected */ def onViewAdded(child: View): scala.Unit = js.native
  /* protected */ def onViewRemoved(child: View): scala.Unit = js.native
  def removeAllViews(): scala.Unit = js.native
  def removeAllViewsInLayout(): scala.Unit = js.native
  /* private */ def removeChildElement(childElement: js.Any): js.Any = js.native
  def removeDetachedView(child: View, animate: scala.Boolean): scala.Unit = js.native
  /* private */ def removeFromArray(index: js.Any): js.Any = js.native
  /* private */ def removeFromArray(index: js.Any, count: js.Any): js.Any = js.native
  /* private */ def removePointersFromTouchTargets(pointerIdBits: js.Any): js.Any = js.native
  def removeView(view: View): scala.Unit = js.native
  def removeViewAt(index: scala.Double): scala.Unit = js.native
  def removeViewInLayout(view: View): scala.Unit = js.native
  /* private */ def removeViewInternal(view: js.Any): js.Any = js.native
  def removeViews(start: scala.Double, count: scala.Double): scala.Unit = js.native
  def removeViewsInLayout(start: scala.Double, count: scala.Double): scala.Unit = js.native
  /* private */ def removeViewsInternal(start: js.Any, count: js.Any): js.Any = js.native
  /* CompleteClass */
  override def requestChildFocus(child: View, focused: View): js.Any = js.native
  /* CompleteClass */
  override def requestChildRectangleOnScreen(child: View, rectangle: androiduixLib.androidNs.graphicsNs.Rect, immediate: scala.Boolean): scala.Boolean = js.native
  /* CompleteClass */
  override def requestDisallowInterceptTouchEvent(disallowIntercept: scala.Boolean): js.Any = js.native
  /* InferMemberOverrides */
  override def requestLayout(): scala.Unit with js.Any = js.native
  /* private */ def resetTouchState(): js.Any = js.native
  def setAddStatesFromChildren(addsStates: scala.Boolean): scala.Unit = js.native
  def setAlwaysDrawnWithCacheEnabled(always: scala.Boolean): scala.Unit = js.native
  def setAnimationCacheEnabled(enabled: scala.Boolean): scala.Unit = js.native
  def setBooleanFlag(flag: scala.Double, value: scala.Boolean): scala.Unit = js.native
  def setChildrenDrawingCacheEnabled(enabled: scala.Boolean): scala.Unit = js.native
  def setChildrenDrawingOrderEnabled(enabled: scala.Boolean): scala.Unit = js.native
  def setChildrenDrawnWithCacheEnabled(enabled: scala.Boolean): scala.Unit = js.native
  def setClipChildren(clipChildren: scala.Boolean): scala.Unit = js.native
  def setClipToPadding(clipToPadding: scala.Boolean): scala.Unit = js.native
  def setDescendantFocusability(focusability: scala.Double): scala.Unit = js.native
  def setMotionEventSplittingEnabled(split: scala.Boolean): scala.Unit = js.native
  def setOnHierarchyChangeListener(listener: androiduixLib.androidNs.viewNs.ViewGroupNs.OnHierarchyChangeListener): scala.Unit = js.native
  def setPersistentDrawingCache(drawingCacheToKeep: scala.Double): scala.Unit = js.native
  def shouldDelayChildPressedState(): scala.Boolean = js.native
  def suppressLayout(suppress: scala.Boolean): scala.Unit = js.native
}

@JSGlobal("android.view.ViewGroup")
@js.native
object ViewGroup extends js.Object {
  var CLIP_TO_PADDING_MASK: scala.Double = js.native
  var FLAG_ADD_STATES_FROM_CHILDREN: scala.Double = js.native
  var FLAG_ALPHA_LOWER_THAN_ONE: scala.Double = js.native
  var FLAG_ALWAYS_DRAWN_WITH_CACHE: scala.Double = js.native
  var FLAG_ANIMATION_CACHE: scala.Double = js.native
  var FLAG_ANIMATION_DONE: scala.Double = js.native
  var FLAG_CHILDREN_DRAWN_WITH_CACHE: scala.Double = js.native
  var FLAG_CLEAR_TRANSFORMATION: scala.Double = js.native
  var FLAG_CLIP_CHILDREN: scala.Double = js.native
  var FLAG_CLIP_TO_PADDING: scala.Double = js.native
  var FLAG_DISALLOW_INTERCEPT: scala.Double = js.native
  var FLAG_INVALIDATE_REQUIRED: scala.Double = js.native
  var FLAG_LAYOUT_MODE_WAS_EXPLICITLY_SET: scala.Double = js.native
  var FLAG_MASK_FOCUSABILITY: scala.Double = js.native
  var FLAG_NOTIFY_ANIMATION_LISTENER: scala.Double = js.native
  var FLAG_NOTIFY_CHILDREN_ON_DRAWABLE_STATE_CHANGE: scala.Double = js.native
  var FLAG_OPTIMIZE_INVALIDATE: scala.Double = js.native
  var FLAG_PADDING_NOT_NULL: scala.Double = js.native
  var FLAG_PREVENT_DISPATCH_ATTACHED_TO_WINDOW: scala.Double = js.native
  var FLAG_RUN_ANIMATION: scala.Double = js.native
  var FLAG_SPLIT_MOTION_EVENTS: scala.Double = js.native
  var FLAG_SUPPORT_STATIC_TRANSFORMATIONS: scala.Double = js.native
  var FLAG_USE_CHILD_DRAWING_ORDER: scala.Double = js.native
  var FOCUS_AFTER_DESCENDANTS: scala.Double = js.native
  var FOCUS_BEFORE_DESCENDANTS: scala.Double = js.native
  var FOCUS_BLOCK_DESCENDANTS: scala.Double = js.native
  var LAYOUT_MODE_CLIP_BOUNDS: scala.Double = js.native
  var LAYOUT_MODE_DEFAULT: scala.Double = js.native
  var LAYOUT_MODE_UNDEFINED: scala.Double = js.native
  var PERSISTENT_ALL_CACHES: scala.Double = js.native
  var PERSISTENT_ANIMATION_CACHE: scala.Double = js.native
  var PERSISTENT_NO_CACHE: scala.Double = js.native
  var PERSISTENT_SCROLLING_CACHE: scala.Double = js.native
  var ViewGroupClassAttrBind: js.Any = js.native
  /* private */ def canViewReceivePointerEvents(child: js.Any): js.Any = js.native
  def getChildMeasureSpec(spec: scala.Double, padding: scala.Double, childDimension: scala.Double): scala.Double = js.native
  /* private */ def resetCancelNextUpFlag(view: js.Any): js.Any = js.native
}

