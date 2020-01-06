package typings.awsDashSdk.clientsMigrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProgressUpdateStreamsRequest extends js.Object {
  /**
    * Filter to limit the maximum number of results to list per page.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsMigrationhubMod.MaxResults] = js.native
  /**
    * If a NextToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in NextToken.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object ListProgressUpdateStreamsRequest {
  @scala.inline
  def apply(MaxResults: Int | Double = null, NextToken: Token = null): ListProgressUpdateStreamsRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProgressUpdateStreamsRequest]
  }
}

