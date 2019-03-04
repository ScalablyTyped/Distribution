package typings
package auth0DashJsLib.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrossOriginLoginOptions extends js.Object {
  var email: js.UndefOr[java.lang.String] = js.undefined
  var password: java.lang.String
  var realm: js.UndefOr[java.lang.String] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object CrossOriginLoginOptions {
  @scala.inline
  def apply(
    password: java.lang.String,
    email: java.lang.String = null,
    realm: java.lang.String = null,
    username: java.lang.String = null
  ): CrossOriginLoginOptions = {
    val __obj = js.Dynamic.literal(password = password)
    if (email != null) __obj.updateDynamic("email")(email)
    if (realm != null) __obj.updateDynamic("realm")(realm)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[CrossOriginLoginOptions]
  }
}

