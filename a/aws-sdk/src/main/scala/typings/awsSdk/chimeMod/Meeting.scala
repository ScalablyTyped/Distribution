package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Meeting extends js.Object {
  
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
  implicit class MeetingOps[Self <: Meeting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExternalMeetingId(value: ExternalMeetingIdType): Self = this.set("ExternalMeetingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalMeetingId: Self = this.set("ExternalMeetingId", js.undefined)
    
    @scala.inline
    def setMediaPlacement(value: MediaPlacement): Self = this.set("MediaPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaPlacement: Self = this.set("MediaPlacement", js.undefined)
    
    @scala.inline
    def setMediaRegion(value: String): Self = this.set("MediaRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaRegion: Self = this.set("MediaRegion", js.undefined)
    
    @scala.inline
    def setMeetingId(value: GuidString): Self = this.set("MeetingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeetingId: Self = this.set("MeetingId", js.undefined)
  }
}
