package typings.awsLambda

import typings.awsLambda.codepipelineCloudwatchPipelineMod.CodePipelineState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExecutionid extends js.Object {
  var `execution-id`: String
  var pipeline: String
  var state: CodePipelineState
  var version: Double
}

object AnonExecutionid {
  @scala.inline
  def apply(`execution-id`: String, pipeline: String, state: CodePipelineState, version: Double): AnonExecutionid = {
    val __obj = js.Dynamic.literal(pipeline = pipeline.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("execution-id")(`execution-id`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExecutionid]
  }
}

