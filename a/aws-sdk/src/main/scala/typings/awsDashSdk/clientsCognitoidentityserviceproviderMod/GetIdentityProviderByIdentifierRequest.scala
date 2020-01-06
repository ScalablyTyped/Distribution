package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIdentityProviderByIdentifierRequest extends js.Object {
  /**
    * The identity provider ID.
    */
  var IdpIdentifier: IdpIdentifierType = js.native
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object GetIdentityProviderByIdentifierRequest {
  @scala.inline
  def apply(IdpIdentifier: IdpIdentifierType, UserPoolId: UserPoolIdType): GetIdentityProviderByIdentifierRequest = {
    val __obj = js.Dynamic.literal(IdpIdentifier = IdpIdentifier.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetIdentityProviderByIdentifierRequest]
  }
}

