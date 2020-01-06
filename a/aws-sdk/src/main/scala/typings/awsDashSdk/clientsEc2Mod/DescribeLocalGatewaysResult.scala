package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLocalGatewaysResult extends js.Object {
  /**
    * Information about the local gateways.
    */
  var LocalGateways: js.UndefOr[LocalGatewaySet] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeLocalGatewaysResult {
  @scala.inline
  def apply(LocalGateways: LocalGatewaySet = null, NextToken: String = null): DescribeLocalGatewaysResult = {
    val __obj = js.Dynamic.literal()
    if (LocalGateways != null) __obj.updateDynamic("LocalGateways")(LocalGateways.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLocalGatewaysResult]
  }
}

