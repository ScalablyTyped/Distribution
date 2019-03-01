package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionChangedEvent extends js.Object {
  var newBufferRange: Range
  var newScreenRange: Range
  var oldBufferRange: Range
  var oldScreenRange: Range
  var selection: Selection
}

object SelectionChangedEvent {
  @scala.inline
  def apply(
    newBufferRange: Range,
    newScreenRange: Range,
    oldBufferRange: Range,
    oldScreenRange: Range,
    selection: Selection
  ): SelectionChangedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newBufferRange")(newBufferRange)
    __obj.updateDynamic("newScreenRange")(newScreenRange)
    __obj.updateDynamic("oldBufferRange")(oldBufferRange)
    __obj.updateDynamic("oldScreenRange")(oldScreenRange)
    __obj.updateDynamic("selection")(selection)
    __obj.asInstanceOf[SelectionChangedEvent]
  }
}

