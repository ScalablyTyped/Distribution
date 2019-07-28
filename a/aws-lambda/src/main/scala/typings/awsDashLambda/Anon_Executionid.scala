package typings.awsDashLambda

import typings.awsDashLambda.awsDashLambdaMod.CodePipelineState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Executionid extends js.Object {
  var `execution-id`: String
  var pipeline: String
  var state: CodePipelineState
  var version: Double
}

object Anon_Executionid {
  @scala.inline
  def apply(`execution-id`: String, pipeline: String, state: CodePipelineState, version: Double): Anon_Executionid = {
    val __obj = js.Dynamic.literal(pipeline = pipeline, state = state, version = version)
    __obj.updateDynamic("execution-id")(`execution-id`)
    __obj.asInstanceOf[Anon_Executionid]
  }
}

