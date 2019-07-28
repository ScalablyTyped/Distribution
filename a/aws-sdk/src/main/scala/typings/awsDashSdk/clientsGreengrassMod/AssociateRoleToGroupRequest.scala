package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateRoleToGroupRequest extends js.Object {
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: __string
  /**
    * The ARN of the role you wish to associate with this group. The existence of the role is not validated.
    */
  var RoleArn: __string
}

object AssociateRoleToGroupRequest {
  @scala.inline
  def apply(GroupId: __string, RoleArn: __string): AssociateRoleToGroupRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId, RoleArn = RoleArn)
  
    __obj.asInstanceOf[AssociateRoleToGroupRequest]
  }
}

