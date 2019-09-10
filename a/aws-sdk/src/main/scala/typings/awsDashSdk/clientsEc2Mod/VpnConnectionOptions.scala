package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpnConnectionOptions extends js.Object {
  /**
    * Indicates whether the VPN connection uses static routes only. Static routes must be used for devices that don't support BGP.
    */
  var StaticRoutesOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates the VPN tunnel options.
    */
  var TunnelOptions: js.UndefOr[TunnelOptionsList] = js.undefined
}

object VpnConnectionOptions {
  @scala.inline
  def apply(StaticRoutesOnly: js.UndefOr[Boolean] = js.undefined, TunnelOptions: TunnelOptionsList = null): VpnConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(StaticRoutesOnly)) __obj.updateDynamic("StaticRoutesOnly")(StaticRoutesOnly)
    if (TunnelOptions != null) __obj.updateDynamic("TunnelOptions")(TunnelOptions)
    __obj.asInstanceOf[VpnConnectionOptions]
  }
}

