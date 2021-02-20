package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRolePermissionsData extends ObjectWithId {
  
  var page: js.UndefOr[Double] = js.native
  
  var per_page: js.UndefOr[Double] = js.native
}
object GetRolePermissionsData {
  
  @scala.inline
  def apply(id: String): GetRolePermissionsData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRolePermissionsData]
  }
  
  @scala.inline
  implicit class GetRolePermissionsDataMutableBuilder[Self <: GetRolePermissionsData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
  }
}
