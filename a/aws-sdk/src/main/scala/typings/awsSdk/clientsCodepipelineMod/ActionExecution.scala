package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionExecution extends StObject {
  
  /**
    * ID of the workflow action execution in the current stage. Use the GetPipelineState action to retrieve the current action execution details of the current stage.  For older executions, this field might be empty. The action execution ID is available for executions run on or after March 2020. 
    */
  var actionExecutionId: js.UndefOr[ActionExecutionId] = js.undefined
  
  /**
    * The details of an error returned by a URL external to AWS.
    */
  var errorDetails: js.UndefOr[ErrorDetails] = js.undefined
  
  /**
    * The external ID of the run of the action.
    */
  var externalExecutionId: js.UndefOr[ExecutionId] = js.undefined
  
  /**
    * The URL of a resource external to AWS that is used when running the action (for example, an external repository URL).
    */
  var externalExecutionUrl: js.UndefOr[Url] = js.undefined
  
  /**
    * The last status change of the action.
    */
  var lastStatusChange: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the user who last changed the pipeline.
    */
  var lastUpdatedBy: js.UndefOr[LastUpdatedBy] = js.undefined
  
  /**
    * A percentage of completeness of the action as it runs.
    */
  var percentComplete: js.UndefOr[Percentage] = js.undefined
  
  /**
    * The status of the action, or for a completed action, the last status of the action.
    */
  var status: js.UndefOr[ActionExecutionStatus] = js.undefined
  
  /**
    * A summary of the run of the action.
    */
  var summary: js.UndefOr[ExecutionSummary] = js.undefined
  
  /**
    * The system-generated token used to identify a unique approval request. The token for each open approval request can be obtained using the GetPipelineState command. It is used to validate that the approval request corresponding to this token is still valid.
    */
  var token: js.UndefOr[ActionExecutionToken] = js.undefined
}
object ActionExecution {
  
  inline def apply(): ActionExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionExecution]
  }
  
  extension [Self <: ActionExecution](x: Self) {
    
    inline def setActionExecutionId(value: ActionExecutionId): Self = StObject.set(x, "actionExecutionId", value.asInstanceOf[js.Any])
    
    inline def setActionExecutionIdUndefined: Self = StObject.set(x, "actionExecutionId", js.undefined)
    
    inline def setErrorDetails(value: ErrorDetails): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    inline def setExternalExecutionId(value: ExecutionId): Self = StObject.set(x, "externalExecutionId", value.asInstanceOf[js.Any])
    
    inline def setExternalExecutionIdUndefined: Self = StObject.set(x, "externalExecutionId", js.undefined)
    
    inline def setExternalExecutionUrl(value: Url): Self = StObject.set(x, "externalExecutionUrl", value.asInstanceOf[js.Any])
    
    inline def setExternalExecutionUrlUndefined: Self = StObject.set(x, "externalExecutionUrl", js.undefined)
    
    inline def setLastStatusChange(value: js.Date): Self = StObject.set(x, "lastStatusChange", value.asInstanceOf[js.Any])
    
    inline def setLastStatusChangeUndefined: Self = StObject.set(x, "lastStatusChange", js.undefined)
    
    inline def setLastUpdatedBy(value: LastUpdatedBy): Self = StObject.set(x, "lastUpdatedBy", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedByUndefined: Self = StObject.set(x, "lastUpdatedBy", js.undefined)
    
    inline def setPercentComplete(value: Percentage): Self = StObject.set(x, "percentComplete", value.asInstanceOf[js.Any])
    
    inline def setPercentCompleteUndefined: Self = StObject.set(x, "percentComplete", js.undefined)
    
    inline def setStatus(value: ActionExecutionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSummary(value: ExecutionSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    inline def setToken(value: ActionExecutionToken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
