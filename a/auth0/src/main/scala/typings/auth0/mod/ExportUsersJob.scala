package typings.auth0.mod

import typings.auth0.auth0Strings.users_export
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportUsersJob
  extends StObject
     with Job {
  
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
  def apply(id: String, status: JobStatus): ExportUsersJob = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("users_export")
    __obj.asInstanceOf[ExportUsersJob]
  }
  
  @scala.inline
  implicit class ExportUsersJobMutableBuilder[Self <: ExportUsersJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection_id(value: String): Self = StObject.set(x, "connection_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnection_idUndefined: Self = StObject.set(x, "connection_id", js.undefined)
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    @scala.inline
    def setFields(value: js.Array[ExportUserField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: ExportUserField*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setFormat(value: JobFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setStatus(value: JobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: users_export): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
