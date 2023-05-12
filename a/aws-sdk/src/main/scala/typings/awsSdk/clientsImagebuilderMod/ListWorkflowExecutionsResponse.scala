package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkflowExecutionsResponse extends StObject {
  
  /**
    * The resource ARN of the image build version for which you requested a list of workflow runtime details.
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
    * Contains an array of runtime details that represents each time a workflow ran for the requested image build version.
    */
  var workflowExecutions: js.UndefOr[WorkflowExecutionsList] = js.undefined
}
object ListWorkflowExecutionsResponse {
  
  inline def apply(): ListWorkflowExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkflowExecutionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListWorkflowExecutionsResponse] (val x: Self) extends AnyVal {
    
    inline def setImageBuildVersionArn(value: ImageBuildVersionArn): Self = StObject.set(x, "imageBuildVersionArn", value.asInstanceOf[js.Any])
    
    inline def setImageBuildVersionArnUndefined: Self = StObject.set(x, "imageBuildVersionArn", js.undefined)
    
    inline def setMessage(value: ImageBuildMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setWorkflowExecutions(value: WorkflowExecutionsList): Self = StObject.set(x, "workflowExecutions", value.asInstanceOf[js.Any])
    
    inline def setWorkflowExecutionsUndefined: Self = StObject.set(x, "workflowExecutions", js.undefined)
    
    inline def setWorkflowExecutionsVarargs(value: WorkflowExecutionMetadata*): Self = StObject.set(x, "workflowExecutions", js.Array(value*))
  }
}
