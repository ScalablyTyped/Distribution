package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTransitGatewayRouteTablePropagationsResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Information about the route table propagations.
    */
  var TransitGatewayRouteTablePropagations: js.UndefOr[TransitGatewayRouteTablePropagationList] = js.undefined
}

object GetTransitGatewayRouteTablePropagationsResult {
  @scala.inline
  def apply(
    NextToken: String = null,
    TransitGatewayRouteTablePropagations: TransitGatewayRouteTablePropagationList = null
  ): GetTransitGatewayRouteTablePropagationsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (TransitGatewayRouteTablePropagations != null) __obj.updateDynamic("TransitGatewayRouteTablePropagations")(TransitGatewayRouteTablePropagations)
    __obj.asInstanceOf[GetTransitGatewayRouteTablePropagationsResult]
  }
}

