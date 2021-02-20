package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomDomainsManagerOptions extends BaseClientOptions {
  
  var headers: js.UndefOr[js.Any] = js.native
  
  var retry: js.UndefOr[RetryOptions] = js.native
}
object CustomDomainsManagerOptions {
  
  @scala.inline
  def apply(baseUrl: String): CustomDomainsManagerOptions = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDomainsManagerOptions]
  }
  
  @scala.inline
  implicit class CustomDomainsManagerOptionsMutableBuilder[Self <: CustomDomainsManagerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setRetry(value: RetryOptions): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
  }
}
