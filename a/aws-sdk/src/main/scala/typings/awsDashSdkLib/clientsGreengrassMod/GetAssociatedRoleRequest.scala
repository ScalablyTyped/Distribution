package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAssociatedRoleRequest extends js.Object {
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: __string
}

object GetAssociatedRoleRequest {
  @scala.inline
  def apply(GroupId: __string): GetAssociatedRoleRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId)
  
    __obj.asInstanceOf[GetAssociatedRoleRequest]
  }
}

