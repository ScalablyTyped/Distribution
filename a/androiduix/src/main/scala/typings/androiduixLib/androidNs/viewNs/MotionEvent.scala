package typings
package androiduixLib.androidNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.MotionEvent")
@js.native
class MotionEvent () extends js.Object {
  var _activeTouch: js.Any = js.native
  var _axisValues: js.Any = js.native
  var mAction: scala.Double = js.native
  var mActivePointerId: scala.Double = js.native
  var mDownTime: scala.Double = js.native
  var mEdgeFlags: scala.Double = js.native
  var mEventTime: scala.Double = js.native
  var mTouchingPointers: js.Any = js.native
  var mXOffset: scala.Double = js.native
  var mYOffset: scala.Double = js.native
  def findPointerIndex(pointerId: scala.Double): scala.Double = js.native
  def getAction(): scala.Double = js.native
  def getActionIndex(): scala.Double = js.native
  def getActionMasked(): scala.Double = js.native
  def getAxisValue(axis: scala.Double): scala.Double = js.native
  def getDownTime(): scala.Double = js.native
  def getEdgeFlags(): scala.Double = js.native
  def getEventTime(): scala.Double = js.native
  def getHistoricalEventTime(pointerIndex: scala.Double, pos: scala.Double): scala.Double = js.native
  def getHistoricalEventTime(pos: scala.Double): scala.Double = js.native
  def getHistoricalTouchMajor(): scala.Double = js.native
  def getHistoricalTouchMajor(pointerIndex: scala.Double): scala.Double = js.native
  def getHistoricalTouchMajor(pointerIndex: scala.Double, pos: scala.Double): scala.Double = js.native
  def getHistoricalX(pointerIndex: scala.Double, pos: scala.Double): scala.Double = js.native
  def getHistoricalY(pointerIndex: scala.Double, pos: scala.Double): scala.Double = js.native
  def getHistorySize(): scala.Double = js.native
  def getHistorySize(id: scala.Double): scala.Double = js.native
  def getPointerCount(): scala.Double = js.native
  def getPointerId(pointerIndex: scala.Double): scala.Double = js.native
  def getPointerIdBits(): scala.Double = js.native
  def getRawX(): scala.Double = js.native
  def getRawY(): scala.Double = js.native
  def getTouchMajor(): scala.Double = js.native
  def getTouchMajor(pointerIndex: scala.Double): scala.Double = js.native
  def getX(): scala.Double = js.native
  def getX(pointerIndex: scala.Double): scala.Double = js.native
  def getY(): scala.Double = js.native
  def getY(pointerIndex: scala.Double): scala.Double = js.native
  def initWithMouseWheel(e: stdLib.WheelEvent): scala.Unit = js.native
  def initWithTouch(event: js.Any, baseAction: scala.Double): scala.Unit = js.native
  def initWithTouch(event: js.Any, baseAction: scala.Double, windowBound: androiduixLib.androidNs.graphicsNs.Rect): scala.Unit = js.native
  def isPointerEvent(): scala.Boolean = js.native
  def isTouchEvent(): scala.Boolean = js.native
  def offsetLocation(deltaX: scala.Double, deltaY: scala.Double): scala.Unit = js.native
  def recycle(): scala.Unit = js.native
  def setAction(action: scala.Double): scala.Unit = js.native
  def setEdgeFlags(flags: scala.Double): scala.Unit = js.native
  def setLocation(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def split(idBits: scala.Double): MotionEvent = js.native
}

/* static members */
@JSGlobal("android.view.MotionEvent")
@js.native
object MotionEvent extends js.Object {
  var ACTION_CANCEL: scala.Double = js.native
  var ACTION_DOWN: scala.Double = js.native
  var ACTION_HOVER_ENTER: scala.Double = js.native
  var ACTION_HOVER_EXIT: scala.Double = js.native
  var ACTION_HOVER_MOVE: scala.Double = js.native
  var ACTION_MASK: scala.Double = js.native
  var ACTION_MOVE: scala.Double = js.native
  var ACTION_OUTSIDE: scala.Double = js.native
  var ACTION_POINTER_DOWN: scala.Double = js.native
  var ACTION_POINTER_INDEX_MASK: scala.Double = js.native
  var ACTION_POINTER_INDEX_SHIFT: scala.Double = js.native
  var ACTION_POINTER_UP: scala.Double = js.native
  var ACTION_SCROLL: scala.Double = js.native
  var ACTION_UP: scala.Double = js.native
  var AXIS_HSCROLL: scala.Double = js.native
  var AXIS_VSCROLL: scala.Double = js.native
  var EDGE_BOTTOM: scala.Double = js.native
  var EDGE_LEFT: scala.Double = js.native
  var EDGE_RIGHT: scala.Double = js.native
  var EDGE_TOP: scala.Double = js.native
  var HistoryMaxSize: scala.Double = js.native
  var INVALID_POINTER_ID: scala.Double = js.native
  var IdIndexCache: js.Any = js.native
  var TouchMoveRecord: js.Any = js.native
  def obtain(event: androiduixLib.androidNs.viewNs.MotionEvent): androiduixLib.androidNs.viewNs.MotionEvent = js.native
  def obtainWithAction(
    downTime: scala.Double,
    eventTime: scala.Double,
    action: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): androiduixLib.androidNs.viewNs.MotionEvent = js.native
  def obtainWithAction(
    downTime: scala.Double,
    eventTime: scala.Double,
    action: scala.Double,
    x: scala.Double,
    y: scala.Double,
    metaState: scala.Double
  ): androiduixLib.androidNs.viewNs.MotionEvent = js.native
  def obtainWithTouchEvent(e: js.Any, action: scala.Double): androiduixLib.androidNs.viewNs.MotionEvent = js.native
}

