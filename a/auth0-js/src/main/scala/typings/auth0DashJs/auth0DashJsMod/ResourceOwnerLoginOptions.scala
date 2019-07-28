package typings.auth0DashJs.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceOwnerLoginOptions extends LoginOptions {
  var connection: String
  var device: js.UndefOr[String] = js.undefined
}

object ResourceOwnerLoginOptions {
  @scala.inline
  def apply(
    connection: String,
    password: String,
    username: String,
    device: String = null,
    scope: String = null
  ): ResourceOwnerLoginOptions = {
    val __obj = js.Dynamic.literal(connection = connection, password = password, username = username)
    if (device != null) __obj.updateDynamic("device")(device)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[ResourceOwnerLoginOptions]
  }
}

