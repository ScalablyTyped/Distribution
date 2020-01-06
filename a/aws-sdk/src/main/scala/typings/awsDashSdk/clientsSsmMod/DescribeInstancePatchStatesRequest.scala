package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInstancePatchStatesRequest extends js.Object {
  /**
    * The ID of the instance whose patch state information should be retrieved.
    */
  var InstanceIds: InstanceIdList = js.native
  /**
    * The maximum number of instances to return (per page).
    */
  var MaxResults: js.UndefOr[PatchComplianceMaxResults] = js.native
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.native
}

object DescribeInstancePatchStatesRequest {
  @scala.inline
  def apply(InstanceIds: InstanceIdList, MaxResults: Int | Double = null, NextToken: NextToken = null): DescribeInstancePatchStatesRequest = {
    val __obj = js.Dynamic.literal(InstanceIds = InstanceIds.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInstancePatchStatesRequest]
  }
}

