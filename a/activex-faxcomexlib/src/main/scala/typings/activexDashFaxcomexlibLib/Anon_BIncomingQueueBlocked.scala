package typings
package activexDashFaxcomexlibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BIncomingQueueBlocked extends js.Object {
  val bIncomingQueueBlocked: scala.Boolean
  val bOutgoingQueueBlocked: scala.Boolean
  val bOutgoingQueuePaused: scala.Boolean
  val pFaxServer: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer
}

object Anon_BIncomingQueueBlocked {
  @scala.inline
  def apply(
    bIncomingQueueBlocked: scala.Boolean,
    bOutgoingQueueBlocked: scala.Boolean,
    bOutgoingQueuePaused: scala.Boolean,
    pFaxServer: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer
  ): Anon_BIncomingQueueBlocked = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bIncomingQueueBlocked")(bIncomingQueueBlocked)
    __obj.updateDynamic("bOutgoingQueueBlocked")(bOutgoingQueueBlocked)
    __obj.updateDynamic("bOutgoingQueuePaused")(bOutgoingQueuePaused)
    __obj.updateDynamic("pFaxServer")(pFaxServer)
    __obj.asInstanceOf[Anon_BIncomingQueueBlocked]
  }
}

