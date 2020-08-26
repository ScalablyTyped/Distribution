package typings.ace.AceAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorChangeEvent extends js.Object {
  var action: String = js.native
  var end: Position = js.native
   // insert, remove
  var lines: js.Array[_] = js.native
  var start: Position = js.native
}

object EditorChangeEvent {
  @scala.inline
  def apply(action: String, end: Position, lines: js.Array[_], start: Position): EditorChangeEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorChangeEvent]
  }
  @scala.inline
  implicit class EditorChangeEventOps[Self <: EditorChangeEvent] (val x: Self) extends AnyVal {
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: Position): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinesVarargs(value: js.Any*): Self = this.set("lines", js.Array(value :_*))
    @scala.inline
    def setLines(value: js.Array[_]): Self = this.set("lines", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Position): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

