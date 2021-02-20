package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRolesData extends StObject {
  
  var name_filter: js.UndefOr[String] = js.native
  
  var page: js.UndefOr[Double] = js.native
  
  var per_page: js.UndefOr[Double] = js.native
}
object GetRolesData {
  
  @scala.inline
  def apply(): GetRolesData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRolesData]
  }
  
  @scala.inline
  implicit class GetRolesDataMutableBuilder[Self <: GetRolesData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName_filter(value: String): Self = StObject.set(x, "name_filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName_filterUndefined: Self = StObject.set(x, "name_filter", js.undefined)
    
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
