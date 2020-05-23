package typings.awsLambda.anon

import typings.awsLambda.codepipelineCloudwatchStageMod.CodePipelineStageState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stage extends js.Object {
  var `execution-id`: String
  var pipeline: String
  var stage: String
  var state: CodePipelineStageState
  var version: Double
}

object Stage {
  @scala.inline
  def apply(
    `execution-id`: String,
    pipeline: String,
    stage: String,
    state: CodePipelineStageState,
    version: Double
  ): Stage = {
    val __obj = js.Dynamic.literal(pipeline = pipeline.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("execution-id")(`execution-id`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stage]
  }
}

