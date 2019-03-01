package typings
package atomDashKeymapLib.atomDashKeymapMod.Global.AtomKeymapNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailedKeymapFileRead extends js.Object {
  /** The error message. */
  var message: java.lang.String
  /** The error stack trace. */
  var stack: java.lang.String
}

object FailedKeymapFileRead {
  @scala.inline
  def apply(message: java.lang.String, stack: java.lang.String): FailedKeymapFileRead = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[FailedKeymapFileRead]
  }
}

