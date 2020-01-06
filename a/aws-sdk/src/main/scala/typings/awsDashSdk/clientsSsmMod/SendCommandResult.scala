package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendCommandResult extends js.Object {
  /**
    * The request as it was received by Systems Manager. Also provides the command ID which can be used future references to this request.
    */
  var Command: js.UndefOr[typings.awsDashSdk.clientsSsmMod.Command] = js.native
}

object SendCommandResult {
  @scala.inline
  def apply(Command: Command = null): SendCommandResult = {
    val __obj = js.Dynamic.literal()
    if (Command != null) __obj.updateDynamic("Command")(Command.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendCommandResult]
  }
}

