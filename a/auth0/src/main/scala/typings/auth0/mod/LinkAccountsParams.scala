package typings.auth0.mod

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
    val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
    if (connection_id != null) __obj.updateDynamic("connection_id")(connection_id.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkAccountsParams]
  }
}

