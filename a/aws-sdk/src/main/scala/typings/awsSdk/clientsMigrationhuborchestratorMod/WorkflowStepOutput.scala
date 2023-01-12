package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowStepOutput extends StObject {
  
  /**
    * The data type of the output.
    */
  var dataType: js.UndefOr[DataType] = js.undefined
  
  /**
    * The name of the step.
    */
  var name: js.UndefOr[WorkflowStepOutputName] = js.undefined
  
  /**
    * Determine if an output is required from a step.
    */
  var required: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The value of the output.
    */
  var value: js.UndefOr[WorkflowStepOutputUnion] = js.undefined
}
object WorkflowStepOutput {
  
  inline def apply(): WorkflowStepOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowStepOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkflowStepOutput] (val x: Self) extends AnyVal {
    
    inline def setDataType(value: DataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setName(value: WorkflowStepOutputName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setValue(value: WorkflowStepOutputUnion): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
