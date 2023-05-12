package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkflowStepExecutionsResponse extends StObject {
  
  /**
    * The image build version resource ARN that's associated with the specified runtime instance of the workflow.
    */
  var imageBuildVersionArn: js.UndefOr[ImageBuildVersionArn] = js.undefined
  
  /**
    * The output message from the list action, if applicable.
    */
  var message: js.UndefOr[ImageBuildMessage] = js.undefined
  
  /**
    * The next token used for paginated responses. When this field isn't empty, there are additional elements that the service has'ot included in this request. Use this token with the next request to retrieve additional objects.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The request ID that uniquely identifies this request.
    */
  var requestId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Contains an array of runtime details that represents each step in this runtime instance of the workflow.
    */
  var steps: js.UndefOr[WorkflowStepExecutionsList] = js.undefined
  
  /**
    * The build version ARN for the Image Builder workflow resource that defines the steps for this runtime instance of the workflow.
    */
  var workflowBuildVersionArn: js.UndefOr[WorkflowBuildVersionArn] = js.undefined
  
  /**
    * The unique identifier that Image Builder assigned to keep track of runtime details when it ran the workflow.
    */
  var workflowExecutionId: js.UndefOr[WorkflowExecutionId] = js.undefined
}
object ListWorkflowStepExecutionsResponse {
  
  inline def apply(): ListWorkflowStepExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkflowStepExecutionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListWorkflowStepExecutionsResponse] (val x: Self) extends AnyVal {
    
    inline def setImageBuildVersionArn(value: ImageBuildVersionArn): Self = StObject.set(x, "imageBuildVersionArn", value.asInstanceOf[js.Any])
    
    inline def setImageBuildVersionArnUndefined: Self = StObject.set(x, "imageBuildVersionArn", js.undefined)
    
    inline def setMessage(value: ImageBuildMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setSteps(value: WorkflowStepExecutionsList): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    inline def setStepsVarargs(value: WorkflowStepMetadata*): Self = StObject.set(x, "steps", js.Array(value*))
    
    inline def setWorkflowBuildVersionArn(value: WorkflowBuildVersionArn): Self = StObject.set(x, "workflowBuildVersionArn", value.asInstanceOf[js.Any])
    
    inline def setWorkflowBuildVersionArnUndefined: Self = StObject.set(x, "workflowBuildVersionArn", js.undefined)
    
    inline def setWorkflowExecutionId(value: WorkflowExecutionId): Self = StObject.set(x, "workflowExecutionId", value.asInstanceOf[js.Any])
    
    inline def setWorkflowExecutionIdUndefined: Self = StObject.set(x, "workflowExecutionId", js.undefined)
  }
}
