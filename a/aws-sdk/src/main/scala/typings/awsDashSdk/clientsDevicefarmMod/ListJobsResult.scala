package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListJobsResult extends js.Object {
  /**
    * Information about the jobs.
    */
  var jobs: js.UndefOr[Jobs] = js.undefined
  /**
    * If the number of items that are returned is significantly large, this is an identifier that is also returned, which can be used in a subsequent call to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListJobsResult {
  @scala.inline
  def apply(jobs: Jobs = null, nextToken: PaginationToken = null): ListJobsResult = {
    val __obj = js.Dynamic.literal()
    if (jobs != null) __obj.updateDynamic("jobs")(jobs)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListJobsResult]
  }
}

