package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCommandsRequest extends js.Object {
  /**
    * (Optional) If provided, lists only the specified command.
    */
  var CommandId: js.UndefOr[typings.awsDashSdk.clientsSsmMod.CommandId] = js.undefined
  /**
    * (Optional) One or more filters. Use a filter to return a more specific list of results. 
    */
  var Filters: js.UndefOr[CommandFilterList] = js.undefined
  /**
    * (Optional) Lists commands issued against this instance ID.
    */
  var InstanceId: js.UndefOr[typings.awsDashSdk.clientsSsmMod.InstanceId] = js.undefined
  /**
    * (Optional) The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[CommandMaxResults] = js.undefined
  /**
    * (Optional) The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.undefined
}

object ListCommandsRequest {
  @scala.inline
  def apply(
    CommandId: CommandId = null,
    Filters: CommandFilterList = null,
    InstanceId: InstanceId = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null
  ): ListCommandsRequest = {
    val __obj = js.Dynamic.literal()
    if (CommandId != null) __obj.updateDynamic("CommandId")(CommandId)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListCommandsRequest]
  }
}

