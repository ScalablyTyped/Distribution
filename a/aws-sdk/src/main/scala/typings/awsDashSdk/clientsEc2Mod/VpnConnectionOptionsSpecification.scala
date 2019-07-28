package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpnConnectionOptionsSpecification extends js.Object {
  /**
    * Indicate whether the VPN connection uses static routes only. If you are creating a VPN connection for a device that does not support BGP, you must specify true. Use CreateVpnConnectionRoute to create a static route. Default: false 
    */
  var StaticRoutesOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * The tunnel options for the VPN connection.
    */
  var TunnelOptions: js.UndefOr[TunnelOptionsList] = js.undefined
}

object VpnConnectionOptionsSpecification {
  @scala.inline
  def apply(StaticRoutesOnly: js.UndefOr[Boolean] = js.undefined, TunnelOptions: TunnelOptionsList = null): VpnConnectionOptionsSpecification = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(StaticRoutesOnly)) __obj.updateDynamic("StaticRoutesOnly")(StaticRoutesOnly)
    if (TunnelOptions != null) __obj.updateDynamic("TunnelOptions")(TunnelOptions)
    __obj.asInstanceOf[VpnConnectionOptionsSpecification]
  }
}

