package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectConnectGatewayAssociationProposal extends js.Object {
  /**
    * Information about the associated gateway.
    */
  var associatedGateway: js.UndefOr[AssociatedGateway] = js.undefined
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined
  /**
    * The ID of the AWS account that owns the Direct Connect gateway.
    */
  var directConnectGatewayOwnerAccount: js.UndefOr[OwnerAccount] = js.undefined
  /**
    * The existing Amazon VPC prefixes advertised to the Direct Connect gateway.
    */
  var existingAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.undefined
  /**
    * The ID of the association proposal.
    */
  var proposalId: js.UndefOr[DirectConnectGatewayAssociationProposalId] = js.undefined
  /**
    * The state of the proposal. The following are possible values:    accepted: The proposal has been accepted. The Direct Connect gateway association is available to use in this state.    deleted: The proposal has been deleted by the owner that made the proposal. The Direct Connect gateway association cannot be used in this state.    requested: The proposal has been requested. The Direct Connect gateway association cannot be used in this state.  
    */
  var proposalState: js.UndefOr[DirectConnectGatewayAssociationProposalState] = js.undefined
  /**
    * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
    */
  var requestedAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.undefined
}

object DirectConnectGatewayAssociationProposal {
  @scala.inline
  def apply(
    associatedGateway: AssociatedGateway = null,
    directConnectGatewayId: DirectConnectGatewayId = null,
    directConnectGatewayOwnerAccount: OwnerAccount = null,
    existingAllowedPrefixesToDirectConnectGateway: RouteFilterPrefixList = null,
    proposalId: DirectConnectGatewayAssociationProposalId = null,
    proposalState: DirectConnectGatewayAssociationProposalState = null,
    requestedAllowedPrefixesToDirectConnectGateway: RouteFilterPrefixList = null
  ): DirectConnectGatewayAssociationProposal = {
    val __obj = js.Dynamic.literal()
    if (associatedGateway != null) __obj.updateDynamic("associatedGateway")(associatedGateway)
    if (directConnectGatewayId != null) __obj.updateDynamic("directConnectGatewayId")(directConnectGatewayId)
    if (directConnectGatewayOwnerAccount != null) __obj.updateDynamic("directConnectGatewayOwnerAccount")(directConnectGatewayOwnerAccount)
    if (existingAllowedPrefixesToDirectConnectGateway != null) __obj.updateDynamic("existingAllowedPrefixesToDirectConnectGateway")(existingAllowedPrefixesToDirectConnectGateway)
    if (proposalId != null) __obj.updateDynamic("proposalId")(proposalId)
    if (proposalState != null) __obj.updateDynamic("proposalState")(proposalState.asInstanceOf[js.Any])
    if (requestedAllowedPrefixesToDirectConnectGateway != null) __obj.updateDynamic("requestedAllowedPrefixesToDirectConnectGateway")(requestedAllowedPrefixesToDirectConnectGateway)
    __obj.asInstanceOf[DirectConnectGatewayAssociationProposal]
  }
}

