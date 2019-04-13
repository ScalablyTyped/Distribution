package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListQueryLoggingConfigsResponse extends js.Object {
  /**
    * If a response includes the last of the query logging configurations that are associated with the current AWS account, NextToken doesn't appear in the response. If a response doesn't include the last of the configurations, you can get more configurations by submitting another ListQueryLoggingConfigs request. Get the value of NextToken that Amazon Route 53 returned in the previous response and include it in NextToken in the next request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * An array that contains one QueryLoggingConfig element for each configuration for DNS query logging that is associated with the current AWS account.
    */
  var QueryLoggingConfigs: awsDashSdkLib.clientsRoute53Mod.QueryLoggingConfigs
}

object ListQueryLoggingConfigsResponse {
  @scala.inline
  def apply(QueryLoggingConfigs: QueryLoggingConfigs, NextToken: PaginationToken = null): ListQueryLoggingConfigsResponse = {
    val __obj = js.Dynamic.literal(QueryLoggingConfigs = QueryLoggingConfigs)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListQueryLoggingConfigsResponse]
  }
}

