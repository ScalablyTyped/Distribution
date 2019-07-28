package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateRoleFromGroupRequest extends js.Object {
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: __string
}

object DisassociateRoleFromGroupRequest {
  @scala.inline
  def apply(GroupId: __string): DisassociateRoleFromGroupRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId)
  
    __obj.asInstanceOf[DisassociateRoleFromGroupRequest]
  }
}

