package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIdentityProviderByIdentifierResponse extends js.Object {
  /**
    * The identity provider object.
    */
  var IdentityProvider: IdentityProviderType
}

object GetIdentityProviderByIdentifierResponse {
  @scala.inline
  def apply(IdentityProvider: IdentityProviderType): GetIdentityProviderByIdentifierResponse = {
    val __obj = js.Dynamic.literal(IdentityProvider = IdentityProvider)
  
    __obj.asInstanceOf[GetIdentityProviderByIdentifierResponse]
  }
}

