package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCommandsResult extends js.Object {
  /**
    * An array of Command objects that describe each of the specified commands.
    */
  var Commands: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.Commands] = js.native
}

object DescribeCommandsResult {
  @scala.inline
  def apply(Commands: Commands = null): DescribeCommandsResult = {
    val __obj = js.Dynamic.literal()
    if (Commands != null) __obj.updateDynamic("Commands")(Commands.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCommandsResult]
  }
}

