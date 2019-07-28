package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeNatGatewaysResult extends js.Object {
  /**
    * Information about the NAT gateways.
    */
  var NatGateways: js.UndefOr[NatGatewayList] = js.undefined
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeNatGatewaysResult {
  @scala.inline
  def apply(NatGateways: NatGatewayList = null, NextToken: String = null): DescribeNatGatewaysResult = {
    val __obj = js.Dynamic.literal()
    if (NatGateways != null) __obj.updateDynamic("NatGateways")(NatGateways)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeNatGatewaysResult]
  }
}

