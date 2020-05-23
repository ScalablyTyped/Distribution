package typings.auth0.mod

import typings.auth0.auth0Strings.users_import
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportUsersJob extends Job {
  var connection_id: js.UndefOr[String] = js.undefined
  var created_at: js.UndefOr[String] = js.undefined
  var external_id: js.UndefOr[String] = js.undefined
  var id: String
  var send_completion_email: js.UndefOr[Boolean] = js.undefined
  var status: JobStatus
  var `type`: users_import
  var upsert: js.UndefOr[Boolean] = js.undefined
}

object ImportUsersJob {
  @scala.inline
  def apply(
    id: String,
    status: JobStatus,
    `type`: users_import,
    connection_id: String = null,
    created_at: String = null,
    external_id: String = null,
    send_completion_email: js.UndefOr[Boolean] = js.undefined,
    upsert: js.UndefOr[Boolean] = js.undefined
  ): ImportUsersJob = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (connection_id != null) __obj.updateDynamic("connection_id")(connection_id.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    if (external_id != null) __obj.updateDynamic("external_id")(external_id.asInstanceOf[js.Any])
    if (!js.isUndefined(send_completion_email)) __obj.updateDynamic("send_completion_email")(send_completion_email.get.asInstanceOf[js.Any])
    if (!js.isUndefined(upsert)) __obj.updateDynamic("upsert")(upsert.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportUsersJob]
  }
}

