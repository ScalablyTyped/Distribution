package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledInstancesIpv6Address extends js.Object {
  /**
    * The IPv6 address.
    */
  var Ipv6Address: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.Ipv6Address] = js.native
}

object ScheduledInstancesIpv6Address {
  @scala.inline
  def apply(Ipv6Address: Ipv6Address = null): ScheduledInstancesIpv6Address = {
    val __obj = js.Dynamic.literal()
    if (Ipv6Address != null) __obj.updateDynamic("Ipv6Address")(Ipv6Address.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledInstancesIpv6Address]
  }
}

