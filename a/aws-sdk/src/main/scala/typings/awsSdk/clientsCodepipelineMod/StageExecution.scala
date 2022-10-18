package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StageExecution extends StObject {
  
  /**
    * The ID of the pipeline execution associated with the stage.
    */
  var pipelineExecutionId: PipelineExecutionId
  
  /**
    * The status of the stage, or for a completed stage, the last status of the stage.  A status of cancelled means that the pipeline’s definition was updated before the stage execution could be completed. 
    */
  var status: StageExecutionStatus
}
object StageExecution {
  
  inline def apply(pipelineExecutionId: PipelineExecutionId, status: StageExecutionStatus): StageExecution = {
    val __obj = js.Dynamic.literal(pipelineExecutionId = pipelineExecutionId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StageExecution]
  }
  
  extension [Self <: StageExecution](x: Self) {
    
    inline def setPipelineExecutionId(value: PipelineExecutionId): Self = StObject.set(x, "pipelineExecutionId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: StageExecutionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
