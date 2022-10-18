package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaintenanceWindowTaskParameterValueExpression extends StObject {
  
  /**
    * This field contains an array of 0 or more strings, each 1 to 255 characters in length.
    */
  var Values: js.UndefOr[MaintenanceWindowTaskParameterValueList] = js.undefined
}
object MaintenanceWindowTaskParameterValueExpression {
  
  inline def apply(): MaintenanceWindowTaskParameterValueExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowTaskParameterValueExpression]
  }
  
  extension [Self <: MaintenanceWindowTaskParameterValueExpression](x: Self) {
    
    inline def setValues(value: MaintenanceWindowTaskParameterValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: MaintenanceWindowTaskParameterValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
