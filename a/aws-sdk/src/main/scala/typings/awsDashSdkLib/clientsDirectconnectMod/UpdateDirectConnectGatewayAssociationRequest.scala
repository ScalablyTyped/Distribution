package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDirectConnectGatewayAssociationRequest extends js.Object {
  /**
    * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
    */
  var addAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.undefined
  /**
    * The ID of the Direct Connect gateway association.
    */
  var associationId: js.UndefOr[DirectConnectGatewayAssociationId] = js.undefined
  /**
    * The Amazon VPC prefixes to no longer advertise to the Direct Connect gateway.
    */
  var removeAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.undefined
}

object UpdateDirectConnectGatewayAssociationRequest {
  @scala.inline
  def apply(
    addAllowedPrefixesToDirectConnectGateway: RouteFilterPrefixList = null,
    associationId: DirectConnectGatewayAssociationId = null,
    removeAllowedPrefixesToDirectConnectGateway: RouteFilterPrefixList = null
  ): UpdateDirectConnectGatewayAssociationRequest = {
    val __obj = js.Dynamic.literal()
    if (addAllowedPrefixesToDirectConnectGateway != null) __obj.updateDynamic("addAllowedPrefixesToDirectConnectGateway")(addAllowedPrefixesToDirectConnectGateway)
    if (associationId != null) __obj.updateDynamic("associationId")(associationId)
    if (removeAllowedPrefixesToDirectConnectGateway != null) __obj.updateDynamic("removeAllowedPrefixesToDirectConnectGateway")(removeAllowedPrefixesToDirectConnectGateway)
    __obj.asInstanceOf[UpdateDirectConnectGatewayAssociationRequest]
  }
}

