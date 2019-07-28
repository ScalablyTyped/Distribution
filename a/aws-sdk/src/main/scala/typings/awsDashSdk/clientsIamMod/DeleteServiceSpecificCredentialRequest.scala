package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteServiceSpecificCredentialRequest extends js.Object {
  /**
    * The unique identifier of the service-specific credential. You can get this value by calling ListServiceSpecificCredentials. This parameter allows (through its regex pattern) a string of characters that can consist of any upper or lowercased letter or digit.
    */
  var ServiceSpecificCredentialId: serviceSpecificCredentialId
  /**
    * The name of the IAM user associated with the service-specific credential. If this value is not specified, then the operation assumes the user whose credentials are used to call the operation. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: js.UndefOr[userNameType] = js.undefined
}

object DeleteServiceSpecificCredentialRequest {
  @scala.inline
  def apply(ServiceSpecificCredentialId: serviceSpecificCredentialId, UserName: userNameType = null): DeleteServiceSpecificCredentialRequest = {
    val __obj = js.Dynamic.literal(ServiceSpecificCredentialId = ServiceSpecificCredentialId)
    if (UserName != null) __obj.updateDynamic("UserName")(UserName)
    __obj.asInstanceOf[DeleteServiceSpecificCredentialRequest]
  }
}

