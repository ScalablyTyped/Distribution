package typings.awsDashSdk.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHarvestJobsResponse extends js.Object {
  /**
    * A list of HarvestJob records.
    */
  var HarvestJobs: js.UndefOr[__listOfHarvestJob] = js.native
  /**
    * A token that can be used to resume pagination from the end of the collection.
    */
  var NextToken: js.UndefOr[__string] = js.native
}

object ListHarvestJobsResponse {
  @scala.inline
  def apply(HarvestJobs: __listOfHarvestJob = null, NextToken: __string = null): ListHarvestJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (HarvestJobs != null) __obj.updateDynamic("HarvestJobs")(HarvestJobs.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHarvestJobsResponse]
  }
}

