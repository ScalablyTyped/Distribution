package typings.atomDashKeymap.atomDashKeymapMod._Global_.AtomKeymap.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailedKeymapFileRead extends js.Object {
  /** The error message. */
  var message: String
  /** The error stack trace. */
  var stack: String
}

object FailedKeymapFileRead {
  @scala.inline
  def apply(message: String, stack: String): FailedKeymapFileRead = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FailedKeymapFileRead]
  }
}

