package typings.awsSdk.chimesdkmeetingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMeetingRequest extends StObject {
  
  /**
    * The unique identifier for the client request. Use a different token for different meetings.
    */
  var ClientRequestToken: typings.awsSdk.chimesdkmeetingsMod.ClientRequestToken
  
  /**
    * The external meeting ID.
    */
  var ExternalMeetingId: typings.awsSdk.chimesdkmeetingsMod.ExternalMeetingId
  
  /**
    * The Region in which to create the meeting.  Available values: af-south-1, ap-northeast-1, ap-northeast-2, ap-south-1, ap-southeast-1, ap-southeast-2, ca-central-1, eu-central-1, eu-north-1, eu-south-1, eu-west-1, eu-west-2, eu-west-3, sa-east-1, us-east-1, us-east-2, us-west-1, us-west-2.  Available values in AWS GovCloud (US) Regions: us-gov-east-1, us-gov-west-1.
    */
  var MediaRegion: typings.awsSdk.chimesdkmeetingsMod.MediaRegion
  
  /**
    * Lists the audio and video features enabled for a meeting, such as echo reduction.
    */
  var MeetingFeatures: js.UndefOr[MeetingFeaturesConfiguration] = js.undefined
  
  /**
    * Reserved.
    */
  var MeetingHostId: js.UndefOr[ExternalUserId] = js.undefined
  
  /**
    * The configuration for resource targets to receive notifications when meeting and attendee events occur.
    */
  var NotificationsConfiguration: js.UndefOr[typings.awsSdk.chimesdkmeetingsMod.NotificationsConfiguration] = js.undefined
  
  /**
    * When specified, replicates the media from the primary meeting to the new meeting.
    */
  var PrimaryMeetingId: js.UndefOr[typings.awsSdk.chimesdkmeetingsMod.PrimaryMeetingId] = js.undefined
  
  /**
    * Applies one or more tags to an Amazon Chime SDK meeting. Note the following:   Not all resources have tags. For a list of services with resources that support tagging using this operation, see Services that support the Resource Groups Tagging API. If the resource doesn't yet support this operation, the resource's service might support tagging using its own API operations. For more information, refer to the documentation for that service.   Each resource can have up to 50 tags. For other limits, see Tag Naming and Usage Conventions in the AWS General Reference.   You can only tag resources that are located in the specified AWS Region for the AWS account.   To add tags to a resource, you need the necessary permissions for the service that the resource belongs to as well as permissions for adding tags. For more information, see the documentation for each service.    Do not store personally identifiable information (PII) or other confidential or sensitive information in tags. We use tags to provide you with billing and administration services. Tags are not intended to be used for private or sensitive data.   Minimum permissions   In addition to the tag:TagResources permission required by this operation, you must also have the tagging permission defined by the service that created the resource. For example, to tag a ChimeSDKMeetings instance using the TagResources operation, you must have both of the following permissions:  tag:TagResources   ChimeSDKMeetings:CreateTags   Some services might have specific requirements for tagging some resources. For example, to tag an Amazon S3 bucket, you must also have the s3:GetBucketTagging permission. If the expected minimum permissions don't work, check the documentation for that service's tagging APIs for more information. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * A consistent and opaque identifier, created and maintained by the builder to represent a segment of their users.
    */
  var TenantIds: js.UndefOr[TenantIdList] = js.undefined
}
object CreateMeetingRequest {
  
  inline def apply(
    ClientRequestToken: ClientRequestToken,
    ExternalMeetingId: ExternalMeetingId,
    MediaRegion: MediaRegion
  ): CreateMeetingRequest = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], ExternalMeetingId = ExternalMeetingId.asInstanceOf[js.Any], MediaRegion = MediaRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMeetingRequest]
  }
  
  extension [Self <: CreateMeetingRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setExternalMeetingId(value: ExternalMeetingId): Self = StObject.set(x, "ExternalMeetingId", value.asInstanceOf[js.Any])
    
    inline def setMediaRegion(value: MediaRegion): Self = StObject.set(x, "MediaRegion", value.asInstanceOf[js.Any])
    
    inline def setMeetingFeatures(value: MeetingFeaturesConfiguration): Self = StObject.set(x, "MeetingFeatures", value.asInstanceOf[js.Any])
    
    inline def setMeetingFeaturesUndefined: Self = StObject.set(x, "MeetingFeatures", js.undefined)
    
    inline def setMeetingHostId(value: ExternalUserId): Self = StObject.set(x, "MeetingHostId", value.asInstanceOf[js.Any])
    
    inline def setMeetingHostIdUndefined: Self = StObject.set(x, "MeetingHostId", js.undefined)
    
    inline def setNotificationsConfiguration(value: NotificationsConfiguration): Self = StObject.set(x, "NotificationsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNotificationsConfigurationUndefined: Self = StObject.set(x, "NotificationsConfiguration", js.undefined)
    
    inline def setPrimaryMeetingId(value: PrimaryMeetingId): Self = StObject.set(x, "PrimaryMeetingId", value.asInstanceOf[js.Any])
    
    inline def setPrimaryMeetingIdUndefined: Self = StObject.set(x, "PrimaryMeetingId", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTenantIds(value: TenantIdList): Self = StObject.set(x, "TenantIds", value.asInstanceOf[js.Any])
    
    inline def setTenantIdsUndefined: Self = StObject.set(x, "TenantIds", js.undefined)
    
    inline def setTenantIdsVarargs(value: TenantId*): Self = StObject.set(x, "TenantIds", js.Array(value*))
  }
}
