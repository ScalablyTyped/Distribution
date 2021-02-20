package typings.auth0Js.mod

import typings.auth0Js.auth0JsStrings.login
import typings.auth0Js.auth0JsStrings.signUp
import typings.auth0Js.auth0JsStrings.signup_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizeOptions extends StObject {
  
  var accessType: js.UndefOr[String] = js.native
  
  var appState: js.UndefOr[js.Any] = js.native
  
  var approvalPrompt: js.UndefOr[String] = js.native
  
  var audience: js.UndefOr[String] = js.native
  
  var clientID: js.UndefOr[String] = js.native
  
  var connection: js.UndefOr[String] = js.native
  
  var connection_scope: js.UndefOr[String | js.Array[String]] = js.native
  
  var domain: js.UndefOr[String] = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var login_hint: js.UndefOr[String] = js.native
  
  var mode: js.UndefOr[login | signUp] = js.native
  
  var nonce: js.UndefOr[String] = js.native
  
  var prompt: js.UndefOr[String] = js.native
  
  var redirectUri: js.UndefOr[String] = js.native
  
  var responseMode: js.UndefOr[String] = js.native
  
  var responseType: js.UndefOr[String] = js.native
  
  var scope: js.UndefOr[String] = js.native
  
  var screen_hint: js.UndefOr[signup_] = js.native
  
  var state: js.UndefOr[String] = js.native
}
object AuthorizeOptions {
  
  @scala.inline
  def apply(): AuthorizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizeOptions]
  }
  
  @scala.inline
  implicit class AuthorizeOptionsMutableBuilder[Self <: AuthorizeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessType(value: String): Self = StObject.set(x, "accessType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessTypeUndefined: Self = StObject.set(x, "accessType", js.undefined)
    
    @scala.inline
    def setAppState(value: js.Any): Self = StObject.set(x, "appState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppStateUndefined: Self = StObject.set(x, "appState", js.undefined)
    
    @scala.inline
    def setApprovalPrompt(value: String): Self = StObject.set(x, "approvalPrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovalPromptUndefined: Self = StObject.set(x, "approvalPrompt", js.undefined)
    
    @scala.inline
    def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    @scala.inline
    def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIDUndefined: Self = StObject.set(x, "clientID", js.undefined)
    
    @scala.inline
    def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    @scala.inline
    def setConnection_scope(value: String | js.Array[String]): Self = StObject.set(x, "connection_scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnection_scopeUndefined: Self = StObject.set(x, "connection_scope", js.undefined)
    
    @scala.inline
    def setConnection_scopeVarargs(value: String*): Self = StObject.set(x, "connection_scope", js.Array(value :_*))
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLogin_hint(value: String): Self = StObject.set(x, "login_hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogin_hintUndefined: Self = StObject.set(x, "login_hint", js.undefined)
    
    @scala.inline
    def setMode(value: login | signUp): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    @scala.inline
    def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    
    @scala.inline
    def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
    
    @scala.inline
    def setResponseMode(value: String): Self = StObject.set(x, "responseMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseModeUndefined: Self = StObject.set(x, "responseMode", js.undefined)
    
    @scala.inline
    def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setScreen_hint(value: signup_): Self = StObject.set(x, "screen_hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreen_hintUndefined: Self = StObject.set(x, "screen_hint", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
