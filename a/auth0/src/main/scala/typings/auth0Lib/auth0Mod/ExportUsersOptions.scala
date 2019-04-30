package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportUsersOptions extends js.Object {
  var connection_id: js.UndefOr[java.lang.String] = js.undefined
  var fields: js.UndefOr[js.Array[ExportUserField]] = js.undefined
  var format: js.UndefOr[JobFormat] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
}

object ExportUsersOptions {
  @scala.inline
  def apply(
    connection_id: java.lang.String = null,
    fields: js.Array[ExportUserField] = null,
    format: JobFormat = null,
    limit: scala.Int | scala.Double = null
  ): ExportUsersOptions = {
    val __obj = js.Dynamic.literal()
    if (connection_id != null) __obj.updateDynamic("connection_id")(connection_id)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (format != null) __obj.updateDynamic("format")(format)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportUsersOptions]
  }
}

