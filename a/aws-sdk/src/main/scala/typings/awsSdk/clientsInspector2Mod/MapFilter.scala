package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapFilter extends StObject {
  
  /**
    * The operator to use when comparing values in the filter.
    */
  var comparison: MapComparison
  
  /**
    * The tag key used in the filter.
    */
  var key: MapKey
  
  /**
    * The tag value used in the filter.
    */
  var value: js.UndefOr[MapValue] = js.undefined
}
object MapFilter {
  
  inline def apply(comparison: MapComparison, key: MapKey): MapFilter = {
    val __obj = js.Dynamic.literal(comparison = comparison.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapFilter]
  }
  
  extension [Self <: MapFilter](x: Self) {
    
    inline def setComparison(value: MapComparison): Self = StObject.set(x, "comparison", value.asInstanceOf[js.Any])
    
    inline def setKey(value: MapKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: MapValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
