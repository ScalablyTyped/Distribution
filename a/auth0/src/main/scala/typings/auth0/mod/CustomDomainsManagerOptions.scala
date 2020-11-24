package typings.auth0.mod

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
  implicit class CustomDomainsManagerOptionsOps[Self <: CustomDomainsManagerOptions] (val x: Self) extends AnyVal {
    
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
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setRetry(value: RetryOptions): Self = this.set("retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetry: Self = this.set("retry", js.undefined)
  }
}
