package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SalesforceConnectorProfileCredentials extends StObject {
  
  /**
    *  The credentials used to access protected Salesforce resources. 
    */
  var accessToken: js.UndefOr[AccessToken] = js.undefined
  
  /**
    *  The secret manager ARN, which contains the client ID and client secret of the connected app. 
    */
  var clientCredentialsArn: js.UndefOr[ClientCredentialsArn] = js.undefined
  
  /**
    *  The OAuth requirement needed to request security tokens from the connector endpoint. 
    */
  var oAuthRequest: js.UndefOr[ConnectorOAuthRequest] = js.undefined
  
  /**
    *  The credentials used to acquire new access tokens. 
    */
  var refreshToken: js.UndefOr[RefreshToken] = js.undefined
}
object SalesforceConnectorProfileCredentials {
  
  inline def apply(): SalesforceConnectorProfileCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SalesforceConnectorProfileCredentials]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SalesforceConnectorProfileCredentials] (val x: Self) extends AnyVal {
    
    inline def setAccessToken(value: AccessToken): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    inline def setClientCredentialsArn(value: ClientCredentialsArn): Self = StObject.set(x, "clientCredentialsArn", value.asInstanceOf[js.Any])
    
    inline def setClientCredentialsArnUndefined: Self = StObject.set(x, "clientCredentialsArn", js.undefined)
    
    inline def setOAuthRequest(value: ConnectorOAuthRequest): Self = StObject.set(x, "oAuthRequest", value.asInstanceOf[js.Any])
    
    inline def setOAuthRequestUndefined: Self = StObject.set(x, "oAuthRequest", js.undefined)
    
    inline def setRefreshToken(value: RefreshToken): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
  }
}
