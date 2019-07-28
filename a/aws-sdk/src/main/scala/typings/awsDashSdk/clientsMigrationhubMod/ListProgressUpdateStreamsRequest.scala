package typings.awsDashSdk.clientsMigrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProgressUpdateStreamsRequest extends js.Object {
  /**
    * Filter to limit the maximum number of results to list per page.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsMigrationhubMod.MaxResults] = js.undefined
  /**
    * If a NextToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in NextToken.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}

object ListProgressUpdateStreamsRequest {
  @scala.inline
  def apply(MaxResults: js.UndefOr[MaxResults] = js.undefined, NextToken: Token = null): ListProgressUpdateStreamsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListProgressUpdateStreamsRequest]
  }
}

