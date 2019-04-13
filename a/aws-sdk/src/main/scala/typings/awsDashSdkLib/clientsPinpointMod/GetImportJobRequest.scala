package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetImportJobRequest extends js.Object {
  /**
    * The unique ID of your Amazon Pinpoint application.
    */
  var ApplicationId: __string
  /**
    * The unique ID of the job.
    */
  var JobId: __string
}

object GetImportJobRequest {
  @scala.inline
  def apply(ApplicationId: __string, JobId: __string): GetImportJobRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, JobId = JobId)
  
    __obj.asInstanceOf[GetImportJobRequest]
  }
}

