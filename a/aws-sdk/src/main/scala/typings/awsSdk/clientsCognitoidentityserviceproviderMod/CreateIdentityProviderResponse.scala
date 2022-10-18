package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIdentityProviderResponse extends StObject {
  
  /**
    * The newly created IdP object.
    */
  var IdentityProvider: IdentityProviderType
}
object CreateIdentityProviderResponse {
  
  inline def apply(IdentityProvider: IdentityProviderType): CreateIdentityProviderResponse = {
    val __obj = js.Dynamic.literal(IdentityProvider = IdentityProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIdentityProviderResponse]
  }
  
  extension [Self <: CreateIdentityProviderResponse](x: Self) {
    
    inline def setIdentityProvider(value: IdentityProviderType): Self = StObject.set(x, "IdentityProvider", value.asInstanceOf[js.Any])
  }
}
