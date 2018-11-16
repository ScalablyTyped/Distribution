package typings
package androiduixLib.androidNs.supportNs.v4Ns.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.support.v4.widget.ViewDragHelper")
@js.native
class ViewDragHelper protected () extends js.Object {
  def this(forParent: androiduixLib.androidNs.viewNs.ViewGroup, cb: androiduixLib.androidNs.supportNs.v4Ns.widgetNs.ViewDragHelperNs.Callback) = this()
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
  def abort(): scala.Unit = js.native
  /* protected */ def canScroll(
    v: androiduixLib.androidNs.viewNs.View,
    checkV: scala.Boolean,
    dx: scala.Double,
    dy: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): scala.Boolean = js.native
  def cancel(): scala.Unit = js.native
  def captureChildView(childView: androiduixLib.androidNs.viewNs.View, activePointerId: scala.Double): scala.Unit = js.native
  /* private */ def checkNewEdgeDrag(delta: js.Any, odelta: js.Any, pointerId: js.Any, edge: js.Any): js.Any = js.native
  def checkTouchSlop(child: androiduixLib.androidNs.viewNs.View, dx: scala.Double, dy: scala.Double): scala.Boolean = js.native
  def checkTouchSlop(directions: scala.Double): scala.Boolean = js.native
  def checkTouchSlop(directions: scala.Double, pointerId: scala.Double): scala.Boolean = js.native
  /* private */ def clampMag(value: js.Any, absMin: js.Any, absMax: js.Any): js.Any = js.native
  /* private */ def clearMotionHistory(): js.Any = js.native
  /* private */ def clearMotionHistory(pointerId: js.Any): js.Any = js.native
  /* private */ def computeAxisDuration(delta: js.Any, velocity: js.Any, motionRange: js.Any): js.Any = js.native
  /* private */ def computeSettleDuration(child: js.Any, dx: js.Any, dy: js.Any, xvel: js.Any, yvel: js.Any): js.Any = js.native
  def continueSettling(deferCallbacks: scala.Boolean): scala.Boolean = js.native
  /* private */ def dispatchViewReleased(xvel: js.Any, yvel: js.Any): js.Any = js.native
  /* private */ def distanceInfluenceForSnapDuration(f: js.Any): js.Any = js.native
  /* private */ def dragTo(left: js.Any, top: js.Any, dx: js.Any, dy: js.Any): js.Any = js.native
  /* private */ def ensureMotionHistorySizeForId(pointerId: js.Any): js.Any = js.native
  def findTopChildUnder(x: scala.Double, y: scala.Double): androiduixLib.androidNs.viewNs.View = js.native
  def flingCapturedView(minLeft: scala.Double, minTop: scala.Double, maxLeft: scala.Double, maxTop: scala.Double): scala.Unit = js.native
  /* private */ def forceSettleCapturedViewAt(finalLeft: js.Any, finalTop: js.Any, xvel: js.Any, yvel: js.Any): js.Any = js.native
  def getActivePointerId(): scala.Double = js.native
  def getCapturedView(): androiduixLib.androidNs.viewNs.View = js.native
  def getEdgeSize(): scala.Double = js.native
  /* private */ def getEdgesTouched(x: js.Any, y: js.Any): js.Any = js.native
  def getMinVelocity(): scala.Double = js.native
  def getTouchSlop(): scala.Double = js.native
  def getViewDragState(): scala.Double = js.native
  def isCapturedViewUnder(x: scala.Double, y: scala.Double): scala.Boolean = js.native
  def isEdgeTouched(edges: scala.Double): scala.Boolean = js.native
  def isEdgeTouched(edges: scala.Double, pointerId: scala.Double): scala.Boolean = js.native
  def isPointerDown(pointerId: scala.Double): scala.Boolean = js.native
  def isViewUnder(view: androiduixLib.androidNs.viewNs.View, x: scala.Double, y: scala.Double): scala.Boolean = js.native
  def processTouchEvent(ev: androiduixLib.androidNs.viewNs.MotionEvent): scala.Unit = js.native
  /* private */ def releaseViewForPointerUp(): js.Any = js.native
  /* private */ def reportNewEdgeDrags(dx: js.Any, dy: js.Any, pointerId: js.Any): js.Any = js.native
  /* private */ def saveInitialMotion(x: js.Any, y: js.Any, pointerId: js.Any): js.Any = js.native
  /* private */ def saveLastMotion(ev: js.Any): js.Any = js.native
  def setDragState(state: scala.Double): scala.Unit = js.native
  def setEdgeTrackingEnabled(edgeFlags: scala.Double): scala.Unit = js.native
  def setMinVelocity(minVel: scala.Double): scala.Unit = js.native
  def settleCapturedViewAt(finalLeft: scala.Double, finalTop: scala.Double): scala.Boolean = js.native
  def shouldInterceptTouchEvent(ev: androiduixLib.androidNs.viewNs.MotionEvent): scala.Boolean = js.native
  def smoothSlideViewTo(child: androiduixLib.androidNs.viewNs.View, finalLeft: scala.Double, finalTop: scala.Double): scala.Boolean = js.native
  def tryCaptureViewForDrag(toCapture: androiduixLib.androidNs.viewNs.View, pointerId: scala.Double): scala.Boolean = js.native
}

@JSGlobal("android.support.v4.widget.ViewDragHelper")
@js.native
object ViewDragHelper extends js.Object {
  var BASE_SETTLE_DURATION: js.Any = js.native
  var DIRECTION_ALL: scala.Double = js.native
  var DIRECTION_HORIZONTAL: scala.Double = js.native
  var DIRECTION_VERTICAL: scala.Double = js.native
  var EDGE_ALL: scala.Double = js.native
  var EDGE_BOTTOM: scala.Double = js.native
  var EDGE_LEFT: scala.Double = js.native
  var EDGE_RIGHT: scala.Double = js.native
  var EDGE_SIZE: js.Any = js.native
  var EDGE_TOP: scala.Double = js.native
  var INVALID_POINTER: scala.Double = js.native
  var MAX_SETTLE_DURATION: js.Any = js.native
  var STATE_DRAGGING: scala.Double = js.native
  var STATE_IDLE: scala.Double = js.native
  var STATE_SETTLING: scala.Double = js.native
  var TAG: js.Any = js.native
  var sInterpolator: js.Any = js.native
  def create(
    forParent: androiduixLib.androidNs.viewNs.ViewGroup,
    cb: androiduixLib.androidNs.supportNs.v4Ns.widgetNs.ViewDragHelperNs.Callback
  ): androiduixLib.androidNs.supportNs.v4Ns.widgetNs.ViewDragHelper = js.native
  def create(
    forParent: androiduixLib.androidNs.viewNs.ViewGroup,
    sensitivity: scala.Double,
    cb: androiduixLib.androidNs.supportNs.v4Ns.widgetNs.ViewDragHelperNs.Callback
  ): androiduixLib.androidNs.supportNs.v4Ns.widgetNs.ViewDragHelper = js.native
}

