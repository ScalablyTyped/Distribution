package typings.androiduix.android.view

import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.view.View.AttachInfo.InvalidateInfo
import typings.std.Event
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewRootImpl_ extends ViewParent {
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
  def cancelInvalidate(view: View): Unit = js.native
  /* private */ def checkContinueTraversalsNextFrame(): js.Any = js.native
  /* private */ def checkForLeavingTouchModeAndConsume(event: js.Any): js.Any = js.native
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
  def getHostVisibility(): Double = js.native
  /* private */ def getValidLayoutRequesters(layoutRequesters: js.Any, secondLayoutRequests: js.Any): js.Any = js.native
  def getView(): View = js.native
  def initSurface(canvasElement: HTMLCanvasElement): Unit = js.native
  def invalidate(): Unit = js.native
  def invalidateWorld(view: View): Unit = js.native
  def isInLayout(): Boolean = js.native
  /* private */ def leaveTouchMode(): js.Any = js.native
  /* private */ def measureHierarchy(host: js.Any, lp: js.Any, desiredWindowWidth: js.Any, desiredWindowHeight: js.Any): js.Any = js.native
  def notifyResized(frame: Rect): Unit = js.native
  /* private */ def performDraw(): js.Any = js.native
  /* private */ def performLayout(lp: js.Any, desiredWindowWidth: js.Any, desiredWindowHeight: js.Any): js.Any = js.native
  /* private */ def performMeasure(childWidthMeasureSpec: js.Any, childHeightMeasureSpec: js.Any): js.Any = js.native
  /* private */ def performTraversals(): js.Any = js.native
  def requestLayoutDuringLayout(view: View): Boolean = js.native
  /* private */ def scheduleTraversals(): js.Any = js.native
  def setView(view: View): Unit = js.native
  def trackFPS(): Unit = js.native
  /* private */ def unscheduleTraversals(): js.Any = js.native
}

