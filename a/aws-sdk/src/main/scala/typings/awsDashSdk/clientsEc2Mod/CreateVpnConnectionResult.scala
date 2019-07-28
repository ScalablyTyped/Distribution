package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVpnConnectionResult extends js.Object {
  /**
    * Information about the VPN connection.
    */
  var VpnConnection: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.VpnConnection] = js.undefined
}

object CreateVpnConnectionResult {
  @scala.inline
  def apply(VpnConnection: VpnConnection = null): CreateVpnConnectionResult = {
    val __obj = js.Dynamic.literal()
    if (VpnConnection != null) __obj.updateDynamic("VpnConnection")(VpnConnection)
    __obj.asInstanceOf[CreateVpnConnectionResult]
  }
}

