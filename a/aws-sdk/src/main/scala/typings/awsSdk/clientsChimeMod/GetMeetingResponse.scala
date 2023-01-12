package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMeetingResponse extends StObject {
  
  /**
    * The Amazon Chime SDK meeting information.
    */
  var Meeting: js.UndefOr[typings.awsSdk.clientsChimeMod.Meeting] = js.undefined
}
object GetMeetingResponse {
  
  inline def apply(): GetMeetingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMeetingResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMeetingResponse] (val x: Self) extends AnyVal {
    
    inline def setMeeting(value: Meeting): Self = StObject.set(x, "Meeting", value.asInstanceOf[js.Any])
    
    inline def setMeetingUndefined: Self = StObject.set(x, "Meeting", js.undefined)
  }
}
