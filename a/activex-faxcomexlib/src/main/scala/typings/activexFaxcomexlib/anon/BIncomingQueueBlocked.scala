package typings.activexFaxcomexlib.anon

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BIncomingQueueBlocked extends js.Object {
  val bIncomingQueueBlocked: Boolean
  val bOutgoingQueueBlocked: Boolean
  val bOutgoingQueuePaused: Boolean
  val pFaxServer: FaxServer
}

object BIncomingQueueBlocked {
  @scala.inline
  def apply(
    bIncomingQueueBlocked: Boolean,
    bOutgoingQueueBlocked: Boolean,
    bOutgoingQueuePaused: Boolean,
    pFaxServer: FaxServer
  ): BIncomingQueueBlocked = {
    val __obj = js.Dynamic.literal(bIncomingQueueBlocked = bIncomingQueueBlocked.asInstanceOf[js.Any], bOutgoingQueueBlocked = bOutgoingQueueBlocked.asInstanceOf[js.Any], bOutgoingQueuePaused = bOutgoingQueuePaused.asInstanceOf[js.Any], pFaxServer = pFaxServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BIncomingQueueBlocked]
  }
}

