package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEffectivePatchesForPatchBaselineRequest extends js.Object {
  /**
    * The ID of the patch baseline to retrieve the effective patches for.
    */
  var BaselineId: typings.awsDashSdk.clientsSsmMod.BaselineId = js.native
  /**
    * The maximum number of patches to return (per page).
    */
  var MaxResults: js.UndefOr[PatchBaselineMaxResults] = js.native
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.native
}

object DescribeEffectivePatchesForPatchBaselineRequest {
  @scala.inline
  def apply(BaselineId: BaselineId, MaxResults: Int | Double = null, NextToken: NextToken = null): DescribeEffectivePatchesForPatchBaselineRequest = {
    val __obj = js.Dynamic.literal(BaselineId = BaselineId.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEffectivePatchesForPatchBaselineRequest]
  }
}

