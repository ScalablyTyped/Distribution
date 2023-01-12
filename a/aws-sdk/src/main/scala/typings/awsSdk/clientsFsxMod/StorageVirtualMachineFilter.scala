package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageVirtualMachineFilter extends StObject {
  
  /**
    * The name for this filter.
    */
  var Name: js.UndefOr[StorageVirtualMachineFilterName] = js.undefined
  
  /**
    * The values of the filter. These are all the values for any of the applied filters.
    */
  var Values: js.UndefOr[StorageVirtualMachineFilterValues] = js.undefined
}
object StorageVirtualMachineFilter {
  
  inline def apply(): StorageVirtualMachineFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageVirtualMachineFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StorageVirtualMachineFilter] (val x: Self) extends AnyVal {
    
    inline def setName(value: StorageVirtualMachineFilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValues(value: StorageVirtualMachineFilterValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: StorageVirtualMachineFilterValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
