package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpnConnectionOptionsSpecification extends js.Object {
  /**
    * Indicate whether to enable acceleration for the VPN connection. Default: false 
    */
  var EnableAcceleration: js.UndefOr[Boolean] = js.native
  /**
    * Indicate whether the VPN connection uses static routes only. If you are creating a VPN connection for a device that does not support BGP, you must specify true. Use CreateVpnConnectionRoute to create a static route. Default: false 
    */
  var StaticRoutesOnly: js.UndefOr[Boolean] = js.native
  /**
    * The tunnel options for the VPN connection.
    */
  var TunnelOptions: js.UndefOr[VpnTunnelOptionsSpecificationsList] = js.native
}

object VpnConnectionOptionsSpecification {
  @scala.inline
  def apply(
    EnableAcceleration: js.UndefOr[scala.Boolean] = js.undefined,
    StaticRoutesOnly: js.UndefOr[scala.Boolean] = js.undefined,
    TunnelOptions: VpnTunnelOptionsSpecificationsList = null
  ): VpnConnectionOptionsSpecification = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(EnableAcceleration)) __obj.updateDynamic("EnableAcceleration")(EnableAcceleration.asInstanceOf[js.Any])
    if (!js.isUndefined(StaticRoutesOnly)) __obj.updateDynamic("StaticRoutesOnly")(StaticRoutesOnly.asInstanceOf[js.Any])
    if (TunnelOptions != null) __obj.updateDynamic("TunnelOptions")(TunnelOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpnConnectionOptionsSpecification]
  }
}

