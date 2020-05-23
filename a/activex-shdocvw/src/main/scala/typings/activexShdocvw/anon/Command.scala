package typings.activexShdocvw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  val Command: Double
  val Enable: Boolean
}

object Command {
  @scala.inline
  def apply(Command: Double, Enable: Boolean): Command = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], Enable = Enable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
}

