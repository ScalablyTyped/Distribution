package typings.androiduix.android.support.v4.widget

import typings.androiduix.android.view.MotionEvent
import typings.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewDragHelper_ extends js.Object {
  var mActivePointerId: js.Any = js.native
  var mCallback: js.Any = js.native
  var mCapturedView: js.Any = js.native
  var mDragState: js.Any = js.native
  var mEdgeDragsInProgress: js.Any = js.native
  var mEdgeDragsLocked: js.Any = js.native
  var mEdgeSize: js.Any = js.native
  var mInitialEdgesTouched: js.Any = js.native
  var mInitialMotionX: js.Any = js.native
  var mInitialMotionY: js.Any = js.native
  var mLastMotionX: js.Any = js.native
  var mLastMotionY: js.Any = js.native
  var mMaxVelocity: js.Any = js.native
  var mMinVelocity: js.Any = js.native
  var mParentView: js.Any = js.native
  var mPointersDown: js.Any = js.native
  var mReleaseInProgress: js.Any = js.native
  var mScroller: js.Any = js.native
  var mSetIdleRunnable: js.Any = js.native
  var mTouchSlop: js.Any = js.native
  var mTrackingEdges: js.Any = js.native
  var mVelocityTracker: js.Any = js.native
  /* private */ def _checkTouchSlop_1(directions: js.Any): js.Any = js.native
  /* private */ def _checkTouchSlop_2(directions: js.Any, pointerId: js.Any): js.Any = js.native
  /* private */ def _checkTouchSlop_3(child: js.Any, dx: js.Any, dy: js.Any): js.Any = js.native
  def abort(): Unit = js.native
  /* protected */ def canScroll(v: View, checkV: Boolean, dx: Double, dy: Double, x: Double, y: Double): Boolean = js.native
  def cancel(): Unit = js.native
  def captureChildView(childView: View, activePointerId: Double): Unit = js.native
  /* private */ def checkNewEdgeDrag(delta: js.Any, odelta: js.Any, pointerId: js.Any, edge: js.Any): js.Any = js.native
  def checkTouchSlop(child: View, dx: Double, dy: Double): Boolean = js.native
  def checkTouchSlop(directions: Double): Boolean = js.native
  def checkTouchSlop(directions: Double, pointerId: Double): Boolean = js.native
  /* private */ def clampMag(value: js.Any, absMin: js.Any, absMax: js.Any): js.Any = js.native
  /* private */ def clearMotionHistory(pointerId: js.Any): js.Any = js.native
  /* private */ def computeAxisDuration(delta: js.Any, velocity: js.Any, motionRange: js.Any): js.Any = js.native
  /* private */ def computeSettleDuration(child: js.Any, dx: js.Any, dy: js.Any, xvel: js.Any, yvel: js.Any): js.Any = js.native
  def continueSettling(deferCallbacks: Boolean): Boolean = js.native
  /* private */ def dispatchViewReleased(xvel: js.Any, yvel: js.Any): js.Any = js.native
  /* private */ def distanceInfluenceForSnapDuration(f: js.Any): js.Any = js.native
  /* private */ def dragTo(left: js.Any, top: js.Any, dx: js.Any, dy: js.Any): js.Any = js.native
  /* private */ def ensureMotionHistorySizeForId(pointerId: js.Any): js.Any = js.native
  def findTopChildUnder(x: Double, y: Double): View = js.native
  def flingCapturedView(minLeft: Double, minTop: Double, maxLeft: Double, maxTop: Double): Unit = js.native
  /* private */ def forceSettleCapturedViewAt(finalLeft: js.Any, finalTop: js.Any, xvel: js.Any, yvel: js.Any): js.Any = js.native
  def getActivePointerId(): Double = js.native
  def getCapturedView(): View = js.native
  def getEdgeSize(): Double = js.native
  /* private */ def getEdgesTouched(x: js.Any, y: js.Any): js.Any = js.native
  def getMinVelocity(): Double = js.native
  def getTouchSlop(): Double = js.native
  def getViewDragState(): Double = js.native
  def isCapturedViewUnder(x: Double, y: Double): Boolean = js.native
  def isEdgeTouched(edges: Double): Boolean = js.native
  def isEdgeTouched(edges: Double, pointerId: Double): Boolean = js.native
  def isPointerDown(pointerId: Double): Boolean = js.native
  def isViewUnder(view: View, x: Double, y: Double): Boolean = js.native
  def processTouchEvent(ev: MotionEvent): Unit = js.native
  /* private */ def releaseViewForPointerUp(): js.Any = js.native
  /* private */ def reportNewEdgeDrags(dx: js.Any, dy: js.Any, pointerId: js.Any): js.Any = js.native
  /* private */ def saveInitialMotion(x: js.Any, y: js.Any, pointerId: js.Any): js.Any = js.native
  /* private */ def saveLastMotion(ev: js.Any): js.Any = js.native
  def setDragState(state: Double): Unit = js.native
  def setEdgeTrackingEnabled(edgeFlags: Double): Unit = js.native
  def setMinVelocity(minVel: Double): Unit = js.native
  def settleCapturedViewAt(finalLeft: Double, finalTop: Double): Boolean = js.native
  def shouldInterceptTouchEvent(ev: MotionEvent): Boolean = js.native
  def smoothSlideViewTo(child: View, finalLeft: Double, finalTop: Double): Boolean = js.native
  def tryCaptureViewForDrag(toCapture: View, pointerId: Double): Boolean = js.native
}

