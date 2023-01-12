package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveOrganizationMembers extends StObject {
  
  var members: js.Array[String]
}
object RemoveOrganizationMembers {
  
  inline def apply(members: js.Array[String]): RemoveOrganizationMembers = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveOrganizationMembers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveOrganizationMembers] (val x: Self) extends AnyVal {
    
    inline def setMembers(value: js.Array[String]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: String*): Self = StObject.set(x, "members", js.Array(value*))
  }
}
