package typings
package atomLib.atomMod

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newExtent")(newExtent)
    __obj.updateDynamic("oldExtent")(oldExtent)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[EditorChangedEvent]
  }
}

