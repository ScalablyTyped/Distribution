package typings
package activexDashInfopathLib.InfoPathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.Window")
@js.native
class Window protected () extends js.Object {
  val Active: scala.Boolean = js.native
  val CommandBars: js.Any = js.native
  var `InfoPath.Window_typekey`: Window = js.native
  val MailEnvelope: MailEnvelopeObject = js.native
  val TaskPanes: TaskPanesCollection = js.native
  val Type: XdWindowType = js.native
  val XDocument: _XDocument = js.native
  def Activate(): scala.Unit = js.native
  /** @param boolean [fForce=false] */
  def Close(): scala.Unit = js.native
  /** @param boolean [fForce=false] */
  def Close(fForce: scala.Boolean): scala.Unit = js.native
}

