package typings.androiduix.android.view

import typings.androiduix.android.graphics.Rect
import typings.std.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MotionEvent extends js.Object {
  var _activeTouch: js.Any = js.native
  var _axisValues: js.Any = js.native
  var mAction: Double = js.native
  var mActivePointerId: Double = js.native
  var mDownTime: Double = js.native
  var mEdgeFlags: Double = js.native
  var mEventTime: Double = js.native
  var mTouchingPointers: js.Any = js.native
  var mXOffset: Double = js.native
  var mYOffset: Double = js.native
  def findPointerIndex(pointerId: Double): Double = js.native
  def getAction(): Double = js.native
  def getActionIndex(): Double = js.native
  def getActionMasked(): Double = js.native
  def getAxisValue(axis: Double): Double = js.native
  def getDownTime(): Double = js.native
  def getEdgeFlags(): Double = js.native
  def getEventTime(): Double = js.native
  def getHistoricalEventTime(pointerIndex: Double, pos: Double): Double = js.native
  def getHistoricalEventTime(pos: Double): Double = js.native
  def getHistoricalTouchMajor(): Double = js.native
  def getHistoricalTouchMajor(pointerIndex: js.UndefOr[scala.Nothing], pos: Double): Double = js.native
  def getHistoricalTouchMajor(pointerIndex: Double): Double = js.native
  def getHistoricalTouchMajor(pointerIndex: Double, pos: Double): Double = js.native
  def getHistoricalX(pointerIndex: Double, pos: Double): Double = js.native
  def getHistoricalY(pointerIndex: Double, pos: Double): Double = js.native
  def getHistorySize(): Double = js.native
  def getHistorySize(id: Double): Double = js.native
  def getPointerCount(): Double = js.native
  def getPointerId(pointerIndex: Double): Double = js.native
  def getPointerIdBits(): Double = js.native
  def getRawX(): Double = js.native
  def getRawY(): Double = js.native
  def getTouchMajor(): Double = js.native
  def getTouchMajor(pointerIndex: Double): Double = js.native
  def getX(): Double = js.native
  def getX(pointerIndex: Double): Double = js.native
  def getY(): Double = js.native
  def getY(pointerIndex: Double): Double = js.native
  def initWithMouseWheel(e: WheelEvent): Unit = js.native
  def initWithTouch(event: js.Any, baseAction: Double): Unit = js.native
  def initWithTouch(event: js.Any, baseAction: Double, windowBound: Rect): Unit = js.native
  def isPointerEvent(): Boolean = js.native
  def isTouchEvent(): Boolean = js.native
  def offsetLocation(deltaX: Double, deltaY: Double): Unit = js.native
  def recycle(): Unit = js.native
  def setAction(action: Double): Unit = js.native
  def setEdgeFlags(flags: Double): Unit = js.native
  def setLocation(x: Double, y: Double): Unit = js.native
  def split(idBits: Double): MotionEvent = js.native
}

