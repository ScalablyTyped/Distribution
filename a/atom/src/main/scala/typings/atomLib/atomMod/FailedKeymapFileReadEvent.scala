package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailedKeymapFileReadEvent extends js.Object {
  /** The error message. */
  var message: java.lang.String
  /** The error stack trace. */
  var stack: java.lang.String
}

object FailedKeymapFileReadEvent {
  @scala.inline
  def apply(message: java.lang.String, stack: java.lang.String): FailedKeymapFileReadEvent = {
    val __obj = js.Dynamic.literal(message = message, stack = stack)
  
    __obj.asInstanceOf[FailedKeymapFileReadEvent]
  }
}

