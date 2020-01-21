package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecorationPropsChangedEvent extends js.Object {
  /** Object the new parameters the decoration now has */
  var newProperties: DecorationOptions
  /** Object the old parameters the decoration used to have. */
  var oldProperties: DecorationOptions
}

object DecorationPropsChangedEvent {
  @scala.inline
  def apply(newProperties: DecorationOptions, oldProperties: DecorationOptions): DecorationPropsChangedEvent = {
    val __obj = js.Dynamic.literal(newProperties = newProperties.asInstanceOf[js.Any], oldProperties = oldProperties.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DecorationPropsChangedEvent]
  }
}

