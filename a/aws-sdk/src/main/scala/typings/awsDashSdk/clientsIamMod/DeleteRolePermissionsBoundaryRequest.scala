package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRolePermissionsBoundaryRequest extends js.Object {
  /**
    * The name (friendly name, not ARN) of the IAM role from which you want to remove the permissions boundary.
    */
  var RoleName: roleNameType
}

object DeleteRolePermissionsBoundaryRequest {
  @scala.inline
  def apply(RoleName: roleNameType): DeleteRolePermissionsBoundaryRequest = {
    val __obj = js.Dynamic.literal(RoleName = RoleName)
  
    __obj.asInstanceOf[DeleteRolePermissionsBoundaryRequest]
  }
}

