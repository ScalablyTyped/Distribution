package typings.awsDashSdk.clientsDataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobRequest extends js.Object {
  /**
    * The unique identifier for a job.
    */
  var JobId: __string = js.native
}

object GetJobRequest {
  @scala.inline
  def apply(JobId: __string): GetJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetJobRequest]
  }
}

