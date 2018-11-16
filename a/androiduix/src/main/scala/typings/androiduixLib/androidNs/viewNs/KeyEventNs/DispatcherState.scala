package typings
package androiduixLib.androidNs.viewNs.KeyEventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.KeyEvent.DispatcherState")
@js.native
class DispatcherState () extends js.Object {
  var mActiveLongPresses: androiduixLib.androidNs.utilNs.SparseArray[scala.Double] = js.native
  var mDownKeyCode: scala.Double = js.native
  var mDownTarget: js.Any = js.native
  def handleUpEvent(event: androiduixLib.androidNs.viewNs.KeyEvent): scala.Unit = js.native
  def isTracking(event: androiduixLib.androidNs.viewNs.KeyEvent): scala.Boolean = js.native
  def performedLongPress(event: androiduixLib.androidNs.viewNs.KeyEvent): scala.Unit = js.native
  def reset(target: js.Any): scala.Unit = js.native
  def startTracking(event: androiduixLib.androidNs.viewNs.KeyEvent, target: js.Any): scala.Unit = js.native
}

