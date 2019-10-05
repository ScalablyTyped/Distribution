package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeInstancePatchesRequest extends js.Object {
  /**
    * An array of structures. Each entry in the array is a structure containing a Key, Value combination. Valid values for Key are Classification | KBId | Severity | State.
    */
  var Filters: js.UndefOr[PatchOrchestratorFilterList] = js.undefined
  /**
    * The ID of the instance whose patch state information should be retrieved.
    */
  var InstanceId: typings.awsDashSdk.clientsSsmMod.InstanceId
  /**
    * The maximum number of patches to return (per page).
    */
  var MaxResults: js.UndefOr[PatchComplianceMaxResults] = js.undefined
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.undefined
}

object DescribeInstancePatchesRequest {
  @scala.inline
  def apply(
    InstanceId: InstanceId,
    Filters: PatchOrchestratorFilterList = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null
  ): DescribeInstancePatchesRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeInstancePatchesRequest]
  }
}

