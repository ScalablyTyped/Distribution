package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminDisableUserRequest extends js.Object {
  /**
    * The user pool ID for the user pool where you want to disable the user.
    */
  var UserPoolId: UserPoolIdType
  /**
    * The user name of the user you wish to disable.
    */
  var Username: UsernameType
}

object AdminDisableUserRequest {
  @scala.inline
  def apply(UserPoolId: UserPoolIdType, Username: UsernameType): AdminDisableUserRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId, Username = Username)
  
    __obj.asInstanceOf[AdminDisableUserRequest]
  }
}

