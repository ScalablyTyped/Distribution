package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRoleRequest extends js.Object {
  /**
    * The name of the IAM role to get information about. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var RoleName: roleNameType
}

object GetRoleRequest {
  @scala.inline
  def apply(RoleName: roleNameType): GetRoleRequest = {
    val __obj = js.Dynamic.literal(RoleName = RoleName)
  
    __obj.asInstanceOf[GetRoleRequest]
  }
}

