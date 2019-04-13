package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectResourceConfigResponse extends js.Object {
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * Returns the QueryInfo object.
    */
  var QueryInfo: js.UndefOr[QueryInfo] = js.undefined
  /**
    * Returns the results for the SQL query.
    */
  var Results: js.UndefOr[Results] = js.undefined
}

object SelectResourceConfigResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, QueryInfo: QueryInfo = null, Results: Results = null): SelectResourceConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (QueryInfo != null) __obj.updateDynamic("QueryInfo")(QueryInfo)
    if (Results != null) __obj.updateDynamic("Results")(Results)
    __obj.asInstanceOf[SelectResourceConfigResponse]
  }
}

