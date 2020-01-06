package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeClientVpnEndpointsResult extends js.Object {
  /**
    * Information about the Client VPN endpoints.
    */
  var ClientVpnEndpoints: js.UndefOr[EndpointSet] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.NextToken] = js.native
}

object DescribeClientVpnEndpointsResult {
  @scala.inline
  def apply(ClientVpnEndpoints: EndpointSet = null, NextToken: NextToken = null): DescribeClientVpnEndpointsResult = {
    val __obj = js.Dynamic.literal()
    if (ClientVpnEndpoints != null) __obj.updateDynamic("ClientVpnEndpoints")(ClientVpnEndpoints.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClientVpnEndpointsResult]
  }
}

