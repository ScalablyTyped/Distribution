package typings.activexAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnabled extends js.Object {
  val Command: js.Any
  val Enabled: js.Any
}

object AnonEnabled {
  @scala.inline
  def apply(Command: js.Any, Enabled: js.Any): AnonEnabled = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEnabled]
  }
}

