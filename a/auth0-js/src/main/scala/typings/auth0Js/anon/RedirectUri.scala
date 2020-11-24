package typings.auth0Js.anon

import typings.auth0Js.auth0JsStrings.fragment
import typings.auth0Js.auth0JsStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedirectUri extends js.Object {
  
  /** url that the Auth0 will redirect after Auth with the Authorization Response */
  var redirectUri: js.UndefOr[String] = js.native
  
  /** how the AuthN response is encoded and redirected back to the client. */
  var responseMode: js.UndefOr[query | fragment] = js.native
  
  /** type of the response used. It can be any of the values `code` and `token` */
  var responseType: js.UndefOr[String] = js.native
  
  /** scopes to be requested during AuthN. e.g. `openid email` */
  var scope: String = js.native
}
object RedirectUri {
  
  @scala.inline
  def apply(scope: String): RedirectUri = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectUri]
  }
  
  @scala.inline
  implicit class RedirectUriOps[Self <: RedirectUri] (val x: Self) extends AnyVal {
    
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
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectUri(value: String): Self = this.set("redirectUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirectUri: Self = this.set("redirectUri", js.undefined)
    
    @scala.inline
    def setResponseMode(value: query | fragment): Self = this.set("responseMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseMode: Self = this.set("responseMode", js.undefined)
    
    @scala.inline
    def setResponseType(value: String): Self = this.set("responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseType: Self = this.set("responseType", js.undefined)
  }
}
