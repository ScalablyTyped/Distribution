package typings
package activexDashFaxcomexlibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LIncomingMessages extends js.Object {
  val lIncomingMessages: scala.Double
  val lOutgoingMessages: scala.Double
  val lQueuedMessages: scala.Double
  val lRoutingMessages: scala.Double
  val pFaxServer: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer
}

object Anon_LIncomingMessages {
  @scala.inline
  def apply(
    lIncomingMessages: scala.Double,
    lOutgoingMessages: scala.Double,
    lQueuedMessages: scala.Double,
    lRoutingMessages: scala.Double,
    pFaxServer: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer
  ): Anon_LIncomingMessages = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lIncomingMessages")(lIncomingMessages)
    __obj.updateDynamic("lOutgoingMessages")(lOutgoingMessages)
    __obj.updateDynamic("lQueuedMessages")(lQueuedMessages)
    __obj.updateDynamic("lRoutingMessages")(lRoutingMessages)
    __obj.updateDynamic("pFaxServer")(pFaxServer)
    __obj.asInstanceOf[Anon_LIncomingMessages]
  }
}

