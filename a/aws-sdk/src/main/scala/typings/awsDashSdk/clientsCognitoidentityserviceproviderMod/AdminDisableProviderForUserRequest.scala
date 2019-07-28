package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminDisableProviderForUserRequest extends js.Object {
  /**
    * The user to be disabled.
    */
  var User: ProviderUserIdentifierType
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: StringType
}

object AdminDisableProviderForUserRequest {
  @scala.inline
  def apply(User: ProviderUserIdentifierType, UserPoolId: StringType): AdminDisableProviderForUserRequest = {
    val __obj = js.Dynamic.literal(User = User, UserPoolId = UserPoolId)
  
    __obj.asInstanceOf[AdminDisableProviderForUserRequest]
  }
}

