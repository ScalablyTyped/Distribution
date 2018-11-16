package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxActivity Class */
@JSGlobal("FAXCOMEXLib.FaxActivity")
@js.native
class FaxActivity protected () extends js.Object {
  var `FAXCOMEXLib.FaxActivity_typekey`: FaxActivity = js.native
  /** Number of incoming messages */
  val IncomingMessages: scala.Double = js.native
  /** Number of outgoing messages */
  val OutgoingMessages: scala.Double = js.native
  /** Number of queued messages */
  val QueuedMessages: scala.Double = js.native
  /** Number of routed incoming messages */
  val RoutingMessages: scala.Double = js.native
  /** Refresh the object */
  def Refresh(): scala.Unit = js.native
}

