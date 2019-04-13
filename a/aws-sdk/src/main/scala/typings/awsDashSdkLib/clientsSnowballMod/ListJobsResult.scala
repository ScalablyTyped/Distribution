package typings
package awsDashSdkLib.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListJobsResult extends js.Object {
  /**
    * Each JobListEntry object contains a job's state, a job's ID, and a value that indicates whether the job is a job part, in the case of export jobs. 
    */
  var JobListEntries: js.UndefOr[JobListEntryList] = js.undefined
  /**
    * HTTP requests are stateless. If you use this automatically generated NextToken value in your next ListJobs call, your returned JobListEntry objects will start from this point in the array.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListJobsResult {
  @scala.inline
  def apply(JobListEntries: JobListEntryList = null, NextToken: String = null): ListJobsResult = {
    val __obj = js.Dynamic.literal()
    if (JobListEntries != null) __obj.updateDynamic("JobListEntries")(JobListEntries)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListJobsResult]
  }
}

