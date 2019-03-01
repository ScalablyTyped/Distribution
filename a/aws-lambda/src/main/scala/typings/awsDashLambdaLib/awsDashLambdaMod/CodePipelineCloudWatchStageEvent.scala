package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodePipelineCloudWatchStageEvent extends CodePipelineCloudWatchEvent {
  var account: java.lang.String
  var detail: awsDashLambdaLib.Anon_ExecutionidPipeline
  var `detail-type`: awsDashLambdaLib.awsDashLambdaLibStrings.`CodePipeline Stage Execution State Change`
  var id: java.lang.String
  var region: java.lang.String
  var resources: js.Array[java.lang.String]
  var source: awsDashLambdaLib.awsDashLambdaLibStrings.awsDOTcodepipeline
  var time: java.lang.String
  var version: java.lang.String
}

object CodePipelineCloudWatchStageEvent {
  @scala.inline
  def apply(
    account: java.lang.String,
    detail: awsDashLambdaLib.Anon_ExecutionidPipeline,
    `detail-type`: awsDashLambdaLib.awsDashLambdaLibStrings.`CodePipeline Stage Execution State Change`,
    id: java.lang.String,
    region: java.lang.String,
    resources: js.Array[java.lang.String],
    source: awsDashLambdaLib.awsDashLambdaLibStrings.awsDOTcodepipeline,
    time: java.lang.String,
    version: java.lang.String
  ): CodePipelineCloudWatchStageEvent = {
    val __obj = js.Dynamic.literal(`detail-type` = `detail-type`)
    __obj.updateDynamic("account")(account)
    __obj.updateDynamic("detail")(detail)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("region")(region)
    __obj.updateDynamic("resources")(resources)
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("time")(time)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[CodePipelineCloudWatchStageEvent]
  }
}

