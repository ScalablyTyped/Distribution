package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportUsersFromFileOptions
  extends StObject
     with BaseImportUsersOptions
     with ImportUsersOptions {
  
  var users: String
}
object ImportUsersFromFileOptions {
  
  inline def apply(connection_id: String, users: String): ImportUsersFromFileOptions = {
    val __obj = js.Dynamic.literal(connection_id = connection_id.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportUsersFromFileOptions]
  }
  
  extension [Self <: ImportUsersFromFileOptions](x: Self) {
    
    inline def setUsers(value: String): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
  }
}
