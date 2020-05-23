package typings.awsLambda.anon

import typings.awsLambda.codepipelineCloudwatchActionMod.CodePipelineActionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Executionid extends js.Object {
  var action: String
  var `execution-id`: String
  var pipeline: String
  var stage: String
  var state: CodePipelineActionState
  var `type`: Category
  var version: Double
}

object Executionid {
  @scala.inline
  def apply(
    action: String,
    `execution-id`: String,
    pipeline: String,
    stage: String,
    state: CodePipelineActionState,
    `type`: Category,
    version: Double
  ): Executionid = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], pipeline = pipeline.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("execution-id")(`execution-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Executionid]
  }
}

