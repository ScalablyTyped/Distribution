package typings.awsDashSdk.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateJobPriorityResult extends js.Object {
  /**
    * The ID for the job whose priority Amazon S3 updated.
    */
  var JobId: typings.awsDashSdk.clientsS3controlMod.JobId
  /**
    * The new priority assigned to the specified job.
    */
  var Priority: JobPriority
}

object UpdateJobPriorityResult {
  @scala.inline
  def apply(JobId: JobId, Priority: JobPriority): UpdateJobPriorityResult = {
    val __obj = js.Dynamic.literal(JobId = JobId, Priority = Priority)
  
    __obj.asInstanceOf[UpdateJobPriorityResult]
  }
}

