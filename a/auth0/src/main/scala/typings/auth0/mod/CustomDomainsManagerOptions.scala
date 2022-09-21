package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomDomainsManagerOptions
  extends StObject
     with BaseClientOptions {
  
  var headers: js.UndefOr[Any] = js.undefined
  
  var retry: js.UndefOr[RetryOptions] = js.undefined
}
object CustomDomainsManagerOptions {
  
  inline def apply(baseUrl: String): CustomDomainsManagerOptions = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDomainsManagerOptions]
  }
  
  extension [Self <: CustomDomainsManagerOptions](x: Self) {
    
    inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setRetry(value: RetryOptions): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
  }
}
