package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDirectConnectGatewayAssociationProposalRequest extends js.Object {
  /**
    * The ID of the proposal.
    */
  var proposalId: DirectConnectGatewayAssociationProposalId = js.native
}

object DeleteDirectConnectGatewayAssociationProposalRequest {
  @scala.inline
  def apply(proposalId: DirectConnectGatewayAssociationProposalId): DeleteDirectConnectGatewayAssociationProposalRequest = {
    val __obj = js.Dynamic.literal(proposalId = proposalId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteDirectConnectGatewayAssociationProposalRequest]
  }
}

