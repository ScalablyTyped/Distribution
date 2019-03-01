package typings
package auth0DashAngularLib.auth0Ns.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAuth0Options extends js.Object {
  /**
    * Connection name
    */
  var connection: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Email address
    */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Username
    */
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object IAuth0Options {
  @scala.inline
  def apply(
    connection: java.lang.String = null,
    email: java.lang.String = null,
    username: java.lang.String = null
  ): IAuth0Options = {
    val __obj = js.Dynamic.literal()
    if (connection != null) __obj.updateDynamic("connection")(connection)
    if (email != null) __obj.updateDynamic("email")(email)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[IAuth0Options]
  }
}

