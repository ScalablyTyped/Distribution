package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDirectConnectGatewayAssociationRequest extends js.Object {
  /**
    * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
    */
  var addAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.native
  /**
    * The ID of the Direct Connect gateway association.
    */
  var associationId: js.UndefOr[DirectConnectGatewayAssociationId] = js.native
  /**
    * The Amazon VPC prefixes to no longer advertise to the Direct Connect gateway.
    */
  var removeAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.native
}

object UpdateDirectConnectGatewayAssociationRequest {
  @scala.inline
  def apply(
    addAllowedPrefixesToDirectConnectGateway: RouteFilterPrefixList = null,
    associationId: DirectConnectGatewayAssociationId = null,
    removeAllowedPrefixesToDirectConnectGateway: RouteFilterPrefixList = null
  ): UpdateDirectConnectGatewayAssociationRequest = {
    val __obj = js.Dynamic.literal()
    if (addAllowedPrefixesToDirectConnectGateway != null) __obj.updateDynamic("addAllowedPrefixesToDirectConnectGateway")(addAllowedPrefixesToDirectConnectGateway.asInstanceOf[js.Any])
    if (associationId != null) __obj.updateDynamic("associationId")(associationId.asInstanceOf[js.Any])
    if (removeAllowedPrefixesToDirectConnectGateway != null) __obj.updateDynamic("removeAllowedPrefixesToDirectConnectGateway")(removeAllowedPrefixesToDirectConnectGateway.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDirectConnectGatewayAssociationRequest]
  }
}

