package typings.ace.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorChangeEvent extends js.Object {
  var action: String
  var end: Position
   // insert, remove
  var lines: js.Array[_]
  var start: Position
}

object EditorChangeEvent {
  @scala.inline
  def apply(action: String, end: Position, lines: js.Array[_], start: Position): EditorChangeEvent = {
    val __obj = js.Dynamic.literal(action = action, end = end, lines = lines, start = start)
  
    __obj.asInstanceOf[EditorChangeEvent]
  }
}

