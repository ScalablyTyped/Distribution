package typings.awsDashSdk.clientsDataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJobsRequest extends js.Object {
  /**
    * The unique identifier for a data set.
    */
  var DataSetId: js.UndefOr[__string] = js.native
  /**
    * The maximum number of results returned by a single call.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsDataexchangeMod.MaxResults] = js.native
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var NextToken: js.UndefOr[__string] = js.native
  /**
    * The unique identifier for a revision.
    */
  var RevisionId: js.UndefOr[__string] = js.native
}

object ListJobsRequest {
  @scala.inline
  def apply(
    DataSetId: __string = null,
    MaxResults: Int | Double = null,
    NextToken: __string = null,
    RevisionId: __string = null
  ): ListJobsRequest = {
    val __obj = js.Dynamic.literal()
    if (DataSetId != null) __obj.updateDynamic("DataSetId")(DataSetId.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (RevisionId != null) __obj.updateDynamic("RevisionId")(RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsRequest]
  }
}

