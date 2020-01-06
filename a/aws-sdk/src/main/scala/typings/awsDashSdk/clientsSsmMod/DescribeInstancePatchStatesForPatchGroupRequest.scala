package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInstancePatchStatesForPatchGroupRequest extends js.Object {
  /**
    * Each entry in the array is a structure containing: Key (string between 1 and 200 characters)  Values (array containing a single string)  Type (string "Equal", "NotEqual", "LessThan", "GreaterThan")
    */
  var Filters: js.UndefOr[InstancePatchStateFilterList] = js.native
  /**
    * The maximum number of patches to return (per page).
    */
  var MaxResults: js.UndefOr[PatchComplianceMaxResults] = js.native
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.native
  /**
    * The name of the patch group for which the patch state information should be retrieved.
    */
  var PatchGroup: typings.awsDashSdk.clientsSsmMod.PatchGroup = js.native
}

object DescribeInstancePatchStatesForPatchGroupRequest {
  @scala.inline
  def apply(
    PatchGroup: PatchGroup,
    Filters: InstancePatchStateFilterList = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null
  ): DescribeInstancePatchStatesForPatchGroupRequest = {
    val __obj = js.Dynamic.literal(PatchGroup = PatchGroup.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInstancePatchStatesForPatchGroupRequest]
  }
}

