package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIdentityProviderByIdentifierRequest extends js.Object {
  /**
    * The identity provider ID.
    */
  var IdpIdentifier: IdpIdentifierType
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType
}

object GetIdentityProviderByIdentifierRequest {
  @scala.inline
  def apply(IdpIdentifier: IdpIdentifierType, UserPoolId: UserPoolIdType): GetIdentityProviderByIdentifierRequest = {
    val __obj = js.Dynamic.literal(IdpIdentifier = IdpIdentifier, UserPoolId = UserPoolId)
  
    __obj.asInstanceOf[GetIdentityProviderByIdentifierRequest]
  }
}

