package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveRoleFromInstanceProfileRequest extends js.Object {
  /**
    * The name of the instance profile to update. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var InstanceProfileName: instanceProfileNameType
  /**
    * The name of the role to remove. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var RoleName: roleNameType
}

object RemoveRoleFromInstanceProfileRequest {
  @scala.inline
  def apply(InstanceProfileName: instanceProfileNameType, RoleName: roleNameType): RemoveRoleFromInstanceProfileRequest = {
    val __obj = js.Dynamic.literal(InstanceProfileName = InstanceProfileName, RoleName = RoleName)
  
    __obj.asInstanceOf[RemoveRoleFromInstanceProfileRequest]
  }
}

