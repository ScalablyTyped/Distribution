package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowExecutionMetadata extends StObject {
  
  /**
    * The timestamp when this runtime instance of the workflow finished.
    */
  var endTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The runtime output message from the workflow, if applicable.
    */
  var message: js.UndefOr[WorkflowExecutionMessage] = js.undefined
  
  /**
    * The timestamp when the runtime instance of this workflow started.
    */
  var startTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The current runtime status for this workflow.
    */
  var status: js.UndefOr[WorkflowExecutionStatus] = js.undefined
  
  /**
    * The total number of steps in the workflow. This should equal the sum of the step counts for steps that succeeded, were skipped, and failed.
    */
  var totalStepCount: js.UndefOr[WorkflowStepCount] = js.undefined
  
  /**
    * A runtime count for the number of steps in the workflow that failed.
    */
  var totalStepsFailed: js.UndefOr[WorkflowStepCount] = js.undefined
  
  /**
    * A runtime count for the number of steps in the workflow that were skipped.
    */
  var totalStepsSkipped: js.UndefOr[WorkflowStepCount] = js.undefined
  
  /**
    * A runtime count for the number of steps in the workflow that ran successfully.
    */
  var totalStepsSucceeded: js.UndefOr[WorkflowStepCount] = js.undefined
  
  /**
    * Indicates what type of workflow that Image Builder ran for this runtime instance of the workflow.
    */
  var `type`: js.UndefOr[WorkflowType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the workflow resource build version that ran.
    */
  var workflowBuildVersionArn: js.UndefOr[WorkflowBuildVersionArn] = js.undefined
  
  /**
    * Unique identifier that Image Builder assigns to keep track of runtime resources each time it runs a workflow.
    */
  var workflowExecutionId: js.UndefOr[WorkflowExecutionId] = js.undefined
}
object WorkflowExecutionMetadata {
  
  inline def apply(): WorkflowExecutionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowExecutionMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkflowExecutionMetadata] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: DateTime): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setMessage(value: WorkflowExecutionMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setStartTime(value: DateTime): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatus(value: WorkflowExecutionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTotalStepCount(value: WorkflowStepCount): Self = StObject.set(x, "totalStepCount", value.asInstanceOf[js.Any])
    
    inline def setTotalStepCountUndefined: Self = StObject.set(x, "totalStepCount", js.undefined)
    
    inline def setTotalStepsFailed(value: WorkflowStepCount): Self = StObject.set(x, "totalStepsFailed", value.asInstanceOf[js.Any])
    
    inline def setTotalStepsFailedUndefined: Self = StObject.set(x, "totalStepsFailed", js.undefined)
    
    inline def setTotalStepsSkipped(value: WorkflowStepCount): Self = StObject.set(x, "totalStepsSkipped", value.asInstanceOf[js.Any])
    
    inline def setTotalStepsSkippedUndefined: Self = StObject.set(x, "totalStepsSkipped", js.undefined)
    
    inline def setTotalStepsSucceeded(value: WorkflowStepCount): Self = StObject.set(x, "totalStepsSucceeded", value.asInstanceOf[js.Any])
    
    inline def setTotalStepsSucceededUndefined: Self = StObject.set(x, "totalStepsSucceeded", js.undefined)
    
    inline def setType(value: WorkflowType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWorkflowBuildVersionArn(value: WorkflowBuildVersionArn): Self = StObject.set(x, "workflowBuildVersionArn", value.asInstanceOf[js.Any])
    
    inline def setWorkflowBuildVersionArnUndefined: Self = StObject.set(x, "workflowBuildVersionArn", js.undefined)
    
    inline def setWorkflowExecutionId(value: WorkflowExecutionId): Self = StObject.set(x, "workflowExecutionId", value.asInstanceOf[js.Any])
    
    inline def setWorkflowExecutionIdUndefined: Self = StObject.set(x, "workflowExecutionId", js.undefined)
  }
}
