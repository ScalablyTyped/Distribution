package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInventoryDeletionsRequest extends js.Object {
  /**
    * Specify the delete inventory ID for which you want information. This ID was returned by the DeleteInventory action.
    */
  var DeletionId: js.UndefOr[InventoryDeletionId] = js.native
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsSsmMod.MaxResults] = js.native
  /**
    * A token to start the list. Use this token to get the next set of results. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.native
}

object DescribeInventoryDeletionsRequest {
  @scala.inline
  def apply(
    DeletionId: InventoryDeletionId = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null
  ): DescribeInventoryDeletionsRequest = {
    val __obj = js.Dynamic.literal()
    if (DeletionId != null) __obj.updateDynamic("DeletionId")(DeletionId.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInventoryDeletionsRequest]
  }
}

