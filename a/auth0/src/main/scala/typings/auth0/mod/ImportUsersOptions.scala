package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.auth0.mod.ImportUsersFromFileOptions
  - typings.auth0.mod.ImportUsersFromJsonOptions
*/
trait ImportUsersOptions extends js.Object

object ImportUsersOptions {
  @scala.inline
  def ImportUsersFromFileOptions(
    connection_id: String,
    users: String,
    external_id: String = null,
    send_completion_email: js.UndefOr[Boolean] = js.undefined,
    upsert: js.UndefOr[Boolean] = js.undefined
  ): ImportUsersOptions = {
    val __obj = js.Dynamic.literal(connection_id = connection_id.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    if (external_id != null) __obj.updateDynamic("external_id")(external_id.asInstanceOf[js.Any])
    if (!js.isUndefined(send_completion_email)) __obj.updateDynamic("send_completion_email")(send_completion_email.asInstanceOf[js.Any])
    if (!js.isUndefined(upsert)) __obj.updateDynamic("upsert")(upsert.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportUsersOptions]
  }
  @scala.inline
  def ImportUsersFromJsonOptions(
    connection_id: String,
    users_json: String,
    external_id: String = null,
    send_completion_email: js.UndefOr[Boolean] = js.undefined,
    upsert: js.UndefOr[Boolean] = js.undefined
  ): ImportUsersOptions = {
    val __obj = js.Dynamic.literal(connection_id = connection_id.asInstanceOf[js.Any], users_json = users_json.asInstanceOf[js.Any])
    if (external_id != null) __obj.updateDynamic("external_id")(external_id.asInstanceOf[js.Any])
    if (!js.isUndefined(send_completion_email)) __obj.updateDynamic("send_completion_email")(send_completion_email.asInstanceOf[js.Any])
    if (!js.isUndefined(upsert)) __obj.updateDynamic("upsert")(upsert.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportUsersOptions]
  }
}

