package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminGetUserRequest extends js.Object {
  /**
    * The user pool ID for the user pool where you want to get information about the user.
    */
  var UserPoolId: UserPoolIdType
  /**
    * The user name of the user you wish to retrieve.
    */
  var Username: UsernameType
}

object AdminGetUserRequest {
  @scala.inline
  def apply(UserPoolId: UserPoolIdType, Username: UsernameType): AdminGetUserRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId, Username = Username)
  
    __obj.asInstanceOf[AdminGetUserRequest]
  }
}

