package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferStoppedChangingEvent extends js.Object {
  var changes: js.Array[TextChange]
}

object BufferStoppedChangingEvent {
  @scala.inline
  def apply(changes: js.Array[TextChange]): BufferStoppedChangingEvent = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BufferStoppedChangingEvent]
  }
}

