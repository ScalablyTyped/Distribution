package typings.awsSdk.clientsChimesdkmeetingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMeetingRequest extends StObject {
  
  /**
    * The Amazon Chime SDK meeting ID.
    */
  var MeetingId: GuidString
}
object GetMeetingRequest {
  
  inline def apply(MeetingId: GuidString): GetMeetingRequest = {
    val __obj = js.Dynamic.literal(MeetingId = MeetingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMeetingRequest]
  }
  
  extension [Self <: GetMeetingRequest](x: Self) {
    
    inline def setMeetingId(value: GuidString): Self = StObject.set(x, "MeetingId", value.asInstanceOf[js.Any])
  }
}
