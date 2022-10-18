package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedVideoStreams extends StObject {
  
  /**
    * The attendee IDs of the streams selected for a media pipeline. 
    */
  var AttendeeIds: js.UndefOr[AttendeeIdList] = js.undefined
  
  /**
    * The external user IDs of the streams selected for a media pipeline.
    */
  var ExternalUserIds: js.UndefOr[ExternalUserIdList] = js.undefined
}
object SelectedVideoStreams {
  
  inline def apply(): SelectedVideoStreams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedVideoStreams]
  }
  
  extension [Self <: SelectedVideoStreams](x: Self) {
    
    inline def setAttendeeIds(value: AttendeeIdList): Self = StObject.set(x, "AttendeeIds", value.asInstanceOf[js.Any])
    
    inline def setAttendeeIdsUndefined: Self = StObject.set(x, "AttendeeIds", js.undefined)
    
    inline def setAttendeeIdsVarargs(value: GuidString*): Self = StObject.set(x, "AttendeeIds", js.Array(value*))
    
    inline def setExternalUserIds(value: ExternalUserIdList): Self = StObject.set(x, "ExternalUserIds", value.asInstanceOf[js.Any])
    
    inline def setExternalUserIdsUndefined: Self = StObject.set(x, "ExternalUserIds", js.undefined)
    
    inline def setExternalUserIdsVarargs(value: ExternalUserIdType*): Self = StObject.set(x, "ExternalUserIds", js.Array(value*))
  }
}
