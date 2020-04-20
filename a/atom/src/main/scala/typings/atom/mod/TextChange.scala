package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextChange extends js.Object {
  var newExtent: Point
  var newRange: Range
  var newText: String
  var oldExtent: Point
  var oldRange: Range
  var oldText: String
  var start: Point
}

object TextChange {
  @scala.inline
  def apply(
    newExtent: Point,
    newRange: Range,
    newText: String,
    oldExtent: Point,
    oldRange: Range,
    oldText: String,
    start: Point
  ): TextChange = {
    val __obj = js.Dynamic.literal(newExtent = newExtent.asInstanceOf[js.Any], newRange = newRange.asInstanceOf[js.Any], newText = newText.asInstanceOf[js.Any], oldExtent = oldExtent.asInstanceOf[js.Any], oldRange = oldRange.asInstanceOf[js.Any], oldText = oldText.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextChange]
  }
}

