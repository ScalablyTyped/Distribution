package typings.androiduix.uk.co.senab.photoview

import typings.androiduix.android.view.MotionEvent
import typings.androiduix.android.view.ScaleGestureDetector
import typings.androiduix.uk.co.senab.photoview.GestureDetector.OnGestureListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("uk.co.senab.photoview.GestureDetector")
@js.native
class GestureDetector_ () extends js.Object {
  var mActivePointerId: js.Any = js.native
  var mActivePointerIndex: js.Any = js.native
  var mIsDragging: js.Any = js.native
  var mLastTouchX: Double = js.native
  var mLastTouchY: Double = js.native
  var mListener: OnGestureListener = js.native
  var mMinimumVelocity: Double = js.native
  var mScaleDetector: ScaleGestureDetector = js.native
  var mTouchSlop: Double = js.native
  var mVelocityTracker: js.Any = js.native
  def getActiveX(ev: MotionEvent): Double = js.native
  def getActiveY(ev: MotionEvent): Double = js.native
  def isDragging(): Boolean = js.native
  def isScaling(): Boolean = js.native
  def onTouchEvent(ev: MotionEvent): Boolean = js.native
  def setOnGestureListener(listener: OnGestureListener): Unit = js.native
}

