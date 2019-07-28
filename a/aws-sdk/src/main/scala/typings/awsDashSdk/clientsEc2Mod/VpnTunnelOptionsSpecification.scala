package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpnTunnelOptionsSpecification extends js.Object {
  /**
    * The pre-shared key (PSK) to establish initial authentication between the virtual private gateway and customer gateway. Constraints: Allowed characters are alphanumeric characters and ._. Must be between 8 and 64 characters in length and cannot start with zero (0).
    */
  var PreSharedKey: js.UndefOr[String] = js.undefined
  /**
    * The range of inside IP addresses for the tunnel. Any specified CIDR blocks must be unique across all VPN connections that use the same virtual private gateway.  Constraints: A size /30 CIDR block from the 169.254.0.0/16 range. The following CIDR blocks are reserved and cannot be used:    169.254.0.0/30     169.254.1.0/30     169.254.2.0/30     169.254.3.0/30     169.254.4.0/30     169.254.5.0/30     169.254.169.252/30   
    */
  var TunnelInsideCidr: js.UndefOr[String] = js.undefined
}

object VpnTunnelOptionsSpecification {
  @scala.inline
  def apply(PreSharedKey: String = null, TunnelInsideCidr: String = null): VpnTunnelOptionsSpecification = {
    val __obj = js.Dynamic.literal()
    if (PreSharedKey != null) __obj.updateDynamic("PreSharedKey")(PreSharedKey)
    if (TunnelInsideCidr != null) __obj.updateDynamic("TunnelInsideCidr")(TunnelInsideCidr)
    __obj.asInstanceOf[VpnTunnelOptionsSpecification]
  }
}

