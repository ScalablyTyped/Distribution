package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorChangedEvent extends js.Object {
  /** A Point representing the replacement extent. */
  var newExtent: Point
  /** A Point representing the replaced extent. */
  var oldExtent: Point
  /** A Point representing where the change started. */
  var start: Point
}

object EditorChangedEvent {
  @scala.inline
  def apply(newExtent: Point, oldExtent: Point, start: Point): EditorChangedEvent = {
    val __obj = js.Dynamic.literal(newExtent = newExtent.asInstanceOf[js.Any], oldExtent = oldExtent.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorChangedEvent]
  }
}

