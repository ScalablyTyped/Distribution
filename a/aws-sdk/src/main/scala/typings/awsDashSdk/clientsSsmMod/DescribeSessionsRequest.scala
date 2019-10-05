package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSessionsRequest extends js.Object {
  /**
    * One or more filters to limit the type of sessions returned by the request.
    */
  var Filters: js.UndefOr[SessionFilterList] = js.undefined
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[SessionMaxResults] = js.undefined
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.undefined
  /**
    * The session status to retrieve a list of sessions for. For example, "Active".
    */
  var State: SessionState
}

object DescribeSessionsRequest {
  @scala.inline
  def apply(
    State: SessionState,
    Filters: SessionFilterList = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null
  ): DescribeSessionsRequest = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeSessionsRequest]
  }
}

