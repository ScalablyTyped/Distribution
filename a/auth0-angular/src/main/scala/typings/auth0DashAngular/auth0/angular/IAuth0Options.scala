package typings.auth0DashAngular.auth0.angular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAuth0Options extends js.Object {
  /**
    * Connection name
    */
  var connection: js.UndefOr[String] = js.undefined
  /**
    * Email address
    */
  var email: js.UndefOr[String] = js.undefined
  /**
    * Username
    */
  var username: js.UndefOr[String] = js.undefined
}

object IAuth0Options {
  @scala.inline
  def apply(connection: String = null, email: String = null, username: String = null): IAuth0Options = {
    val __obj = js.Dynamic.literal()
    if (connection != null) __obj.updateDynamic("connection")(connection)
    if (email != null) __obj.updateDynamic("email")(email)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[IAuth0Options]
  }
}

