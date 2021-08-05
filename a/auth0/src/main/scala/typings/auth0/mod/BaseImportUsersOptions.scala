package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseImportUsersOptions extends StObject {
  
  var connection_id: String
  
  var external_id: js.UndefOr[String] = js.undefined
  
  var send_completion_email: js.UndefOr[Boolean] = js.undefined
  
  var upsert: js.UndefOr[Boolean] = js.undefined
}
object BaseImportUsersOptions {
  
  inline def apply(connection_id: String): BaseImportUsersOptions = {
    val __obj = js.Dynamic.literal(connection_id = connection_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseImportUsersOptions]
  }
  
  extension [Self <: BaseImportUsersOptions](x: Self) {
    
    inline def setConnection_id(value: String): Self = StObject.set(x, "connection_id", value.asInstanceOf[js.Any])
    
    inline def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
    
    inline def setExternal_idUndefined: Self = StObject.set(x, "external_id", js.undefined)
    
    inline def setSend_completion_email(value: Boolean): Self = StObject.set(x, "send_completion_email", value.asInstanceOf[js.Any])
    
    inline def setSend_completion_emailUndefined: Self = StObject.set(x, "send_completion_email", js.undefined)
    
    inline def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
    
    inline def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
  }
}
