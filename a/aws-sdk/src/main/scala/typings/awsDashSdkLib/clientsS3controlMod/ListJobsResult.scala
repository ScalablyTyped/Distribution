package typings
package awsDashSdkLib.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListJobsResult extends js.Object {
  /**
    * The list of current jobs and jobs that have ended within the last 30 days.
    */
  var Jobs: js.UndefOr[JobListDescriptorList] = js.undefined
  /**
    * If the List Jobs request produced more than the maximum number of results, you can pass this value into a subsequent List Jobs request in order to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
}

object ListJobsResult {
  @scala.inline
  def apply(Jobs: JobListDescriptorList = null, NextToken: NonEmptyMaxLength1024String = null): ListJobsResult = {
    val __obj = js.Dynamic.literal()
    if (Jobs != null) __obj.updateDynamic("Jobs")(Jobs)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListJobsResult]
  }
}

