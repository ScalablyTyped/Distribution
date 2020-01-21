package typings.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("auth0-js", "DBConnection")
@js.native
class DBConnection protected () extends js.Object {
  def this(request: js.Any, option: js.Any) = this()
  /**
    * Initializes the change password flow
    *
    * @param options: https://auth0.com/docs/api/authentication#!#post--dbconnections-change_password
    */
  def changePassword(options: ChangePasswordOptions, callback: Auth0Callback[_, Auth0Error]): Unit = js.native
  /**
    * Signup a new user
    *
    * @param options: https://auth0.com/docs/api/authentication#!#post--dbconnections-signup
    */
  def signup(options: DbSignUpOptions, callback: Auth0Callback[_, Auth0Error]): Unit = js.native
}

