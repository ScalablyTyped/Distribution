package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceIpv6Address extends js.Object {
  /**
    * The IPv6 address.
    */
  var Ipv6Address: js.UndefOr[String] = js.undefined
}

object InstanceIpv6Address {
  @scala.inline
  def apply(Ipv6Address: String = null): InstanceIpv6Address = {
    val __obj = js.Dynamic.literal()
    if (Ipv6Address != null) __obj.updateDynamic("Ipv6Address")(Ipv6Address)
    __obj.asInstanceOf[InstanceIpv6Address]
  }
}

