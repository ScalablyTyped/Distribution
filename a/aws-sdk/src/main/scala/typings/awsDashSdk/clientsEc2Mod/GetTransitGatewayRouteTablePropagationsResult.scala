package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTransitGatewayRouteTablePropagationsResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the route table propagations.
    */
  var TransitGatewayRouteTablePropagations: js.UndefOr[TransitGatewayRouteTablePropagationList] = js.native
}

object GetTransitGatewayRouteTablePropagationsResult {
  @scala.inline
  def apply(
    NextToken: String = null,
    TransitGatewayRouteTablePropagations: TransitGatewayRouteTablePropagationList = null
  ): GetTransitGatewayRouteTablePropagationsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (TransitGatewayRouteTablePropagations != null) __obj.updateDynamic("TransitGatewayRouteTablePropagations")(TransitGatewayRouteTablePropagations.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTransitGatewayRouteTablePropagationsResult]
  }
}

