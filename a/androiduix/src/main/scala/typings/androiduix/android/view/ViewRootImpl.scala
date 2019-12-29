package typings.androiduix.android.view

import typings.androiduix.android.graphics.Point
import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.os.Handler
import typings.androiduix.android.view.View.AttachInfo.InvalidateInfo
import typings.androiduix.java.lang.Runnable
import typings.std.Event
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.ViewRootImpl")
@js.native
class ViewRootImpl () extends ViewParent {
  var _continueTraversalesCount: js.Any = js.native
  var mAdded: js.Any = js.native
  var mAddedTouchMode: js.Any = js.native
  var mDirty: js.Any = js.native
  var mDrawingTime: js.Any = js.native
  var mFirst: js.Any = js.native
  var mFirstInputStage: js.Any = js.native
  var mFpsNumFrames: js.Any = js.native
  var mFpsPrevTime: js.Any = js.native
  var mFpsStartTime: js.Any = js.native
  var mFullRedrawNeeded: js.Any = js.native
  var mHandler: js.Any = js.native
  var mHandlingLayoutInLayoutRequest: js.Any = js.native
  var mHeight: js.Any = js.native
  var mIgnoreDirtyState: js.Any = js.native
  var mInLayout: js.Any = js.native
  var mInTouchMode: js.Any = js.native
  var mInvalidateOnAnimationRunnable: js.Any = js.native
  var mIsAnimating: js.Any = js.native
  var mIsDrawing: js.Any = js.native
  var mIsInTraversal: js.Any = js.native
  var mLayoutRequested: js.Any = js.native
  var mLayoutRequesters: js.Any = js.native
  var mRemoved: js.Any = js.native
  var mRunQueue: js.Any = js.native
  var mSetIgnoreDirtyState: js.Any = js.native
  var mStopped: js.Any = js.native
  var mSurface: js.Any = js.native
  var mTempRect: js.Any = js.native
  var mTraversalRunnable: js.Any = js.native
  var mTraversalScheduled: js.Any = js.native
  var mTreeObserver: js.Any = js.native
  var mView: js.Any = js.native
  var mViewScrollChanged: js.Any = js.native
  var mViewVisibility: js.Any = js.native
  var mVisRect: js.Any = js.native
  var mWidth: js.Any = js.native
  var mWillDrawSoon: js.Any = js.native
  var mWinFrame: js.Any = js.native
  /* CompleteClass */
  override def bringChildToFront(child: View): js.Any = js.native
  def cancelInvalidate(view: View): Unit = js.native
  /* private */ def checkContinueTraversalsNextFrame(): js.Any = js.native
  /* private */ def checkForLeavingTouchModeAndConsume(event: js.Any): js.Any = js.native
  /* CompleteClass */
  override def childDrawableStateChanged(child: View): js.Any = js.native
  /* CompleteClass */
  override def childHasTransientStateChanged(child: View, hasTransientState: Boolean): js.Any = js.native
  /* CompleteClass */
  override def clearChildFocus(child: View): js.Any = js.native
  /* private */ def deliverInputEvent(event: js.Any): js.Any = js.native
  def dispatchInputEvent(event: KeyEvent): Boolean = js.native
  def dispatchInputEvent(event: MotionEvent): Boolean = js.native
  def dispatchInputEvent(event: Event): Boolean = js.native
  def dispatchInvalidateDelayed(view: View, delayMilliseconds: Double): Unit = js.native
  def dispatchInvalidateOnAnimation(view: View): Unit = js.native
  def dispatchInvalidateRectDelayed(info: InvalidateInfo, delayMilliseconds: Double): Unit = js.native
  def dispatchInvalidateRectOnAnimation(info: InvalidateInfo): Unit = js.native
  def doTraversal(): Unit = js.native
  /* private */ def draw(fullRedrawNeeded: js.Any): js.Any = js.native
  /* private */ def drawSoftware(): js.Any = js.native
  def ensureTouchMode(inTouchMode: Boolean): Boolean = js.native
  def ensureTouchModeLocally(inTouchMode: Boolean): Boolean = js.native
  /* private */ def enterTouchMode(): js.Any = js.native
  /* private */ def finishInputEvent(event: js.Any): js.Any = js.native
  /* CompleteClass */
  override def focusSearch(v: View, direction: Double): View = js.native
  /* CompleteClass */
  override def focusableViewAvailable(v: View): js.Any = js.native
  /* CompleteClass */
  override def getChildVisibleRect(child: View, r: Rect, offset: Point): Boolean = js.native
  def getHostVisibility(): Double = js.native
  /* CompleteClass */
  override def getParent(): ViewParent = js.native
  /* private */ def getValidLayoutRequesters(layoutRequesters: js.Any, secondLayoutRequests: js.Any): js.Any = js.native
  def getView(): View = js.native
  def initSurface(canvasElement: HTMLCanvasElement): Unit = js.native
  def invalidate(): Unit = js.native
  /* CompleteClass */
  override def invalidateChild(child: View, r: Rect): js.Any = js.native
  /* CompleteClass */
  override def invalidateChildInParent(location: js.Array[Double], r: Rect): ViewParent = js.native
  def invalidateWorld(view: View): Unit = js.native
  def isInLayout(): Boolean = js.native
  /* CompleteClass */
  override def isLayoutRequested(): Boolean = js.native
  /* private */ def leaveTouchMode(): js.Any = js.native
  /* private */ def measureHierarchy(host: js.Any, lp: js.Any, desiredWindowWidth: js.Any, desiredWindowHeight: js.Any): js.Any = js.native
  def notifyResized(frame: Rect): Unit = js.native
  /* private */ def performDraw(): js.Any = js.native
  /* private */ def performLayout(lp: js.Any, desiredWindowWidth: js.Any, desiredWindowHeight: js.Any): js.Any = js.native
  /* private */ def performMeasure(childWidthMeasureSpec: js.Any, childHeightMeasureSpec: js.Any): js.Any = js.native
  /* private */ def performTraversals(): js.Any = js.native
  /* CompleteClass */
  override def requestChildFocus(child: View, focused: View): js.Any = js.native
  /* CompleteClass */
  override def requestChildRectangleOnScreen(child: View, rectangle: Rect, immediate: Boolean): Boolean = js.native
  /* CompleteClass */
  override def requestDisallowInterceptTouchEvent(disallowIntercept: Boolean): js.Any = js.native
  /* CompleteClass */
  override def requestLayout(): js.Any = js.native
  def requestLayoutDuringLayout(view: View): Boolean = js.native
  /* private */ def scheduleTraversals(): js.Any = js.native
  def setView(view: View): Unit = js.native
  def trackFPS(): Unit = js.native
  /* private */ def unscheduleTraversals(): js.Any = js.native
}

