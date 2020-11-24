package typings.appleSigninApi.AppleSignInAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.apple.com/documentation/signinwithapplejs/signinresponsei
@js.native
trait SignInResponseI extends js.Object {
  
  var authorization: AuthorizationI = js.native
  
  var user: js.UndefOr[UserI] = js.native
}
object SignInResponseI {
  
  @scala.inline
  def apply(authorization: AuthorizationI): SignInResponseI = {
    val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignInResponseI]
  }
  
  @scala.inline
  implicit class SignInResponseIOps[Self <: SignInResponseI] (val x: Self) extends AnyVal {
    
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
    def setAuthorization(value: AuthorizationI): Self = this.set("authorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: UserI): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
