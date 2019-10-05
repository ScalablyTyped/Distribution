package typings.activexDashFaxcomexlib

import typings.activexDashFaxcomexlib.FAXCOMEXLib.FaxServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BIncomingQueueBlocked extends js.Object {
  val bIncomingQueueBlocked: Boolean
  val bOutgoingQueueBlocked: Boolean
  val bOutgoingQueuePaused: Boolean
  val pFaxServer: FaxServer
}

object Anon_BIncomingQueueBlocked {
  @scala.inline
  def apply(
    bIncomingQueueBlocked: Boolean,
    bOutgoingQueueBlocked: Boolean,
    bOutgoingQueuePaused: Boolean,
    pFaxServer: FaxServer
  ): Anon_BIncomingQueueBlocked = {
    val __obj = js.Dynamic.literal(bIncomingQueueBlocked = bIncomingQueueBlocked, bOutgoingQueueBlocked = bOutgoingQueueBlocked, bOutgoingQueuePaused = bOutgoingQueuePaused, pFaxServer = pFaxServer)
  
    __obj.asInstanceOf[Anon_BIncomingQueueBlocked]
  }
}

