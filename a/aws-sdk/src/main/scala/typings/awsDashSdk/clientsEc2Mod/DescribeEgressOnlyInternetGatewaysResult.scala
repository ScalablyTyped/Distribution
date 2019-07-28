package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEgressOnlyInternetGatewaysResult extends js.Object {
  /**
    * Information about the egress-only internet gateways.
    */
  var EgressOnlyInternetGateways: js.UndefOr[EgressOnlyInternetGatewayList] = js.undefined
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeEgressOnlyInternetGatewaysResult {
  @scala.inline
  def apply(EgressOnlyInternetGateways: EgressOnlyInternetGatewayList = null, NextToken: String = null): DescribeEgressOnlyInternetGatewaysResult = {
    val __obj = js.Dynamic.literal()
    if (EgressOnlyInternetGateways != null) __obj.updateDynamic("EgressOnlyInternetGateways")(EgressOnlyInternetGateways)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeEgressOnlyInternetGatewaysResult]
  }
}

