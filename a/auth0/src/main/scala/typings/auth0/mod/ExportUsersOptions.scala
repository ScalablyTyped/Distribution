package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportUsersOptions extends js.Object {
  var connection_id: js.UndefOr[String] = js.native
  var fields: js.UndefOr[js.Array[ExportUserField]] = js.native
  var format: js.UndefOr[JobFormat] = js.native
  var limit: js.UndefOr[Double] = js.native
}

object ExportUsersOptions {
  @scala.inline
  def apply(): ExportUsersOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportUsersOptions]
  }
  @scala.inline
  implicit class ExportUsersOptionsOps[Self <: ExportUsersOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConnection_id(value: String): Self = this.set("connection_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnection_id: Self = this.set("connection_id", js.undefined)
    @scala.inline
    def setFieldsVarargs(value: ExportUserField*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[ExportUserField]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setFormat(value: JobFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
  }
  
}

