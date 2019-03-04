package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaneListItemShiftedEvent extends js.Object {
  /** A number indicating where the item is located. */
  var index: scala.Double
  /** The pane item that was added or removed. */
  var item: js.Object
}

object PaneListItemShiftedEvent {
  @scala.inline
  def apply(index: scala.Double, item: js.Object): PaneListItemShiftedEvent = {
    val __obj = js.Dynamic.literal(index = index, item = item)
  
    __obj.asInstanceOf[PaneListItemShiftedEvent]
  }
}

