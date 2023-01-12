package typings.adobeAioLibAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeType extends StObject {
  
  var expansion: Any
  
  var includeType: Any
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var locale: Any
  
  var name: Any
  
  var page: js.UndefOr[Double] = js.undefined
  
  var rsids: js.Array[String]
  
  var segmentFilter: Any
  
  var tagNames: Any
}
object IncludeType {
  
  inline def apply(
    expansion: Any,
    includeType: Any,
    locale: Any,
    name: Any,
    rsids: js.Array[String],
    segmentFilter: Any,
    tagNames: Any
  ): IncludeType = {
    val __obj = js.Dynamic.literal(expansion = expansion.asInstanceOf[js.Any], includeType = includeType.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rsids = rsids.asInstanceOf[js.Any], segmentFilter = segmentFilter.asInstanceOf[js.Any], tagNames = tagNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IncludeType] (val x: Self) extends AnyVal {
    
    inline def setExpansion(value: Any): Self = StObject.set(x, "expansion", value.asInstanceOf[js.Any])
    
    inline def setIncludeType(value: Any): Self = StObject.set(x, "includeType", value.asInstanceOf[js.Any])
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setLocale(value: Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setName(value: Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setRsids(value: js.Array[String]): Self = StObject.set(x, "rsids", value.asInstanceOf[js.Any])
    
    inline def setRsidsVarargs(value: String*): Self = StObject.set(x, "rsids", js.Array(value*))
    
    inline def setSegmentFilter(value: Any): Self = StObject.set(x, "segmentFilter", value.asInstanceOf[js.Any])
    
    inline def setTagNames(value: Any): Self = StObject.set(x, "tagNames", value.asInstanceOf[js.Any])
  }
}
