package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePipelineResponse extends js.Object {
  /**
    * A "Pipeline" object that contains information about the pipeline.
    */
  var pipeline: js.UndefOr[Pipeline] = js.native
}

object DescribePipelineResponse {
  @scala.inline
  def apply(pipeline: Pipeline = null): DescribePipelineResponse = {
    val __obj = js.Dynamic.literal()
    if (pipeline != null) __obj.updateDynamic("pipeline")(pipeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePipelineResponse]
  }
}

