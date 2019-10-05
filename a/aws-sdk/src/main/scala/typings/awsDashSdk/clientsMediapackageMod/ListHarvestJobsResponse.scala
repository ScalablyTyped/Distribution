package typings.awsDashSdk.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListHarvestJobsResponse extends js.Object {
  /**
    * A list of HarvestJob records.
    */
  var HarvestJobs: js.UndefOr[__listOfHarvestJob] = js.undefined
  /**
    * A token that can be used to resume pagination from the end of the collection.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListHarvestJobsResponse {
  @scala.inline
  def apply(HarvestJobs: __listOfHarvestJob = null, NextToken: __string = null): ListHarvestJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (HarvestJobs != null) __obj.updateDynamic("HarvestJobs")(HarvestJobs)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListHarvestJobsResponse]
  }
}

