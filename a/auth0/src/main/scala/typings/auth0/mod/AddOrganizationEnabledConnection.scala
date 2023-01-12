package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddOrganizationEnabledConnection extends StObject {
  
  var assign_membership_on_login: js.UndefOr[Boolean] = js.undefined
  
  var connection_id: String
}
object AddOrganizationEnabledConnection {
  
  inline def apply(connection_id: String): AddOrganizationEnabledConnection = {
    val __obj = js.Dynamic.literal(connection_id = connection_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddOrganizationEnabledConnection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddOrganizationEnabledConnection] (val x: Self) extends AnyVal {
    
    inline def setAssign_membership_on_login(value: Boolean): Self = StObject.set(x, "assign_membership_on_login", value.asInstanceOf[js.Any])
    
    inline def setAssign_membership_on_loginUndefined: Self = StObject.set(x, "assign_membership_on_login", js.undefined)
    
    inline def setConnection_id(value: String): Self = StObject.set(x, "connection_id", value.asInstanceOf[js.Any])
  }
}
