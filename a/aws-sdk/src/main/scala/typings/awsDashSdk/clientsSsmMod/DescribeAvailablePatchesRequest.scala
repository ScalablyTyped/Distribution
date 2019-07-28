package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAvailablePatchesRequest extends js.Object {
  /**
    * Filters used to scope down the returned patches.
    */
  var Filters: js.UndefOr[PatchOrchestratorFilterList] = js.undefined
  /**
    * The maximum number of patches to return (per page).
    */
  var MaxResults: js.UndefOr[PatchBaselineMaxResults] = js.undefined
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.undefined
}

object DescribeAvailablePatchesRequest {
  @scala.inline
  def apply(
    Filters: PatchOrchestratorFilterList = null,
    MaxResults: js.UndefOr[PatchBaselineMaxResults] = js.undefined,
    NextToken: NextToken = null
  ): DescribeAvailablePatchesRequest = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeAvailablePatchesRequest]
  }
}

