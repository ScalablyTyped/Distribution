package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchStopJobRunRequest extends js.Object {
  /**
    * The name of the job definition for which to stop job runs.
    */
  var JobName: NameString
  /**
    * A list of the JobRunIds that should be stopped for that job definition.
    */
  var JobRunIds: BatchStopJobRunJobRunIdList
}

object BatchStopJobRunRequest {
  @scala.inline
  def apply(JobName: NameString, JobRunIds: BatchStopJobRunJobRunIdList): BatchStopJobRunRequest = {
    val __obj = js.Dynamic.literal(JobName = JobName, JobRunIds = JobRunIds)
  
    __obj.asInstanceOf[BatchStopJobRunRequest]
  }
}

