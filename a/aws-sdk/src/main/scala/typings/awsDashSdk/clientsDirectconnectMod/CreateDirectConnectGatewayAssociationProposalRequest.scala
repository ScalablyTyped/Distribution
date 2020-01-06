package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDirectConnectGatewayAssociationProposalRequest extends js.Object {
  /**
    * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
    */
  var addAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.native
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: DirectConnectGatewayId = js.native
  /**
    * The ID of the AWS account that owns the Direct Connect gateway.
    */
  var directConnectGatewayOwnerAccount: OwnerAccount = js.native
  /**
    * The ID of the virtual private gateway or transit gateway.
    */
  var gatewayId: GatewayIdToAssociate = js.native
  /**
    * The Amazon VPC prefixes to no longer advertise to the Direct Connect gateway.
    */
  var removeAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.native
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
    val __obj = js.Dynamic.literal(directConnectGatewayId = directConnectGatewayId.asInstanceOf[js.Any], directConnectGatewayOwnerAccount = directConnectGatewayOwnerAccount.asInstanceOf[js.Any], gatewayId = gatewayId.asInstanceOf[js.Any])
    if (addAllowedPrefixesToDirectConnectGateway != null) __obj.updateDynamic("addAllowedPrefixesToDirectConnectGateway")(addAllowedPrefixesToDirectConnectGateway.asInstanceOf[js.Any])
    if (removeAllowedPrefixesToDirectConnectGateway != null) __obj.updateDynamic("removeAllowedPrefixesToDirectConnectGateway")(removeAllowedPrefixesToDirectConnectGateway.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDirectConnectGatewayAssociationProposalRequest]
  }
}

