package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRolePermissionsDataPaged
  extends StObject
     with GetRolePermissionsData {
  
  var include_totals: Boolean
}
object GetRolePermissionsDataPaged {
  
  @scala.inline
  def apply(id: String, include_totals: Boolean): GetRolePermissionsDataPaged = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], include_totals = include_totals.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRolePermissionsDataPaged]
  }
  
  @scala.inline
  implicit class GetRolePermissionsDataPagedMutableBuilder[Self <: GetRolePermissionsDataPaged] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInclude_totals(value: Boolean): Self = StObject.set(x, "include_totals", value.asInstanceOf[js.Any])
  }
}
