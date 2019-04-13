package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTransitGatewayRouteTableResult extends js.Object {
  /**
    * Information about the deleted transit gateway route table.
    */
  var TransitGatewayRouteTable: js.UndefOr[TransitGatewayRouteTable] = js.undefined
}

object DeleteTransitGatewayRouteTableResult {
  @scala.inline
  def apply(TransitGatewayRouteTable: TransitGatewayRouteTable = null): DeleteTransitGatewayRouteTableResult = {
    val __obj = js.Dynamic.literal()
    if (TransitGatewayRouteTable != null) __obj.updateDynamic("TransitGatewayRouteTable")(TransitGatewayRouteTable)
    __obj.asInstanceOf[DeleteTransitGatewayRouteTableResult]
  }
}

