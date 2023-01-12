package typings.awsSdk.clientsChimesdkmeetingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Meeting extends StObject {
  
  /**
    * The external meeting ID.
    */
  var ExternalMeetingId: js.UndefOr[typings.awsSdk.clientsChimesdkmeetingsMod.ExternalMeetingId] = js.undefined
  
  /**
    * The media placement for the meeting.
    */
  var MediaPlacement: js.UndefOr[typings.awsSdk.clientsChimesdkmeetingsMod.MediaPlacement] = js.undefined
  
  /**
    * The Region in which you create the meeting. Available values: af-south-1, ap-northeast-1, ap-northeast-2, ap-south-1, ap-southeast-1, ap-southeast-2, ca-central-1, eu-central-1, eu-north-1, eu-south-1, eu-west-1, eu-west-2, eu-west-3, sa-east-1, us-east-1, us-east-2, us-west-1, us-west-2. Available values in AWS GovCloud (US) Regions: us-gov-east-1, us-gov-west-1.
    */
  var MediaRegion: js.UndefOr[typings.awsSdk.clientsChimesdkmeetingsMod.MediaRegion] = js.undefined
  
  /**
    * The ARN of the meeting.
    */
  var MeetingArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * The features available to a meeting, such as Amazon Voice Focus.
    */
  var MeetingFeatures: js.UndefOr[MeetingFeaturesConfiguration] = js.undefined
  
  /**
    * Reserved.
    */
  var MeetingHostId: js.UndefOr[ExternalUserId] = js.undefined
  
  /**
    * The Amazon Chime SDK meeting ID.
    */
  var MeetingId: js.UndefOr[GuidString] = js.undefined
  
  /**
    * When specified, replicates the media from the primary meeting to this meeting.
    */
  var PrimaryMeetingId: js.UndefOr[typings.awsSdk.clientsChimesdkmeetingsMod.PrimaryMeetingId] = js.undefined
  
  /**
    * Array of strings.
    */
  var TenantIds: js.UndefOr[TenantIdList] = js.undefined
}
object Meeting {
  
  inline def apply(): Meeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Meeting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Meeting] (val x: Self) extends AnyVal {
    
    inline def setExternalMeetingId(value: ExternalMeetingId): Self = StObject.set(x, "ExternalMeetingId", value.asInstanceOf[js.Any])
    
    inline def setExternalMeetingIdUndefined: Self = StObject.set(x, "ExternalMeetingId", js.undefined)
    
    inline def setMediaPlacement(value: MediaPlacement): Self = StObject.set(x, "MediaPlacement", value.asInstanceOf[js.Any])
    
    inline def setMediaPlacementUndefined: Self = StObject.set(x, "MediaPlacement", js.undefined)
    
    inline def setMediaRegion(value: MediaRegion): Self = StObject.set(x, "MediaRegion", value.asInstanceOf[js.Any])
    
    inline def setMediaRegionUndefined: Self = StObject.set(x, "MediaRegion", js.undefined)
    
    inline def setMeetingArn(value: AmazonResourceName): Self = StObject.set(x, "MeetingArn", value.asInstanceOf[js.Any])
    
    inline def setMeetingArnUndefined: Self = StObject.set(x, "MeetingArn", js.undefined)
    
    inline def setMeetingFeatures(value: MeetingFeaturesConfiguration): Self = StObject.set(x, "MeetingFeatures", value.asInstanceOf[js.Any])
    
    inline def setMeetingFeaturesUndefined: Self = StObject.set(x, "MeetingFeatures", js.undefined)
    
    inline def setMeetingHostId(value: ExternalUserId): Self = StObject.set(x, "MeetingHostId", value.asInstanceOf[js.Any])
    
    inline def setMeetingHostIdUndefined: Self = StObject.set(x, "MeetingHostId", js.undefined)
    
    inline def setMeetingId(value: GuidString): Self = StObject.set(x, "MeetingId", value.asInstanceOf[js.Any])
    
    inline def setMeetingIdUndefined: Self = StObject.set(x, "MeetingId", js.undefined)
    
    inline def setPrimaryMeetingId(value: PrimaryMeetingId): Self = StObject.set(x, "PrimaryMeetingId", value.asInstanceOf[js.Any])
    
    inline def setPrimaryMeetingIdUndefined: Self = StObject.set(x, "PrimaryMeetingId", js.undefined)
    
    inline def setTenantIds(value: TenantIdList): Self = StObject.set(x, "TenantIds", value.asInstanceOf[js.Any])
    
    inline def setTenantIdsUndefined: Self = StObject.set(x, "TenantIds", js.undefined)
    
    inline def setTenantIdsVarargs(value: TenantId*): Self = StObject.set(x, "TenantIds", js.Array(value*))
  }
}
