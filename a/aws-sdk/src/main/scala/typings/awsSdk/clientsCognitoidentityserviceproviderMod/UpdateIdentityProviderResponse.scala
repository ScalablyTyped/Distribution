package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateIdentityProviderResponse extends StObject {
  
  /**
    * The IdP object.
    */
  var IdentityProvider: IdentityProviderType
}
object UpdateIdentityProviderResponse {
  
  inline def apply(IdentityProvider: IdentityProviderType): UpdateIdentityProviderResponse = {
    val __obj = js.Dynamic.literal(IdentityProvider = IdentityProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIdentityProviderResponse]
  }
  
  extension [Self <: UpdateIdentityProviderResponse](x: Self) {
    
    inline def setIdentityProvider(value: IdentityProviderType): Self = StObject.set(x, "IdentityProvider", value.asInstanceOf[js.Any])
  }
}
