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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cursor")(cursor)
    __obj.updateDynamic("newBufferPosition")(newBufferPosition)
    __obj.updateDynamic("newScreenPosition")(newScreenPosition)
    __obj.updateDynamic("oldBufferPosition")(oldBufferPosition)
    __obj.updateDynamic("oldScreenPosition")(oldScreenPosition)
    __obj.updateDynamic("textChanged")(textChanged)
    __obj.asInstanceOf[CursorPositionChangedEvent]
  }
}

