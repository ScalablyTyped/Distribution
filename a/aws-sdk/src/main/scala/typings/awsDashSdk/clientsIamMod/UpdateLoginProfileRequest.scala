package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateLoginProfileRequest extends js.Object {
  /**
    * The new password for the specified IAM user. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)   However, the format can be further restricted by the account administrator by setting a password policy on the AWS account. For more information, see UpdateAccountPasswordPolicy.
    */
  var Password: js.UndefOr[passwordType] = js.undefined
  /**
    * Allows this new password to be used only once by requiring the specified IAM user to set a new password on next sign-in.
    */
  var PasswordResetRequired: js.UndefOr[booleanObjectType] = js.undefined
  /**
    * The name of the user whose password you want to update. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: userNameType
}

object UpdateLoginProfileRequest {
  @scala.inline
  def apply(
    UserName: userNameType,
    Password: passwordType = null,
    PasswordResetRequired: js.UndefOr[Boolean] = js.undefined
  ): UpdateLoginProfileRequest = {
    val __obj = js.Dynamic.literal(UserName = UserName)
    if (Password != null) __obj.updateDynamic("Password")(Password)
    if (!js.isUndefined(PasswordResetRequired)) __obj.updateDynamic("PasswordResetRequired")(PasswordResetRequired)
    __obj.asInstanceOf[UpdateLoginProfileRequest]
  }
}

