package typings.androiduix.android.view

import typings.androiduix.android.view.GestureDetector.OnDoubleTapListener
import typings.androiduix.android.view.GestureDetector.OnGestureListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.GestureDetector")
@js.native
class GestureDetector_ protected () extends js.Object {
  def this(listener: OnGestureListener) = this()
  def this(listener: OnGestureListener, handler: js.Any) = this()
  var mAlwaysInBiggerTapRegion: js.Any = js.native
  var mAlwaysInTapRegion: js.Any = js.native
  var mCurrentDownEvent: js.Any = js.native
  var mDeferConfirmSingleTap: js.Any = js.native
  var mDoubleTapListener: js.Any = js.native
  var mDoubleTapSlopSquare: js.Any = js.native
  var mDoubleTapTouchSlopSquare: js.Any = js.native
  var mDownFocusX: js.Any = js.native
  var mDownFocusY: js.Any = js.native
  var mHandler: js.Any = js.native
  var mInLongPress: js.Any = js.native
  var mIsDoubleTapping: js.Any = js.native
  var mIsLongpressEnabled: js.Any = js.native
  var mLastFocusX: js.Any = js.native
  var mLastFocusY: js.Any = js.native
  var mListener: js.Any = js.native
  var mMaximumFlingVelocity: js.Any = js.native
  var mMinimumFlingVelocity: js.Any = js.native
  var mPreviousUpEvent: js.Any = js.native
  var mStillDown: js.Any = js.native
  var mTouchSlopSquare: js.Any = js.native
  var mVelocityTracker: js.Any = js.native
  /* private */ def cancel(): js.Any = js.native
  /* private */ def cancelTaps(): js.Any = js.native
  /* private */ def dispatchLongPress(): js.Any = js.native
  /* private */ def init(): js.Any = js.native
  /* private */ def isConsideredDoubleTap(firstDown: js.Any, firstUp: js.Any, secondDown: js.Any): js.Any = js.native
  def isLongpressEnabled(): Boolean = js.native
  def onTouchEvent(ev: MotionEvent): Boolean = js.native
  def setIsLongpressEnabled(isLongpressEnabled: Boolean): Unit = js.native
  def setOnDoubleTapListener(onDoubleTapListener: OnDoubleTapListener): Unit = js.native
}

