package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutApprovalResultInput extends js.Object {
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
    * The system-generated token used to identify a unique approval request. The token for each open approval request can be obtained using the GetPipelineState action and is used to validate that the approval request corresponding to this token is still valid.
    */
  var token: ApprovalToken
}

object PutApprovalResultInput {
  @scala.inline
  def apply(
    actionName: ActionName,
    pipelineName: PipelineName,
    result: ApprovalResult,
    stageName: StageName,
    token: ApprovalToken
  ): PutApprovalResultInput = {
    val __obj = js.Dynamic.literal(actionName = actionName, pipelineName = pipelineName, result = result, stageName = stageName, token = token)
  
    __obj.asInstanceOf[PutApprovalResultInput]
  }
}

