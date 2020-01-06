package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVpnGatewaysResult extends js.Object {
  /**
    * Information about one or more virtual private gateways.
    */
  var VpnGateways: js.UndefOr[VpnGatewayList] = js.native
}

object DescribeVpnGatewaysResult {
  @scala.inline
  def apply(VpnGateways: VpnGatewayList = null): DescribeVpnGatewaysResult = {
    val __obj = js.Dynamic.literal()
    if (VpnGateways != null) __obj.updateDynamic("VpnGateways")(VpnGateways.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVpnGatewaysResult]
  }
}

