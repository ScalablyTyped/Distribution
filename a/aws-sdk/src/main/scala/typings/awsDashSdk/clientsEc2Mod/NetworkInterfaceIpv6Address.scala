package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInterfaceIpv6Address extends js.Object {
  /**
    * The IPv6 address.
    */
  var Ipv6Address: js.UndefOr[String] = js.native
}

object NetworkInterfaceIpv6Address {
  @scala.inline
  def apply(Ipv6Address: String = null): NetworkInterfaceIpv6Address = {
    val __obj = js.Dynamic.literal()
    if (Ipv6Address != null) __obj.updateDynamic("Ipv6Address")(Ipv6Address.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterfaceIpv6Address]
  }
}

