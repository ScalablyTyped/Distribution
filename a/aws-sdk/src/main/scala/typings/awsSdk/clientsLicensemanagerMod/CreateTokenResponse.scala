package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTokenResponse extends StObject {
  
  /**
    * Refresh token, encoded as a JWT token.
    */
  var Token: js.UndefOr[TokenString] = js.undefined
  
  /**
    * Token ID.
    */
  var TokenId: js.UndefOr[String] = js.undefined
  
  /**
    * Token type.
    */
  var TokenType: js.UndefOr[typings.awsSdk.clientsLicensemanagerMod.TokenType] = js.undefined
}
object CreateTokenResponse {
  
  inline def apply(): CreateTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTokenResponse]
  }
  
  extension [Self <: CreateTokenResponse](x: Self) {
    
    inline def setToken(value: TokenString): Self = StObject.set(x, "Token", value.asInstanceOf[js.Any])
    
    inline def setTokenId(value: String): Self = StObject.set(x, "TokenId", value.asInstanceOf[js.Any])
    
    inline def setTokenIdUndefined: Self = StObject.set(x, "TokenId", js.undefined)
    
    inline def setTokenType(value: TokenType): Self = StObject.set(x, "TokenType", value.asInstanceOf[js.Any])
    
    inline def setTokenTypeUndefined: Self = StObject.set(x, "TokenType", js.undefined)
    
    inline def setTokenUndefined: Self = StObject.set(x, "Token", js.undefined)
  }
}
