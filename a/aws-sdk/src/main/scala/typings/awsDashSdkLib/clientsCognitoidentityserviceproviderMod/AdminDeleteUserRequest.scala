package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminDeleteUserRequest extends js.Object {
  /**
    * The user pool ID for the user pool where you want to delete the user.
    */
  var UserPoolId: UserPoolIdType
  /**
    * The user name of the user you wish to delete.
    */
  var Username: UsernameType
}

object AdminDeleteUserRequest {
  @scala.inline
  def apply(UserPoolId: UserPoolIdType, Username: UsernameType): AdminDeleteUserRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId, Username = Username)
  
    __obj.asInstanceOf[AdminDeleteUserRequest]
  }
}

