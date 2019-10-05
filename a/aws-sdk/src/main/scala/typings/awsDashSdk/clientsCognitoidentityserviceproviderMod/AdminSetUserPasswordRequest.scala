package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminSetUserPasswordRequest extends js.Object {
  /**
    * The password for the user.
    */
  var Password: PasswordType
  /**
    *  True if the password is permanent, False if it is temporary.
    */
  var Permanent: js.UndefOr[BooleanType] = js.undefined
  /**
    * The user pool ID for the user pool where you want to set the user's password.
    */
  var UserPoolId: UserPoolIdType
  /**
    * The user name of the user whose password you wish to set.
    */
  var Username: UsernameType
}

object AdminSetUserPasswordRequest {
  @scala.inline
  def apply(
    Password: PasswordType,
    UserPoolId: UserPoolIdType,
    Username: UsernameType,
    Permanent: js.UndefOr[Boolean] = js.undefined
  ): AdminSetUserPasswordRequest = {
    val __obj = js.Dynamic.literal(Password = Password, UserPoolId = UserPoolId, Username = Username)
    if (!js.isUndefined(Permanent)) __obj.updateDynamic("Permanent")(Permanent)
    __obj.asInstanceOf[AdminSetUserPasswordRequest]
  }
}

