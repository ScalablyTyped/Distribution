package typings.androiduix.android.view

import typings.androiduix.android.content.Context
import typings.androiduix.android.content.res.Resources
import typings.androiduix.android.content.res.TypedArray
import typings.androiduix.android.graphics.Canvas
import typings.androiduix.android.graphics.Matrix
import typings.androiduix.android.graphics.Point
import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.graphics.drawable.Drawable.Callback
import typings.androiduix.android.os.Handler
import typings.androiduix.android.view.KeyEvent.DispatcherState
import typings.androiduix.android.view.View.AttachInfo
import typings.androiduix.android.view.View.ListenerInfo
import typings.androiduix.android.view.View.OnAttachStateChangeListener
import typings.androiduix.android.view.View.OnClickListener
import typings.androiduix.android.view.View.OnFocusChangeListener
import typings.androiduix.android.view.View.OnKeyListener
import typings.androiduix.android.view.View.OnLayoutChangeListener
import typings.androiduix.android.view.View.OnLongClickListener
import typings.androiduix.android.view.View.OnTouchListener
import typings.androiduix.android.view.View.Predicate
import typings.androiduix.android.view.View.TransformationInfo
import typings.androiduix.android.view.ViewGroup.LayoutParams
import typings.androiduix.android.view.animation.Animation
import typings.androiduix.android.view.animation.Transformation
import typings.androiduix.androidui.attr.AttrBinder.ClassBinderMap
import typings.androiduix.java_.lang.JavaObject
import typings.androiduix.java_.lang.Runnable
import typings.androiduix.java_.lang.util.concurrent.CopyOnWriteArrayList
import typings.androiduix.java_.util.ArrayList
import typings.std.HTMLElement
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait View
  extends JavaObject
     with Callback
     with typings.androiduix.android.view.KeyEvent.Callback {
  
  var _AttrObserver: js.Any = js.native
  
  var _attrBinder: js.Any = js.native
  
  /* private */ def _fireStateChangeToAttribute(oldState: js.Any, newState: js.Any): js.Any = js.native
  
  /* private */ def _getBinderAttrValue(key: js.Any): js.Any = js.native
  
  /* private */ def _initAttrObserver(): js.Any = js.native
  
  /* private */ def _invalidateCache(invalidateCache: js.Any): js.Any = js.native
  
  /* private */ def _invalidateRect(l: js.Any, t: js.Any, r: js.Any, b: js.Any): js.Any = js.native
  
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
  
  /* protected */ def _syncBoundAndScrollToElement(): Unit = js.native
  
  /* protected */ def _syncMatrixToElement(): Unit = js.native
  
  var _syncToElementImmediatelyLock: js.Any = js.native
  
  var _syncToElementLock: js.Any = js.native
  
  var _syncToElementRun: js.Any = js.native
  
  def addFocusables(views: ArrayList[View], direction: Double): Unit = js.native
  def addFocusables(views: ArrayList[View], direction: Double, focusableMode: Double): Unit = js.native
  
  def addOnAttachStateChangeListener(listener: OnAttachStateChangeListener): Unit = js.native
  
  def addOnLayoutChangeListener(listener: OnLayoutChangeListener): Unit = js.native
  
  def addTouchables(views: ArrayList[View]): Unit = js.native
  
  def assignParent(parent: ViewParent): Unit = js.native
  
  def awakenScrollBars(): Boolean = js.native
  def awakenScrollBars(startDelay: js.UndefOr[scala.Nothing], invalidate: Boolean): Boolean = js.native
  def awakenScrollBars(startDelay: Double): Boolean = js.native
  def awakenScrollBars(startDelay: Double, invalidate: Boolean): Boolean = js.native
  
  var bindElement: HTMLElement = js.native
  
  def bringToFront(): Unit = js.native
  
  def buildDrawingCache(): Unit = js.native
  def buildDrawingCache(autoScale: Boolean): Unit = js.native
  
  def callOnClick(): Boolean = js.native
  
  def canScrollHorizontally(direction: Double): Boolean = js.native
  
  def canScrollVertically(direction: Double): Boolean = js.native
  
  def cancelLongPress(): Unit = js.native
  
  def cancelPendingInputEvents(): Unit = js.native
  
  /* private */ def checkForLongClick(delayOffset: js.Any): js.Any = js.native
  
  def cleanupDraw(): Unit = js.native
  
  def clearAnimation(): Unit = js.native
  
  def clearFocus(): Unit = js.native
  
  def clearFocusInternal(propagate: Boolean, refocus: Boolean): Unit = js.native
  
  /* protected */ def computeHorizontalScrollExtent(): Double = js.native
  
  /* protected */ def computeHorizontalScrollOffset(): Double = js.native
  
  /* protected */ def computeHorizontalScrollRange(): Double = js.native
  
  /* private */ def computeOpaqueFlags(): js.Any = js.native
  
  def computeScroll(): Unit = js.native
  
  /* protected */ def computeVerticalScrollExtent(): Double = js.native
  
  /* protected */ def computeVerticalScrollOffset(): Double = js.native
  
  /* protected */ def computeVerticalScrollRange(): Double = js.native
  
  /* protected */ def createClassAttrBinder(): ClassBinderMap = js.native
  
  def debug(): Unit = js.native
  def debug(depth: Double): Unit = js.native
  
  /* protected */ def dependOnDebugLayout(): Boolean = js.native
  
  def destroyDrawingCache(): Unit = js.native
  
  def dispatchAttachedToWindow(info: AttachInfo, visibility: Double): Unit = js.native
  
  def dispatchCancelPendingInputEvents(): Unit = js.native
  
  def dispatchDetachedFromWindow(): Unit = js.native
  
  def dispatchDisplayHint(hint: Double): Unit = js.native
  
  /* protected */ def dispatchDraw(canvas: Canvas): Unit = js.native
  
  def dispatchFinishTemporaryDetach(): Unit = js.native
  
  def dispatchGenericMotionEvent(event: MotionEvent): Boolean = js.native
  
  /* private */ def dispatchGenericMotionEventInternal(event: js.Any): js.Any = js.native
  
  def dispatchGenericPointerEvent(event: MotionEvent): Boolean = js.native
  
  def dispatchKeyEvent(event: KeyEvent): Boolean = js.native
  
  def dispatchSetActivated(activated: Boolean): Unit = js.native
  
  def dispatchSetPressed(pressed: Boolean): Unit = js.native
  
  def dispatchSetSelected(selected: Boolean): Unit = js.native
  
  def dispatchStartTemporaryDetach(): Unit = js.native
  
  def dispatchTouchEvent(event: MotionEvent): Boolean = js.native
  
  def dispatchUnhandledMove(focused: View, direction: Double): Boolean = js.native
  
  def dispatchVisibilityChanged(changedView: View, visibility: Double): Unit = js.native
  
  def dispatchWindowFocusChanged(hasFocus: Boolean): Unit = js.native
  
  def dispatchWindowVisibilityChanged(visibility: Double): Unit = js.native
  
  def draw(canvas: Canvas): Unit = js.native
  
  /* private */ def drawAnimation(parent: js.Any, drawingTime: js.Any, a: js.Any, scalingRequired: js.Any): js.Any = js.native
  
  /* protected */ def drawFromParent(canvas: Canvas, parent: ViewGroup, drawingTime: Double): Boolean = js.native
  
  /* private */ def drawShadow(canvas: js.Any): js.Any = js.native
  
  @JSName("drawableSizeChange")
  def drawableSizeChange_MView(who: Drawable): Unit = js.native
  
  /* protected */ def drawableStateChanged(): Unit = js.native
  
  def ensureTransformationInfo(): Unit = js.native
  
  def findFocus(): View = js.native
  
  def findUserSetNextFocus(root: View, direction: Double): View = js.native
  
  def findViewById(id: String): View = js.native
  
  def findViewByPredicate(predicate: Predicate[View]): View = js.native
  
  def findViewByPredicateInsideOut(start: View, predicate: Predicate[View]): View = js.native
  
  /* protected */ def findViewByPredicateTraversal(predicate: Predicate[View], childToSkip: View): View = js.native
  
  /* private */ def findViewInsideOutShouldExist(root: js.Any, id: js.Any): js.Any = js.native
  
  /* protected */ def findViewTraversal(id: String): View = js.native
  
  def findViewWithTag(tag: js.Any): View = js.native
  
  /* protected */ def findViewWithTagTraversal(tag: js.Any): View = js.native
  
  def focusSearch(direction: Double): View = js.native
  
  def forceLayout(): Unit = js.native
  
  def getAlpha(): Double = js.native
  
  def getAnimation(): Animation = js.native
  
  def getBackground(): Drawable = js.native
  
  def getBaseline(): Double = js.native
  
  def getBottom(): Double = js.native
  
  /* protected */ def getBottomFadingEdgeStrength(): Double = js.native
  
  def getClipBounds(): Rect = js.native
  
  def getContext(): Context = js.native
  
  def getCornerRadiusBottomLeft(): Double = js.native
  
  def getCornerRadiusBottomRight(): Double = js.native
  
  def getCornerRadiusTopLeft(): Double = js.native
  
  def getCornerRadiusTopRight(): Double = js.native
  
  def getDrawableState(): js.Array[Double] = js.native
  
  def getDrawingCache(): Canvas = js.native
  def getDrawingCache(autoScale: Boolean): Canvas = js.native
  
  def getDrawingCacheBackgroundColor(): Double = js.native
  
  def getDrawingRect(outRect: Rect): Unit = js.native
  
  def getDrawingTime(): Double = js.native
  
  /* private */ def getFinalAlpha(): js.Any = js.native
  
  def getFocusables(direction: Double): ArrayList[View] = js.native
  
  def getFocusedRect(r: Rect): Unit = js.native
  
  def getGlobalVisibleRect(r: Rect): Boolean = js.native
  def getGlobalVisibleRect(r: Rect, globalOffset: Point): Boolean = js.native
  
  def getHandler(): Handler = js.native
  
  def getHeight(): Double = js.native
  
  def getHitRect(outRect: Rect): Unit = js.native
  
  def getHorizontalFadingEdgeLength(): Double = js.native
  
  def getHorizontalScrollFactor(): Double = js.native
  
  def getHorizontalScrollbarHeight(): Double = js.native
  
  def getId(): String = js.native
  
  def getKeyDispatcherState(): DispatcherState = js.native
  
  def getLayerType(): Double = js.native
  
  def getLayoutDirection(): Double = js.native
  
  def getLayoutParams(): LayoutParams = js.native
  
  def getLeft(): Double = js.native
  
  /* protected */ def getLeftFadingEdgeStrength(): Double = js.native
  
  def getListenerInfo(): ListenerInfo = js.native
  
  def getLocationInWindow(location: js.Array[Double]): Unit = js.native
  
  def getLocationOnScreen(location: js.Array[Double]): Unit = js.native
  
  def getMatrix(): Matrix = js.native
  
  def getMeasuredHeight(): Double = js.native
  
  def getMeasuredHeightAndState(): Double = js.native
  
  def getMeasuredState(): Double = js.native
  
  def getMeasuredWidth(): Double = js.native
  
  def getMeasuredWidthAndState(): Double = js.native
  
  def getMinimumHeight(): Double = js.native
  
  def getMinimumWidth(): Double = js.native
  
  def getNextFocusDownId(): String = js.native
  
  def getNextFocusForwardId(): String = js.native
  
  def getNextFocusLeftId(): String = js.native
  
  def getNextFocusRightId(): String = js.native
  
  def getNextFocusUpId(): String = js.native
  
  def getOnFocusChangeListener(): OnFocusChangeListener = js.native
  
  def getOverScrollMode(): Double = js.native
  
  def getPaddingBottom(): Double = js.native
  
  def getPaddingLeft(): Double = js.native
  
  def getPaddingRight(): Double = js.native
  
  def getPaddingTop(): Double = js.native
  
  def getParent(): ViewParent = js.native
  
  def getPivotX(): Double = js.native
  
  def getPivotY(): Double = js.native
  
  def getResources(): Resources = js.native
  
  def getRight(): Double = js.native
  
  /* protected */ def getRightFadingEdgeStrength(): Double = js.native
  
  def getRootView(): View = js.native
  
  def getRotation(): Double = js.native
  
  def getRotationX(): Double = js.native
  
  def getRotationY(): Double = js.native
  
  def getScaleX(): Double = js.native
  
  def getScaleY(): Double = js.native
  
  def getScrollBarDefaultDelayBeforeFade(): Double = js.native
  
  def getScrollBarFadeDuration(): Double = js.native
  
  def getScrollBarSize(): Double = js.native
  
  /* private */ def getScrollCache(): js.Any = js.native
  
  def getScrollX(): Double = js.native
  
  def getScrollY(): Double = js.native
  
  def getSuggestedMinimumHeight(): Double = js.native
  
  def getSuggestedMinimumWidth(): Double = js.native
  
  def getTag(): js.Any = js.native
  
  def getTextAlignment(): Double = js.native
  
  def getTextDirection(): Double = js.native
  
  def getTop(): Double = js.native
  
  /* protected */ def getTopFadingEdgeStrength(): Double = js.native
  
  def getTouchDelegate(): TouchDelegate = js.native
  
  def getTouchables(): ArrayList[View] = js.native
  
  def getTransitionAlpha(): Double = js.native
  
  def getTranslationX(): Double = js.native
  
  def getTranslationY(): Double = js.native
  
  def getVerticalFadingEdgeLength(): Double = js.native
  
  def getVerticalScrollFactor(): Double = js.native
  
  def getVerticalScrollbarWidth(): Double = js.native
  
  def getViewRootImpl(): ViewRootImpl = js.native
  
  def getViewTreeObserver(): ViewTreeObserver = js.native
  
  def getVisibility(): Double = js.native
  
  def getWidth(): Double = js.native
  
  def getWindowAttachCount(): Double = js.native
  
  def getWindowVisibility(): Double = js.native
  
  def getWindowVisibleDisplayFrame(outRect: Rect): Unit = js.native
  
  def getX(): Double = js.native
  
  def getY(): Double = js.native
  
  def handleFocusGainInternal(direction: Double, previouslyFocusedRect: Rect): Unit = js.native
  
  /* private */ def hasAncestorThatBlocksDescendantFocus(): js.Any = js.native
  
  def hasFocus(): Boolean = js.native
  
  def hasFocusable(): Boolean = js.native
  
  def hasIdentityMatrix(): Boolean = js.native
  
  def hasOnClickListeners(): Boolean = js.native
  
  def hasOpaqueScrollbars(): Boolean = js.native
  
  def hasOverlappingRendering(): Boolean = js.native
  
  def hasTransientState(): Boolean = js.native
  
  def hasWindowFocus(): Boolean = js.native
  
  /* protected */ def initBindAttr(): Unit = js.native
  
  /* protected */ def initBindElement(): Unit = js.native
  /* protected */ def initBindElement(bindElement: HTMLElement): Unit = js.native
  
  def initScrollCache(): Unit = js.native
  
  /* private */ def initialAwakenScrollBars(): js.Any = js.native
  
  def initializeScrollbars(): Unit = js.native
  def initializeScrollbars(a: TypedArray): Unit = js.native
  
  def invalidate(): js.Any = js.native
  def invalidate(dirty: Rect): js.Any = js.native
  def invalidate(invalidateCache: Boolean): js.Any = js.native
  def invalidate(l: Double, t: Double, r: Double, b: Double): js.Any = js.native
  
  def invalidateParentCaches(): Unit = js.native
  
  def invalidateParentIfNeeded(): Unit = js.native
  
  def invalidateViewProperty(invalidateParent: Boolean, forceRedraw: Boolean): Unit = js.native
  
  def isActivated(): Boolean = js.native
  
  def isAttachedToWindow(): Boolean = js.native
  
  def isClickable(): Boolean = js.native
  
  def isDirty(): Boolean = js.native
  
  def isDrawingCacheEnabled(): Boolean = js.native
  
  def isEnabled(): Boolean = js.native
  
  def isFocusable(): Boolean = js.native
  
  def isFocusableInTouchMode(): Boolean = js.native
  
  def isFocused(): Boolean = js.native
  
  def isHardwareAccelerated(): Boolean = js.native
  
  def isHorizontalScrollBarEnabled(): Boolean = js.native
  
  def isInEditMode(): Boolean = js.native
  
  def isInLayout(): Boolean = js.native
  
  def isInScrollingContainer(): Boolean = js.native
  
  def isInTouchMode(): Boolean = js.native
  
  def isLaidOut(): Boolean = js.native
  
  def isLayoutRequested(): Boolean = js.native
  
  def isLayoutRtl(): Boolean = js.native
  
  def isLongClickable(): Boolean = js.native
  
  def isOpaque(): Boolean = js.native
  
  def isPressed(): Boolean = js.native
  
  def isRootNamespace(): Boolean = js.native
  
  def isScrollContainer(): Boolean = js.native
  
  def isScrollbarFadingEnabled(): Boolean = js.native
  
  def isSelected(): Boolean = js.native
  
  def isShown(): Boolean = js.native
  
  def isVerticalScrollBarEnabled(): Boolean = js.native
  
  def isVerticalScrollBarHidden(): Boolean = js.native
  
  /* protected */ def isVisibleToUser(): Boolean = js.native
  /* protected */ def isVisibleToUser(boundInView: Rect): Boolean = js.native
  
  def jumpDrawablesToCurrentState(): Unit = js.native
  
  def layout(l: Double, t: Double, r: Double, b: Double): Unit = js.native
  
  var mAttachInfo: AttachInfo = js.native
  
  var mBackground: js.Any = js.native
  
  var mBackgroundHeight: js.Any = js.native
  
  var mBackgroundSizeChanged: js.Any = js.native
  
  var mBackgroundWidth: js.Any = js.native
  
  var mBottom: Double = js.native
  
  var mCachingFailed: Boolean = js.native
  
  var mClipBounds: js.Any = js.native
  
  var mContext: Context = js.native
  
  var mCornerRadiusBottomLeft: js.Any = js.native
  
  var mCornerRadiusBottomRight: js.Any = js.native
  
  var mCornerRadiusTopLeft: js.Any = js.native
  
  var mCornerRadiusTopRight: js.Any = js.native
  
  var mCurrentAnimation: Animation = js.native
  
  var mDrawableState: js.Any = js.native
  
  var mDrawingCacheBackgroundColor: js.Any = js.native
  
  var mFloatingTreeObserver: js.Any = js.native
  
  var mHasPerformedLongPress: js.Any = js.native
  
  var mID: String = js.native
  
  var mLastIsOpaque: js.Any = js.native
  
  var mLayerType: Double = js.native
  
  var mLayoutParams: LayoutParams = js.native
  
  var mLeft: Double = js.native
  
  var mListenerInfo: js.Any = js.native
  
  var mLocalDirtyRect: Rect = js.native
  
  var mMatchIdPredicate: js.Any = js.native
  
  var mMeasureCache: js.Any = js.native
  
  var mMeasuredHeight: js.Any = js.native
  
  var mMeasuredWidth: js.Any = js.native
  
  var mMinHeight: Double = js.native
  
  var mMinWidth: Double = js.native
  
  var mNextFocusDownId: js.Any = js.native
  
  var mNextFocusForwardId: String = js.native
  
  var mNextFocusLeftId: js.Any = js.native
  
  var mNextFocusRightId: js.Any = js.native
  
  var mNextFocusUpId: js.Any = js.native
  
  var mOldHeightMeasureSpec: js.Any = js.native
  
  var mOldWidthMeasureSpec: js.Any = js.native
  
  var mOverScrollMode: js.Any = js.native
  
  var mOverlay: js.Any = js.native
  
  var mPaddingBottom: Double = js.native
  
  var mPaddingLeft: Double = js.native
  
  var mPaddingRight: Double = js.native
  
  var mPaddingTop: Double = js.native
  
  var mParent: ViewParent = js.native
  
  var mPendingCheckForLongPress: js.Any = js.native
  
  var mPendingCheckForTap: js.Any = js.native
  
  var mPerformClick: js.Any = js.native
  
  var mPerformClickAfterPressDraw: js.Any = js.native
  
  var mPrivateFlags: Double = js.native
  
  var mPrivateFlags2: js.Any = js.native
  
  var mPrivateFlags3: js.Any = js.native
  
  var mRight: Double = js.native
  
  var mScrollCache: js.Any = js.native
  
  var mScrollX: Double = js.native
  
  var mScrollY: Double = js.native
  
  var mShadowDrawable: js.Any = js.native
  
  var mShadowPaint: js.Any = js.native
  
  var mTag: js.Any = js.native
  
  var mTop: Double = js.native
  
  var mTouchDelegate: js.Any = js.native
  
  var mTouchSlop: Double = js.native
  
  var mTransformationInfo: TransformationInfo = js.native
  
  var mTransientStateCount: js.Any = js.native
  
  var mUnscaledDrawingCache: js.Any = js.native
  
  var mUnsetPressedState: js.Any = js.native
  
  var mVerticalScrollFactor: js.Any = js.native
  
  var mViewFlags: Double = js.native
  
  var mWindowAttachCount: js.Any = js.native
  
  def measure(widthMeasureSpec: Double, heightMeasureSpec: Double): Unit = js.native
  
  def notifyGlobalFocusCleared(oldFocus: View): Unit = js.native
  
  def offsetLeftAndRight(offset: Double): Unit = js.native
  
  def offsetTopAndBottom(offset: Double): Unit = js.native
  
  /* protected */ def onAnimationEnd(): Unit = js.native
  
  /* protected */ def onAnimationStart(): Unit = js.native
  
  /* protected */ def onAttachedToWindow(): Unit = js.native
  
  /* private */ def onBindElementAttributeChanged(attributeName: js.Any, oldVal: js.Any, newVal: js.Any): js.Any = js.native
  
  def onCancelPendingInputEvents(): Unit = js.native
  
  /* protected */ def onCreateDrawableState(extraSpace: Double): js.Array[Double] = js.native
  
  /* protected */ def onDetachedFromWindow(): Unit = js.native
  
  def onDisplayHint(hint: Double): Unit = js.native
  
  /* protected */ def onDraw(canvas: Canvas): Unit = js.native
  
  def onDrawHorizontalScrollBar(canvas: Canvas, scrollBar: Drawable, l: Double, t: Double, r: Double, b: Double): Unit = js.native
  
  def onDrawScrollBars(canvas: Canvas): Unit = js.native
  
  def onDrawVerticalScrollBar(canvas: Canvas, scrollBar: Drawable, l: Double, t: Double, r: Double, b: Double): Unit = js.native
  
  def onFilterTouchEventForSecurity(event: MotionEvent): Boolean = js.native
  
  /* protected */ def onFinishInflate(): Unit = js.native
  
  def onFinishTemporaryDetach(): Unit = js.native
  
  /* protected */ def onFocusChanged(gainFocus: Boolean, direction: Double, previouslyFocusedRect: Rect): Unit = js.native
  
  def onFocusLost(): Unit = js.native
  
  def onGenericMotionEvent(event: MotionEvent): Boolean = js.native
  
  /* protected */ def onLayout(changed: Boolean, left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
  
  /* protected */ def onMeasure(widthMeasureSpec: Double, heightMeasureSpec: Double): Unit = js.native
  
  /* protected */ def onOverScrolled(scrollX: Double, scrollY: Double, clampedX: Boolean, clampedY: Boolean): Unit = js.native
  
  def onScrollChanged(l: Double, t: Double, oldl: Double, oldt: Double): Unit = js.native
  
  /* protected */ def onSetAlpha(alpha: Double): Boolean = js.native
  
  /* protected */ def onSizeChanged(w: Double, h: Double, oldw: Double, oldh: Double): Unit = js.native
  
  def onStartTemporaryDetach(): Unit = js.native
  
  def onTouchEvent(event: MotionEvent): Boolean = js.native
  
  /* protected */ def onVisibilityChanged(changedView: View, visibility: Double): Unit = js.native
  
  def onWindowFocusChanged(hasWindowFocus: Boolean): Unit = js.native
  
  def onWindowVisibilityChanged(visibility: Double): Unit = js.native
  
  /* protected */ def overScrollBy(
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
  
  def performButtonActionOnTouchDown(event: MotionEvent): Boolean = js.native
  
  def performClick(): Boolean = js.native
  def performClick(event: MotionEvent): Boolean = js.native
  
  def performHapticFeedback(feedbackConstant: Double): Boolean = js.native
  
  def performLongClick(): Boolean = js.native
  
  def playSoundEffect(soundConstant: Double): Unit = js.native
  
  def pointInView(localX: Double, localY: Double): Boolean = js.native
  def pointInView(localX: Double, localY: Double, slop: Double): Boolean = js.native
  
  def post(action: Runnable): Boolean = js.native
  
  def postDelayed(action: Runnable, delayMillis: Double): Boolean = js.native
  
  def postInvalidate(): Unit = js.native
  def postInvalidate(
    l: js.UndefOr[scala.Nothing],
    t: js.UndefOr[scala.Nothing],
    r: js.UndefOr[scala.Nothing],
    b: Double
  ): Unit = js.native
  def postInvalidate(l: js.UndefOr[scala.Nothing], t: js.UndefOr[scala.Nothing], r: Double): Unit = js.native
  def postInvalidate(l: js.UndefOr[scala.Nothing], t: js.UndefOr[scala.Nothing], r: Double, b: Double): Unit = js.native
  def postInvalidate(l: js.UndefOr[scala.Nothing], t: Double): Unit = js.native
  def postInvalidate(l: js.UndefOr[scala.Nothing], t: Double, r: js.UndefOr[scala.Nothing], b: Double): Unit = js.native
  def postInvalidate(l: js.UndefOr[scala.Nothing], t: Double, r: Double): Unit = js.native
  def postInvalidate(l: js.UndefOr[scala.Nothing], t: Double, r: Double, b: Double): Unit = js.native
  def postInvalidate(l: Double): Unit = js.native
  def postInvalidate(l: Double, t: js.UndefOr[scala.Nothing], r: js.UndefOr[scala.Nothing], b: Double): Unit = js.native
  def postInvalidate(l: Double, t: js.UndefOr[scala.Nothing], r: Double): Unit = js.native
  def postInvalidate(l: Double, t: js.UndefOr[scala.Nothing], r: Double, b: Double): Unit = js.native
  def postInvalidate(l: Double, t: Double): Unit = js.native
  def postInvalidate(l: Double, t: Double, r: js.UndefOr[scala.Nothing], b: Double): Unit = js.native
  def postInvalidate(l: Double, t: Double, r: Double): Unit = js.native
  def postInvalidate(l: Double, t: Double, r: Double, b: Double): Unit = js.native
  
  def postInvalidateDelayed(delayMilliseconds: Double): Unit = js.native
  def postInvalidateDelayed(
    delayMilliseconds: Double,
    left: js.UndefOr[scala.Nothing],
    top: js.UndefOr[scala.Nothing],
    right: js.UndefOr[scala.Nothing],
    bottom: Double
  ): Unit = js.native
  def postInvalidateDelayed(
    delayMilliseconds: Double,
    left: js.UndefOr[scala.Nothing],
    top: js.UndefOr[scala.Nothing],
    right: Double
  ): Unit = js.native
  def postInvalidateDelayed(
    delayMilliseconds: Double,
    left: js.UndefOr[scala.Nothing],
    top: js.UndefOr[scala.Nothing],
    right: Double,
    bottom: Double
  ): Unit = js.native
  def postInvalidateDelayed(delayMilliseconds: Double, left: js.UndefOr[scala.Nothing], top: Double): Unit = js.native
  def postInvalidateDelayed(
    delayMilliseconds: Double,
    left: js.UndefOr[scala.Nothing],
    top: Double,
    right: js.UndefOr[scala.Nothing],
    bottom: Double
  ): Unit = js.native
  def postInvalidateDelayed(delayMilliseconds: Double, left: js.UndefOr[scala.Nothing], top: Double, right: Double): Unit = js.native
  def postInvalidateDelayed(
    delayMilliseconds: Double,
    left: js.UndefOr[scala.Nothing],
    top: Double,
    right: Double,
    bottom: Double
  ): Unit = js.native
  def postInvalidateDelayed(delayMilliseconds: Double, left: Double): Unit = js.native
  def postInvalidateDelayed(
    delayMilliseconds: Double,
    left: Double,
    top: js.UndefOr[scala.Nothing],
    right: js.UndefOr[scala.Nothing],
    bottom: Double
  ): Unit = js.native
  def postInvalidateDelayed(delayMilliseconds: Double, left: Double, top: js.UndefOr[scala.Nothing], right: Double): Unit = js.native
  def postInvalidateDelayed(
    delayMilliseconds: Double,
    left: Double,
    top: js.UndefOr[scala.Nothing],
    right: Double,
    bottom: Double
  ): Unit = js.native
  def postInvalidateDelayed(delayMilliseconds: Double, left: Double, top: Double): Unit = js.native
  def postInvalidateDelayed(
    delayMilliseconds: Double,
    left: Double,
    top: Double,
    right: js.UndefOr[scala.Nothing],
    bottom: Double
  ): Unit = js.native
  def postInvalidateDelayed(delayMilliseconds: Double, left: Double, top: Double, right: Double): Unit = js.native
  def postInvalidateDelayed(delayMilliseconds: Double, left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
  
  def postInvalidateOnAnimation(): Unit = js.native
  def postInvalidateOnAnimation(
    left: js.UndefOr[scala.Nothing],
    top: js.UndefOr[scala.Nothing],
    right: js.UndefOr[scala.Nothing],
    bottom: Double
  ): Unit = js.native
  def postInvalidateOnAnimation(left: js.UndefOr[scala.Nothing], top: js.UndefOr[scala.Nothing], right: Double): Unit = js.native
  def postInvalidateOnAnimation(left: js.UndefOr[scala.Nothing], top: js.UndefOr[scala.Nothing], right: Double, bottom: Double): Unit = js.native
  def postInvalidateOnAnimation(left: js.UndefOr[scala.Nothing], top: Double): Unit = js.native
  def postInvalidateOnAnimation(left: js.UndefOr[scala.Nothing], top: Double, right: js.UndefOr[scala.Nothing], bottom: Double): Unit = js.native
  def postInvalidateOnAnimation(left: js.UndefOr[scala.Nothing], top: Double, right: Double): Unit = js.native
  def postInvalidateOnAnimation(left: js.UndefOr[scala.Nothing], top: Double, right: Double, bottom: Double): Unit = js.native
  def postInvalidateOnAnimation(left: Double): Unit = js.native
  def postInvalidateOnAnimation(left: Double, top: js.UndefOr[scala.Nothing], right: js.UndefOr[scala.Nothing], bottom: Double): Unit = js.native
  def postInvalidateOnAnimation(left: Double, top: js.UndefOr[scala.Nothing], right: Double): Unit = js.native
  def postInvalidateOnAnimation(left: Double, top: js.UndefOr[scala.Nothing], right: Double, bottom: Double): Unit = js.native
  def postInvalidateOnAnimation(left: Double, top: Double): Unit = js.native
  def postInvalidateOnAnimation(left: Double, top: Double, right: js.UndefOr[scala.Nothing], bottom: Double): Unit = js.native
  def postInvalidateOnAnimation(left: Double, top: Double, right: Double): Unit = js.native
  def postInvalidateOnAnimation(left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
  
  def postOnAnimation(action: Runnable): Boolean = js.native
  
  def postOnAnimationDelayed(action: Runnable, delayMillis: Double): Boolean = js.native
  
  def refreshDrawableState(): Unit = js.native
  
  def removeCallbacks(action: Runnable): Boolean = js.native
  
  /* private */ def removeLongPressCallback(): js.Any = js.native
  
  def removeOnAttachStateChangeListener(listener: OnAttachStateChangeListener): Unit = js.native
  
  def removeOnLayoutChangeListener(listener: OnLayoutChangeListener): Unit = js.native
  
  /* private */ def removePerformClickCallback(): js.Any = js.native
  
  /* private */ def removeTapCallback(): js.Any = js.native
  
  /* private */ def removeUnsetPressCallback(): js.Any = js.native
  
  def requestFocus(): Boolean = js.native
  def requestFocus(direction: js.UndefOr[scala.Nothing], previouslyFocusedRect: js.Any): Boolean = js.native
  def requestFocus(direction: Double): Boolean = js.native
  def requestFocus(direction: Double, previouslyFocusedRect: js.Any): Boolean = js.native
  
  def requestFocusFromTouch(): Boolean = js.native
  
  /* private */ def requestFocusNoSearch(direction: js.Any, previouslyFocusedRect: js.Any): js.Any = js.native
  
  def requestLayout(): Unit = js.native
  
  def requestRectangleOnScreen(rectangle: Rect): Boolean = js.native
  def requestRectangleOnScreen(rectangle: Rect, immediate: Boolean): Boolean = js.native
  
  def requestSyncBoundToElement(): Unit = js.native
  def requestSyncBoundToElement(immediately: Boolean): Unit = js.native
  
  def resetPressedState(): Unit = js.native
  
  def resolveDrawables(): Unit = js.native
  
  def resolvePadding(): Unit = js.native
  
  def rootViewRequestFocus(): Boolean = js.native
  
  def scrollBy(x: Double, y: Double): Unit = js.native
  
  def scrollTo(x: Double, y: Double): Unit = js.native
  
  def setActivated(activated: Boolean): Unit = js.native
  
  def setAlpha(alpha: Double): Unit = js.native
  
  def setAlphaNoInvalidation(alpha: Double): Boolean = js.native
  
  def setAnimation(animation: Animation): Unit = js.native
  
  def setBackground(background: Drawable): Unit = js.native
  
  def setBackgroundColor(color: Double): Unit = js.native
  
  def setBackgroundDrawable(background: Drawable): Unit = js.native
  
  def setBottom(bottom: Double): Unit = js.native
  
  def setClickable(clickable: Boolean): Unit = js.native
  
  def setClipBounds(clipBounds: Rect): Unit = js.native
  
  def setCornerRadius(radiusTopLeft: Double): Unit = js.native
  def setCornerRadius(
    radiusTopLeft: Double,
    radiusTopRight: js.UndefOr[scala.Nothing],
    radiusBottomRight: js.UndefOr[scala.Nothing],
    radiusBottomLeft: Double
  ): Unit = js.native
  def setCornerRadius(radiusTopLeft: Double, radiusTopRight: js.UndefOr[scala.Nothing], radiusBottomRight: Double): Unit = js.native
  def setCornerRadius(
    radiusTopLeft: Double,
    radiusTopRight: js.UndefOr[scala.Nothing],
    radiusBottomRight: Double,
    radiusBottomLeft: Double
  ): Unit = js.native
  def setCornerRadius(radiusTopLeft: Double, radiusTopRight: Double): Unit = js.native
  def setCornerRadius(
    radiusTopLeft: Double,
    radiusTopRight: Double,
    radiusBottomRight: js.UndefOr[scala.Nothing],
    radiusBottomLeft: Double
  ): Unit = js.native
  def setCornerRadius(radiusTopLeft: Double, radiusTopRight: Double, radiusBottomRight: Double): Unit = js.native
  def setCornerRadius(radiusTopLeft: Double, radiusTopRight: Double, radiusBottomRight: Double, radiusBottomLeft: Double): Unit = js.native
  
  def setCornerRadiusBottomLeft(value: Double): Unit = js.native
  
  def setCornerRadiusBottomRight(value: Double): Unit = js.native
  
  def setCornerRadiusTopLeft(value: Double): Unit = js.native
  
  def setCornerRadiusTopRight(value: Double): Unit = js.native
  
  def setDrawingCacheBackgroundColor(color: Double): Unit = js.native
  
  def setDrawingCacheEnabled(enabled: Boolean): Unit = js.native
  
  def setEnabled(enabled: Boolean): Unit = js.native
  
  def setFadingEdgeLength(length: Double): Unit = js.native
  
  def setFlags(flags: Double, mask: Double): Unit = js.native
  
  def setFocusable(focusable: Boolean): Unit = js.native
  
  def setFocusableInTouchMode(focusableInTouchMode: Boolean): Unit = js.native
  
  /* protected */ def setFrame(left: Double, top: Double, right: Double, bottom: Double): Boolean = js.native
  
  def setHasTransientState(hasTransientState: Boolean): Unit = js.native
  
  def setHorizontalFadingEdgeEnabled(enable: Boolean): Unit = js.native
  
  def setHorizontalScrollBarEnabled(horizontalScrollBarEnabled: Boolean): Unit = js.native
  
  def setHorizontalScrollbarPosition(position: Double): Unit = js.native
  
  def setId(id: String): Unit = js.native
  
  def setIsRootNamespace(isRoot: Boolean): Unit = js.native
  
  def setLayerType(layerType: Double): Unit = js.native
  
  def setLayoutDirection(layoutDirection: Double): Unit = js.native
  
  def setLayoutParams(params: LayoutParams): Unit = js.native
  
  def setLeft(left: Double): Unit = js.native
  
  def setLongClickable(longClickable: Boolean): Unit = js.native
  
  def setMeasuredDimension(measuredWidth: js.Any, measuredHeight: js.Any): Unit = js.native
  
  def setMinimumHeight(minHeight: js.Any): Unit = js.native
  
  def setMinimumWidth(minWidth: js.Any): Unit = js.native
  
  def setNextFocusDownId(nextFocusDownId: String): Unit = js.native
  
  def setNextFocusForwardId(nextFocusForwardId: String): Unit = js.native
  
  def setNextFocusLeftId(nextFocusLeftId: String): Unit = js.native
  
  def setNextFocusRightId(nextFocusRightId: String): Unit = js.native
  
  def setNextFocusUpId(nextFocusUpId: String): Unit = js.native
  
  def setOnClickListener(l: js.Function1[/* v */ this.type, Unit]): Unit = js.native
  def setOnClickListener(l: OnClickListener): Unit = js.native
  
  /* private */ def setOnClickListenerByAttrValueString(onClickAttrString: js.Any): js.Any = js.native
  
  def setOnFocusChangeListener(l: js.Function2[/* v */ this.type, /* hasFocus */ Boolean, Unit]): Unit = js.native
  def setOnFocusChangeListener(l: OnFocusChangeListener): Unit = js.native
  
  def setOnKeyListener(l: js.Function3[/* v */ this.type, /* keyCode */ Double, /* event */ KeyEvent, Unit]): Unit = js.native
  def setOnKeyListener(l: OnKeyListener): Unit = js.native
  
  def setOnLongClickListener(l: js.Function1[/* v */ this.type, Boolean]): Unit = js.native
  def setOnLongClickListener(l: OnLongClickListener): Unit = js.native
  
  def setOnTouchListener(l: js.Function2[/* v */ this.type, /* event */ MotionEvent, Unit]): Unit = js.native
  def setOnTouchListener(l: OnTouchListener): Unit = js.native
  
  def setOverScrollMode(overScrollMode: Double): Unit = js.native
  
  def setPadding(left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
  
  def setPaddingBottom(bottom: Double): Unit = js.native
  
  def setPaddingLeft(left: Double): Unit = js.native
  
  def setPaddingRight(right: Double): Unit = js.native
  
  def setPaddingTop(top: Double): Unit = js.native
  
  def setPivotX(pivotX: Double): Unit = js.native
  
  def setPivotY(pivotY: Double): Unit = js.native
  
  def setPressed(pressed: Boolean): Unit = js.native
  
  def setRight(right: Double): Unit = js.native
  
  def setRotation(rotation: Double): Unit = js.native
  
  def setRotationX(rotationX: Double): Unit = js.native
  
  def setRotationY(rotationY: Double): Unit = js.native
  
  def setScaleX(scaleX: Double): Unit = js.native
  
  def setScaleY(scaleY: Double): Unit = js.native
  
  def setScrollBarDefaultDelayBeforeFade(scrollBarDefaultDelayBeforeFade: Double): Unit = js.native
  
  def setScrollBarFadeDuration(scrollBarFadeDuration: Double): Unit = js.native
  
  def setScrollBarSize(scrollBarSize: Double): Unit = js.native
  
  def setScrollBarStyle(position: Double): Unit = js.native
  
  def setScrollContainer(isScrollContainer: Boolean): Unit = js.native
  
  def setScrollX(value: Double): Unit = js.native
  
  def setScrollY(value: Double): Unit = js.native
  
  def setScrollbarFadingEnabled(fadeScrollbars: Boolean): Unit = js.native
  
  def setSelected(selected: Boolean): Unit = js.native
  
  def setShadowView(radius: Double, dx: Double, dy: Double, color: Double): Unit = js.native
  
  def setTag(tag: js.Any): Unit = js.native
  
  def setTextAlignment(textAlignment: Double): Unit = js.native
  
  def setTextDirection(textDirection: Double): Unit = js.native
  
  def setTop(top: Double): Unit = js.native
  
  def setTouchDelegate(delegate: TouchDelegate): Unit = js.native
  
  def setTransitionAlpha(alpha: Double): Unit = js.native
  
  def setTranslationX(translationX: Double): Unit = js.native
  
  def setTranslationY(translationY: Double): Unit = js.native
  
  def setVerticalFadingEdgeEnabled(enable: Boolean): Unit = js.native
  
  def setVerticalScrollBarEnabled(verticalScrollBarEnabled: Boolean): Unit = js.native
  
  def setVerticalScrollbarPosition(position: Double): Unit = js.native
  
  def setVisibility(visibility: Double): Unit = js.native
  
  def setWillNotCacheDrawing(willNotCacheDrawing: Boolean): Unit = js.native
  
  def setWillNotDraw(willNotDraw: Boolean): Unit = js.native
  
  def setX(x: Double): Unit = js.native
  
  def setY(y: Double): Unit = js.native
  
  /* private */ def sizeChange(newWidth: js.Any, newHeight: js.Any, oldWidth: js.Any, oldHeight: js.Any): js.Any = js.native
  
  /* private */ def skipInvalidate(): js.Any = js.native
  
  def startAnimation(animation: Animation): Unit = js.native
  
  def syncVisibleToElement(): Unit = js.native
  
  def tagName(): String = js.native
  
  def transformRect(rect: Rect): Unit = js.native
  
  def unFocus(): Unit = js.native
  
  def unscheduleDrawable(who: Drawable): Unit = js.native
  
  /* private */ def updateMatrix(): js.Any = js.native
  
  /* protected */ def verifyDrawable(who: Drawable): Boolean = js.native
  
  def willNotCacheDrawing(): Boolean = js.native
  
  def willNotDraw(): Boolean = js.native
}
object View {
  
  @js.native
  trait AttachInfo extends StObject {
    
    var mHandler: Handler = js.native
    
    var mHasWindowFocus: Boolean = js.native
    
    var mInvalidateChildLocation: js.Array[Double] = js.native
    
    var mKeyDispatchState: DispatcherState = js.native
    
    var mPoint: Point = js.native
    
    var mRootView: View = js.native
    
    var mScrollContainers: Set[View] = js.native
    
    var mTmpInvalRect: Rect = js.native
    
    var mTmpMatrix: Matrix = js.native
    
    var mTmpTransformLocation: js.Array[Double] = js.native
    
    var mTmpTransformRect: Rect = js.native
    
    var mTmpTransformation: Transformation = js.native
    
    var mViewRequestingLayout: View = js.native
    
    var mViewRootImpl: ViewRootImpl = js.native
    
    var mWindowVisibility: Double = js.native
  }
  object AttachInfo {
    
    @scala.inline
    def apply(
      mHandler: Handler,
      mHasWindowFocus: Boolean,
      mInvalidateChildLocation: js.Array[Double],
      mKeyDispatchState: DispatcherState,
      mPoint: Point,
      mRootView: View,
      mScrollContainers: Set[View],
      mTmpInvalRect: Rect,
      mTmpMatrix: Matrix,
      mTmpTransformLocation: js.Array[Double],
      mTmpTransformRect: Rect,
      mTmpTransformation: Transformation,
      mViewRequestingLayout: View,
      mViewRootImpl: ViewRootImpl,
      mWindowVisibility: Double
    ): AttachInfo = {
      val __obj = js.Dynamic.literal(mHandler = mHandler.asInstanceOf[js.Any], mHasWindowFocus = mHasWindowFocus.asInstanceOf[js.Any], mInvalidateChildLocation = mInvalidateChildLocation.asInstanceOf[js.Any], mKeyDispatchState = mKeyDispatchState.asInstanceOf[js.Any], mPoint = mPoint.asInstanceOf[js.Any], mRootView = mRootView.asInstanceOf[js.Any], mScrollContainers = mScrollContainers.asInstanceOf[js.Any], mTmpInvalRect = mTmpInvalRect.asInstanceOf[js.Any], mTmpMatrix = mTmpMatrix.asInstanceOf[js.Any], mTmpTransformLocation = mTmpTransformLocation.asInstanceOf[js.Any], mTmpTransformRect = mTmpTransformRect.asInstanceOf[js.Any], mTmpTransformation = mTmpTransformation.asInstanceOf[js.Any], mViewRequestingLayout = mViewRequestingLayout.asInstanceOf[js.Any], mViewRootImpl = mViewRootImpl.asInstanceOf[js.Any], mWindowVisibility = mWindowVisibility.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttachInfo]
    }
    
    @scala.inline
    implicit class AttachInfoMutableBuilder[Self <: AttachInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMHandler(value: Handler): Self = StObject.set(x, "mHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMHasWindowFocus(value: Boolean): Self = StObject.set(x, "mHasWindowFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMInvalidateChildLocation(value: js.Array[Double]): Self = StObject.set(x, "mInvalidateChildLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMInvalidateChildLocationVarargs(value: Double*): Self = StObject.set(x, "mInvalidateChildLocation", js.Array(value :_*))
      
      @scala.inline
      def setMKeyDispatchState(value: DispatcherState): Self = StObject.set(x, "mKeyDispatchState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMPoint(value: Point): Self = StObject.set(x, "mPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMRootView(value: View): Self = StObject.set(x, "mRootView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMScrollContainers(value: Set[View]): Self = StObject.set(x, "mScrollContainers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMTmpInvalRect(value: Rect): Self = StObject.set(x, "mTmpInvalRect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMTmpMatrix(value: Matrix): Self = StObject.set(x, "mTmpMatrix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMTmpTransformLocation(value: js.Array[Double]): Self = StObject.set(x, "mTmpTransformLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMTmpTransformLocationVarargs(value: Double*): Self = StObject.set(x, "mTmpTransformLocation", js.Array(value :_*))
      
      @scala.inline
      def setMTmpTransformRect(value: Rect): Self = StObject.set(x, "mTmpTransformRect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMTmpTransformation(value: Transformation): Self = StObject.set(x, "mTmpTransformation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMViewRequestingLayout(value: View): Self = StObject.set(x, "mViewRequestingLayout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMViewRootImpl(value: ViewRootImpl): Self = StObject.set(x, "mViewRootImpl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMWindowVisibility(value: Double): Self = StObject.set(x, "mWindowVisibility", value.asInstanceOf[js.Any])
    }
    
    @js.native
    trait InvalidateInfo extends StObject {
      
      var bottom: Double = js.native
      
      var left: Double = js.native
      
      def recycle(): Unit = js.native
      
      var right: Double = js.native
      
      var target: View = js.native
      
      var top: Double = js.native
    }
    object InvalidateInfo {
      
      @scala.inline
      def apply(bottom: Double, left: Double, recycle: () => Unit, right: Double, target: View, top: Double): InvalidateInfo = {
        val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], recycle = js.Any.fromFunction0(recycle), right = right.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
        __obj.asInstanceOf[InvalidateInfo]
      }
      
      @scala.inline
      implicit class InvalidateInfoMutableBuilder[Self <: InvalidateInfo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRecycle(value: () => Unit): Self = StObject.set(x, "recycle", js.Any.fromFunction0(value))
        
        @scala.inline
        def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTarget(value: View): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @js.native
  trait ListenerInfo extends StObject {
    
    var mOnAttachStateChangeListeners: CopyOnWriteArrayList[OnAttachStateChangeListener] = js.native
    
    var mOnClickListener: OnClickListener = js.native
    
    var mOnFocusChangeListener: OnFocusChangeListener = js.native
    
    var mOnGenericMotionListener: OnGenericMotionListener = js.native
    
    var mOnKeyListener: OnKeyListener = js.native
    
    var mOnLayoutChangeListeners: ArrayList[OnLayoutChangeListener] = js.native
    
    var mOnLongClickListener: OnLongClickListener = js.native
    
    var mOnTouchListener: OnTouchListener = js.native
  }
  object ListenerInfo {
    
    @scala.inline
    def apply(
      mOnAttachStateChangeListeners: CopyOnWriteArrayList[OnAttachStateChangeListener],
      mOnClickListener: OnClickListener,
      mOnFocusChangeListener: OnFocusChangeListener,
      mOnGenericMotionListener: OnGenericMotionListener,
      mOnKeyListener: OnKeyListener,
      mOnLayoutChangeListeners: ArrayList[OnLayoutChangeListener],
      mOnLongClickListener: OnLongClickListener,
      mOnTouchListener: OnTouchListener
    ): ListenerInfo = {
      val __obj = js.Dynamic.literal(mOnAttachStateChangeListeners = mOnAttachStateChangeListeners.asInstanceOf[js.Any], mOnClickListener = mOnClickListener.asInstanceOf[js.Any], mOnFocusChangeListener = mOnFocusChangeListener.asInstanceOf[js.Any], mOnGenericMotionListener = mOnGenericMotionListener.asInstanceOf[js.Any], mOnKeyListener = mOnKeyListener.asInstanceOf[js.Any], mOnLayoutChangeListeners = mOnLayoutChangeListeners.asInstanceOf[js.Any], mOnLongClickListener = mOnLongClickListener.asInstanceOf[js.Any], mOnTouchListener = mOnTouchListener.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListenerInfo]
    }
    
    @scala.inline
    implicit class ListenerInfoMutableBuilder[Self <: ListenerInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMOnAttachStateChangeListeners(value: CopyOnWriteArrayList[OnAttachStateChangeListener]): Self = StObject.set(x, "mOnAttachStateChangeListeners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMOnClickListener(value: OnClickListener): Self = StObject.set(x, "mOnClickListener", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMOnFocusChangeListener(value: OnFocusChangeListener): Self = StObject.set(x, "mOnFocusChangeListener", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMOnGenericMotionListener(value: OnGenericMotionListener): Self = StObject.set(x, "mOnGenericMotionListener", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMOnKeyListener(value: OnKeyListener): Self = StObject.set(x, "mOnKeyListener", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMOnLayoutChangeListeners(value: ArrayList[OnLayoutChangeListener]): Self = StObject.set(x, "mOnLayoutChangeListeners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMOnLongClickListener(value: OnLongClickListener): Self = StObject.set(x, "mOnLongClickListener", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMOnTouchListener(value: OnTouchListener): Self = StObject.set(x, "mOnTouchListener", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MeasureSpec extends StObject
  
  @js.native
  trait OnAttachStateChangeListener extends StObject {
    
    def onViewAttachedToWindow(v: View): js.Any = js.native
    
    def onViewDetachedFromWindow(v: View): js.Any = js.native
  }
  object OnAttachStateChangeListener {
    
    @scala.inline
    def apply(onViewAttachedToWindow: View => js.Any, onViewDetachedFromWindow: View => js.Any): OnAttachStateChangeListener = {
      val __obj = js.Dynamic.literal(onViewAttachedToWindow = js.Any.fromFunction1(onViewAttachedToWindow), onViewDetachedFromWindow = js.Any.fromFunction1(onViewDetachedFromWindow))
      __obj.asInstanceOf[OnAttachStateChangeListener]
    }
    
    @scala.inline
    implicit class OnAttachStateChangeListenerMutableBuilder[Self <: OnAttachStateChangeListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnViewAttachedToWindow(value: View => js.Any): Self = StObject.set(x, "onViewAttachedToWindow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnViewDetachedFromWindow(value: View => js.Any): Self = StObject.set(x, "onViewDetachedFromWindow", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait OnClickListener extends StObject {
    
    def onClick(v: View): Unit = js.native
  }
  object OnClickListener {
    
    @scala.inline
    def apply(onClick: View => Unit): OnClickListener = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick))
      __obj.asInstanceOf[OnClickListener]
    }
    
    @scala.inline
    implicit class OnClickListenerMutableBuilder[Self <: OnClickListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClick(value: View => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait OnFocusChangeListener extends StObject {
    
    def onFocusChange(v: View, hasFocus: Boolean): Unit = js.native
  }
  object OnFocusChangeListener {
    
    @scala.inline
    def apply(onFocusChange: (View, Boolean) => Unit): OnFocusChangeListener = {
      val __obj = js.Dynamic.literal(onFocusChange = js.Any.fromFunction2(onFocusChange))
      __obj.asInstanceOf[OnFocusChangeListener]
    }
    
    @scala.inline
    implicit class OnFocusChangeListenerMutableBuilder[Self <: OnFocusChangeListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnFocusChange(value: (View, Boolean) => Unit): Self = StObject.set(x, "onFocusChange", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait OnGenericMotionListener extends StObject {
    
    def onGenericMotion(v: View, event: MotionEvent): js.Any = js.native
  }
  object OnGenericMotionListener {
    
    @scala.inline
    def apply(onGenericMotion: (View, MotionEvent) => js.Any): OnGenericMotionListener = {
      val __obj = js.Dynamic.literal(onGenericMotion = js.Any.fromFunction2(onGenericMotion))
      __obj.asInstanceOf[OnGenericMotionListener]
    }
    
    @scala.inline
    implicit class OnGenericMotionListenerMutableBuilder[Self <: OnGenericMotionListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnGenericMotion(value: (View, MotionEvent) => js.Any): Self = StObject.set(x, "onGenericMotion", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait OnKeyListener extends StObject {
    
    def onKey(v: View, keyCode: Double, event: KeyEvent): Unit = js.native
  }
  object OnKeyListener {
    
    @scala.inline
    def apply(onKey: (View, Double, KeyEvent) => Unit): OnKeyListener = {
      val __obj = js.Dynamic.literal(onKey = js.Any.fromFunction3(onKey))
      __obj.asInstanceOf[OnKeyListener]
    }
    
    @scala.inline
    implicit class OnKeyListenerMutableBuilder[Self <: OnKeyListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnKey(value: (View, Double, KeyEvent) => Unit): Self = StObject.set(x, "onKey", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait OnLayoutChangeListener extends StObject {
    
    def onLayoutChange(
      v: View,
      left: Double,
      top: Double,
      right: Double,
      bottom: Double,
      oldLeft: Double,
      oldTop: Double,
      oldRight: Double,
      oldBottom: Double
    ): Unit = js.native
  }
  object OnLayoutChangeListener {
    
    @scala.inline
    def apply(onLayoutChange: (View, Double, Double, Double, Double, Double, Double, Double, Double) => Unit): OnLayoutChangeListener = {
      val __obj = js.Dynamic.literal(onLayoutChange = js.Any.fromFunction9(onLayoutChange))
      __obj.asInstanceOf[OnLayoutChangeListener]
    }
    
    @scala.inline
    implicit class OnLayoutChangeListenerMutableBuilder[Self <: OnLayoutChangeListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnLayoutChange(value: (View, Double, Double, Double, Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "onLayoutChange", js.Any.fromFunction9(value))
    }
  }
  
  @js.native
  trait OnLongClickListener extends StObject {
    
    def onLongClick(v: View): Boolean = js.native
  }
  object OnLongClickListener {
    
    @scala.inline
    def apply(onLongClick: View => Boolean): OnLongClickListener = {
      val __obj = js.Dynamic.literal(onLongClick = js.Any.fromFunction1(onLongClick))
      __obj.asInstanceOf[OnLongClickListener]
    }
    
    @scala.inline
    implicit class OnLongClickListenerMutableBuilder[Self <: OnLongClickListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnLongClick(value: View => Boolean): Self = StObject.set(x, "onLongClick", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait OnTouchListener extends StObject {
    
    def onTouch(v: View, event: MotionEvent): Unit = js.native
  }
  object OnTouchListener {
    
    @scala.inline
    def apply(onTouch: (View, MotionEvent) => Unit): OnTouchListener = {
      val __obj = js.Dynamic.literal(onTouch = js.Any.fromFunction2(onTouch))
      __obj.asInstanceOf[OnTouchListener]
    }
    
    @scala.inline
    implicit class OnTouchListenerMutableBuilder[Self <: OnTouchListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnTouch(value: (View, MotionEvent) => Unit): Self = StObject.set(x, "onTouch", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Predicate[T] extends StObject {
    
    @JSName("apply")
    def apply(t: T): Boolean = js.native
  }
  object Predicate {
    
    @scala.inline
    def apply[T](apply: T => Boolean): Predicate[T] = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
      __obj.asInstanceOf[Predicate[T]]
    }
    
    @scala.inline
    implicit class PredicateMutableBuilder[Self <: Predicate[_], T] (val x: Self with Predicate[T]) extends AnyVal {
      
      @scala.inline
      def setApply(value: T => Boolean): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TransformationInfo extends StObject {
    
    var mAlpha: Double = js.native
    
    var mInverseMatrix: js.Any = js.native
    
    var mInverseMatrixDirty: Boolean = js.native
    
    var mMatrix: Matrix = js.native
    
    var mMatrixDirty: Boolean = js.native
    
    var mMatrixIsIdentity: Boolean = js.native
    
    var mPivotX: Double = js.native
    
    var mPivotY: Double = js.native
    
    var mPrevHeight: Double = js.native
    
    var mPrevWidth: Double = js.native
    
    var mRotation: Double = js.native
    
    var mScaleX: Double = js.native
    
    var mScaleY: Double = js.native
    
    var mTransitionAlpha: Double = js.native
    
    var mTranslationX: Double = js.native
    
    var mTranslationY: Double = js.native
  }
  object TransformationInfo {
    
    @scala.inline
    def apply(
      mAlpha: Double,
      mInverseMatrix: js.Any,
      mInverseMatrixDirty: Boolean,
      mMatrix: Matrix,
      mMatrixDirty: Boolean,
      mMatrixIsIdentity: Boolean,
      mPivotX: Double,
      mPivotY: Double,
      mPrevHeight: Double,
      mPrevWidth: Double,
      mRotation: Double,
      mScaleX: Double,
      mScaleY: Double,
      mTransitionAlpha: Double,
      mTranslationX: Double,
      mTranslationY: Double
    ): TransformationInfo = {
      val __obj = js.Dynamic.literal(mAlpha = mAlpha.asInstanceOf[js.Any], mInverseMatrix = mInverseMatrix.asInstanceOf[js.Any], mInverseMatrixDirty = mInverseMatrixDirty.asInstanceOf[js.Any], mMatrix = mMatrix.asInstanceOf[js.Any], mMatrixDirty = mMatrixDirty.asInstanceOf[js.Any], mMatrixIsIdentity = mMatrixIsIdentity.asInstanceOf[js.Any], mPivotX = mPivotX.asInstanceOf[js.Any], mPivotY = mPivotY.asInstanceOf[js.Any], mPrevHeight = mPrevHeight.asInstanceOf[js.Any], mPrevWidth = mPrevWidth.asInstanceOf[js.Any], mRotation = mRotation.asInstanceOf[js.Any], mScaleX = mScaleX.asInstanceOf[js.Any], mScaleY = mScaleY.asInstanceOf[js.Any], mTransitionAlpha = mTransitionAlpha.asInstanceOf[js.Any], mTranslationX = mTranslationX.asInstanceOf[js.Any], mTranslationY = mTranslationY.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformationInfo]
    }
    
    @scala.inline
    implicit class TransformationInfoMutableBuilder[Self <: TransformationInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMAlpha(value: Double): Self = StObject.set(x, "mAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMInverseMatrix(value: js.Any): Self = StObject.set(x, "mInverseMatrix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMInverseMatrixDirty(value: Boolean): Self = StObject.set(x, "mInverseMatrixDirty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMMatrix(value: Matrix): Self = StObject.set(x, "mMatrix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMMatrixDirty(value: Boolean): Self = StObject.set(x, "mMatrixDirty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMMatrixIsIdentity(value: Boolean): Self = StObject.set(x, "mMatrixIsIdentity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMPivotX(value: Double): Self = StObject.set(x, "mPivotX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMPivotY(value: Double): Self = StObject.set(x, "mPivotY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMPrevHeight(value: Double): Self = StObject.set(x, "mPrevHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMPrevWidth(value: Double): Self = StObject.set(x, "mPrevWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMRotation(value: Double): Self = StObject.set(x, "mRotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMScaleX(value: Double): Self = StObject.set(x, "mScaleX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMScaleY(value: Double): Self = StObject.set(x, "mScaleY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMTransitionAlpha(value: Double): Self = StObject.set(x, "mTransitionAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMTranslationX(value: Double): Self = StObject.set(x, "mTranslationX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMTranslationY(value: Double): Self = StObject.set(x, "mTranslationY", value.asInstanceOf[js.Any])
    }
  }
}
