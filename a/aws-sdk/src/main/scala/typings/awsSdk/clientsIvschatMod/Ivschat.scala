package typings.awsSdk.clientsIvschatMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ivschat extends Service {
  
  @JSName("config")
  var config_Ivschat: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an encrypted token that is used to establish an individual WebSocket connection to a room. The token is valid for one minute, and a connection (session) established with the token is valid for the specified duration. Encryption keys are owned by Amazon IVS Chat and never used directly by your application.
    */
  def createChatToken(): Request[CreateChatTokenResponse, AWSError] = js.native
  def createChatToken(callback: js.Function2[/* err */ AWSError, /* data */ CreateChatTokenResponse, Unit]): Request[CreateChatTokenResponse, AWSError] = js.native
  /**
    * Creates an encrypted token that is used to establish an individual WebSocket connection to a room. The token is valid for one minute, and a connection (session) established with the token is valid for the specified duration. Encryption keys are owned by Amazon IVS Chat and never used directly by your application.
    */
  def createChatToken(params: CreateChatTokenRequest): Request[CreateChatTokenResponse, AWSError] = js.native
  def createChatToken(
    params: CreateChatTokenRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateChatTokenResponse, Unit]
  ): Request[CreateChatTokenResponse, AWSError] = js.native
  
  /**
    * Creates a room that allows clients to connect and pass messages.
    */
  def createRoom(): Request[CreateRoomResponse, AWSError] = js.native
  def createRoom(callback: js.Function2[/* err */ AWSError, /* data */ CreateRoomResponse, Unit]): Request[CreateRoomResponse, AWSError] = js.native
  /**
    * Creates a room that allows clients to connect and pass messages.
    */
  def createRoom(params: CreateRoomRequest): Request[CreateRoomResponse, AWSError] = js.native
  def createRoom(
    params: CreateRoomRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRoomResponse, Unit]
  ): Request[CreateRoomResponse, AWSError] = js.native
  
  /**
    * Sends an event to a specific room which directs clients to delete a specific message; that is, unrender it from view and delete it from the client’s chat history. This event’s EventName is aws:DELETE_MESSAGE. This replicates the  DeleteMessage WebSocket operation in the Amazon IVS Chat Messaging API.
    */
  def deleteMessage(): Request[DeleteMessageResponse, AWSError] = js.native
  def deleteMessage(callback: js.Function2[/* err */ AWSError, /* data */ DeleteMessageResponse, Unit]): Request[DeleteMessageResponse, AWSError] = js.native
  /**
    * Sends an event to a specific room which directs clients to delete a specific message; that is, unrender it from view and delete it from the client’s chat history. This event’s EventName is aws:DELETE_MESSAGE. This replicates the  DeleteMessage WebSocket operation in the Amazon IVS Chat Messaging API.
    */
  def deleteMessage(params: DeleteMessageRequest): Request[DeleteMessageResponse, AWSError] = js.native
  def deleteMessage(
    params: DeleteMessageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteMessageResponse, Unit]
  ): Request[DeleteMessageResponse, AWSError] = js.native
  
  /**
    * Deletes the specified room.
    */
  def deleteRoom(): Request[js.Object, AWSError] = js.native
  def deleteRoom(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified room.
    */
  def deleteRoom(params: DeleteRoomRequest): Request[js.Object, AWSError] = js.native
  def deleteRoom(params: DeleteRoomRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Disconnects all connections using a specified user ID from a room. This replicates the  DisconnectUser WebSocket operation in the Amazon IVS Chat Messaging API.
    */
  def disconnectUser(): Request[DisconnectUserResponse, AWSError] = js.native
  def disconnectUser(callback: js.Function2[/* err */ AWSError, /* data */ DisconnectUserResponse, Unit]): Request[DisconnectUserResponse, AWSError] = js.native
  /**
    * Disconnects all connections using a specified user ID from a room. This replicates the  DisconnectUser WebSocket operation in the Amazon IVS Chat Messaging API.
    */
  def disconnectUser(params: DisconnectUserRequest): Request[DisconnectUserResponse, AWSError] = js.native
  def disconnectUser(
    params: DisconnectUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisconnectUserResponse, Unit]
  ): Request[DisconnectUserResponse, AWSError] = js.native
  
  /**
    * Gets the specified room.
    */
  def getRoom(): Request[GetRoomResponse, AWSError] = js.native
  def getRoom(callback: js.Function2[/* err */ AWSError, /* data */ GetRoomResponse, Unit]): Request[GetRoomResponse, AWSError] = js.native
  /**
    * Gets the specified room.
    */
  def getRoom(params: GetRoomRequest): Request[GetRoomResponse, AWSError] = js.native
  def getRoom(
    params: GetRoomRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRoomResponse, Unit]
  ): Request[GetRoomResponse, AWSError] = js.native
  
  /**
    * Gets summary information about all your rooms in the AWS region where the API request is processed. Results are sorted in descending order of updateTime.
    */
  def listRooms(): Request[ListRoomsResponse, AWSError] = js.native
  def listRooms(callback: js.Function2[/* err */ AWSError, /* data */ ListRoomsResponse, Unit]): Request[ListRoomsResponse, AWSError] = js.native
  /**
    * Gets summary information about all your rooms in the AWS region where the API request is processed. Results are sorted in descending order of updateTime.
    */
  def listRooms(params: ListRoomsRequest): Request[ListRoomsResponse, AWSError] = js.native
  def listRooms(
    params: ListRoomsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRoomsResponse, Unit]
  ): Request[ListRoomsResponse, AWSError] = js.native
  
  /**
    * Gets information about AWS tags for the specified ARN.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Gets information about AWS tags for the specified ARN.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Sends an event to a room. Use this within your application’s business logic to send events to clients of a room; e.g., to notify clients to change the way the chat UI is rendered.
    */
  def sendEvent(): Request[SendEventResponse, AWSError] = js.native
  def sendEvent(callback: js.Function2[/* err */ AWSError, /* data */ SendEventResponse, Unit]): Request[SendEventResponse, AWSError] = js.native
  /**
    * Sends an event to a room. Use this within your application’s business logic to send events to clients of a room; e.g., to notify clients to change the way the chat UI is rendered.
    */
  def sendEvent(params: SendEventRequest): Request[SendEventResponse, AWSError] = js.native
  def sendEvent(
    params: SendEventRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendEventResponse, Unit]
  ): Request[SendEventResponse, AWSError] = js.native
  
  /**
    * Adds or updates tags for the AWS resource with the specified ARN.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds or updates tags for the AWS resource with the specified ARN.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes tags from the resource with the specified ARN.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes tags from the resource with the specified ARN.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates a room’s configuration.
    */
  def updateRoom(): Request[UpdateRoomResponse, AWSError] = js.native
  def updateRoom(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRoomResponse, Unit]): Request[UpdateRoomResponse, AWSError] = js.native
  /**
    * Updates a room’s configuration.
    */
  def updateRoom(params: UpdateRoomRequest): Request[UpdateRoomResponse, AWSError] = js.native
  def updateRoom(
    params: UpdateRoomRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRoomResponse, Unit]
  ): Request[UpdateRoomResponse, AWSError] = js.native
}
