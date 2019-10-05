package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectResourceConfigRequest extends js.Object {
  /**
    * The SQL query SELECT command.
    */
  var Expression: typings.awsDashSdk.clientsConfigserviceMod.Expression
  /**
    * The maximum number of query results returned on each page. 
    */
  var Limit: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.Limit] = js.undefined
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.NextToken] = js.undefined
}

object SelectResourceConfigRequest {
  @scala.inline
  def apply(Expression: Expression, Limit: Int | Double = null, NextToken: NextToken = null): SelectResourceConfigRequest = {
    val __obj = js.Dynamic.literal(Expression = Expression)
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[SelectResourceConfigRequest]
  }
}

