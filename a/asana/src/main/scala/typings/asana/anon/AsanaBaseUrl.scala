package typings.asana.anon

import typings.asana.mod.resources.VersionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsanaBaseUrl extends StObject {
  
  var _cachedVersionInfo: VersionInfo
  
  var asanaBaseUrl: String
  
  var authenticator: ApiKey
  
  var requestTimeout: Double
  
  var retryOnRateLimit: Boolean
}
object AsanaBaseUrl {
  
  inline def apply(
    _cachedVersionInfo: VersionInfo,
    asanaBaseUrl: String,
    authenticator: ApiKey,
    requestTimeout: Double,
    retryOnRateLimit: Boolean
  ): AsanaBaseUrl = {
    val __obj = js.Dynamic.literal(_cachedVersionInfo = _cachedVersionInfo.asInstanceOf[js.Any], asanaBaseUrl = asanaBaseUrl.asInstanceOf[js.Any], authenticator = authenticator.asInstanceOf[js.Any], requestTimeout = requestTimeout.asInstanceOf[js.Any], retryOnRateLimit = retryOnRateLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsanaBaseUrl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AsanaBaseUrl] (val x: Self) extends AnyVal {
    
    inline def setAsanaBaseUrl(value: String): Self = StObject.set(x, "asanaBaseUrl", value.asInstanceOf[js.Any])
    
    inline def setAuthenticator(value: ApiKey): Self = StObject.set(x, "authenticator", value.asInstanceOf[js.Any])
    
    inline def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
    
    inline def setRetryOnRateLimit(value: Boolean): Self = StObject.set(x, "retryOnRateLimit", value.asInstanceOf[js.Any])
    
    inline def set_cachedVersionInfo(value: VersionInfo): Self = StObject.set(x, "_cachedVersionInfo", value.asInstanceOf[js.Any])
  }
}
