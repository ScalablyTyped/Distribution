package typings
package activexDashShdocvwLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Command extends js.Object {
  val Command: scala.Double
  val Enable: scala.Boolean
}

object Anon_Command {
  @scala.inline
  def apply(Command: scala.Double, Enable: scala.Boolean): Anon_Command = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Command")(Command)
    __obj.updateDynamic("Enable")(Enable)
    __obj.asInstanceOf[Anon_Command]
  }
}

