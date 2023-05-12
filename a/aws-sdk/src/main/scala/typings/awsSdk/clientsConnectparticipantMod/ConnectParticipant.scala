package typings.awsSdk.clientsConnectparticipantMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectParticipant extends Service {
  
  /**
    * Allows you to confirm that the attachment has been uploaded using the pre-signed URL provided in StartAttachmentUpload API.    ConnectionToken is used for invoking this API instead of ParticipantToken.  The Amazon Connect Participant Service APIs do not use Signature Version 4 authentication.
    */
  def completeAttachmentUpload(): Request[CompleteAttachmentUploadResponse, AWSError] = js.native
  def completeAttachmentUpload(callback: js.Function2[/* err */ AWSError, /* data */ CompleteAttachmentUploadResponse, Unit]): Request[CompleteAttachmentUploadResponse, AWSError] = js.native
  /**
    * Allows you to confirm that the attachment has been uploaded using the pre-signed URL provided in StartAttachmentUpload API.    ConnectionToken is used for invoking this API instead of ParticipantToken.  The Amazon Connect Participant Service APIs do not use Signature Version 4 authentication.
    */
  def completeAttachmentUpload(params: CompleteAttachmentUploadRequest): Request[CompleteAttachmentUploadResponse, AWSError] = js.native
  def completeAttachmentUpload(
    params: CompleteAttachmentUploadRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CompleteAttachmentUploadResponse, Unit]
  ): Request[CompleteAttachmentUploadResponse, AWSError] = js.native
  
  @JSName("config")
  var config_ConnectParticipant: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates the participant's connection.    ParticipantToken is used for invoking this API instead of ConnectionToken.  The participant token is valid for the lifetime of the participant – until they are part of a contact. The response URL for WEBSOCKET Type has a connect expiry timeout of 100s. Clients must manually connect to the returned websocket URL and subscribe to the desired topic.  For chat, you need to publish the following on the established websocket connection:  {"topic":"aws/subscribe","content":{"topics":["aws/chat"]}}  Upon websocket URL expiry, as specified in the response ConnectionExpiry parameter, clients need to call this API again to obtain a new websocket URL and perform the same steps as before.  Message streaming support: This API can also be used together with the StartContactStreaming API to create a participant connection for chat contacts that are not using a websocket. For more information about message streaming, Enable real-time chat message streaming in the Amazon Connect Administrator Guide.  Feature specifications: For information about feature specifications, such as the allowed number of open websocket connections per participant, see Feature specifications in the Amazon Connect Administrator Guide.   The Amazon Connect Participant Service APIs do not use Signature Version 4 authentication. 
    */
  def createParticipantConnection(): Request[CreateParticipantConnectionResponse, AWSError] = js.native
  def createParticipantConnection(callback: js.Function2[/* err */ AWSError, /* data */ CreateParticipantConnectionResponse, Unit]): Request[CreateParticipantConnectionResponse, AWSError] = js.native
  /**
    * Creates the participant's connection.    ParticipantToken is used for invoking this API instead of ConnectionToken.  The participant token is valid for the lifetime of the participant – until they are part of a contact. The response URL for WEBSOCKET Type has a connect expiry timeout of 100s. Clients must manually connect to the returned websocket URL and subscribe to the desired topic.  For chat, you need to publish the following on the established websocket connection:  {"topic":"aws/subscribe","content":{"topics":["aws/chat"]}}  Upon websocket URL expiry, as specified in the response ConnectionExpiry parameter, clients need to call this API again to obtain a new websocket URL and perform the same steps as before.  Message streaming support: This API can also be used together with the StartContactStreaming API to create a participant connection for chat contacts that are not using a websocket. For more information about message streaming, Enable real-time chat message streaming in the Amazon Connect Administrator Guide.  Feature specifications: For information about feature specifications, such as the allowed number of open websocket connections per participant, see Feature specifications in the Amazon Connect Administrator Guide.   The Amazon Connect Participant Service APIs do not use Signature Version 4 authentication. 
    */
  def createParticipantConnection(params: CreateParticipantConnectionRequest): Request[CreateParticipantConnectionResponse, AWSError] = js.native
  def createParticipantConnection(
    params: CreateParticipantConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateParticipantConnectionResponse, Unit]
  ): Request[CreateParticipantConnectionResponse, AWSError] = js.native
  
  /**
    * Disconnects a participant.    ConnectionToken is used for invoking this API instead of ParticipantToken.  The Amazon Connect Participant Service APIs do not use Signature Version 4 authentication.
    */
  def disconnectParticipant(): Request[DisconnectParticipantResponse, AWSError] = js.native
  def disconnectParticipant(callback: js.Function2[/* err */ AWSError, /* data */ DisconnectParticipantResponse, Unit]): Request[DisconnectParticipantResponse, AWSError] = js.native
  /**
    * Disconnects a participant.    ConnectionToken is used for invoking this API instead of ParticipantToken.  The Amazon Connect Participant Service APIs do not use Signature Version 4 authentication.
    */
  def disconnectParticipant(params: DisconnectParticipantRequest): Request[DisconnectParticipantResponse, AWSError] = js.native
  def disconnectParticipant(
    params: DisconnectParticipantRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisconnectParticipantResponse, Unit]
  ): Request[DisconnectParticipantResponse, AWSError] = js.native
  
  /**
    * Provides a pre-signed URL for download of a completed attachment. This is an asynchronous API for use with active contacts.   ConnectionToken is used for invoking this API instead of ParticipantToken.  The Amazon Connect Participant Service APIs do not use Signature Version 4 authentication.
    */
  def getAttachment(): Request[GetAttachmentResponse, AWSError] = js.native
  def getAttachment(callback: js.Function2[/* err */ AWSError, /* data */ GetAttachmentResponse, Unit]): Request[GetAttachmentResponse, AWSError] = js.native
  /**
    * Provides a pre-signed URL for download of a completed attachment. This is an asynchronous API for use with active contacts.   ConnectionToken is used for invoking this API instead of ParticipantToken.  The Amazon Connect Participant Service APIs do not use Signature Version 4 authentication.
    */
  def getAttachment(params: GetAttachmentRequest): Request[GetAttachmentResponse, AWSError] = js.native
  def getAttachment(
    params: GetAttachmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAttachmentResponse, Unit]
  ): Request[GetAttachmentResponse, AWSError] = js.native
  
  /**
    * Retrieves a transcript of the session, including details about any attachments. For information about accessing past chat contact transcripts for a persistent chat, see Enable persistent chat.    ConnectionToken is used for invoking this API instead of ParticipantToken.  The Amazon Connect Participant Service APIs do not use Signature Version 4 authentication.
    */
  def getTranscript(): Request[GetTranscriptResponse, AWSError] = js.native
  def getTranscript(callback: js.Function2[/* err */ AWSError, /* data */ GetTranscriptResponse, Unit]): Request[GetTranscriptResponse, AWSError] = js.native
  /**
    * Retrieves a transcript of the session, including details about any attachments. For information about accessing past chat contact transcripts for a persistent chat, see Enable persistent chat.    ConnectionToken is used for invoking this API instead of ParticipantToken.  The Amazon Connect Participant Service APIs do not use Signature Version 4 authentication.
    */
  def getTranscript(params: GetTranscriptRequest): Request[GetTranscriptResponse, AWSError] = js.native
  def getTranscript(
    params: GetTranscriptRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTranscriptResponse, Unit]
  ): Request[GetTranscriptResponse, AWSError] = js.native
  
  /**
    * Sends an event.    ConnectionToken is used for invoking this API instead of ParticipantToken.  The Amazon Connect Participant Service APIs do not use Signature Version 4 authentication.
    */
  def sendEvent(): Request[SendEventResponse, AWSError] = js.native
  def sendEvent(callback: js.Function2[/* err */ AWSError, /* data */ SendEventResponse, Unit]): Request[SendEventResponse, AWSError] = js.native
  /**
    * Sends an event.    ConnectionToken is used for invoking this API instead of ParticipantToken.  The Amazon Connect Participant Service APIs do not use Signature Version 4 authentication.
    */
  def sendEvent(params: SendEventRequest): Request[SendEventResponse, AWSError] = js.native
  def sendEvent(
    params: SendEventRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendEventResponse, Unit]
  ): Request[SendEventResponse, AWSError] = js.native
  
  /**
    * Sends a message.   ConnectionToken is used for invoking this API instead of ParticipantToken.  The Amazon Connect Participant Service APIs do not use Signature Version 4 authentication.
    */
  def sendMessage(): Request[SendMessageResponse, AWSError] = js.native
  def sendMessage(callback: js.Function2[/* err */ AWSError, /* data */ SendMessageResponse, Unit]): Request[SendMessageResponse, AWSError] = js.native
  /**
    * Sends a message.   ConnectionToken is used for invoking this API instead of ParticipantToken.  The Amazon Connect Participant Service APIs do not use Signature Version 4 authentication.
    */
  def sendMessage(params: SendMessageRequest): Request[SendMessageResponse, AWSError] = js.native
  def sendMessage(
    params: SendMessageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendMessageResponse, Unit]
  ): Request[SendMessageResponse, AWSError] = js.native
  
  /**
    * Provides a pre-signed Amazon S3 URL in response for uploading the file directly to S3.   ConnectionToken is used for invoking this API instead of ParticipantToken.  The Amazon Connect Participant Service APIs do not use Signature Version 4 authentication.
    */
  def startAttachmentUpload(): Request[StartAttachmentUploadResponse, AWSError] = js.native
  def startAttachmentUpload(callback: js.Function2[/* err */ AWSError, /* data */ StartAttachmentUploadResponse, Unit]): Request[StartAttachmentUploadResponse, AWSError] = js.native
  /**
    * Provides a pre-signed Amazon S3 URL in response for uploading the file directly to S3.   ConnectionToken is used for invoking this API instead of ParticipantToken.  The Amazon Connect Participant Service APIs do not use Signature Version 4 authentication.
    */
  def startAttachmentUpload(params: StartAttachmentUploadRequest): Request[StartAttachmentUploadResponse, AWSError] = js.native
  def startAttachmentUpload(
    params: StartAttachmentUploadRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartAttachmentUploadResponse, Unit]
  ): Request[StartAttachmentUploadResponse, AWSError] = js.native
}
