package typings.awsSdk.clientsNimbleMod

import typings.awsSdk.anon.GetLaunchProfileRequestwa
import typings.awsSdk.anon.GetStreamingImageRequestw
import typings.awsSdk.anon.GetStreamingSessionReques
import typings.awsSdk.anon.GetStreamingSessionStream
import typings.awsSdk.anon.GetStudioRequestwaiterWai
import typings.awsSdk.awsSdkStrings.launchProfileDeleted
import typings.awsSdk.awsSdkStrings.launchProfileReady
import typings.awsSdk.awsSdkStrings.streamingImageDeleted
import typings.awsSdk.awsSdkStrings.streamingImageReady
import typings.awsSdk.awsSdkStrings.streamingSessionDeleted
import typings.awsSdk.awsSdkStrings.streamingSessionReady
import typings.awsSdk.awsSdkStrings.streamingSessionStopped
import typings.awsSdk.awsSdkStrings.streamingSessionStreamReady
import typings.awsSdk.awsSdkStrings.studioComponentDeleted
import typings.awsSdk.awsSdkStrings.studioComponentReady
import typings.awsSdk.awsSdkStrings.studioDeleted
import typings.awsSdk.awsSdkStrings.studioReady
import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Nimble extends Service {
  
  /**
    * Accept EULAs.
    */
  def acceptEulas(): Request[AcceptEulasResponse, AWSError] = js.native
  def acceptEulas(callback: js.Function2[/* err */ AWSError, /* data */ AcceptEulasResponse, Unit]): Request[AcceptEulasResponse, AWSError] = js.native
  /**
    * Accept EULAs.
    */
  def acceptEulas(params: AcceptEulasRequest): Request[AcceptEulasResponse, AWSError] = js.native
  def acceptEulas(
    params: AcceptEulasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AcceptEulasResponse, Unit]
  ): Request[AcceptEulasResponse, AWSError] = js.native
  
  @JSName("config")
  var config_Nimble: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Create a launch profile.
    */
  def createLaunchProfile(): Request[CreateLaunchProfileResponse, AWSError] = js.native
  def createLaunchProfile(callback: js.Function2[/* err */ AWSError, /* data */ CreateLaunchProfileResponse, Unit]): Request[CreateLaunchProfileResponse, AWSError] = js.native
  /**
    * Create a launch profile.
    */
  def createLaunchProfile(params: CreateLaunchProfileRequest): Request[CreateLaunchProfileResponse, AWSError] = js.native
  def createLaunchProfile(
    params: CreateLaunchProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLaunchProfileResponse, Unit]
  ): Request[CreateLaunchProfileResponse, AWSError] = js.native
  
  /**
    * Creates a streaming image resource in a studio.
    */
  def createStreamingImage(): Request[CreateStreamingImageResponse, AWSError] = js.native
  def createStreamingImage(callback: js.Function2[/* err */ AWSError, /* data */ CreateStreamingImageResponse, Unit]): Request[CreateStreamingImageResponse, AWSError] = js.native
  /**
    * Creates a streaming image resource in a studio.
    */
  def createStreamingImage(params: CreateStreamingImageRequest): Request[CreateStreamingImageResponse, AWSError] = js.native
  def createStreamingImage(
    params: CreateStreamingImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateStreamingImageResponse, Unit]
  ): Request[CreateStreamingImageResponse, AWSError] = js.native
  
  /**
    * Creates a streaming session in a studio. After invoking this operation, you must poll GetStreamingSession until the streaming session is in the READY state.
    */
  def createStreamingSession(): Request[CreateStreamingSessionResponse, AWSError] = js.native
  def createStreamingSession(callback: js.Function2[/* err */ AWSError, /* data */ CreateStreamingSessionResponse, Unit]): Request[CreateStreamingSessionResponse, AWSError] = js.native
  /**
    * Creates a streaming session in a studio. After invoking this operation, you must poll GetStreamingSession until the streaming session is in the READY state.
    */
  def createStreamingSession(params: CreateStreamingSessionRequest): Request[CreateStreamingSessionResponse, AWSError] = js.native
  def createStreamingSession(
    params: CreateStreamingSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateStreamingSessionResponse, Unit]
  ): Request[CreateStreamingSessionResponse, AWSError] = js.native
  
  /**
    * Creates a streaming session stream for a streaming session. After invoking this API, invoke GetStreamingSessionStream with the returned streamId to poll the resource until it is in the READY state.
    */
  def createStreamingSessionStream(): Request[CreateStreamingSessionStreamResponse, AWSError] = js.native
  def createStreamingSessionStream(callback: js.Function2[/* err */ AWSError, /* data */ CreateStreamingSessionStreamResponse, Unit]): Request[CreateStreamingSessionStreamResponse, AWSError] = js.native
  /**
    * Creates a streaming session stream for a streaming session. After invoking this API, invoke GetStreamingSessionStream with the returned streamId to poll the resource until it is in the READY state.
    */
  def createStreamingSessionStream(params: CreateStreamingSessionStreamRequest): Request[CreateStreamingSessionStreamResponse, AWSError] = js.native
  def createStreamingSessionStream(
    params: CreateStreamingSessionStreamRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateStreamingSessionStreamResponse, Unit]
  ): Request[CreateStreamingSessionStreamResponse, AWSError] = js.native
  
  /**
    * Create a new studio. When creating a studio, two IAM roles must be provided: the admin role and the user role. These roles are assumed by your users when they log in to the Nimble Studio portal. The user role must have the AmazonNimbleStudio-StudioUser managed policy attached for the portal to function properly. The admin role must have the AmazonNimbleStudio-StudioAdmin managed policy attached for the portal to function properly. You may optionally specify a KMS key in the StudioEncryptionConfiguration. In Nimble Studio, resource names, descriptions, initialization scripts, and other data you provide are always encrypted at rest using an KMS key. By default, this key is owned by Amazon Web Services and managed on your behalf. You may provide your own KMS key when calling CreateStudio to encrypt this data using a key you own and manage. When providing an KMS key during studio creation, Nimble Studio creates KMS grants in your account to provide your studio user and admin roles access to these KMS keys. If you delete this grant, the studio will no longer be accessible to your portal users. If you delete the studio KMS key, your studio will no longer be accessible.
    */
  def createStudio(): Request[CreateStudioResponse, AWSError] = js.native
  def createStudio(callback: js.Function2[/* err */ AWSError, /* data */ CreateStudioResponse, Unit]): Request[CreateStudioResponse, AWSError] = js.native
  /**
    * Create a new studio. When creating a studio, two IAM roles must be provided: the admin role and the user role. These roles are assumed by your users when they log in to the Nimble Studio portal. The user role must have the AmazonNimbleStudio-StudioUser managed policy attached for the portal to function properly. The admin role must have the AmazonNimbleStudio-StudioAdmin managed policy attached for the portal to function properly. You may optionally specify a KMS key in the StudioEncryptionConfiguration. In Nimble Studio, resource names, descriptions, initialization scripts, and other data you provide are always encrypted at rest using an KMS key. By default, this key is owned by Amazon Web Services and managed on your behalf. You may provide your own KMS key when calling CreateStudio to encrypt this data using a key you own and manage. When providing an KMS key during studio creation, Nimble Studio creates KMS grants in your account to provide your studio user and admin roles access to these KMS keys. If you delete this grant, the studio will no longer be accessible to your portal users. If you delete the studio KMS key, your studio will no longer be accessible.
    */
  def createStudio(params: CreateStudioRequest): Request[CreateStudioResponse, AWSError] = js.native
  def createStudio(
    params: CreateStudioRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateStudioResponse, Unit]
  ): Request[CreateStudioResponse, AWSError] = js.native
  
  /**
    * Creates a studio component resource.
    */
  def createStudioComponent(): Request[CreateStudioComponentResponse, AWSError] = js.native
  def createStudioComponent(callback: js.Function2[/* err */ AWSError, /* data */ CreateStudioComponentResponse, Unit]): Request[CreateStudioComponentResponse, AWSError] = js.native
  /**
    * Creates a studio component resource.
    */
  def createStudioComponent(params: CreateStudioComponentRequest): Request[CreateStudioComponentResponse, AWSError] = js.native
  def createStudioComponent(
    params: CreateStudioComponentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateStudioComponentResponse, Unit]
  ): Request[CreateStudioComponentResponse, AWSError] = js.native
  
  /**
    * Permanently delete a launch profile.
    */
  def deleteLaunchProfile(): Request[DeleteLaunchProfileResponse, AWSError] = js.native
  def deleteLaunchProfile(callback: js.Function2[/* err */ AWSError, /* data */ DeleteLaunchProfileResponse, Unit]): Request[DeleteLaunchProfileResponse, AWSError] = js.native
  /**
    * Permanently delete a launch profile.
    */
  def deleteLaunchProfile(params: DeleteLaunchProfileRequest): Request[DeleteLaunchProfileResponse, AWSError] = js.native
  def deleteLaunchProfile(
    params: DeleteLaunchProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLaunchProfileResponse, Unit]
  ): Request[DeleteLaunchProfileResponse, AWSError] = js.native
  
  /**
    * Delete a user from launch profile membership.
    */
  def deleteLaunchProfileMember(): Request[DeleteLaunchProfileMemberResponse, AWSError] = js.native
  def deleteLaunchProfileMember(callback: js.Function2[/* err */ AWSError, /* data */ DeleteLaunchProfileMemberResponse, Unit]): Request[DeleteLaunchProfileMemberResponse, AWSError] = js.native
  /**
    * Delete a user from launch profile membership.
    */
  def deleteLaunchProfileMember(params: DeleteLaunchProfileMemberRequest): Request[DeleteLaunchProfileMemberResponse, AWSError] = js.native
  def deleteLaunchProfileMember(
    params: DeleteLaunchProfileMemberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLaunchProfileMemberResponse, Unit]
  ): Request[DeleteLaunchProfileMemberResponse, AWSError] = js.native
  
  /**
    * Delete streaming image.
    */
  def deleteStreamingImage(): Request[DeleteStreamingImageResponse, AWSError] = js.native
  def deleteStreamingImage(callback: js.Function2[/* err */ AWSError, /* data */ DeleteStreamingImageResponse, Unit]): Request[DeleteStreamingImageResponse, AWSError] = js.native
  /**
    * Delete streaming image.
    */
  def deleteStreamingImage(params: DeleteStreamingImageRequest): Request[DeleteStreamingImageResponse, AWSError] = js.native
  def deleteStreamingImage(
    params: DeleteStreamingImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteStreamingImageResponse, Unit]
  ): Request[DeleteStreamingImageResponse, AWSError] = js.native
  
  /**
    * Deletes streaming session resource. After invoking this operation, use GetStreamingSession to poll the resource until it transitions to a DELETED state. A streaming session will count against your streaming session quota until it is marked DELETED.
    */
  def deleteStreamingSession(): Request[DeleteStreamingSessionResponse, AWSError] = js.native
  def deleteStreamingSession(callback: js.Function2[/* err */ AWSError, /* data */ DeleteStreamingSessionResponse, Unit]): Request[DeleteStreamingSessionResponse, AWSError] = js.native
  /**
    * Deletes streaming session resource. After invoking this operation, use GetStreamingSession to poll the resource until it transitions to a DELETED state. A streaming session will count against your streaming session quota until it is marked DELETED.
    */
  def deleteStreamingSession(params: DeleteStreamingSessionRequest): Request[DeleteStreamingSessionResponse, AWSError] = js.native
  def deleteStreamingSession(
    params: DeleteStreamingSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteStreamingSessionResponse, Unit]
  ): Request[DeleteStreamingSessionResponse, AWSError] = js.native
  
  /**
    * Delete a studio resource.
    */
  def deleteStudio(): Request[DeleteStudioResponse, AWSError] = js.native
  def deleteStudio(callback: js.Function2[/* err */ AWSError, /* data */ DeleteStudioResponse, Unit]): Request[DeleteStudioResponse, AWSError] = js.native
  /**
    * Delete a studio resource.
    */
  def deleteStudio(params: DeleteStudioRequest): Request[DeleteStudioResponse, AWSError] = js.native
  def deleteStudio(
    params: DeleteStudioRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteStudioResponse, Unit]
  ): Request[DeleteStudioResponse, AWSError] = js.native
  
  /**
    * Deletes a studio component resource.
    */
  def deleteStudioComponent(): Request[DeleteStudioComponentResponse, AWSError] = js.native
  def deleteStudioComponent(callback: js.Function2[/* err */ AWSError, /* data */ DeleteStudioComponentResponse, Unit]): Request[DeleteStudioComponentResponse, AWSError] = js.native
  /**
    * Deletes a studio component resource.
    */
  def deleteStudioComponent(params: DeleteStudioComponentRequest): Request[DeleteStudioComponentResponse, AWSError] = js.native
  def deleteStudioComponent(
    params: DeleteStudioComponentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteStudioComponentResponse, Unit]
  ): Request[DeleteStudioComponentResponse, AWSError] = js.native
  
  /**
    * Delete a user from studio membership.
    */
  def deleteStudioMember(): Request[DeleteStudioMemberResponse, AWSError] = js.native
  def deleteStudioMember(callback: js.Function2[/* err */ AWSError, /* data */ DeleteStudioMemberResponse, Unit]): Request[DeleteStudioMemberResponse, AWSError] = js.native
  /**
    * Delete a user from studio membership.
    */
  def deleteStudioMember(params: DeleteStudioMemberRequest): Request[DeleteStudioMemberResponse, AWSError] = js.native
  def deleteStudioMember(
    params: DeleteStudioMemberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteStudioMemberResponse, Unit]
  ): Request[DeleteStudioMemberResponse, AWSError] = js.native
  
  /**
    * Get EULA.
    */
  def getEula(): Request[GetEulaResponse, AWSError] = js.native
  def getEula(callback: js.Function2[/* err */ AWSError, /* data */ GetEulaResponse, Unit]): Request[GetEulaResponse, AWSError] = js.native
  /**
    * Get EULA.
    */
  def getEula(params: GetEulaRequest): Request[GetEulaResponse, AWSError] = js.native
  def getEula(
    params: GetEulaRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEulaResponse, Unit]
  ): Request[GetEulaResponse, AWSError] = js.native
  
  /**
    * Get a launch profile.
    */
  def getLaunchProfile(): Request[GetLaunchProfileResponse, AWSError] = js.native
  def getLaunchProfile(callback: js.Function2[/* err */ AWSError, /* data */ GetLaunchProfileResponse, Unit]): Request[GetLaunchProfileResponse, AWSError] = js.native
  /**
    * Get a launch profile.
    */
  def getLaunchProfile(params: GetLaunchProfileRequest): Request[GetLaunchProfileResponse, AWSError] = js.native
  def getLaunchProfile(
    params: GetLaunchProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLaunchProfileResponse, Unit]
  ): Request[GetLaunchProfileResponse, AWSError] = js.native
  
  /**
    * Launch profile details include the launch profile resource and summary information of resources that are used by, or available to, the launch profile. This includes the name and description of all studio components used by the launch profiles, and the name and description of streaming images that can be used with this launch profile.
    */
  def getLaunchProfileDetails(): Request[GetLaunchProfileDetailsResponse, AWSError] = js.native
  def getLaunchProfileDetails(callback: js.Function2[/* err */ AWSError, /* data */ GetLaunchProfileDetailsResponse, Unit]): Request[GetLaunchProfileDetailsResponse, AWSError] = js.native
  /**
    * Launch profile details include the launch profile resource and summary information of resources that are used by, or available to, the launch profile. This includes the name and description of all studio components used by the launch profiles, and the name and description of streaming images that can be used with this launch profile.
    */
  def getLaunchProfileDetails(params: GetLaunchProfileDetailsRequest): Request[GetLaunchProfileDetailsResponse, AWSError] = js.native
  def getLaunchProfileDetails(
    params: GetLaunchProfileDetailsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLaunchProfileDetailsResponse, Unit]
  ): Request[GetLaunchProfileDetailsResponse, AWSError] = js.native
  
  /**
    * Get a launch profile initialization.
    */
  def getLaunchProfileInitialization(): Request[GetLaunchProfileInitializationResponse, AWSError] = js.native
  def getLaunchProfileInitialization(
    callback: js.Function2[/* err */ AWSError, /* data */ GetLaunchProfileInitializationResponse, Unit]
  ): Request[GetLaunchProfileInitializationResponse, AWSError] = js.native
  /**
    * Get a launch profile initialization.
    */
  def getLaunchProfileInitialization(params: GetLaunchProfileInitializationRequest): Request[GetLaunchProfileInitializationResponse, AWSError] = js.native
  def getLaunchProfileInitialization(
    params: GetLaunchProfileInitializationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLaunchProfileInitializationResponse, Unit]
  ): Request[GetLaunchProfileInitializationResponse, AWSError] = js.native
  
  /**
    * Get a user persona in launch profile membership.
    */
  def getLaunchProfileMember(): Request[GetLaunchProfileMemberResponse, AWSError] = js.native
  def getLaunchProfileMember(callback: js.Function2[/* err */ AWSError, /* data */ GetLaunchProfileMemberResponse, Unit]): Request[GetLaunchProfileMemberResponse, AWSError] = js.native
  /**
    * Get a user persona in launch profile membership.
    */
  def getLaunchProfileMember(params: GetLaunchProfileMemberRequest): Request[GetLaunchProfileMemberResponse, AWSError] = js.native
  def getLaunchProfileMember(
    params: GetLaunchProfileMemberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLaunchProfileMemberResponse, Unit]
  ): Request[GetLaunchProfileMemberResponse, AWSError] = js.native
  
  /**
    * Get streaming image.
    */
  def getStreamingImage(): Request[GetStreamingImageResponse, AWSError] = js.native
  def getStreamingImage(callback: js.Function2[/* err */ AWSError, /* data */ GetStreamingImageResponse, Unit]): Request[GetStreamingImageResponse, AWSError] = js.native
  /**
    * Get streaming image.
    */
  def getStreamingImage(params: GetStreamingImageRequest): Request[GetStreamingImageResponse, AWSError] = js.native
  def getStreamingImage(
    params: GetStreamingImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStreamingImageResponse, Unit]
  ): Request[GetStreamingImageResponse, AWSError] = js.native
  
  /**
    * Gets StreamingSession resource. Invoke this operation to poll for a streaming session state while creating or deleting a session.
    */
  def getStreamingSession(): Request[GetStreamingSessionResponse, AWSError] = js.native
  def getStreamingSession(callback: js.Function2[/* err */ AWSError, /* data */ GetStreamingSessionResponse, Unit]): Request[GetStreamingSessionResponse, AWSError] = js.native
  /**
    * Gets StreamingSession resource. Invoke this operation to poll for a streaming session state while creating or deleting a session.
    */
  def getStreamingSession(params: GetStreamingSessionRequest): Request[GetStreamingSessionResponse, AWSError] = js.native
  def getStreamingSession(
    params: GetStreamingSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStreamingSessionResponse, Unit]
  ): Request[GetStreamingSessionResponse, AWSError] = js.native
  
  /**
    * Gets StreamingSessionBackup resource. Invoke this operation to poll for a streaming session backup while stopping a streaming session.
    */
  def getStreamingSessionBackup(): Request[GetStreamingSessionBackupResponse, AWSError] = js.native
  def getStreamingSessionBackup(callback: js.Function2[/* err */ AWSError, /* data */ GetStreamingSessionBackupResponse, Unit]): Request[GetStreamingSessionBackupResponse, AWSError] = js.native
  /**
    * Gets StreamingSessionBackup resource. Invoke this operation to poll for a streaming session backup while stopping a streaming session.
    */
  def getStreamingSessionBackup(params: GetStreamingSessionBackupRequest): Request[GetStreamingSessionBackupResponse, AWSError] = js.native
  def getStreamingSessionBackup(
    params: GetStreamingSessionBackupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStreamingSessionBackupResponse, Unit]
  ): Request[GetStreamingSessionBackupResponse, AWSError] = js.native
  
  /**
    * Gets a StreamingSessionStream for a streaming session. Invoke this operation to poll the resource after invoking CreateStreamingSessionStream. After the StreamingSessionStream changes to the READY state, the url property will contain a stream to be used with the DCV streaming client.
    */
  def getStreamingSessionStream(): Request[GetStreamingSessionStreamResponse, AWSError] = js.native
  def getStreamingSessionStream(callback: js.Function2[/* err */ AWSError, /* data */ GetStreamingSessionStreamResponse, Unit]): Request[GetStreamingSessionStreamResponse, AWSError] = js.native
  /**
    * Gets a StreamingSessionStream for a streaming session. Invoke this operation to poll the resource after invoking CreateStreamingSessionStream. After the StreamingSessionStream changes to the READY state, the url property will contain a stream to be used with the DCV streaming client.
    */
  def getStreamingSessionStream(params: GetStreamingSessionStreamRequest): Request[GetStreamingSessionStreamResponse, AWSError] = js.native
  def getStreamingSessionStream(
    params: GetStreamingSessionStreamRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStreamingSessionStreamResponse, Unit]
  ): Request[GetStreamingSessionStreamResponse, AWSError] = js.native
  
  /**
    * Get a studio resource.
    */
  def getStudio(): Request[GetStudioResponse, AWSError] = js.native
  def getStudio(callback: js.Function2[/* err */ AWSError, /* data */ GetStudioResponse, Unit]): Request[GetStudioResponse, AWSError] = js.native
  /**
    * Get a studio resource.
    */
  def getStudio(params: GetStudioRequest): Request[GetStudioResponse, AWSError] = js.native
  def getStudio(
    params: GetStudioRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStudioResponse, Unit]
  ): Request[GetStudioResponse, AWSError] = js.native
  
  /**
    * Gets a studio component resource.
    */
  def getStudioComponent(): Request[GetStudioComponentResponse, AWSError] = js.native
  def getStudioComponent(callback: js.Function2[/* err */ AWSError, /* data */ GetStudioComponentResponse, Unit]): Request[GetStudioComponentResponse, AWSError] = js.native
  /**
    * Gets a studio component resource.
    */
  def getStudioComponent(params: GetStudioComponentRequest): Request[GetStudioComponentResponse, AWSError] = js.native
  def getStudioComponent(
    params: GetStudioComponentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStudioComponentResponse, Unit]
  ): Request[GetStudioComponentResponse, AWSError] = js.native
  
  /**
    * Get a user's membership in a studio.
    */
  def getStudioMember(): Request[GetStudioMemberResponse, AWSError] = js.native
  def getStudioMember(callback: js.Function2[/* err */ AWSError, /* data */ GetStudioMemberResponse, Unit]): Request[GetStudioMemberResponse, AWSError] = js.native
  /**
    * Get a user's membership in a studio.
    */
  def getStudioMember(params: GetStudioMemberRequest): Request[GetStudioMemberResponse, AWSError] = js.native
  def getStudioMember(
    params: GetStudioMemberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStudioMemberResponse, Unit]
  ): Request[GetStudioMemberResponse, AWSError] = js.native
  
  /**
    * List EULA acceptances.
    */
  def listEulaAcceptances(): Request[ListEulaAcceptancesResponse, AWSError] = js.native
  def listEulaAcceptances(callback: js.Function2[/* err */ AWSError, /* data */ ListEulaAcceptancesResponse, Unit]): Request[ListEulaAcceptancesResponse, AWSError] = js.native
  /**
    * List EULA acceptances.
    */
  def listEulaAcceptances(params: ListEulaAcceptancesRequest): Request[ListEulaAcceptancesResponse, AWSError] = js.native
  def listEulaAcceptances(
    params: ListEulaAcceptancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEulaAcceptancesResponse, Unit]
  ): Request[ListEulaAcceptancesResponse, AWSError] = js.native
  
  /**
    * List EULAs.
    */
  def listEulas(): Request[ListEulasResponse, AWSError] = js.native
  def listEulas(callback: js.Function2[/* err */ AWSError, /* data */ ListEulasResponse, Unit]): Request[ListEulasResponse, AWSError] = js.native
  /**
    * List EULAs.
    */
  def listEulas(params: ListEulasRequest): Request[ListEulasResponse, AWSError] = js.native
  def listEulas(
    params: ListEulasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEulasResponse, Unit]
  ): Request[ListEulasResponse, AWSError] = js.native
  
  /**
    * Get all users in a given launch profile membership.
    */
  def listLaunchProfileMembers(): Request[ListLaunchProfileMembersResponse, AWSError] = js.native
  def listLaunchProfileMembers(callback: js.Function2[/* err */ AWSError, /* data */ ListLaunchProfileMembersResponse, Unit]): Request[ListLaunchProfileMembersResponse, AWSError] = js.native
  /**
    * Get all users in a given launch profile membership.
    */
  def listLaunchProfileMembers(params: ListLaunchProfileMembersRequest): Request[ListLaunchProfileMembersResponse, AWSError] = js.native
  def listLaunchProfileMembers(
    params: ListLaunchProfileMembersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLaunchProfileMembersResponse, Unit]
  ): Request[ListLaunchProfileMembersResponse, AWSError] = js.native
  
  /**
    * List all the launch profiles a studio.
    */
  def listLaunchProfiles(): Request[ListLaunchProfilesResponse, AWSError] = js.native
  def listLaunchProfiles(callback: js.Function2[/* err */ AWSError, /* data */ ListLaunchProfilesResponse, Unit]): Request[ListLaunchProfilesResponse, AWSError] = js.native
  /**
    * List all the launch profiles a studio.
    */
  def listLaunchProfiles(params: ListLaunchProfilesRequest): Request[ListLaunchProfilesResponse, AWSError] = js.native
  def listLaunchProfiles(
    params: ListLaunchProfilesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLaunchProfilesResponse, Unit]
  ): Request[ListLaunchProfilesResponse, AWSError] = js.native
  
  /**
    * List the streaming image resources available to this studio. This list will contain both images provided by Amazon Web Services, as well as streaming images that you have created in your studio.
    */
  def listStreamingImages(): Request[ListStreamingImagesResponse, AWSError] = js.native
  def listStreamingImages(callback: js.Function2[/* err */ AWSError, /* data */ ListStreamingImagesResponse, Unit]): Request[ListStreamingImagesResponse, AWSError] = js.native
  /**
    * List the streaming image resources available to this studio. This list will contain both images provided by Amazon Web Services, as well as streaming images that you have created in your studio.
    */
  def listStreamingImages(params: ListStreamingImagesRequest): Request[ListStreamingImagesResponse, AWSError] = js.native
  def listStreamingImages(
    params: ListStreamingImagesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStreamingImagesResponse, Unit]
  ): Request[ListStreamingImagesResponse, AWSError] = js.native
  
  /**
    * Lists the backups of a streaming session in a studio.
    */
  def listStreamingSessionBackups(): Request[ListStreamingSessionBackupsResponse, AWSError] = js.native
  def listStreamingSessionBackups(callback: js.Function2[/* err */ AWSError, /* data */ ListStreamingSessionBackupsResponse, Unit]): Request[ListStreamingSessionBackupsResponse, AWSError] = js.native
  /**
    * Lists the backups of a streaming session in a studio.
    */
  def listStreamingSessionBackups(params: ListStreamingSessionBackupsRequest): Request[ListStreamingSessionBackupsResponse, AWSError] = js.native
  def listStreamingSessionBackups(
    params: ListStreamingSessionBackupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStreamingSessionBackupsResponse, Unit]
  ): Request[ListStreamingSessionBackupsResponse, AWSError] = js.native
  
  /**
    * Lists the streaming sessions in a studio.
    */
  def listStreamingSessions(): Request[ListStreamingSessionsResponse, AWSError] = js.native
  def listStreamingSessions(callback: js.Function2[/* err */ AWSError, /* data */ ListStreamingSessionsResponse, Unit]): Request[ListStreamingSessionsResponse, AWSError] = js.native
  /**
    * Lists the streaming sessions in a studio.
    */
  def listStreamingSessions(params: ListStreamingSessionsRequest): Request[ListStreamingSessionsResponse, AWSError] = js.native
  def listStreamingSessions(
    params: ListStreamingSessionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStreamingSessionsResponse, Unit]
  ): Request[ListStreamingSessionsResponse, AWSError] = js.native
  
  /**
    * Lists the StudioComponents in a studio.
    */
  def listStudioComponents(): Request[ListStudioComponentsResponse, AWSError] = js.native
  def listStudioComponents(callback: js.Function2[/* err */ AWSError, /* data */ ListStudioComponentsResponse, Unit]): Request[ListStudioComponentsResponse, AWSError] = js.native
  /**
    * Lists the StudioComponents in a studio.
    */
  def listStudioComponents(params: ListStudioComponentsRequest): Request[ListStudioComponentsResponse, AWSError] = js.native
  def listStudioComponents(
    params: ListStudioComponentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStudioComponentsResponse, Unit]
  ): Request[ListStudioComponentsResponse, AWSError] = js.native
  
  /**
    * Get all users in a given studio membership.   ListStudioMembers only returns admin members. 
    */
  def listStudioMembers(): Request[ListStudioMembersResponse, AWSError] = js.native
  def listStudioMembers(callback: js.Function2[/* err */ AWSError, /* data */ ListStudioMembersResponse, Unit]): Request[ListStudioMembersResponse, AWSError] = js.native
  /**
    * Get all users in a given studio membership.   ListStudioMembers only returns admin members. 
    */
  def listStudioMembers(params: ListStudioMembersRequest): Request[ListStudioMembersResponse, AWSError] = js.native
  def listStudioMembers(
    params: ListStudioMembersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStudioMembersResponse, Unit]
  ): Request[ListStudioMembersResponse, AWSError] = js.native
  
  /**
    * List studios in your Amazon Web Services accounts in the requested Amazon Web Services Region.
    */
  def listStudios(): Request[ListStudiosResponse, AWSError] = js.native
  def listStudios(callback: js.Function2[/* err */ AWSError, /* data */ ListStudiosResponse, Unit]): Request[ListStudiosResponse, AWSError] = js.native
  /**
    * List studios in your Amazon Web Services accounts in the requested Amazon Web Services Region.
    */
  def listStudios(params: ListStudiosRequest): Request[ListStudiosResponse, AWSError] = js.native
  def listStudios(
    params: ListStudiosRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStudiosResponse, Unit]
  ): Request[ListStudiosResponse, AWSError] = js.native
  
  /**
    * Gets the tags for a resource, given its Amazon Resource Names (ARN). This operation supports ARNs for all resource types in Nimble Studio that support tags, including studio, studio component, launch profile, streaming image, and streaming session. All resources that can be tagged will contain an ARN property, so you do not have to create this ARN yourself.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Gets the tags for a resource, given its Amazon Resource Names (ARN). This operation supports ARNs for all resource types in Nimble Studio that support tags, including studio, studio component, launch profile, streaming image, and streaming session. All resources that can be tagged will contain an ARN property, so you do not have to create this ARN yourself.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Add/update users with given persona to launch profile membership.
    */
  def putLaunchProfileMembers(): Request[PutLaunchProfileMembersResponse, AWSError] = js.native
  def putLaunchProfileMembers(callback: js.Function2[/* err */ AWSError, /* data */ PutLaunchProfileMembersResponse, Unit]): Request[PutLaunchProfileMembersResponse, AWSError] = js.native
  /**
    * Add/update users with given persona to launch profile membership.
    */
  def putLaunchProfileMembers(params: PutLaunchProfileMembersRequest): Request[PutLaunchProfileMembersResponse, AWSError] = js.native
  def putLaunchProfileMembers(
    params: PutLaunchProfileMembersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutLaunchProfileMembersResponse, Unit]
  ): Request[PutLaunchProfileMembersResponse, AWSError] = js.native
  
  /**
    * Add/update users with given persona to studio membership.
    */
  def putStudioMembers(): Request[PutStudioMembersResponse, AWSError] = js.native
  def putStudioMembers(callback: js.Function2[/* err */ AWSError, /* data */ PutStudioMembersResponse, Unit]): Request[PutStudioMembersResponse, AWSError] = js.native
  /**
    * Add/update users with given persona to studio membership.
    */
  def putStudioMembers(params: PutStudioMembersRequest): Request[PutStudioMembersResponse, AWSError] = js.native
  def putStudioMembers(
    params: PutStudioMembersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutStudioMembersResponse, Unit]
  ): Request[PutStudioMembersResponse, AWSError] = js.native
  
  /**
    * Transitions sessions from the STOPPED state into the READY state. The START_IN_PROGRESS state is the intermediate state between the STOPPED and READY states.
    */
  def startStreamingSession(): Request[StartStreamingSessionResponse, AWSError] = js.native
  def startStreamingSession(callback: js.Function2[/* err */ AWSError, /* data */ StartStreamingSessionResponse, Unit]): Request[StartStreamingSessionResponse, AWSError] = js.native
  /**
    * Transitions sessions from the STOPPED state into the READY state. The START_IN_PROGRESS state is the intermediate state between the STOPPED and READY states.
    */
  def startStreamingSession(params: StartStreamingSessionRequest): Request[StartStreamingSessionResponse, AWSError] = js.native
  def startStreamingSession(
    params: StartStreamingSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartStreamingSessionResponse, Unit]
  ): Request[StartStreamingSessionResponse, AWSError] = js.native
  
  /**
    * Repairs the IAM Identity Center configuration for a given studio. If the studio has a valid IAM Identity Center configuration currently associated with it, this operation will fail with a validation error. If the studio does not have a valid IAM Identity Center configuration currently associated with it, then a new IAM Identity Center application is created for the studio and the studio is changed to the READY state. After the IAM Identity Center application is repaired, you must use the Amazon Nimble Studio console to add administrators and users to your studio.
    */
  def startStudioSSOConfigurationRepair(): Request[StartStudioSSOConfigurationRepairResponse, AWSError] = js.native
  def startStudioSSOConfigurationRepair(
    callback: js.Function2[/* err */ AWSError, /* data */ StartStudioSSOConfigurationRepairResponse, Unit]
  ): Request[StartStudioSSOConfigurationRepairResponse, AWSError] = js.native
  /**
    * Repairs the IAM Identity Center configuration for a given studio. If the studio has a valid IAM Identity Center configuration currently associated with it, this operation will fail with a validation error. If the studio does not have a valid IAM Identity Center configuration currently associated with it, then a new IAM Identity Center application is created for the studio and the studio is changed to the READY state. After the IAM Identity Center application is repaired, you must use the Amazon Nimble Studio console to add administrators and users to your studio.
    */
  def startStudioSSOConfigurationRepair(params: StartStudioSSOConfigurationRepairRequest): Request[StartStudioSSOConfigurationRepairResponse, AWSError] = js.native
  def startStudioSSOConfigurationRepair(
    params: StartStudioSSOConfigurationRepairRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartStudioSSOConfigurationRepairResponse, Unit]
  ): Request[StartStudioSSOConfigurationRepairResponse, AWSError] = js.native
  
  /**
    * Transitions sessions from the READY state into the STOPPED state. The STOP_IN_PROGRESS state is the intermediate state between the READY and STOPPED states.
    */
  def stopStreamingSession(): Request[StopStreamingSessionResponse, AWSError] = js.native
  def stopStreamingSession(callback: js.Function2[/* err */ AWSError, /* data */ StopStreamingSessionResponse, Unit]): Request[StopStreamingSessionResponse, AWSError] = js.native
  /**
    * Transitions sessions from the READY state into the STOPPED state. The STOP_IN_PROGRESS state is the intermediate state between the READY and STOPPED states.
    */
  def stopStreamingSession(params: StopStreamingSessionRequest): Request[StopStreamingSessionResponse, AWSError] = js.native
  def stopStreamingSession(
    params: StopStreamingSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopStreamingSessionResponse, Unit]
  ): Request[StopStreamingSessionResponse, AWSError] = js.native
  
  /**
    * Creates tags for a resource, given its ARN.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Creates tags for a resource, given its ARN.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Deletes the tags for a resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Deletes the tags for a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Update a launch profile.
    */
  def updateLaunchProfile(): Request[UpdateLaunchProfileResponse, AWSError] = js.native
  def updateLaunchProfile(callback: js.Function2[/* err */ AWSError, /* data */ UpdateLaunchProfileResponse, Unit]): Request[UpdateLaunchProfileResponse, AWSError] = js.native
  /**
    * Update a launch profile.
    */
  def updateLaunchProfile(params: UpdateLaunchProfileRequest): Request[UpdateLaunchProfileResponse, AWSError] = js.native
  def updateLaunchProfile(
    params: UpdateLaunchProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateLaunchProfileResponse, Unit]
  ): Request[UpdateLaunchProfileResponse, AWSError] = js.native
  
  /**
    * Update a user persona in launch profile membership.
    */
  def updateLaunchProfileMember(): Request[UpdateLaunchProfileMemberResponse, AWSError] = js.native
  def updateLaunchProfileMember(callback: js.Function2[/* err */ AWSError, /* data */ UpdateLaunchProfileMemberResponse, Unit]): Request[UpdateLaunchProfileMemberResponse, AWSError] = js.native
  /**
    * Update a user persona in launch profile membership.
    */
  def updateLaunchProfileMember(params: UpdateLaunchProfileMemberRequest): Request[UpdateLaunchProfileMemberResponse, AWSError] = js.native
  def updateLaunchProfileMember(
    params: UpdateLaunchProfileMemberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateLaunchProfileMemberResponse, Unit]
  ): Request[UpdateLaunchProfileMemberResponse, AWSError] = js.native
  
  /**
    * Update streaming image.
    */
  def updateStreamingImage(): Request[UpdateStreamingImageResponse, AWSError] = js.native
  def updateStreamingImage(callback: js.Function2[/* err */ AWSError, /* data */ UpdateStreamingImageResponse, Unit]): Request[UpdateStreamingImageResponse, AWSError] = js.native
  /**
    * Update streaming image.
    */
  def updateStreamingImage(params: UpdateStreamingImageRequest): Request[UpdateStreamingImageResponse, AWSError] = js.native
  def updateStreamingImage(
    params: UpdateStreamingImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateStreamingImageResponse, Unit]
  ): Request[UpdateStreamingImageResponse, AWSError] = js.native
  
  /**
    * Update a Studio resource. Currently, this operation only supports updating the displayName of your studio.
    */
  def updateStudio(): Request[UpdateStudioResponse, AWSError] = js.native
  def updateStudio(callback: js.Function2[/* err */ AWSError, /* data */ UpdateStudioResponse, Unit]): Request[UpdateStudioResponse, AWSError] = js.native
  /**
    * Update a Studio resource. Currently, this operation only supports updating the displayName of your studio.
    */
  def updateStudio(params: UpdateStudioRequest): Request[UpdateStudioResponse, AWSError] = js.native
  def updateStudio(
    params: UpdateStudioRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateStudioResponse, Unit]
  ): Request[UpdateStudioResponse, AWSError] = js.native
  
  /**
    * Updates a studio component resource.
    */
  def updateStudioComponent(): Request[UpdateStudioComponentResponse, AWSError] = js.native
  def updateStudioComponent(callback: js.Function2[/* err */ AWSError, /* data */ UpdateStudioComponentResponse, Unit]): Request[UpdateStudioComponentResponse, AWSError] = js.native
  /**
    * Updates a studio component resource.
    */
  def updateStudioComponent(params: UpdateStudioComponentRequest): Request[UpdateStudioComponentResponse, AWSError] = js.native
  def updateStudioComponent(
    params: UpdateStudioComponentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateStudioComponentResponse, Unit]
  ): Request[UpdateStudioComponentResponse, AWSError] = js.native
  
  /**
    * Waits for the launchProfileDeleted state by periodically calling the underlying Nimble.getLaunchProfileoperation every 5 seconds (at most 150 times). Wait until a LaunchProfile is Deleted. Use this after invoking DeleteLaunchProfile
    */
  @JSName("waitFor")
  def waitFor_launchProfileDeleted(state: launchProfileDeleted): Request[GetLaunchProfileResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_launchProfileDeleted(
    state: launchProfileDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLaunchProfileResponse, Unit]
  ): Request[GetLaunchProfileResponse, AWSError] = js.native
  /**
    * Waits for the launchProfileDeleted state by periodically calling the underlying Nimble.getLaunchProfileoperation every 5 seconds (at most 150 times). Wait until a LaunchProfile is Deleted. Use this after invoking DeleteLaunchProfile
    */
  @JSName("waitFor")
  def waitFor_launchProfileDeleted(state: launchProfileDeleted, params: GetLaunchProfileRequestwa): Request[GetLaunchProfileResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_launchProfileDeleted(
    state: launchProfileDeleted,
    params: GetLaunchProfileRequestwa,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLaunchProfileResponse, Unit]
  ): Request[GetLaunchProfileResponse, AWSError] = js.native
  /**
    * Waits for the launchProfileReady state by periodically calling the underlying Nimble.getLaunchProfileoperation every 5 seconds (at most 150 times). Wait until a LaunchProfile is Ready. Use this after invoking CreateLaunchProfile or UpdateLaunchProfile
    */
  @JSName("waitFor")
  def waitFor_launchProfileReady(state: launchProfileReady): Request[GetLaunchProfileResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_launchProfileReady(
    state: launchProfileReady,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLaunchProfileResponse, Unit]
  ): Request[GetLaunchProfileResponse, AWSError] = js.native
  /**
    * Waits for the launchProfileReady state by periodically calling the underlying Nimble.getLaunchProfileoperation every 5 seconds (at most 150 times). Wait until a LaunchProfile is Ready. Use this after invoking CreateLaunchProfile or UpdateLaunchProfile
    */
  @JSName("waitFor")
  def waitFor_launchProfileReady(state: launchProfileReady, params: GetLaunchProfileRequestwa): Request[GetLaunchProfileResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_launchProfileReady(
    state: launchProfileReady,
    params: GetLaunchProfileRequestwa,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLaunchProfileResponse, Unit]
  ): Request[GetLaunchProfileResponse, AWSError] = js.native
  /**
    * Waits for the streamingImageDeleted state by periodically calling the underlying Nimble.getStreamingImageoperation every 2 seconds (at most 60 times). Wait until a StreamingImage Deleted. Use this after invoking DeleteStreamingImage
    */
  @JSName("waitFor")
  def waitFor_streamingImageDeleted(state: streamingImageDeleted): Request[GetStreamingImageResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_streamingImageDeleted(
    state: streamingImageDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStreamingImageResponse, Unit]
  ): Request[GetStreamingImageResponse, AWSError] = js.native
  /**
    * Waits for the streamingImageDeleted state by periodically calling the underlying Nimble.getStreamingImageoperation every 2 seconds (at most 60 times). Wait until a StreamingImage Deleted. Use this after invoking DeleteStreamingImage
    */
  @JSName("waitFor")
  def waitFor_streamingImageDeleted(state: streamingImageDeleted, params: GetStreamingImageRequestw): Request[GetStreamingImageResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_streamingImageDeleted(
    state: streamingImageDeleted,
    params: GetStreamingImageRequestw,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStreamingImageResponse, Unit]
  ): Request[GetStreamingImageResponse, AWSError] = js.native
  /**
    * Waits for the streamingImageReady state by periodically calling the underlying Nimble.getStreamingImageoperation every 2 seconds (at most 60 times). Wait until a StreamingImage is Ready. Use this after invoking CreateStreamingImage or UpdateStreamingImage
    */
  @JSName("waitFor")
  def waitFor_streamingImageReady(state: streamingImageReady): Request[GetStreamingImageResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_streamingImageReady(
    state: streamingImageReady,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStreamingImageResponse, Unit]
  ): Request[GetStreamingImageResponse, AWSError] = js.native
  /**
    * Waits for the streamingImageReady state by periodically calling the underlying Nimble.getStreamingImageoperation every 2 seconds (at most 60 times). Wait until a StreamingImage is Ready. Use this after invoking CreateStreamingImage or UpdateStreamingImage
    */
  @JSName("waitFor")
  def waitFor_streamingImageReady(state: streamingImageReady, params: GetStreamingImageRequestw): Request[GetStreamingImageResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_streamingImageReady(
    state: streamingImageReady,
    params: GetStreamingImageRequestw,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStreamingImageResponse, Unit]
  ): Request[GetStreamingImageResponse, AWSError] = js.native
  /**
    * Waits for the streamingSessionDeleted state by periodically calling the underlying Nimble.getStreamingSessionoperation every 5 seconds (at most 180 times). Wait until a StreamingSessionDeleted. Use this after invoking DeleteStreamingSession
    */
  @JSName("waitFor")
  def waitFor_streamingSessionDeleted(state: streamingSessionDeleted): Request[GetStreamingSessionResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_streamingSessionDeleted(
    state: streamingSessionDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStreamingSessionResponse, Unit]
  ): Request[GetStreamingSessionResponse, AWSError] = js.native
  /**
    * Waits for the streamingSessionDeleted state by periodically calling the underlying Nimble.getStreamingSessionoperation every 5 seconds (at most 180 times). Wait until a StreamingSessionDeleted. Use this after invoking DeleteStreamingSession
    */
  @JSName("waitFor")
  def waitFor_streamingSessionDeleted(state: streamingSessionDeleted, params: GetStreamingSessionReques): Request[GetStreamingSessionResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_streamingSessionDeleted(
    state: streamingSessionDeleted,
    params: GetStreamingSessionReques,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStreamingSessionResponse, Unit]
  ): Request[GetStreamingSessionResponse, AWSError] = js.native
  /**
    * Waits for the streamingSessionReady state by periodically calling the underlying Nimble.getStreamingSessionoperation every 10 seconds (at most 180 times). Wait until a StreamingSession is ready. Use this after invoking CreateStreamingSession, StartStreamingSession
    */
  @JSName("waitFor")
  def waitFor_streamingSessionReady(state: streamingSessionReady): Request[GetStreamingSessionResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_streamingSessionReady(
    state: streamingSessionReady,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStreamingSessionResponse, Unit]
  ): Request[GetStreamingSessionResponse, AWSError] = js.native
  /**
    * Waits for the streamingSessionReady state by periodically calling the underlying Nimble.getStreamingSessionoperation every 10 seconds (at most 180 times). Wait until a StreamingSession is ready. Use this after invoking CreateStreamingSession, StartStreamingSession
    */
  @JSName("waitFor")
  def waitFor_streamingSessionReady(state: streamingSessionReady, params: GetStreamingSessionReques): Request[GetStreamingSessionResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_streamingSessionReady(
    state: streamingSessionReady,
    params: GetStreamingSessionReques,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStreamingSessionResponse, Unit]
  ): Request[GetStreamingSessionResponse, AWSError] = js.native
  /**
    * Waits for the streamingSessionStopped state by periodically calling the underlying Nimble.getStreamingSessionoperation every 5 seconds (at most 180 times). Wait until a StreamingSessionStopped. Use this after invoking StopStreamingSession
    */
  @JSName("waitFor")
  def waitFor_streamingSessionStopped(state: streamingSessionStopped): Request[GetStreamingSessionResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_streamingSessionStopped(
    state: streamingSessionStopped,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStreamingSessionResponse, Unit]
  ): Request[GetStreamingSessionResponse, AWSError] = js.native
  /**
    * Waits for the streamingSessionStopped state by periodically calling the underlying Nimble.getStreamingSessionoperation every 5 seconds (at most 180 times). Wait until a StreamingSessionStopped. Use this after invoking StopStreamingSession
    */
  @JSName("waitFor")
  def waitFor_streamingSessionStopped(state: streamingSessionStopped, params: GetStreamingSessionReques): Request[GetStreamingSessionResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_streamingSessionStopped(
    state: streamingSessionStopped,
    params: GetStreamingSessionReques,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStreamingSessionResponse, Unit]
  ): Request[GetStreamingSessionResponse, AWSError] = js.native
  /**
    * Waits for the streamingSessionStreamReady state by periodically calling the underlying Nimble.getStreamingSessionStreamoperation every 5 seconds (at most 30 times). Wait until a StreamingSessionStream is ready. Use this after invoking CreateStreamingSessionStream
    */
  @JSName("waitFor")
  def waitFor_streamingSessionStreamReady(state: streamingSessionStreamReady): Request[GetStreamingSessionStreamResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_streamingSessionStreamReady(
    state: streamingSessionStreamReady,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStreamingSessionStreamResponse, Unit]
  ): Request[GetStreamingSessionStreamResponse, AWSError] = js.native
  /**
    * Waits for the streamingSessionStreamReady state by periodically calling the underlying Nimble.getStreamingSessionStreamoperation every 5 seconds (at most 30 times). Wait until a StreamingSessionStream is ready. Use this after invoking CreateStreamingSessionStream
    */
  @JSName("waitFor")
  def waitFor_streamingSessionStreamReady(state: streamingSessionStreamReady, params: GetStreamingSessionStream): Request[GetStreamingSessionStreamResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_streamingSessionStreamReady(
    state: streamingSessionStreamReady,
    params: GetStreamingSessionStream,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStreamingSessionStreamResponse, Unit]
  ): Request[GetStreamingSessionStreamResponse, AWSError] = js.native
  /**
    * Waits for the studioComponentDeleted state by periodically calling the underlying Nimble.getStudioComponentoperation every 1 seconds (at most 120 times). Wait until a StudioComponent Deleted. Use this after invoking DeleteStudioComponent
    */
  @JSName("waitFor")
  def waitFor_studioComponentDeleted(state: studioComponentDeleted): Request[GetStudioComponentResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_studioComponentDeleted(
    state: studioComponentDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStudioComponentResponse, Unit]
  ): Request[GetStudioComponentResponse, AWSError] = js.native
  /**
    * Waits for the studioComponentDeleted state by periodically calling the underlying Nimble.getStudioComponentoperation every 1 seconds (at most 120 times). Wait until a StudioComponent Deleted. Use this after invoking DeleteStudioComponent
    */
  @JSName("waitFor")
  def waitFor_studioComponentDeleted(state: studioComponentDeleted, params: typings.awsSdk.anon.GetStudioComponentRequest): Request[GetStudioComponentResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_studioComponentDeleted(
    state: studioComponentDeleted,
    params: typings.awsSdk.anon.GetStudioComponentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStudioComponentResponse, Unit]
  ): Request[GetStudioComponentResponse, AWSError] = js.native
  /**
    * Waits for the studioComponentReady state by periodically calling the underlying Nimble.getStudioComponentoperation every 2 seconds (at most 60 times). Wait until a StudioComponent is Ready. Use this after invoking CreateStudioComponent or UpdateStudioComponent
    */
  @JSName("waitFor")
  def waitFor_studioComponentReady(state: studioComponentReady): Request[GetStudioComponentResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_studioComponentReady(
    state: studioComponentReady,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStudioComponentResponse, Unit]
  ): Request[GetStudioComponentResponse, AWSError] = js.native
  /**
    * Waits for the studioComponentReady state by periodically calling the underlying Nimble.getStudioComponentoperation every 2 seconds (at most 60 times). Wait until a StudioComponent is Ready. Use this after invoking CreateStudioComponent or UpdateStudioComponent
    */
  @JSName("waitFor")
  def waitFor_studioComponentReady(state: studioComponentReady, params: typings.awsSdk.anon.GetStudioComponentRequest): Request[GetStudioComponentResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_studioComponentReady(
    state: studioComponentReady,
    params: typings.awsSdk.anon.GetStudioComponentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStudioComponentResponse, Unit]
  ): Request[GetStudioComponentResponse, AWSError] = js.native
  /**
    * Waits for the studioDeleted state by periodically calling the underlying Nimble.getStudiooperation every 2 seconds (at most 60 times). Wait until a Studio is Deleted. Use this after invoking DeleteStudio.
    */
  @JSName("waitFor")
  def waitFor_studioDeleted(state: studioDeleted): Request[GetStudioResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_studioDeleted(
    state: studioDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStudioResponse, Unit]
  ): Request[GetStudioResponse, AWSError] = js.native
  /**
    * Waits for the studioDeleted state by periodically calling the underlying Nimble.getStudiooperation every 2 seconds (at most 60 times). Wait until a Studio is Deleted. Use this after invoking DeleteStudio.
    */
  @JSName("waitFor")
  def waitFor_studioDeleted(state: studioDeleted, params: GetStudioRequestwaiterWai): Request[GetStudioResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_studioDeleted(
    state: studioDeleted,
    params: GetStudioRequestwaiterWai,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStudioResponse, Unit]
  ): Request[GetStudioResponse, AWSError] = js.native
  /**
    * Waits for the studioReady state by periodically calling the underlying Nimble.getStudiooperation every 2 seconds (at most 60 times). Wait until a Studio is Ready. Use this after invoking CreateStudio, UpdateStudio, or StartStudioSSOConfigurationRepair
    */
  @JSName("waitFor")
  def waitFor_studioReady(state: studioReady): Request[GetStudioResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_studioReady(state: studioReady, callback: js.Function2[/* err */ AWSError, /* data */ GetStudioResponse, Unit]): Request[GetStudioResponse, AWSError] = js.native
  /**
    * Waits for the studioReady state by periodically calling the underlying Nimble.getStudiooperation every 2 seconds (at most 60 times). Wait until a Studio is Ready. Use this after invoking CreateStudio, UpdateStudio, or StartStudioSSOConfigurationRepair
    */
  @JSName("waitFor")
  def waitFor_studioReady(state: studioReady, params: GetStudioRequestwaiterWai): Request[GetStudioResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_studioReady(
    state: studioReady,
    params: GetStudioRequestwaiterWai,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStudioResponse, Unit]
  ): Request[GetStudioResponse, AWSError] = js.native
}
