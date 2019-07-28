package typings.androiduix.androidNs.viewNs.KeyEventNs

import typings.androiduix.androidNs.utilNs.SparseArray
import typings.androiduix.androidNs.viewNs.KeyEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.KeyEvent.DispatcherState")
@js.native
class DispatcherState () extends js.Object {
  var mActiveLongPresses: SparseArray[Double] = js.native
  var mDownKeyCode: Double = js.native
  var mDownTarget: js.Any = js.native
  def handleUpEvent(event: KeyEvent): Unit = js.native
  def isTracking(event: KeyEvent): Boolean = js.native
  def performedLongPress(event: KeyEvent): Unit = js.native
  def reset(target: js.Any): Unit = js.native
  def startTracking(event: KeyEvent, target: js.Any): Unit = js.native
}

