package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyInstancePlacementRequest extends js.Object {
  /**
    * The affinity setting for the instance.
    */
  var Affinity: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.Affinity] = js.undefined
  /**
    * The name of the placement group in which to place the instance. For spread placement groups, the instance must have a tenancy of default. For cluster and partition placement groups, the instance must have a tenancy of default or dedicated. To remove an instance from a placement group, specify an empty string ("").
    */
  var GroupName: js.UndefOr[String] = js.undefined
  /**
    * The ID of the Dedicated Host with which to associate the instance.
    */
  var HostId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the instance that you are modifying.
    */
  var InstanceId: String
  /**
    * Reserved for future use.
    */
  var PartitionNumber: js.UndefOr[Integer] = js.undefined
  /**
    * The tenancy for the instance.
    */
  var Tenancy: js.UndefOr[HostTenancy] = js.undefined
}

object ModifyInstancePlacementRequest {
  @scala.inline
  def apply(
    InstanceId: String,
    Affinity: Affinity = null,
    GroupName: String = null,
    HostId: String = null,
    PartitionNumber: Int | scala.Double = null,
    Tenancy: HostTenancy = null
  ): ModifyInstancePlacementRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId)
    if (Affinity != null) __obj.updateDynamic("Affinity")(Affinity.asInstanceOf[js.Any])
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName)
    if (HostId != null) __obj.updateDynamic("HostId")(HostId)
    if (PartitionNumber != null) __obj.updateDynamic("PartitionNumber")(PartitionNumber.asInstanceOf[js.Any])
    if (Tenancy != null) __obj.updateDynamic("Tenancy")(Tenancy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyInstancePlacementRequest]
  }
}

