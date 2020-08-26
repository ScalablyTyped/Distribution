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
@js.native
trait DatabaseRegistrationEvent extends EventObject {
  var Name: String = js.native
  var NewLocation: String = js.native
  var OldLocation: String = js.native
}

object DatabaseRegistrationEvent {
  @scala.inline
  def apply(Name: String, NewLocation: String, OldLocation: String, Source: XInterface): DatabaseRegistrationEvent = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], NewLocation = NewLocation.asInstanceOf[js.Any], OldLocation = OldLocation.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseRegistrationEvent]
  }
  @scala.inline
  implicit class DatabaseRegistrationEventOps[Self <: DatabaseRegistrationEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewLocation(value: String): Self = this.set("NewLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldLocation(value: String): Self = this.set("OldLocation", value.asInstanceOf[js.Any])
  }
  
}

