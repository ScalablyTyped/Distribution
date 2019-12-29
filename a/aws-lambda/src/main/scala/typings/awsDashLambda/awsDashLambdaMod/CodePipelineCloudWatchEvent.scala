package typings.awsDashLambda.awsDashLambdaMod

import typings.awsDashLambda.Anon_ActionExecutionid
import typings.awsDashLambda.Anon_Executionid
import typings.awsDashLambda.Anon_ExecutionidPipeline
import typings.awsDashLambda.awsDashLambdaStrings.`CodePipeline Action Execution State Change`
import typings.awsDashLambda.awsDashLambdaStrings.`CodePipeline Pipeline Execution State Change`
import typings.awsDashLambda.awsDashLambdaStrings.`CodePipeline Stage Execution State Change`
import typings.awsDashLambda.awsDashLambdaStrings.awsDotcodepipeline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.awsDashLambda.awsDashLambdaMod.CodePipelineCloudWatchPipelineEvent
  - typings.awsDashLambda.awsDashLambdaMod.CodePipelineCloudWatchStageEvent
  - typings.awsDashLambda.awsDashLambdaMod.CodePipelineCloudWatchActionEvent
*/
trait CodePipelineCloudWatchEvent extends js.Object

object CodePipelineCloudWatchEvent {
  @scala.inline
  def CodePipelineCloudWatchPipelineEvent(
    account: String,
    detail: Anon_Executionid,
    `detail-type`: `CodePipeline Pipeline Execution State Change`,
    id: String,
    region: String,
    resources: js.Array[String],
    source: awsDotcodepipeline,
    time: String,
    version: String
  ): CodePipelineCloudWatchEvent = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("detail-type")(`detail-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodePipelineCloudWatchEvent]
  }
  @scala.inline
  def CodePipelineCloudWatchStageEvent(
    account: String,
    detail: Anon_ExecutionidPipeline,
    `detail-type`: `CodePipeline Stage Execution State Change`,
    id: String,
    region: String,
    resources: js.Array[String],
    source: awsDotcodepipeline,
    time: String,
    version: String
  ): CodePipelineCloudWatchEvent = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("detail-type")(`detail-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodePipelineCloudWatchEvent]
  }
  @scala.inline
  def CodePipelineCloudWatchActionEvent(
    account: String,
    detail: Anon_ActionExecutionid,
    `detail-type`: `CodePipeline Action Execution State Change`,
    id: String,
    region: String,
    resources: js.Array[String],
    source: awsDotcodepipeline,
    time: String,
    version: String
  ): CodePipelineCloudWatchEvent = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("detail-type")(`detail-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodePipelineCloudWatchEvent]
  }
}

