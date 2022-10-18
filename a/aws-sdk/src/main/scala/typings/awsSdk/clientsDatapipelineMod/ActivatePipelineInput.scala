package typings.awsSdk.clientsDatapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivatePipelineInput extends StObject {
  
  /**
    * A list of parameter values to pass to the pipeline at activation.
    */
  var parameterValues: js.UndefOr[ParameterValueList] = js.undefined
  
  /**
    * The ID of the pipeline.
    */
  var pipelineId: id
  
  /**
    * The date and time to resume the pipeline. By default, the pipeline resumes from the last completed execution.
    */
  var startTimestamp: js.UndefOr[js.Date] = js.undefined
}
object ActivatePipelineInput {
  
  inline def apply(pipelineId: id): ActivatePipelineInput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivatePipelineInput]
  }
  
  extension [Self <: ActivatePipelineInput](x: Self) {
    
    inline def setParameterValues(value: ParameterValueList): Self = StObject.set(x, "parameterValues", value.asInstanceOf[js.Any])
    
    inline def setParameterValuesUndefined: Self = StObject.set(x, "parameterValues", js.undefined)
    
    inline def setParameterValuesVarargs(value: ParameterValue*): Self = StObject.set(x, "parameterValues", js.Array(value*))
    
    inline def setPipelineId(value: id): Self = StObject.set(x, "pipelineId", value.asInstanceOf[js.Any])
    
    inline def setStartTimestamp(value: js.Date): Self = StObject.set(x, "startTimestamp", value.asInstanceOf[js.Any])
    
    inline def setStartTimestampUndefined: Self = StObject.set(x, "startTimestamp", js.undefined)
  }
}
