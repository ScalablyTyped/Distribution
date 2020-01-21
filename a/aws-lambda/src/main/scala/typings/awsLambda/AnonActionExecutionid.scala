package typings.awsLambda

import typings.awsLambda.mod.CodePipelineActionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActionExecutionid extends js.Object {
  var action: String
  var `execution-id`: String
  var pipeline: String
  var stage: String
  var state: CodePipelineActionState
  var `type`: AnonAWS
  var version: Double
}

object AnonActionExecutionid {
  @scala.inline
  def apply(
    action: String,
    `execution-id`: String,
    pipeline: String,
    stage: String,
    state: CodePipelineActionState,
    `type`: AnonAWS,
    version: Double
  ): AnonActionExecutionid = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], pipeline = pipeline.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("execution-id")(`execution-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActionExecutionid]
  }
}

