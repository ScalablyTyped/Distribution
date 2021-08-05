package typings.asana.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options to configure the client */
trait ClientOptions
  extends StObject
     with DispatcherOptions {
  
  var asanaBaseUrl: js.UndefOr[String] = js.undefined
  
  var clientId: js.UndefOr[String | Double] = js.undefined
  
  var clientSecret: js.UndefOr[String] = js.undefined
  
  var defaultHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var redirectUri: js.UndefOr[String] = js.undefined
}
object ClientOptions {
  
  inline def apply(): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOptions]
  }
  
  extension [Self <: ClientOptions](x: Self) {
    
    inline def setAsanaBaseUrl(value: String): Self = StObject.set(x, "asanaBaseUrl", value.asInstanceOf[js.Any])
    
    inline def setAsanaBaseUrlUndefined: Self = StObject.set(x, "asanaBaseUrl", js.undefined)
    
    inline def setClientId(value: String | Double): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
    
    inline def setDefaultHeaders(value: StringDictionary[String]): Self = StObject.set(x, "defaultHeaders", value.asInstanceOf[js.Any])
    
    inline def setDefaultHeadersUndefined: Self = StObject.set(x, "defaultHeaders", js.undefined)
    
    inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    
    inline def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
  }
}
