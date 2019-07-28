package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetJobBookmarksResponse extends js.Object {
  /**
    * A list of job bookmark entries that defines a point that a job can resume processing.
    */
  var JobBookmarkEntries: js.UndefOr[JobBookmarkEntryList] = js.undefined
  /**
    * A continuation token, which has a value of 1 if all the entries are returned, or &gt; 1 if not all requested job runs have been returned.
    */
  var NextToken: js.UndefOr[IntegerValue] = js.undefined
}

object GetJobBookmarksResponse {
  @scala.inline
  def apply(
    JobBookmarkEntries: JobBookmarkEntryList = null,
    NextToken: js.UndefOr[IntegerValue] = js.undefined
  ): GetJobBookmarksResponse = {
    val __obj = js.Dynamic.literal()
    if (JobBookmarkEntries != null) __obj.updateDynamic("JobBookmarkEntries")(JobBookmarkEntries)
    if (!js.isUndefined(NextToken)) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetJobBookmarksResponse]
  }
}

