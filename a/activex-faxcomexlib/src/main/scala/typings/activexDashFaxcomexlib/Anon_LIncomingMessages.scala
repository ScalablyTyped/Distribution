package typings.activexDashFaxcomexlib

import typings.activexDashFaxcomexlib.FAXCOMEXLib.FaxServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LIncomingMessages extends js.Object {
  val lIncomingMessages: Double
  val lOutgoingMessages: Double
  val lQueuedMessages: Double
  val lRoutingMessages: Double
  val pFaxServer: FaxServer
}

object Anon_LIncomingMessages {
  @scala.inline
  def apply(
    lIncomingMessages: Double,
    lOutgoingMessages: Double,
    lQueuedMessages: Double,
    lRoutingMessages: Double,
    pFaxServer: FaxServer
  ): Anon_LIncomingMessages = {
    val __obj = js.Dynamic.literal(lIncomingMessages = lIncomingMessages, lOutgoingMessages = lOutgoingMessages, lQueuedMessages = lQueuedMessages, lRoutingMessages = lRoutingMessages, pFaxServer = pFaxServer)
  
    __obj.asInstanceOf[Anon_LIncomingMessages]
  }
}

