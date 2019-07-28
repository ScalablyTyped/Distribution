package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpotPlacement extends js.Object {
  /**
    * The Availability Zone. [Spot Fleet only] To specify multiple Availability Zones, separate them using commas; for example, "us-west-2a, us-west-2b".
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * The name of the placement group.
    */
  var GroupName: js.UndefOr[String] = js.undefined
  /**
    * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of dedicated runs on single-tenant hardware. The host tenancy is not supported for Spot Instances.
    */
  var Tenancy: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.Tenancy] = js.undefined
}

object SpotPlacement {
  @scala.inline
  def apply(AvailabilityZone: String = null, GroupName: String = null, Tenancy: Tenancy = null): SpotPlacement = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName)
    if (Tenancy != null) __obj.updateDynamic("Tenancy")(Tenancy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotPlacement]
  }
}

