package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshTokenRequest extends StObject {
  
  /**
    * The third-party provider for the token. The only valid value is figma.
    */
  var provider: TokenProviders
  
  /**
    * Information about the refresh token request.
    */
  var refreshTokenBody: RefreshTokenRequestBody
}
object RefreshTokenRequest {
  
  inline def apply(provider: TokenProviders, refreshTokenBody: RefreshTokenRequestBody): RefreshTokenRequest = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], refreshTokenBody = refreshTokenBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshTokenRequest]
  }
  
  extension [Self <: RefreshTokenRequest](x: Self) {
    
    inline def setProvider(value: TokenProviders): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenBody(value: RefreshTokenRequestBody): Self = StObject.set(x, "refreshTokenBody", value.asInstanceOf[js.Any])
  }
}
