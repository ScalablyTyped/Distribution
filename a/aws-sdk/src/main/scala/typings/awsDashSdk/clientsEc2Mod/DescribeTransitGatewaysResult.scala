package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTransitGatewaysResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the transit gateways.
    */
  var TransitGateways: js.UndefOr[TransitGatewayList] = js.native
}

object DescribeTransitGatewaysResult {
  @scala.inline
  def apply(NextToken: String = null, TransitGateways: TransitGatewayList = null): DescribeTransitGatewaysResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (TransitGateways != null) __obj.updateDynamic("TransitGateways")(TransitGateways.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTransitGatewaysResult]
  }
}

