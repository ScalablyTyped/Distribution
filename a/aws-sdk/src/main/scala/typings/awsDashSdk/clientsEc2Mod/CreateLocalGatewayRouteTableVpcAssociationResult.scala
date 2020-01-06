package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLocalGatewayRouteTableVpcAssociationResult extends js.Object {
  /**
    * Information about the association.
    */
  var LocalGatewayRouteTableVpcAssociation: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.LocalGatewayRouteTableVpcAssociation] = js.native
}

object CreateLocalGatewayRouteTableVpcAssociationResult {
  @scala.inline
  def apply(LocalGatewayRouteTableVpcAssociation: LocalGatewayRouteTableVpcAssociation = null): CreateLocalGatewayRouteTableVpcAssociationResult = {
    val __obj = js.Dynamic.literal()
    if (LocalGatewayRouteTableVpcAssociation != null) __obj.updateDynamic("LocalGatewayRouteTableVpcAssociation")(LocalGatewayRouteTableVpcAssociation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLocalGatewayRouteTableVpcAssociationResult]
  }
}

