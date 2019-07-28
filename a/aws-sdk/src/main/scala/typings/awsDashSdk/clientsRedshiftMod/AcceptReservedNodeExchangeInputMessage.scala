package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceptReservedNodeExchangeInputMessage extends js.Object {
  /**
    * A string representing the node identifier of the DC1 Reserved Node to be exchanged.
    */
  var ReservedNodeId: String
  /**
    * The unique identifier of the DC2 Reserved Node offering to be used for the exchange. You can obtain the value for the parameter by calling GetReservedNodeExchangeOfferings 
    */
  var TargetReservedNodeOfferingId: String
}

object AcceptReservedNodeExchangeInputMessage {
  @scala.inline
  def apply(ReservedNodeId: String, TargetReservedNodeOfferingId: String): AcceptReservedNodeExchangeInputMessage = {
    val __obj = js.Dynamic.literal(ReservedNodeId = ReservedNodeId, TargetReservedNodeOfferingId = TargetReservedNodeOfferingId)
  
    __obj.asInstanceOf[AcceptReservedNodeExchangeInputMessage]
  }
}

