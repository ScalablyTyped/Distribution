package typings.auth0.anon

import typings.auth0.auth0Booleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined auth0.auth0.ObjectWithId & auth0.auth0.PagingOptions & {  fields :string | undefined,   include_fields :boolean | undefined,   sort :string | undefined,   include_totals :true} */
trait ObjectWithIdPagingOptionsIncludefields extends StObject {
  
  var fields: js.UndefOr[String] = js.undefined
  
  var id: String
  
  var include_fields: js.UndefOr[Boolean] = js.undefined
  
  var include_totals: `true`
  
  var page: js.UndefOr[Double] = js.undefined
  
  var per_page: js.UndefOr[Double] = js.undefined
  
  var sort: js.UndefOr[String] = js.undefined
}
object ObjectWithIdPagingOptionsIncludefields {
  
  inline def apply(id: String): ObjectWithIdPagingOptionsIncludefields = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], include_totals = true)
    __obj.asInstanceOf[ObjectWithIdPagingOptionsIncludefields]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectWithIdPagingOptionsIncludefields] (val x: Self) extends AnyVal {
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInclude_fields(value: Boolean): Self = StObject.set(x, "include_fields", value.asInstanceOf[js.Any])
    
    inline def setInclude_fieldsUndefined: Self = StObject.set(x, "include_fields", js.undefined)
    
    inline def setInclude_totals(value: `true`): Self = StObject.set(x, "include_totals", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setSort(value: String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
