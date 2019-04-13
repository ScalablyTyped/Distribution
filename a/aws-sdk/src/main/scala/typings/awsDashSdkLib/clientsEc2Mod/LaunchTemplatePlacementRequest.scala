package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplatePlacementRequest extends js.Object {
  /**
    * The affinity setting for an instance on a Dedicated Host.
    */
  var Affinity: js.UndefOr[String] = js.undefined
  /**
    * The Availability Zone for the instance.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * The name of the placement group for the instance.
    */
  var GroupName: js.UndefOr[String] = js.undefined
  /**
    * The ID of the Dedicated Host for the instance.
    */
  var HostId: js.UndefOr[String] = js.undefined
  /**
    * Reserved for future use.
    */
  var SpreadDomain: js.UndefOr[String] = js.undefined
  /**
    * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of dedicated runs on single-tenant hardware.
    */
  var Tenancy: js.UndefOr[Tenancy] = js.undefined
}

object LaunchTemplatePlacementRequest {
  @scala.inline
  def apply(
    Affinity: String = null,
    AvailabilityZone: String = null,
    GroupName: String = null,
    HostId: String = null,
    SpreadDomain: String = null,
    Tenancy: Tenancy = null
  ): LaunchTemplatePlacementRequest = {
    val __obj = js.Dynamic.literal()
    if (Affinity != null) __obj.updateDynamic("Affinity")(Affinity)
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName)
    if (HostId != null) __obj.updateDynamic("HostId")(HostId)
    if (SpreadDomain != null) __obj.updateDynamic("SpreadDomain")(SpreadDomain)
    if (Tenancy != null) __obj.updateDynamic("Tenancy")(Tenancy.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplatePlacementRequest]
  }
}

