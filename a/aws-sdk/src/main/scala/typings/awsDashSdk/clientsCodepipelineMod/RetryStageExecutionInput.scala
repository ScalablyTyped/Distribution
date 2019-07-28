package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetryStageExecutionInput extends js.Object {
  /**
    * The ID of the pipeline execution in the failed stage to be retried. Use the GetPipelineState action to retrieve the current pipelineExecutionId of the failed stage
    */
  var pipelineExecutionId: PipelineExecutionId
  /**
    * The name of the pipeline that contains the failed stage.
    */
  var pipelineName: PipelineName
  /**
    * The scope of the retry attempt. Currently, the only supported value is FAILED_ACTIONS.
    */
  var retryMode: StageRetryMode
  /**
    * The name of the failed stage to be retried.
    */
  var stageName: StageName
}

object RetryStageExecutionInput {
  @scala.inline
  def apply(
    pipelineExecutionId: PipelineExecutionId,
    pipelineName: PipelineName,
    retryMode: StageRetryMode,
    stageName: StageName
  ): RetryStageExecutionInput = {
    val __obj = js.Dynamic.literal(pipelineExecutionId = pipelineExecutionId, pipelineName = pipelineName, retryMode = retryMode.asInstanceOf[js.Any], stageName = stageName)
  
    __obj.asInstanceOf[RetryStageExecutionInput]
  }
}

