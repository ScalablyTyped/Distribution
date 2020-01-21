package typings.awsSdk.augmentedairuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHumanLoopsRequest extends js.Object {
  /**
    * (Optional) The timestamp of the date when you want the human loops to begin. For example, 1551000000.
    */
  var CreationTimeAfter: js.UndefOr[Timestamp] = js.native
  /**
    * (Optional) The timestamp of the date before which you want the human loops to begin. For example, 1550000000.
    */
  var CreationTimeBefore: js.UndefOr[Timestamp] = js.native
  /**
    * The total number of items to return. If the total number of available items is more than the value specified in MaxResults, then a NextToken will be provided in the output that you can use to resume pagination.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.augmentedairuntimeMod.MaxResults] = js.native
  /**
    * A token to resume pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.augmentedairuntimeMod.NextToken] = js.native
  /**
    * An optional value that specifies whether you want the results sorted in Ascending or Descending order.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.augmentedairuntimeMod.SortOrder] = js.native
}

object ListHumanLoopsRequest {
  @scala.inline
  def apply(
    CreationTimeAfter: Timestamp = null,
    CreationTimeBefore: Timestamp = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    SortOrder: SortOrder = null
  ): ListHumanLoopsRequest = {
    val __obj = js.Dynamic.literal()
    if (CreationTimeAfter != null) __obj.updateDynamic("CreationTimeAfter")(CreationTimeAfter.asInstanceOf[js.Any])
    if (CreationTimeBefore != null) __obj.updateDynamic("CreationTimeBefore")(CreationTimeBefore.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHumanLoopsRequest]
  }
}

