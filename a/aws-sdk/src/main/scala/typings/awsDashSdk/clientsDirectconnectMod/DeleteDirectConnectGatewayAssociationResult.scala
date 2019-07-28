package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDirectConnectGatewayAssociationResult extends js.Object {
  /**
    * Information about the deleted association.
    */
  var directConnectGatewayAssociation: js.UndefOr[DirectConnectGatewayAssociation] = js.undefined
}

object DeleteDirectConnectGatewayAssociationResult {
  @scala.inline
  def apply(directConnectGatewayAssociation: DirectConnectGatewayAssociation = null): DeleteDirectConnectGatewayAssociationResult = {
    val __obj = js.Dynamic.literal()
    if (directConnectGatewayAssociation != null) __obj.updateDynamic("directConnectGatewayAssociation")(directConnectGatewayAssociation)
    __obj.asInstanceOf[DeleteDirectConnectGatewayAssociationResult]
  }
}

