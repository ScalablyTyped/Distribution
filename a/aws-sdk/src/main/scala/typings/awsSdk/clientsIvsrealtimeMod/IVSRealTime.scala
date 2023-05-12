package typings.awsSdk.clientsIvsrealtimeMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVSRealTime extends Service {
  
  @JSName("config")
  var config_IVSRealTime: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an additional token for a specified stage. This can be done after stage creation or when tokens expire. Tokens always are scoped to the stage for which they are created. Encryption keys are owned by Amazon IVS and never used directly by your application.
    */
  def createParticipantToken(): Request[CreateParticipantTokenResponse, AWSError] = js.native
  def createParticipantToken(callback: js.Function2[/* err */ AWSError, /* data */ CreateParticipantTokenResponse, Unit]): Request[CreateParticipantTokenResponse, AWSError] = js.native
  /**
    * Creates an additional token for a specified stage. This can be done after stage creation or when tokens expire. Tokens always are scoped to the stage for which they are created. Encryption keys are owned by Amazon IVS and never used directly by your application.
    */
  def createParticipantToken(params: CreateParticipantTokenRequest): Request[CreateParticipantTokenResponse, AWSError] = js.native
  def createParticipantToken(
    params: CreateParticipantTokenRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateParticipantTokenResponse, Unit]
  ): Request[CreateParticipantTokenResponse, AWSError] = js.native
  
  /**
    * Creates a new stage (and optionally participant tokens).
    */
  def createStage(): Request[CreateStageResponse, AWSError] = js.native
  def createStage(callback: js.Function2[/* err */ AWSError, /* data */ CreateStageResponse, Unit]): Request[CreateStageResponse, AWSError] = js.native
  /**
    * Creates a new stage (and optionally participant tokens).
    */
  def createStage(params: CreateStageRequest): Request[CreateStageResponse, AWSError] = js.native
  def createStage(
    params: CreateStageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateStageResponse, Unit]
  ): Request[CreateStageResponse, AWSError] = js.native
  
  /**
    * Shuts down and deletes the specified stage (disconnecting all participants).
    */
  def deleteStage(): Request[DeleteStageResponse, AWSError] = js.native
  def deleteStage(callback: js.Function2[/* err */ AWSError, /* data */ DeleteStageResponse, Unit]): Request[DeleteStageResponse, AWSError] = js.native
  /**
    * Shuts down and deletes the specified stage (disconnecting all participants).
    */
  def deleteStage(params: DeleteStageRequest): Request[DeleteStageResponse, AWSError] = js.native
  def deleteStage(
    params: DeleteStageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteStageResponse, Unit]
  ): Request[DeleteStageResponse, AWSError] = js.native
  
  /**
    * Disconnects a specified participant and revokes the participant permanently from a specified stage.
    */
  def disconnectParticipant(): Request[DisconnectParticipantResponse, AWSError] = js.native
  def disconnectParticipant(callback: js.Function2[/* err */ AWSError, /* data */ DisconnectParticipantResponse, Unit]): Request[DisconnectParticipantResponse, AWSError] = js.native
  /**
    * Disconnects a specified participant and revokes the participant permanently from a specified stage.
    */
  def disconnectParticipant(params: DisconnectParticipantRequest): Request[DisconnectParticipantResponse, AWSError] = js.native
  def disconnectParticipant(
    params: DisconnectParticipantRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisconnectParticipantResponse, Unit]
  ): Request[DisconnectParticipantResponse, AWSError] = js.native
  
  /**
    * Gets information about the specified participant token.
    */
  def getParticipant(): Request[GetParticipantResponse, AWSError] = js.native
  def getParticipant(callback: js.Function2[/* err */ AWSError, /* data */ GetParticipantResponse, Unit]): Request[GetParticipantResponse, AWSError] = js.native
  /**
    * Gets information about the specified participant token.
    */
  def getParticipant(params: GetParticipantRequest): Request[GetParticipantResponse, AWSError] = js.native
  def getParticipant(
    params: GetParticipantRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetParticipantResponse, Unit]
  ): Request[GetParticipantResponse, AWSError] = js.native
  
  /**
    * Gets information for the specified stage.
    */
  def getStage(): Request[GetStageResponse, AWSError] = js.native
  def getStage(callback: js.Function2[/* err */ AWSError, /* data */ GetStageResponse, Unit]): Request[GetStageResponse, AWSError] = js.native
  /**
    * Gets information for the specified stage.
    */
  def getStage(params: GetStageRequest): Request[GetStageResponse, AWSError] = js.native
  def getStage(
    params: GetStageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStageResponse, Unit]
  ): Request[GetStageResponse, AWSError] = js.native
  
  /**
    * Gets information for the specified stage session.
    */
  def getStageSession(): Request[GetStageSessionResponse, AWSError] = js.native
  def getStageSession(callback: js.Function2[/* err */ AWSError, /* data */ GetStageSessionResponse, Unit]): Request[GetStageSessionResponse, AWSError] = js.native
  /**
    * Gets information for the specified stage session.
    */
  def getStageSession(params: GetStageSessionRequest): Request[GetStageSessionResponse, AWSError] = js.native
  def getStageSession(
    params: GetStageSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStageSessionResponse, Unit]
  ): Request[GetStageSessionResponse, AWSError] = js.native
  
  /**
    * Lists events for a specified participant that occurred during a specified stage session.
    */
  def listParticipantEvents(): Request[ListParticipantEventsResponse, AWSError] = js.native
  def listParticipantEvents(callback: js.Function2[/* err */ AWSError, /* data */ ListParticipantEventsResponse, Unit]): Request[ListParticipantEventsResponse, AWSError] = js.native
  /**
    * Lists events for a specified participant that occurred during a specified stage session.
    */
  def listParticipantEvents(params: ListParticipantEventsRequest): Request[ListParticipantEventsResponse, AWSError] = js.native
  def listParticipantEvents(
    params: ListParticipantEventsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListParticipantEventsResponse, Unit]
  ): Request[ListParticipantEventsResponse, AWSError] = js.native
  
  /**
    * Lists all participants in a specified stage session.
    */
  def listParticipants(): Request[ListParticipantsResponse, AWSError] = js.native
  def listParticipants(callback: js.Function2[/* err */ AWSError, /* data */ ListParticipantsResponse, Unit]): Request[ListParticipantsResponse, AWSError] = js.native
  /**
    * Lists all participants in a specified stage session.
    */
  def listParticipants(params: ListParticipantsRequest): Request[ListParticipantsResponse, AWSError] = js.native
  def listParticipants(
    params: ListParticipantsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListParticipantsResponse, Unit]
  ): Request[ListParticipantsResponse, AWSError] = js.native
  
  /**
    * Gets all sessions for a specified stage.
    */
  def listStageSessions(): Request[ListStageSessionsResponse, AWSError] = js.native
  def listStageSessions(callback: js.Function2[/* err */ AWSError, /* data */ ListStageSessionsResponse, Unit]): Request[ListStageSessionsResponse, AWSError] = js.native
  /**
    * Gets all sessions for a specified stage.
    */
  def listStageSessions(params: ListStageSessionsRequest): Request[ListStageSessionsResponse, AWSError] = js.native
  def listStageSessions(
    params: ListStageSessionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStageSessionsResponse, Unit]
  ): Request[ListStageSessionsResponse, AWSError] = js.native
  
  /**
    * Gets summary information about all stages in your account, in the AWS region where the API request is processed.
    */
  def listStages(): Request[ListStagesResponse, AWSError] = js.native
  def listStages(callback: js.Function2[/* err */ AWSError, /* data */ ListStagesResponse, Unit]): Request[ListStagesResponse, AWSError] = js.native
  /**
    * Gets summary information about all stages in your account, in the AWS region where the API request is processed.
    */
  def listStages(params: ListStagesRequest): Request[ListStagesResponse, AWSError] = js.native
  def listStages(
    params: ListStagesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStagesResponse, Unit]
  ): Request[ListStagesResponse, AWSError] = js.native
  
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
    * Updates a stage’s configuration.
    */
  def updateStage(): Request[UpdateStageResponse, AWSError] = js.native
  def updateStage(callback: js.Function2[/* err */ AWSError, /* data */ UpdateStageResponse, Unit]): Request[UpdateStageResponse, AWSError] = js.native
  /**
    * Updates a stage’s configuration.
    */
  def updateStage(params: UpdateStageRequest): Request[UpdateStageResponse, AWSError] = js.native
  def updateStage(
    params: UpdateStageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateStageResponse, Unit]
  ): Request[UpdateStageResponse, AWSError] = js.native
}
