package typings
package androiduixLib.androidNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.ScaleGestureDetector")
@js.native
class ScaleGestureDetector protected () extends js.Object {
  def this(listener: androiduixLib.androidNs.viewNs.ScaleGestureDetectorNs.OnScaleGestureListener) = this()
  def this(listener: androiduixLib.androidNs.viewNs.ScaleGestureDetectorNs.OnScaleGestureListener, handler: js.Any) = this()
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
  def getCurrentSpan(): scala.Double = js.native
  def getCurrentSpanX(): scala.Double = js.native
  def getCurrentSpanY(): scala.Double = js.native
  def getEventTime(): scala.Double = js.native
  def getFocusX(): scala.Double = js.native
  def getFocusY(): scala.Double = js.native
  def getPreviousSpan(): scala.Double = js.native
  def getPreviousSpanX(): scala.Double = js.native
  def getPreviousSpanY(): scala.Double = js.native
  def getScaleFactor(): scala.Double = js.native
  def getTimeDelta(): scala.Double = js.native
  /* private */ def inDoubleTapMode(): js.Any = js.native
  def isInProgress(): scala.Boolean = js.native
  def isQuickScaleEnabled(): scala.Boolean = js.native
  def onTouchEvent(event: MotionEvent): scala.Boolean = js.native
  def setQuickScaleEnabled(scales: scala.Boolean): scala.Unit = js.native
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

