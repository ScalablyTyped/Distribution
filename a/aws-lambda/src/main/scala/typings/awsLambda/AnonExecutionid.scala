package typings.awsLambda

import typings.awsLambda.codepipelineCloudwatchActionMod.CodePipelineActionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExecutionid extends js.Object {
  var action: String
  var `execution-id`: String
  var pipeline: String
  var stage: String
  var state: CodePipelineActionState
  var `type`: AnonCategory
  var version: Double
}

object AnonExecutionid {
  @scala.inline
  def apply(
    action: String,
    `execution-id`: String,
    pipeline: String,
    stage: String,
    state: CodePipelineActionState,
    `type`: AnonCategory,
    version: Double
  ): AnonExecutionid = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], pipeline = pipeline.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("execution-id")(`execution-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExecutionid]
  }
}

