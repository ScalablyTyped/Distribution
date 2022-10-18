package typings.awsSdk.clientsCognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOpenIdTokenForDeveloperIdentityResponse extends StObject {
  
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: js.UndefOr[typings.awsSdk.clientsCognitoidentityMod.IdentityId] = js.undefined
  
  /**
    * An OpenID token.
    */
  var Token: js.UndefOr[OIDCToken] = js.undefined
}
object GetOpenIdTokenForDeveloperIdentityResponse {
  
  inline def apply(): GetOpenIdTokenForDeveloperIdentityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOpenIdTokenForDeveloperIdentityResponse]
  }
  
  extension [Self <: GetOpenIdTokenForDeveloperIdentityResponse](x: Self) {
    
    inline def setIdentityId(value: IdentityId): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    inline def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
    
    inline def setToken(value: OIDCToken): Self = StObject.set(x, "Token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "Token", js.undefined)
  }
}
