package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPipelineExecutionStepsResponse extends StObject {
  
  /**
    * If the result of the previous ListPipelineExecutionSteps request was truncated, the response includes a NextToken. To retrieve the next set of pipeline execution steps, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
  
  /**
    * A list of PipeLineExecutionStep objects. Each PipeLineExecutionStep consists of StepName, StartTime, EndTime, StepStatus, and Metadata. Metadata is an object with properties for each job that contains relevant information about the job created by the step.
    */
  var PipelineExecutionSteps: js.UndefOr[PipelineExecutionStepList] = js.undefined
}
object ListPipelineExecutionStepsResponse {
  
  inline def apply(): ListPipelineExecutionStepsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPipelineExecutionStepsResponse]
  }
  
  extension [Self <: ListPipelineExecutionStepsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPipelineExecutionSteps(value: PipelineExecutionStepList): Self = StObject.set(x, "PipelineExecutionSteps", value.asInstanceOf[js.Any])
    
    inline def setPipelineExecutionStepsUndefined: Self = StObject.set(x, "PipelineExecutionSteps", js.undefined)
    
    inline def setPipelineExecutionStepsVarargs(value: PipelineExecutionStep*): Self = StObject.set(x, "PipelineExecutionSteps", js.Array(value*))
  }
}
