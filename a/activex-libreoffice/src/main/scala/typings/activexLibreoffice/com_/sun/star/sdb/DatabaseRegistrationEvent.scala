package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], NewLocation = NewLocation.asInstanceOf[js.Any], OldLocation = OldLocation.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseRegistrationEvent]
  }
}

