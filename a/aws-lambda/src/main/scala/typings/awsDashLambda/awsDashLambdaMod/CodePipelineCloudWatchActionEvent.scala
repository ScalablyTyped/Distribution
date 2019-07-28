package typings.awsDashLambda.awsDashLambdaMod

import typings.awsDashLambda.Anon_Action
import typings.awsDashLambda.awsDashLambdaStrings.`CodePipeline Action Execution State Change`
import typings.awsDashLambda.awsDashLambdaStrings.awsDOTcodepipeline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodePipelineCloudWatchActionEvent extends CodePipelineCloudWatchEvent {
  var account: String
  var detail: Anon_Action
  var `detail-type`: `CodePipeline Action Execution State Change`
  var id: String
  var region: String
  var resources: js.Array[String]
  var source: awsDOTcodepipeline
  var time: String
  var version: String
}

object CodePipelineCloudWatchActionEvent {
  @scala.inline
  def apply(
    account: String,
    detail: Anon_Action,
    `detail-type`: `CodePipeline Action Execution State Change`,
    id: String,
    region: String,
    resources: js.Array[String],
    source: awsDOTcodepipeline,
    time: String,
    version: String
  ): CodePipelineCloudWatchActionEvent = {
    val __obj = js.Dynamic.literal(account = account, detail = detail, id = id, region = region, resources = resources, source = source, time = time, version = version)
    __obj.updateDynamic("detail-type")(`detail-type`)
    __obj.asInstanceOf[CodePipelineCloudWatchActionEvent]
  }
}

