package typings.activexAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommand extends js.Object {
  val Cancel: js.Any
  val Command: js.Any
}

object AnonCommand {
  @scala.inline
  def apply(Cancel: js.Any, Command: js.Any): AnonCommand = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Command = Command.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCommand]
  }
}

