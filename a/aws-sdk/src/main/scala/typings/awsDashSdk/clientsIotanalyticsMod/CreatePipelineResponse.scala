package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePipelineResponse extends js.Object {
  /**
    * The ARN of the pipeline.
    */
  var pipelineArn: js.UndefOr[PipelineArn] = js.native
  /**
    * The name of the pipeline.
    */
  var pipelineName: js.UndefOr[PipelineName] = js.native
}

object CreatePipelineResponse {
  @scala.inline
  def apply(pipelineArn: PipelineArn = null, pipelineName: PipelineName = null): CreatePipelineResponse = {
    val __obj = js.Dynamic.literal()
    if (pipelineArn != null) __obj.updateDynamic("pipelineArn")(pipelineArn.asInstanceOf[js.Any])
    if (pipelineName != null) __obj.updateDynamic("pipelineName")(pipelineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePipelineResponse]
  }
}

