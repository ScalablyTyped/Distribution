package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDirectConnectGatewayAssociationResult extends js.Object {
  var directConnectGatewayAssociation: js.UndefOr[DirectConnectGatewayAssociation] = js.undefined
}

object UpdateDirectConnectGatewayAssociationResult {
  @scala.inline
  def apply(directConnectGatewayAssociation: DirectConnectGatewayAssociation = null): UpdateDirectConnectGatewayAssociationResult = {
    val __obj = js.Dynamic.literal()
    if (directConnectGatewayAssociation != null) __obj.updateDynamic("directConnectGatewayAssociation")(directConnectGatewayAssociation)
    __obj.asInstanceOf[UpdateDirectConnectGatewayAssociationResult]
  }
}

