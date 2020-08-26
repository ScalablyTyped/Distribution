package typings.auth0Angular.auth0.angular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAuth0ClientOptions extends js.Object {
  /**
    * Client identifier of your Auth0 application
    */
  var clientID: String = js.native
  /**
    * Domain of your Auth0 account
    */
  var domain: String = js.native
  /**
    * Login state if you're using ui-router
    */
  var loginState: js.UndefOr[String] = js.native
  /**
    * Login url if you're using ngRoute
    */
  var loginUrl: js.UndefOr[String] = js.native
  /**
    * Use single signon
    */
  var sso: js.UndefOr[Boolean] = js.native
}

object IAuth0ClientOptions {
  @scala.inline
  def apply(clientID: String, domain: String): IAuth0ClientOptions = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAuth0ClientOptions]
  }
  @scala.inline
  implicit class IAuth0ClientOptionsOps[Self <: IAuth0ClientOptions] (val x: Self) extends AnyVal {
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
    def setClientID(value: String): Self = this.set("clientID", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoginState(value: String): Self = this.set("loginState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoginState: Self = this.set("loginState", js.undefined)
    @scala.inline
    def setLoginUrl(value: String): Self = this.set("loginUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoginUrl: Self = this.set("loginUrl", js.undefined)
    @scala.inline
    def setSso(value: Boolean): Self = this.set("sso", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSso: Self = this.set("sso", js.undefined)
  }
  
}

