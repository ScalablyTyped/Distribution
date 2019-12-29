package typings.activexDashFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxActivity Class */
@JSGlobal("FAXCOMEXLib.FaxActivity")
@js.native
class FaxActivity protected () extends js.Object {
  @JSName("FAXCOMEXLib.FaxActivity_typekey")
  var FAXCOMEXLibDotFaxActivity_typekey: FaxActivity = js.native
  /** Number of incoming messages */
  val IncomingMessages: Double = js.native
  /** Number of outgoing messages */
  val OutgoingMessages: Double = js.native
  /** Number of queued messages */
  val QueuedMessages: Double = js.native
  /** Number of routed incoming messages */
  val RoutingMessages: Double = js.native
  /** Refresh the object */
  def Refresh(): Unit = js.native
}

