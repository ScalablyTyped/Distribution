package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaneItemMovedEvent extends js.Object {
  /** The removed pane item. */
  var item: js.Object
  /** A number indicating where the item is now located. */
  var newIndex: scala.Double
  /** A number indicating where the item was located. */
  var oldIndex: scala.Double
}

object PaneItemMovedEvent {
  @scala.inline
  def apply(item: js.Object, newIndex: scala.Double, oldIndex: scala.Double): PaneItemMovedEvent = {
    val __obj = js.Dynamic.literal(item = item, newIndex = newIndex, oldIndex = oldIndex)
  
    __obj.asInstanceOf[PaneItemMovedEvent]
  }
}

