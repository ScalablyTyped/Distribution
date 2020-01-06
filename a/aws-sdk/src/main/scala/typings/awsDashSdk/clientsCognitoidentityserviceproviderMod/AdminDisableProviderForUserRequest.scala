package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminDisableProviderForUserRequest extends js.Object {
  /**
    * The user to be disabled.
    */
  var User: ProviderUserIdentifierType = js.native
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: StringType = js.native
}

object AdminDisableProviderForUserRequest {
  @scala.inline
  def apply(User: ProviderUserIdentifierType, UserPoolId: StringType): AdminDisableProviderForUserRequest = {
    val __obj = js.Dynamic.literal(User = User.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AdminDisableProviderForUserRequest]
  }
}

