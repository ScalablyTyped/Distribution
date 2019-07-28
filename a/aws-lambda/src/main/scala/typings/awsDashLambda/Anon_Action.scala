package typings.awsDashLambda

import typings.awsDashLambda.awsDashLambdaMod.CodePipelineActionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Action extends js.Object {
  var action: String
  var `execution-id`: String
  var pipeline: String
  var stage: String
  var state: CodePipelineActionState
  var `type`: Anon_AWS
  var version: Double
}

object Anon_Action {
  @scala.inline
  def apply(
    action: String,
    `execution-id`: String,
    pipeline: String,
    stage: String,
    state: CodePipelineActionState,
    `type`: Anon_AWS,
    version: Double
  ): Anon_Action = {
    val __obj = js.Dynamic.literal(action = action, pipeline = pipeline, stage = stage, state = state, version = version)
    __obj.updateDynamic("execution-id")(`execution-id`)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Action]
  }
}

