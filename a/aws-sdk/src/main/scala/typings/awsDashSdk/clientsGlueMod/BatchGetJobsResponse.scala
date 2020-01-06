package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetJobsResponse extends js.Object {
  /**
    * A list of job definitions.
    */
  var Jobs: js.UndefOr[JobList] = js.native
  /**
    * A list of names of jobs not found.
    */
  var JobsNotFound: js.UndefOr[JobNameList] = js.native
}

object BatchGetJobsResponse {
  @scala.inline
  def apply(Jobs: JobList = null, JobsNotFound: JobNameList = null): BatchGetJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (Jobs != null) __obj.updateDynamic("Jobs")(Jobs.asInstanceOf[js.Any])
    if (JobsNotFound != null) __obj.updateDynamic("JobsNotFound")(JobsNotFound.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetJobsResponse]
  }
}

