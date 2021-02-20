package typings.auth0Lock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Auth0LockAuthOptions extends StObject {
  
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
  implicit class Auth0LockAuthOptionsMutableBuilder[Self <: Auth0LockAuthOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    @scala.inline
    def setAutoParseHash(value: Boolean): Self = StObject.set(x, "autoParseHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoParseHashUndefined: Self = StObject.set(x, "autoParseHash", js.undefined)
    
    @scala.inline
    def setParams(value: Auth0LockAuthParamsOptions): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setRedirect(value: Boolean): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    
    @scala.inline
    def setRedirectUrl(value: String): Self = StObject.set(x, "redirectUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectUrlUndefined: Self = StObject.set(x, "redirectUrl", js.undefined)
    
    @scala.inline
    def setResponseMode(value: String): Self = StObject.set(x, "responseMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseModeUndefined: Self = StObject.set(x, "responseMode", js.undefined)
    
    @scala.inline
    def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    @scala.inline
    def setSso(value: Boolean): Self = StObject.set(x, "sso", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsoUndefined: Self = StObject.set(x, "sso", js.undefined)
  }
}
