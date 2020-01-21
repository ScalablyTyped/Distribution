package typings.activexAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommand extends js.Object {
  val Command: js.Any
  val Enabled: js.Any
}

object AnonCommand {
  @scala.inline
  def apply(Command: js.Any, Enabled: js.Any): AnonCommand = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCommand]
  }
}

