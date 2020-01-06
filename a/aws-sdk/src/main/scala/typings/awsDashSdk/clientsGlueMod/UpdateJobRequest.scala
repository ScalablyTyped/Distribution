package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateJobRequest extends js.Object {
  /**
    * The name of the job definition to update.
    */
  var JobName: NameString = js.native
  /**
    * Specifies the values with which to update the job definition.
    */
  var JobUpdate: typings.awsDashSdk.clientsGlueMod.JobUpdate = js.native
}

object UpdateJobRequest {
  @scala.inline
  def apply(JobName: NameString, JobUpdate: JobUpdate): UpdateJobRequest = {
    val __obj = js.Dynamic.literal(JobName = JobName.asInstanceOf[js.Any], JobUpdate = JobUpdate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateJobRequest]
  }
}

