package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxActivity Class */
trait FaxActivity extends js.Object {
  @JSName("FAXCOMEXLib.FaxActivity_typekey")
  var FAXCOMEXLibDotFaxActivity_typekey: FaxActivity
  /** Number of incoming messages */
  val IncomingMessages: Double
  /** Number of outgoing messages */
  val OutgoingMessages: Double
  /** Number of queued messages */
  val QueuedMessages: Double
  /** Number of routed incoming messages */
  val RoutingMessages: Double
  /** Refresh the object */
  def Refresh(): Unit
}

object FaxActivity {
  @scala.inline
  def apply(
    FAXCOMEXLibDotFaxActivity_typekey: FaxActivity,
    IncomingMessages: Double,
    OutgoingMessages: Double,
    QueuedMessages: Double,
    Refresh: () => Unit,
    RoutingMessages: Double
  ): FaxActivity = {
    val __obj = js.Dynamic.literal(IncomingMessages = IncomingMessages.asInstanceOf[js.Any], OutgoingMessages = OutgoingMessages.asInstanceOf[js.Any], QueuedMessages = QueuedMessages.asInstanceOf[js.Any], Refresh = js.Any.fromFunction0(Refresh), RoutingMessages = RoutingMessages.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxActivity_typekey")(FAXCOMEXLibDotFaxActivity_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxActivity]
  }
}

