package typings.asana.mod

import typings.asana.mod.auth.Authenticator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DispatcherOptions extends StObject {
  
  var authenticator: js.UndefOr[Authenticator] = js.undefined
  
  var handleUnauthorized: js.UndefOr[js.Function0[Boolean | typings.bluebird.mod.^[Boolean]]] = js.undefined
  
  var requestTimeout: js.UndefOr[String] = js.undefined
  
  var retryOnRateLimit: js.UndefOr[Boolean] = js.undefined
}
object DispatcherOptions {
  
  @scala.inline
  def apply(): DispatcherOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DispatcherOptions]
  }
  
  @scala.inline
  implicit class DispatcherOptionsMutableBuilder[Self <: DispatcherOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticator(value: Authenticator): Self = StObject.set(x, "authenticator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticatorUndefined: Self = StObject.set(x, "authenticator", js.undefined)
    
    @scala.inline
    def setHandleUnauthorized(value: () => Boolean | typings.bluebird.mod.^[Boolean]): Self = StObject.set(x, "handleUnauthorized", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHandleUnauthorizedUndefined: Self = StObject.set(x, "handleUnauthorized", js.undefined)
    
    @scala.inline
    def setRequestTimeout(value: String): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
    
    @scala.inline
    def setRetryOnRateLimit(value: Boolean): Self = StObject.set(x, "retryOnRateLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryOnRateLimitUndefined: Self = StObject.set(x, "retryOnRateLimit", js.undefined)
  }
}
