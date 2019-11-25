package typings.atom.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaneItemMovedEvent extends js.Object {
  /** The removed pane item. */
  var item: js.Object
  /** A number indicating where the item is now located. */
  var newIndex: Double
  /** A number indicating where the item was located. */
  var oldIndex: Double
}

object PaneItemMovedEvent {
  @scala.inline
  def apply(item: js.Object, newIndex: Double, oldIndex: Double): PaneItemMovedEvent = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PaneItemMovedEvent]
  }
}

