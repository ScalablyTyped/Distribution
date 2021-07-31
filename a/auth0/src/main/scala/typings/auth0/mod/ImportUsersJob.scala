package typings.auth0.mod

import typings.auth0.auth0Strings.users_import
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportUsersJob
  extends StObject
     with Job {
  
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
  def apply(id: String, status: JobStatus): ImportUsersJob = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("users_import")
    __obj.asInstanceOf[ImportUsersJob]
  }
  
  @scala.inline
  implicit class ImportUsersJobMutableBuilder[Self <: ImportUsersJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection_id(value: String): Self = StObject.set(x, "connection_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnection_idUndefined: Self = StObject.set(x, "connection_id", js.undefined)
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    @scala.inline
    def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_idUndefined: Self = StObject.set(x, "external_id", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSend_completion_email(value: Boolean): Self = StObject.set(x, "send_completion_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSend_completion_emailUndefined: Self = StObject.set(x, "send_completion_email", js.undefined)
    
    @scala.inline
    def setStatus(value: JobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: users_import): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
  }
}
