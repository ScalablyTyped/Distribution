package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaneItemMovedEvent extends js.Object {
  /** The removed pane item. */
  var item: js.Object = js.native
  /** A number indicating where the item is now located. */
  var newIndex: Double = js.native
  /** A number indicating where the item was located. */
  var oldIndex: Double = js.native
}

object PaneItemMovedEvent {
  @scala.inline
  def apply(item: js.Object, newIndex: Double, oldIndex: Double): PaneItemMovedEvent = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaneItemMovedEvent]
  }
  @scala.inline
  implicit class PaneItemMovedEventOps[Self <: PaneItemMovedEvent] (val x: Self) extends AnyVal {
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
    def setItem(value: js.Object): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewIndex(value: Double): Self = this.set("newIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldIndex(value: Double): Self = this.set("oldIndex", value.asInstanceOf[js.Any])
  }
  
}

