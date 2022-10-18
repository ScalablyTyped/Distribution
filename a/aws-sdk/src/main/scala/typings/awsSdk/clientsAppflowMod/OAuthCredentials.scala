package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuthCredentials extends StObject {
  
  /**
    *  The access token used to access protected SAPOData resources. 
    */
  var accessToken: js.UndefOr[AccessToken] = js.undefined
  
  /**
    *  The identifier for the desired client. 
    */
  var clientId: ClientId
  
  /**
    *  The client secret used by the OAuth client to authenticate to the authorization server. 
    */
  var clientSecret: ClientSecret
  
  /**
    *  The OAuth requirement needed to request security tokens from the connector endpoint. 
    */
  var oAuthRequest: js.UndefOr[ConnectorOAuthRequest] = js.undefined
  
  /**
    *  The refresh token used to refresh expired access token. 
    */
  var refreshToken: js.UndefOr[RefreshToken] = js.undefined
}
object OAuthCredentials {
  
  inline def apply(clientId: ClientId, clientSecret: ClientSecret): OAuthCredentials = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuthCredentials]
  }
  
  extension [Self <: OAuthCredentials](x: Self) {
    
    inline def setAccessToken(value: AccessToken): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    inline def setClientId(value: ClientId): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientSecret(value: ClientSecret): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    inline def setOAuthRequest(value: ConnectorOAuthRequest): Self = StObject.set(x, "oAuthRequest", value.asInstanceOf[js.Any])
    
    inline def setOAuthRequestUndefined: Self = StObject.set(x, "oAuthRequest", js.undefined)
    
    inline def setRefreshToken(value: RefreshToken): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
  }
}
