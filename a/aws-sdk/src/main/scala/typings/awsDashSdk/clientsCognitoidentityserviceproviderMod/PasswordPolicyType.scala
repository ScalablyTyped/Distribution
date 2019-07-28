package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordPolicyType extends js.Object {
  /**
    * The minimum length of the password policy that you have set. Cannot be less than 6.
    */
  var MinimumLength: js.UndefOr[PasswordPolicyMinLengthType] = js.undefined
  /**
    * In the password policy that you have set, refers to whether you have required users to use at least one lowercase letter in their password.
    */
  var RequireLowercase: js.UndefOr[BooleanType] = js.undefined
  /**
    * In the password policy that you have set, refers to whether you have required users to use at least one number in their password.
    */
  var RequireNumbers: js.UndefOr[BooleanType] = js.undefined
  /**
    * In the password policy that you have set, refers to whether you have required users to use at least one symbol in their password.
    */
  var RequireSymbols: js.UndefOr[BooleanType] = js.undefined
  /**
    * In the password policy that you have set, refers to whether you have required users to use at least one uppercase letter in their password.
    */
  var RequireUppercase: js.UndefOr[BooleanType] = js.undefined
  var TemporaryPasswordValidityDays: js.UndefOr[TemporaryPasswordValidityDaysType] = js.undefined
}

object PasswordPolicyType {
  @scala.inline
  def apply(
    MinimumLength: js.UndefOr[PasswordPolicyMinLengthType] = js.undefined,
    RequireLowercase: js.UndefOr[BooleanType] = js.undefined,
    RequireNumbers: js.UndefOr[BooleanType] = js.undefined,
    RequireSymbols: js.UndefOr[BooleanType] = js.undefined,
    RequireUppercase: js.UndefOr[BooleanType] = js.undefined,
    TemporaryPasswordValidityDays: js.UndefOr[TemporaryPasswordValidityDaysType] = js.undefined
  ): PasswordPolicyType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MinimumLength)) __obj.updateDynamic("MinimumLength")(MinimumLength)
    if (!js.isUndefined(RequireLowercase)) __obj.updateDynamic("RequireLowercase")(RequireLowercase)
    if (!js.isUndefined(RequireNumbers)) __obj.updateDynamic("RequireNumbers")(RequireNumbers)
    if (!js.isUndefined(RequireSymbols)) __obj.updateDynamic("RequireSymbols")(RequireSymbols)
    if (!js.isUndefined(RequireUppercase)) __obj.updateDynamic("RequireUppercase")(RequireUppercase)
    if (!js.isUndefined(TemporaryPasswordValidityDays)) __obj.updateDynamic("TemporaryPasswordValidityDays")(TemporaryPasswordValidityDays)
    __obj.asInstanceOf[PasswordPolicyType]
  }
}

