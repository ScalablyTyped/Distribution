package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartContentModerationResponse extends js.Object {
  /**
    * The identifier for the content moderation analysis job. Use JobId to identify the job in a subsequent call to GetContentModeration.
    */
  var JobId: js.UndefOr[JobId] = js.undefined
}

object StartContentModerationResponse {
  @scala.inline
  def apply(JobId: JobId = null): StartContentModerationResponse = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId)
    __obj.asInstanceOf[StartContentModerationResponse]
  }
}

