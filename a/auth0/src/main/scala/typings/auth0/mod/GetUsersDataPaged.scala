package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetUsersDataPaged extends GetUsersData {
  
  var include_totals: Boolean = js.native
}
object GetUsersDataPaged {
  
  @scala.inline
  def apply(include_totals: Boolean): GetUsersDataPaged = {
    val __obj = js.Dynamic.literal(include_totals = include_totals.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUsersDataPaged]
  }
  
  @scala.inline
  implicit class GetUsersDataPagedMutableBuilder[Self <: GetUsersDataPaged] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInclude_totals(value: Boolean): Self = StObject.set(x, "include_totals", value.asInstanceOf[js.Any])
  }
}
