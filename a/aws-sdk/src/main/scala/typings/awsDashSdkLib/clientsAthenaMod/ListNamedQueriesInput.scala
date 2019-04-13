package typings
package awsDashSdkLib.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListNamedQueriesInput extends js.Object {
  /**
    * The maximum number of queries to return in this request.
    */
  var MaxResults: js.UndefOr[MaxNamedQueriesCount] = js.undefined
  /**
    * The token that specifies where to start pagination if a previous request was truncated.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  /**
    * The name of the workgroup from which the named queries are being returned.
    */
  var WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
}

object ListNamedQueriesInput {
  @scala.inline
  def apply(
    MaxResults: js.UndefOr[MaxNamedQueriesCount] = js.undefined,
    NextToken: Token = null,
    WorkGroup: WorkGroupName = null
  ): ListNamedQueriesInput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (WorkGroup != null) __obj.updateDynamic("WorkGroup")(WorkGroup)
    __obj.asInstanceOf[ListNamedQueriesInput]
  }
}

