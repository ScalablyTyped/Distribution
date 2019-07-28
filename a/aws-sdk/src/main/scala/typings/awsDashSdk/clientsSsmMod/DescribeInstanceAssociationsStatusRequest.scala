package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeInstanceAssociationsStatusRequest extends js.Object {
  /**
    * The instance IDs for which you want association status information.
    */
  var InstanceId: typings.awsDashSdk.clientsSsmMod.InstanceId
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsSsmMod.MaxResults] = js.undefined
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.undefined
}

object DescribeInstanceAssociationsStatusRequest {
  @scala.inline
  def apply(
    InstanceId: InstanceId,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null
  ): DescribeInstanceAssociationsStatusRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeInstanceAssociationsStatusRequest]
  }
}

