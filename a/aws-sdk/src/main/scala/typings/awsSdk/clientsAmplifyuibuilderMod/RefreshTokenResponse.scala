package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshTokenResponse extends StObject {
  
  /**
    * The access token.
    */
  var accessToken: SensitiveString
  
  /**
    * The date and time when the new access token expires.
    */
  var expiresIn: Integer
}
object RefreshTokenResponse {
  
  inline def apply(accessToken: SensitiveString, expiresIn: Integer): RefreshTokenResponse = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshTokenResponse]
  }
  
  extension [Self <: RefreshTokenResponse](x: Self) {
    
    inline def setAccessToken(value: SensitiveString): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setExpiresIn(value: Integer): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
  }
}
