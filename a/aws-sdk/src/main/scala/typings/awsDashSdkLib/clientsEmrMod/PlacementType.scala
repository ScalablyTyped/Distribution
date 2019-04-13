package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementType extends js.Object {
  /**
    * The Amazon EC2 Availability Zone for the cluster. AvailabilityZone is used for uniform instance groups, while AvailabilityZones (plural) is used for instance fleets.
    */
  var AvailabilityZone: js.UndefOr[XmlString] = js.undefined
  /**
    * When multiple Availability Zones are specified, Amazon EMR evaluates them and launches instances in the optimal Availability Zone. AvailabilityZones is used for instance fleets, while AvailabilityZone (singular) is used for uniform instance groups.  The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions. 
    */
  var AvailabilityZones: js.UndefOr[XmlStringMaxLen256List] = js.undefined
}

object PlacementType {
  @scala.inline
  def apply(AvailabilityZone: XmlString = null, AvailabilityZones: XmlStringMaxLen256List = null): PlacementType = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones)
    __obj.asInstanceOf[PlacementType]
  }
}

