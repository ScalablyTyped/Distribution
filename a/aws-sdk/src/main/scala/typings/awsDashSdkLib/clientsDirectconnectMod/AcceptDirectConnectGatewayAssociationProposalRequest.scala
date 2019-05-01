package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceptDirectConnectGatewayAssociationProposalRequest extends js.Object {
  /**
    * The ID of the AWS account that owns the virtual private gateway or transit gateway.
    */
  var associatedGatewayOwnerAccount: OwnerAccount
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: DirectConnectGatewayId
  /**
    * Overrides the existing Amazon VPC prefixes advertised to the Direct Connect gateway.
    */
  var overrideAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.undefined
  /**
    * The ID of the request proposal.
    */
  var proposalId: DirectConnectGatewayAssociationProposalId
}

object AcceptDirectConnectGatewayAssociationProposalRequest {
  @scala.inline
  def apply(
    associatedGatewayOwnerAccount: OwnerAccount,
    directConnectGatewayId: DirectConnectGatewayId,
    proposalId: DirectConnectGatewayAssociationProposalId,
    overrideAllowedPrefixesToDirectConnectGateway: RouteFilterPrefixList = null
  ): AcceptDirectConnectGatewayAssociationProposalRequest = {
    val __obj = js.Dynamic.literal(associatedGatewayOwnerAccount = associatedGatewayOwnerAccount, directConnectGatewayId = directConnectGatewayId, proposalId = proposalId)
    if (overrideAllowedPrefixesToDirectConnectGateway != null) __obj.updateDynamic("overrideAllowedPrefixesToDirectConnectGateway")(overrideAllowedPrefixesToDirectConnectGateway)
    __obj.asInstanceOf[AcceptDirectConnectGatewayAssociationProposalRequest]
  }
}

