package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceIpv6AddressRequest extends js.Object {
  /**
    * The IPv6 address.
    */
  var Ipv6Address: js.UndefOr[String] = js.undefined
}

object InstanceIpv6AddressRequest {
  @scala.inline
  def apply(Ipv6Address: String = null): InstanceIpv6AddressRequest = {
    val __obj = js.Dynamic.literal()
    if (Ipv6Address != null) __obj.updateDynamic("Ipv6Address")(Ipv6Address)
    __obj.asInstanceOf[InstanceIpv6AddressRequest]
  }
}

