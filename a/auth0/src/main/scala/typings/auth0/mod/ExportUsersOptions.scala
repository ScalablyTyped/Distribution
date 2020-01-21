package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportUsersOptions extends js.Object {
  var connection_id: js.UndefOr[String] = js.undefined
  var fields: js.UndefOr[js.Array[ExportUserField]] = js.undefined
  var format: js.UndefOr[JobFormat] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
}

object ExportUsersOptions {
  @scala.inline
  def apply(
    connection_id: String = null,
    fields: js.Array[ExportUserField] = null,
    format: JobFormat = null,
    limit: Int | Double = null
  ): ExportUsersOptions = {
    val __obj = js.Dynamic.literal()
    if (connection_id != null) __obj.updateDynamic("connection_id")(connection_id.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportUsersOptions]
  }
}

