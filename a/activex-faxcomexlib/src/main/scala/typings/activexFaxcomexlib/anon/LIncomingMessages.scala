package typings.activexFaxcomexlib.anon

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LIncomingMessages extends js.Object {
  val lIncomingMessages: Double
  val lOutgoingMessages: Double
  val lQueuedMessages: Double
  val lRoutingMessages: Double
  val pFaxServer: FaxServer
}

object LIncomingMessages {
  @scala.inline
  def apply(
    lIncomingMessages: Double,
    lOutgoingMessages: Double,
    lQueuedMessages: Double,
    lRoutingMessages: Double,
    pFaxServer: FaxServer
  ): LIncomingMessages = {
    val __obj = js.Dynamic.literal(lIncomingMessages = lIncomingMessages.asInstanceOf[js.Any], lOutgoingMessages = lOutgoingMessages.asInstanceOf[js.Any], lQueuedMessages = lQueuedMessages.asInstanceOf[js.Any], lRoutingMessages = lRoutingMessages.asInstanceOf[js.Any], pFaxServer = pFaxServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[LIncomingMessages]
  }
}

