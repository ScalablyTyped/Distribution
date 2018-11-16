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

