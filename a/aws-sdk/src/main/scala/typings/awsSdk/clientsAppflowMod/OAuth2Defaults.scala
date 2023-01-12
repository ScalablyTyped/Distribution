package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuth2Defaults extends StObject {
  
  /**
    * Auth code URLs that can be used for OAuth 2.0 authentication.
    */
  var authCodeUrls: js.UndefOr[AuthCodeUrlList] = js.undefined
  
  /**
    * List of custom parameters required for OAuth 2.0 authentication.
    */
  var oauth2CustomProperties: js.UndefOr[OAuth2CustomPropertiesList] = js.undefined
  
  /**
    * OAuth 2.0 grant types supported by the connector.
    */
  var oauth2GrantTypesSupported: js.UndefOr[OAuth2GrantTypeSupportedList] = js.undefined
  
  /**
    * OAuth 2.0 scopes that the connector supports.
    */
  var oauthScopes: js.UndefOr[OAuthScopeList] = js.undefined
  
  /**
    * Token URLs that can be used for OAuth 2.0 authentication.
    */
  var tokenUrls: js.UndefOr[TokenUrlList] = js.undefined
}
object OAuth2Defaults {
  
  inline def apply(): OAuth2Defaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuth2Defaults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OAuth2Defaults] (val x: Self) extends AnyVal {
    
    inline def setAuthCodeUrls(value: AuthCodeUrlList): Self = StObject.set(x, "authCodeUrls", value.asInstanceOf[js.Any])
    
    inline def setAuthCodeUrlsUndefined: Self = StObject.set(x, "authCodeUrls", js.undefined)
    
    inline def setAuthCodeUrlsVarargs(value: AuthCodeUrl*): Self = StObject.set(x, "authCodeUrls", js.Array(value*))
    
    inline def setOauth2CustomProperties(value: OAuth2CustomPropertiesList): Self = StObject.set(x, "oauth2CustomProperties", value.asInstanceOf[js.Any])
    
    inline def setOauth2CustomPropertiesUndefined: Self = StObject.set(x, "oauth2CustomProperties", js.undefined)
    
    inline def setOauth2CustomPropertiesVarargs(value: OAuth2CustomParameter*): Self = StObject.set(x, "oauth2CustomProperties", js.Array(value*))
    
    inline def setOauth2GrantTypesSupported(value: OAuth2GrantTypeSupportedList): Self = StObject.set(x, "oauth2GrantTypesSupported", value.asInstanceOf[js.Any])
    
    inline def setOauth2GrantTypesSupportedUndefined: Self = StObject.set(x, "oauth2GrantTypesSupported", js.undefined)
    
    inline def setOauth2GrantTypesSupportedVarargs(value: OAuth2GrantType*): Self = StObject.set(x, "oauth2GrantTypesSupported", js.Array(value*))
    
    inline def setOauthScopes(value: OAuthScopeList): Self = StObject.set(x, "oauthScopes", value.asInstanceOf[js.Any])
    
    inline def setOauthScopesUndefined: Self = StObject.set(x, "oauthScopes", js.undefined)
    
    inline def setOauthScopesVarargs(value: OAuthScope*): Self = StObject.set(x, "oauthScopes", js.Array(value*))
    
    inline def setTokenUrls(value: TokenUrlList): Self = StObject.set(x, "tokenUrls", value.asInstanceOf[js.Any])
    
    inline def setTokenUrlsUndefined: Self = StObject.set(x, "tokenUrls", js.undefined)
    
    inline def setTokenUrlsVarargs(value: TokenUrl*): Self = StObject.set(x, "tokenUrls", js.Array(value*))
  }
}
