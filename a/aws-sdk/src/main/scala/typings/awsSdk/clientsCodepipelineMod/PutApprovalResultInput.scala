package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutApprovalResultInput extends StObject {
  
  /**
    * The name of the action for which approval is requested.
    */
  var actionName: ActionName
  
  /**
    * The name of the pipeline that contains the action. 
    */
  var pipelineName: PipelineName
  
  /**
    * Represents information about the result of the approval request.
    */
  var result: ApprovalResult
  
  /**
    * The name of the stage that contains the action.
    */
  var stageName: StageName
  
  /**
    * The system-generated token used to identify a unique approval request. The token for each open approval request can be obtained using the GetPipelineState action. It is used to validate that the approval request corresponding to this token is still valid.
    */
  var token: ApprovalToken
}
object PutApprovalResultInput {
  
  inline def apply(
    actionName: ActionName,
    pipelineName: PipelineName,
    result: ApprovalResult,
    stageName: StageName,
    token: ApprovalToken
  ): PutApprovalResultInput = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any], pipelineName = pipelineName.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], stageName = stageName.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutApprovalResultInput]
  }
  
  extension [Self <: PutApprovalResultInput](x: Self) {
    
    inline def setActionName(value: ActionName): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
    
    inline def setPipelineName(value: PipelineName): Self = StObject.set(x, "pipelineName", value.asInstanceOf[js.Any])
    
    inline def setResult(value: ApprovalResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setStageName(value: StageName): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
    
    inline def setToken(value: ApprovalToken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
