package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  /**
    * The value that you want to include in the filter.
    */
  var DimensionValue: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.DimensionValue] = js.undefined
  
  /**
    * The condition to apply.
    */
  var FilterOperation: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.FilterOperation] = js.undefined
}
object Filter {
  
  inline def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
    
    inline def setDimensionValue(value: DimensionValue): Self = StObject.set(x, "DimensionValue", value.asInstanceOf[js.Any])
    
    inline def setDimensionValueUndefined: Self = StObject.set(x, "DimensionValue", js.undefined)
    
    inline def setFilterOperation(value: FilterOperation): Self = StObject.set(x, "FilterOperation", value.asInstanceOf[js.Any])
    
    inline def setFilterOperationUndefined: Self = StObject.set(x, "FilterOperation", js.undefined)
  }
}
