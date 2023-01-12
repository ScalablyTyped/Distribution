package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RolesData extends StObject {
  
  var roles: js.Array[String]
}
object RolesData {
  
  inline def apply(roles: js.Array[String]): RolesData = {
    val __obj = js.Dynamic.literal(roles = roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[RolesData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RolesData] (val x: Self) extends AnyVal {
    
    inline def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value*))
  }
}
