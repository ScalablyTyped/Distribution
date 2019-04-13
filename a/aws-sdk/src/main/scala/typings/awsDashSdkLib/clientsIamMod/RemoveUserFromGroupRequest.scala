package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveUserFromGroupRequest extends js.Object {
  /**
    * The name of the group to update. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var GroupName: groupNameType
  /**
    * The name of the user to remove. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: existingUserNameType
}

object RemoveUserFromGroupRequest {
  @scala.inline
  def apply(GroupName: groupNameType, UserName: existingUserNameType): RemoveUserFromGroupRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName, UserName = UserName)
  
    __obj.asInstanceOf[RemoveUserFromGroupRequest]
  }
}

