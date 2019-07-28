package typings.atom.atomMod

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
    val __obj = js.Dynamic.literal(newExtent = newExtent, newRange = newRange, newText = newText, oldExtent = oldExtent, oldRange = oldRange, oldText = oldText, start = start)
  
    __obj.asInstanceOf[TextChange]
  }
}

