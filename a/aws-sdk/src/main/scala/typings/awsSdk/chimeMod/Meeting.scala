package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Meeting extends StObject {
  
  /**
    * The external meeting ID.
    */
  var ExternalMeetingId: js.UndefOr[ExternalMeetingIdType] = js.undefined
  
  /**
    * The media placement for the meeting.
    */
  var MediaPlacement: js.UndefOr[typings.awsSdk.chimeMod.MediaPlacement] = js.undefined
  
  /**
    * The Region in which you create the meeting. Available values: af-south-1, ap-northeast-1, ap-northeast-2, ap-south-1, ap-southeast-1, ap-southeast-2, ca-central-1, eu-central-1, eu-north-1, eu-south-1, eu-west-1, eu-west-2, eu-west-3, sa-east-1, us-east-1, us-east-2, us-west-1, us-west-2.
    */
  var MediaRegion: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Chime SDK meeting ID.
    */
  var MeetingId: js.UndefOr[GuidString] = js.undefined
}
object Meeting {
  
  inline def apply(): Meeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Meeting]
  }
  
  extension [Self <: Meeting](x: Self) {
    
    inline def setExternalMeetingId(value: ExternalMeetingIdType): Self = StObject.set(x, "ExternalMeetingId", value.asInstanceOf[js.Any])
    
    inline def setExternalMeetingIdUndefined: Self = StObject.set(x, "ExternalMeetingId", js.undefined)
    
    inline def setMediaPlacement(value: MediaPlacement): Self = StObject.set(x, "MediaPlacement", value.asInstanceOf[js.Any])
    
    inline def setMediaPlacementUndefined: Self = StObject.set(x, "MediaPlacement", js.undefined)
    
    inline def setMediaRegion(value: String): Self = StObject.set(x, "MediaRegion", value.asInstanceOf[js.Any])
    
    inline def setMediaRegionUndefined: Self = StObject.set(x, "MediaRegion", js.undefined)
    
    inline def setMeetingId(value: GuidString): Self = StObject.set(x, "MeetingId", value.asInstanceOf[js.Any])
    
    inline def setMeetingIdUndefined: Self = StObject.set(x, "MeetingId", js.undefined)
  }
}
