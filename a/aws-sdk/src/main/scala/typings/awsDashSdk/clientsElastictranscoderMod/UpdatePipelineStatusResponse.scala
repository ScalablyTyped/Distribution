package typings.awsDashSdk.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePipelineStatusResponse extends js.Object {
  /**
    * A section of the response body that provides information about the pipeline.
    */
  var Pipeline: js.UndefOr[typings.awsDashSdk.clientsElastictranscoderMod.Pipeline] = js.undefined
}

object UpdatePipelineStatusResponse {
  @scala.inline
  def apply(Pipeline: Pipeline = null): UpdatePipelineStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (Pipeline != null) __obj.updateDynamic("Pipeline")(Pipeline)
    __obj.asInstanceOf[UpdatePipelineStatusResponse]
  }
}

