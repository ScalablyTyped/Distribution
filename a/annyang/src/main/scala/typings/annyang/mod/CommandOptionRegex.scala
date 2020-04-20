package typings.annyang.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandOptionRegex extends js.Object {
  var regexp: RegExp
  def callback(): Unit
}

object CommandOptionRegex {
  @scala.inline
  def apply(callback: () => Unit, regexp: RegExp): CommandOptionRegex = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), regexp = regexp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandOptionRegex]
  }
}

