package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExchangeCodeForTokenResponse extends StObject {
  
  /**
    * The access token.
    */
  var accessToken: SensitiveString
  
  /**
    * The date and time when the new access token expires.
    */
  var expiresIn: Integer
  
  /**
    * The token to use to refresh a previously issued access token that might have expired.
    */
  var refreshToken: SensitiveString
}
object ExchangeCodeForTokenResponse {
  
  inline def apply(accessToken: SensitiveString, expiresIn: Integer, refreshToken: SensitiveString): ExchangeCodeForTokenResponse = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExchangeCodeForTokenResponse]
  }
  
  extension [Self <: ExchangeCodeForTokenResponse](x: Self) {
    
    inline def setAccessToken(value: SensitiveString): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setExpiresIn(value: Integer): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
    
    inline def setRefreshToken(value: SensitiveString): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
  }
}
