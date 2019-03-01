package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NewRange extends js.Object {
  /** The Range of the inserted text in the current contents of the buffer. */
  var newRange: atomLib.atomMod.Range
  /**
    *  The Range of the deleted text in the contents of the buffer as it existed
    *  before the batch of changes reported by this event.
    */
  var oldRange: atomLib.atomMod.Range
}

object Anon_NewRange {
  @scala.inline
  def apply(newRange: atomLib.atomMod.Range, oldRange: atomLib.atomMod.Range): Anon_NewRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newRange")(newRange)
    __obj.updateDynamic("oldRange")(oldRange)
    __obj.asInstanceOf[Anon_NewRange]
  }
}

