package typings
package androiduixLib.ukNs.coNs.senabNs.photoviewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("uk.co.senab.photoview.GestureDetector")
@js.native
class GestureDetector () extends js.Object {
  var mActivePointerId: js.Any = js.native
  var mActivePointerIndex: js.Any = js.native
  var mIsDragging: js.Any = js.native
  var mLastTouchX: scala.Double = js.native
  var mLastTouchY: scala.Double = js.native
  var mListener: androiduixLib.ukNs.coNs.senabNs.photoviewNs.GestureDetectorNs.OnGestureListener = js.native
  var mMinimumVelocity: scala.Double = js.native
  var mScaleDetector: androiduixLib.androidNs.viewNs.ScaleGestureDetector = js.native
  var mTouchSlop: scala.Double = js.native
  var mVelocityTracker: js.Any = js.native
  def getActiveX(ev: androiduixLib.androidNs.viewNs.MotionEvent): scala.Double = js.native
  def getActiveY(ev: androiduixLib.androidNs.viewNs.MotionEvent): scala.Double = js.native
  def isDragging(): scala.Boolean = js.native
  def isScaling(): scala.Boolean = js.native
  def onTouchEvent(ev: androiduixLib.androidNs.viewNs.MotionEvent): scala.Boolean = js.native
  def setOnGestureListener(listener: androiduixLib.ukNs.coNs.senabNs.photoviewNs.GestureDetectorNs.OnGestureListener): scala.Unit = js.native
}

@JSGlobal("uk.co.senab.photoview.GestureDetector")
@js.native
object GestureDetector extends js.Object {
  var INVALID_POINTER_ID: js.Any = js.native
  var LOG_TAG: js.Any = js.native
}

