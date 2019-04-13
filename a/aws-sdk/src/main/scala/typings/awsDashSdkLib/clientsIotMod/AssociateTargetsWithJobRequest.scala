package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateTargetsWithJobRequest extends js.Object {
  /**
    * An optional comment string describing why the job was associated with the targets.
    */
  var comment: js.UndefOr[Comment] = js.undefined
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: JobId
  /**
    * A list of thing group ARNs that define the targets of the job.
    */
  var targets: JobTargets
}

object AssociateTargetsWithJobRequest {
  @scala.inline
  def apply(jobId: JobId, targets: JobTargets, comment: Comment = null): AssociateTargetsWithJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId, targets = targets)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    __obj.asInstanceOf[AssociateTargetsWithJobRequest]
  }
}

