package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeClientVpnEndpointsResult extends js.Object {
  /**
    * Information about the Client VPN endpoints.
    */
  var ClientVpnEndpoints: js.UndefOr[EndpointSet] = js.undefined
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeClientVpnEndpointsResult {
  @scala.inline
  def apply(ClientVpnEndpoints: EndpointSet = null, NextToken: NextToken = null): DescribeClientVpnEndpointsResult = {
    val __obj = js.Dynamic.literal()
    if (ClientVpnEndpoints != null) __obj.updateDynamic("ClientVpnEndpoints")(ClientVpnEndpoints)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeClientVpnEndpointsResult]
  }
}

