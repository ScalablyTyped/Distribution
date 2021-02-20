package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAttendeeResponse extends StObject {
  
  /**
    * The Amazon Chime SDK attendee information.
    */
  var Attendee: js.UndefOr[typings.awsSdk.chimeMod.Attendee] = js.native
}
object GetAttendeeResponse {
  
  @scala.inline
  def apply(): GetAttendeeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAttendeeResponse]
  }
  
  @scala.inline
  implicit class GetAttendeeResponseMutableBuilder[Self <: GetAttendeeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttendee(value: Attendee): Self = StObject.set(x, "Attendee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttendeeUndefined: Self = StObject.set(x, "Attendee", js.undefined)
  }
}
