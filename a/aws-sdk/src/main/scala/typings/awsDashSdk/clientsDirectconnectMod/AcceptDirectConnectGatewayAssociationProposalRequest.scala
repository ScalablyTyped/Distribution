package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptDirectConnectGatewayAssociationProposalRequest extends js.Object {
  /**
    * The ID of the AWS account that owns the virtual private gateway or transit gateway.
    */
  var associatedGatewayOwnerAccount: OwnerAccount = js.native
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: DirectConnectGatewayId = js.native
  /**
    * Overrides the Amazon VPC prefixes advertised to the Direct Connect gateway. For information about how to set the prefixes, see Allowed Prefixes in the AWS Direct Connect User Guide.
    */
  var overrideAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.native
  /**
    * The ID of the request proposal.
    */
  var proposalId: DirectConnectGatewayAssociationProposalId = js.native
}

object AcceptDirectConnectGatewayAssociationProposalRequest {
  @scala.inline
  def apply(
    associatedGatewayOwnerAccount: OwnerAccount,
    directConnectGatewayId: DirectConnectGatewayId,
    proposalId: DirectConnectGatewayAssociationProposalId,
    overrideAllowedPrefixesToDirectConnectGateway: RouteFilterPrefixList = null
  ): AcceptDirectConnectGatewayAssociationProposalRequest = {
    val __obj = js.Dynamic.literal(associatedGatewayOwnerAccount = associatedGatewayOwnerAccount.asInstanceOf[js.Any], directConnectGatewayId = directConnectGatewayId.asInstanceOf[js.Any], proposalId = proposalId.asInstanceOf[js.Any])
    if (overrideAllowedPrefixesToDirectConnectGateway != null) __obj.updateDynamic("overrideAllowedPrefixesToDirectConnectGateway")(overrideAllowedPrefixesToDirectConnectGateway.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptDirectConnectGatewayAssociationProposalRequest]
  }
}

