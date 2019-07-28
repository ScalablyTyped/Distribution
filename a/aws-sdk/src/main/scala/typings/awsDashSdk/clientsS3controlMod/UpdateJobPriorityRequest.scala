package typings.awsDashSdk.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateJobPriorityRequest extends js.Object {
  /**
    * 
    */
  var AccountId: typings.awsDashSdk.clientsS3controlMod.AccountId
  /**
    * The ID for the job whose priority you want to update.
    */
  var JobId: typings.awsDashSdk.clientsS3controlMod.JobId
  /**
    * The priority you want to assign to this job.
    */
  var Priority: JobPriority
}

object UpdateJobPriorityRequest {
  @scala.inline
  def apply(AccountId: AccountId, JobId: JobId, Priority: JobPriority): UpdateJobPriorityRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, JobId = JobId, Priority = Priority)
  
    __obj.asInstanceOf[UpdateJobPriorityRequest]
  }
}

