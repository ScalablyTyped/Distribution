package typings
package awsDashLambdaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Executionid extends js.Object {
  var `execution-id`: java.lang.String
  var pipeline: java.lang.String
  var state: awsDashLambdaLib.awsDashLambdaMod.CodePipelineState
  var version: scala.Double
}

object Anon_Executionid {
  @scala.inline
  def apply(
    `execution-id`: java.lang.String,
    pipeline: java.lang.String,
    state: awsDashLambdaLib.awsDashLambdaMod.CodePipelineState,
    version: scala.Double
  ): Anon_Executionid = {
    val __obj = js.Dynamic.literal(pipeline = pipeline, state = state, version = version)
    __obj.updateDynamic("execution-id")(`execution-id`)
    __obj.asInstanceOf[Anon_Executionid]
  }
}

