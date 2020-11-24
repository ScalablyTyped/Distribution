package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SalesforceConnectorProfileCredentials extends js.Object {
  
  /**
    *  The credentials used to access protected Salesforce resources. 
    */
  var accessToken: js.UndefOr[AccessToken] = js.native
  
  /**
    *  The secret manager ARN, which contains the client ID and client secret of the connected app. 
    */
  var clientCredentialsArn: js.UndefOr[ClientCredentialsArn] = js.native
  
  /**
    *  The OAuth requirement needed to request security tokens from the connector endpoint. 
    */
  var oAuthRequest: js.UndefOr[ConnectorOAuthRequest] = js.native
  
  /**
    *  The credentials used to acquire new access tokens. 
    */
  var refreshToken: js.UndefOr[RefreshToken] = js.native
}
object SalesforceConnectorProfileCredentials {
  
  @scala.inline
  def apply(): SalesforceConnectorProfileCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SalesforceConnectorProfileCredentials]
  }
  
  @scala.inline
  implicit class SalesforceConnectorProfileCredentialsOps[Self <: SalesforceConnectorProfileCredentials] (val x: Self) extends AnyVal {
    
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
    def setAccessToken(value: AccessToken): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessToken: Self = this.set("accessToken", js.undefined)
    
    @scala.inline
    def setClientCredentialsArn(value: ClientCredentialsArn): Self = this.set("clientCredentialsArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientCredentialsArn: Self = this.set("clientCredentialsArn", js.undefined)
    
    @scala.inline
    def setOAuthRequest(value: ConnectorOAuthRequest): Self = this.set("oAuthRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOAuthRequest: Self = this.set("oAuthRequest", js.undefined)
    
    @scala.inline
    def setRefreshToken(value: RefreshToken): Self = this.set("refreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshToken: Self = this.set("refreshToken", js.undefined)
  }
}
