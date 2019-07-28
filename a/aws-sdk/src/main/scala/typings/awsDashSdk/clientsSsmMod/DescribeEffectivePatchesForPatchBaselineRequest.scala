package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEffectivePatchesForPatchBaselineRequest extends js.Object {
  /**
    * The ID of the patch baseline to retrieve the effective patches for.
    */
  var BaselineId: typings.awsDashSdk.clientsSsmMod.BaselineId
  /**
    * The maximum number of patches to return (per page).
    */
  var MaxResults: js.UndefOr[PatchBaselineMaxResults] = js.undefined
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.undefined
}

object DescribeEffectivePatchesForPatchBaselineRequest {
  @scala.inline
  def apply(
    BaselineId: BaselineId,
    MaxResults: js.UndefOr[PatchBaselineMaxResults] = js.undefined,
    NextToken: NextToken = null
  ): DescribeEffectivePatchesForPatchBaselineRequest = {
    val __obj = js.Dynamic.literal(BaselineId = BaselineId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeEffectivePatchesForPatchBaselineRequest]
  }
}

