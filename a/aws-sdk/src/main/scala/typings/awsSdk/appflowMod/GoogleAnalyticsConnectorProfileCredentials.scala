package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsConnectorProfileCredentials extends StObject {
  
  /**
    *  The credentials used to access protected Google Analytics resources. 
    */
  var accessToken: js.UndefOr[AccessToken] = js.native
  
  /**
    *  The identifier for the desired client. 
    */
  var clientId: ClientId = js.native
  
  /**
    *  The client secret used by the OAuth client to authenticate to the authorization server. 
    */
  var clientSecret: ClientSecret = js.native
  
  /**
    *  The OAuth requirement needed to request security tokens from the connector endpoint. 
    */
  var oAuthRequest: js.UndefOr[ConnectorOAuthRequest] = js.native
  
  /**
    *  The credentials used to acquire new access tokens. This is required only for OAuth2 access tokens, and is not required for OAuth1 access tokens. 
    */
  var refreshToken: js.UndefOr[RefreshToken] = js.native
}
object GoogleAnalyticsConnectorProfileCredentials {
  
  @scala.inline
  def apply(clientId: ClientId, clientSecret: ClientSecret): GoogleAnalyticsConnectorProfileCredentials = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleAnalyticsConnectorProfileCredentials]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsConnectorProfileCredentialsMutableBuilder[Self <: GoogleAnalyticsConnectorProfileCredentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: AccessToken): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    @scala.inline
    def setClientId(value: ClientId): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecret(value: ClientSecret): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOAuthRequest(value: ConnectorOAuthRequest): Self = StObject.set(x, "oAuthRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOAuthRequestUndefined: Self = StObject.set(x, "oAuthRequest", js.undefined)
    
    @scala.inline
    def setRefreshToken(value: RefreshToken): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
  }
}
