package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminResetUserPasswordRequest extends js.Object {
  /**
    * The user pool ID for the user pool where you want to reset the user's password.
    */
  var UserPoolId: UserPoolIdType
  /**
    * The user name of the user whose password you wish to reset.
    */
  var Username: UsernameType
}

object AdminResetUserPasswordRequest {
  @scala.inline
  def apply(UserPoolId: UserPoolIdType, Username: UsernameType): AdminResetUserPasswordRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId, Username = Username)
  
    __obj.asInstanceOf[AdminResetUserPasswordRequest]
  }
}

