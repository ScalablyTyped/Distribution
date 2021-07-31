package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportUsersOptions extends StObject {
  
  var connection_id: js.UndefOr[String] = js.undefined
  
  var fields: js.UndefOr[js.Array[ExportUserField]] = js.undefined
  
  var format: js.UndefOr[JobFormat] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
}
object ExportUsersOptions {
  
  @scala.inline
  def apply(): ExportUsersOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportUsersOptions]
  }
  
  @scala.inline
  implicit class ExportUsersOptionsMutableBuilder[Self <: ExportUsersOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection_id(value: String): Self = StObject.set(x, "connection_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnection_idUndefined: Self = StObject.set(x, "connection_id", js.undefined)
    
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
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
  }
}
