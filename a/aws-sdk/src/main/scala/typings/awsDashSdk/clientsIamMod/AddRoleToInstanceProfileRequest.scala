package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddRoleToInstanceProfileRequest extends js.Object {
  /**
    * The name of the instance profile to update. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var InstanceProfileName: instanceProfileNameType
  /**
    * The name of the role to add. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var RoleName: roleNameType
}

object AddRoleToInstanceProfileRequest {
  @scala.inline
  def apply(InstanceProfileName: instanceProfileNameType, RoleName: roleNameType): AddRoleToInstanceProfileRequest = {
    val __obj = js.Dynamic.literal(InstanceProfileName = InstanceProfileName, RoleName = RoleName)
  
    __obj.asInstanceOf[AddRoleToInstanceProfileRequest]
  }
}

