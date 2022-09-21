package typings.arangodb

import org.scalablytyped.runtime.StringDictionary
import typings.arangodb.ArangoDB.HttpMethod
import typings.arangodb.anon.Headers
import typings.arangodb.arangodbStrings.PLAINTEXT
import typings.arangodb.arangodbStrings.`HMAC-SHA1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oauth1Mod {
  
  inline def apply(options: OAuth1Options): OAuth1Client = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[OAuth1Client]
  
  @JSImport("@arangodb/foxx/oauth1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait OAuth1Client extends StObject {
    
    def createSignedRequest(
      method: HttpMethod,
      url: String,
      parameters: String,
      oauth_token: String,
      oauth_token_secret: String
    ): Headers = js.native
    def createSignedRequest(
      method: HttpMethod,
      url: String,
      parameters: StringDictionary[js.UndefOr[String]],
      oauth_token: String,
      oauth_token_secret: String
    ): Headers = js.native
    def createSignedRequest(method: HttpMethod, url: String, parameters: Null, oauth_token: String, oauth_token_secret: String): Headers = js.native
    
    def exchangeRequestToken(oauth_token: String, oauth_verifier: String): Any = js.native
    def exchangeRequestToken(oauth_token: String, oauth_verifier: String, qs: StringDictionary[js.UndefOr[String]]): Any = js.native
    
    def fetchActiveUser(oauth_token: String, oauth_token_secret: String): Any = js.native
    def fetchActiveUser(oauth_token: String, oauth_token_secret: String, qs: StringDictionary[js.UndefOr[String]]): Any = js.native
    
    def fetchRequestToken(oauth_callback: String): Any = js.native
    def fetchRequestToken(oauth_callback: String, qs: StringDictionary[js.UndefOr[String]]): Any = js.native
    
    def getAuthUrl(oauth_token: String): String = js.native
    def getAuthUrl(oauth_token: String, qs: StringDictionary[js.UndefOr[String]]): String = js.native
  }
  
  trait OAuth1Options extends StObject {
    
    var accessTokenEndpoint: String
    
    var activeUserEndpoint: js.UndefOr[String] = js.undefined
    
    var authEndpoint: String
    
    var clientId: String
    
    var clientSecret: String
    
    var requestTokenEndpoint: String
    
    var signatureMethod: js.UndefOr[`HMAC-SHA1` | PLAINTEXT] = js.undefined
  }
  object OAuth1Options {
    
    inline def apply(
      accessTokenEndpoint: String,
      authEndpoint: String,
      clientId: String,
      clientSecret: String,
      requestTokenEndpoint: String
    ): OAuth1Options = {
      val __obj = js.Dynamic.literal(accessTokenEndpoint = accessTokenEndpoint.asInstanceOf[js.Any], authEndpoint = authEndpoint.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], requestTokenEndpoint = requestTokenEndpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[OAuth1Options]
    }
    
    extension [Self <: OAuth1Options](x: Self) {
      
      inline def setAccessTokenEndpoint(value: String): Self = StObject.set(x, "accessTokenEndpoint", value.asInstanceOf[js.Any])
      
      inline def setActiveUserEndpoint(value: String): Self = StObject.set(x, "activeUserEndpoint", value.asInstanceOf[js.Any])
      
      inline def setActiveUserEndpointUndefined: Self = StObject.set(x, "activeUserEndpoint", js.undefined)
      
      inline def setAuthEndpoint(value: String): Self = StObject.set(x, "authEndpoint", value.asInstanceOf[js.Any])
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setRequestTokenEndpoint(value: String): Self = StObject.set(x, "requestTokenEndpoint", value.asInstanceOf[js.Any])
      
      inline def setSignatureMethod(value: `HMAC-SHA1` | PLAINTEXT): Self = StObject.set(x, "signatureMethod", value.asInstanceOf[js.Any])
      
      inline def setSignatureMethodUndefined: Self = StObject.set(x, "signatureMethod", js.undefined)
    }
  }
}
