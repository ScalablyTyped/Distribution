package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAttendeeResponse extends StObject {
  
  /**
    * The attendee information, including attendee ID and join token.
    */
  var Attendee: js.UndefOr[typings.awsSdk.chimeMod.Attendee] = js.native
}
object CreateAttendeeResponse {
  
  @scala.inline
  def apply(): CreateAttendeeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAttendeeResponse]
  }
  
  @scala.inline
  implicit class CreateAttendeeResponseMutableBuilder[Self <: CreateAttendeeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttendee(value: Attendee): Self = StObject.set(x, "Attendee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttendeeUndefined: Self = StObject.set(x, "Attendee", js.undefined)
  }
}
