package typings.awsSdk.chimesdkmeetingsMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChimeSDKMeetings extends Service {
  
  /**
    * Creates up to 100 attendees for an active Amazon Chime SDK meeting. For more information about the Amazon Chime SDK, see Using the Amazon Chime SDK in the Amazon Chime Developer Guide.
    */
  def batchCreateAttendee(): Request[BatchCreateAttendeeResponse, AWSError] = js.native
  def batchCreateAttendee(callback: js.Function2[/* err */ AWSError, /* data */ BatchCreateAttendeeResponse, Unit]): Request[BatchCreateAttendeeResponse, AWSError] = js.native
  /**
    * Creates up to 100 attendees for an active Amazon Chime SDK meeting. For more information about the Amazon Chime SDK, see Using the Amazon Chime SDK in the Amazon Chime Developer Guide.
    */
  def batchCreateAttendee(params: BatchCreateAttendeeRequest): Request[BatchCreateAttendeeResponse, AWSError] = js.native
  def batchCreateAttendee(
    params: BatchCreateAttendeeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchCreateAttendeeResponse, Unit]
  ): Request[BatchCreateAttendeeResponse, AWSError] = js.native
  
  /**
    * Updates AttendeeCapabilities except the capabilities listed in an ExcludedAttendeeIds table.  You use the capabilities with a set of values that control what the capabilities can do, such as SendReceive data. For more information about those values, see .  When using capabilities, be aware of these corner cases:   You can't set content capabilities to SendReceive or Receive unless you also set video capabilities to SendReceive or Receive. If you don't set the video capability to receive, the response will contain an HTTP 400 Bad Request status code. However, you can set your video capability to receive and you set your content capability to not receive.   When you change an audio capability from None or Receive to Send or SendReceive , and if the attendee left their microphone unmuted, audio will flow from the attendee to the other meeting participants.   When you change a video or content capability from None or Receive to Send or SendReceive , and if the attendee turned on their video or content streams, remote attendess can receive those streams, but only after media renegotiation between the client and the Amazon Chime back-end server.  
    */
  def batchUpdateAttendeeCapabilitiesExcept(): Request[js.Object, AWSError] = js.native
  def batchUpdateAttendeeCapabilitiesExcept(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates AttendeeCapabilities except the capabilities listed in an ExcludedAttendeeIds table.  You use the capabilities with a set of values that control what the capabilities can do, such as SendReceive data. For more information about those values, see .  When using capabilities, be aware of these corner cases:   You can't set content capabilities to SendReceive or Receive unless you also set video capabilities to SendReceive or Receive. If you don't set the video capability to receive, the response will contain an HTTP 400 Bad Request status code. However, you can set your video capability to receive and you set your content capability to not receive.   When you change an audio capability from None or Receive to Send or SendReceive , and if the attendee left their microphone unmuted, audio will flow from the attendee to the other meeting participants.   When you change a video or content capability from None or Receive to Send or SendReceive , and if the attendee turned on their video or content streams, remote attendess can receive those streams, but only after media renegotiation between the client and the Amazon Chime back-end server.  
    */
  def batchUpdateAttendeeCapabilitiesExcept(params: BatchUpdateAttendeeCapabilitiesExceptRequest): Request[js.Object, AWSError] = js.native
  def batchUpdateAttendeeCapabilitiesExcept(
    params: BatchUpdateAttendeeCapabilitiesExceptRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  @JSName("config")
  var config_ChimeSDKMeetings: ConfigBase & ClientConfiguration = js.native
  
  /**
    *  Creates a new attendee for an active Amazon Chime SDK meeting. For more information about the Amazon Chime SDK, see Using the Amazon Chime SDK in the Amazon Chime Developer Guide. 
    */
  def createAttendee(): Request[CreateAttendeeResponse, AWSError] = js.native
  def createAttendee(callback: js.Function2[/* err */ AWSError, /* data */ CreateAttendeeResponse, Unit]): Request[CreateAttendeeResponse, AWSError] = js.native
  /**
    *  Creates a new attendee for an active Amazon Chime SDK meeting. For more information about the Amazon Chime SDK, see Using the Amazon Chime SDK in the Amazon Chime Developer Guide. 
    */
  def createAttendee(params: CreateAttendeeRequest): Request[CreateAttendeeResponse, AWSError] = js.native
  def createAttendee(
    params: CreateAttendeeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAttendeeResponse, Unit]
  ): Request[CreateAttendeeResponse, AWSError] = js.native
  
  /**
    * Creates a new Amazon Chime SDK meeting in the specified media Region with no initial attendees. For more information about specifying media Regions, see Amazon Chime SDK Media Regions in the Amazon Chime Developer Guide. For more information about the Amazon Chime SDK, see Using the Amazon Chime SDK in the Amazon Chime Developer Guide. 
    */
  def createMeeting(): Request[CreateMeetingResponse, AWSError] = js.native
  def createMeeting(callback: js.Function2[/* err */ AWSError, /* data */ CreateMeetingResponse, Unit]): Request[CreateMeetingResponse, AWSError] = js.native
  /**
    * Creates a new Amazon Chime SDK meeting in the specified media Region with no initial attendees. For more information about specifying media Regions, see Amazon Chime SDK Media Regions in the Amazon Chime Developer Guide. For more information about the Amazon Chime SDK, see Using the Amazon Chime SDK in the Amazon Chime Developer Guide. 
    */
  def createMeeting(params: CreateMeetingRequest): Request[CreateMeetingResponse, AWSError] = js.native
  def createMeeting(
    params: CreateMeetingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMeetingResponse, Unit]
  ): Request[CreateMeetingResponse, AWSError] = js.native
  
  /**
    *  Creates a new Amazon Chime SDK meeting in the specified media Region, with attendees. For more information about specifying media Regions, see Amazon Chime SDK Media Regions in the Amazon Chime Developer Guide. For more information about the Amazon Chime SDK, see Using the Amazon Chime SDK in the Amazon Chime Developer Guide. 
    */
  def createMeetingWithAttendees(): Request[CreateMeetingWithAttendeesResponse, AWSError] = js.native
  def createMeetingWithAttendees(callback: js.Function2[/* err */ AWSError, /* data */ CreateMeetingWithAttendeesResponse, Unit]): Request[CreateMeetingWithAttendeesResponse, AWSError] = js.native
  /**
    *  Creates a new Amazon Chime SDK meeting in the specified media Region, with attendees. For more information about specifying media Regions, see Amazon Chime SDK Media Regions in the Amazon Chime Developer Guide. For more information about the Amazon Chime SDK, see Using the Amazon Chime SDK in the Amazon Chime Developer Guide. 
    */
  def createMeetingWithAttendees(params: CreateMeetingWithAttendeesRequest): Request[CreateMeetingWithAttendeesResponse, AWSError] = js.native
  def createMeetingWithAttendees(
    params: CreateMeetingWithAttendeesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMeetingWithAttendeesResponse, Unit]
  ): Request[CreateMeetingWithAttendeesResponse, AWSError] = js.native
  
  /**
    * Deletes an attendee from the specified Amazon Chime SDK meeting and deletes their JoinToken. Attendees are automatically deleted when a Amazon Chime SDK meeting is deleted. For more information about the Amazon Chime SDK, see Using the Amazon Chime SDK in the Amazon Chime Developer Guide.
    */
  def deleteAttendee(): Request[js.Object, AWSError] = js.native
  def deleteAttendee(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an attendee from the specified Amazon Chime SDK meeting and deletes their JoinToken. Attendees are automatically deleted when a Amazon Chime SDK meeting is deleted. For more information about the Amazon Chime SDK, see Using the Amazon Chime SDK in the Amazon Chime Developer Guide.
    */
  def deleteAttendee(params: DeleteAttendeeRequest): Request[js.Object, AWSError] = js.native
  def deleteAttendee(
    params: DeleteAttendeeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified Amazon Chime SDK meeting. The operation deletes all attendees, disconnects all clients, and prevents new clients from joining the meeting. For more information about the Amazon Chime SDK, see Using the Amazon Chime SDK in the Amazon Chime Developer Guide.
    */
  def deleteMeeting(): Request[js.Object, AWSError] = js.native
  def deleteMeeting(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified Amazon Chime SDK meeting. The operation deletes all attendees, disconnects all clients, and prevents new clients from joining the meeting. For more information about the Amazon Chime SDK, see Using the Amazon Chime SDK in the Amazon Chime Developer Guide.
    */
  def deleteMeeting(params: DeleteMeetingRequest): Request[js.Object, AWSError] = js.native
  def deleteMeeting(
    params: DeleteMeetingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    *  Gets the Amazon Chime SDK attendee details for a specified meeting ID and attendee ID. For more information about the Amazon Chime SDK, see Using the Amazon Chime SDK in the Amazon Chime Developer Guide. 
    */
  def getAttendee(): Request[GetAttendeeResponse, AWSError] = js.native
  def getAttendee(callback: js.Function2[/* err */ AWSError, /* data */ GetAttendeeResponse, Unit]): Request[GetAttendeeResponse, AWSError] = js.native
  /**
    *  Gets the Amazon Chime SDK attendee details for a specified meeting ID and attendee ID. For more information about the Amazon Chime SDK, see Using the Amazon Chime SDK in the Amazon Chime Developer Guide. 
    */
  def getAttendee(params: GetAttendeeRequest): Request[GetAttendeeResponse, AWSError] = js.native
  def getAttendee(
    params: GetAttendeeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAttendeeResponse, Unit]
  ): Request[GetAttendeeResponse, AWSError] = js.native
  
  /**
    * Gets the Amazon Chime SDK meeting details for the specified meeting ID. For more information about the Amazon Chime SDK, see Using the Amazon Chime SDK in the Amazon Chime Developer Guide.
    */
  def getMeeting(): Request[GetMeetingResponse, AWSError] = js.native
  def getMeeting(callback: js.Function2[/* err */ AWSError, /* data */ GetMeetingResponse, Unit]): Request[GetMeetingResponse, AWSError] = js.native
  /**
    * Gets the Amazon Chime SDK meeting details for the specified meeting ID. For more information about the Amazon Chime SDK, see Using the Amazon Chime SDK in the Amazon Chime Developer Guide.
    */
  def getMeeting(params: GetMeetingRequest): Request[GetMeetingResponse, AWSError] = js.native
  def getMeeting(
    params: GetMeetingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMeetingResponse, Unit]
  ): Request[GetMeetingResponse, AWSError] = js.native
  
  /**
    *  Lists the attendees for the specified Amazon Chime SDK meeting. For more information about the Amazon Chime SDK, see Using the Amazon Chime SDK in the Amazon Chime Developer Guide. 
    */
  def listAttendees(): Request[ListAttendeesResponse, AWSError] = js.native
  def listAttendees(callback: js.Function2[/* err */ AWSError, /* data */ ListAttendeesResponse, Unit]): Request[ListAttendeesResponse, AWSError] = js.native
  /**
    *  Lists the attendees for the specified Amazon Chime SDK meeting. For more information about the Amazon Chime SDK, see Using the Amazon Chime SDK in the Amazon Chime Developer Guide. 
    */
  def listAttendees(params: ListAttendeesRequest): Request[ListAttendeesResponse, AWSError] = js.native
  def listAttendees(
    params: ListAttendeesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAttendeesResponse, Unit]
  ): Request[ListAttendeesResponse, AWSError] = js.native
  
  /**
    * Returns a list of the tags available for the specified resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Returns a list of the tags available for the specified resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Starts transcription for the specified meetingId.
    */
  def startMeetingTranscription(): Request[js.Object, AWSError] = js.native
  def startMeetingTranscription(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Starts transcription for the specified meetingId.
    */
  def startMeetingTranscription(params: StartMeetingTranscriptionRequest): Request[js.Object, AWSError] = js.native
  def startMeetingTranscription(
    params: StartMeetingTranscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Stops transcription for the specified meetingId.
    */
  def stopMeetingTranscription(): Request[js.Object, AWSError] = js.native
  def stopMeetingTranscription(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Stops transcription for the specified meetingId.
    */
  def stopMeetingTranscription(params: StopMeetingTranscriptionRequest): Request[js.Object, AWSError] = js.native
  def stopMeetingTranscription(
    params: StopMeetingTranscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * The resource that supports tags.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * The resource that supports tags.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes the specified tags from the specified resources. When you specify a tag key, the action removes both that key and its associated value. The operation succeeds even if you attempt to remove tags from a resource that were already removed. Note the following:   To remove tags from a resource, you need the necessary permissions for the service that the resource belongs to as well as permissions for removing tags. For more information, see the documentation for the service whose resource you want to untag.   You can only tag resources that are located in the specified AWS Region for the calling AWS account.    Minimum permissions  In addition to the tag:UntagResources permission required by this operation, you must also have the remove tags permission defined by the service that created the resource. For example, to remove the tags from an Amazon EC2 instance using the UntagResources operation, you must have both of the following permissions:  tag:UntagResource   ChimeSDKMeetings:DeleteTags 
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes the specified tags from the specified resources. When you specify a tag key, the action removes both that key and its associated value. The operation succeeds even if you attempt to remove tags from a resource that were already removed. Note the following:   To remove tags from a resource, you need the necessary permissions for the service that the resource belongs to as well as permissions for removing tags. For more information, see the documentation for the service whose resource you want to untag.   You can only tag resources that are located in the specified AWS Region for the calling AWS account.    Minimum permissions  In addition to the tag:UntagResources permission required by this operation, you must also have the remove tags permission defined by the service that created the resource. For example, to remove the tags from an Amazon EC2 instance using the UntagResources operation, you must have both of the following permissions:  tag:UntagResource   ChimeSDKMeetings:DeleteTags 
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * The capabilties that you want to update.  You use the capabilities with a set of values that control what the capabilities can do, such as SendReceive data. For more information about those values, see .  When using capabilities, be aware of these corner cases:   You can't set content capabilities to SendReceive or Receive unless you also set video capabilities to SendReceive or Receive. If you don't set the video capability to receive, the response will contain an HTTP 400 Bad Request status code. However, you can set your video capability to receive and you set your content capability to not receive.   When you change an audio capability from None or Receive to Send or SendReceive , and if the attendee left their microphone unmuted, audio will flow from the attendee to the other meeting participants.   When you change a video or content capability from None or Receive to Send or SendReceive , and if the attendee turned on their video or content streams, remote attendess can receive those streams, but only after media renegotiation between the client and the Amazon Chime back-end server.  
    */
  def updateAttendeeCapabilities(): Request[UpdateAttendeeCapabilitiesResponse, AWSError] = js.native
  def updateAttendeeCapabilities(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAttendeeCapabilitiesResponse, Unit]): Request[UpdateAttendeeCapabilitiesResponse, AWSError] = js.native
  /**
    * The capabilties that you want to update.  You use the capabilities with a set of values that control what the capabilities can do, such as SendReceive data. For more information about those values, see .  When using capabilities, be aware of these corner cases:   You can't set content capabilities to SendReceive or Receive unless you also set video capabilities to SendReceive or Receive. If you don't set the video capability to receive, the response will contain an HTTP 400 Bad Request status code. However, you can set your video capability to receive and you set your content capability to not receive.   When you change an audio capability from None or Receive to Send or SendReceive , and if the attendee left their microphone unmuted, audio will flow from the attendee to the other meeting participants.   When you change a video or content capability from None or Receive to Send or SendReceive , and if the attendee turned on their video or content streams, remote attendess can receive those streams, but only after media renegotiation between the client and the Amazon Chime back-end server.  
    */
  def updateAttendeeCapabilities(params: UpdateAttendeeCapabilitiesRequest): Request[UpdateAttendeeCapabilitiesResponse, AWSError] = js.native
  def updateAttendeeCapabilities(
    params: UpdateAttendeeCapabilitiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAttendeeCapabilitiesResponse, Unit]
  ): Request[UpdateAttendeeCapabilitiesResponse, AWSError] = js.native
}
