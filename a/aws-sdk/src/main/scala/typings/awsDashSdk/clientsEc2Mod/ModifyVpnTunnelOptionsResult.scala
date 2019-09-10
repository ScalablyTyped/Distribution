package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyVpnTunnelOptionsResult extends js.Object {
  var VpnConnection: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.VpnConnection] = js.undefined
}

object ModifyVpnTunnelOptionsResult {
  @scala.inline
  def apply(VpnConnection: VpnConnection = null): ModifyVpnTunnelOptionsResult = {
    val __obj = js.Dynamic.literal()
    if (VpnConnection != null) __obj.updateDynamic("VpnConnection")(VpnConnection)
    __obj.asInstanceOf[ModifyVpnTunnelOptionsResult]
  }
}

