package typings.atom.mod

import typings.atom.anon.NewRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferChangedEvent extends js.Object {
  /**
    *  An array of objects summarizing the aggregated changes that occurred
    *  during the transaction.
    */
  var changes: js.Array[NewRange] = js.native
  /** Range of the new text. */
  var newRange: Range = js.native
  /** String containing the text that was inserted. */
  var newText: String = js.native
  /** Range of the old text. */
  var oldRange: Range = js.native
  /** String containing the text that was replaced. */
  var oldText: String = js.native
}

object BufferChangedEvent {
  @scala.inline
  def apply(changes: js.Array[NewRange], newRange: Range, newText: String, oldRange: Range, oldText: String): BufferChangedEvent = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], newRange = newRange.asInstanceOf[js.Any], newText = newText.asInstanceOf[js.Any], oldRange = oldRange.asInstanceOf[js.Any], oldText = oldText.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferChangedEvent]
  }
  @scala.inline
  implicit class BufferChangedEventOps[Self <: BufferChangedEvent] (val x: Self) extends AnyVal {
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
    def setChangesVarargs(value: NewRange*): Self = this.set("changes", js.Array(value :_*))
    @scala.inline
    def setChanges(value: js.Array[NewRange]): Self = this.set("changes", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewRange(value: Range): Self = this.set("newRange", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewText(value: String): Self = this.set("newText", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldRange(value: Range): Self = this.set("oldRange", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldText(value: String): Self = this.set("oldText", value.asInstanceOf[js.Any])
  }
  
}

