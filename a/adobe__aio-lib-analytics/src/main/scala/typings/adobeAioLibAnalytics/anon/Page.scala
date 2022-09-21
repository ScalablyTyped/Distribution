package typings.adobeAioLibAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Page extends StObject {
  
  var expansion: Any
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var rsidContains: Any
  
  var rsids: js.Array[String]
}
object Page {
  
  inline def apply(expansion: Any, rsidContains: Any, rsids: js.Array[String]): Page = {
    val __obj = js.Dynamic.literal(expansion = expansion.asInstanceOf[js.Any], rsidContains = rsidContains.asInstanceOf[js.Any], rsids = rsids.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
  
  extension [Self <: Page](x: Self) {
    
    inline def setExpansion(value: Any): Self = StObject.set(x, "expansion", value.asInstanceOf[js.Any])
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setRsidContains(value: Any): Self = StObject.set(x, "rsidContains", value.asInstanceOf[js.Any])
    
    inline def setRsids(value: js.Array[String]): Self = StObject.set(x, "rsids", value.asInstanceOf[js.Any])
    
    inline def setRsidsVarargs(value: String*): Self = StObject.set(x, "rsids", js.Array(value*))
  }
}
