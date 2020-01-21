package typings.atom.mod

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
    val __obj = js.Dynamic.literal(newBufferRange = newBufferRange.asInstanceOf[js.Any], newScreenRange = newScreenRange.asInstanceOf[js.Any], oldBufferRange = oldBufferRange.asInstanceOf[js.Any], oldScreenRange = oldScreenRange.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SelectionChangedEvent]
  }
}

