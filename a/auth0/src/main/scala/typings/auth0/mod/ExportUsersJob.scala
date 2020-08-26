package typings.auth0.mod

import typings.auth0.auth0Strings.users_export
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportUsersJob extends Job {
  var connection_id: js.UndefOr[String] = js.native
  var created_at: js.UndefOr[String] = js.native
  var fields: js.UndefOr[js.Array[ExportUserField]] = js.native
  var format: js.UndefOr[JobFormat] = js.native
  var id: String = js.native
  var location: js.UndefOr[String] = js.native
  var status: JobStatus = js.native
  var `type`: users_export = js.native
}

object ExportUsersJob {
  @scala.inline
  def apply(id: String, status: JobStatus, `type`: users_export): ExportUsersJob = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportUsersJob]
  }
  @scala.inline
  implicit class ExportUsersJobOps[Self <: ExportUsersJob] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: JobStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: users_export): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnection_id(value: String): Self = this.set("connection_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnection_id: Self = this.set("connection_id", js.undefined)
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_at: Self = this.set("created_at", js.undefined)
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
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
  
}

