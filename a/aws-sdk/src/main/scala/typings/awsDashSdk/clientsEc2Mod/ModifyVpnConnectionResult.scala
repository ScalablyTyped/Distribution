package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyVpnConnectionResult extends js.Object {
  var VpnConnection: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.VpnConnection] = js.undefined
}

object ModifyVpnConnectionResult {
  @scala.inline
  def apply(VpnConnection: VpnConnection = null): ModifyVpnConnectionResult = {
    val __obj = js.Dynamic.literal()
    if (VpnConnection != null) __obj.updateDynamic("VpnConnection")(VpnConnection)
    __obj.asInstanceOf[ModifyVpnConnectionResult]
  }
}

