package typings.auth0.mod

import typings.auth0.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationConnection extends StObject {
  
  var assign_membership_on_login: Boolean
  
  var connection: Name
  
  var connection_id: String
}
object OrganizationConnection {
  
  inline def apply(assign_membership_on_login: Boolean, connection: Name, connection_id: String): OrganizationConnection = {
    val __obj = js.Dynamic.literal(assign_membership_on_login = assign_membership_on_login.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], connection_id = connection_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationConnection]
  }
  
  extension [Self <: OrganizationConnection](x: Self) {
    
    inline def setAssign_membership_on_login(value: Boolean): Self = StObject.set(x, "assign_membership_on_login", value.asInstanceOf[js.Any])
    
    inline def setConnection(value: Name): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setConnection_id(value: String): Self = StObject.set(x, "connection_id", value.asInstanceOf[js.Any])
  }
}
