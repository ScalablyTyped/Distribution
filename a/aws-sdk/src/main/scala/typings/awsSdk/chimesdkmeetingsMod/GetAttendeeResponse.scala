package typings.awsSdk.chimesdkmeetingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAttendeeResponse extends StObject {
  
  /**
    * The Amazon Chime SDK attendee information.
    */
  var Attendee: js.UndefOr[typings.awsSdk.chimesdkmeetingsMod.Attendee] = js.undefined
}
object GetAttendeeResponse {
  
  inline def apply(): GetAttendeeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAttendeeResponse]
  }
  
  extension [Self <: GetAttendeeResponse](x: Self) {
    
    inline def setAttendee(value: Attendee): Self = StObject.set(x, "Attendee", value.asInstanceOf[js.Any])
    
    inline def setAttendeeUndefined: Self = StObject.set(x, "Attendee", js.undefined)
  }
}
