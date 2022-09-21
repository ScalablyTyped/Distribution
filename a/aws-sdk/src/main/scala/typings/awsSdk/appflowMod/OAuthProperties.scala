package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuthProperties extends StObject {
  
  /**
    *  The authorization code url required to redirect to SAP Login Page to fetch authorization code for OAuth type authentication. 
    */
  var authCodeUrl: AuthCodeUrl
  
  /**
    *  The OAuth scopes required for OAuth type authentication. 
    */
  var oAuthScopes: OAuthScopeList
  
  /**
    *  The token url required to fetch access/refresh tokens using authorization code and also to refresh expired access token using refresh token.
    */
  var tokenUrl: TokenUrl
}
object OAuthProperties {
  
  inline def apply(authCodeUrl: AuthCodeUrl, oAuthScopes: OAuthScopeList, tokenUrl: TokenUrl): OAuthProperties = {
    val __obj = js.Dynamic.literal(authCodeUrl = authCodeUrl.asInstanceOf[js.Any], oAuthScopes = oAuthScopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuthProperties]
  }
  
  extension [Self <: OAuthProperties](x: Self) {
    
    inline def setAuthCodeUrl(value: AuthCodeUrl): Self = StObject.set(x, "authCodeUrl", value.asInstanceOf[js.Any])
    
    inline def setOAuthScopes(value: OAuthScopeList): Self = StObject.set(x, "oAuthScopes", value.asInstanceOf[js.Any])
    
    inline def setOAuthScopesVarargs(value: OAuthScope*): Self = StObject.set(x, "oAuthScopes", js.Array(value*))
    
    inline def setTokenUrl(value: TokenUrl): Self = StObject.set(x, "tokenUrl", value.asInstanceOf[js.Any])
  }
}
