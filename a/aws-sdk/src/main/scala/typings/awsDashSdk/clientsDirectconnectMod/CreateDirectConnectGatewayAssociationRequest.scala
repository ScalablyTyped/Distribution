package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDirectConnectGatewayAssociationRequest extends js.Object {
  /**
    * The Amazon VPC prefixes to advertise to the Direct Connect gateway This parameter is required when you create an association to a transit gateway. For information about how to set the prefixes, see Allowed Prefixes in the AWS Direct Connect User Guide.
    */
  var addAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.undefined
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: DirectConnectGatewayId
  /**
    * The ID of the virtual private gateway or transit gateway.
    */
  var gatewayId: js.UndefOr[GatewayIdToAssociate] = js.undefined
  /**
    * The ID of the virtual private gateway.
    */
  var virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined
}

object CreateDirectConnectGatewayAssociationRequest {
  @scala.inline
  def apply(
    directConnectGatewayId: DirectConnectGatewayId,
    addAllowedPrefixesToDirectConnectGateway: RouteFilterPrefixList = null,
    gatewayId: GatewayIdToAssociate = null,
    virtualGatewayId: VirtualGatewayId = null
  ): CreateDirectConnectGatewayAssociationRequest = {
    val __obj = js.Dynamic.literal(directConnectGatewayId = directConnectGatewayId)
    if (addAllowedPrefixesToDirectConnectGateway != null) __obj.updateDynamic("addAllowedPrefixesToDirectConnectGateway")(addAllowedPrefixesToDirectConnectGateway)
    if (gatewayId != null) __obj.updateDynamic("gatewayId")(gatewayId)
    if (virtualGatewayId != null) __obj.updateDynamic("virtualGatewayId")(virtualGatewayId)
    __obj.asInstanceOf[CreateDirectConnectGatewayAssociationRequest]
  }
}

