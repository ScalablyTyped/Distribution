package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RolesData extends StObject {
  
  var roles: js.Array[String] = js.native
}
object RolesData {
  
  @scala.inline
  def apply(roles: js.Array[String]): RolesData = {
    val __obj = js.Dynamic.literal(roles = roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[RolesData]
  }
  
  @scala.inline
  implicit class RolesDataMutableBuilder[Self <: RolesData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value :_*))
  }
}
