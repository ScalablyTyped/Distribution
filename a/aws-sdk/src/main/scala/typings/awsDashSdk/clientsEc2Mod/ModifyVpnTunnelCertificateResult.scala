package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyVpnTunnelCertificateResult extends js.Object {
  var VpnConnection: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.VpnConnection] = js.native
}

object ModifyVpnTunnelCertificateResult {
  @scala.inline
  def apply(VpnConnection: VpnConnection = null): ModifyVpnTunnelCertificateResult = {
    val __obj = js.Dynamic.literal()
    if (VpnConnection != null) __obj.updateDynamic("VpnConnection")(VpnConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpnTunnelCertificateResult]
  }
}

