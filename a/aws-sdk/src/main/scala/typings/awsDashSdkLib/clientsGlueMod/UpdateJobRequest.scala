package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateJobRequest extends js.Object {
  /**
    * The name of the job definition to update.
    */
  var JobName: NameString
  /**
    * Specifies the values with which to update the job definition.
    */
  var JobUpdate: awsDashSdkLib.clientsGlueMod.JobUpdate
}

object UpdateJobRequest {
  @scala.inline
  def apply(JobName: NameString, JobUpdate: JobUpdate): UpdateJobRequest = {
    val __obj = js.Dynamic.literal(JobName = JobName, JobUpdate = JobUpdate)
  
    __obj.asInstanceOf[UpdateJobRequest]
  }
}

