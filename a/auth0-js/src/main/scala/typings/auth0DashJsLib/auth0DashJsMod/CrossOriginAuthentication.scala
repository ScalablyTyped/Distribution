package typings
package auth0DashJsLib.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("auth0-js", "CrossOriginAuthentication")
@js.native
class CrossOriginAuthentication protected () extends js.Object {
  def this(webAuth: js.Any, options: js.Any) = this()
  /**
       * Runs the callback code for the cross origin authentication call. This method is meant to be called by the cross origin authentication callback url.
       *
       */
  def callback(): scala.Unit = js.native
  /**
       * Logs in the user with username and password using the cross origin authentication (/co/authenticate) flow.
       * You can use either `username` or `email` to identify the user, but `username` will take precedence over `email`.
       * This only works when 3rd party cookies are enabled in the browser.
       * After the /co/authenticate call, you'll have to use the {@link parseHash} function at the `redirectUri` specified in the constructor.
       *
       * @param options options used in the {@link authorize} call after the login_ticket is acquired
       * @param cb Callback function called only when an authentication error, like invalid username or password, occurs.
       * For other types of errors, there will be a redirect to the `redirectUri`.
       */
  def login(options: CrossOriginLoginOptions, callback: Auth0Callback[_, Auth0Error]): scala.Unit = js.native
}

