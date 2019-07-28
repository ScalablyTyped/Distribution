package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordPolicy extends js.Object {
  /**
    * Specifies whether IAM users are allowed to change their own password.
    */
  var AllowUsersToChangePassword: js.UndefOr[booleanType] = js.undefined
  /**
    * Indicates whether passwords in the account expire. Returns true if MaxPasswordAge contains a value greater than 0. Returns false if MaxPasswordAge is 0 or not present.
    */
  var ExpirePasswords: js.UndefOr[booleanType] = js.undefined
  /**
    * Specifies whether IAM users are prevented from setting a new password after their password has expired.
    */
  var HardExpiry: js.UndefOr[booleanObjectType] = js.undefined
  /**
    * The number of days that an IAM user password is valid.
    */
  var MaxPasswordAge: js.UndefOr[maxPasswordAgeType] = js.undefined
  /**
    * Minimum length to require for IAM user passwords.
    */
  var MinimumPasswordLength: js.UndefOr[minimumPasswordLengthType] = js.undefined
  /**
    * Specifies the number of previous passwords that IAM users are prevented from reusing.
    */
  var PasswordReusePrevention: js.UndefOr[passwordReusePreventionType] = js.undefined
  /**
    * Specifies whether to require lowercase characters for IAM user passwords.
    */
  var RequireLowercaseCharacters: js.UndefOr[booleanType] = js.undefined
  /**
    * Specifies whether to require numbers for IAM user passwords.
    */
  var RequireNumbers: js.UndefOr[booleanType] = js.undefined
  /**
    * Specifies whether to require symbols for IAM user passwords.
    */
  var RequireSymbols: js.UndefOr[booleanType] = js.undefined
  /**
    * Specifies whether to require uppercase characters for IAM user passwords.
    */
  var RequireUppercaseCharacters: js.UndefOr[booleanType] = js.undefined
}

object PasswordPolicy {
  @scala.inline
  def apply(
    AllowUsersToChangePassword: js.UndefOr[booleanType] = js.undefined,
    ExpirePasswords: js.UndefOr[booleanType] = js.undefined,
    HardExpiry: js.UndefOr[booleanObjectType] = js.undefined,
    MaxPasswordAge: js.UndefOr[maxPasswordAgeType] = js.undefined,
    MinimumPasswordLength: js.UndefOr[minimumPasswordLengthType] = js.undefined,
    PasswordReusePrevention: js.UndefOr[passwordReusePreventionType] = js.undefined,
    RequireLowercaseCharacters: js.UndefOr[booleanType] = js.undefined,
    RequireNumbers: js.UndefOr[booleanType] = js.undefined,
    RequireSymbols: js.UndefOr[booleanType] = js.undefined,
    RequireUppercaseCharacters: js.UndefOr[booleanType] = js.undefined
  ): PasswordPolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllowUsersToChangePassword)) __obj.updateDynamic("AllowUsersToChangePassword")(AllowUsersToChangePassword)
    if (!js.isUndefined(ExpirePasswords)) __obj.updateDynamic("ExpirePasswords")(ExpirePasswords)
    if (!js.isUndefined(HardExpiry)) __obj.updateDynamic("HardExpiry")(HardExpiry)
    if (!js.isUndefined(MaxPasswordAge)) __obj.updateDynamic("MaxPasswordAge")(MaxPasswordAge)
    if (!js.isUndefined(MinimumPasswordLength)) __obj.updateDynamic("MinimumPasswordLength")(MinimumPasswordLength)
    if (!js.isUndefined(PasswordReusePrevention)) __obj.updateDynamic("PasswordReusePrevention")(PasswordReusePrevention)
    if (!js.isUndefined(RequireLowercaseCharacters)) __obj.updateDynamic("RequireLowercaseCharacters")(RequireLowercaseCharacters)
    if (!js.isUndefined(RequireNumbers)) __obj.updateDynamic("RequireNumbers")(RequireNumbers)
    if (!js.isUndefined(RequireSymbols)) __obj.updateDynamic("RequireSymbols")(RequireSymbols)
    if (!js.isUndefined(RequireUppercaseCharacters)) __obj.updateDynamic("RequireUppercaseCharacters")(RequireUppercaseCharacters)
    __obj.asInstanceOf[PasswordPolicy]
  }
}

