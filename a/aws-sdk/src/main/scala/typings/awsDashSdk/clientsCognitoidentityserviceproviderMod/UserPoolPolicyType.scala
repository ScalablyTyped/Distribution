package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolPolicyType extends js.Object {
  /**
    * The password policy.
    */
  var PasswordPolicy: js.UndefOr[PasswordPolicyType] = js.native
}

object UserPoolPolicyType {
  @scala.inline
  def apply(PasswordPolicy: PasswordPolicyType = null): UserPoolPolicyType = {
    val __obj = js.Dynamic.literal()
    if (PasswordPolicy != null) __obj.updateDynamic("PasswordPolicy")(PasswordPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolPolicyType]
  }
}

