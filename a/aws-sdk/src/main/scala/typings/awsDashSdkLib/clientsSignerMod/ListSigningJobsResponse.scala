package typings
package awsDashSdkLib.clientsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSigningJobsResponse extends js.Object {
  /**
    * A list of your signing jobs.
    */
  var jobs: js.UndefOr[SigningJobs] = js.undefined
  /**
    * String for specifying the next set of paginated results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListSigningJobsResponse {
  @scala.inline
  def apply(jobs: SigningJobs = null, nextToken: NextToken = null): ListSigningJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (jobs != null) __obj.updateDynamic("jobs")(jobs)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListSigningJobsResponse]
  }
}

