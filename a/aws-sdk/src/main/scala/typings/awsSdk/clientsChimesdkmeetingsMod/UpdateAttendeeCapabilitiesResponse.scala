package typings.awsSdk.clientsChimesdkmeetingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAttendeeCapabilitiesResponse extends StObject {
  
  /**
    * The updated attendee data.
    */
  var Attendee: js.UndefOr[typings.awsSdk.clientsChimesdkmeetingsMod.Attendee] = js.undefined
}
object UpdateAttendeeCapabilitiesResponse {
  
  inline def apply(): UpdateAttendeeCapabilitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAttendeeCapabilitiesResponse]
  }
  
  extension [Self <: UpdateAttendeeCapabilitiesResponse](x: Self) {
    
    inline def setAttendee(value: Attendee): Self = StObject.set(x, "Attendee", value.asInstanceOf[js.Any])
    
    inline def setAttendeeUndefined: Self = StObject.set(x, "Attendee", js.undefined)
  }
}
