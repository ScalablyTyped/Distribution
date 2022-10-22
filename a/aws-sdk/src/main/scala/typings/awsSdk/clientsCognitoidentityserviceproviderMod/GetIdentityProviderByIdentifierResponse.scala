package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIdentityProviderByIdentifierResponse extends StObject {
  
  /**
    * The identity provider details.
    */
  var IdentityProvider: IdentityProviderType
}
object GetIdentityProviderByIdentifierResponse {
  
  inline def apply(IdentityProvider: IdentityProviderType): GetIdentityProviderByIdentifierResponse = {
    val __obj = js.Dynamic.literal(IdentityProvider = IdentityProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityProviderByIdentifierResponse]
  }
  
  extension [Self <: GetIdentityProviderByIdentifierResponse](x: Self) {
    
    inline def setIdentityProvider(value: IdentityProviderType): Self = StObject.set(x, "IdentityProvider", value.asInstanceOf[js.Any])
  }
}
