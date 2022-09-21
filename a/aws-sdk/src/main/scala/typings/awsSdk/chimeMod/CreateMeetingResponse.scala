package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMeetingResponse extends StObject {
  
  /**
    *  The meeting information, including the meeting ID and MediaPlacement . 
    */
  var Meeting: js.UndefOr[typings.awsSdk.chimeMod.Meeting] = js.undefined
}
object CreateMeetingResponse {
  
  inline def apply(): CreateMeetingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMeetingResponse]
  }
  
  extension [Self <: CreateMeetingResponse](x: Self) {
    
    inline def setMeeting(value: Meeting): Self = StObject.set(x, "Meeting", value.asInstanceOf[js.Any])
    
    inline def setMeetingUndefined: Self = StObject.set(x, "Meeting", js.undefined)
  }
}
