package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteAccessKeyRequest extends js.Object {
  /**
    * The access key ID for the access key ID and secret access key you want to delete. This parameter allows (through its regex pattern) a string of characters that can consist of any upper or lowercased letter or digit.
    */
  var AccessKeyId: accessKeyIdType
  /**
    * The name of the user whose access key pair you want to delete. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: js.UndefOr[existingUserNameType] = js.undefined
}

object DeleteAccessKeyRequest {
  @scala.inline
  def apply(AccessKeyId: accessKeyIdType, UserName: existingUserNameType = null): DeleteAccessKeyRequest = {
    val __obj = js.Dynamic.literal(AccessKeyId = AccessKeyId)
    if (UserName != null) __obj.updateDynamic("UserName")(UserName)
    __obj.asInstanceOf[DeleteAccessKeyRequest]
  }
}

