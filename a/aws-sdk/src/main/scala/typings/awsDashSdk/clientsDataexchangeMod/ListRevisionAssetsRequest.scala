package typings.awsDashSdk.clientsDataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRevisionAssetsRequest extends js.Object {
  /**
    * The unique identifier for a data set.
    */
  var DataSetId: __string = js.native
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
  var RevisionId: __string = js.native
}

object ListRevisionAssetsRequest {
  @scala.inline
  def apply(
    DataSetId: __string,
    RevisionId: __string,
    MaxResults: Int | Double = null,
    NextToken: __string = null
  ): ListRevisionAssetsRequest = {
    val __obj = js.Dynamic.literal(DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRevisionAssetsRequest]
  }
}

