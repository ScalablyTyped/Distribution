package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminSetUserPasswordRequest extends js.Object {
  /**
    * The password for the user.
    */
  var Password: PasswordType = js.native
  /**
    *  True if the password is permanent, False if it is temporary.
    */
  var Permanent: js.UndefOr[BooleanType] = js.native
  /**
    * The user pool ID for the user pool where you want to set the user's password.
    */
  var UserPoolId: UserPoolIdType = js.native
  /**
    * The user name of the user whose password you wish to set.
    */
  var Username: UsernameType = js.native
}

object AdminSetUserPasswordRequest {
  @scala.inline
  def apply(
    Password: PasswordType,
    UserPoolId: UserPoolIdType,
    Username: UsernameType,
    Permanent: js.UndefOr[Boolean] = js.undefined
  ): AdminSetUserPasswordRequest = {
    val __obj = js.Dynamic.literal(Password = Password.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    if (!js.isUndefined(Permanent)) __obj.updateDynamic("Permanent")(Permanent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminSetUserPasswordRequest]
  }
}

