package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CursorPositionChangedEvent extends js.Object {
  var cursor: Cursor = js.native
  var newBufferPosition: Point = js.native
  var newScreenPosition: Point = js.native
  var oldBufferPosition: Point = js.native
  var oldScreenPosition: Point = js.native
  var textChanged: Boolean = js.native
}

object CursorPositionChangedEvent {
  @scala.inline
  def apply(
    cursor: Cursor,
    newBufferPosition: Point,
    newScreenPosition: Point,
    oldBufferPosition: Point,
    oldScreenPosition: Point,
    textChanged: Boolean
  ): CursorPositionChangedEvent = {
    val __obj = js.Dynamic.literal(cursor = cursor.asInstanceOf[js.Any], newBufferPosition = newBufferPosition.asInstanceOf[js.Any], newScreenPosition = newScreenPosition.asInstanceOf[js.Any], oldBufferPosition = oldBufferPosition.asInstanceOf[js.Any], oldScreenPosition = oldScreenPosition.asInstanceOf[js.Any], textChanged = textChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[CursorPositionChangedEvent]
  }
  @scala.inline
  implicit class CursorPositionChangedEventOps[Self <: CursorPositionChangedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCursor(value: Cursor): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewBufferPosition(value: Point): Self = this.set("newBufferPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewScreenPosition(value: Point): Self = this.set("newScreenPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldBufferPosition(value: Point): Self = this.set("oldBufferPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldScreenPosition(value: Point): Self = this.set("oldScreenPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextChanged(value: Boolean): Self = this.set("textChanged", value.asInstanceOf[js.Any])
  }
  
}

