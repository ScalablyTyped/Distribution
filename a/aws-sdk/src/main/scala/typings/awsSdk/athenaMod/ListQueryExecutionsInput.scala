package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListQueryExecutionsInput extends js.Object {
  /**
    * The maximum number of query executions to return in this request.
    */
  var MaxResults: js.UndefOr[MaxQueryExecutionsCount] = js.native
  /**
    * The token that specifies where to start pagination if a previous request was truncated.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * The name of the workgroup from which queries are returned. If a workgroup is not specified, a list of available query execution IDs for the queries in the primary workgroup is returned.
    */
  var WorkGroup: js.UndefOr[WorkGroupName] = js.native
}

object ListQueryExecutionsInput {
  @scala.inline
  def apply(
    MaxResults: js.UndefOr[MaxQueryExecutionsCount] = js.undefined,
    NextToken: Token = null,
    WorkGroup: WorkGroupName = null
  ): ListQueryExecutionsInput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (WorkGroup != null) __obj.updateDynamic("WorkGroup")(WorkGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListQueryExecutionsInput]
  }
}

