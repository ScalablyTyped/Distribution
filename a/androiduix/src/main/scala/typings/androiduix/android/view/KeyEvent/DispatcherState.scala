package typings.androiduix.android.view.KeyEvent

import typings.androiduix.android.util.SparseArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.KeyEvent.DispatcherState")
@js.native
class DispatcherState () extends js.Object {
  var mActiveLongPresses: SparseArray[Double] = js.native
  var mDownKeyCode: Double = js.native
  var mDownTarget: js.Any = js.native
  def handleUpEvent(event: typings.androiduix.android.view.KeyEvent): Unit = js.native
  def isTracking(event: typings.androiduix.android.view.KeyEvent): Boolean = js.native
  def performedLongPress(event: typings.androiduix.android.view.KeyEvent): Unit = js.native
  def reset(target: js.Any): Unit = js.native
  def startTracking(event: typings.androiduix.android.view.KeyEvent, target: js.Any): Unit = js.native
}

