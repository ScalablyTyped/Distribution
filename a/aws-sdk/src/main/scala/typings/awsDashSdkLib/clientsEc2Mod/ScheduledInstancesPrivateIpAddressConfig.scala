package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduledInstancesPrivateIpAddressConfig extends js.Object {
  /**
    * Indicates whether this is a primary IPv4 address. Otherwise, this is a secondary IPv4 address.
    */
  var Primary: js.UndefOr[Boolean] = js.undefined
  /**
    * The IPv4 address.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.undefined
}

object ScheduledInstancesPrivateIpAddressConfig {
  @scala.inline
  def apply(Primary: js.UndefOr[Boolean] = js.undefined, PrivateIpAddress: String = null): ScheduledInstancesPrivateIpAddressConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Primary)) __obj.updateDynamic("Primary")(Primary)
    if (PrivateIpAddress != null) __obj.updateDynamic("PrivateIpAddress")(PrivateIpAddress)
    __obj.asInstanceOf[ScheduledInstancesPrivateIpAddressConfig]
  }
}

