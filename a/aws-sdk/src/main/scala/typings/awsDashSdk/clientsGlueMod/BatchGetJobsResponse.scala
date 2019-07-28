package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetJobsResponse extends js.Object {
  /**
    * A list of job definitions.
    */
  var Jobs: js.UndefOr[JobList] = js.undefined
  /**
    * A list of names of jobs not found.
    */
  var JobsNotFound: js.UndefOr[JobNameList] = js.undefined
}

object BatchGetJobsResponse {
  @scala.inline
  def apply(Jobs: JobList = null, JobsNotFound: JobNameList = null): BatchGetJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (Jobs != null) __obj.updateDynamic("Jobs")(Jobs)
    if (JobsNotFound != null) __obj.updateDynamic("JobsNotFound")(JobsNotFound)
    __obj.asInstanceOf[BatchGetJobsResponse]
  }
}

