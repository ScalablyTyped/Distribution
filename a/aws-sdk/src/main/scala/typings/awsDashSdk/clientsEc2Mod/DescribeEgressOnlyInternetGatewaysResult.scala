package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEgressOnlyInternetGatewaysResult extends js.Object {
  /**
    * Information about the egress-only internet gateways.
    */
  var EgressOnlyInternetGateways: js.UndefOr[EgressOnlyInternetGatewayList] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeEgressOnlyInternetGatewaysResult {
  @scala.inline
  def apply(EgressOnlyInternetGateways: EgressOnlyInternetGatewayList = null, NextToken: String = null): DescribeEgressOnlyInternetGatewaysResult = {
    val __obj = js.Dynamic.literal()
    if (EgressOnlyInternetGateways != null) __obj.updateDynamic("EgressOnlyInternetGateways")(EgressOnlyInternetGateways.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEgressOnlyInternetGatewaysResult]
  }
}

