package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportUsersFromJsonOptions
  extends StObject
     with BaseImportUsersOptions
     with ImportUsersOptions {
  
  var users_json: String
}
object ImportUsersFromJsonOptions {
  
  @scala.inline
  def apply(connection_id: String, users_json: String): ImportUsersFromJsonOptions = {
    val __obj = js.Dynamic.literal(connection_id = connection_id.asInstanceOf[js.Any], users_json = users_json.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportUsersFromJsonOptions]
  }
  
  @scala.inline
  implicit class ImportUsersFromJsonOptionsMutableBuilder[Self <: ImportUsersFromJsonOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUsers_json(value: String): Self = StObject.set(x, "users_json", value.asInstanceOf[js.Any])
  }
}
