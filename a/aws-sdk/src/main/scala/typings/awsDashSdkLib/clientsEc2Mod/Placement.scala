package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Placement extends js.Object {
  /**
    * The affinity setting for the instance on the Dedicated Host. This parameter is not supported for the ImportInstance command.
    */
  var Affinity: js.UndefOr[String] = js.undefined
  /**
    * The Availability Zone of the instance. If not specified, an Availability Zone will be automatically chosen for you based on the load balancing criteria for the Region.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * The name of the placement group the instance is in.
    */
  var GroupName: js.UndefOr[String] = js.undefined
  /**
    * The ID of the Dedicated Host on which the instance resides. This parameter is not supported for the ImportInstance command.
    */
  var HostId: js.UndefOr[String] = js.undefined
  /**
    * The number of the partition the instance is in. Valid only if the placement group strategy is set to partition.
    */
  var PartitionNumber: js.UndefOr[Integer] = js.undefined
  /**
    * Reserved for future use.
    */
  var SpreadDomain: js.UndefOr[String] = js.undefined
  /**
    * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of dedicated runs on single-tenant hardware. The host tenancy is not supported for the ImportInstance command.
    */
  var Tenancy: js.UndefOr[Tenancy] = js.undefined
}

object Placement {
  @scala.inline
  def apply(
    Affinity: String = null,
    AvailabilityZone: String = null,
    GroupName: String = null,
    HostId: String = null,
    PartitionNumber: js.UndefOr[Integer] = js.undefined,
    SpreadDomain: String = null,
    Tenancy: Tenancy = null
  ): Placement = {
    val __obj = js.Dynamic.literal()
    if (Affinity != null) __obj.updateDynamic("Affinity")(Affinity)
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName)
    if (HostId != null) __obj.updateDynamic("HostId")(HostId)
    if (!js.isUndefined(PartitionNumber)) __obj.updateDynamic("PartitionNumber")(PartitionNumber)
    if (SpreadDomain != null) __obj.updateDynamic("SpreadDomain")(SpreadDomain)
    if (Tenancy != null) __obj.updateDynamic("Tenancy")(Tenancy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placement]
  }
}

