package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SalesforceMetadata extends StObject {
  
  /**
    * The Salesforce APIs that you can have Amazon AppFlow use when your flows transfers data to or from Salesforce.
    */
  var dataTransferApis: js.UndefOr[SalesforceDataTransferApiList] = js.undefined
  
  /**
    *  The desired authorization scope for the Salesforce account. 
    */
  var oAuthScopes: js.UndefOr[OAuthScopeList] = js.undefined
  
  /**
    * The OAuth 2.0 grant types that Amazon AppFlow can use when it requests an access token from Salesforce. Amazon AppFlow requires an access token each time it attempts to access your Salesforce records.  AUTHORIZATION_CODE  Amazon AppFlow passes an authorization code when it requests the access token from Salesforce. Amazon AppFlow receives the authorization code from Salesforce after you log in to your Salesforce account and authorize Amazon AppFlow to access your records.  CLIENT_CREDENTIALS  Amazon AppFlow passes client credentials (a client ID and client secret) when it requests the access token from Salesforce. You provide these credentials to Amazon AppFlow when you define the connection to your Salesforce account.  JWT_BEARER  Amazon AppFlow passes a JSON web token (JWT) when it requests the access token from Salesforce. You provide the JWT to Amazon AppFlow when you define the connection to your Salesforce account. When you use this grant type, you don't need to log in to your Salesforce account to authorize Amazon AppFlow to access your records.  
    */
  var oauth2GrantTypesSupported: js.UndefOr[OAuth2GrantTypeSupportedList] = js.undefined
}
object SalesforceMetadata {
  
  inline def apply(): SalesforceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SalesforceMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SalesforceMetadata] (val x: Self) extends AnyVal {
    
    inline def setDataTransferApis(value: SalesforceDataTransferApiList): Self = StObject.set(x, "dataTransferApis", value.asInstanceOf[js.Any])
    
    inline def setDataTransferApisUndefined: Self = StObject.set(x, "dataTransferApis", js.undefined)
    
    inline def setDataTransferApisVarargs(value: SalesforceDataTransferApi*): Self = StObject.set(x, "dataTransferApis", js.Array(value*))
    
    inline def setOAuthScopes(value: OAuthScopeList): Self = StObject.set(x, "oAuthScopes", value.asInstanceOf[js.Any])
    
    inline def setOAuthScopesUndefined: Self = StObject.set(x, "oAuthScopes", js.undefined)
    
    inline def setOAuthScopesVarargs(value: OAuthScope*): Self = StObject.set(x, "oAuthScopes", js.Array(value*))
    
    inline def setOauth2GrantTypesSupported(value: OAuth2GrantTypeSupportedList): Self = StObject.set(x, "oauth2GrantTypesSupported", value.asInstanceOf[js.Any])
    
    inline def setOauth2GrantTypesSupportedUndefined: Self = StObject.set(x, "oauth2GrantTypesSupported", js.undefined)
    
    inline def setOauth2GrantTypesSupportedVarargs(value: OAuth2GrantType*): Self = StObject.set(x, "oauth2GrantTypesSupported", js.Array(value*))
  }
}
