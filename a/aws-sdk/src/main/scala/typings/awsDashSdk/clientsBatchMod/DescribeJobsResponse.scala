package typings.awsDashSdk.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeJobsResponse extends js.Object {
  /**
    * The list of jobs. 
    */
  var jobs: js.UndefOr[JobDetailList] = js.undefined
}

object DescribeJobsResponse {
  @scala.inline
  def apply(jobs: JobDetailList = null): DescribeJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (jobs != null) __obj.updateDynamic("jobs")(jobs)
    __obj.asInstanceOf[DescribeJobsResponse]
  }
}

