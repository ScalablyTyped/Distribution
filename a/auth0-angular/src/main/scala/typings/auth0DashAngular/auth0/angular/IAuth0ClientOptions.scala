package typings.auth0DashAngular.auth0.angular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAuth0ClientOptions extends js.Object {
  /**
    * Client identifier of your Auth0 application
    */
  var clientID: String
  /**
    * Domain of your Auth0 account
    */
  var domain: String
  /**
    * Login state if you're using ui-router
    */
  var loginState: js.UndefOr[String] = js.undefined
  /**
    * Login url if you're using ngRoute
    */
  var loginUrl: js.UndefOr[String] = js.undefined
  /**
    * Use single signon
    */
  var sso: js.UndefOr[Boolean] = js.undefined
}

object IAuth0ClientOptions {
  @scala.inline
  def apply(
    clientID: String,
    domain: String,
    loginState: String = null,
    loginUrl: String = null,
    sso: js.UndefOr[Boolean] = js.undefined
  ): IAuth0ClientOptions = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any])
    if (loginState != null) __obj.updateDynamic("loginState")(loginState.asInstanceOf[js.Any])
    if (loginUrl != null) __obj.updateDynamic("loginUrl")(loginUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(sso)) __obj.updateDynamic("sso")(sso.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAuth0ClientOptions]
  }
}

