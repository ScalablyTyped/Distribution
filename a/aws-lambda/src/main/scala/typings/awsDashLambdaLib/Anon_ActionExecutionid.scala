package typings
package awsDashLambdaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionExecutionid extends js.Object {
  var action: java.lang.String
  var `execution-id`: java.lang.String
  var pipeline: java.lang.String
  var stage: java.lang.String
  var state: awsDashLambdaLib.awsDashLambdaMod.CodePipelineActionState
  var `type`: Anon_AWS
  var version: scala.Double
}

object Anon_ActionExecutionid {
  @scala.inline
  def apply(
    action: java.lang.String,
    `execution-id`: java.lang.String,
    pipeline: java.lang.String,
    stage: java.lang.String,
    state: awsDashLambdaLib.awsDashLambdaMod.CodePipelineActionState,
    `type`: Anon_AWS,
    version: scala.Double
  ): Anon_ActionExecutionid = {
    val __obj = js.Dynamic.literal(`execution-id` = `execution-id`, `type` = `type`)
    __obj.updateDynamic("action")(action)
    __obj.updateDynamic("pipeline")(pipeline)
    __obj.updateDynamic("stage")(stage)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_ActionExecutionid]
  }
}

