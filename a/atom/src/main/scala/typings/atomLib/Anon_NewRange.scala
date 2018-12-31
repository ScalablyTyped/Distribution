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

