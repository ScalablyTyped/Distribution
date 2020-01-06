package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminDisableUserRequest extends js.Object {
  /**
    * The user pool ID for the user pool where you want to disable the user.
    */
  var UserPoolId: UserPoolIdType = js.native
  /**
    * The user name of the user you wish to disable.
    */
  var Username: UsernameType = js.native
}

object AdminDisableUserRequest {
  @scala.inline
  def apply(UserPoolId: UserPoolIdType, Username: UsernameType): AdminDisableUserRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AdminDisableUserRequest]
  }
}

