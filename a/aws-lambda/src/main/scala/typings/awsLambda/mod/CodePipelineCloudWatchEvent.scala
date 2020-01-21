package typings.awsLambda.mod

import typings.awsLambda.AnonActionExecutionid
import typings.awsLambda.AnonExecutionid
import typings.awsLambda.AnonExecutionidPipeline
import typings.awsLambda.awsLambdaStrings.`CodePipeline Action Execution State Change`
import typings.awsLambda.awsLambdaStrings.`CodePipeline Pipeline Execution State Change`
import typings.awsLambda.awsLambdaStrings.`CodePipeline Stage Execution State Change`
import typings.awsLambda.awsLambdaStrings.awsDotcodepipeline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.awsLambda.mod.CodePipelineCloudWatchPipelineEvent
  - typings.awsLambda.mod.CodePipelineCloudWatchStageEvent
  - typings.awsLambda.mod.CodePipelineCloudWatchActionEvent
*/
trait CodePipelineCloudWatchEvent extends js.Object

object CodePipelineCloudWatchEvent {
  @scala.inline
  def CodePipelineCloudWatchPipelineEvent(
    account: String,
    detail: AnonExecutionid,
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
    detail: AnonExecutionidPipeline,
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
    detail: AnonActionExecutionid,
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

