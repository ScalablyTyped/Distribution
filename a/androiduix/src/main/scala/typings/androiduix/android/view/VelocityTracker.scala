package typings.androiduix.android.view

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.VelocityTracker")
@js.native
class VelocityTracker () extends js.Object {
  var mGeneration: js.Any = js.native
  var mLastTouchIndex: js.Any = js.native
  var mNext: js.Any = js.native
  var mPointerListHead: js.Any = js.native
  def addMovement(ev: MotionEvent): Unit = js.native
  def clear(): Unit = js.native
  def computeCurrentVelocity(units: Double): Unit = js.native
  def computeCurrentVelocity(units: Double, maxVelocity: Double): Unit = js.native
  def getNextPoolable(): VelocityTracker = js.native
  /* private */ def getPointer(id: js.Any): js.Any = js.native
  def getXVelocity(): Double = js.native
  def getXVelocity(id: Double): Double = js.native
  def getYVelocity(): Double = js.native
  def getYVelocity(id: Double): Double = js.native
  def recycle(): Unit = js.native
  def setNextPoolable(element: VelocityTracker): Unit = js.native
}

/* static members */
@JSGlobal("android.view.VelocityTracker")
@js.native
object VelocityTracker extends js.Object {
  var DEBUG: js.Any = js.native
  var MAX_AGE_MILLISECONDS: js.Any = js.native
  var NUM_PAST: js.Any = js.native
  var POINTER_POOL_CAPACITY: js.Any = js.native
  var TAG: js.Any = js.native
  var localLOGV: js.Any = js.native
  var sPool: js.Any = js.native
  var sRecycledPointerCount: js.Any = js.native
  var sRecycledPointerListHead: js.Any = js.native
  def obtain(): VelocityTracker = js.native
  /* private */ def obtainPointer(): js.Any = js.native
  /* private */ def releasePointer(pointer: js.Any): js.Any = js.native
  /* private */ def releasePointerList(pointer: js.Any): js.Any = js.native
}

