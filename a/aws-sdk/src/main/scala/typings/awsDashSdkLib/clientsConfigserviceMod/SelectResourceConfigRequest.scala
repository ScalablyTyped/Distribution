package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectResourceConfigRequest extends js.Object {
  /**
    * The SQL query SELECT command.
    */
  var Expression: awsDashSdkLib.clientsConfigserviceMod.Expression
  /**
    * The maximum number of query results returned on each page. 
    */
  var Limit: js.UndefOr[Limit] = js.undefined
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object SelectResourceConfigRequest {
  @scala.inline
  def apply(Expression: Expression, Limit: js.UndefOr[Limit] = js.undefined, NextToken: NextToken = null): SelectResourceConfigRequest = {
    val __obj = js.Dynamic.literal(Expression = Expression)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[SelectResourceConfigRequest]
  }
}

