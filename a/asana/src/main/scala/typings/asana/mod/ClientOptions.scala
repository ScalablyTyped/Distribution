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
  
  @scala.inline
  def apply(): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOptions]
  }
  
  @scala.inline
  implicit class ClientOptionsMutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsanaBaseUrl(value: String): Self = StObject.set(x, "asanaBaseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsanaBaseUrlUndefined: Self = StObject.set(x, "asanaBaseUrl", js.undefined)
    
    @scala.inline
    def setClientId(value: String | Double): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
    
    @scala.inline
    def setDefaultHeaders(value: StringDictionary[String]): Self = StObject.set(x, "defaultHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultHeadersUndefined: Self = StObject.set(x, "defaultHeaders", js.undefined)
    
    @scala.inline
    def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
  }
}
