package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledInstancesPrivateIpAddressConfig extends js.Object {
  /**
    * Indicates whether this is a primary IPv4 address. Otherwise, this is a secondary IPv4 address.
    */
  var Primary: js.UndefOr[Boolean] = js.native
  /**
    * The IPv4 address.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
}

object ScheduledInstancesPrivateIpAddressConfig {
  @scala.inline
  def apply(Primary: js.UndefOr[scala.Boolean] = js.undefined, PrivateIpAddress: String = null): ScheduledInstancesPrivateIpAddressConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Primary)) __obj.updateDynamic("Primary")(Primary.asInstanceOf[js.Any])
    if (PrivateIpAddress != null) __obj.updateDynamic("PrivateIpAddress")(PrivateIpAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledInstancesPrivateIpAddressConfig]
  }
}

