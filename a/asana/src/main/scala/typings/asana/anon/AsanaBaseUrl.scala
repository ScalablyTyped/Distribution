package typings.asana.anon

import typings.asana.mod.resources.VersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsanaBaseUrl extends js.Object {
  
  var _cachedVersionInfo: VersionInfo = js.native
  
  var asanaBaseUrl: String = js.native
  
  var authenticator: ApiKey = js.native
  
  var requestTimeout: Double = js.native
  
  var retryOnRateLimit: Boolean = js.native
}
object AsanaBaseUrl {
  
  @scala.inline
  def apply(
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
  implicit class AsanaBaseUrlOps[Self <: AsanaBaseUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_cachedVersionInfo(value: VersionInfo): Self = this.set("_cachedVersionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsanaBaseUrl(value: String): Self = this.set("asanaBaseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticator(value: ApiKey): Self = this.set("authenticator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestTimeout(value: Double): Self = this.set("requestTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryOnRateLimit(value: Boolean): Self = this.set("retryOnRateLimit", value.asInstanceOf[js.Any])
  }
}
