package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlackConnectorProfileCredentials extends js.Object {
  
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
  implicit class SlackConnectorProfileCredentialsOps[Self <: SlackConnectorProfileCredentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientId(value: ClientId): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecret(value: ClientSecret): Self = this.set("clientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessToken(value: AccessToken): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessToken: Self = this.set("accessToken", js.undefined)
    
    @scala.inline
    def setOAuthRequest(value: ConnectorOAuthRequest): Self = this.set("oAuthRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOAuthRequest: Self = this.set("oAuthRequest", js.undefined)
  }
}
