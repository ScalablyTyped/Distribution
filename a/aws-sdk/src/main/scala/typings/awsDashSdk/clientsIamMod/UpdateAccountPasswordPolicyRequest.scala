package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAccountPasswordPolicyRequest extends js.Object {
  /**
    *  Allows all IAM users in your account to use the AWS Management Console to change their own passwords. For more information, see Letting IAM Users Change Their Own Passwords in the IAM User Guide. If you do not specify a value for this parameter, then the operation uses the default value of false. The result is that IAM users in the account do not automatically have permissions to change their own password.
    */
  var AllowUsersToChangePassword: js.UndefOr[booleanType] = js.native
  /**
    * Prevents IAM users from setting a new password after their password has expired. The IAM user cannot be accessed until an administrator resets the password. If you do not specify a value for this parameter, then the operation uses the default value of false. The result is that IAM users can change their passwords after they expire and continue to sign in as the user.
    */
  var HardExpiry: js.UndefOr[booleanObjectType] = js.native
  /**
    * The number of days that an IAM user password is valid. If you do not specify a value for this parameter, then the operation uses the default value of 0. The result is that IAM user passwords never expire.
    */
  var MaxPasswordAge: js.UndefOr[maxPasswordAgeType] = js.native
  /**
    * The minimum number of characters allowed in an IAM user password. If you do not specify a value for this parameter, then the operation uses the default value of 6.
    */
  var MinimumPasswordLength: js.UndefOr[minimumPasswordLengthType] = js.native
  /**
    * Specifies the number of previous passwords that IAM users are prevented from reusing. If you do not specify a value for this parameter, then the operation uses the default value of 0. The result is that IAM users are not prevented from reusing previous passwords.
    */
  var PasswordReusePrevention: js.UndefOr[passwordReusePreventionType] = js.native
  /**
    * Specifies whether IAM user passwords must contain at least one lowercase character from the ISO basic Latin alphabet (a to z). If you do not specify a value for this parameter, then the operation uses the default value of false. The result is that passwords do not require at least one lowercase character.
    */
  var RequireLowercaseCharacters: js.UndefOr[booleanType] = js.native
  /**
    * Specifies whether IAM user passwords must contain at least one numeric character (0 to 9). If you do not specify a value for this parameter, then the operation uses the default value of false. The result is that passwords do not require at least one numeric character.
    */
  var RequireNumbers: js.UndefOr[booleanType] = js.native
  /**
    * Specifies whether IAM user passwords must contain at least one of the following non-alphanumeric characters: ! @ # $ % ^ &amp; * ( ) _ + - = [ ] { } | ' If you do not specify a value for this parameter, then the operation uses the default value of false. The result is that passwords do not require at least one symbol character.
    */
  var RequireSymbols: js.UndefOr[booleanType] = js.native
  /**
    * Specifies whether IAM user passwords must contain at least one uppercase character from the ISO basic Latin alphabet (A to Z). If you do not specify a value for this parameter, then the operation uses the default value of false. The result is that passwords do not require at least one uppercase character.
    */
  var RequireUppercaseCharacters: js.UndefOr[booleanType] = js.native
}

object UpdateAccountPasswordPolicyRequest {
  @scala.inline
  def apply(
    AllowUsersToChangePassword: js.UndefOr[Boolean] = js.undefined,
    HardExpiry: js.UndefOr[Boolean] = js.undefined,
    MaxPasswordAge: Int | Double = null,
    MinimumPasswordLength: Int | Double = null,
    PasswordReusePrevention: Int | Double = null,
    RequireLowercaseCharacters: js.UndefOr[Boolean] = js.undefined,
    RequireNumbers: js.UndefOr[Boolean] = js.undefined,
    RequireSymbols: js.UndefOr[Boolean] = js.undefined,
    RequireUppercaseCharacters: js.UndefOr[Boolean] = js.undefined
  ): UpdateAccountPasswordPolicyRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllowUsersToChangePassword)) __obj.updateDynamic("AllowUsersToChangePassword")(AllowUsersToChangePassword.asInstanceOf[js.Any])
    if (!js.isUndefined(HardExpiry)) __obj.updateDynamic("HardExpiry")(HardExpiry.asInstanceOf[js.Any])
    if (MaxPasswordAge != null) __obj.updateDynamic("MaxPasswordAge")(MaxPasswordAge.asInstanceOf[js.Any])
    if (MinimumPasswordLength != null) __obj.updateDynamic("MinimumPasswordLength")(MinimumPasswordLength.asInstanceOf[js.Any])
    if (PasswordReusePrevention != null) __obj.updateDynamic("PasswordReusePrevention")(PasswordReusePrevention.asInstanceOf[js.Any])
    if (!js.isUndefined(RequireLowercaseCharacters)) __obj.updateDynamic("RequireLowercaseCharacters")(RequireLowercaseCharacters.asInstanceOf[js.Any])
    if (!js.isUndefined(RequireNumbers)) __obj.updateDynamic("RequireNumbers")(RequireNumbers.asInstanceOf[js.Any])
    if (!js.isUndefined(RequireSymbols)) __obj.updateDynamic("RequireSymbols")(RequireSymbols.asInstanceOf[js.Any])
    if (!js.isUndefined(RequireUppercaseCharacters)) __obj.updateDynamic("RequireUppercaseCharacters")(RequireUppercaseCharacters.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAccountPasswordPolicyRequest]
  }
}

