package typings.auth0Lock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Auth0LockAuthOptions extends StObject {
  
  var audience: js.UndefOr[String] = js.undefined
  
  var autoParseHash: js.UndefOr[Boolean] = js.undefined
  
  var params: js.UndefOr[Auth0LockAuthParamsOptions] = js.undefined
  
  var redirect: js.UndefOr[Boolean] = js.undefined
  
  var redirectUrl: js.UndefOr[String] = js.undefined
  
  var responseMode: js.UndefOr[String] = js.undefined
  
  var responseType: js.UndefOr[String] = js.undefined
  
  var sso: js.UndefOr[Boolean] = js.undefined
}
object Auth0LockAuthOptions {
  
  inline def apply(): Auth0LockAuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Auth0LockAuthOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Auth0LockAuthOptions] (val x: Self) extends AnyVal {
    
    inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    inline def setAutoParseHash(value: Boolean): Self = StObject.set(x, "autoParseHash", value.asInstanceOf[js.Any])
    
    inline def setAutoParseHashUndefined: Self = StObject.set(x, "autoParseHash", js.undefined)
    
    inline def setParams(value: Auth0LockAuthParamsOptions): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setRedirect(value: Boolean): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    
    inline def setRedirectUrl(value: String): Self = StObject.set(x, "redirectUrl", value.asInstanceOf[js.Any])
    
    inline def setRedirectUrlUndefined: Self = StObject.set(x, "redirectUrl", js.undefined)
    
    inline def setResponseMode(value: String): Self = StObject.set(x, "responseMode", value.asInstanceOf[js.Any])
    
    inline def setResponseModeUndefined: Self = StObject.set(x, "responseMode", js.undefined)
    
    inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    inline def setSso(value: Boolean): Self = StObject.set(x, "sso", value.asInstanceOf[js.Any])
    
    inline def setSsoUndefined: Self = StObject.set(x, "sso", js.undefined)
  }
}
