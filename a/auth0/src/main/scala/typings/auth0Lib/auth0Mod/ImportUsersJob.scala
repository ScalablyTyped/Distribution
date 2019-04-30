package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportUsersJob extends Job {
  var connection_id: js.UndefOr[java.lang.String] = js.undefined
  var created_at: js.UndefOr[java.lang.String] = js.undefined
  var external_id: js.UndefOr[java.lang.String] = js.undefined
  var id: java.lang.String
  var send_completion_email: js.UndefOr[scala.Boolean] = js.undefined
  var status: JobStatus
  var `type`: auth0Lib.auth0LibStrings.users_import
  var upsert: js.UndefOr[scala.Boolean] = js.undefined
}

object ImportUsersJob {
  @scala.inline
  def apply(
    id: java.lang.String,
    status: JobStatus,
    `type`: auth0Lib.auth0LibStrings.users_import,
    connection_id: java.lang.String = null,
    created_at: java.lang.String = null,
    external_id: java.lang.String = null,
    send_completion_email: js.UndefOr[scala.Boolean] = js.undefined,
    upsert: js.UndefOr[scala.Boolean] = js.undefined
  ): ImportUsersJob = {
    val __obj = js.Dynamic.literal(id = id, status = status)
    __obj.updateDynamic("type")(`type`)
    if (connection_id != null) __obj.updateDynamic("connection_id")(connection_id)
    if (created_at != null) __obj.updateDynamic("created_at")(created_at)
    if (external_id != null) __obj.updateDynamic("external_id")(external_id)
    if (!js.isUndefined(send_completion_email)) __obj.updateDynamic("send_completion_email")(send_completion_email)
    if (!js.isUndefined(upsert)) __obj.updateDynamic("upsert")(upsert)
    __obj.asInstanceOf[ImportUsersJob]
  }
}

