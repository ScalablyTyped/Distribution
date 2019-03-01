package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event gets delivered whenever a {@link XCommandInfo} is changed.
  *
  * A {@link CommandInfoChangeEvent} object is sent to XCommandInfoChangeListeners.
  */
trait CommandInfoChangeEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /**
    * contains the implementation handle for the command.
    *
    * May be `-1` if the implementation has no handle.
    */
  var Handle: scala.Double
  /** contains the name of the command. */
  var Name: java.lang.String
  /**
    * contains the reason for the event.
    *
    * The value can be one of the {@link CommandInfoChange} constants.
    */
  var Reason: scala.Double
}

object CommandInfoChangeEvent {
  @scala.inline
  def apply(
    Handle: scala.Double,
    Name: java.lang.String,
    Reason: scala.Double,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  ): CommandInfoChangeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Handle")(Handle)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Reason")(Reason)
    __obj.updateDynamic("Source")(Source)
    __obj.asInstanceOf[CommandInfoChangeEvent]
  }
}

