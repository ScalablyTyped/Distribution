package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferChangedEvent extends js.Object {
  /**
    *  An array of objects summarizing the aggregated changes that occurred
    *  during the transaction.
    */
  var changes: js.Array[atomLib.Anon_NewRange]
  /** Range of the new text. */
  var newRange: Range
  /** String containing the text that was inserted. */
  var newText: java.lang.String
  /** Range of the old text. */
  var oldRange: Range
  /** String containing the text that was replaced. */
  var oldText: java.lang.String
}

object BufferChangedEvent {
  @scala.inline
  def apply(
    changes: js.Array[atomLib.Anon_NewRange],
    newRange: Range,
    newText: java.lang.String,
    oldRange: Range,
    oldText: java.lang.String
  ): BufferChangedEvent = {
    val __obj = js.Dynamic.literal(changes = changes, newRange = newRange, newText = newText, oldRange = oldRange, oldText = oldText)
  
    __obj.asInstanceOf[BufferChangedEvent]
  }
}

