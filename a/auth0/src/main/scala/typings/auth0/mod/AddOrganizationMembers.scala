package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddOrganizationMembers extends StObject {
  
  var members: js.Array[String]
}
object AddOrganizationMembers {
  
  inline def apply(members: js.Array[String]): AddOrganizationMembers = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddOrganizationMembers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddOrganizationMembers] (val x: Self) extends AnyVal {
    
    inline def setMembers(value: js.Array[String]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: String*): Self = StObject.set(x, "members", js.Array(value*))
  }
}
