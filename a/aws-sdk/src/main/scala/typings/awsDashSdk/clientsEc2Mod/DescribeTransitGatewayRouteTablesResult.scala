package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTransitGatewayRouteTablesResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the transit gateway route tables.
    */
  var TransitGatewayRouteTables: js.UndefOr[TransitGatewayRouteTableList] = js.native
}

object DescribeTransitGatewayRouteTablesResult {
  @scala.inline
  def apply(NextToken: String = null, TransitGatewayRouteTables: TransitGatewayRouteTableList = null): DescribeTransitGatewayRouteTablesResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (TransitGatewayRouteTables != null) __obj.updateDynamic("TransitGatewayRouteTables")(TransitGatewayRouteTables.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTransitGatewayRouteTablesResult]
  }
}

