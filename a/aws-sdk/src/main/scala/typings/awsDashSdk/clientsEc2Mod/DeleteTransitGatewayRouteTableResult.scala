package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTransitGatewayRouteTableResult extends js.Object {
  /**
    * Information about the deleted transit gateway route table.
    */
  var TransitGatewayRouteTable: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.TransitGatewayRouteTable] = js.native
}

object DeleteTransitGatewayRouteTableResult {
  @scala.inline
  def apply(TransitGatewayRouteTable: TransitGatewayRouteTable = null): DeleteTransitGatewayRouteTableResult = {
    val __obj = js.Dynamic.literal()
    if (TransitGatewayRouteTable != null) __obj.updateDynamic("TransitGatewayRouteTable")(TransitGatewayRouteTable.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTransitGatewayRouteTableResult]
  }
}

