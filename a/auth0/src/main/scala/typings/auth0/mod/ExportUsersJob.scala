package typings.auth0.mod

import typings.auth0.auth0Strings.users_export
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportUsersJob extends Job {
  var connection_id: js.UndefOr[String] = js.undefined
  var created_at: js.UndefOr[String] = js.undefined
  var fields: js.UndefOr[js.Array[ExportUserField]] = js.undefined
  var format: js.UndefOr[JobFormat] = js.undefined
  var id: String
  var location: js.UndefOr[String] = js.undefined
  var status: JobStatus
  var `type`: users_export
}

object ExportUsersJob {
  @scala.inline
  def apply(
    id: String,
    status: JobStatus,
    `type`: users_export,
    connection_id: String = null,
    created_at: String = null,
    fields: js.Array[ExportUserField] = null,
    format: JobFormat = null,
    location: String = null
  ): ExportUsersJob = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (connection_id != null) __obj.updateDynamic("connection_id")(connection_id.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportUsersJob]
  }
}

