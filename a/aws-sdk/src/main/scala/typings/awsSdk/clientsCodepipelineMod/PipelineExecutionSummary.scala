package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelineExecutionSummary extends StObject {
  
  /**
    * The date and time of the last change to the pipeline execution, in timestamp format.
    */
  var lastUpdateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the pipeline execution.
    */
  var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined
  
  /**
    * A list of the source artifact revisions that initiated a pipeline execution.
    */
  var sourceRevisions: js.UndefOr[SourceRevisionList] = js.undefined
  
  /**
    * The date and time when the pipeline execution began, in timestamp format.
    */
  var startTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the pipeline execution.   InProgress: The pipeline execution is currently running.   Stopped: The pipeline execution was manually stopped. For more information, see Stopped Executions.   Stopping: The pipeline execution received a request to be manually stopped. Depending on the selected stop mode, the execution is either completing or abandoning in-progress actions. For more information, see Stopped Executions.   Succeeded: The pipeline execution was completed successfully.    Superseded: While this pipeline execution was waiting for the next stage to be completed, a newer pipeline execution advanced and continued through the pipeline instead. For more information, see Superseded Executions.   Failed: The pipeline execution was not completed successfully.  
    */
  var status: js.UndefOr[PipelineExecutionStatus] = js.undefined
  
  /**
    * The interaction that stopped a pipeline execution.
    */
  var stopTrigger: js.UndefOr[StopExecutionTrigger] = js.undefined
  
  /**
    * The interaction or event that started a pipeline execution, such as automated change detection or a StartPipelineExecution API call.
    */
  var trigger: js.UndefOr[ExecutionTrigger] = js.undefined
}
object PipelineExecutionSummary {
  
  inline def apply(): PipelineExecutionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineExecutionSummary]
  }
  
  extension [Self <: PipelineExecutionSummary](x: Self) {
    
    inline def setLastUpdateTime(value: js.Date): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    inline def setPipelineExecutionId(value: PipelineExecutionId): Self = StObject.set(x, "pipelineExecutionId", value.asInstanceOf[js.Any])
    
    inline def setPipelineExecutionIdUndefined: Self = StObject.set(x, "pipelineExecutionId", js.undefined)
    
    inline def setSourceRevisions(value: SourceRevisionList): Self = StObject.set(x, "sourceRevisions", value.asInstanceOf[js.Any])
    
    inline def setSourceRevisionsUndefined: Self = StObject.set(x, "sourceRevisions", js.undefined)
    
    inline def setSourceRevisionsVarargs(value: SourceRevision*): Self = StObject.set(x, "sourceRevisions", js.Array(value*))
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatus(value: PipelineExecutionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStopTrigger(value: StopExecutionTrigger): Self = StObject.set(x, "stopTrigger", value.asInstanceOf[js.Any])
    
    inline def setStopTriggerUndefined: Self = StObject.set(x, "stopTrigger", js.undefined)
    
    inline def setTrigger(value: ExecutionTrigger): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}
