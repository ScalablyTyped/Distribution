package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorkflowStepExecutionResponse extends StObject {
  
  /**
    * The name of the action that the specified step performs.
    */
  var action: js.UndefOr[WorkflowStepAction] = js.undefined
  
  /**
    * Describes the specified workflow step.
    */
  var description: js.UndefOr[WorkflowStepDescription] = js.undefined
  
  /**
    * The timestamp when the specified runtime instance of the workflow step finished.
    */
  var endTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the image resource build version that the specified runtime instance of the workflow step creates.
    */
  var imageBuildVersionArn: js.UndefOr[ImageBuildVersionArn] = js.undefined
  
  /**
    * Input parameters that Image Builder provided for the specified runtime instance of the workflow step.
    */
  var inputs: js.UndefOr[WorkflowStepInputs] = js.undefined
  
  /**
    * The output message from the specified runtime instance of the workflow step, if applicable.
    */
  var message: js.UndefOr[WorkflowStepMessage] = js.undefined
  
  /**
    * The name of the specified runtime instance of the workflow step.
    */
  var name: js.UndefOr[WorkflowStepName] = js.undefined
  
  /**
    * The action to perform if the workflow step fails.
    */
  var onFailure: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The file names that the specified runtime version of the workflow step created as output.
    */
  var outputs: js.UndefOr[WorkflowStepOutputs] = js.undefined
  
  /**
    * The request ID that uniquely identifies this request.
    */
  var requestId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Reports on the rollback status of the specified runtime version of the workflow step, if applicable.
    */
  var rollbackStatus: js.UndefOr[WorkflowStepExecutionRollbackStatus] = js.undefined
  
  /**
    * The timestamp when the specified runtime version of the workflow step started.
    */
  var startTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The current status for the specified runtime version of the workflow step.
    */
  var status: js.UndefOr[WorkflowStepExecutionStatus] = js.undefined
  
  /**
    * The unique identifier for the runtime version of the workflow step that you specified in the request.
    */
  var stepExecutionId: js.UndefOr[WorkflowStepExecutionId] = js.undefined
  
  /**
    * The maximum duration in seconds for this step to complete its action.
    */
  var timeoutSeconds: js.UndefOr[WorkflowStepTimeoutSecondsInteger] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the build version for the Image Builder workflow resource that defines this workflow step.
    */
  var workflowBuildVersionArn: js.UndefOr[WorkflowBuildVersionArn] = js.undefined
  
  /**
    * The unique identifier that Image Builder assigned to keep track of runtime details when it ran the workflow.
    */
  var workflowExecutionId: js.UndefOr[WorkflowExecutionId] = js.undefined
}
object GetWorkflowStepExecutionResponse {
  
  inline def apply(): GetWorkflowStepExecutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorkflowStepExecutionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetWorkflowStepExecutionResponse] (val x: Self) extends AnyVal {
    
    inline def setAction(value: WorkflowStepAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setDescription(value: WorkflowStepDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEndTime(value: DateTime): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setImageBuildVersionArn(value: ImageBuildVersionArn): Self = StObject.set(x, "imageBuildVersionArn", value.asInstanceOf[js.Any])
    
    inline def setImageBuildVersionArnUndefined: Self = StObject.set(x, "imageBuildVersionArn", js.undefined)
    
    inline def setInputs(value: WorkflowStepInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    inline def setMessage(value: WorkflowStepMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setName(value: WorkflowStepName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnFailure(value: NonEmptyString): Self = StObject.set(x, "onFailure", value.asInstanceOf[js.Any])
    
    inline def setOnFailureUndefined: Self = StObject.set(x, "onFailure", js.undefined)
    
    inline def setOutputs(value: WorkflowStepOutputs): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    inline def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setRollbackStatus(value: WorkflowStepExecutionRollbackStatus): Self = StObject.set(x, "rollbackStatus", value.asInstanceOf[js.Any])
    
    inline def setRollbackStatusUndefined: Self = StObject.set(x, "rollbackStatus", js.undefined)
    
    inline def setStartTime(value: DateTime): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatus(value: WorkflowStepExecutionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStepExecutionId(value: WorkflowStepExecutionId): Self = StObject.set(x, "stepExecutionId", value.asInstanceOf[js.Any])
    
    inline def setStepExecutionIdUndefined: Self = StObject.set(x, "stepExecutionId", js.undefined)
    
    inline def setTimeoutSeconds(value: WorkflowStepTimeoutSecondsInteger): Self = StObject.set(x, "timeoutSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutSecondsUndefined: Self = StObject.set(x, "timeoutSeconds", js.undefined)
    
    inline def setWorkflowBuildVersionArn(value: WorkflowBuildVersionArn): Self = StObject.set(x, "workflowBuildVersionArn", value.asInstanceOf[js.Any])
    
    inline def setWorkflowBuildVersionArnUndefined: Self = StObject.set(x, "workflowBuildVersionArn", js.undefined)
    
    inline def setWorkflowExecutionId(value: WorkflowExecutionId): Self = StObject.set(x, "workflowExecutionId", value.asInstanceOf[js.Any])
    
    inline def setWorkflowExecutionIdUndefined: Self = StObject.set(x, "workflowExecutionId", js.undefined)
  }
}
