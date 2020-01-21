package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaneListItemShiftedEvent extends js.Object {
  /** A number indicating where the item is located. */
  var index: Double
  /** The pane item that was added or removed. */
  var item: js.Object
}

object PaneListItemShiftedEvent {
  @scala.inline
  def apply(index: Double, item: js.Object): PaneListItemShiftedEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PaneListItemShiftedEvent]
  }
}

