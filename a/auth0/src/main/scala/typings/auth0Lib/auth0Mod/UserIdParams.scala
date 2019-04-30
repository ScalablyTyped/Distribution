package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserIdParams extends js.Object {
  var client_id: js.UndefOr[java.lang.String] = js.undefined
  var user_id: java.lang.String
}

object UserIdParams {
  @scala.inline
  def apply(user_id: java.lang.String, client_id: java.lang.String = null): UserIdParams = {
    val __obj = js.Dynamic.literal(user_id = user_id)
    if (client_id != null) __obj.updateDynamic("client_id")(client_id)
    __obj.asInstanceOf[UserIdParams]
  }
}