/* static members */
@JSGlobal("android.view.ViewRootImpl")
@js.native
object ViewRootImpl extends js.Object {
  @js.native
  class RunQueue () extends js.Object {
    var mActions: js.Any = js.native
    def executeActions(handler: Handler): Unit = js.native
    def post(action: Runnable): Unit = js.native
    def postDelayed(action: Runnable, delayMillis: Double): Unit = js.native
    def removeCallbacks(action: Runnable): Unit = js.native
  }
  
  var ContinueEventToDom: js.Symbol = js.native
  var DBG: js.Any = js.native
  var DEBUG_CONFIGURATION: Boolean = js.native
  var DEBUG_DRAW: Boolean = js.native
  var DEBUG_FPS: Boolean = js.native
  var DEBUG_INPUT_RESIZE: Boolean = js.native
  var DEBUG_LAYOUT: Boolean = js.native
  var DEBUG_ORIENTATION: Boolean = js.native
  var LOCAL_LOGV: Boolean = js.native
  var RunQueueInstance: js.Any = js.native
  var TAG: String = js.native
  /* private */ def findAncestorToTakeFocusInTouchMode(focused: js.Any): js.Any = js.native
  /* private */ def getRootMeasureSpec(windowSize: js.Any, rootDimension: js.Any): js.Any = js.native
  def getRunQueue(): RunQueue = js.native
  def getRunQueue(viewRoot: ViewRootImpl): RunQueue = js.native
  /* private */ def isNavigationKey(keyEvent: js.Any): js.Any = js.native
  /* private */ def isTypingKey(keyEvent: js.Any): js.Any = js.native
  def isViewDescendantOf(child: View, parent: View): js.Any = js.native
}

