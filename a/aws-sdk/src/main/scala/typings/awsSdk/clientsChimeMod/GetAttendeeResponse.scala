package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAttendeeResponse extends StObject {
  
  /**
    * The Amazon Chime SDK attendee information.
    */
  var Attendee: js.UndefOr[typings.awsSdk.clientsChimeMod.Attendee] = js.undefined
}
object GetAttendeeResponse {
  
  inline def apply(): GetAttendeeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAttendeeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAttendeeResponse] (val x: Self) extends AnyVal {
    
    inline def setAttendee(value: Attendee): Self = StObject.set(x, "Attendee", value.asInstanceOf[js.Any])
    
    inline def setAttendeeUndefined: Self = StObject.set(x, "Attendee", js.undefined)
  }
}
