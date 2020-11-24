package typings.androiduix.global.android.view

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.view.MotionEvent")
@js.native
class MotionEvent ()
  extends typings.androiduix.android.view.MotionEvent
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
  
  def obtain(event: typings.androiduix.android.view.MotionEvent): typings.androiduix.android.view.MotionEvent = js.native
  
  def obtainWithAction(downTime: Double, eventTime: Double, action: Double, x: Double, y: Double): typings.androiduix.android.view.MotionEvent = js.native
  def obtainWithAction(downTime: Double, eventTime: Double, action: Double, x: Double, y: Double, metaState: Double): typings.androiduix.android.view.MotionEvent = js.native
  
  def obtainWithTouchEvent(e: js.Any, action: Double): typings.androiduix.android.view.MotionEvent = js.native
}
