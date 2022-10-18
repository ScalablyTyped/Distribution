package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepOutput extends StObject {
  
  /**
    * The data type of the step output.
    */
  var dataType: js.UndefOr[DataType] = js.undefined
  
  /**
    * The name of the step.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Determine if an output is required from a step.
    */
  var required: js.UndefOr[Boolean] = js.undefined
}
object StepOutput {
  
  inline def apply(): StepOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepOutput]
  }
  
  extension [Self <: StepOutput](x: Self) {
    
    inline def setDataType(value: DataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
