package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignInToken extends js.Object {
  
  var access_token: String = js.native
  
  var expiry: Double = js.native
  
  var id_token: js.UndefOr[String] = js.native
  
  var token_type: js.UndefOr[String] = js.native
}
object SignInToken {
  
  @scala.inline
  def apply(access_token: String, expiry: Double): SignInToken = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expiry = expiry.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignInToken]
  }
  
  @scala.inline
  implicit class SignInTokenOps[Self <: SignInToken] (val x: Self) extends AnyVal {
    
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
    def setAccess_token(value: String): Self = this.set("access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiry(value: Double): Self = this.set("expiry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId_token(value: String): Self = this.set("id_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId_token: Self = this.set("id_token", js.undefined)
    
    @scala.inline
    def setToken_type(value: String): Self = this.set("token_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken_type: Self = this.set("token_type", js.undefined)
  }
}
