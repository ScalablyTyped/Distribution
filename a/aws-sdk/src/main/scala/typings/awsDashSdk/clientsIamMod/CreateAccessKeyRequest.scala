package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAccessKeyRequest extends js.Object {
  /**
    * The name of the IAM user that the new key will belong to. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: js.UndefOr[existingUserNameType] = js.native
}

object CreateAccessKeyRequest {
  @scala.inline
  def apply(UserName: existingUserNameType = null): CreateAccessKeyRequest = {
    val __obj = js.Dynamic.literal()
    if (UserName != null) __obj.updateDynamic("UserName")(UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccessKeyRequest]
  }
}

