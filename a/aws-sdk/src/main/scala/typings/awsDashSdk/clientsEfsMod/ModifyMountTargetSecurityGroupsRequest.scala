package typings.awsDashSdk.clientsEfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyMountTargetSecurityGroupsRequest extends js.Object {
  /**
    * The ID of the mount target whose security groups you want to modify.
    */
  var MountTargetId: typings.awsDashSdk.clientsEfsMod.MountTargetId
  /**
    * An array of up to five VPC security group IDs.
    */
  var SecurityGroups: js.UndefOr[typings.awsDashSdk.clientsEfsMod.SecurityGroups] = js.undefined
}

object ModifyMountTargetSecurityGroupsRequest {
  @scala.inline
  def apply(MountTargetId: MountTargetId, SecurityGroups: SecurityGroups = null): ModifyMountTargetSecurityGroupsRequest = {
    val __obj = js.Dynamic.literal(MountTargetId = MountTargetId)
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups)
    __obj.asInstanceOf[ModifyMountTargetSecurityGroupsRequest]
  }
}

