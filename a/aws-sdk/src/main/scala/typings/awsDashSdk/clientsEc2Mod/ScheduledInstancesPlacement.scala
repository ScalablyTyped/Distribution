package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduledInstancesPlacement extends js.Object {
  /**
    * The Availability Zone.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * The name of the placement group.
    */
  var GroupName: js.UndefOr[String] = js.undefined
}

object ScheduledInstancesPlacement {
  @scala.inline
  def apply(AvailabilityZone: String = null, GroupName: String = null): ScheduledInstancesPlacement = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName)
    __obj.asInstanceOf[ScheduledInstancesPlacement]
  }
}

