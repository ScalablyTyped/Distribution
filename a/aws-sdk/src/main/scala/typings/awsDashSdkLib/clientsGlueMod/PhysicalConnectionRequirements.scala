package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhysicalConnectionRequirements extends js.Object {
  /**
    * The connection's Availability Zone. This field is redundant because the specified subnet implies the Availability Zone to be used. Currently the field must be populated, but it will be deprecated in the future.
    */
  var AvailabilityZone: js.UndefOr[NameString] = js.undefined
  /**
    * The security group ID list used by the connection.
    */
  var SecurityGroupIdList: js.UndefOr[SecurityGroupIdList] = js.undefined
  /**
    * The subnet ID used by the connection.
    */
  var SubnetId: js.UndefOr[NameString] = js.undefined
}

object PhysicalConnectionRequirements {
  @scala.inline
  def apply(
    AvailabilityZone: NameString = null,
    SecurityGroupIdList: SecurityGroupIdList = null,
    SubnetId: NameString = null
  ): PhysicalConnectionRequirements = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (SecurityGroupIdList != null) __obj.updateDynamic("SecurityGroupIdList")(SecurityGroupIdList)
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId)
    __obj.asInstanceOf[PhysicalConnectionRequirements]
  }
}

