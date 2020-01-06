package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartContentModerationResponse extends js.Object {
  /**
    * The identifier for the unsafe content analysis job. Use JobId to identify the job in a subsequent call to GetContentModeration.
    */
  var JobId: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.JobId] = js.native
}

object StartContentModerationResponse {
  @scala.inline
  def apply(JobId: JobId = null): StartContentModerationResponse = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartContentModerationResponse]
  }
}

