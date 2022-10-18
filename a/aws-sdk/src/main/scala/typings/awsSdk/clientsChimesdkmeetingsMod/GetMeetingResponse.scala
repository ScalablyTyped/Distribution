package typings.awsSdk.clientsChimesdkmeetingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMeetingResponse extends StObject {
  
  /**
    * The Amazon Chime SDK meeting information.
    */
  var Meeting: js.UndefOr[typings.awsSdk.clientsChimesdkmeetingsMod.Meeting] = js.undefined
}
object GetMeetingResponse {
  
  inline def apply(): GetMeetingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMeetingResponse]
  }
  
  extension [Self <: GetMeetingResponse](x: Self) {
    
    inline def setMeeting(value: Meeting): Self = StObject.set(x, "Meeting", value.asInstanceOf[js.Any])
    
    inline def setMeetingUndefined: Self = StObject.set(x, "Meeting", js.undefined)
  }
}
