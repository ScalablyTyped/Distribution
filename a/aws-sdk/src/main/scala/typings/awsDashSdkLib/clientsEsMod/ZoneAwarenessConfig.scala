package typings
package awsDashSdkLib.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneAwarenessConfig extends js.Object {
  /**
    * An integer value to indicate the number of availability zones for a domain when zone awareness is enabled. This should be equal to number of subnets if VPC endpoints is enabled
    */
  var AvailabilityZoneCount: js.UndefOr[IntegerClass] = js.undefined
}

object ZoneAwarenessConfig {
  @scala.inline
  def apply(AvailabilityZoneCount: js.UndefOr[IntegerClass] = js.undefined): ZoneAwarenessConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AvailabilityZoneCount)) __obj.updateDynamic("AvailabilityZoneCount")(AvailabilityZoneCount)
    __obj.asInstanceOf[ZoneAwarenessConfig]
  }
}

