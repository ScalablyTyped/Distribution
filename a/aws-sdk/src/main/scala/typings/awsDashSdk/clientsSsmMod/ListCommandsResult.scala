package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCommandsResult extends js.Object {
  /**
    * (Optional) The list of commands requested by the user. 
    */
  var Commands: js.UndefOr[CommandList] = js.undefined
  /**
    * (Optional) The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.undefined
}

object ListCommandsResult {
  @scala.inline
  def apply(Commands: CommandList = null, NextToken: NextToken = null): ListCommandsResult = {
    val __obj = js.Dynamic.literal()
    if (Commands != null) __obj.updateDynamic("Commands")(Commands)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListCommandsResult]
  }
}

