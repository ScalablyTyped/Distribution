package typings.auth0.mod

import typings.auth0.auth0Strings.users_import
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportUsersJob extends Job {
  
  var connection_id: js.UndefOr[String] = js.native
  
  var created_at: js.UndefOr[String] = js.native
  
  var external_id: js.UndefOr[String] = js.native
  
  var id: String = js.native
  
  var send_completion_email: js.UndefOr[Boolean] = js.native
  
  var status: JobStatus = js.native
  
  var `type`: users_import = js.native
  
  var upsert: js.UndefOr[Boolean] = js.native
}
object ImportUsersJob {
  
  @scala.inline
  def apply(id: String, status: JobStatus, `type`: users_import): ImportUsersJob = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportUsersJob]
  }
  
  @scala.inline
  implicit class ImportUsersJobOps[Self <: ImportUsersJob] (val x: Self) extends AnyVal {
    
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
    def setType(value: users_import): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnection_id(value: String): Self = this.set("connection_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnection_id: Self = this.set("connection_id", js.undefined)
    
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated_at: Self = this.set("created_at", js.undefined)
    
    @scala.inline
    def setExternal_id(value: String): Self = this.set("external_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternal_id: Self = this.set("external_id", js.undefined)
    
    @scala.inline
    def setSend_completion_email(value: Boolean): Self = this.set("send_completion_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSend_completion_email: Self = this.set("send_completion_email", js.undefined)
    
    @scala.inline
    def setUpsert(value: Boolean): Self = this.set("upsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpsert: Self = this.set("upsert", js.undefined)
  }
}
