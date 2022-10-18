package typings.awsSdk.clientsChimesdkmeetingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMeetingRequest extends StObject {
  
  /**
    * The Amazon Chime SDK meeting ID.
    */
  var MeetingId: GuidString
}
object DeleteMeetingRequest {
  
  inline def apply(MeetingId: GuidString): DeleteMeetingRequest = {
    val __obj = js.Dynamic.literal(MeetingId = MeetingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMeetingRequest]
  }
  
  extension [Self <: DeleteMeetingRequest](x: Self) {
    
    inline def setMeetingId(value: GuidString): Self = StObject.set(x, "MeetingId", value.asInstanceOf[js.Any])
  }
}
