package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyVpnConnectionResult extends js.Object {
  var VpnConnection: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.VpnConnection] = js.native
}

object ModifyVpnConnectionResult {
  @scala.inline
  def apply(VpnConnection: VpnConnection = null): ModifyVpnConnectionResult = {
    val __obj = js.Dynamic.literal()
    if (VpnConnection != null) __obj.updateDynamic("VpnConnection")(VpnConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpnConnectionResult]
  }
}

