package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarketoConnectorProfileCredentials extends StObject {
  
  /**
    *  The credentials used to access protected Marketo resources. 
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
}
object MarketoConnectorProfileCredentials {
  
  @scala.inline
  def apply(clientId: ClientId, clientSecret: ClientSecret): MarketoConnectorProfileCredentials = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarketoConnectorProfileCredentials]
  }
  
  @scala.inline
  implicit class MarketoConnectorProfileCredentialsMutableBuilder[Self <: MarketoConnectorProfileCredentials] (val x: Self) extends AnyVal {
    
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
  }
}
