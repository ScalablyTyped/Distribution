package typings.androiduix.android.view

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VelocityTracker extends js.Object {
  
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
  
  var mGeneration: js.Any = js.native
  
  var mLastTouchIndex: js.Any = js.native
  
  var mNext: js.Any = js.native
  
  var mPointerListHead: js.Any = js.native
  
  def recycle(): Unit = js.native
  
  def setNextPoolable(element: VelocityTracker): Unit = js.native
}
