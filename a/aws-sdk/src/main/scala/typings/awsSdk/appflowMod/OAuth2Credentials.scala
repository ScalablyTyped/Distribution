package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuth2Credentials extends StObject {
  
  /**
    * The access token used to access the connector on your behalf.
    */
  var accessToken: js.UndefOr[AccessToken] = js.undefined
  
  /**
    * The identifier for the desired client.
    */
  var clientId: js.UndefOr[ClientId] = js.undefined
  
  /**
    * The client secret used by the OAuth client to authenticate to the authorization server.
    */
  var clientSecret: js.UndefOr[ClientSecret] = js.undefined
  
  var oAuthRequest: js.UndefOr[ConnectorOAuthRequest] = js.undefined
  
  /**
    * The refresh token used to refresh an expired access token.
    */
  var refreshToken: js.UndefOr[RefreshToken] = js.undefined
}
object OAuth2Credentials {
  
  inline def apply(): OAuth2Credentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuth2Credentials]
  }
  
  extension [Self <: OAuth2Credentials](x: Self) {
    
    inline def setAccessToken(value: AccessToken): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    inline def setClientId(value: ClientId): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setClientSecret(value: ClientSecret): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
    
    inline def setOAuthRequest(value: ConnectorOAuthRequest): Self = StObject.set(x, "oAuthRequest", value.asInstanceOf[js.Any])
    
    inline def setOAuthRequestUndefined: Self = StObject.set(x, "oAuthRequest", js.undefined)
    
    inline def setRefreshToken(value: RefreshToken): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
  }
}
