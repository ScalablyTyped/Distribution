package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationResultFilter extends StObject {
  
  /**
    * The type of filter to apply.
    */
  var Name: js.UndefOr[OperationResultFilterName] = js.undefined
  
  /**
    * The value to filter by.
    */
  var Values: js.UndefOr[OperationResultFilterValues] = js.undefined
}
object OperationResultFilter {
  
  inline def apply(): OperationResultFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationResultFilter]
  }
  
  extension [Self <: OperationResultFilter](x: Self) {
    
    inline def setName(value: OperationResultFilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValues(value: OperationResultFilterValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
  }
}
