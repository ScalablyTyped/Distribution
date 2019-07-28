package typings.androiduix.androidNs.viewNs

import typings.androiduix.androidNs.graphicsNs.Rect
import typings.std.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.MotionEvent")
@js.native
class MotionEvent () extends js.Object {
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

/* static members */
@JSGlobal("android.view.MotionEvent")
@js.native
object MotionEvent extends js.Object {
  var ACTION_CANCEL: Double = js.native
  var ACTION_DOWN: Double = js.native
  var ACTION_HOVER_ENTER: Double = js.native
  var ACTION_HOVER_EXIT: Double = js.native
  var ACTION_HOVER_MOVE: Double = js.native
  var ACTION_MASK: Double = js.native
  var ACTION_MOVE: Double = js.native
  var ACTION_OUTSIDE: Double = js.native
  var ACTION_POINTER_DOWN: Double = js.native
  var ACTION_POINTER_INDEX_MASK: Double = js.native
  var ACTION_POINTER_INDEX_SHIFT: Double = js.native
  var ACTION_POINTER_UP: Double = js.native
  var ACTION_SCROLL: Double = js.native
  var ACTION_UP: Double = js.native
  var AXIS_HSCROLL: Double = js.native
  var AXIS_VSCROLL: Double = js.native
  var EDGE_BOTTOM: Double = js.native
  var EDGE_LEFT: Double = js.native
  var EDGE_RIGHT: Double = js.native
  var EDGE_TOP: Double = js.native
  var HistoryMaxSize: Double = js.native
  var INVALID_POINTER_ID: Double = js.native
  var IdIndexCache: js.Any = js.native
  var TouchMoveRecord: js.Any = js.native
  def obtain(event: MotionEvent): MotionEvent = js.native
  def obtainWithAction(downTime: Double, eventTime: Double, action: Double, x: Double, y: Double): MotionEvent = js.native
  def obtainWithAction(downTime: Double, eventTime: Double, action: Double, x: Double, y: Double, metaState: Double): MotionEvent = js.native
  def obtainWithTouchEvent(e: js.Any, action: Double): MotionEvent = js.native
}

