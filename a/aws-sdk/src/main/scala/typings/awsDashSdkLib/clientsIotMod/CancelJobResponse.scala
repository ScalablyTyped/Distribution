package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelJobResponse extends js.Object {
  /**
    * A short text description of the job.
    */
  var description: js.UndefOr[JobDescription] = js.undefined
  /**
    * The job ARN.
    */
  var jobArn: js.UndefOr[JobArn] = js.undefined
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: js.UndefOr[JobId] = js.undefined
}

object CancelJobResponse {
  @scala.inline
  def apply(description: JobDescription = null, jobArn: JobArn = null, jobId: JobId = null): CancelJobResponse = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (jobArn != null) __obj.updateDynamic("jobArn")(jobArn)
    if (jobId != null) __obj.updateDynamic("jobId")(jobId)
    __obj.asInstanceOf[CancelJobResponse]
  }
}

