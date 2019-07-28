package typings.awsDashSdk.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePipelineResponse extends js.Object {
  /**
    * The pipeline updated by this UpdatePipelineResponse call.
    */
  var Pipeline: js.UndefOr[typings.awsDashSdk.clientsElastictranscoderMod.Pipeline] = js.undefined
  /**
    * Elastic Transcoder returns a warning if the resources used by your pipeline are not in the same region as the pipeline. Using resources in the same region, such as your Amazon S3 buckets, Amazon SNS notification topics, and AWS KMS key, reduces processing time and prevents cross-regional charges.
    */
  var Warnings: js.UndefOr[typings.awsDashSdk.clientsElastictranscoderMod.Warnings] = js.undefined
}

object UpdatePipelineResponse {
  @scala.inline
  def apply(Pipeline: Pipeline = null, Warnings: Warnings = null): UpdatePipelineResponse = {
    val __obj = js.Dynamic.literal()
    if (Pipeline != null) __obj.updateDynamic("Pipeline")(Pipeline)
    if (Warnings != null) __obj.updateDynamic("Warnings")(Warnings)
    __obj.asInstanceOf[UpdatePipelineResponse]
  }
}

