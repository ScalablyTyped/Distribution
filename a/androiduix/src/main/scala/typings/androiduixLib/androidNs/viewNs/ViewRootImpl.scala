package typings
package androiduixLib.androidNs.viewNs

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
  def cancelInvalidate(view: View): scala.Unit = js.native
  /* private */ def checkContinueTraversalsNextFrame(): js.Any = js.native
  /* private */ def checkForLeavingTouchModeAndConsume(event: js.Any): js.Any = js.native
  /* CompleteClass */
  override def childDrawableStateChanged(child: View): js.Any = js.native
  /* CompleteClass */
  override def childHasTransientStateChanged(child: View, hasTransientState: scala.Boolean): js.Any = js.native
  /* CompleteClass */
  override def clearChildFocus(child: View): js.Any = js.native
  /* private */ def deliverInputEvent(event: js.Any): js.Any = js.native
  def dispatchInputEvent(event: KeyEvent): scala.Boolean = js.native
  def dispatchInputEvent(event: MotionEvent): scala.Boolean = js.native
  def dispatchInputEvent(event: stdLib.Event): scala.Boolean = js.native
  def dispatchInvalidateDelayed(view: View, delayMilliseconds: scala.Double): scala.Unit = js.native
  def dispatchInvalidateOnAnimation(view: View): scala.Unit = js.native
  def dispatchInvalidateRectDelayed(
    info: androiduixLib.androidNs.viewNs.ViewNs.AttachInfoNs.InvalidateInfo,
    delayMilliseconds: scala.Double
  ): scala.Unit = js.native
  def dispatchInvalidateRectOnAnimation(info: androiduixLib.androidNs.viewNs.ViewNs.AttachInfoNs.InvalidateInfo): scala.Unit = js.native
  def doTraversal(): scala.Unit = js.native
  /* private */ def draw(fullRedrawNeeded: js.Any): js.Any = js.native
  /* private */ def drawSoftware(): js.Any = js.native
  def ensureTouchMode(inTouchMode: scala.Boolean): scala.Boolean = js.native
  def ensureTouchModeLocally(inTouchMode: scala.Boolean): scala.Boolean = js.native
  /* private */ def enterTouchMode(): js.Any = js.native
  /* private */ def finishInputEvent(event: js.Any): js.Any = js.native
  /* CompleteClass */
  override def focusSearch(v: View, direction: scala.Double): View = js.native
  /* CompleteClass */
  override def focusableViewAvailable(v: View): js.Any = js.native
  /* CompleteClass */
  override def getChildVisibleRect(
    child: View,
    r: androiduixLib.androidNs.graphicsNs.Rect,
    offset: androiduixLib.androidNs.graphicsNs.Point
  ): scala.Boolean = js.native
  def getHostVisibility(): scala.Double = js.native
  /* CompleteClass */
  override def getParent(): ViewParent = js.native
  /* private */ def getValidLayoutRequesters(layoutRequesters: js.Any, secondLayoutRequests: js.Any): js.Any = js.native
  def getView(): View = js.native
  def initSurface(canvasElement: stdLib.HTMLCanvasElement): scala.Unit = js.native
  def invalidate(): scala.Unit = js.native
  /* CompleteClass */
  override def invalidateChild(child: View, r: androiduixLib.androidNs.graphicsNs.Rect): js.Any = js.native
  /* CompleteClass */
  override def invalidateChildInParent(location: js.Array[scala.Double], r: androiduixLib.androidNs.graphicsNs.Rect): ViewParent = js.native
  def invalidateWorld(view: View): scala.Unit = js.native
  def isInLayout(): scala.Boolean = js.native
  /* CompleteClass */
  override def isLayoutRequested(): scala.Boolean = js.native
  /* private */ def leaveTouchMode(): js.Any = js.native
  /* private */ def measureHierarchy(host: js.Any, lp: js.Any, desiredWindowWidth: js.Any, desiredWindowHeight: js.Any): js.Any = js.native
  def notifyResized(frame: androiduixLib.androidNs.graphicsNs.Rect): scala.Unit = js.native
  /* private */ def performDraw(): js.Any = js.native
  /* private */ def performLayout(lp: js.Any, desiredWindowWidth: js.Any, desiredWindowHeight: js.Any): js.Any = js.native
  /* private */ def performMeasure(childWidthMeasureSpec: js.Any, childHeightMeasureSpec: js.Any): js.Any = js.native
  /* private */ def performTraversals(): js.Any = js.native
  /* CompleteClass */
  override def requestChildFocus(child: View, focused: View): js.Any = js.native
  /* CompleteClass */
  override def requestChildRectangleOnScreen(child: View, rectangle: androiduixLib.androidNs.graphicsNs.Rect, immediate: scala.Boolean): scala.Boolean = js.native
  /* CompleteClass */
  override def requestDisallowInterceptTouchEvent(disallowIntercept: scala.Boolean): js.Any = js.native
  /* CompleteClass */
  override def requestLayout(): js.Any = js.native
  def requestLayoutDuringLayout(view: View): scala.Boolean = js.native
  /* private */ def scheduleTraversals(): js.Any = js.native
  def setView(view: View): scala.Unit = js.native
  def trackFPS(): scala.Unit = js.native
  /* private */ def unscheduleTraversals(): js.Any = js.native
}

@JSGlobal("android.view.ViewRootImpl")
@js.native
object ViewRootImpl extends js.Object {
  var ContinueEventToDom: js.Symbol = js.native
  var DBG: js.Any = js.native
  var DEBUG_CONFIGURATION: scala.Boolean = js.native
  var DEBUG_DRAW: scala.Boolean = js.native
  var DEBUG_FPS: scala.Boolean = js.native
  var DEBUG_INPUT_RESIZE: scala.Boolean = js.native
  var DEBUG_LAYOUT: scala.Boolean = js.native
  var DEBUG_ORIENTATION: scala.Boolean = js.native
  var LOCAL_LOGV: scala.Boolean = js.native
  var RunQueueInstance: js.Any = js.native
  var TAG: java.lang.String = js.native
  /* private */ def findAncestorToTakeFocusInTouchMode(focused: js.Any): js.Any = js.native
  /* private */ def getRootMeasureSpec(windowSize: js.Any, rootDimension: js.Any): js.Any = js.native
  def getRunQueue(): androiduixLib.androidNs.viewNs.ViewRootImplNs.RunQueue = js.native
  def getRunQueue(viewRoot: androiduixLib.androidNs.viewNs.ViewRootImpl): androiduixLib.androidNs.viewNs.ViewRootImplNs.RunQueue = js.native
  /* private */ def isNavigationKey(keyEvent: js.Any): js.Any = js.native
  /* private */ def isTypingKey(keyEvent: js.Any): js.Any = js.native
  def isViewDescendantOf(child: androiduixLib.androidNs.viewNs.View, parent: androiduixLib.androidNs.viewNs.View): js.Any = js.native
}

