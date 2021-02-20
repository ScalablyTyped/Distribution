package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseImportUsersOptions extends StObject {
  
  var connection_id: String = js.native
  
  var external_id: js.UndefOr[String] = js.native
  
  var send_completion_email: js.UndefOr[Boolean] = js.native
  
  var upsert: js.UndefOr[Boolean] = js.native
}
object BaseImportUsersOptions {
  
  @scala.inline
  def apply(connection_id: String): BaseImportUsersOptions = {
    val __obj = js.Dynamic.literal(connection_id = connection_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseImportUsersOptions]
  }
  
  @scala.inline
  implicit class BaseImportUsersOptionsMutableBuilder[Self <: BaseImportUsersOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection_id(value: String): Self = StObject.set(x, "connection_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_idUndefined: Self = StObject.set(x, "external_id", js.undefined)
    
    @scala.inline
    def setSend_completion_email(value: Boolean): Self = StObject.set(x, "send_completion_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSend_completion_emailUndefined: Self = StObject.set(x, "send_completion_email", js.undefined)
    
    @scala.inline
    def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
  }
}
