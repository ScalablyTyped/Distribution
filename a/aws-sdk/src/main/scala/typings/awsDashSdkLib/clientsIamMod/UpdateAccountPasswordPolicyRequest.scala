package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAccountPasswordPolicyRequest extends js.Object {
  /**
    *  Allows all IAM users in your account to use the AWS Management Console to change their own passwords. For more information, see Letting IAM Users Change Their Own Passwords in the IAM User Guide. If you do not specify a value for this parameter, then the operation uses the default value of false. The result is that IAM users in the account do not automatically have permissions to change their own password.
    */
  var AllowUsersToChangePassword: js.UndefOr[booleanType] = js.undefined
  /**
    * Prevents IAM users from setting a new password after their password has expired. The IAM user cannot be accessed until an administrator resets the password. If you do not specify a value for this parameter, then the operation uses the default value of false. The result is that IAM users can change their passwords after they expire and continue to sign in as the user.
    */
  var HardExpiry: js.UndefOr[booleanObjectType] = js.undefined
  /**
    * The number of days that an IAM user password is valid. If you do not specify a value for this parameter, then the operation uses the default value of 0. The result is that IAM user passwords never expire.
    */
  var MaxPasswordAge: js.UndefOr[maxPasswordAgeType] = js.undefined
  /**
    * The minimum number of characters allowed in an IAM user password. If you do not specify a value for this parameter, then the operation uses the default value of 6.
    */
  var MinimumPasswordLength: js.UndefOr[minimumPasswordLengthType] = js.undefined
  /**
    * Specifies the number of previous passwords that IAM users are prevented from reusing. If you do not specify a value for this parameter, then the operation uses the default value of 0. The result is that IAM users are not prevented from reusing previous passwords.
    */
  var PasswordReusePrevention: js.UndefOr[passwordReusePreventionType] = js.undefined
  /**
    * Specifies whether IAM user passwords must contain at least one lowercase character from the ISO basic Latin alphabet (a to z). If you do not specify a value for this parameter, then the operation uses the default value of false. The result is that passwords do not require at least one lowercase character.
    */
  var RequireLowercaseCharacters: js.UndefOr[booleanType] = js.undefined
  /**
    * Specifies whether IAM user passwords must contain at least one numeric character (0 to 9). If you do not specify a value for this parameter, then the operation uses the default value of false. The result is that passwords do not require at least one numeric character.
    */
  var RequireNumbers: js.UndefOr[booleanType] = js.undefined
  /**
    * Specifies whether IAM user passwords must contain at least one of the following non-alphanumeric characters: ! @ # $ % ^ &amp; * ( ) _ + - = [ ] { } | ' If you do not specify a value for this parameter, then the operation uses the default value of false. The result is that passwords do not require at least one symbol character.
    */
  var RequireSymbols: js.UndefOr[booleanType] = js.undefined
  /**
    * Specifies whether IAM user passwords must contain at least one uppercase character from the ISO basic Latin alphabet (A to Z). If you do not specify a value for this parameter, then the operation uses the default value of false. The result is that passwords do not require at least one uppercase character.
    */
  var RequireUppercaseCharacters: js.UndefOr[booleanType] = js.undefined
}

object UpdateAccountPasswordPolicyRequest {
  @scala.inline
  def apply(
    AllowUsersToChangePassword: js.UndefOr[booleanType] = js.undefined,
    HardExpiry: js.UndefOr[booleanObjectType] = js.undefined,
    MaxPasswordAge: js.UndefOr[maxPasswordAgeType] = js.undefined,
    MinimumPasswordLength: js.UndefOr[minimumPasswordLengthType] = js.undefined,
    PasswordReusePrevention: js.UndefOr[passwordReusePreventionType] = js.undefined,
    RequireLowercaseCharacters: js.UndefOr[booleanType] = js.undefined,
    RequireNumbers: js.UndefOr[booleanType] = js.undefined,
    RequireSymbols: js.UndefOr[booleanType] = js.undefined,
    RequireUppercaseCharacters: js.UndefOr[booleanType] = js.undefined
  ): UpdateAccountPasswordPolicyRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllowUsersToChangePassword)) __obj.updateDynamic("AllowUsersToChangePassword")(AllowUsersToChangePassword)
    if (!js.isUndefined(HardExpiry)) __obj.updateDynamic("HardExpiry")(HardExpiry)
    if (!js.isUndefined(MaxPasswordAge)) __obj.updateDynamic("MaxPasswordAge")(MaxPasswordAge)
    if (!js.isUndefined(MinimumPasswordLength)) __obj.updateDynamic("MinimumPasswordLength")(MinimumPasswordLength)
    if (!js.isUndefined(PasswordReusePrevention)) __obj.updateDynamic("PasswordReusePrevention")(PasswordReusePrevention)
    if (!js.isUndefined(RequireLowercaseCharacters)) __obj.updateDynamic("RequireLowercaseCharacters")(RequireLowercaseCharacters)
    if (!js.isUndefined(RequireNumbers)) __obj.updateDynamic("RequireNumbers")(RequireNumbers)
    if (!js.isUndefined(RequireSymbols)) __obj.updateDynamic("RequireSymbols")(RequireSymbols)
    if (!js.isUndefined(RequireUppercaseCharacters)) __obj.updateDynamic("RequireUppercaseCharacters")(RequireUppercaseCharacters)
    __obj.asInstanceOf[UpdateAccountPasswordPolicyRequest]
  }
}

