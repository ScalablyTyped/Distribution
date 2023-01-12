package typings.auth0Js.mod

import typings.auth0Js.auth0JsStrings.login
import typings.auth0Js.auth0JsStrings.signUp
import typings.auth0Js.auth0JsStrings.signup_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizeOptions extends StObject {
  
  var accessType: js.UndefOr[String] = js.undefined
  
  var appState: js.UndefOr[Any] = js.undefined
  
  var approvalPrompt: js.UndefOr[String] = js.undefined
  
  var audience: js.UndefOr[String] = js.undefined
  
  var clientID: js.UndefOr[String] = js.undefined
  
  var connection: js.UndefOr[String] = js.undefined
  
  var connection_scope: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var domain: js.UndefOr[String] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var login_hint: js.UndefOr[String] = js.undefined
  
  var mode: js.UndefOr[login | signUp] = js.undefined
  
  var nonce: js.UndefOr[String] = js.undefined
  
  var prompt: js.UndefOr[String] = js.undefined
  
  var redirectUri: js.UndefOr[String] = js.undefined
  
  var responseMode: js.UndefOr[String] = js.undefined
  
  var responseType: js.UndefOr[String] = js.undefined
  
  var scope: js.UndefOr[String] = js.undefined
  
  var screen_hint: js.UndefOr[signup_] = js.undefined
  
  var state: js.UndefOr[String] = js.undefined
}
object AuthorizeOptions {
  
  inline def apply(): AuthorizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthorizeOptions] (val x: Self) extends AnyVal {
    
    inline def setAccessType(value: String): Self = StObject.set(x, "accessType", value.asInstanceOf[js.Any])
    
    inline def setAccessTypeUndefined: Self = StObject.set(x, "accessType", js.undefined)
    
    inline def setAppState(value: Any): Self = StObject.set(x, "appState", value.asInstanceOf[js.Any])
    
    inline def setAppStateUndefined: Self = StObject.set(x, "appState", js.undefined)
    
    inline def setApprovalPrompt(value: String): Self = StObject.set(x, "approvalPrompt", value.asInstanceOf[js.Any])
    
    inline def setApprovalPromptUndefined: Self = StObject.set(x, "approvalPrompt", js.undefined)
    
    inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    inline def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
    
    inline def setClientIDUndefined: Self = StObject.set(x, "clientID", js.undefined)
    
    inline def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    inline def setConnection_scope(value: String | js.Array[String]): Self = StObject.set(x, "connection_scope", value.asInstanceOf[js.Any])
    
    inline def setConnection_scopeUndefined: Self = StObject.set(x, "connection_scope", js.undefined)
    
    inline def setConnection_scopeVarargs(value: String*): Self = StObject.set(x, "connection_scope", js.Array(value*))
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLogin_hint(value: String): Self = StObject.set(x, "login_hint", value.asInstanceOf[js.Any])
    
    inline def setLogin_hintUndefined: Self = StObject.set(x, "login_hint", js.undefined)
    
    inline def setMode(value: login | signUp): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    
    inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    
    inline def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
    
    inline def setResponseMode(value: String): Self = StObject.set(x, "responseMode", value.asInstanceOf[js.Any])
    
    inline def setResponseModeUndefined: Self = StObject.set(x, "responseMode", js.undefined)
    
    inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setScreen_hint(value: signup_): Self = StObject.set(x, "screen_hint", value.asInstanceOf[js.Any])
    
    inline def setScreen_hintUndefined: Self = StObject.set(x, "screen_hint", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
