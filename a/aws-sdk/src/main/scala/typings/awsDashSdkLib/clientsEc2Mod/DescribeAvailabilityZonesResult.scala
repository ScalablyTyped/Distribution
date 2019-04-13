package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAvailabilityZonesResult extends js.Object {
  /**
    * Information about one or more Availability Zones.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined
}

object DescribeAvailabilityZonesResult {
  @scala.inline
  def apply(AvailabilityZones: AvailabilityZoneList = null): DescribeAvailabilityZonesResult = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones)
    __obj.asInstanceOf[DescribeAvailabilityZonesResult]
  }
}

