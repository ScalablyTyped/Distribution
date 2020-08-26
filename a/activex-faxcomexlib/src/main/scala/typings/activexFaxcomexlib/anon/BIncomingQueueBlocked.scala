package typings.activexFaxcomexlib.anon

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BIncomingQueueBlocked extends js.Object {
  val bIncomingQueueBlocked: Boolean = js.native
  val bOutgoingQueueBlocked: Boolean = js.native
  val bOutgoingQueuePaused: Boolean = js.native
  val pFaxServer: FaxServer = js.native
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
  @scala.inline
  implicit class BIncomingQueueBlockedOps[Self <: BIncomingQueueBlocked] (val x: Self) extends AnyVal {
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
    def setBIncomingQueueBlocked(value: Boolean): Self = this.set("bIncomingQueueBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def setBOutgoingQueueBlocked(value: Boolean): Self = this.set("bOutgoingQueueBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def setBOutgoingQueuePaused(value: Boolean): Self = this.set("bOutgoingQueuePaused", value.asInstanceOf[js.Any])
    @scala.inline
    def setPFaxServer(value: FaxServer): Self = this.set("pFaxServer", value.asInstanceOf[js.Any])
  }
  
}

