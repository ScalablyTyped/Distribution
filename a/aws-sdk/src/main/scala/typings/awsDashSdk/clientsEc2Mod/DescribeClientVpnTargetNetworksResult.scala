package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeClientVpnTargetNetworksResult extends js.Object {
  /**
    * Information about the associated target networks.
    */
  var ClientVpnTargetNetworks: js.UndefOr[TargetNetworkSet] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.NextToken] = js.native
}

object DescribeClientVpnTargetNetworksResult {
  @scala.inline
  def apply(ClientVpnTargetNetworks: TargetNetworkSet = null, NextToken: NextToken = null): DescribeClientVpnTargetNetworksResult = {
    val __obj = js.Dynamic.literal()
    if (ClientVpnTargetNetworks != null) __obj.updateDynamic("ClientVpnTargetNetworks")(ClientVpnTargetNetworks.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClientVpnTargetNetworksResult]
  }
}

