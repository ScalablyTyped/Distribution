package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTransitGatewaysResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Information about the transit gateways.
    */
  var TransitGateways: js.UndefOr[TransitGatewayList] = js.undefined
}

object DescribeTransitGatewaysResult {
  @scala.inline
  def apply(NextToken: String = null, TransitGateways: TransitGatewayList = null): DescribeTransitGatewaysResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (TransitGateways != null) __obj.updateDynamic("TransitGateways")(TransitGateways)
    __obj.asInstanceOf[DescribeTransitGatewaysResult]
  }
}

