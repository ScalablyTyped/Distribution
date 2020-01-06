package typings.awsDashSdk.clientsDataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDataSetRevisionsRequest extends js.Object {
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
}

object ListDataSetRevisionsRequest {
  @scala.inline
  def apply(DataSetId: __string, MaxResults: Int | Double = null, NextToken: __string = null): ListDataSetRevisionsRequest = {
    val __obj = js.Dynamic.literal(DataSetId = DataSetId.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDataSetRevisionsRequest]
  }
}

