package typings.asana.mod

import typings.asana.mod.auth.Authenticator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DispatcherOptions extends js.Object {
  
  var authenticator: js.UndefOr[Authenticator] = js.native
  
  var handleUnauthorized: js.UndefOr[js.Function0[Boolean | typings.bluebird.mod.^[Boolean]]] = js.native
  
  var requestTimeout: js.UndefOr[String] = js.native
  
  var retryOnRateLimit: js.UndefOr[Boolean] = js.native
}
object DispatcherOptions {
  
  @scala.inline
  def apply(): DispatcherOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DispatcherOptions]
  }
  
  @scala.inline
  implicit class DispatcherOptionsOps[Self <: DispatcherOptions] (val x: Self) extends AnyVal {
    
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
    def setAuthenticator(value: Authenticator): Self = this.set("authenticator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticator: Self = this.set("authenticator", js.undefined)
    
    @scala.inline
    def setHandleUnauthorized(value: () => Boolean | typings.bluebird.mod.^[Boolean]): Self = this.set("handleUnauthorized", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteHandleUnauthorized: Self = this.set("handleUnauthorized", js.undefined)
    
    @scala.inline
    def setRequestTimeout(value: String): Self = this.set("requestTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestTimeout: Self = this.set("requestTimeout", js.undefined)
    
    @scala.inline
    def setRetryOnRateLimit(value: Boolean): Self = this.set("retryOnRateLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryOnRateLimit: Self = this.set("retryOnRateLimit", js.undefined)
  }
}
