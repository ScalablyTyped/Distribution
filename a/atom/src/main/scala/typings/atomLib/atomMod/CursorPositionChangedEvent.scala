package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CursorPositionChangedEvent extends js.Object {
  var cursor: Cursor
  var newBufferPosition: Point
  var newScreenPosition: Point
  var oldBufferPosition: Point
  var oldScreenPosition: Point
  var textChanged: scala.Boolean
}

object CursorPositionChangedEvent {
  @scala.inline
  def apply(
    cursor: Cursor,
    newBufferPosition: Point,
    newScreenPosition: Point,
    oldBufferPosition: Point,
    oldScreenPosition: Point,
    textChanged: scala.Boolean
  ): CursorPositionChangedEvent = {
    val __obj = js.Dynamic.literal(cursor = cursor, newBufferPosition = newBufferPosition, newScreenPosition = newScreenPosition, oldBufferPosition = oldBufferPosition, oldScreenPosition = oldScreenPosition, textChanged = textChanged)
  
    __obj.asInstanceOf[CursorPositionChangedEvent]
  }
}

