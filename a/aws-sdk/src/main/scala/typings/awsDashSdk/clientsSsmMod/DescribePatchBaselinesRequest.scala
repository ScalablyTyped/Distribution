package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePatchBaselinesRequest extends js.Object {
  /**
    * Each element in the array is a structure containing:  Key: (string, "NAME_PREFIX" or "OWNER") Value: (array of strings, exactly 1 entry, between 1 and 255 characters)
    */
  var Filters: js.UndefOr[PatchOrchestratorFilterList] = js.undefined
  /**
    * The maximum number of patch baselines to return (per page).
    */
  var MaxResults: js.UndefOr[PatchBaselineMaxResults] = js.undefined
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.undefined
}

object DescribePatchBaselinesRequest {
  @scala.inline
  def apply(
    Filters: PatchOrchestratorFilterList = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null
  ): DescribePatchBaselinesRequest = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribePatchBaselinesRequest]
  }
}

