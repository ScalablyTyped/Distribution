package typings.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseAuthOptions extends StObject {
  
  var __instate: js.UndefOr[String] = js.native
  
  var _csrf: js.UndefOr[String] = js.native
  
  var audience: js.UndefOr[String] = js.native
  
  var clientID: js.UndefOr[String] = js.native
  
  var nonce: js.UndefOr[String] = js.native
  
  var redirectUri: js.UndefOr[String] = js.native
  
  var responseType: js.UndefOr[String] = js.native
  
  var scope: js.UndefOr[String] = js.native
  
  var state: js.UndefOr[String] = js.native
}
object BaseAuthOptions {
  
  @scala.inline
  def apply(): BaseAuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseAuthOptions]
  }
  
  @scala.inline
  implicit class BaseAuthOptionsMutableBuilder[Self <: BaseAuthOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    @scala.inline
    def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIDUndefined: Self = StObject.set(x, "clientID", js.undefined)
    
    @scala.inline
    def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    @scala.inline
    def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
    
    @scala.inline
    def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def set__instate(value: String): Self = StObject.set(x, "__instate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__instateUndefined: Self = StObject.set(x, "__instate", js.undefined)
    
    @scala.inline
    def set_csrf(value: String): Self = StObject.set(x, "_csrf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_csrfUndefined: Self = StObject.set(x, "_csrf", js.undefined)
  }
}
