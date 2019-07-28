package typings.auth0.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkAccountsParams extends js.Object {
  var connection_id: js.UndefOr[String] = js.undefined
  var provider: js.UndefOr[String] = js.undefined
  var user_id: String
}

object LinkAccountsParams {
  @scala.inline
  def apply(user_id: String, connection_id: String = null, provider: String = null): LinkAccountsParams = {
    val __obj = js.Dynamic.literal(user_id = user_id)
    if (connection_id != null) __obj.updateDynamic("connection_id")(connection_id)
    if (provider != null) __obj.updateDynamic("provider")(provider)
    __obj.asInstanceOf[LinkAccountsParams]
  }
}

