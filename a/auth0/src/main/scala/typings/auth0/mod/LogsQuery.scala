package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogsQuery extends StObject {
  
  /** A comma separated list of fields to include or exclude */
  var fields: js.UndefOr[String] = js.undefined
  
  /** For checkpoint pagination, log event Id from which to start selection from. */
  var from: js.UndefOr[String] = js.undefined
  
  /** true if the fields specified are to be included in the result, false otherwise. */
  var include_fields: js.UndefOr[Boolean] = js.undefined
  
  /** true if a query summary must be included in the result, false otherwise. Default false */
  var include_totals: js.UndefOr[Boolean] = js.undefined
  
  /** Page number. Zero based */
  var page: js.UndefOr[Double] = js.undefined
  
  /** The amount of entries per page */
  var per_page: js.UndefOr[Double] = js.undefined
  
  /** Search Criteria using Query String Syntax */
  var q: js.UndefOr[String] = js.undefined
  
  /** The field to use for sorting. */
  var sort: js.UndefOr[String] = js.undefined
  
  /** When using the `from` parameter, the number of entries to retrieve. Default 50, max 100. */
  var take: js.UndefOr[Double] = js.undefined
}
object LogsQuery {
  
  inline def apply(): LogsQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogsQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogsQuery] (val x: Self) extends AnyVal {
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setInclude_fields(value: Boolean): Self = StObject.set(x, "include_fields", value.asInstanceOf[js.Any])
    
    inline def setInclude_fieldsUndefined: Self = StObject.set(x, "include_fields", js.undefined)
    
    inline def setInclude_totals(value: Boolean): Self = StObject.set(x, "include_totals", value.asInstanceOf[js.Any])
    
    inline def setInclude_totalsUndefined: Self = StObject.set(x, "include_totals", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    inline def setSort(value: String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setTake(value: Double): Self = StObject.set(x, "take", value.asInstanceOf[js.Any])
    
    inline def setTakeUndefined: Self = StObject.set(x, "take", js.undefined)
  }
}
