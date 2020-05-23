package typings.atom.anon

import typings.atom.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewRange extends js.Object {
  /** The Range of the inserted text in the current contents of the buffer. */
  var newRange: Range
  /**
    *  The Range of the deleted text in the contents of the buffer as it existed
    *  before the batch of changes reported by this event.
    */
  var oldRange: Range
}

object NewRange {
  @scala.inline
  def apply(newRange: Range, oldRange: Range): NewRange = {
    val __obj = js.Dynamic.literal(newRange = newRange.asInstanceOf[js.Any], oldRange = oldRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewRange]
  }
}

