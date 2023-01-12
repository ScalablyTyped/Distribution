package typings.awsSdk.clientsChimesdkmeetingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAttendeeResponse extends StObject {
  
  /**
    * The attendee information, including attendee ID and join token.
    */
  var Attendee: js.UndefOr[typings.awsSdk.clientsChimesdkmeetingsMod.Attendee] = js.undefined
}
object CreateAttendeeResponse {
  
  inline def apply(): CreateAttendeeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAttendeeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAttendeeResponse] (val x: Self) extends AnyVal {
    
    inline def setAttendee(value: Attendee): Self = StObject.set(x, "Attendee", value.asInstanceOf[js.Any])
    
    inline def setAttendeeUndefined: Self = StObject.set(x, "Attendee", js.undefined)
  }
}
