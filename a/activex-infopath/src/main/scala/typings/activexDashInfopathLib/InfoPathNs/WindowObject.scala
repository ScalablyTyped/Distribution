package typings
package activexDashInfopathLib.InfoPathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.WindowObject")
@js.native
class WindowObject protected () extends js.Object {
  val Active: scala.Boolean = js.native
  var Caption: java.lang.String = js.native
  val CommandBars: js.Any = js.native
  var Height: scala.Double = js.native
  var `InfoPath.WindowObject_typekey`: WindowObject = js.native
  var Left: scala.Double = js.native
  val MailEnvelope: MailEnvelopeObject = js.native
  val TaskPanes: TaskPanesCollection = js.native
  var Top: scala.Double = js.native
  val Type: XdWindowType = js.native
  var Width: scala.Double = js.native
  var WindowState: XdWindowState = js.native
  val XDocument: _XDocument = js.native
  def Activate(): scala.Unit = js.native
  /** @param boolean [fForce=false] */
  def Close(): scala.Unit = js.native
  def Close(fForce: scala.Boolean): scala.Unit = js.native
}

