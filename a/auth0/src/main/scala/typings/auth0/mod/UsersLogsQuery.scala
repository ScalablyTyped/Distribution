package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsersLogsQuery extends StObject {
  
  var id: String
  
  var include_totals: js.UndefOr[Boolean] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var per_page: js.UndefOr[Double] = js.undefined
  
  var sort: js.UndefOr[String] = js.undefined
}
object UsersLogsQuery {
  
  inline def apply(id: String): UsersLogsQuery = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersLogsQuery]
  }
  
  extension [Self <: UsersLogsQuery](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInclude_totals(value: Boolean): Self = StObject.set(x, "include_totals", value.asInstanceOf[js.Any])
    
    inline def setInclude_totalsUndefined: Self = StObject.set(x, "include_totals", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setSort(value: String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
