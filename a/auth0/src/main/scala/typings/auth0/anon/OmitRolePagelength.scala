package typings.auth0.anon

import typings.auth0.mod.Role
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<auth0.auth0.RolePage, 'length'> */
trait OmitRolePagelength extends StObject {
  
  var limit: Double
  
  var roles: js.Array[Role]
  
  var start: Double
  
  var total: Double
}
object OmitRolePagelength {
  
  inline def apply(limit: Double, roles: js.Array[Role], start: Double, total: Double): OmitRolePagelength = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitRolePagelength]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitRolePagelength] (val x: Self) extends AnyVal {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setRoles(value: js.Array[Role]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesVarargs(value: Role*): Self = StObject.set(x, "roles", js.Array(value*))
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
