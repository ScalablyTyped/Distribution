package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetUsersData extends StObject {
  
  var connection: js.UndefOr[String] = js.native
  
  var fields: js.UndefOr[String] = js.native
  
  var include_fields: js.UndefOr[Boolean] = js.native
  
  var page: js.UndefOr[Double] = js.native
  
  var per_page: js.UndefOr[Double] = js.native
  
  var q: js.UndefOr[String] = js.native
  
  var search_engine: js.UndefOr[String] = js.native
  
  var sort: js.UndefOr[String] = js.native
}
object GetUsersData {
  
  @scala.inline
  def apply(): GetUsersData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUsersData]
  }
  
  @scala.inline
  implicit class GetUsersDataMutableBuilder[Self <: GetUsersData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setInclude_fields(value: Boolean): Self = StObject.set(x, "include_fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude_fieldsUndefined: Self = StObject.set(x, "include_fields", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    @scala.inline
    def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    @scala.inline
    def setSearch_engine(value: String): Self = StObject.set(x, "search_engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch_engineUndefined: Self = StObject.set(x, "search_engine", js.undefined)
    
    @scala.inline
    def setSort(value: String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
