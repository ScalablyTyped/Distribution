package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePipelineResponse extends js.Object {
  /**
    * A "Pipeline" object that contains information about the pipeline.
    */
  var pipeline: js.UndefOr[Pipeline] = js.undefined
}

object DescribePipelineResponse {
  @scala.inline
  def apply(pipeline: Pipeline = null): DescribePipelineResponse = {
    val __obj = js.Dynamic.literal()
    if (pipeline != null) __obj.updateDynamic("pipeline")(pipeline)
    __obj.asInstanceOf[DescribePipelineResponse]
  }
}

