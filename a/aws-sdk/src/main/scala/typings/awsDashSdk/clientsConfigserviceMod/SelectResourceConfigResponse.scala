package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectResourceConfigResponse extends js.Object {
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.NextToken] = js.native
  /**
    * Returns the QueryInfo object.
    */
  var QueryInfo: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.QueryInfo] = js.native
  /**
    * Returns the results for the SQL query.
    */
  var Results: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.Results] = js.native
}

object SelectResourceConfigResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, QueryInfo: QueryInfo = null, Results: Results = null): SelectResourceConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (QueryInfo != null) __obj.updateDynamic("QueryInfo")(QueryInfo.asInstanceOf[js.Any])
    if (Results != null) __obj.updateDynamic("Results")(Results.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectResourceConfigResponse]
  }
}

