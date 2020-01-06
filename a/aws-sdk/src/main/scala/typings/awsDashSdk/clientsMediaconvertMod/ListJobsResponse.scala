package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJobsResponse extends js.Object {
  /**
    * List of jobs
    */
  var Jobs: js.UndefOr[__listOfJob] = js.native
  /**
    * Use this string to request the next batch of jobs.
    */
  var NextToken: js.UndefOr[__string] = js.native
}

object ListJobsResponse {
  @scala.inline
  def apply(Jobs: __listOfJob = null, NextToken: __string = null): ListJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (Jobs != null) __obj.updateDynamic("Jobs")(Jobs.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsResponse]
  }
}

