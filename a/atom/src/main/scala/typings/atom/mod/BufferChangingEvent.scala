package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferChangingEvent extends js.Object {
  /** Range of the old text. */
  var oldRange: Range
}

object BufferChangingEvent {
  @scala.inline
  def apply(oldRange: Range): BufferChangingEvent = {
    val __obj = js.Dynamic.literal(oldRange = oldRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferChangingEvent]
  }
}

