package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetExportJobRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string
  /**
    * The unique identifier for the job.
    */
  var JobId: __string
}

object GetExportJobRequest {
  @scala.inline
  def apply(ApplicationId: __string, JobId: __string): GetExportJobRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, JobId = JobId)
  
    __obj.asInstanceOf[GetExportJobRequest]
  }
}

