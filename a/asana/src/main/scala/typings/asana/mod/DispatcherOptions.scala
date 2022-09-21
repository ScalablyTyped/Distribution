package typings.asana.mod

import org.scalablytyped.runtime.StringDictionary
import typings.asana.mod.auth.Authenticator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DispatcherOptions extends StObject {
  
  var authenticator: js.UndefOr[Authenticator] = js.undefined
  
  var defaultHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var handleUnauthorized: js.UndefOr[js.Function0[Boolean | typings.bluebird.mod.^[Boolean]]] = js.undefined
  
  var requestTimeout: js.UndefOr[String] = js.undefined
  
  var retryOnRateLimit: js.UndefOr[Boolean] = js.undefined
}
object DispatcherOptions {
  
  inline def apply(): DispatcherOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DispatcherOptions]
  }
  
  extension [Self <: DispatcherOptions](x: Self) {
    
    inline def setAuthenticator(value: Authenticator): Self = StObject.set(x, "authenticator", value.asInstanceOf[js.Any])
    
    inline def setAuthenticatorUndefined: Self = StObject.set(x, "authenticator", js.undefined)
    
    inline def setDefaultHeaders(value: StringDictionary[String]): Self = StObject.set(x, "defaultHeaders", value.asInstanceOf[js.Any])
    
    inline def setDefaultHeadersUndefined: Self = StObject.set(x, "defaultHeaders", js.undefined)
    
    inline def setHandleUnauthorized(value: () => Boolean | typings.bluebird.mod.^[Boolean]): Self = StObject.set(x, "handleUnauthorized", js.Any.fromFunction0(value))
    
    inline def setHandleUnauthorizedUndefined: Self = StObject.set(x, "handleUnauthorized", js.undefined)
    
    inline def setRequestTimeout(value: String): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
    
    inline def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
    
    inline def setRetryOnRateLimit(value: Boolean): Self = StObject.set(x, "retryOnRateLimit", value.asInstanceOf[js.Any])
    
    inline def setRetryOnRateLimitUndefined: Self = StObject.set(x, "retryOnRateLimit", js.undefined)
  }
}
