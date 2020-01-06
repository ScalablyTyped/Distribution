package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhysicalConnectionRequirements extends js.Object {
  /**
    * The connection's Availability Zone. This field is redundant because the specified subnet implies the Availability Zone to be used. Currently the field must be populated, but it will be deprecated in the future.
    */
  var AvailabilityZone: js.UndefOr[NameString] = js.native
  /**
    * The security group ID list used by the connection.
    */
  var SecurityGroupIdList: js.UndefOr[typings.awsDashSdk.clientsGlueMod.SecurityGroupIdList] = js.native
  /**
    * The subnet ID used by the connection.
    */
  var SubnetId: js.UndefOr[NameString] = js.native
}

object PhysicalConnectionRequirements {
  @scala.inline
  def apply(
    AvailabilityZone: NameString = null,
    SecurityGroupIdList: SecurityGroupIdList = null,
    SubnetId: NameString = null
  ): PhysicalConnectionRequirements = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (SecurityGroupIdList != null) __obj.updateDynamic("SecurityGroupIdList")(SecurityGroupIdList.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicalConnectionRequirements]
  }
}

