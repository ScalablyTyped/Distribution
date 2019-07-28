package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateTargetsWithJobResponse extends js.Object {
  /**
    * A short text description of the job.
    */
  var description: js.UndefOr[JobDescription] = js.undefined
  /**
    * An ARN identifying the job.
    */
  var jobArn: js.UndefOr[JobArn] = js.undefined
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: js.UndefOr[JobId] = js.undefined
}

object AssociateTargetsWithJobResponse {
  @scala.inline
  def apply(description: JobDescription = null, jobArn: JobArn = null, jobId: JobId = null): AssociateTargetsWithJobResponse = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (jobArn != null) __obj.updateDynamic("jobArn")(jobArn)
    if (jobId != null) __obj.updateDynamic("jobId")(jobId)
    __obj.asInstanceOf[AssociateTargetsWithJobResponse]
  }
}

