package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaneListItemShiftedEvent extends js.Object {
  /** A number indicating where the item is located. */
  var index: Double = js.native
  /** The pane item that was added or removed. */
  var item: js.Object = js.native
}

object PaneListItemShiftedEvent {
  @scala.inline
  def apply(index: Double, item: js.Object): PaneListItemShiftedEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaneListItemShiftedEvent]
  }
  @scala.inline
  implicit class PaneListItemShiftedEventOps[Self <: PaneListItemShiftedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: js.Object): Self = this.set("item", value.asInstanceOf[js.Any])
  }
  
}

