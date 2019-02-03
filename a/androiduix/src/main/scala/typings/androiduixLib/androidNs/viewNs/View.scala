package typings
package androiduixLib.androidNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.View")
@js.native
class View protected ()
  extends androiduixLib.javaNs.langNs.JavaObject
     with androiduixLib.androidNs.graphicsNs.drawableNs.DrawableNs.Callback
     with androiduixLib.androidNs.viewNs.KeyEventNs.Callback {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement, defStyleAttr: stdLib.Map[java.lang.String, java.lang.String]) = this()
  var _AttrObserver: js.Any = js.native
  var _attrBinder: js.Any = js.native
  var _lastSyncHeight: js.Any = js.native
  var _lastSyncLeft: js.Any = js.native
  var _lastSyncScrollX: js.Any = js.native
  var _lastSyncScrollY: js.Any = js.native
  var _lastSyncTop: js.Any = js.native
  var _lastSyncTransform: js.Any = js.native
  var _lastSyncWidth: js.Any = js.native
  var _mBottom: js.Any = js.native
  var _mLeft: js.Any = js.native
  var _mRight: js.Any = js.native
  var _mScrollX: js.Any = js.native
  var _mScrollY: js.Any = js.native
  var _mTop: js.Any = js.native
  var _stateAttrList: js.Any = js.native
  var _syncToElementImmediatelyLock: js.Any = js.native
  var _syncToElementLock: js.Any = js.native
  var _syncToElementRun: js.Any = js.native
  var bindElement: stdLib.HTMLElement = js.native
  var mAttachInfo: androiduixLib.androidNs.viewNs.ViewNs.AttachInfo = js.native
  var mBackground: js.Any = js.native
  var mBackgroundHeight: js.Any = js.native
  var mBackgroundSizeChanged: js.Any = js.native
  var mBackgroundWidth: js.Any = js.native
  var mBottom: scala.Double = js.native
  var mCachingFailed: scala.Boolean = js.native
  var mClipBounds: js.Any = js.native
  var mContext: androiduixLib.androidNs.contentNs.Context = js.native
  var mCornerRadiusBottomLeft: js.Any = js.native
  var mCornerRadiusBottomRight: js.Any = js.native
  var mCornerRadiusTopLeft: js.Any = js.native
  var mCornerRadiusTopRight: js.Any = js.native
  var mCurrentAnimation: androiduixLib.androidNs.viewNs.animationNs.Animation = js.native
  var mDrawableState: js.Any = js.native
  var mDrawingCacheBackgroundColor: js.Any = js.native
  var mFloatingTreeObserver: js.Any = js.native
  var mHasPerformedLongPress: js.Any = js.native
  var mID: java.lang.String = js.native
  var mLastIsOpaque: js.Any = js.native
  var mLayerType: scala.Double = js.native
  var mLayoutParams: androiduixLib.androidNs.viewNs.ViewGroupNs.LayoutParams = js.native
  var mLeft: scala.Double = js.native
  var mListenerInfo: js.Any = js.native
  var mLocalDirtyRect: androiduixLib.androidNs.graphicsNs.Rect = js.native
  var mMatchIdPredicate: js.Any = js.native
  var mMeasureCache: js.Any = js.native
  var mMeasuredHeight: js.Any = js.native
  var mMeasuredWidth: js.Any = js.native
  var mMinHeight: scala.Double = js.native
  var mMinWidth: scala.Double = js.native
  var mNextFocusDownId: js.Any = js.native
  var mNextFocusForwardId: java.lang.String = js.native
  var mNextFocusLeftId: js.Any = js.native
  var mNextFocusRightId: js.Any = js.native
  var mNextFocusUpId: js.Any = js.native
  var mOldHeightMeasureSpec: js.Any = js.native
  var mOldWidthMeasureSpec: js.Any = js.native
  var mOverScrollMode: js.Any = js.native
  var mOverlay: js.Any = js.native
  var mPaddingBottom: scala.Double = js.native
  var mPaddingLeft: scala.Double = js.native
  var mPaddingRight: scala.Double = js.native
  var mPaddingTop: scala.Double = js.native
  var mParent: ViewParent = js.native
  var mPendingCheckForLongPress: js.Any = js.native
  var mPendingCheckForTap: js.Any = js.native
  var mPerformClick: js.Any = js.native
  var mPerformClickAfterPressDraw: js.Any = js.native
  var mPrivateFlags: scala.Double = js.native
  var mPrivateFlags2: js.Any = js.native
  var mPrivateFlags3: js.Any = js.native
  var mRight: scala.Double = js.native
  var mScrollCache: js.Any = js.native
  var mScrollX: scala.Double = js.native
  var mScrollY: scala.Double = js.native
  var mShadowDrawable: js.Any = js.native
  var mShadowPaint: js.Any = js.native
  var mTag: js.Any = js.native
  var mTop: scala.Double = js.native
  var mTouchDelegate: js.Any = js.native
  var mTouchSlop: scala.Double = js.native
  var mTransformationInfo: androiduixLib.androidNs.viewNs.ViewNs.TransformationInfo = js.native
  var mTransientStateCount: js.Any = js.native
  var mUnscaledDrawingCache: js.Any = js.native
  var mUnsetPressedState: js.Any = js.native
  var mVerticalScrollFactor: js.Any = js.native
  var mViewFlags: scala.Double = js.native
  var mWindowAttachCount: js.Any = js.native
  /* private */ def _fireStateChangeToAttribute(oldState: js.Any, newState: js.Any): js.Any = js.native
  /* private */ def _getBinderAttrValue(key: js.Any): js.Any = js.native
  /* private */ def _initAttrObserver(): js.Any = js.native
  /* private */ def _invalidateCache(): js.Any = js.native
  /* private */ def _invalidateCache(invalidateCache: js.Any): js.Any = js.native
  /* private */ def _invalidateRect(l: js.Any, t: js.Any, r: js.Any, b: js.Any): js.Any = js.native
  /* protected */ def _syncBoundAndScrollToElement(): scala.Unit = js.native
  /* protected */ def _syncMatrixToElement(): scala.Unit = js.native
  def addFocusables(views: androiduixLib.javaNs.utilNs.ArrayList[View], direction: scala.Double): scala.Unit = js.native
  def addFocusables(
    views: androiduixLib.javaNs.utilNs.ArrayList[View],
    direction: scala.Double,
    focusableMode: scala.Double
  ): scala.Unit = js.native
  def addOnAttachStateChangeListener(listener: androiduixLib.androidNs.viewNs.ViewNs.OnAttachStateChangeListener): scala.Unit = js.native
  def addOnLayoutChangeListener(listener: androiduixLib.androidNs.viewNs.ViewNs.OnLayoutChangeListener): scala.Unit = js.native
  def addTouchables(views: androiduixLib.javaNs.utilNs.ArrayList[View]): scala.Unit = js.native
  def assignParent(parent: ViewParent): scala.Unit = js.native
  def awakenScrollBars(): scala.Boolean = js.native
  def awakenScrollBars(startDelay: scala.Double): scala.Boolean = js.native
  def awakenScrollBars(startDelay: scala.Double, invalidate: scala.Boolean): scala.Boolean = js.native
  def bringToFront(): scala.Unit = js.native
  def buildDrawingCache(): scala.Unit = js.native
  def buildDrawingCache(autoScale: scala.Boolean): scala.Unit = js.native
  def callOnClick(): scala.Boolean = js.native
  def canScrollHorizontally(direction: scala.Double): scala.Boolean = js.native
  def canScrollVertically(direction: scala.Double): scala.Boolean = js.native
  def cancelLongPress(): scala.Unit = js.native
  def cancelPendingInputEvents(): scala.Unit = js.native
  /* private */ def checkForLongClick(): js.Any = js.native
  /* private */ def checkForLongClick(delayOffset: js.Any): js.Any = js.native
  def cleanupDraw(): scala.Unit = js.native
  def clearAnimation(): scala.Unit = js.native
  def clearFocus(): scala.Unit = js.native
  def clearFocusInternal(propagate: scala.Boolean, refocus: scala.Boolean): scala.Unit = js.native
  /* protected */ def computeHorizontalScrollExtent(): scala.Double = js.native
  /* protected */ def computeHorizontalScrollOffset(): scala.Double = js.native
  /* protected */ def computeHorizontalScrollRange(): scala.Double = js.native
  /* private */ def computeOpaqueFlags(): js.Any = js.native
  def computeScroll(): scala.Unit = js.native
  /* protected */ def computeVerticalScrollExtent(): scala.Double = js.native
  /* protected */ def computeVerticalScrollOffset(): scala.Double = js.native
  /* protected */ def computeVerticalScrollRange(): scala.Double = js.native
  /* protected */ def createClassAttrBinder(): androiduixLib.androiduiNs.attrNs.AttrBinderNs.ClassBinderMap = js.native
  def debug(): scala.Unit = js.native
  def debug(depth: scala.Double): scala.Unit = js.native
  /* protected */ def dependOnDebugLayout(): scala.Boolean = js.native
  def destroyDrawingCache(): scala.Unit = js.native
  def dispatchAttachedToWindow(info: androiduixLib.androidNs.viewNs.ViewNs.AttachInfo, visibility: scala.Double): scala.Unit = js.native
  def dispatchCancelPendingInputEvents(): scala.Unit = js.native
  def dispatchDetachedFromWindow(): scala.Unit = js.native
  def dispatchDisplayHint(hint: scala.Double): scala.Unit = js.native
  /* protected */ def dispatchDraw(canvas: androiduixLib.androidNs.graphicsNs.Canvas): scala.Unit = js.native
  def dispatchFinishTemporaryDetach(): scala.Unit = js.native
  def dispatchGenericMotionEvent(event: MotionEvent): scala.Boolean = js.native
  /* private */ def dispatchGenericMotionEventInternal(event: js.Any): js.Any = js.native
  def dispatchGenericPointerEvent(event: MotionEvent): scala.Boolean = js.native
  def dispatchKeyEvent(event: KeyEvent): scala.Boolean = js.native
  def dispatchSetActivated(activated: scala.Boolean): scala.Unit = js.native
  def dispatchSetPressed(pressed: scala.Boolean): scala.Unit = js.native
  def dispatchSetSelected(selected: scala.Boolean): scala.Unit = js.native
  def dispatchStartTemporaryDetach(): scala.Unit = js.native
  def dispatchTouchEvent(event: MotionEvent): scala.Boolean = js.native
  def dispatchUnhandledMove(focused: View, direction: scala.Double): scala.Boolean = js.native
  def dispatchVisibilityChanged(changedView: View, visibility: scala.Double): scala.Unit = js.native
  def dispatchWindowFocusChanged(hasFocus: scala.Boolean): scala.Unit = js.native
  def dispatchWindowVisibilityChanged(visibility: scala.Double): scala.Unit = js.native
  def draw(canvas: androiduixLib.androidNs.graphicsNs.Canvas): scala.Unit = js.native
  /* private */ def drawAnimation(parent: js.Any, drawingTime: js.Any, a: js.Any): js.Any = js.native
  /* private */ def drawAnimation(parent: js.Any, drawingTime: js.Any, a: js.Any, scalingRequired: js.Any): js.Any = js.native
  /* protected */ def drawFromParent(canvas: androiduixLib.androidNs.graphicsNs.Canvas, parent: ViewGroup, drawingTime: scala.Double): scala.Boolean = js.native
  /* private */ def drawShadow(canvas: js.Any): js.Any = js.native
  @JSName("drawableSizeChange")
  def drawableSizeChange_MView(who: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit = js.native
  /* protected */ def drawableStateChanged(): scala.Unit = js.native
  def ensureTransformationInfo(): scala.Unit = js.native
  def findFocus(): View = js.native
  def findUserSetNextFocus(root: View, direction: scala.Double): View = js.native
  def findViewById(id: java.lang.String): View = js.native
  def findViewByPredicate(predicate: androiduixLib.androidNs.viewNs.ViewNs.Predicate[View]): View = js.native
  def findViewByPredicateInsideOut(start: View, predicate: androiduixLib.androidNs.viewNs.ViewNs.Predicate[View]): View = js.native
  /* protected */ def findViewByPredicateTraversal(predicate: androiduixLib.androidNs.viewNs.ViewNs.Predicate[View], childToSkip: View): View = js.native
  /* private */ def findViewInsideOutShouldExist(root: js.Any, id: js.Any): js.Any = js.native
  /* protected */ def findViewTraversal(id: java.lang.String): View = js.native
  def findViewWithTag(tag: js.Any): View = js.native
  /* protected */ def findViewWithTagTraversal(tag: js.Any): View = js.native
  def focusSearch(direction: scala.Double): View = js.native
  def forceLayout(): scala.Unit = js.native
  def getAlpha(): scala.Double = js.native
  def getAnimation(): androiduixLib.androidNs.viewNs.animationNs.Animation = js.native
  def getBackground(): androiduixLib.androidNs.graphicsNs.drawableNs.Drawable = js.native
  def getBaseline(): scala.Double = js.native
  def getBottom(): scala.Double = js.native
  /* protected */ def getBottomFadingEdgeStrength(): scala.Double = js.native
  def getClipBounds(): androiduixLib.androidNs.graphicsNs.Rect = js.native
  def getContext(): androiduixLib.androidNs.contentNs.Context = js.native
  def getCornerRadiusBottomLeft(): scala.Double = js.native
  def getCornerRadiusBottomRight(): scala.Double = js.native
  def getCornerRadiusTopLeft(): scala.Double = js.native
  def getCornerRadiusTopRight(): scala.Double = js.native
  def getDrawableState(): js.Array[scala.Double] = js.native
  def getDrawingCache(): androiduixLib.androidNs.graphicsNs.Canvas = js.native
  def getDrawingCache(autoScale: scala.Boolean): androiduixLib.androidNs.graphicsNs.Canvas = js.native
  def getDrawingCacheBackgroundColor(): scala.Double = js.native
  def getDrawingRect(outRect: androiduixLib.androidNs.graphicsNs.Rect): scala.Unit = js.native
  def getDrawingTime(): scala.Double = js.native
  /* private */ def getFinalAlpha(): js.Any = js.native
  def getFocusables(direction: scala.Double): androiduixLib.javaNs.utilNs.ArrayList[View] = js.native
  def getFocusedRect(r: androiduixLib.androidNs.graphicsNs.Rect): scala.Unit = js.native
  def getGlobalVisibleRect(r: androiduixLib.androidNs.graphicsNs.Rect): scala.Boolean = js.native
  def getGlobalVisibleRect(r: androiduixLib.androidNs.graphicsNs.Rect, globalOffset: androiduixLib.androidNs.graphicsNs.Point): scala.Boolean = js.native
  def getHandler(): androiduixLib.androidNs.osNs.Handler = js.native
  def getHeight(): scala.Double = js.native
  def getHitRect(outRect: androiduixLib.androidNs.graphicsNs.Rect): scala.Unit = js.native
  def getHorizontalFadingEdgeLength(): scala.Double = js.native
  def getHorizontalScrollFactor(): scala.Double = js.native
  def getHorizontalScrollbarHeight(): scala.Double = js.native
  def getId(): java.lang.String = js.native
  def getKeyDispatcherState(): androiduixLib.androidNs.viewNs.KeyEventNs.DispatcherState = js.native
  def getLayerType(): scala.Double = js.native
  def getLayoutDirection(): scala.Double = js.native
  def getLayoutParams(): androiduixLib.androidNs.viewNs.ViewGroupNs.LayoutParams = js.native
  def getLeft(): scala.Double = js.native
  /* protected */ def getLeftFadingEdgeStrength(): scala.Double = js.native
  def getListenerInfo(): androiduixLib.androidNs.viewNs.ViewNs.ListenerInfo = js.native
  def getLocationInWindow(location: js.Array[scala.Double]): scala.Unit = js.native
  def getLocationOnScreen(location: js.Array[scala.Double]): scala.Unit = js.native
  def getMatrix(): androiduixLib.androidNs.graphicsNs.Matrix = js.native
  def getMeasuredHeight(): scala.Double = js.native
  def getMeasuredHeightAndState(): scala.Double = js.native
  def getMeasuredState(): scala.Double = js.native
  def getMeasuredWidth(): scala.Double = js.native
  def getMeasuredWidthAndState(): scala.Double = js.native
  def getMinimumHeight(): scala.Double = js.native
  def getMinimumWidth(): scala.Double = js.native
  def getNextFocusDownId(): java.lang.String = js.native
  def getNextFocusForwardId(): java.lang.String = js.native
  def getNextFocusLeftId(): java.lang.String = js.native
  def getNextFocusRightId(): java.lang.String = js.native
  def getNextFocusUpId(): java.lang.String = js.native
  def getOnFocusChangeListener(): androiduixLib.androidNs.viewNs.ViewNs.OnFocusChangeListener = js.native
  def getOverScrollMode(): scala.Double = js.native
  def getPaddingBottom(): scala.Double = js.native
  def getPaddingLeft(): scala.Double = js.native
  def getPaddingRight(): scala.Double = js.native
  def getPaddingTop(): scala.Double = js.native
  def getParent(): ViewParent = js.native
  def getPivotX(): scala.Double = js.native
  def getPivotY(): scala.Double = js.native
  def getResources(): androiduixLib.androidNs.contentNs.resNs.Resources = js.native
  def getRight(): scala.Double = js.native
  /* protected */ def getRightFadingEdgeStrength(): scala.Double = js.native
  def getRootView(): View = js.native
  def getRotation(): scala.Double = js.native
  def getRotationX(): scala.Double = js.native
  def getRotationY(): scala.Double = js.native
  def getScaleX(): scala.Double = js.native
  def getScaleY(): scala.Double = js.native
  def getScrollBarDefaultDelayBeforeFade(): scala.Double = js.native
  def getScrollBarFadeDuration(): scala.Double = js.native
  def getScrollBarSize(): scala.Double = js.native
  /* private */ def getScrollCache(): js.Any = js.native
  def getScrollX(): scala.Double = js.native
  def getScrollY(): scala.Double = js.native
  def getSuggestedMinimumHeight(): scala.Double = js.native
  def getSuggestedMinimumWidth(): scala.Double = js.native
  def getTag(): js.Any = js.native
  def getTextAlignment(): scala.Double = js.native
  def getTextDirection(): scala.Double = js.native
  def getTop(): scala.Double = js.native
  /* protected */ def getTopFadingEdgeStrength(): scala.Double = js.native
  def getTouchDelegate(): TouchDelegate = js.native
  def getTouchables(): androiduixLib.javaNs.utilNs.ArrayList[View] = js.native
  def getTransitionAlpha(): scala.Double = js.native
  def getTranslationX(): scala.Double = js.native
  def getTranslationY(): scala.Double = js.native
  def getVerticalFadingEdgeLength(): scala.Double = js.native
  def getVerticalScrollFactor(): scala.Double = js.native
  def getVerticalScrollbarWidth(): scala.Double = js.native
  def getViewRootImpl(): ViewRootImpl = js.native
  def getViewTreeObserver(): ViewTreeObserver = js.native
  def getVisibility(): scala.Double = js.native
  def getWidth(): scala.Double = js.native
  def getWindowAttachCount(): scala.Double = js.native
  def getWindowVisibility(): scala.Double = js.native
  def getWindowVisibleDisplayFrame(outRect: androiduixLib.androidNs.graphicsNs.Rect): scala.Unit = js.native
  def getX(): scala.Double = js.native
  def getY(): scala.Double = js.native
  def handleFocusGainInternal(direction: scala.Double, previouslyFocusedRect: androiduixLib.androidNs.graphicsNs.Rect): scala.Unit = js.native
  /* private */ def hasAncestorThatBlocksDescendantFocus(): js.Any = js.native
  def hasFocus(): scala.Boolean = js.native
  def hasFocusable(): scala.Boolean = js.native
  def hasIdentityMatrix(): scala.Boolean = js.native
  def hasOnClickListeners(): scala.Boolean = js.native
  def hasOpaqueScrollbars(): scala.Boolean = js.native
  def hasOverlappingRendering(): scala.Boolean = js.native
  def hasTransientState(): scala.Boolean = js.native
  def hasWindowFocus(): scala.Boolean = js.native
  /* protected */ def initBindAttr(): scala.Unit = js.native
  /* protected */ def initBindElement(): scala.Unit = js.native
  /* protected */ def initBindElement(bindElement: stdLib.HTMLElement): scala.Unit = js.native
  def initScrollCache(): scala.Unit = js.native
  /* private */ def initialAwakenScrollBars(): js.Any = js.native
  def initializeScrollbars(): scala.Unit = js.native
  def initializeScrollbars(a: androiduixLib.androidNs.contentNs.resNs.TypedArray): scala.Unit = js.native
  def invalidate(): js.Any = js.native
  def invalidate(dirty: androiduixLib.androidNs.graphicsNs.Rect): js.Any = js.native
  def invalidate(invalidateCache: scala.Boolean): js.Any = js.native
  def invalidate(l: scala.Double, t: scala.Double, r: scala.Double, b: scala.Double): js.Any = js.native
  /* CompleteClass */
  override def invalidateDrawable(who: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit = js.native
  def invalidateParentCaches(): scala.Unit = js.native
  def invalidateParentIfNeeded(): scala.Unit = js.native
  def invalidateViewProperty(invalidateParent: scala.Boolean, forceRedraw: scala.Boolean): scala.Unit = js.native
  def isActivated(): scala.Boolean = js.native
  def isAttachedToWindow(): scala.Boolean = js.native
  def isClickable(): scala.Boolean = js.native
  def isDirty(): scala.Boolean = js.native
  def isDrawingCacheEnabled(): scala.Boolean = js.native
  def isEnabled(): scala.Boolean = js.native
  def isFocusable(): scala.Boolean = js.native
  def isFocusableInTouchMode(): scala.Boolean = js.native
  def isFocused(): scala.Boolean = js.native
  def isHardwareAccelerated(): scala.Boolean = js.native
  def isHorizontalScrollBarEnabled(): scala.Boolean = js.native
  def isInEditMode(): scala.Boolean = js.native
  def isInLayout(): scala.Boolean = js.native
  def isInScrollingContainer(): scala.Boolean = js.native
  def isInTouchMode(): scala.Boolean = js.native
  def isLaidOut(): scala.Boolean = js.native
  def isLayoutRequested(): scala.Boolean = js.native
  def isLayoutRtl(): scala.Boolean = js.native
  def isLongClickable(): scala.Boolean = js.native
  def isOpaque(): scala.Boolean = js.native
  def isPressed(): scala.Boolean = js.native
  def isRootNamespace(): scala.Boolean = js.native
  def isScrollContainer(): scala.Boolean = js.native
  def isScrollbarFadingEnabled(): scala.Boolean = js.native
  def isSelected(): scala.Boolean = js.native
  def isShown(): scala.Boolean = js.native
  def isVerticalScrollBarEnabled(): scala.Boolean = js.native
  def isVerticalScrollBarHidden(): scala.Boolean = js.native
  /* protected */ def isVisibleToUser(): scala.Boolean = js.native
  /* protected */ def isVisibleToUser(boundInView: androiduixLib.androidNs.graphicsNs.Rect): scala.Boolean = js.native
  def jumpDrawablesToCurrentState(): scala.Unit = js.native
  def layout(l: scala.Double, t: scala.Double, r: scala.Double, b: scala.Double): scala.Unit = js.native
  def measure(widthMeasureSpec: scala.Double, heightMeasureSpec: scala.Double): scala.Unit = js.native
  def notifyGlobalFocusCleared(oldFocus: View): scala.Unit = js.native
  def offsetLeftAndRight(offset: scala.Double): scala.Unit = js.native
  def offsetTopAndBottom(offset: scala.Double): scala.Unit = js.native
  /* protected */ def onAnimationEnd(): scala.Unit = js.native
  /* protected */ def onAnimationStart(): scala.Unit = js.native
  /* protected */ def onAttachedToWindow(): scala.Unit = js.native
  /* private */ def onBindElementAttributeChanged(attributeName: js.Any, oldVal: js.Any, newVal: js.Any): js.Any = js.native
  def onCancelPendingInputEvents(): scala.Unit = js.native
  /* protected */ def onCreateDrawableState(extraSpace: scala.Double): js.Array[scala.Double] = js.native
  /* protected */ def onDetachedFromWindow(): scala.Unit = js.native
  def onDisplayHint(hint: scala.Double): scala.Unit = js.native
  /* protected */ def onDraw(canvas: androiduixLib.androidNs.graphicsNs.Canvas): scala.Unit = js.native
  def onDrawHorizontalScrollBar(
    canvas: androiduixLib.androidNs.graphicsNs.Canvas,
    scrollBar: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable,
    l: scala.Double,
    t: scala.Double,
    r: scala.Double,
    b: scala.Double
  ): scala.Unit = js.native
  def onDrawScrollBars(canvas: androiduixLib.androidNs.graphicsNs.Canvas): scala.Unit = js.native
  def onDrawVerticalScrollBar(
    canvas: androiduixLib.androidNs.graphicsNs.Canvas,
    scrollBar: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable,
    l: scala.Double,
    t: scala.Double,
    r: scala.Double,
    b: scala.Double
  ): scala.Unit = js.native
  def onFilterTouchEventForSecurity(event: MotionEvent): scala.Boolean = js.native
  /* protected */ def onFinishInflate(): scala.Unit = js.native
  def onFinishTemporaryDetach(): scala.Unit = js.native
  /* protected */ def onFocusChanged(
    gainFocus: scala.Boolean,
    direction: scala.Double,
    previouslyFocusedRect: androiduixLib.androidNs.graphicsNs.Rect
  ): scala.Unit = js.native
  def onFocusLost(): scala.Unit = js.native
  def onGenericMotionEvent(event: MotionEvent): scala.Boolean = js.native
  /* CompleteClass */
  override def onKeyDown(keyCode: scala.Double, event: KeyEvent): scala.Boolean = js.native
  /* CompleteClass */
  override def onKeyLongPress(keyCode: scala.Double, event: KeyEvent): scala.Boolean = js.native
  /* CompleteClass */
  override def onKeyUp(keyCode: scala.Double, event: KeyEvent): scala.Boolean = js.native
  /* protected */ def onLayout(
    changed: scala.Boolean,
    left: scala.Double,
    top: scala.Double,
    right: scala.Double,
    bottom: scala.Double
  ): scala.Unit = js.native
  /* protected */ def onMeasure(widthMeasureSpec: scala.Double, heightMeasureSpec: scala.Double): scala.Unit = js.native
  /* protected */ def onOverScrolled(scrollX: scala.Double, scrollY: scala.Double, clampedX: scala.Boolean, clampedY: scala.Boolean): scala.Unit = js.native
  def onScrollChanged(l: scala.Double, t: scala.Double, oldl: scala.Double, oldt: scala.Double): scala.Unit = js.native
  /* protected */ def onSetAlpha(alpha: scala.Double): scala.Boolean = js.native
  /* protected */ def onSizeChanged(w: scala.Double, h: scala.Double, oldw: scala.Double, oldh: scala.Double): scala.Unit = js.native
  def onStartTemporaryDetach(): scala.Unit = js.native
  def onTouchEvent(event: MotionEvent): scala.Boolean = js.native
  /* protected */ def onVisibilityChanged(changedView: View, visibility: scala.Double): scala.Unit = js.native
  def onWindowFocusChanged(hasWindowFocus: scala.Boolean): scala.Unit = js.native
  def onWindowVisibilityChanged(visibility: scala.Double): scala.Unit = js.native
  /* protected */ def overScrollBy(
    deltaX: scala.Double,
    deltaY: scala.Double,
    scrollX: scala.Double,
    scrollY: scala.Double,
    scrollRangeX: scala.Double,
    scrollRangeY: scala.Double,
    maxOverScrollX: scala.Double,
    maxOverScrollY: scala.Double,
    isTouchEvent: scala.Boolean
  ): scala.Boolean = js.native
  def performButtonActionOnTouchDown(event: MotionEvent): scala.Boolean = js.native
  def performClick(): scala.Boolean = js.native
  def performClick(event: MotionEvent): scala.Boolean = js.native
  def performHapticFeedback(feedbackConstant: scala.Double): scala.Boolean = js.native
  def performLongClick(): scala.Boolean = js.native
  def playSoundEffect(soundConstant: scala.Double): scala.Unit = js.native
  def pointInView(localX: scala.Double, localY: scala.Double): scala.Boolean = js.native
  def pointInView(localX: scala.Double, localY: scala.Double, slop: scala.Double): scala.Boolean = js.native
  def post(action: androiduixLib.javaNs.langNs.Runnable): scala.Boolean = js.native
  def postDelayed(action: androiduixLib.javaNs.langNs.Runnable, delayMillis: scala.Double): scala.Boolean = js.native
  def postInvalidate(): scala.Unit = js.native
  def postInvalidate(l: scala.Double): scala.Unit = js.native
  def postInvalidate(l: scala.Double, t: scala.Double): scala.Unit = js.native
  def postInvalidate(l: scala.Double, t: scala.Double, r: scala.Double): scala.Unit = js.native
  def postInvalidate(l: scala.Double, t: scala.Double, r: scala.Double, b: scala.Double): scala.Unit = js.native
  def postInvalidateDelayed(delayMilliseconds: scala.Double): scala.Unit = js.native
  def postInvalidateDelayed(delayMilliseconds: scala.Double, left: scala.Double): scala.Unit = js.native
  def postInvalidateDelayed(delayMilliseconds: scala.Double, left: scala.Double, top: scala.Double): scala.Unit = js.native
  def postInvalidateDelayed(delayMilliseconds: scala.Double, left: scala.Double, top: scala.Double, right: scala.Double): scala.Unit = js.native
  def postInvalidateDelayed(
    delayMilliseconds: scala.Double,
    left: scala.Double,
    top: scala.Double,
    right: scala.Double,
    bottom: scala.Double
  ): scala.Unit = js.native
  def postInvalidateOnAnimation(): scala.Unit = js.native
  def postInvalidateOnAnimation(left: scala.Double): scala.Unit = js.native
  def postInvalidateOnAnimation(left: scala.Double, top: scala.Double): scala.Unit = js.native
  def postInvalidateOnAnimation(left: scala.Double, top: scala.Double, right: scala.Double): scala.Unit = js.native
  def postInvalidateOnAnimation(left: scala.Double, top: scala.Double, right: scala.Double, bottom: scala.Double): scala.Unit = js.native
  def postOnAnimation(action: androiduixLib.javaNs.langNs.Runnable): scala.Boolean = js.native
  def postOnAnimationDelayed(action: androiduixLib.javaNs.langNs.Runnable, delayMillis: scala.Double): scala.Boolean = js.native
  def refreshDrawableState(): scala.Unit = js.native
  def removeCallbacks(action: androiduixLib.javaNs.langNs.Runnable): scala.Boolean = js.native
  /* private */ def removeLongPressCallback(): js.Any = js.native
  def removeOnAttachStateChangeListener(listener: androiduixLib.androidNs.viewNs.ViewNs.OnAttachStateChangeListener): scala.Unit = js.native
  def removeOnLayoutChangeListener(listener: androiduixLib.androidNs.viewNs.ViewNs.OnLayoutChangeListener): scala.Unit = js.native
  /* private */ def removePerformClickCallback(): js.Any = js.native
  /* private */ def removeTapCallback(): js.Any = js.native
  /* private */ def removeUnsetPressCallback(): js.Any = js.native
  def requestFocus(): scala.Boolean = js.native
  def requestFocus(direction: scala.Double): scala.Boolean = js.native
  def requestFocus(direction: scala.Double, previouslyFocusedRect: js.Any): scala.Boolean = js.native
  def requestFocusFromTouch(): scala.Boolean = js.native
  /* private */ def requestFocusNoSearch(direction: js.Any, previouslyFocusedRect: js.Any): js.Any = js.native
  def requestLayout(): scala.Unit = js.native
  def requestRectangleOnScreen(rectangle: androiduixLib.androidNs.graphicsNs.Rect): scala.Boolean = js.native
  def requestRectangleOnScreen(rectangle: androiduixLib.androidNs.graphicsNs.Rect, immediate: scala.Boolean): scala.Boolean = js.native
  def requestSyncBoundToElement(): scala.Unit = js.native
  def requestSyncBoundToElement(immediately: scala.Boolean): scala.Unit = js.native
  def resetPressedState(): scala.Unit = js.native
  def resolveDrawables(): scala.Unit = js.native
  def resolvePadding(): scala.Unit = js.native
  def rootViewRequestFocus(): scala.Boolean = js.native
  /* CompleteClass */
  override def scheduleDrawable(
    who: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable,
    what: androiduixLib.javaNs.langNs.Runnable,
    when: scala.Double
  ): scala.Unit = js.native
  def scrollBy(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def setActivated(activated: scala.Boolean): scala.Unit = js.native
  def setAlpha(alpha: scala.Double): scala.Unit = js.native
  def setAlphaNoInvalidation(alpha: scala.Double): scala.Boolean = js.native
  def setAnimation(animation: androiduixLib.androidNs.viewNs.animationNs.Animation): scala.Unit = js.native
  def setBackground(background: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit = js.native
  def setBackgroundColor(color: scala.Double): scala.Unit = js.native
  def setBackgroundDrawable(background: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit = js.native
  def setBottom(bottom: scala.Double): scala.Unit = js.native
  def setClickable(clickable: scala.Boolean): scala.Unit = js.native
  def setClipBounds(clipBounds: androiduixLib.androidNs.graphicsNs.Rect): scala.Unit = js.native
  def setCornerRadius(radiusTopLeft: scala.Double): scala.Unit = js.native
  def setCornerRadius(radiusTopLeft: scala.Double, radiusTopRight: scala.Double): scala.Unit = js.native
  def setCornerRadius(radiusTopLeft: scala.Double, radiusTopRight: scala.Double, radiusBottomRight: scala.Double): scala.Unit = js.native
  def setCornerRadius(
    radiusTopLeft: scala.Double,
    radiusTopRight: scala.Double,
    radiusBottomRight: scala.Double,
    radiusBottomLeft: scala.Double
  ): scala.Unit = js.native
  def setCornerRadiusBottomLeft(value: scala.Double): scala.Unit = js.native
  def setCornerRadiusBottomRight(value: scala.Double): scala.Unit = js.native
  def setCornerRadiusTopLeft(value: scala.Double): scala.Unit = js.native
  def setCornerRadiusTopRight(value: scala.Double): scala.Unit = js.native
  def setDrawingCacheBackgroundColor(color: scala.Double): scala.Unit = js.native
  def setDrawingCacheEnabled(enabled: scala.Boolean): scala.Unit = js.native
  def setEnabled(enabled: scala.Boolean): scala.Unit = js.native
  def setFadingEdgeLength(length: scala.Double): scala.Unit = js.native
  def setFlags(flags: scala.Double, mask: scala.Double): scala.Unit = js.native
  def setFocusable(focusable: scala.Boolean): scala.Unit = js.native
  def setFocusableInTouchMode(focusableInTouchMode: scala.Boolean): scala.Unit = js.native
  /* protected */ def setFrame(left: scala.Double, top: scala.Double, right: scala.Double, bottom: scala.Double): scala.Boolean = js.native
  def setHasTransientState(hasTransientState: scala.Boolean): scala.Unit = js.native
  def setHorizontalFadingEdgeEnabled(enable: scala.Boolean): scala.Unit = js.native
  def setHorizontalScrollBarEnabled(horizontalScrollBarEnabled: scala.Boolean): scala.Unit = js.native
  def setHorizontalScrollbarPosition(position: scala.Double): scala.Unit = js.native
  def setId(id: java.lang.String): scala.Unit = js.native
  def setIsRootNamespace(isRoot: scala.Boolean): scala.Unit = js.native
  def setLayerType(layerType: scala.Double): scala.Unit = js.native
  def setLayoutDirection(layoutDirection: scala.Double): scala.Unit = js.native
  def setLayoutParams(params: androiduixLib.androidNs.viewNs.ViewGroupNs.LayoutParams): scala.Unit = js.native
  def setLeft(left: scala.Double): scala.Unit = js.native
  def setLongClickable(longClickable: scala.Boolean): scala.Unit = js.native
  def setMeasuredDimension(measuredWidth: js.Any, measuredHeight: js.Any): scala.Unit = js.native
  def setMinimumHeight(minHeight: js.Any): scala.Unit = js.native
  def setMinimumWidth(minWidth: js.Any): scala.Unit = js.native
  def setNextFocusDownId(nextFocusDownId: java.lang.String): scala.Unit = js.native
  def setNextFocusForwardId(nextFocusForwardId: java.lang.String): scala.Unit = js.native
  def setNextFocusLeftId(nextFocusLeftId: java.lang.String): scala.Unit = js.native
  def setNextFocusRightId(nextFocusRightId: java.lang.String): scala.Unit = js.native
  def setNextFocusUpId(nextFocusUpId: java.lang.String): scala.Unit = js.native
  def setOnClickListener(l: androiduixLib.androidNs.viewNs.ViewNs.OnClickListener): scala.Unit = js.native
  def setOnClickListener(l: js.Function1[/* v */ this.type, scala.Unit]): scala.Unit = js.native
  /* private */ def setOnClickListenerByAttrValueString(onClickAttrString: js.Any): js.Any = js.native
  def setOnFocusChangeListener(l: androiduixLib.androidNs.viewNs.ViewNs.OnFocusChangeListener): scala.Unit = js.native
  def setOnFocusChangeListener(l: js.Function2[/* v */ this.type, /* hasFocus */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def setOnKeyListener(l: androiduixLib.androidNs.viewNs.ViewNs.OnKeyListener): scala.Unit = js.native
  def setOnKeyListener(l: js.Function3[/* v */ this.type, /* keyCode */ scala.Double, /* event */ KeyEvent, scala.Unit]): scala.Unit = js.native
  def setOnLongClickListener(l: androiduixLib.androidNs.viewNs.ViewNs.OnLongClickListener): scala.Unit = js.native
  def setOnLongClickListener(l: js.Function1[/* v */ this.type, scala.Boolean]): scala.Unit = js.native
  def setOnTouchListener(l: androiduixLib.androidNs.viewNs.ViewNs.OnTouchListener): scala.Unit = js.native
  def setOnTouchListener(l: js.Function2[/* v */ this.type, /* event */ MotionEvent, scala.Unit]): scala.Unit = js.native
  def setOverScrollMode(overScrollMode: scala.Double): scala.Unit = js.native
  def setPadding(left: scala.Double, top: scala.Double, right: scala.Double, bottom: scala.Double): scala.Unit = js.native
  def setPaddingBottom(bottom: scala.Double): scala.Unit = js.native
  def setPaddingLeft(left: scala.Double): scala.Unit = js.native
  def setPaddingRight(right: scala.Double): scala.Unit = js.native
  def setPaddingTop(top: scala.Double): scala.Unit = js.native
  def setPivotX(pivotX: scala.Double): scala.Unit = js.native
  def setPivotY(pivotY: scala.Double): scala.Unit = js.native
  def setPressed(pressed: scala.Boolean): scala.Unit = js.native
  def setRight(right: scala.Double): scala.Unit = js.native
  def setRotation(rotation: scala.Double): scala.Unit = js.native
  def setRotationX(rotationX: scala.Double): scala.Unit = js.native
  def setRotationY(rotationY: scala.Double): scala.Unit = js.native
  def setScaleX(scaleX: scala.Double): scala.Unit = js.native
  def setScaleY(scaleY: scala.Double): scala.Unit = js.native
  def setScrollBarDefaultDelayBeforeFade(scrollBarDefaultDelayBeforeFade: scala.Double): scala.Unit = js.native
  def setScrollBarFadeDuration(scrollBarFadeDuration: scala.Double): scala.Unit = js.native
  def setScrollBarSize(scrollBarSize: scala.Double): scala.Unit = js.native
  def setScrollBarStyle(position: scala.Double): scala.Unit = js.native
  def setScrollContainer(isScrollContainer: scala.Boolean): scala.Unit = js.native
  def setScrollX(value: scala.Double): scala.Unit = js.native
  def setScrollY(value: scala.Double): scala.Unit = js.native
  def setScrollbarFadingEnabled(fadeScrollbars: scala.Boolean): scala.Unit = js.native
  def setSelected(selected: scala.Boolean): scala.Unit = js.native
  def setShadowView(radius: scala.Double, dx: scala.Double, dy: scala.Double, color: scala.Double): scala.Unit = js.native
  def setTag(tag: js.Any): scala.Unit = js.native
  def setTextAlignment(textAlignment: scala.Double): scala.Unit = js.native
  def setTextDirection(textDirection: scala.Double): scala.Unit = js.native
  def setTop(top: scala.Double): scala.Unit = js.native
  def setTouchDelegate(delegate: TouchDelegate): scala.Unit = js.native
  def setTransitionAlpha(alpha: scala.Double): scala.Unit = js.native
  def setTranslationX(translationX: scala.Double): scala.Unit = js.native
  def setTranslationY(translationY: scala.Double): scala.Unit = js.native
  def setVerticalFadingEdgeEnabled(enable: scala.Boolean): scala.Unit = js.native
  def setVerticalScrollBarEnabled(verticalScrollBarEnabled: scala.Boolean): scala.Unit = js.native
  def setVerticalScrollbarPosition(position: scala.Double): scala.Unit = js.native
  def setVisibility(visibility: scala.Double): scala.Unit = js.native
  def setWillNotCacheDrawing(willNotCacheDrawing: scala.Boolean): scala.Unit = js.native
  def setWillNotDraw(willNotDraw: scala.Boolean): scala.Unit = js.native
  def setX(x: scala.Double): scala.Unit = js.native
  def setY(y: scala.Double): scala.Unit = js.native
  /* private */ def sizeChange(newWidth: js.Any, newHeight: js.Any, oldWidth: js.Any, oldHeight: js.Any): js.Any = js.native
  /* private */ def skipInvalidate(): js.Any = js.native
  def startAnimation(animation: androiduixLib.androidNs.viewNs.animationNs.Animation): scala.Unit = js.native
  def syncVisibleToElement(): scala.Unit = js.native
  def tagName(): java.lang.String = js.native
  def transformRect(rect: androiduixLib.androidNs.graphicsNs.Rect): scala.Unit = js.native
  def unFocus(): scala.Unit = js.native
  def unscheduleDrawable(who: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit = js.native
  /* CompleteClass */
  override def unscheduleDrawable(
    who: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable,
    what: androiduixLib.javaNs.langNs.Runnable
  ): scala.Unit = js.native
  /* private */ def updateMatrix(): js.Any = js.native
  /* protected */ def verifyDrawable(who: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Boolean = js.native
  def willNotCacheDrawing(): scala.Boolean = js.native
  def willNotDraw(): scala.Boolean = js.native
}

/* static members */
@JSGlobal("android.view.View")
@js.native
object View extends js.Object {
  var AndroidViewProperty: java.lang.String = js.native
  var CLICKABLE: scala.Double = js.native
  var DBG: scala.Boolean = js.native
  var DISABLED: scala.Double = js.native
  var DRAWING_CACHE_ENABLED: scala.Double = js.native
  var DRAW_MASK: scala.Double = js.native
  var DUPLICATE_PARENT_STATE: scala.Double = js.native
  var EMPTY_STATE_SET: js.Array[scala.Double] = js.native
  var ENABLED: scala.Double = js.native
  var ENABLED_FOCUSED_SELECTED_STATE_SET: js.Array[scala.Double] = js.native
  var ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET: js.Array[scala.Double] = js.native
  var ENABLED_FOCUSED_STATE_SET: js.Array[scala.Double] = js.native
  var ENABLED_FOCUSED_WINDOW_FOCUSED_STATE_SET: js.Array[scala.Double] = js.native
  var ENABLED_MASK: scala.Double = js.native
  var ENABLED_SELECTED_STATE_SET: js.Array[scala.Double] = js.native
  var ENABLED_SELECTED_WINDOW_FOCUSED_STATE_SET: js.Array[scala.Double] = js.native
  var ENABLED_STATE_SET: js.Array[scala.Double] = js.native
  var ENABLED_WINDOW_FOCUSED_STATE_SET: js.Array[scala.Double] = js.native
  var FOCUSABLE: js.Any = js.native
  var FOCUSABLES_ALL: scala.Double = js.native
  var FOCUSABLES_TOUCH_MODE: scala.Double = js.native
  var FOCUSABLE_IN_TOUCH_MODE: js.Any = js.native
  var FOCUSABLE_MASK: js.Any = js.native
  var FOCUSED_SELECTED_STATE_SET: js.Array[scala.Double] = js.native
  var FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET: js.Array[scala.Double] = js.native
  var FOCUSED_STATE_SET: js.Array[scala.Double] = js.native
  var FOCUSED_WINDOW_FOCUSED_STATE_SET: js.Array[scala.Double] = js.native
  var FOCUS_BACKWARD: scala.Double = js.native
  var FOCUS_DOWN: scala.Double = js.native
  var FOCUS_FORWARD: scala.Double = js.native
  var FOCUS_LEFT: scala.Double = js.native
  var FOCUS_RIGHT: scala.Double = js.native
  var FOCUS_UP: scala.Double = js.native
  var GONE: scala.Double = js.native
  var INVISIBLE: scala.Double = js.native
  var LAYER_TYPE_NONE: scala.Double = js.native
  var LAYER_TYPE_SOFTWARE: scala.Double = js.native
  var LAYOUT_DIRECTION_INHERIT: scala.Double = js.native
  var LAYOUT_DIRECTION_LOCALE: scala.Double = js.native
  var LAYOUT_DIRECTION_LTR: scala.Double = js.native
  var LAYOUT_DIRECTION_RTL: scala.Double = js.native
  var LONG_CLICKABLE: scala.Double = js.native
  var MEASURED_HEIGHT_STATE_SHIFT: scala.Double = js.native
  var MEASURED_SIZE_MASK: scala.Double = js.native
  var MEASURED_STATE_MASK: scala.Double = js.native
  var MEASURED_STATE_TOO_SMALL: scala.Double = js.native
  var NOT_FOCUSABLE: js.Any = js.native
  var NO_ID: js.Any = js.native
  var OVER_SCROLL_ALWAYS: scala.Double = js.native
  var OVER_SCROLL_IF_CONTENT_SCROLLS: scala.Double = js.native
  var OVER_SCROLL_NEVER: scala.Double = js.native
  var PFLAG2_HAS_TRANSIENT_STATE: scala.Double = js.native
  var PFLAG2_VIEW_QUICK_REJECTED: scala.Double = js.native
  var PFLAG3_CALLED_SUPER: scala.Double = js.native
  var PFLAG3_IS_LAID_OUT: scala.Double = js.native
  var PFLAG3_MEASURE_NEEDED_BEFORE_LAYOUT: scala.Double = js.native
  var PFLAG3_VIEW_IS_ANIMATING_ALPHA: scala.Double = js.native
  var PFLAG3_VIEW_IS_ANIMATING_TRANSFORM: scala.Double = js.native
  var PFLAG_ACTIVATED: scala.Double = js.native
  var PFLAG_ALPHA_SET: scala.Double = js.native
  var PFLAG_ANIMATION_STARTED: scala.Double = js.native
  var PFLAG_AWAKEN_SCROLL_BARS_ON_ATTACH: scala.Double = js.native
  var PFLAG_CANCEL_NEXT_UP_EVENT: scala.Double = js.native
  var PFLAG_DIRTY: scala.Double = js.native
  var PFLAG_DIRTY_MASK: scala.Double = js.native
  var PFLAG_DIRTY_OPAQUE: scala.Double = js.native
  var PFLAG_DRAWABLE_STATE_DIRTY: scala.Double = js.native
  var PFLAG_DRAWING_CACHE_VALID: scala.Double = js.native
  var PFLAG_DRAWN: scala.Double = js.native
  var PFLAG_DRAW_ANIMATION: scala.Double = js.native
  var PFLAG_FOCUSED: scala.Double = js.native
  var PFLAG_FORCE_LAYOUT: scala.Double = js.native
  var PFLAG_HAS_BOUNDS: scala.Double = js.native
  var PFLAG_HOVERED: scala.Double = js.native
  var PFLAG_INVALIDATED: scala.Double = js.native
  var PFLAG_IS_ROOT_NAMESPACE: scala.Double = js.native
  var PFLAG_LAYOUT_REQUIRED: scala.Double = js.native
  var PFLAG_MEASURED_DIMENSION_SET: scala.Double = js.native
  var PFLAG_ONLY_DRAWS_BACKGROUND: scala.Double = js.native
  var PFLAG_OPAQUE_BACKGROUND: scala.Double = js.native
  var PFLAG_OPAQUE_MASK: scala.Double = js.native
  var PFLAG_OPAQUE_SCROLLBARS: scala.Double = js.native
  var PFLAG_PIVOT_EXPLICITLY_SET: scala.Double = js.native
  var PFLAG_PREPRESSED: scala.Double = js.native
  var PFLAG_PRESSED: scala.Double = js.native
  var PFLAG_REQUEST_TRANSPARENT_REGIONS: scala.Double = js.native
  var PFLAG_SCROLL_CONTAINER: scala.Double = js.native
  var PFLAG_SCROLL_CONTAINER_ADDED: scala.Double = js.native
  var PFLAG_SELECTED: scala.Double = js.native
  var PFLAG_SKIP_DRAW: scala.Double = js.native
  var PFLAG_WANTS_FOCUS: scala.Double = js.native
  var PRESSED_ENABLED_FOCUSED_SELECTED_STATE_SET: js.Array[scala.Double] = js.native
  var PRESSED_ENABLED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET: js.Array[scala.Double] = js.native
  var PRESSED_ENABLED_FOCUSED_STATE_SET: js.Array[scala.Double] = js.native
  var PRESSED_ENABLED_FOCUSED_WINDOW_FOCUSED_STATE_SET: js.Array[scala.Double] = js.native
  var PRESSED_ENABLED_SELECTED_STATE_SET: js.Array[scala.Double] = js.native
  var PRESSED_ENABLED_SELECTED_WINDOW_FOCUSED_STATE_SET: js.Array[scala.Double] = js.native
  var PRESSED_ENABLED_STATE_SET: js.Array[scala.Double] = js.native
  var PRESSED_ENABLED_WINDOW_FOCUSED_STATE_SET: js.Array[scala.Double] = js.native
  var PRESSED_FOCUSED_SELECTED_STATE_SET: js.Array[scala.Double] = js.native
  var PRESSED_FOCUSED_SELECTED_WINDOW_FOCUSED_STATE_SET: js.Array[scala.Double] = js.native
  var PRESSED_FOCUSED_STATE_SET: js.Array[scala.Double] = js.native
  var PRESSED_FOCUSED_WINDOW_FOCUSED_STATE_SET: js.Array[scala.Double] = js.native
  var PRESSED_SELECTED_STATE_SET: js.Array[scala.Double] = js.native
  var PRESSED_SELECTED_WINDOW_FOCUSED_STATE_SET: js.Array[scala.Double] = js.native
  var PRESSED_STATE_SET: js.Array[scala.Double] = js.native
  var PRESSED_WINDOW_FOCUSED_STATE_SET: js.Array[scala.Double] = js.native
  var SCROLLBARS_HORIZONTAL: scala.Double = js.native
  var SCROLLBARS_MASK: scala.Double = js.native
  var SCROLLBARS_NONE: scala.Double = js.native
  var SCROLLBARS_VERTICAL: scala.Double = js.native
  var SELECTED_STATE_SET: js.Array[scala.Double] = js.native
  var SELECTED_WINDOW_FOCUSED_STATE_SET: js.Array[scala.Double] = js.native
  var TEXT_ALIGNMENT_CENTER: scala.Double = js.native
  var TEXT_ALIGNMENT_DEFAULT: js.Any = js.native
  var TEXT_ALIGNMENT_GRAVITY: scala.Double = js.native
  var TEXT_ALIGNMENT_INHERIT: scala.Double = js.native
  var TEXT_ALIGNMENT_RESOLVED_DEFAULT: scala.Double = js.native
  var TEXT_ALIGNMENT_TEXT_END: scala.Double = js.native
  var TEXT_ALIGNMENT_TEXT_START: scala.Double = js.native
  var TEXT_ALIGNMENT_VIEW_END: scala.Double = js.native
  var TEXT_ALIGNMENT_VIEW_START: scala.Double = js.native
  var TEXT_DIRECTION_ANY_RTL: scala.Double = js.native
  var TEXT_DIRECTION_DEFAULT: js.Any = js.native
  var TEXT_DIRECTION_FIRST_STRONG: scala.Double = js.native
  var TEXT_DIRECTION_INHERIT: scala.Double = js.native
  var TEXT_DIRECTION_LOCALE: scala.Double = js.native
  var TEXT_DIRECTION_LTR: scala.Double = js.native
  var TEXT_DIRECTION_RESOLVED_DEFAULT: scala.Double = js.native
  var TEXT_DIRECTION_RTL: scala.Double = js.native
  var TempMatrixValue: js.Any = js.native
  var VIEW_LOG_TAG: java.lang.String = js.native
  var VIEW_STATE_ACTIVATED: scala.Double = js.native
  var VIEW_STATE_CHECKED: scala.Double = js.native
  var VIEW_STATE_EMPTY: scala.Double = js.native
  var VIEW_STATE_ENABLED: scala.Double = js.native
  var VIEW_STATE_EXPANDED: scala.Double = js.native
  var VIEW_STATE_FOCUSED: scala.Double = js.native
  var VIEW_STATE_HOVERED: scala.Double = js.native
  var VIEW_STATE_IDS: js.Array[scala.Double] = js.native
  var VIEW_STATE_LAST: scala.Double = js.native
  var VIEW_STATE_MULTILINE: scala.Double = js.native
  var VIEW_STATE_PRESSED: scala.Double = js.native
  var VIEW_STATE_SELECTED: scala.Double = js.native
  var VIEW_STATE_SETS: js.Array[js.Array[scala.Double]] = js.native
  var VIEW_STATE_WINDOW_FOCUSED: scala.Double = js.native
  var VISIBILITY_MASK: scala.Double = js.native
  var VISIBLE: scala.Double = js.native
  var ViewClassAttrBinderClazzMap: js.Any = js.native
  var WILL_NOT_CACHE_DRAWING: scala.Double = js.native
  var WILL_NOT_DRAW: scala.Double = js.native
  var WINDOW_FOCUSED_STATE_SET: js.Array[scala.Double] = js.native
  var _static: js.Any = js.native
  /* private */ def _AttrObserverCallBack(arr: js.Any, observer: js.Any): js.Any = js.native
  def combineMeasuredStates(curState: js.Any, newState: js.Any): scala.Double = js.native
  def getDefaultSize(size: js.Any, measureSpec: js.Any): js.Any = js.native
  def inflate(context: androiduixLib.androidNs.contentNs.Context, xml: java.lang.String): androiduixLib.androidNs.viewNs.View = js.native
  def inflate(
    context: androiduixLib.androidNs.contentNs.Context,
    xml: java.lang.String,
    root: androiduixLib.androidNs.viewNs.ViewGroup
  ): androiduixLib.androidNs.viewNs.View = js.native
  def inflate(context: androiduixLib.androidNs.contentNs.Context, xml: stdLib.HTMLElement): androiduixLib.androidNs.viewNs.View = js.native
  def inflate(
    context: androiduixLib.androidNs.contentNs.Context,
    xml: stdLib.HTMLElement,
    root: androiduixLib.androidNs.viewNs.ViewGroup
  ): androiduixLib.androidNs.viewNs.View = js.native
  def mergeDrawableStates(baseState: js.Array[scala.Double], additionalState: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def resolveSize(size: js.Any, measureSpec: js.Any): scala.Double = js.native
  def resolveSizeAndState(size: js.Any, measureSpec: js.Any, childMeasuredState: js.Any): scala.Double = js.native
}

