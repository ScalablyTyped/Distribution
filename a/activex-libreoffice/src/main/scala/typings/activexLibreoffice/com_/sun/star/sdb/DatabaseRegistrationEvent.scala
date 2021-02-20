package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class DatabaseRegistrationEventMutableBuilder[Self <: DatabaseRegistrationEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewLocation(value: String): Self = StObject.set(x, "NewLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldLocation(value: String): Self = StObject.set(x, "OldLocation", value.asInstanceOf[js.Any])
  }
}
