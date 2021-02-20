package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRolesDataPaged extends GetRolesData {
  
  var include_totals: Boolean = js.native
}
object GetRolesDataPaged {
  
  @scala.inline
  def apply(include_totals: Boolean): GetRolesDataPaged = {
    val __obj = js.Dynamic.literal(include_totals = include_totals.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRolesDataPaged]
  }
  
  @scala.inline
  implicit class GetRolesDataPagedMutableBuilder[Self <: GetRolesDataPaged] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInclude_totals(value: Boolean): Self = StObject.set(x, "include_totals", value.asInstanceOf[js.Any])
  }
}
