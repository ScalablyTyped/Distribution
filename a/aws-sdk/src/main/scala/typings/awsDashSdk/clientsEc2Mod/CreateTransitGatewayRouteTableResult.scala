package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTransitGatewayRouteTableResult extends js.Object {
  /**
    * Information about the transit gateway route table.
    */
  var TransitGatewayRouteTable: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.TransitGatewayRouteTable] = js.undefined
}

object CreateTransitGatewayRouteTableResult {
  @scala.inline
  def apply(TransitGatewayRouteTable: TransitGatewayRouteTable = null): CreateTransitGatewayRouteTableResult = {
    val __obj = js.Dynamic.literal()
    if (TransitGatewayRouteTable != null) __obj.updateDynamic("TransitGatewayRouteTable")(TransitGatewayRouteTable)
    __obj.asInstanceOf[CreateTransitGatewayRouteTableResult]
  }
}

