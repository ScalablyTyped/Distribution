package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<auth0.auth0.Page, 'length'> */
trait OrganizationsPaged extends StObject {
  
  var limit: Double
  
  var organizations: js.Array[Organization]
  
  var start: Double
  
  var total: Double
}
object OrganizationsPaged {
  
  inline def apply(limit: Double, organizations: js.Array[Organization], start: Double, total: Double): OrganizationsPaged = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], organizations = organizations.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationsPaged]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrganizationsPaged] (val x: Self) extends AnyVal {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setOrganizations(value: js.Array[Organization]): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
    
    inline def setOrganizationsVarargs(value: Organization*): Self = StObject.set(x, "organizations", js.Array(value*))
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
