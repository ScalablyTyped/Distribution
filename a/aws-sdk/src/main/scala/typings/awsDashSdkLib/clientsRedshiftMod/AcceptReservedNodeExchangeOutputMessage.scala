package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceptReservedNodeExchangeOutputMessage extends js.Object {
  var ExchangedReservedNode: js.UndefOr[ReservedNode] = js.undefined
}

object AcceptReservedNodeExchangeOutputMessage {
  @scala.inline
  def apply(ExchangedReservedNode: ReservedNode = null): AcceptReservedNodeExchangeOutputMessage = {
    val __obj = js.Dynamic.literal()
    if (ExchangedReservedNode != null) __obj.updateDynamic("ExchangedReservedNode")(ExchangedReservedNode)
    __obj.asInstanceOf[AcceptReservedNodeExchangeOutputMessage]
  }
}

