package typings.auth0Lock

import typings.auth0Lock.auth0LockStrings.forgotPassword
import typings.auth0Lock.auth0LockStrings.login
import typings.auth0Lock.auth0LockStrings.signUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Auth0LockShowOptions extends js.Object {
  var allowForgotPassword: js.UndefOr[Boolean] = js.native
  var allowLogin: js.UndefOr[Boolean] = js.native
  var allowSignUp: js.UndefOr[Boolean] = js.native
  var allowedConnections: js.UndefOr[js.Array[String]] = js.native
  var auth: js.UndefOr[Auth0LockAuthOptions] = js.native
  var flashMessage: js.UndefOr[Auth0LockFlashMessageOptions] = js.native
  var initialScreen: js.UndefOr[login | signUp | forgotPassword] = js.native
  var languageDictionary: js.UndefOr[js.Any] = js.native
  var rememberLastLogin: js.UndefOr[Boolean] = js.native
}

object Auth0LockShowOptions {
  @scala.inline
  def apply(): Auth0LockShowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Auth0LockShowOptions]
  }
  @scala.inline
  implicit class Auth0LockShowOptionsOps[Self <: Auth0LockShowOptions] (val x: Self) extends AnyVal {
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
    def setAllowForgotPassword(value: Boolean): Self = this.set("allowForgotPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowForgotPassword: Self = this.set("allowForgotPassword", js.undefined)
    @scala.inline
    def setAllowLogin(value: Boolean): Self = this.set("allowLogin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowLogin: Self = this.set("allowLogin", js.undefined)
    @scala.inline
    def setAllowSignUp(value: Boolean): Self = this.set("allowSignUp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSignUp: Self = this.set("allowSignUp", js.undefined)
    @scala.inline
    def setAllowedConnectionsVarargs(value: String*): Self = this.set("allowedConnections", js.Array(value :_*))
    @scala.inline
    def setAllowedConnections(value: js.Array[String]): Self = this.set("allowedConnections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedConnections: Self = this.set("allowedConnections", js.undefined)
    @scala.inline
    def setAuth(value: Auth0LockAuthOptions): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setFlashMessage(value: Auth0LockFlashMessageOptions): Self = this.set("flashMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlashMessage: Self = this.set("flashMessage", js.undefined)
    @scala.inline
    def setInitialScreen(value: login | signUp | forgotPassword): Self = this.set("initialScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialScreen: Self = this.set("initialScreen", js.undefined)
    @scala.inline
    def setLanguageDictionary(value: js.Any): Self = this.set("languageDictionary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageDictionary: Self = this.set("languageDictionary", js.undefined)
    @scala.inline
    def setRememberLastLogin(value: Boolean): Self = this.set("rememberLastLogin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRememberLastLogin: Self = this.set("rememberLastLogin", js.undefined)
  }
  
}

