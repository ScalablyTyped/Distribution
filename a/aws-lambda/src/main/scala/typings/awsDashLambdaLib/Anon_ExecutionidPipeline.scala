package typings
package awsDashLambdaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExecutionidPipeline extends js.Object {
  var `execution-id`: java.lang.String
  var pipeline: java.lang.String
  var stage: java.lang.String
  var state: awsDashLambdaLib.awsDashLambdaMod.CodePipelineStageState
  var version: scala.Double
}

object Anon_ExecutionidPipeline {
  @scala.inline
  def apply(
    `execution-id`: java.lang.String,
    pipeline: java.lang.String,
    stage: java.lang.String,
    state: awsDashLambdaLib.awsDashLambdaMod.CodePipelineStageState,
    version: scala.Double
  ): Anon_ExecutionidPipeline = {
    val __obj = js.Dynamic.literal(`execution-id` = `execution-id`)
    __obj.updateDynamic("pipeline")(pipeline)
    __obj.updateDynamic("stage")(stage)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_ExecutionidPipeline]
  }
}

