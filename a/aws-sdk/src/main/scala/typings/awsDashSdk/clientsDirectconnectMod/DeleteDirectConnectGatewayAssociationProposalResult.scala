package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDirectConnectGatewayAssociationProposalResult extends js.Object {
  /**
    * The ID of the associated gateway.
    */
  var directConnectGatewayAssociationProposal: js.UndefOr[DirectConnectGatewayAssociationProposal] = js.undefined
}

object DeleteDirectConnectGatewayAssociationProposalResult {
  @scala.inline
  def apply(directConnectGatewayAssociationProposal: DirectConnectGatewayAssociationProposal = null): DeleteDirectConnectGatewayAssociationProposalResult = {
    val __obj = js.Dynamic.literal()
    if (directConnectGatewayAssociationProposal != null) __obj.updateDynamic("directConnectGatewayAssociationProposal")(directConnectGatewayAssociationProposal)
    __obj.asInstanceOf[DeleteDirectConnectGatewayAssociationProposalResult]
  }
}

