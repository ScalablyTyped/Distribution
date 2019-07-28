package typings.androiduix.androidNs.viewNs

import typings.androiduix.androidNs.viewNs.ScaleGestureDetectorNs.OnScaleGestureListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.ScaleGestureDetector")
@js.native
class ScaleGestureDetector protected () extends js.Object {
  def this(listener: OnScaleGestureListener) = this()
  def this(listener: OnScaleGestureListener, handler: js.Any) = this()
  var mCurrSpan: js.Any = js.native
  var mCurrSpanX: js.Any = js.native
  var mCurrSpanY: js.Any = js.native
  var mCurrTime: js.Any = js.native
  var mDoubleTapEvent: js.Any = js.native
  var mDoubleTapMode: js.Any = js.native
  var mEventBeforeOrAboveStartingGestureEvent: js.Any = js.native
  var mFocusX: js.Any = js.native
  var mFocusY: js.Any = js.native
  var mGestureDetector: js.Any = js.native
  var mHandler: js.Any = js.native
  var mInProgress: js.Any = js.native
  var mInitialSpan: js.Any = js.native
  var mListener: js.Any = js.native
  var mMinSpan: js.Any = js.native
  var mPrevSpan: js.Any = js.native
  var mPrevSpanX: js.Any = js.native
  var mPrevSpanY: js.Any = js.native
  var mPrevTime: js.Any = js.native
  var mQuickScaleEnabled: js.Any = js.native
  var mSpanSlop: js.Any = js.native
  var mTouchHistoryDirection: js.Any = js.native
  var mTouchHistoryLastAccepted: js.Any = js.native
  var mTouchHistoryLastAcceptedTime: js.Any = js.native
  var mTouchLower: js.Any = js.native
  var mTouchMinMajor: js.Any = js.native
  var mTouchUpper: js.Any = js.native
  /* private */ def addTouchHistory(ev: js.Any): js.Any = js.native
  /* private */ def clearTouchHistory(): js.Any = js.native
  def getCurrentSpan(): Double = js.native
  def getCurrentSpanX(): Double = js.native
  def getCurrentSpanY(): Double = js.native
  def getEventTime(): Double = js.native
  def getFocusX(): Double = js.native
  def getFocusY(): Double = js.native
  def getPreviousSpan(): Double = js.native
  def getPreviousSpanX(): Double = js.native
  def getPreviousSpanY(): Double = js.native
  def getScaleFactor(): Double = js.native
  def getTimeDelta(): Double = js.native
  /* private */ def inDoubleTapMode(): js.Any = js.native
  def isInProgress(): Boolean = js.native
  def isQuickScaleEnabled(): Boolean = js.native
  def onTouchEvent(event: MotionEvent): Boolean = js.native
  def setQuickScaleEnabled(scales: Boolean): Unit = js.native
}

/* static members */
@JSGlobal("android.view.ScaleGestureDetector")
@js.native
object ScaleGestureDetector extends js.Object {
  var DOUBLE_TAP_MODE_IN_PROGRESS: js.Any = js.native
  var DOUBLE_TAP_MODE_NONE: js.Any = js.native
  var SCALE_FACTOR: js.Any = js.native
  var TAG: js.Any = js.native
  var TOUCH_STABILIZE_TIME: js.Any = js.native
}

