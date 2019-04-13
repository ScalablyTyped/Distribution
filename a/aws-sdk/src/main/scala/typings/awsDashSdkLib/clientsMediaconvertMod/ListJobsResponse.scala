package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListJobsResponse extends js.Object {
  /**
    * List of jobs
    */
  var Jobs: js.UndefOr[__listOfJob] = js.undefined
  /**
    * Use this string to request the next batch of jobs.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListJobsResponse {
  @scala.inline
  def apply(Jobs: __listOfJob = null, NextToken: __string = null): ListJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (Jobs != null) __obj.updateDynamic("Jobs")(Jobs)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListJobsResponse]
  }
}

