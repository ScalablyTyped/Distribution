package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteUserRequest extends js.Object {
  /**
    * The name of the user to delete. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: existingUserNameType
}

object DeleteUserRequest {
  @scala.inline
  def apply(UserName: existingUserNameType): DeleteUserRequest = {
    val __obj = js.Dynamic.literal(UserName = UserName)
  
    __obj.asInstanceOf[DeleteUserRequest]
  }
}

