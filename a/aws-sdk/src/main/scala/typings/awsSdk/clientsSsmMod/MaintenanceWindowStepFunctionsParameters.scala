package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaintenanceWindowStepFunctionsParameters extends StObject {
  
  /**
    * The inputs for the STEP_FUNCTIONS task.
    */
  var Input: js.UndefOr[MaintenanceWindowStepFunctionsInput] = js.undefined
  
  /**
    * The name of the STEP_FUNCTIONS task.
    */
  var Name: js.UndefOr[MaintenanceWindowStepFunctionsName] = js.undefined
}
object MaintenanceWindowStepFunctionsParameters {
  
  inline def apply(): MaintenanceWindowStepFunctionsParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowStepFunctionsParameters]
  }
  
  extension [Self <: MaintenanceWindowStepFunctionsParameters](x: Self) {
    
    inline def setInput(value: MaintenanceWindowStepFunctionsInput): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
    
    inline def setName(value: MaintenanceWindowStepFunctionsName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
