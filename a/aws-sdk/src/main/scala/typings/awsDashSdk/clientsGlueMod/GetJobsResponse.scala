package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetJobsResponse extends js.Object {
  /**
    * A list of job definitions.
    */
  var Jobs: js.UndefOr[JobList] = js.undefined
  /**
    * A continuation token, if not all job definitions have yet been returned.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}

object GetJobsResponse {
  @scala.inline
  def apply(Jobs: JobList = null, NextToken: GenericString = null): GetJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (Jobs != null) __obj.updateDynamic("Jobs")(Jobs)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetJobsResponse]
  }
}

