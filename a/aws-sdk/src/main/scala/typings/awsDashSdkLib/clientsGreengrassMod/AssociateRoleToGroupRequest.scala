package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateRoleToGroupRequest extends js.Object {
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: __string
  /**
    * The ARN of the role you wish to associate with this group.
    */
  var RoleArn: js.UndefOr[__string] = js.undefined
}

object AssociateRoleToGroupRequest {
  @scala.inline
  def apply(GroupId: __string, RoleArn: __string = null): AssociateRoleToGroupRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId)
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn)
    __obj.asInstanceOf[AssociateRoleToGroupRequest]
  }
}

