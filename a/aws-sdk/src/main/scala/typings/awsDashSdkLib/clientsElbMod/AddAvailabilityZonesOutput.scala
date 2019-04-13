package typings
package awsDashSdkLib.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddAvailabilityZonesOutput extends js.Object {
  /**
    * The updated list of Availability Zones for the load balancer.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined
}

object AddAvailabilityZonesOutput {
  @scala.inline
  def apply(AvailabilityZones: AvailabilityZones = null): AddAvailabilityZonesOutput = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones)
    __obj.asInstanceOf[AddAvailabilityZonesOutput]
  }
}

