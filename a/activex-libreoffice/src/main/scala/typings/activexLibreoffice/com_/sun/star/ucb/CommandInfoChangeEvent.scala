package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event gets delivered whenever a {@link XCommandInfo} is changed.
  *
  * A {@link CommandInfoChangeEvent} object is sent to XCommandInfoChangeListeners.
  */
trait CommandInfoChangeEvent extends EventObject {
  /**
    * contains the implementation handle for the command.
    *
    * May be `-1` if the implementation has no handle.
    */
  var Handle: Double
  /** contains the name of the command. */
  var Name: String
  /**
    * contains the reason for the event.
    *
    * The value can be one of the {@link CommandInfoChange} constants.
    */
  var Reason: Double
}

object CommandInfoChangeEvent {
  @scala.inline
  def apply(Handle: Double, Name: String, Reason: Double, Source: XInterface): CommandInfoChangeEvent = {
    val __obj = js.Dynamic.literal(Handle = Handle.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandInfoChangeEvent]
  }
}

