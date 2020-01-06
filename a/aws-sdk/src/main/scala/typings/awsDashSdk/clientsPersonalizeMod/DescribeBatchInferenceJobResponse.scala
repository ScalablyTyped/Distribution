package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBatchInferenceJobResponse extends js.Object {
  /**
    * Information on the specified batch inference job.
    */
  var batchInferenceJob: js.UndefOr[BatchInferenceJob] = js.native
}

object DescribeBatchInferenceJobResponse {
  @scala.inline
  def apply(batchInferenceJob: BatchInferenceJob = null): DescribeBatchInferenceJobResponse = {
    val __obj = js.Dynamic.literal()
    if (batchInferenceJob != null) __obj.updateDynamic("batchInferenceJob")(batchInferenceJob.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBatchInferenceJobResponse]
  }
}

