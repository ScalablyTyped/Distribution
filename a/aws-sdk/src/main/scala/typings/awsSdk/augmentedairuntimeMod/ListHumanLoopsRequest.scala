package typings.awsSdk.augmentedairuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHumanLoopsRequest extends js.Object {
  /**
    * (Optional) The timestamp of the date when you want the human loops to begin in ISO 8601 format. For example, 2020-02-24.
    */
  var CreationTimeAfter: js.UndefOr[Timestamp] = js.native
  /**
    * (Optional) The timestamp of the date before which you want the human loops to begin in ISO 8601 format. For example, 2020-02-24.
    */
  var CreationTimeBefore: js.UndefOr[Timestamp] = js.native
  /**
    * The Amazon Resource Name (ARN) of a flow definition.
    */
  var FlowDefinitionArn: typings.awsSdk.augmentedairuntimeMod.FlowDefinitionArn = js.native
  /**
    * The total number of items to return. If the total number of available items is more than the value specified in MaxResults, then a NextToken is returned in the output. You can use this token to display the next page of results. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.augmentedairuntimeMod.MaxResults] = js.native
  /**
    * A token to display the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.augmentedairuntimeMod.NextToken] = js.native
  /**
    * Optional. The order for displaying results. Valid values: Ascending and Descending.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.augmentedairuntimeMod.SortOrder] = js.native
}

object ListHumanLoopsRequest {
  @scala.inline
  def apply(
    FlowDefinitionArn: FlowDefinitionArn,
    CreationTimeAfter: Timestamp = null,
    CreationTimeBefore: Timestamp = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    SortOrder: SortOrder = null
  ): ListHumanLoopsRequest = {
    val __obj = js.Dynamic.literal(FlowDefinitionArn = FlowDefinitionArn.asInstanceOf[js.Any])
    if (CreationTimeAfter != null) __obj.updateDynamic("CreationTimeAfter")(CreationTimeAfter.asInstanceOf[js.Any])
    if (CreationTimeBefore != null) __obj.updateDynamic("CreationTimeBefore")(CreationTimeBefore.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHumanLoopsRequest]
  }
}

