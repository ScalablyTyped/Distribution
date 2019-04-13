package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCommandInvocationsRequest extends js.Object {
  /**
    * (Optional) The invocations for a specific command ID.
    */
  var CommandId: js.UndefOr[CommandId] = js.undefined
  /**
    * (Optional) If set this returns the response of the command executions and any command output. By default this is set to False. 
    */
  var Details: js.UndefOr[Boolean] = js.undefined
  /**
    * (Optional) One or more filters. Use a filter to return a more specific list of results.
    */
  var Filters: js.UndefOr[CommandFilterList] = js.undefined
  /**
    * (Optional) The command execution details for a specific instance ID.
    */
  var InstanceId: js.UndefOr[InstanceId] = js.undefined
  /**
    * (Optional) The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[CommandMaxResults] = js.undefined
  /**
    * (Optional) The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListCommandInvocationsRequest {
  @scala.inline
  def apply(
    CommandId: CommandId = null,
    Details: js.UndefOr[Boolean] = js.undefined,
    Filters: CommandFilterList = null,
    InstanceId: InstanceId = null,
    MaxResults: js.UndefOr[CommandMaxResults] = js.undefined,
    NextToken: NextToken = null
  ): ListCommandInvocationsRequest = {
    val __obj = js.Dynamic.literal()
    if (CommandId != null) __obj.updateDynamic("CommandId")(CommandId)
    if (!js.isUndefined(Details)) __obj.updateDynamic("Details")(Details)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListCommandInvocationsRequest]
  }
}

