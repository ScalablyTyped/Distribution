package typings.atom.anon

import typings.atom.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewRange extends js.Object {
  /** The Range of the inserted text in the current contents of the buffer. */
  var newRange: Range = js.native
  /**
    *  The Range of the deleted text in the contents of the buffer as it existed
    *  before the batch of changes reported by this event.
    */
  var oldRange: Range = js.native
}

object NewRange {
  @scala.inline
  def apply(newRange: Range, oldRange: Range): NewRange = {
    val __obj = js.Dynamic.literal(newRange = newRange.asInstanceOf[js.Any], oldRange = oldRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewRange]
  }
  @scala.inline
  implicit class NewRangeOps[Self <: NewRange] (val x: Self) extends AnyVal {
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
    def setNewRange(value: Range): Self = this.set("newRange", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldRange(value: Range): Self = this.set("oldRange", value.asInstanceOf[js.Any])
  }
  
}

