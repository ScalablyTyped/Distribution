package typings.atom.mod

import typings.atom.AnonNewRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferChangedEvent extends js.Object {
  /**
    *  An array of objects summarizing the aggregated changes that occurred
    *  during the transaction.
    */
  var changes: js.Array[AnonNewRange]
  /** Range of the new text. */
  var newRange: Range
  /** String containing the text that was inserted. */
  var newText: String
  /** Range of the old text. */
  var oldRange: Range
  /** String containing the text that was replaced. */
  var oldText: String
}

object BufferChangedEvent {
  @scala.inline
  def apply(
    changes: js.Array[AnonNewRange],
    newRange: Range,
    newText: String,
    oldRange: Range,
    oldText: String
  ): BufferChangedEvent = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], newRange = newRange.asInstanceOf[js.Any], newText = newText.asInstanceOf[js.Any], oldRange = oldRange.asInstanceOf[js.Any], oldText = oldText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BufferChangedEvent]
  }
}

