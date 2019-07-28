package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRoleRequest extends js.Object {
  /**
    * The name of the role to delete. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var RoleName: roleNameType
}

object DeleteRoleRequest {
  @scala.inline
  def apply(RoleName: roleNameType): DeleteRoleRequest = {
    val __obj = js.Dynamic.literal(RoleName = RoleName)
  
    __obj.asInstanceOf[DeleteRoleRequest]
  }
}

