package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextChange extends js.Object {
  var newExtent: Point
  var newRange: Range
  var newText: java.lang.String
  var oldExtent: Point
  var oldRange: Range
  var oldText: java.lang.String
  var start: Point
}

object TextChange {
  @scala.inline
  def apply(
    newExtent: Point,
    newRange: Range,
    newText: java.lang.String,
    oldExtent: Point,
    oldRange: Range,
    oldText: java.lang.String,
    start: Point
  ): TextChange = {
    val __obj = js.Dynamic.literal(newExtent = newExtent, newRange = newRange, newText = newText, oldExtent = oldExtent, oldRange = oldRange, oldText = oldText, start = start)
  
    __obj.asInstanceOf[TextChange]
  }
}

