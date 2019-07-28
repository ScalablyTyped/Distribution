package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateIdentityProviderResponse extends js.Object {
  /**
    * The newly created identity provider object.
    */
  var IdentityProvider: IdentityProviderType
}

object CreateIdentityProviderResponse {
  @scala.inline
  def apply(IdentityProvider: IdentityProviderType): CreateIdentityProviderResponse = {
    val __obj = js.Dynamic.literal(IdentityProvider = IdentityProvider)
  
    __obj.asInstanceOf[CreateIdentityProviderResponse]
  }
}

