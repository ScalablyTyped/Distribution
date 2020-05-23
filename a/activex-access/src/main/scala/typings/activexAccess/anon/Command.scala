package typings.activexAccess.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  val Cancel: js.Any
  val Command: js.Any
}

object Command {
  @scala.inline
  def apply(Cancel: js.Any, Command: js.Any): Command = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Command = Command.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
}

