package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateIdentityProviderResponse extends js.Object {
  /**
    * The identity provider object.
    */
  var IdentityProvider: IdentityProviderType = js.native
}

object UpdateIdentityProviderResponse {
  @scala.inline
  def apply(IdentityProvider: IdentityProviderType): UpdateIdentityProviderResponse = {
    val __obj = js.Dynamic.literal(IdentityProvider = IdentityProvider.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateIdentityProviderResponse]
  }
}

