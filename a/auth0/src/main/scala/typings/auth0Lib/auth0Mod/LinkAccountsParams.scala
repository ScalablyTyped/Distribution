package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkAccountsParams extends js.Object {
  var connection_id: js.UndefOr[java.lang.String] = js.undefined
  var provider: js.UndefOr[java.lang.String] = js.undefined
  var user_id: java.lang.String
}

object LinkAccountsParams {
  @scala.inline
  def apply(
    user_id: java.lang.String,
    connection_id: java.lang.String = null,
    provider: java.lang.String = null
  ): LinkAccountsParams = {
    val __obj = js.Dynamic.literal(user_id = user_id)
    if (connection_id != null) __obj.updateDynamic("connection_id")(connection_id)
    if (provider != null) __obj.updateDynamic("provider")(provider)
    __obj.asInstanceOf[LinkAccountsParams]
  }
}

