package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportUsersOptions extends js.Object {
  var connection_id: java.lang.String
  var external_id: js.UndefOr[java.lang.String] = js.undefined
  var send_completion_email: js.UndefOr[scala.Boolean] = js.undefined
  var upsert: js.UndefOr[scala.Boolean] = js.undefined
  var users: java.lang.String
}

object ImportUsersOptions {
  @scala.inline
  def apply(
    connection_id: java.lang.String,
    users: java.lang.String,
    external_id: java.lang.String = null,
    send_completion_email: js.UndefOr[scala.Boolean] = js.undefined,
    upsert: js.UndefOr[scala.Boolean] = js.undefined
  ): ImportUsersOptions = {
    val __obj = js.Dynamic.literal(connection_id = connection_id, users = users)
    if (external_id != null) __obj.updateDynamic("external_id")(external_id)
    if (!js.isUndefined(send_completion_email)) __obj.updateDynamic("send_completion_email")(send_completion_email)
    if (!js.isUndefined(upsert)) __obj.updateDynamic("upsert")(upsert)
    __obj.asInstanceOf[ImportUsersOptions]
  }
}

