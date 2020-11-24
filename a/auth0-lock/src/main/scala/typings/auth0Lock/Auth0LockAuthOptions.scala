package typings.auth0Lock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Auth0LockAuthOptions extends js.Object {
  
  var audience: js.UndefOr[String] = js.native
  
  var autoParseHash: js.UndefOr[Boolean] = js.native
  
  var params: js.UndefOr[Auth0LockAuthParamsOptions] = js.native
  
  var redirect: js.UndefOr[Boolean] = js.native
  
  var redirectUrl: js.UndefOr[String] = js.native
  
  var responseMode: js.UndefOr[String] = js.native
  
  var responseType: js.UndefOr[String] = js.native
  
  var sso: js.UndefOr[Boolean] = js.native
}
object Auth0LockAuthOptions {
  
  @scala.inline
  def apply(): Auth0LockAuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Auth0LockAuthOptions]
  }
  
  @scala.inline
  implicit class Auth0LockAuthOptionsOps[Self <: Auth0LockAuthOptions] (val x: Self) extends AnyVal {
    
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
    def setAudience(value: String): Self = this.set("audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudience: Self = this.set("audience", js.undefined)
    
    @scala.inline
    def setAutoParseHash(value: Boolean): Self = this.set("autoParseHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoParseHash: Self = this.set("autoParseHash", js.undefined)
    
    @scala.inline
    def setParams(value: Auth0LockAuthParamsOptions): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setRedirect(value: Boolean): Self = this.set("redirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirect: Self = this.set("redirect", js.undefined)
    
    @scala.inline
    def setRedirectUrl(value: String): Self = this.set("redirectUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirectUrl: Self = this.set("redirectUrl", js.undefined)
    
    @scala.inline
    def setResponseMode(value: String): Self = this.set("responseMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseMode: Self = this.set("responseMode", js.undefined)
    
    @scala.inline
    def setResponseType(value: String): Self = this.set("responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseType: Self = this.set("responseType", js.undefined)
    
    @scala.inline
    def setSso(value: Boolean): Self = this.set("sso", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSso: Self = this.set("sso", js.undefined)
  }
}
