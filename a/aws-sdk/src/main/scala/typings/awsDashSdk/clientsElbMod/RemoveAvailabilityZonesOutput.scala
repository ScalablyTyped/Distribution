package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveAvailabilityZonesOutput extends js.Object {
  /**
    * The remaining Availability Zones for the load balancer.
    */
  var AvailabilityZones: js.UndefOr[typings.awsDashSdk.clientsElbMod.AvailabilityZones] = js.undefined
}

object RemoveAvailabilityZonesOutput {
  @scala.inline
  def apply(AvailabilityZones: AvailabilityZones = null): RemoveAvailabilityZonesOutput = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones)
    __obj.asInstanceOf[RemoveAvailabilityZonesOutput]
  }
}

