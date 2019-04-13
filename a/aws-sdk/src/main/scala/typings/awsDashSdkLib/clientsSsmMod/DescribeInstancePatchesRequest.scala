package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeInstancePatchesRequest extends js.Object {
  /**
    * Each entry in the array is a structure containing: Key (string, between 1 and 128 characters) Values (array of strings, each string between 1 and 256 characters)
    */
  var Filters: js.UndefOr[PatchOrchestratorFilterList] = js.undefined
  /**
    * The ID of the instance whose patch state information should be retrieved.
    */
  var InstanceId: awsDashSdkLib.clientsSsmMod.InstanceId
  /**
    * The maximum number of patches to return (per page).
    */
  var MaxResults: js.UndefOr[PatchComplianceMaxResults] = js.undefined
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeInstancePatchesRequest {
  @scala.inline
  def apply(
    InstanceId: InstanceId,
    Filters: PatchOrchestratorFilterList = null,
    MaxResults: js.UndefOr[PatchComplianceMaxResults] = js.undefined,
    NextToken: NextToken = null
  ): DescribeInstancePatchesRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeInstancePatchesRequest]
  }
}

