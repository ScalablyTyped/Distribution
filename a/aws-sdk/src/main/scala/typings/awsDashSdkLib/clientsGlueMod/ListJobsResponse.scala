package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListJobsResponse extends js.Object {
  /**
    * The names of all jobs in the account, or the jobs with the specified tags.
    */
  var JobNames: js.UndefOr[JobNameList] = js.undefined
  /**
    * A continuation token, if the returned list does not contain the last metric available.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}

object ListJobsResponse {
  @scala.inline
  def apply(JobNames: JobNameList = null, NextToken: GenericString = null): ListJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (JobNames != null) __obj.updateDynamic("JobNames")(JobNames)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListJobsResponse]
  }
}

