package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a change in a database registration
  * @see XDatabaseRegistrations
  * @see XDatabaseRegistrationsListener
  * @since LibreOffice 3.3
  */
trait DatabaseRegistrationEvent extends EventObject {
  var Name: String
  var NewLocation: String
  var OldLocation: String
}

object DatabaseRegistrationEvent {
  @scala.inline
  def apply(Name: String, NewLocation: String, OldLocation: String, Source: XInterface): DatabaseRegistrationEvent = {
    val __obj = js.Dynamic.literal(Name = Name, NewLocation = NewLocation, OldLocation = OldLocation, Source = Source)
  
    __obj.asInstanceOf[DatabaseRegistrationEvent]
  }
}

