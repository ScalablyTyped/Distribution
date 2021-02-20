package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Meeting extends StObject {
  
  /**
    * The external meeting ID.
    */
  var ExternalMeetingId: js.UndefOr[ExternalMeetingIdType] = js.native
  
  /**
    * The media placement for the meeting.
    */
  var MediaPlacement: js.UndefOr[typings.awsSdk.chimeMod.MediaPlacement] = js.native
  
  /**
    * The Region in which to create the meeting. Available values: af-south-1, ap-northeast-1, ap-northeast-2, ap-south-1, ap-southeast-1, ap-southeast-2, ca-central-1, eu-central-1, eu-north-1, eu-south-1, eu-west-1, eu-west-2, eu-west-3, sa-east-1, us-east-1, us-east-2, us-west-1, us-west-2.
    */
  var MediaRegion: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Chime SDK meeting ID.
    */
  var MeetingId: js.UndefOr[GuidString] = js.native
}
object Meeting {
  
  @scala.inline
  def apply(): Meeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Meeting]
  }
  
  @scala.inline
  implicit class MeetingMutableBuilder[Self <: Meeting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExternalMeetingId(value: ExternalMeetingIdType): Self = StObject.set(x, "ExternalMeetingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalMeetingIdUndefined: Self = StObject.set(x, "ExternalMeetingId", js.undefined)
    
    @scala.inline
    def setMediaPlacement(value: MediaPlacement): Self = StObject.set(x, "MediaPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaPlacementUndefined: Self = StObject.set(x, "MediaPlacement", js.undefined)
    
    @scala.inline
    def setMediaRegion(value: String): Self = StObject.set(x, "MediaRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaRegionUndefined: Self = StObject.set(x, "MediaRegion", js.undefined)
    
    @scala.inline
    def setMeetingId(value: GuidString): Self = StObject.set(x, "MeetingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeetingIdUndefined: Self = StObject.set(x, "MeetingId", js.undefined)
  }
}
