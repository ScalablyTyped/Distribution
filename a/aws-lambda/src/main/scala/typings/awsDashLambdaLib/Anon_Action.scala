package typings
package awsDashLambdaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Action extends js.Object {
  var action: java.lang.String
  var `execution-id`: java.lang.String
  var pipeline: java.lang.String
  var stage: java.lang.String
  var state: awsDashLambdaLib.awsDashLambdaMod.CodePipelineActionState
  var `type`: Anon_AWS
  var version: scala.Double
}

object Anon_Action {
  @scala.inline
  def apply(
    action: java.lang.String,
    `execution-id`: java.lang.String,
    pipeline: java.lang.String,
    stage: java.lang.String,
    state: awsDashLambdaLib.awsDashLambdaMod.CodePipelineActionState,
    `type`: Anon_AWS,
    version: scala.Double
  ): Anon_Action = {
    val __obj = js.Dynamic.literal(action = action, pipeline = pipeline, stage = stage, state = state, version = version)
    __obj.updateDynamic("execution-id")(`execution-id`)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Action]
  }
}

