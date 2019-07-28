package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDirectConnectGatewayAssociationProposalRequest extends js.Object {
  /**
    * The ID of the proposal.
    */
  var proposalId: DirectConnectGatewayAssociationProposalId
}

object DeleteDirectConnectGatewayAssociationProposalRequest {
  @scala.inline
  def apply(proposalId: DirectConnectGatewayAssociationProposalId): DeleteDirectConnectGatewayAssociationProposalRequest = {
    val __obj = js.Dynamic.literal(proposalId = proposalId)
  
    __obj.asInstanceOf[DeleteDirectConnectGatewayAssociationProposalRequest]
  }
}

