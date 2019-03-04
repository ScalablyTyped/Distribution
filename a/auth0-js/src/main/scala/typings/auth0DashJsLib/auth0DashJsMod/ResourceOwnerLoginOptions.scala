package typings
package auth0DashJsLib.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceOwnerLoginOptions extends LoginOptions {
  var connection: java.lang.String
  var device: js.UndefOr[java.lang.String] = js.undefined
}

object ResourceOwnerLoginOptions {
  @scala.inline
  def apply(
    connection: java.lang.String,
    password: java.lang.String,
    username: java.lang.String,
    device: java.lang.String = null,
    scope: java.lang.String = null
  ): ResourceOwnerLoginOptions = {
    val __obj = js.Dynamic.literal(connection = connection, password = password, username = username)
    if (device != null) __obj.updateDynamic("device")(device)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[ResourceOwnerLoginOptions]
  }
}

