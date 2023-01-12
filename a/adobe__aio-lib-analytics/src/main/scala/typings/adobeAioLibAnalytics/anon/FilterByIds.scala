package typings.adobeAioLibAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterByIds extends StObject {
  
  var expansion: Any
  
  var filterByIds: Any
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var locale: Any
  
  var page: js.UndefOr[Double] = js.undefined
}
object FilterByIds {
  
  inline def apply(expansion: Any, filterByIds: Any, locale: Any): FilterByIds = {
    val __obj = js.Dynamic.literal(expansion = expansion.asInstanceOf[js.Any], filterByIds = filterByIds.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterByIds]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterByIds] (val x: Self) extends AnyVal {
    
    inline def setExpansion(value: Any): Self = StObject.set(x, "expansion", value.asInstanceOf[js.Any])
    
    inline def setFilterByIds(value: Any): Self = StObject.set(x, "filterByIds", value.asInstanceOf[js.Any])
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setLocale(value: Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
  }
}
