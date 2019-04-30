package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportUsersJob extends Job {
  var connection_id: js.UndefOr[java.lang.String] = js.undefined
  var created_at: js.UndefOr[java.lang.String] = js.undefined
  var fields: js.UndefOr[js.Array[ExportUserField]] = js.undefined
  var format: js.UndefOr[JobFormat] = js.undefined
  var id: java.lang.String
  var location: js.UndefOr[java.lang.String] = js.undefined
  var status: JobStatus
  var `type`: auth0Lib.auth0LibStrings.users_export
}

object ExportUsersJob {
  @scala.inline
  def apply(
    id: java.lang.String,
    status: JobStatus,
    `type`: auth0Lib.auth0LibStrings.users_export,
    connection_id: java.lang.String = null,
    created_at: java.lang.String = null,
    fields: js.Array[ExportUserField] = null,
    format: JobFormat = null,
    location: java.lang.String = null
  ): ExportUsersJob = {
    val __obj = js.Dynamic.literal(id = id, status = status)
    __obj.updateDynamic("type")(`type`)
    if (connection_id != null) __obj.updateDynamic("connection_id")(connection_id)
    if (created_at != null) __obj.updateDynamic("created_at")(created_at)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (format != null) __obj.updateDynamic("format")(format)
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[ExportUsersJob]
  }
}

