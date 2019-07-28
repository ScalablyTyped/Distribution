package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDirectConnectGatewayAssociationProposalRequest extends js.Object {
  /**
    * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
    */
  var addAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.undefined
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: DirectConnectGatewayId
  /**
    * The ID of the AWS account that owns the Direct Connect gateway.
    */
  var directConnectGatewayOwnerAccount: OwnerAccount
  /**
    * The ID of the virtual private gateway or transit gateway.
    */
  var gatewayId: GatewayIdToAssociate
  /**
    * The Amazon VPC prefixes to no longer advertise to the Direct Connect gateway.
    */
  var removeAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.undefined
}

object CreateDirectConnectGatewayAssociationProposalRequest {
  @scala.inline
  def apply(
    directConnectGatewayId: DirectConnectGatewayId,
    directConnectGatewayOwnerAccount: OwnerAccount,
    gatewayId: GatewayIdToAssociate,
    addAllowedPrefixesToDirectConnectGateway: RouteFilterPrefixList = null,
    removeAllowedPrefixesToDirectConnectGateway: RouteFilterPrefixList = null
  ): CreateDirectConnectGatewayAssociationProposalRequest = {
    val __obj = js.Dynamic.literal(directConnectGatewayId = directConnectGatewayId, directConnectGatewayOwnerAccount = directConnectGatewayOwnerAccount, gatewayId = gatewayId)
    if (addAllowedPrefixesToDirectConnectGateway != null) __obj.updateDynamic("addAllowedPrefixesToDirectConnectGateway")(addAllowedPrefixesToDirectConnectGateway)
    if (removeAllowedPrefixesToDirectConnectGateway != null) __obj.updateDynamic("removeAllowedPrefixesToDirectConnectGateway")(removeAllowedPrefixesToDirectConnectGateway)
    __obj.asInstanceOf[CreateDirectConnectGatewayAssociationProposalRequest]
  }
}

