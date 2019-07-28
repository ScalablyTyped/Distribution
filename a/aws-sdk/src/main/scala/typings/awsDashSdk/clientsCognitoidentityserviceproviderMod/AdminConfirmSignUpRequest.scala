package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminConfirmSignUpRequest extends js.Object {
  /**
    * The user pool ID for which you want to confirm user registration.
    */
  var UserPoolId: UserPoolIdType
  /**
    * The user name for which you want to confirm user registration.
    */
  var Username: UsernameType
}

object AdminConfirmSignUpRequest {
  @scala.inline
  def apply(UserPoolId: UserPoolIdType, Username: UsernameType): AdminConfirmSignUpRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId, Username = Username)
  
    __obj.asInstanceOf[AdminConfirmSignUpRequest]
  }
}

