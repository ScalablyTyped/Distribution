package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopPipelineExecutionInput extends StObject {
  
  /**
    * Use this option to stop the pipeline execution by abandoning, rather than finishing, in-progress actions.  This option can lead to failed or out-of-sequence tasks. 
    */
  var abandon: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the pipeline execution to be stopped in the current stage. Use the GetPipelineState action to retrieve the current pipelineExecutionId.
    */
  var pipelineExecutionId: PipelineExecutionId
  
  /**
    * The name of the pipeline to stop.
    */
  var pipelineName: PipelineName
  
  /**
    * Use this option to enter comments, such as the reason the pipeline was stopped.
    */
  var reason: js.UndefOr[StopPipelineExecutionReason] = js.undefined
}
object StopPipelineExecutionInput {
  
  inline def apply(pipelineExecutionId: PipelineExecutionId, pipelineName: PipelineName): StopPipelineExecutionInput = {
    val __obj = js.Dynamic.literal(pipelineExecutionId = pipelineExecutionId.asInstanceOf[js.Any], pipelineName = pipelineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopPipelineExecutionInput]
  }
  
  extension [Self <: StopPipelineExecutionInput](x: Self) {
    
    inline def setAbandon(value: Boolean): Self = StObject.set(x, "abandon", value.asInstanceOf[js.Any])
    
    inline def setAbandonUndefined: Self = StObject.set(x, "abandon", js.undefined)
    
    inline def setPipelineExecutionId(value: PipelineExecutionId): Self = StObject.set(x, "pipelineExecutionId", value.asInstanceOf[js.Any])
    
    inline def setPipelineName(value: PipelineName): Self = StObject.set(x, "pipelineName", value.asInstanceOf[js.Any])
    
    inline def setReason(value: StopPipelineExecutionReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
