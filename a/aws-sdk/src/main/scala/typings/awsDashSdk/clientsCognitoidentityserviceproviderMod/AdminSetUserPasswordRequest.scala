package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminSetUserPasswordRequest extends js.Object {
  var Password: PasswordType
  var Permanent: js.UndefOr[BooleanType] = js.undefined
  var UserPoolId: UserPoolIdType
  var Username: UsernameType
}

object AdminSetUserPasswordRequest {
  @scala.inline
  def apply(
    Password: PasswordType,
    UserPoolId: UserPoolIdType,
    Username: UsernameType,
    Permanent: js.UndefOr[BooleanType] = js.undefined
  ): AdminSetUserPasswordRequest = {
    val __obj = js.Dynamic.literal(Password = Password, UserPoolId = UserPoolId, Username = Username)
    if (!js.isUndefined(Permanent)) __obj.updateDynamic("Permanent")(Permanent)
    __obj.asInstanceOf[AdminSetUserPasswordRequest]
  }
}

