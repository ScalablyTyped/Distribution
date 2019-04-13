package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminEnableUserRequest extends js.Object {
  /**
    * The user pool ID for the user pool where you want to enable the user.
    */
  var UserPoolId: UserPoolIdType
  /**
    * The user name of the user you wish to enable.
    */
  var Username: UsernameType
}

object AdminEnableUserRequest {
  @scala.inline
  def apply(UserPoolId: UserPoolIdType, Username: UsernameType): AdminEnableUserRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId, Username = Username)
  
    __obj.asInstanceOf[AdminEnableUserRequest]
  }
}

