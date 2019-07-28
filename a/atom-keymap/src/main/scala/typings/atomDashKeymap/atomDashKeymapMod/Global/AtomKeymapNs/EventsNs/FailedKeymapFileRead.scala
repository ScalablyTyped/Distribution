package typings.atomDashKeymap.atomDashKeymapMod.Global.AtomKeymapNs.EventsNs

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
    val __obj = js.Dynamic.literal(message = message, stack = stack)
  
    __obj.asInstanceOf[FailedKeymapFileRead]
  }
}

