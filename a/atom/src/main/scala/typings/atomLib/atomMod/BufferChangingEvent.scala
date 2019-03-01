package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferChangingEvent extends js.Object {
  /** Range of the old text. */
  var oldRange: Range
}

object BufferChangingEvent {
  @scala.inline
  def apply(oldRange: Range): BufferChangingEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("oldRange")(oldRange)
    __obj.asInstanceOf[BufferChangingEvent]
  }
}

