package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateOrganizationEnabledConnection extends StObject {
  
  var assign_membership_on_login: Boolean
}
object UpdateOrganizationEnabledConnection {
  
  inline def apply(assign_membership_on_login: Boolean): UpdateOrganizationEnabledConnection = {
    val __obj = js.Dynamic.literal(assign_membership_on_login = assign_membership_on_login.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOrganizationEnabledConnection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateOrganizationEnabledConnection] (val x: Self) extends AnyVal {
    
    inline def setAssign_membership_on_login(value: Boolean): Self = StObject.set(x, "assign_membership_on_login", value.asInstanceOf[js.Any])
  }
}
