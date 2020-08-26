package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxActivity Class */
@js.native
trait FaxActivity extends js.Object {
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
  @scala.inline
  implicit class FaxActivityOps[Self <: FaxActivity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFAXCOMEXLibDotFaxActivity_typekey(value: FaxActivity): Self = this.set("FAXCOMEXLib.FaxActivity_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncomingMessages(value: Double): Self = this.set("IncomingMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutgoingMessages(value: Double): Self = this.set("OutgoingMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueuedMessages(value: Double): Self = this.set("QueuedMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefresh(value: () => Unit): Self = this.set("Refresh", js.Any.fromFunction0(value))
    @scala.inline
    def setRoutingMessages(value: Double): Self = this.set("RoutingMessages", value.asInstanceOf[js.Any])
  }
  
}

