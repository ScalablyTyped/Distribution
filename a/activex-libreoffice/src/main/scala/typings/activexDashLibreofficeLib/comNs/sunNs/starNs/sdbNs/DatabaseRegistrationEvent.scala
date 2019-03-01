package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a change in a database registration
  * @see XDatabaseRegistrations
  * @see XDatabaseRegistrationsListener
  * @since LibreOffice 3.3
  */
trait DatabaseRegistrationEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  var Name: java.lang.String
  var NewLocation: java.lang.String
  var OldLocation: java.lang.String
}

object DatabaseRegistrationEvent {
  @scala.inline
  def apply(
    Name: java.lang.String,
    NewLocation: java.lang.String,
    OldLocation: java.lang.String,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  ): DatabaseRegistrationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("NewLocation")(NewLocation)
    __obj.updateDynamic("OldLocation")(OldLocation)
    __obj.updateDynamic("Source")(Source)
    __obj.asInstanceOf[DatabaseRegistrationEvent]
  }
}

