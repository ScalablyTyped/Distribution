package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RolePage
  extends StObject
     with Page {
  
  var roles: js.Array[Role]
}
object RolePage {
  
  @scala.inline
  def apply(length: Double, limit: Double, roles: js.Array[Role], start: Double, total: Double): RolePage = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[RolePage]
  }
  
  @scala.inline
  implicit class RolePageMutableBuilder[Self <: RolePage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoles(value: js.Array[Role]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolesVarargs(value: Role*): Self = StObject.set(x, "roles", js.Array(value :_*))
  }
}
