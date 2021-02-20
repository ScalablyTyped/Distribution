package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlackConnectorProfileCredentials extends StObject {
  
  /**
    *  The credentials used to access protected Slack resources. 
    */
  var accessToken: js.UndefOr[AccessToken] = js.native
  
  /**
    *  The identifier for the client. 
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
}
object SlackConnectorProfileCredentials {
  
  @scala.inline
  def apply(clientId: ClientId, clientSecret: ClientSecret): SlackConnectorProfileCredentials = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlackConnectorProfileCredentials]
  }
  
  @scala.inline
  implicit class SlackConnectorProfileCredentialsMutableBuilder[Self <: SlackConnectorProfileCredentials] (val x: Self) extends AnyVal {
    
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
