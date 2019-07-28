package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeInventoryDeletionsRequest extends js.Object {
  /**
    * Specify the delete inventory ID for which you want information. This ID was returned by the DeleteInventory action.
    */
  var DeletionId: js.UndefOr[InventoryDeletionId] = js.undefined
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsSsmMod.MaxResults] = js.undefined
  /**
    * A token to start the list. Use this token to get the next set of results. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.undefined
}

object DescribeInventoryDeletionsRequest {
  @scala.inline
  def apply(
    DeletionId: InventoryDeletionId = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null
  ): DescribeInventoryDeletionsRequest = {
    val __obj = js.Dynamic.literal()
    if (DeletionId != null) __obj.updateDynamic("DeletionId")(DeletionId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeInventoryDeletionsRequest]
  }
}

