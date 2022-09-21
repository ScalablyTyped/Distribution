package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<auth0.auth0.Page, 'length'> */
trait OrganizationMembersPaged extends StObject {
  
  var limit: Double
  
  var members: js.Array[OrganizationMember]
  
  var start: Double
  
  var total: Double
}
object OrganizationMembersPaged {
  
  inline def apply(limit: Double, members: js.Array[OrganizationMember], start: Double, total: Double): OrganizationMembersPaged = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationMembersPaged]
  }
  
  extension [Self <: OrganizationMembersPaged](x: Self) {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setMembers(value: js.Array[OrganizationMember]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: OrganizationMember*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
