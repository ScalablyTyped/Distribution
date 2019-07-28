package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserRequest extends js.Object {
  /**
    * The name of the user to get information about. This parameter is optional. If it is not included, it defaults to the user making the request. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: js.UndefOr[existingUserNameType] = js.undefined
}

object GetUserRequest {
  @scala.inline
  def apply(UserName: existingUserNameType = null): GetUserRequest = {
    val __obj = js.Dynamic.literal()
    if (UserName != null) __obj.updateDynamic("UserName")(UserName)
    __obj.asInstanceOf[GetUserRequest]
  }
}

