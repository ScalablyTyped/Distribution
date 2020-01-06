package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVpnGatewayResult extends js.Object {
  /**
    * Information about the virtual private gateway.
    */
  var VpnGateway: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.VpnGateway] = js.native
}

object CreateVpnGatewayResult {
  @scala.inline
  def apply(VpnGateway: VpnGateway = null): CreateVpnGatewayResult = {
    val __obj = js.Dynamic.literal()
    if (VpnGateway != null) __obj.updateDynamic("VpnGateway")(VpnGateway.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpnGatewayResult]
  }
}

