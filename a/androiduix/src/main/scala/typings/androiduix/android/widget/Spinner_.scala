package typings.androiduix.android.widget

import typings.androiduix.android.content.Context
import typings.androiduix.android.content.DialogInterface.OnClickListener
import typings.androiduix.android.content.res.Resources
import typings.androiduix.android.content.res.TypedArray
import typings.androiduix.android.graphics.Canvas
import typings.androiduix.android.graphics.Matrix
import typings.androiduix.android.graphics.Point
import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.os.Handler
import typings.androiduix.android.view.KeyEvent
import typings.androiduix.android.view.KeyEvent.DispatcherState
import typings.androiduix.android.view.MotionEvent
import typings.androiduix.android.view.TouchDelegate
import typings.androiduix.android.view.View
import typings.androiduix.android.view.View.AttachInfo
import typings.androiduix.android.view.View.ListenerInfo
import typings.androiduix.android.view.View.OnAttachStateChangeListener
import typings.androiduix.android.view.View.OnFocusChangeListener
import typings.androiduix.android.view.View.OnKeyListener
import typings.androiduix.android.view.View.OnLayoutChangeListener
import typings.androiduix.android.view.View.OnLongClickListener
import typings.androiduix.android.view.View.OnTouchListener
import typings.androiduix.android.view.View.Predicate
import typings.androiduix.android.view.ViewGroup
import typings.androiduix.android.view.ViewGroup.LayoutParams
import typings.androiduix.android.view.ViewGroup.OnHierarchyChangeListener
import typings.androiduix.android.view.ViewParent
import typings.androiduix.android.view.ViewRootImpl
import typings.androiduix.android.view.ViewTreeObserver
import typings.androiduix.android.view.animation.Animation
import typings.androiduix.android.view.animation.Transformation
import typings.androiduix.android.widget.AdapterView.OnItemClickListener
import typings.androiduix.android.widget.AdapterView.OnItemLongClickListener
import typings.androiduix.android.widget.AdapterView.OnItemSelectedListener
import typings.androiduix.androidui.attr.AttrBinder.ClassBinderMap
import typings.androiduix.java_.lang.Runnable
import typings.androiduix.java_.util.ArrayList
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spinner_
  extends AbsSpinner
     with OnClickListener {
  var mDisableChildrenWhenDisabled: js.Any = js.native
  var mDropDownWidth: Double = js.native
  var mGravity: js.Any = js.native
  var mPopup: js.Any = js.native
  var mTempAdapter: js.Any = js.native
  var mTempRect: js.Any = js.native
  /* InferMemberOverrides */
  /* private */ override def _fireStateChangeToAttribute(oldState: js.Any, newState: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  /* private */ override def _getBinderAttrValue(key: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  /* private */ override def _initAttrObserver(): js.Any = js.native
  /* InferMemberOverrides */
  /* private */ override def _invalidateCache(invalidateCache: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  /* private */ override def _invalidateRect(l: js.Any, t: js.Any, r: js.Any, b: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  /* protected */ override def _syncBoundAndScrollToElement(): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def _syncMatrixToElement(): Unit = js.native
  /* InferMemberOverrides */
  /* private */ override def addDisappearingView(v: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  override def addFocusables(views: ArrayList[View], direction: Double): Unit = js.native
  /* InferMemberOverrides */
  override def addFocusables(views: ArrayList[View], direction: Double, focusableMode: Double): Unit = js.native
  /* InferMemberOverrides */
  /* private */ override def addInArray(child: js.Any, index: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  override def addOnAttachStateChangeListener(listener: OnAttachStateChangeListener): Unit = js.native
  /* InferMemberOverrides */
  override def addOnLayoutChangeListener(listener: OnLayoutChangeListener): Unit = js.native
  /* InferMemberOverrides */
  override def addStatesFromChildren(): Boolean = js.native
  /* InferMemberOverrides */
  /* private */ override def addToBindElement(childElement: js.Any, insertBeforeElement: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  /* private */ override def addTouchTarget(child: js.Any, pointerIdBits: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  override def addTouchables(views: ArrayList[View]): Unit = js.native
  /* InferMemberOverrides */
  override def addView(args: js.Any*): js.Any = js.native
  /* InferMemberOverrides */
  override def addView(view: View): js.Any = js.native
  /* InferMemberOverrides */
  override def addView(view: View, index: Double): js.Any = js.native
  /* InferMemberOverrides */
  override def addView(view: View, index: Double, params: LayoutParams): js.Any = js.native
  /* InferMemberOverrides */
  override def addView(view: View, params: LayoutParams): js.Any = js.native
  /* InferMemberOverrides */
  override def addView(view: View, width: Double, height: Double): js.Any = js.native
  /* InferMemberOverrides */
  override def addViewInLayout(child: View, index: Double, params: LayoutParams): Boolean = js.native
  /* InferMemberOverrides */
  override def addViewInLayout(child: View, index: Double, params: LayoutParams, preventRequestLayout: Boolean): Boolean = js.native
  /* InferMemberOverrides */
  override def addViewInner(child: View, index: Double, params: LayoutParams, preventRequestLayout: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def assignParent(parent: ViewParent): Unit = js.native
  /* InferMemberOverrides */
  override def attachViewToParent(child: View, index: Double, params: LayoutParams): Unit = js.native
  /* InferMemberOverrides */
  override def awakenScrollBars(): Boolean = js.native
  /* InferMemberOverrides */
  override def awakenScrollBars(startDelay: js.UndefOr[scala.Nothing], invalidate: Boolean): Boolean = js.native
  /* InferMemberOverrides */
  override def awakenScrollBars(startDelay: Double): Boolean = js.native
  /* InferMemberOverrides */
  override def awakenScrollBars(startDelay: Double, invalidate: Boolean): Boolean = js.native
  /* InferMemberOverrides */
  override def bringToFront(): Unit = js.native
  /* InferMemberOverrides */
  override def buildDrawingCache(): Unit = js.native
  /* InferMemberOverrides */
  override def buildDrawingCache(autoScale: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def callOnClick(): Boolean = js.native
  /* InferMemberOverrides */
  override def canAnimate(): Boolean = js.native
  /* InferMemberOverrides */
  override def canScrollHorizontally(direction: Double): Boolean = js.native
  /* InferMemberOverrides */
  override def canScrollVertically(direction: Double): Boolean = js.native
  /* InferMemberOverrides */
  /* private */ override def cancelAndClearTouchTargets(event: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  override def cancelLongPress(): Unit = js.native
  /* InferMemberOverrides */
  override def cancelPendingInputEvents(): Unit = js.native
  /* InferMemberOverrides */
  /* private */ override def cancelTouchTarget(view: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  override def checkFocus(): Unit = js.native
  /* InferMemberOverrides */
  /* private */ override def checkForLongClick(delayOffset: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  /* protected */ override def checkLayoutParams(p: LayoutParams): Boolean = js.native
  /* InferMemberOverrides */
  override def checkSelectionChanged(): Unit = js.native
  /* InferMemberOverrides */
  override def cleanupDraw(): Unit = js.native
  /* InferMemberOverrides */
  override def cleanupLayoutState(child: View): Unit = js.native
  /* InferMemberOverrides */
  override def clearAnimation(): Unit = js.native
  /* InferMemberOverrides */
  override def clearCachedLayoutMode(): Unit = js.native
  /* InferMemberOverrides */
  override def clearDisappearingChildren(): Unit = js.native
  /* InferMemberOverrides */
  override def clearFocus(): Unit = js.native
  /* InferMemberOverrides */
  override def clearFocusInternal(propagate: Boolean, refocus: Boolean): Unit = js.native
  /* InferMemberOverrides */
  /* private */ override def clearTouchTargets(): js.Any = js.native
  /* InferMemberOverrides */
  /* protected */ override def computeHorizontalScrollExtent(): Double = js.native
  /* InferMemberOverrides */
  /* protected */ override def computeHorizontalScrollOffset(): Double = js.native
  /* InferMemberOverrides */
  /* protected */ override def computeHorizontalScrollRange(): Double = js.native
  /* InferMemberOverrides */
  /* private */ override def computeOpaqueFlags(): js.Any = js.native
  /* InferMemberOverrides */
  override def computeScroll(): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def computeVerticalScrollExtent(): Double = js.native
  /* InferMemberOverrides */
  /* protected */ override def computeVerticalScrollOffset(): Double = js.native
  /* InferMemberOverrides */
  /* protected */ override def computeVerticalScrollRange(): Double = js.native
  /* InferMemberOverrides */
  /* protected */ override def createClassAttrBinder(): ClassBinderMap = js.native
  /* InferMemberOverrides */
  override def debug(): Unit = js.native
  /* InferMemberOverrides */
  override def debug(depth: Double): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def dependOnDebugLayout(): Boolean = js.native
  /* InferMemberOverrides */
  override def destroyDrawingCache(): Unit = js.native
  /* InferMemberOverrides */
  override def detachAllViewsFromParent(): Unit = js.native
  /* InferMemberOverrides */
  override def detachViewFromParent(child: Double): Unit = js.native
  /* InferMemberOverrides */
  override def detachViewFromParent(child: View): Unit = js.native
  /* InferMemberOverrides */
  override def detachViewsFromParent(start: Double): Unit = js.native
  /* InferMemberOverrides */
  override def detachViewsFromParent(start: Double, count: Double): Unit = js.native
  /* InferMemberOverrides */
  override def dispatchAttachedToWindow(info: AttachInfo, visibility: Double): Unit = js.native
  /* InferMemberOverrides */
  override def dispatchCancelPendingInputEvents(): Unit = js.native
  /* InferMemberOverrides */
  override def dispatchDetachedFromWindow(): Unit = js.native
  /* InferMemberOverrides */
  override def dispatchDisplayHint(hint: Double): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def dispatchDraw(canvas: Canvas): Unit = js.native
  /* InferMemberOverrides */
  override def dispatchFinishTemporaryDetach(): Unit = js.native
  /* InferMemberOverrides */
  override def dispatchGenericMotionEvent(event: MotionEvent): Boolean = js.native
  /* InferMemberOverrides */
  /* private */ override def dispatchGenericMotionEventInternal(event: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  override def dispatchGenericPointerEvent(event: MotionEvent): Boolean = js.native
  /* InferMemberOverrides */
  override def dispatchKeyEvent(event: KeyEvent): Boolean = js.native
  /* InferMemberOverrides */
  override def dispatchSetActivated(activated: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def dispatchSetPressed(pressed: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def dispatchSetSelected(selected: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def dispatchStartTemporaryDetach(): Unit = js.native
  /* InferMemberOverrides */
  override def dispatchTouchEvent(event: MotionEvent): Boolean = js.native
  /* InferMemberOverrides */
  /* private */ override def dispatchTransformedGenericPointerEvent(event: js.Any, child: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  /* private */ override def dispatchTransformedTouchEvent(event: js.Any, cancel: js.Any, child: js.Any, desiredPointerIdBits: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  override def dispatchUnhandledMove(focused: View, direction: Double): Boolean = js.native
  /* InferMemberOverrides */
  override def dispatchVisibilityChanged(changedView: View, visibility: Double): Unit = js.native
  /* InferMemberOverrides */
  override def dispatchWindowFocusChanged(hasFocus: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def dispatchWindowVisibilityChanged(visibility: Double): Unit = js.native
  /* InferMemberOverrides */
  override def draw(canvas: Canvas): Unit = js.native
  /* InferMemberOverrides */
  /* private */ override def drawAnimation(parent: js.Any, drawingTime: js.Any, a: js.Any, scalingRequired: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  /* protected */ override def drawChild(canvas: Canvas, child: View, drawingTime: Double): Boolean = js.native
  /* InferMemberOverrides */
  /* protected */ override def drawFromParent(canvas: Canvas, parent: ViewGroup, drawingTime: Double): Boolean = js.native
  /* InferMemberOverrides */
  /* private */ override def drawShadow(canvas: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  @JSName("drawableSizeChange")
  override def drawableSizeChange_MView_(who: Drawable): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def drawableStateChanged(): Unit = js.native
  /* InferMemberOverrides */
  override def ensureTransformationInfo(): Unit = js.native
  /* InferMemberOverrides */
  override def findFocus(): View = js.native
  /* InferMemberOverrides */
  override def findSyncPosition(): Double = js.native
  /* InferMemberOverrides */
  override def findUserSetNextFocus(root: View, direction: Double): View = js.native
  /* InferMemberOverrides */
  override def findViewById(id: String): View = js.native
  /* InferMemberOverrides */
  override def findViewByPredicate(predicate: Predicate[View]): View = js.native
  /* InferMemberOverrides */
  override def findViewByPredicateInsideOut(start: View, predicate: Predicate[View]): View = js.native
  /* InferMemberOverrides */
  /* protected */ override def findViewByPredicateTraversal(predicate: Predicate[View], childToSkip: View): View = js.native
  /* InferMemberOverrides */
  /* private */ override def findViewInsideOutShouldExist(root: js.Any, id: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  /* protected */ override def findViewTraversal(id: String): View = js.native
  /* InferMemberOverrides */
  override def findViewWithTag(tag: js.Any): View = js.native
  /* InferMemberOverrides */
  /* protected */ override def findViewWithTagTraversal(tag: js.Any): View = js.native
  /* InferMemberOverrides */
  override def finishAnimatingView(view: View, animation: Animation): Unit = js.native
  /* InferMemberOverrides */
  /* private */ override def fireOnSelected(): js.Any = js.native
  /* InferMemberOverrides */
  override def focusSearch(direction: Double): View = js.native
  /* InferMemberOverrides */
  override def forceLayout(): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def generateDefaultLayoutParams(): LayoutParams = js.native
  /* InferMemberOverrides */
  /* protected */ override def generateLayoutParams(p: LayoutParams): LayoutParams = js.native
  /* InferMemberOverrides */
  override def generateLayoutParamsFromAttr(attrs: HTMLElement): LayoutParams = js.native
  /* InferMemberOverrides */
  override def getAdapter(): SpinnerAdapter = js.native
  /* InferMemberOverrides */
  override def getAlpha(): Double = js.native
  /* InferMemberOverrides */
  override def getAnimation(): Animation = js.native
  /* InferMemberOverrides */
  override def getBackground(): Drawable = js.native
  /* InferMemberOverrides */
  override def getBaseline(): Double = js.native
  /* InferMemberOverrides */
  override def getBottom(): Double = js.native
  /* InferMemberOverrides */
  /* protected */ override def getBottomFadingEdgeStrength(): Double = js.native
  /* InferMemberOverrides */
  override def getChildAt(index: Double): View = js.native
  /* InferMemberOverrides */
  override def getChildCount(): Double = js.native
  /* InferMemberOverrides */
  override def getChildDrawingOrder(childCount: Double, i: Double): Double = js.native
  /* InferMemberOverrides */
  override def getChildHeight(child: View): Double = js.native
  /* InferMemberOverrides */
  /* protected */ override def getChildStaticTransformation(child: View, t: Transformation): Boolean = js.native
  /* InferMemberOverrides */
  override def getChildTransformation(): Transformation = js.native
  /* InferMemberOverrides */
  override def getChildWidth(child: View): Double = js.native
  /* InferMemberOverrides */
  override def getClipBounds(): Rect = js.native
  /* InferMemberOverrides */
  override def getClipChildren(): Boolean = js.native
  /* InferMemberOverrides */
  override def getContext(): Context = js.native
  /* InferMemberOverrides */
  override def getCornerRadiusBottomLeft(): Double = js.native
  /* InferMemberOverrides */
  override def getCornerRadiusBottomRight(): Double = js.native
  /* InferMemberOverrides */
  override def getCornerRadiusTopLeft(): Double = js.native
  /* InferMemberOverrides */
  override def getCornerRadiusTopRight(): Double = js.native
  /* InferMemberOverrides */
  override def getCount(): Double = js.native
  /* InferMemberOverrides */
  override def getDescendantFocusability(): Double = js.native
  /* InferMemberOverrides */
  override def getDrawableState(): js.Array[Double] = js.native
  /* InferMemberOverrides */
  override def getDrawingCache(): Canvas = js.native
  /* InferMemberOverrides */
  override def getDrawingCache(autoScale: Boolean): Canvas = js.native
  /* InferMemberOverrides */
  override def getDrawingCacheBackgroundColor(): Double = js.native
  /* InferMemberOverrides */
  override def getDrawingRect(outRect: Rect): Unit = js.native
  /* InferMemberOverrides */
  override def getDrawingTime(): Double = js.native
  def getDropDownHorizontalOffset(): Double = js.native
  def getDropDownVerticalOffset(): Double = js.native
  def getDropDownWidth(): Double = js.native
  /* InferMemberOverrides */
  override def getEmptyView(): View = js.native
  /* InferMemberOverrides */
  /* private */ override def getFinalAlpha(): js.Any = js.native
  /* InferMemberOverrides */
  override def getFirstVisiblePosition(): Double = js.native
  /* InferMemberOverrides */
  override def getFocusables(direction: Double): ArrayList[View] = js.native
  /* InferMemberOverrides */
  override def getFocusedChild(): View = js.native
  /* InferMemberOverrides */
  override def getFocusedRect(r: Rect): Unit = js.native
  /* InferMemberOverrides */
  override def getGlobalVisibleRect(r: Rect): Boolean = js.native
  /* InferMemberOverrides */
  override def getGlobalVisibleRect(r: Rect, globalOffset: Point): Boolean = js.native
  def getGravity(): Double = js.native
  /* InferMemberOverrides */
  override def getHandler(): Handler = js.native
  /* InferMemberOverrides */
  override def getHeight(): Double = js.native
  /* InferMemberOverrides */
  override def getHitRect(outRect: Rect): Unit = js.native
  /* InferMemberOverrides */
  override def getHorizontalFadingEdgeLength(): Double = js.native
  /* InferMemberOverrides */
  override def getHorizontalScrollFactor(): Double = js.native
  /* InferMemberOverrides */
  override def getHorizontalScrollbarHeight(): Double = js.native
  /* InferMemberOverrides */
  override def getId(): String = js.native
  /* InferMemberOverrides */
  override def getItemAtPosition(position: Double): js.Any = js.native
  /* InferMemberOverrides */
  override def getItemIdAtPosition(position: Double): Double = js.native
  /* InferMemberOverrides */
  override def getKeyDispatcherState(): DispatcherState = js.native
  /* InferMemberOverrides */
  override def getLastVisiblePosition(): Double = js.native
  /* InferMemberOverrides */
  override def getLayerType(): Double = js.native
  /* InferMemberOverrides */
  override def getLayoutDirection(): Double = js.native
  /* InferMemberOverrides */
  override def getLayoutParams(): LayoutParams = js.native
  /* InferMemberOverrides */
  override def getLeft(): Double = js.native
  /* InferMemberOverrides */
  /* protected */ override def getLeftFadingEdgeStrength(): Double = js.native
  /* InferMemberOverrides */
  override def getListenerInfo(): ListenerInfo = js.native
  /* InferMemberOverrides */
  override def getLocationInWindow(location: js.Array[Double]): Unit = js.native
  /* InferMemberOverrides */
  override def getLocationOnScreen(location: js.Array[Double]): Unit = js.native
  /* InferMemberOverrides */
  override def getMatrix(): Matrix = js.native
  /* InferMemberOverrides */
  override def getMeasuredHeight(): Double = js.native
  /* InferMemberOverrides */
  override def getMeasuredHeightAndState(): Double = js.native
  /* InferMemberOverrides */
  override def getMeasuredState(): Double = js.native
  /* InferMemberOverrides */
  override def getMeasuredWidth(): Double = js.native
  /* InferMemberOverrides */
  override def getMeasuredWidthAndState(): Double = js.native
  /* InferMemberOverrides */
  override def getMinimumHeight(): Double = js.native
  /* InferMemberOverrides */
  override def getMinimumWidth(): Double = js.native
  /* InferMemberOverrides */
  override def getNextFocusDownId(): String = js.native
  /* InferMemberOverrides */
  override def getNextFocusForwardId(): String = js.native
  /* InferMemberOverrides */
  override def getNextFocusLeftId(): String = js.native
  /* InferMemberOverrides */
  override def getNextFocusRightId(): String = js.native
  /* InferMemberOverrides */
  override def getNextFocusUpId(): String = js.native
  /* InferMemberOverrides */
  override def getOnFocusChangeListener(): OnFocusChangeListener = js.native
  /* InferMemberOverrides */
  override def getOnItemClickListener(): OnItemClickListener = js.native
  /* InferMemberOverrides */
  override def getOnItemLongClickListener(): OnItemLongClickListener = js.native
  /* InferMemberOverrides */
  override def getOnItemSelectedListener(): OnItemSelectedListener = js.native
  /* InferMemberOverrides */
  override def getOverScrollMode(): Double = js.native
  /* InferMemberOverrides */
  override def getPaddingBottom(): Double = js.native
  /* InferMemberOverrides */
  override def getPaddingLeft(): Double = js.native
  /* InferMemberOverrides */
  override def getPaddingRight(): Double = js.native
  /* InferMemberOverrides */
  override def getPaddingTop(): Double = js.native
  /* InferMemberOverrides */
  override def getParent(): ViewParent = js.native
  /* InferMemberOverrides */
  override def getPersistentDrawingCache(): Double = js.native
  /* InferMemberOverrides */
  override def getPivotX(): Double = js.native
  /* InferMemberOverrides */
  override def getPivotY(): Double = js.native
  def getPopupBackground(): Drawable = js.native
  /* InferMemberOverrides */
  override def getPositionForView(view: View): Double = js.native
  def getPrompt(): String = js.native
  /* InferMemberOverrides */
  override def getResources(): Resources = js.native
  /* InferMemberOverrides */
  override def getRight(): Double = js.native
  /* InferMemberOverrides */
  /* protected */ override def getRightFadingEdgeStrength(): Double = js.native
  /* InferMemberOverrides */
  override def getRootView(): View = js.native
  /* InferMemberOverrides */
  override def getRotation(): Double = js.native
  /* InferMemberOverrides */
  override def getRotationX(): Double = js.native
  /* InferMemberOverrides */
  override def getRotationY(): Double = js.native
  /* InferMemberOverrides */
  override def getScaleX(): Double = js.native
  /* InferMemberOverrides */
  override def getScaleY(): Double = js.native
  /* InferMemberOverrides */
  override def getScrollBarDefaultDelayBeforeFade(): Double = js.native
  /* InferMemberOverrides */
  override def getScrollBarFadeDuration(): Double = js.native
  /* InferMemberOverrides */
  override def getScrollBarSize(): Double = js.native
  /* InferMemberOverrides */
  /* private */ override def getScrollCache(): js.Any = js.native
  /* InferMemberOverrides */
  override def getScrollX(): Double = js.native
  /* InferMemberOverrides */
  override def getScrollY(): Double = js.native
  /* InferMemberOverrides */
  override def getSelectedItem(): js.Any = js.native
  /* InferMemberOverrides */
  override def getSelectedItemId(): Double = js.native
  /* InferMemberOverrides */
  override def getSelectedItemPosition(): Double = js.native
  /* InferMemberOverrides */
  override def getSelectedView(): View = js.native
  /* InferMemberOverrides */
  override def getSuggestedMinimumHeight(): Double = js.native
  /* InferMemberOverrides */
  override def getSuggestedMinimumWidth(): Double = js.native
  /* InferMemberOverrides */
  override def getTag(): js.Any = js.native
  /* InferMemberOverrides */
  override def getTextAlignment(): Double = js.native
  /* InferMemberOverrides */
  override def getTextDirection(): Double = js.native
  /* InferMemberOverrides */
  override def getTop(): Double = js.native
  /* InferMemberOverrides */
  /* protected */ override def getTopFadingEdgeStrength(): Double = js.native
  /* InferMemberOverrides */
  override def getTouchDelegate(): TouchDelegate = js.native
  /* InferMemberOverrides */
  /* private */ override def getTouchTarget(child: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  override def getTouchables(): ArrayList[View] = js.native
  /* InferMemberOverrides */
  override def getTransitionAlpha(): Double = js.native
  /* InferMemberOverrides */
  override def getTranslationX(): Double = js.native
  /* InferMemberOverrides */
  override def getTranslationY(): Double = js.native
  /* InferMemberOverrides */
  override def getVerticalFadingEdgeLength(): Double = js.native
  /* InferMemberOverrides */
  override def getVerticalScrollFactor(): Double = js.native
  /* InferMemberOverrides */
  override def getVerticalScrollbarWidth(): Double = js.native
  /* InferMemberOverrides */
  override def getViewRootImpl(): ViewRootImpl = js.native
  /* InferMemberOverrides */
  override def getViewTreeObserver(): ViewTreeObserver = js.native
  /* InferMemberOverrides */
  override def getVisibility(): Double = js.native
  /* InferMemberOverrides */
  override def getWidth(): Double = js.native
  /* InferMemberOverrides */
  override def getWindowAttachCount(): Double = js.native
  /* InferMemberOverrides */
  override def getWindowVisibility(): Double = js.native
  /* InferMemberOverrides */
  override def getWindowVisibleDisplayFrame(outRect: Rect): Unit = js.native
  /* InferMemberOverrides */
  override def getX(): Double = js.native
  /* InferMemberOverrides */
  override def getY(): Double = js.native
  /* InferMemberOverrides */
  override def handleDataChanged(): Unit = js.native
  /* InferMemberOverrides */
  override def handleFocusGainInternal(direction: Double, previouslyFocusedRect: Rect): Unit = js.native
  /* InferMemberOverrides */
  /* private */ override def hasAncestorThatBlocksDescendantFocus(): js.Any = js.native
  /* InferMemberOverrides */
  override def hasBooleanFlag(flag: Double): Boolean = js.native
  /* InferMemberOverrides */
  override def hasFocus(): Boolean = js.native
  /* InferMemberOverrides */
  override def hasFocusable(): Boolean = js.native
  /* InferMemberOverrides */
  override def hasIdentityMatrix(): Boolean = js.native
  /* InferMemberOverrides */
  override def hasOnClickListeners(): Boolean = js.native
  /* InferMemberOverrides */
  override def hasOpaqueScrollbars(): Boolean = js.native
  /* InferMemberOverrides */
  override def hasOverlappingRendering(): Boolean = js.native
  /* InferMemberOverrides */
  override def hasTransientState(): Boolean = js.native
  /* InferMemberOverrides */
  override def hasWindowFocus(): Boolean = js.native
  /* InferMemberOverrides */
  override def indexOfChild(child: View): Double = js.native
  /* InferMemberOverrides */
  /* private */ override def initAbsSpinner(): js.Any = js.native
  /* InferMemberOverrides */
  /* protected */ override def initBindAttr(): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def initBindElement(): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def initBindElement(bindElement: HTMLElement): Unit = js.native
  /* InferMemberOverrides */
  /* private */ override def initFromAttributes(context: js.Any, attrs: js.Any, defStyle: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  override def initScrollCache(): Unit = js.native
  /* InferMemberOverrides */
  /* private */ override def initViewGroup(): js.Any = js.native
  /* InferMemberOverrides */
  /* private */ override def initialAwakenScrollBars(): js.Any = js.native
  /* InferMemberOverrides */
  override def initializeScrollbars(): Unit = js.native
  /* InferMemberOverrides */
  override def initializeScrollbars(a: TypedArray): Unit = js.native
  /* InferMemberOverrides */
  override def invalidate(): js.Any = js.native
  /* InferMemberOverrides */
  override def invalidate(dirty: Rect): js.Any = js.native
  /* InferMemberOverrides */
  override def invalidate(invalidateCache: Boolean): js.Any = js.native
  /* InferMemberOverrides */
  override def invalidate(l: Double, t: Double, r: Double, b: Double): js.Any = js.native
  /* InferMemberOverrides */
  override def invalidateChildFast(child: View, dirty: Rect): Unit = js.native
  /* InferMemberOverrides */
  override def invalidateChildInParentFast(left: Double, top: Double, dirty: Rect): ViewParent = js.native
  /* InferMemberOverrides */
  override def invalidateParentCaches(): Unit = js.native
  /* InferMemberOverrides */
  override def invalidateParentIfNeeded(): Unit = js.native
  /* InferMemberOverrides */
  override def invalidateViewProperty(invalidateParent: Boolean, forceRedraw: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def isActivated(): Boolean = js.native
  /* InferMemberOverrides */
  override def isAlwaysDrawnWithCacheEnabled(): Boolean = js.native
  /* InferMemberOverrides */
  override def isAnimationCacheEnabled(): Boolean = js.native
  /* InferMemberOverrides */
  override def isAttachedToWindow(): Boolean = js.native
  /* InferMemberOverrides */
  override def isChildrenDrawingOrderEnabled(): Boolean = js.native
  /* InferMemberOverrides */
  override def isChildrenDrawnWithCacheEnabled(): Boolean = js.native
  /* InferMemberOverrides */
  override def isClickable(): Boolean = js.native
  /* InferMemberOverrides */
  override def isClipToPadding(): Boolean = js.native
  /* InferMemberOverrides */
  override def isDirty(): Boolean = js.native
  /* InferMemberOverrides */
  override def isDrawingCacheEnabled(): Boolean = js.native
  /* InferMemberOverrides */
  override def isEnabled(): Boolean = js.native
  /* InferMemberOverrides */
  override def isFocusable(): Boolean = js.native
  /* InferMemberOverrides */
  override def isFocusableInTouchMode(): Boolean = js.native
  /* InferMemberOverrides */
  override def isFocused(): Boolean = js.native
  /* InferMemberOverrides */
  override def isHardwareAccelerated(): Boolean = js.native
  /* InferMemberOverrides */
  override def isHorizontalScrollBarEnabled(): Boolean = js.native
  /* InferMemberOverrides */
  override def isInEditMode(): Boolean = js.native
  /* InferMemberOverrides */
  override def isInFilterMode(): Boolean = js.native
  /* InferMemberOverrides */
  override def isInLayout(): Boolean = js.native
  /* InferMemberOverrides */
  override def isInScrollingContainer(): Boolean = js.native
  /* InferMemberOverrides */
  override def isInTouchMode(): Boolean = js.native
  /* InferMemberOverrides */
  override def isLaidOut(): Boolean = js.native
  /* InferMemberOverrides */
  override def isLayoutRequested(): Boolean = js.native
  /* InferMemberOverrides */
  override def isLayoutRtl(): Boolean = js.native
  /* InferMemberOverrides */
  override def isLayoutSuppressed(): Boolean = js.native
  /* InferMemberOverrides */
  override def isLongClickable(): Boolean = js.native
  /* InferMemberOverrides */
  override def isMotionEventSplittingEnabled(): Boolean = js.native
  /* InferMemberOverrides */
  override def isOpaque(): Boolean = js.native
  /* InferMemberOverrides */
  override def isPressed(): Boolean = js.native
  /* InferMemberOverrides */
  override def isRootNamespace(): Boolean = js.native
  /* InferMemberOverrides */
  override def isScrollContainer(): Boolean = js.native
  /* InferMemberOverrides */
  /* private */ override def isScrollableForAccessibility(): js.Any = js.native
  /* InferMemberOverrides */
  override def isScrollbarFadingEnabled(): Boolean = js.native
  /* InferMemberOverrides */
  override def isSelected(): Boolean = js.native
  /* InferMemberOverrides */
  override def isShown(): Boolean = js.native
  /* InferMemberOverrides */
  /* protected */ override def isTransformedTouchPointInView(x: Double, y: Double, child: View, outLocalPoint: Point): Boolean = js.native
  /* InferMemberOverrides */
  override def isVerticalScrollBarEnabled(): Boolean = js.native
  /* InferMemberOverrides */
  override def isVerticalScrollBarHidden(): Boolean = js.native
  /* InferMemberOverrides */
  /* protected */ override def isVisibleToUser(): Boolean = js.native
  /* InferMemberOverrides */
  /* protected */ override def isVisibleToUser(boundInView: Rect): Boolean = js.native
  /* InferMemberOverrides */
  override def jumpDrawablesToCurrentState(): Unit = js.native
  /* InferMemberOverrides */
  override def layout(l: Double, t: Double, r: Double, b: Double): Unit = js.native
  /* InferMemberOverrides */
  override def layoutSpinner(delta: Double, animate: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def lookForSelectablePosition(position: Double, lookDown: Boolean): Double = js.native
  /* private */ def makeView(position: js.Any, addChild: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  override def measure(widthMeasureSpec: Double, heightMeasureSpec: Double): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def measureChild(child: View, parentWidthMeasureSpec: Double, parentHeightMeasureSpec: Double): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def measureChildWithMargins(
    child: View,
    parentWidthMeasureSpec: Double,
    widthUsed: Double,
    parentHeightMeasureSpec: Double,
    heightUsed: Double
  ): Unit = js.native
  /* InferMemberOverrides */
  override def measureChildren(widthMeasureSpec: Double, heightMeasureSpec: Double): Unit = js.native
  def measureContentWidth(adapter: SpinnerAdapter, background: Drawable): Double = js.native
  /* InferMemberOverrides */
  override def notifyGlobalFocusCleared(oldFocus: View): Unit = js.native
  /* InferMemberOverrides */
  override def offsetChildrenTopAndBottom(offset: Double): Unit = js.native
  /* InferMemberOverrides */
  override def offsetDescendantRectToMyCoords(descendant: View, rect: Rect): Unit = js.native
  /* InferMemberOverrides */
  override def offsetLeftAndRight(offset: Double): Unit = js.native
  /* InferMemberOverrides */
  override def offsetRectBetweenParentAndChild(descendant: View, rect: Rect, offsetFromChildToParent: Boolean, clipToBounds: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def offsetRectIntoDescendantCoords(descendant: View, rect: Rect): Unit = js.native
  /* InferMemberOverrides */
  override def offsetTopAndBottom(offset: Double): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def onAnimationEnd(): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def onAnimationStart(): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def onAttachedToWindow(): Unit = js.native
  /* InferMemberOverrides */
  /* private */ override def onBindElementAttributeChanged(attributeName: js.Any, oldVal: js.Any, newVal: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  override def onCancelPendingInputEvents(): Unit = js.native
  /* InferMemberOverrides */
  override def onChildVisibilityChanged(child: View, oldVisibility: Double, newVisibility: Double): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def onCreateDrawableState(extraSpace: Double): js.Array[Double] = js.native
  /* InferMemberOverrides */
  /* protected */ override def onDetachedFromWindow(): Unit = js.native
  /* InferMemberOverrides */
  override def onDisplayHint(hint: Double): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def onDraw(canvas: Canvas): Unit = js.native
  /* InferMemberOverrides */
  override def onDrawHorizontalScrollBar(canvas: Canvas, scrollBar: Drawable, l: Double, t: Double, r: Double, b: Double): Unit = js.native
  /* InferMemberOverrides */
  override def onDrawScrollBars(canvas: Canvas): Unit = js.native
  /* InferMemberOverrides */
  override def onDrawVerticalScrollBar(canvas: Canvas, scrollBar: Drawable, l: Double, t: Double, r: Double, b: Double): Unit = js.native
  /* InferMemberOverrides */
  override def onFilterTouchEventForSecurity(event: MotionEvent): Boolean = js.native
  /* InferMemberOverrides */
  /* protected */ override def onFinishInflate(): Unit = js.native
  /* InferMemberOverrides */
  override def onFinishTemporaryDetach(): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def onFocusChanged(gainFocus: Boolean, direction: Double, previouslyFocusedRect: Rect): Unit = js.native
  /* InferMemberOverrides */
  override def onFocusLost(): Unit = js.native
  /* InferMemberOverrides */
  override def onGenericMotionEvent(event: MotionEvent): Boolean = js.native
  /* InferMemberOverrides */
  override def onInterceptTouchEvent(ev: MotionEvent): Boolean = js.native
  /* InferMemberOverrides */
  /* protected */ override def onLayout(changed: Boolean, left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def onMeasure(widthMeasureSpec: Double, heightMeasureSpec: Double): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def onOverScrolled(scrollX: Double, scrollY: Double, clampedX: Boolean, clampedY: Boolean): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def onRequestFocusInDescendants(direction: Double, previouslyFocusedRect: Rect): Boolean = js.native
  /* InferMemberOverrides */
  override def onScrollChanged(l: Double, t: Double, oldl: Double, oldt: Double): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def onSetAlpha(alpha: Double): Boolean = js.native
  /* InferMemberOverrides */
  override def onSetLayoutParams(child: View, layoutParams: LayoutParams): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def onSizeChanged(w: Double, h: Double, oldw: Double, oldh: Double): Unit = js.native
  /* InferMemberOverrides */
  override def onStartTemporaryDetach(): Unit = js.native
  /* InferMemberOverrides */
  override def onTouchEvent(event: MotionEvent): Boolean = js.native
  /* InferMemberOverrides */
  /* protected */ override def onViewAdded(child: View): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def onViewRemoved(child: View): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def onVisibilityChanged(changedView: View, visibility: Double): Unit = js.native
  /* InferMemberOverrides */
  override def onWindowFocusChanged(hasWindowFocus: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def onWindowVisibilityChanged(visibility: Double): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def overScrollBy(
    deltaX: Double,
    deltaY: Double,
    scrollX: Double,
    scrollY: Double,
    scrollRangeX: Double,
    scrollRangeY: Double,
    maxOverScrollX: Double,
    maxOverScrollY: Double,
    isTouchEvent: Boolean
  ): Boolean = js.native
  /* InferMemberOverrides */
  /* private */ override def performAccessibilityActionsOnSelected(): js.Any = js.native
  /* InferMemberOverrides */
  override def performButtonActionOnTouchDown(event: MotionEvent): Boolean = js.native
  /* InferMemberOverrides */
  override def performClick(): Boolean = js.native
  /* InferMemberOverrides */
  override def performClick(event: MotionEvent): Boolean = js.native
  /* InferMemberOverrides */
  override def performHapticFeedback(feedbackConstant: Double): Boolean = js.native
  /* InferMemberOverrides */
  override def performItemClick(view: View, position: Double, id: Double): Boolean = js.native
  /* InferMemberOverrides */
  override def performLongClick(): Boolean = js.native
  /* InferMemberOverrides */
  override def playSoundEffect(soundConstant: Double): Unit = js.native
  /* InferMemberOverrides */
  override def pointInView(localX: Double, localY: Double): Boolean = js.native
  /* InferMemberOverrides */
  override def pointInView(localX: Double, localY: Double, slop: Double): Boolean = js.native
  /* InferMemberOverrides */
  override def pointToPosition(x: Double, y: Double): Double = js.native
  /* InferMemberOverrides */
  override def post(action: Runnable): Boolean = js.native
  /* InferMemberOverrides */
  override def postDelayed(action: Runnable, delayMillis: Double): Boolean = js.native
  /* InferMemberOverrides */
  override def postInvalidate(): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidate(
    l: js.UndefOr[scala.Nothing],
    t: js.UndefOr[scala.Nothing],
    r: js.UndefOr[scala.Nothing],
    b: Double
  ): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidate(l: js.UndefOr[scala.Nothing], t: js.UndefOr[scala.Nothing], r: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidate(l: js.UndefOr[scala.Nothing], t: js.UndefOr[scala.Nothing], r: Double, b: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidate(l: js.UndefOr[scala.Nothing], t: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidate(l: js.UndefOr[scala.Nothing], t: Double, r: js.UndefOr[scala.Nothing], b: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidate(l: js.UndefOr[scala.Nothing], t: Double, r: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidate(l: js.UndefOr[scala.Nothing], t: Double, r: Double, b: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidate(l: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidate(l: Double, t: js.UndefOr[scala.Nothing], r: js.UndefOr[scala.Nothing], b: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidate(l: Double, t: js.UndefOr[scala.Nothing], r: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidate(l: Double, t: js.UndefOr[scala.Nothing], r: Double, b: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidate(l: Double, t: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidate(l: Double, t: Double, r: js.UndefOr[scala.Nothing], b: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidate(l: Double, t: Double, r: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidate(l: Double, t: Double, r: Double, b: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateDelayed(delayMilliseconds: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateDelayed(
    delayMilliseconds: Double,
    left: js.UndefOr[scala.Nothing],
    top: js.UndefOr[scala.Nothing],
    right: js.UndefOr[scala.Nothing],
    bottom: Double
  ): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateDelayed(
    delayMilliseconds: Double,
    left: js.UndefOr[scala.Nothing],
    top: js.UndefOr[scala.Nothing],
    right: Double
  ): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateDelayed(
    delayMilliseconds: Double,
    left: js.UndefOr[scala.Nothing],
    top: js.UndefOr[scala.Nothing],
    right: Double,
    bottom: Double
  ): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateDelayed(delayMilliseconds: Double, left: js.UndefOr[scala.Nothing], top: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateDelayed(
    delayMilliseconds: Double,
    left: js.UndefOr[scala.Nothing],
    top: Double,
    right: js.UndefOr[scala.Nothing],
    bottom: Double
  ): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateDelayed(delayMilliseconds: Double, left: js.UndefOr[scala.Nothing], top: Double, right: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateDelayed(
    delayMilliseconds: Double,
    left: js.UndefOr[scala.Nothing],
    top: Double,
    right: Double,
    bottom: Double
  ): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateDelayed(delayMilliseconds: Double, left: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateDelayed(
    delayMilliseconds: Double,
    left: Double,
    top: js.UndefOr[scala.Nothing],
    right: js.UndefOr[scala.Nothing],
    bottom: Double
  ): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateDelayed(delayMilliseconds: Double, left: Double, top: js.UndefOr[scala.Nothing], right: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateDelayed(
    delayMilliseconds: Double,
    left: Double,
    top: js.UndefOr[scala.Nothing],
    right: Double,
    bottom: Double
  ): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateDelayed(delayMilliseconds: Double, left: Double, top: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateDelayed(
    delayMilliseconds: Double,
    left: Double,
    top: Double,
    right: js.UndefOr[scala.Nothing],
    bottom: Double
  ): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateDelayed(delayMilliseconds: Double, left: Double, top: Double, right: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateDelayed(delayMilliseconds: Double, left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateOnAnimation(): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateOnAnimation(
    left: js.UndefOr[scala.Nothing],
    top: js.UndefOr[scala.Nothing],
    right: js.UndefOr[scala.Nothing],
    bottom: Double
  ): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateOnAnimation(left: js.UndefOr[scala.Nothing], top: js.UndefOr[scala.Nothing], right: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateOnAnimation(left: js.UndefOr[scala.Nothing], top: js.UndefOr[scala.Nothing], right: Double, bottom: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateOnAnimation(left: js.UndefOr[scala.Nothing], top: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateOnAnimation(left: js.UndefOr[scala.Nothing], top: Double, right: js.UndefOr[scala.Nothing], bottom: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateOnAnimation(left: js.UndefOr[scala.Nothing], top: Double, right: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateOnAnimation(left: js.UndefOr[scala.Nothing], top: Double, right: Double, bottom: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateOnAnimation(left: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateOnAnimation(left: Double, top: js.UndefOr[scala.Nothing], right: js.UndefOr[scala.Nothing], bottom: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateOnAnimation(left: Double, top: js.UndefOr[scala.Nothing], right: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateOnAnimation(left: Double, top: js.UndefOr[scala.Nothing], right: Double, bottom: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateOnAnimation(left: Double, top: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateOnAnimation(left: Double, top: Double, right: js.UndefOr[scala.Nothing], bottom: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateOnAnimation(left: Double, top: Double, right: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postInvalidateOnAnimation(left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
  /* InferMemberOverrides */
  override def postOnAnimation(action: Runnable): Boolean = js.native
  /* InferMemberOverrides */
  override def postOnAnimationDelayed(action: Runnable, delayMillis: Double): Boolean = js.native
  /* InferMemberOverrides */
  override def recycleAllViews(): Unit = js.native
  /* InferMemberOverrides */
  override def refreshDrawableState(): Unit = js.native
  /* InferMemberOverrides */
  override def rememberSyncState(): Unit = js.native
  /* InferMemberOverrides */
  override def removeAllViews(): Unit = js.native
  /* InferMemberOverrides */
  override def removeAllViewsInLayout(): Unit = js.native
  /* InferMemberOverrides */
  override def removeCallbacks(action: Runnable): Boolean = js.native
  /* InferMemberOverrides */
  /* private */ override def removeChildElement(childElement: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  override def removeDetachedView(child: View, animate: Boolean): Unit = js.native
  /* InferMemberOverrides */
  /* private */ override def removeFromArray(index: js.Any, count: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  /* private */ override def removeLongPressCallback(): js.Any = js.native
  /* InferMemberOverrides */
  override def removeOnAttachStateChangeListener(listener: OnAttachStateChangeListener): Unit = js.native
  /* InferMemberOverrides */
  override def removeOnLayoutChangeListener(listener: OnLayoutChangeListener): Unit = js.native
  /* InferMemberOverrides */
  /* private */ override def removePerformClickCallback(): js.Any = js.native
  /* InferMemberOverrides */
  /* private */ override def removePointersFromTouchTargets(pointerIdBits: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  /* private */ override def removeTapCallback(): js.Any = js.native
  /* InferMemberOverrides */
  /* private */ override def removeUnsetPressCallback(): js.Any = js.native
  /* InferMemberOverrides */
  override def removeView(view: View): Unit = js.native
  /* InferMemberOverrides */
  override def removeViewAt(index: Double): Unit = js.native
  /* InferMemberOverrides */
  override def removeViewInLayout(view: View): Unit = js.native
  /* InferMemberOverrides */
  /* private */ override def removeViewInternal(view: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  override def removeViews(start: Double, count: Double): Unit = js.native
  /* InferMemberOverrides */
  override def removeViewsInLayout(start: Double, count: Double): Unit = js.native
  /* InferMemberOverrides */
  /* private */ override def removeViewsInternal(start: js.Any, count: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  override def requestFocus(): Boolean = js.native
  /* InferMemberOverrides */
  override def requestFocus(direction: js.UndefOr[scala.Nothing], previouslyFocusedRect: js.Any): Boolean = js.native
  /* InferMemberOverrides */
  override def requestFocus(direction: Double): Boolean = js.native
  /* InferMemberOverrides */
  override def requestFocus(direction: Double, previouslyFocusedRect: js.Any): Boolean = js.native
  /* InferMemberOverrides */
  override def requestFocusFromTouch(): Boolean = js.native
  /* InferMemberOverrides */
  /* private */ override def requestFocusNoSearch(direction: js.Any, previouslyFocusedRect: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  override def requestLayout(): js.Any with Unit = js.native
  /* InferMemberOverrides */
  override def requestRectangleOnScreen(rectangle: Rect): Boolean = js.native
  /* InferMemberOverrides */
  override def requestRectangleOnScreen(rectangle: Rect, immediate: Boolean): Boolean = js.native
  /* InferMemberOverrides */
  override def requestSyncBoundToElement(): Unit = js.native
  /* InferMemberOverrides */
  override def requestSyncBoundToElement(immediately: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def resetList(): Unit = js.native
  /* InferMemberOverrides */
  override def resetPressedState(): Unit = js.native
  /* InferMemberOverrides */
  /* private */ override def resetTouchState(): js.Any = js.native
  /* InferMemberOverrides */
  override def resolveDrawables(): Unit = js.native
  /* InferMemberOverrides */
  override def resolvePadding(): Unit = js.native
  /* InferMemberOverrides */
  override def rootViewRequestFocus(): Boolean = js.native
  /* InferMemberOverrides */
  override def scrollBy(x: Double, y: Double): Unit = js.native
  /* InferMemberOverrides */
  override def scrollTo(x: Double, y: Double): Unit = js.native
  /* InferMemberOverrides */
  /* private */ override def selectionChanged(): js.Any = js.native
  /* InferMemberOverrides */
  override def setActivated(activated: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def setAdapter(adapter: SpinnerAdapter): Unit = js.native
  /* InferMemberOverrides */
  override def setAddStatesFromChildren(addsStates: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def setAlpha(alpha: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setAlphaNoInvalidation(alpha: Double): Boolean = js.native
  /* InferMemberOverrides */
  override def setAlwaysDrawnWithCacheEnabled(always: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def setAnimation(animation: Animation): Unit = js.native
  /* InferMemberOverrides */
  override def setAnimationCacheEnabled(enabled: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def setBackground(background: Drawable): Unit = js.native
  /* InferMemberOverrides */
  override def setBackgroundColor(color: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setBackgroundDrawable(background: Drawable): Unit = js.native
  /* InferMemberOverrides */
  override def setBooleanFlag(flag: Double, value: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def setBottom(bottom: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setChildrenDrawingCacheEnabled(enabled: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def setChildrenDrawingOrderEnabled(enabled: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def setChildrenDrawnWithCacheEnabled(enabled: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def setClickable(clickable: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def setClipBounds(clipBounds: Rect): Unit = js.native
  /* InferMemberOverrides */
  override def setClipChildren(clipChildren: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def setClipToPadding(clipToPadding: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def setCornerRadius(radiusTopLeft: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setCornerRadius(
    radiusTopLeft: Double,
    radiusTopRight: js.UndefOr[scala.Nothing],
    radiusBottomRight: js.UndefOr[scala.Nothing],
    radiusBottomLeft: Double
  ): Unit = js.native
  /* InferMemberOverrides */
  override def setCornerRadius(radiusTopLeft: Double, radiusTopRight: js.UndefOr[scala.Nothing], radiusBottomRight: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setCornerRadius(
    radiusTopLeft: Double,
    radiusTopRight: js.UndefOr[scala.Nothing],
    radiusBottomRight: Double,
    radiusBottomLeft: Double
  ): Unit = js.native
  /* InferMemberOverrides */
  override def setCornerRadius(radiusTopLeft: Double, radiusTopRight: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setCornerRadius(
    radiusTopLeft: Double,
    radiusTopRight: Double,
    radiusBottomRight: js.UndefOr[scala.Nothing],
    radiusBottomLeft: Double
  ): Unit = js.native
  /* InferMemberOverrides */
  override def setCornerRadius(radiusTopLeft: Double, radiusTopRight: Double, radiusBottomRight: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setCornerRadius(radiusTopLeft: Double, radiusTopRight: Double, radiusBottomRight: Double, radiusBottomLeft: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setCornerRadiusBottomLeft(value: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setCornerRadiusBottomRight(value: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setCornerRadiusTopLeft(value: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setCornerRadiusTopRight(value: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setDescendantFocusability(focusability: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setDrawingCacheBackgroundColor(color: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setDrawingCacheEnabled(enabled: Boolean): Unit = js.native
  def setDropDownHorizontalOffset(pixels: Double): Unit = js.native
  def setDropDownVerticalOffset(pixels: Double): Unit = js.native
  def setDropDownWidth(pixels: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setEmptyView(emptyView: View): Unit = js.native
  /* InferMemberOverrides */
  override def setEnabled(enabled: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def setFadingEdgeLength(length: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setFlags(flags: Double, mask: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setFocusable(focusable: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def setFocusableInTouchMode(focusableInTouchMode: Boolean): Unit = js.native
  /* InferMemberOverrides */
  /* protected */ override def setFrame(left: Double, top: Double, right: Double, bottom: Double): Boolean = js.native
  def setGravity(gravity: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setHasTransientState(hasTransientState: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def setHorizontalFadingEdgeEnabled(enable: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def setHorizontalScrollBarEnabled(horizontalScrollBarEnabled: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def setHorizontalScrollbarPosition(position: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setId(id: String): Unit = js.native
  /* InferMemberOverrides */
  override def setIsRootNamespace(isRoot: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def setLayerType(layerType: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setLayoutDirection(layoutDirection: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setLayoutParams(params: LayoutParams): Unit = js.native
  /* InferMemberOverrides */
  override def setLeft(left: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setLongClickable(longClickable: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def setMeasuredDimension(measuredWidth: js.Any, measuredHeight: js.Any): Unit = js.native
  /* InferMemberOverrides */
  override def setMinimumHeight(minHeight: js.Any): Unit = js.native
  /* InferMemberOverrides */
  override def setMinimumWidth(minWidth: js.Any): Unit = js.native
  /* InferMemberOverrides */
  override def setMotionEventSplittingEnabled(split: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def setNextFocusDownId(nextFocusDownId: String): Unit = js.native
  /* InferMemberOverrides */
  override def setNextFocusForwardId(nextFocusForwardId: String): Unit = js.native
  /* InferMemberOverrides */
  override def setNextFocusLeftId(nextFocusLeftId: String): Unit = js.native
  /* InferMemberOverrides */
  override def setNextFocusRightId(nextFocusRightId: String): Unit = js.native
  /* InferMemberOverrides */
  override def setNextFocusUpId(nextFocusUpId: String): Unit = js.native
  /* InferMemberOverrides */
  override def setNextSelectedPositionInt(position: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setOnClickListener(l: js.Function1[/* v */ this.type, Unit]): Unit = js.native
  /* InferMemberOverrides */
  override def setOnClickListener(l: typings.androiduix.android.view.View.OnClickListener): Unit = js.native
  /* InferMemberOverrides */
  /* private */ override def setOnClickListenerByAttrValueString(onClickAttrString: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  override def setOnFocusChangeListener(l: js.Function2[/* v */ this.type, /* hasFocus */ Boolean, Unit]): Unit = js.native
  /* InferMemberOverrides */
  override def setOnFocusChangeListener(l: OnFocusChangeListener): Unit = js.native
  /* InferMemberOverrides */
  override def setOnHierarchyChangeListener(listener: OnHierarchyChangeListener): Unit = js.native
  /* InferMemberOverrides */
  override def setOnItemClickListener(listener: OnItemClickListener): Unit = js.native
  def setOnItemClickListenerInt(l: OnItemClickListener): Unit = js.native
  /* InferMemberOverrides */
  override def setOnItemLongClickListener(listener: OnItemLongClickListener): Unit = js.native
  /* InferMemberOverrides */
  override def setOnItemSelectedListener(listener: OnItemSelectedListener): Unit = js.native
  /* InferMemberOverrides */
  override def setOnKeyListener(l: js.Function3[/* v */ this.type, /* keyCode */ Double, /* event */ KeyEvent, Unit]): Unit = js.native
  /* InferMemberOverrides */
  override def setOnKeyListener(l: OnKeyListener): Unit = js.native
  /* InferMemberOverrides */
  override def setOnLongClickListener(l: js.Function1[/* v */ this.type, Boolean]): Unit = js.native
  /* InferMemberOverrides */
  override def setOnLongClickListener(l: OnLongClickListener): Unit = js.native
  /* InferMemberOverrides */
  override def setOnTouchListener(l: js.Function2[/* v */ this.type, /* event */ MotionEvent, Unit]): Unit = js.native
  /* InferMemberOverrides */
  override def setOnTouchListener(l: OnTouchListener): Unit = js.native
  /* InferMemberOverrides */
  override def setOverScrollMode(overScrollMode: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setPadding(left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setPaddingBottom(bottom: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setPaddingLeft(left: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setPaddingRight(right: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setPaddingTop(top: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setPersistentDrawingCache(drawingCacheToKeep: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setPivotX(pivotX: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setPivotY(pivotY: Double): Unit = js.native
  def setPopupBackgroundDrawable(background: Drawable): Unit = js.native
  /* InferMemberOverrides */
  override def setPressed(pressed: Boolean): Unit = js.native
  def setPrompt(prompt: String): Unit = js.native
  /* InferMemberOverrides */
  override def setRight(right: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setRotation(rotation: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setRotationX(rotationX: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setRotationY(rotationY: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setScaleX(scaleX: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setScaleY(scaleY: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setScrollBarDefaultDelayBeforeFade(scrollBarDefaultDelayBeforeFade: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setScrollBarFadeDuration(scrollBarFadeDuration: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setScrollBarSize(scrollBarSize: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setScrollBarStyle(position: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setScrollContainer(isScrollContainer: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def setScrollX(value: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setScrollY(value: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setScrollbarFadingEnabled(fadeScrollbars: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def setSelected(selected: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def setSelectedPositionInt(position: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setSelection(position: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setSelection(position: Double, animate: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def setSelectionInt(position: Double, animate: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def setShadowView(radius: Double, dx: Double, dy: Double, color: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setTag(tag: js.Any): Unit = js.native
  /* InferMemberOverrides */
  override def setTextAlignment(textAlignment: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setTextDirection(textDirection: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setTop(top: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setTouchDelegate(delegate: TouchDelegate): Unit = js.native
  /* InferMemberOverrides */
  override def setTransitionAlpha(alpha: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setTranslationX(translationX: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setTranslationY(translationY: Double): Unit = js.native
  /* private */ def setUpChild(child: js.Any, addChild: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  override def setVerticalFadingEdgeEnabled(enable: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def setVerticalScrollBarEnabled(verticalScrollBarEnabled: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def setVerticalScrollbarPosition(position: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setVisibility(visibility: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setWillNotCacheDrawing(willNotCacheDrawing: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def setWillNotDraw(willNotDraw: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def setX(x: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setY(y: Double): Unit = js.native
  /* InferMemberOverrides */
  override def shouldDelayChildPressedState(): Boolean = js.native
  /* InferMemberOverrides */
  /* private */ override def sizeChange(newWidth: js.Any, newHeight: js.Any, oldWidth: js.Any, oldHeight: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  /* private */ override def skipInvalidate(): js.Any = js.native
  /* InferMemberOverrides */
  override def startAnimation(animation: Animation): Unit = js.native
  /* InferMemberOverrides */
  override def suppressLayout(suppress: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def syncVisibleToElement(): Unit = js.native
  /* InferMemberOverrides */
  override def tagName(): String = js.native
  /* InferMemberOverrides */
  override def transformRect(rect: Rect): Unit = js.native
  /* InferMemberOverrides */
  override def unFocus(): Unit = js.native
  /* InferMemberOverrides */
  override def unscheduleDrawable(who: Drawable): Unit = js.native
  /* InferMemberOverrides */
  /* private */ override def updateEmptyStatus(empty: js.Any): js.Any = js.native
  /* InferMemberOverrides */
  /* private */ override def updateMatrix(): js.Any = js.native
  /* InferMemberOverrides */
  /* protected */ override def verifyDrawable(who: Drawable): Boolean = js.native
  /* InferMemberOverrides */
  override def willNotCacheDrawing(): Boolean = js.native
  /* InferMemberOverrides */
  override def willNotDraw(): Boolean = js.native
}

