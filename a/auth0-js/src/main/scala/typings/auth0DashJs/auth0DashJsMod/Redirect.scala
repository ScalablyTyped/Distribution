package typings.auth0DashJs.auth0DashJsMod

import typings.auth0DashJs.Anon_Connection
import typings.auth0DashJs.Anon_Fragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("auth0-js", "Redirect")
@js.native
class Redirect protected () extends js.Object {
  def this(client: js.Any, options: js.Any) = this()
  /**
    * Performs authentication with username/email and password with a database connection
    *
    * This method is not compatible with API Auth so if you need to fetch API tokens with audience
    * you should use {@link authorize} or {@link login}.
    */
  def loginWithCredentials(options: Anon_Fragment, callback: Auth0Callback[_, Auth0Error]): Unit = js.native
  /**
    * Signs up a new user and automatically logs the user in after the signup.
    */
  def signupAndLogin(options: Anon_Connection, callback: Auth0Callback[_, Auth0Error]): Unit = js.native
}

