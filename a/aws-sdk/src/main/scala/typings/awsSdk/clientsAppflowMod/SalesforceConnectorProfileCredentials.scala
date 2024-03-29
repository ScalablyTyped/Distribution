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
    * A JSON web token (JWT) that authorizes Amazon AppFlow to access your Salesforce records.
    */
  var jwtToken: js.UndefOr[JwtToken] = js.undefined
  
  /**
    * Specifies the OAuth 2.0 grant type that Amazon AppFlow uses when it requests an access token from Salesforce. Amazon AppFlow requires an access token each time it attempts to access your Salesforce records. You can specify one of the following values:  AUTHORIZATION_CODE  Amazon AppFlow passes an authorization code when it requests the access token from Salesforce. Amazon AppFlow receives the authorization code from Salesforce after you log in to your Salesforce account and authorize Amazon AppFlow to access your records.  CLIENT_CREDENTIALS  Amazon AppFlow passes client credentials (a client ID and client secret) when it requests the access token from Salesforce. You provide these credentials to Amazon AppFlow when you define the connection to your Salesforce account.  JWT_BEARER  Amazon AppFlow passes a JSON web token (JWT) when it requests the access token from Salesforce. You provide the JWT to Amazon AppFlow when you define the connection to your Salesforce account. When you use this grant type, you don't need to log in to your Salesforce account to authorize Amazon AppFlow to access your records.  
    */
  var oAuth2GrantType: js.UndefOr[OAuth2GrantType] = js.undefined
  
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
    
    inline def setJwtToken(value: JwtToken): Self = StObject.set(x, "jwtToken", value.asInstanceOf[js.Any])
    
    inline def setJwtTokenUndefined: Self = StObject.set(x, "jwtToken", js.undefined)
    
    inline def setOAuth2GrantType(value: OAuth2GrantType): Self = StObject.set(x, "oAuth2GrantType", value.asInstanceOf[js.Any])
    
    inline def setOAuth2GrantTypeUndefined: Self = StObject.set(x, "oAuth2GrantType", js.undefined)
    
    inline def setOAuthRequest(value: ConnectorOAuthRequest): Self = StObject.set(x, "oAuthRequest", value.asInstanceOf[js.Any])
    
    inline def setOAuthRequestUndefined: Self = StObject.set(x, "oAuthRequest", js.undefined)
    
    inline def setRefreshToken(value: RefreshToken): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
  }
}
