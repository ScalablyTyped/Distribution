package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeInstancePatchStatesForPatchGroupRequest extends js.Object {
  /**
    * Each entry in the array is a structure containing: Key (string between 1 and 200 characters)  Values (array containing a single string)  Type (string "Equal", "NotEqual", "LessThan", "GreaterThan")
    */
  var Filters: js.UndefOr[InstancePatchStateFilterList] = js.undefined
  /**
    * The maximum number of patches to return (per page).
    */
  var MaxResults: js.UndefOr[PatchComplianceMaxResults] = js.undefined
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The name of the patch group for which the patch state information should be retrieved.
    */
  var PatchGroup: awsDashSdkLib.clientsSsmMod.PatchGroup
}

object DescribeInstancePatchStatesForPatchGroupRequest {
  @scala.inline
  def apply(
    PatchGroup: PatchGroup,
    Filters: InstancePatchStateFilterList = null,
    MaxResults: js.UndefOr[PatchComplianceMaxResults] = js.undefined,
    NextToken: NextToken = null
  ): DescribeInstancePatchStatesForPatchGroupRequest = {
    val __obj = js.Dynamic.literal(PatchGroup = PatchGroup)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeInstancePatchStatesForPatchGroupRequest]
  }
}

