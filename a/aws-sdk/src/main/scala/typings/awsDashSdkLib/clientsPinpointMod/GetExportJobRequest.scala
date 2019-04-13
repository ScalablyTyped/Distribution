package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetExportJobRequest extends js.Object {
  /**
    * The unique ID of your Amazon Pinpoint application.
    */
  var ApplicationId: __string
  /**
    * The unique ID of the job.
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

