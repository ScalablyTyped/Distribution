package typings.atom.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailedKeymapFileReadEvent extends js.Object {
  /** The error message. */
  var message: String
  /** The error stack trace. */
  var stack: String
}

object FailedKeymapFileReadEvent {
  @scala.inline
  def apply(message: String, stack: String): FailedKeymapFileReadEvent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FailedKeymapFileReadEvent]
  }
}

