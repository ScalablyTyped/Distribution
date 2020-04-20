package typings.atom.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleableErrorEvent extends js.Object {
  /** The error object. */
  var error: Error
  /**
    *  Call this function to indicate you have handled the error.
    *  The error will not be thrown if this function is called.
    */
  def handle(): Unit
}

object HandleableErrorEvent {
  @scala.inline
  def apply(error: Error, handle: () => Unit): HandleableErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], handle = js.Any.fromFunction0(handle))
    __obj.asInstanceOf[HandleableErrorEvent]
  }
}

