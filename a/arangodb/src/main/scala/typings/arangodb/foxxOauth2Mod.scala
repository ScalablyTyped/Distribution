package typings.arangodb

import typings.arangodb.anon.Granttype
import typings.arangodb.anon.Responsetype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foxxOauth2Mod {
  
  inline def apply(options: OAuth2Options): OAuth2Client = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[OAuth2Client]
  
  @JSImport("@arangodb/foxx/oauth2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait OAuth2Client extends StObject {
    
    def exchangeGrantToken(code: String, redirect_uri: String): Any = js.native
    def exchangeGrantToken(code: String, redirect_uri: String, options: Granttype): Any = js.native
    
    def fetchActiveUser(access_token: String): Any = js.native
    
    def getAuthUrl(redirect_uri: String): String = js.native
    def getAuthUrl(redirect_uri: String, options: Responsetype): String = js.native
  }
  
  trait OAuth2Options extends StObject {
    
    var activeUserEndpoint: js.UndefOr[String] = js.undefined
    
    var authEndpoint: String
    
    var clientId: String
    
    var clientSecret: String
    
    var refreshEndpoint: js.UndefOr[String] = js.undefined
    
    var tokenEndpoint: String
  }
  object OAuth2Options {
    
    inline def apply(authEndpoint: String, clientId: String, clientSecret: String, tokenEndpoint: String): OAuth2Options = {
      val __obj = js.Dynamic.literal(authEndpoint = authEndpoint.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], tokenEndpoint = tokenEndpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[OAuth2Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OAuth2Options] (val x: Self) extends AnyVal {
      
      inline def setActiveUserEndpoint(value: String): Self = StObject.set(x, "activeUserEndpoint", value.asInstanceOf[js.Any])
      
      inline def setActiveUserEndpointUndefined: Self = StObject.set(x, "activeUserEndpoint", js.undefined)
      
      inline def setAuthEndpoint(value: String): Self = StObject.set(x, "authEndpoint", value.asInstanceOf[js.Any])
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setRefreshEndpoint(value: String): Self = StObject.set(x, "refreshEndpoint", value.asInstanceOf[js.Any])
      
      inline def setRefreshEndpointUndefined: Self = StObject.set(x, "refreshEndpoint", js.undefined)
      
      inline def setTokenEndpoint(value: String): Self = StObject.set(x, "tokenEndpoint", value.asInstanceOf[js.Any])
    }
  }
}
