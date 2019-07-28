package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagRoleRequest extends js.Object {
  /**
    * The name of the IAM role from which you want to remove tags. This parameter accepts (through its regex pattern) a string of characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var RoleName: roleNameType
  /**
    * A list of key names as a simple array of strings. The tags with matching keys are removed from the specified role.
    */
  var TagKeys: tagKeyListType
}

object UntagRoleRequest {
  @scala.inline
  def apply(RoleName: roleNameType, TagKeys: tagKeyListType): UntagRoleRequest = {
    val __obj = js.Dynamic.literal(RoleName = RoleName, TagKeys = TagKeys)
  
    __obj.asInstanceOf[UntagRoleRequest]
  }
}

