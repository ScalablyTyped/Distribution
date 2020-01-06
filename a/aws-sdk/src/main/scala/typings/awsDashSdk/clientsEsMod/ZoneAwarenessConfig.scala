package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoneAwarenessConfig extends js.Object {
  /**
    * An integer value to indicate the number of availability zones for a domain when zone awareness is enabled. This should be equal to number of subnets if VPC endpoints is enabled
    */
  var AvailabilityZoneCount: js.UndefOr[IntegerClass] = js.native
}

object ZoneAwarenessConfig {
  @scala.inline
  def apply(AvailabilityZoneCount: Int | scala.Double = null): ZoneAwarenessConfig = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZoneCount != null) __obj.updateDynamic("AvailabilityZoneCount")(AvailabilityZoneCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoneAwarenessConfig]
  }
}

