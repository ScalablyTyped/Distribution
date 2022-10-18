package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaintenanceWindowFilter extends StObject {
  
  /**
    * The name of the filter.
    */
  var Key: js.UndefOr[MaintenanceWindowFilterKey] = js.undefined
  
  /**
    * The filter values.
    */
  var Values: js.UndefOr[MaintenanceWindowFilterValues] = js.undefined
}
object MaintenanceWindowFilter {
  
  inline def apply(): MaintenanceWindowFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowFilter]
  }
  
  extension [Self <: MaintenanceWindowFilter](x: Self) {
    
    inline def setKey(value: MaintenanceWindowFilterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setValues(value: MaintenanceWindowFilterValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: MaintenanceWindowFilterValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
