package typings.adobeAioLibAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalculatedMetricFilter extends StObject {
  
  var calculatedMetricFilter: Any
  
  var expansion: Any
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var locale: Any
  
  var name: Any
  
  var ownerId: Any
  
  var page: js.UndefOr[Double] = js.undefined
  
  var rsids: js.Array[String]
  
  var tagNames: Any
}
object CalculatedMetricFilter {
  
  inline def apply(
    calculatedMetricFilter: Any,
    expansion: Any,
    locale: Any,
    name: Any,
    ownerId: Any,
    rsids: js.Array[String],
    tagNames: Any
  ): CalculatedMetricFilter = {
    val __obj = js.Dynamic.literal(calculatedMetricFilter = calculatedMetricFilter.asInstanceOf[js.Any], expansion = expansion.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], rsids = rsids.asInstanceOf[js.Any], tagNames = tagNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalculatedMetricFilter]
  }
  
  extension [Self <: CalculatedMetricFilter](x: Self) {
    
    inline def setCalculatedMetricFilter(value: Any): Self = StObject.set(x, "calculatedMetricFilter", value.asInstanceOf[js.Any])
    
    inline def setExpansion(value: Any): Self = StObject.set(x, "expansion", value.asInstanceOf[js.Any])
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setLocale(value: Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setName(value: Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOwnerId(value: Any): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setRsids(value: js.Array[String]): Self = StObject.set(x, "rsids", value.asInstanceOf[js.Any])
    
    inline def setRsidsVarargs(value: String*): Self = StObject.set(x, "rsids", js.Array(value*))
    
    inline def setTagNames(value: Any): Self = StObject.set(x, "tagNames", value.asInstanceOf[js.Any])
  }
}
