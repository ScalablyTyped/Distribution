package typings.awsSdk.clientsGamesparksMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GameSparks extends Service {
  
  @JSName("config")
  var config_GameSparks: ConfigBase & ClientConfiguration = js.native
  
  /**
    *  Creates a new game with an empty configuration. After creating your game, you can update the configuration using UpdateGameConfiguration or ImportGameConfiguration. 
    */
  def createGame(): Request[CreateGameResult, AWSError] = js.native
  def createGame(callback: js.Function2[/* err */ AWSError, /* data */ CreateGameResult, Unit]): Request[CreateGameResult, AWSError] = js.native
  /**
    *  Creates a new game with an empty configuration. After creating your game, you can update the configuration using UpdateGameConfiguration or ImportGameConfiguration. 
    */
  def createGame(params: CreateGameRequest): Request[CreateGameResult, AWSError] = js.native
  def createGame(
    params: CreateGameRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateGameResult, Unit]
  ): Request[CreateGameResult, AWSError] = js.native
  
  /**
    * Creates a snapshot of the game configuration.
    */
  def createSnapshot(): Request[CreateSnapshotResult, AWSError] = js.native
  def createSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ CreateSnapshotResult, Unit]): Request[CreateSnapshotResult, AWSError] = js.native
  /**
    * Creates a snapshot of the game configuration.
    */
  def createSnapshot(params: CreateSnapshotRequest): Request[CreateSnapshotResult, AWSError] = js.native
  def createSnapshot(
    params: CreateSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSnapshotResult, Unit]
  ): Request[CreateSnapshotResult, AWSError] = js.native
  
  /**
    * Creates a new stage for stage-by-stage game development and deployment.
    */
  def createStage(): Request[CreateStageResult, AWSError] = js.native
  def createStage(callback: js.Function2[/* err */ AWSError, /* data */ CreateStageResult, Unit]): Request[CreateStageResult, AWSError] = js.native
  /**
    * Creates a new stage for stage-by-stage game development and deployment.
    */
  def createStage(params: CreateStageRequest): Request[CreateStageResult, AWSError] = js.native
  def createStage(
    params: CreateStageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateStageResult, Unit]
  ): Request[CreateStageResult, AWSError] = js.native
  
  /**
    * Deletes a game.
    */
  def deleteGame(): Request[DeleteGameResult, AWSError] = js.native
  def deleteGame(callback: js.Function2[/* err */ AWSError, /* data */ DeleteGameResult, Unit]): Request[DeleteGameResult, AWSError] = js.native
  /**
    * Deletes a game.
    */
  def deleteGame(params: DeleteGameRequest): Request[DeleteGameResult, AWSError] = js.native
  def deleteGame(
    params: DeleteGameRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteGameResult, Unit]
  ): Request[DeleteGameResult, AWSError] = js.native
  
  /**
    * Deletes a stage from a game, along with the associated game runtime.
    */
  def deleteStage(): Request[DeleteStageResult, AWSError] = js.native
  def deleteStage(callback: js.Function2[/* err */ AWSError, /* data */ DeleteStageResult, Unit]): Request[DeleteStageResult, AWSError] = js.native
  /**
    * Deletes a stage from a game, along with the associated game runtime.
    */
  def deleteStage(params: DeleteStageRequest): Request[DeleteStageResult, AWSError] = js.native
  def deleteStage(
    params: DeleteStageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteStageResult, Unit]
  ): Request[DeleteStageResult, AWSError] = js.native
  
  /**
    * Disconnects a player from the game runtime.  If a player has multiple connections, this operation attempts to close all of them. 
    */
  def disconnectPlayer(): Request[DisconnectPlayerResult, AWSError] = js.native
  def disconnectPlayer(callback: js.Function2[/* err */ AWSError, /* data */ DisconnectPlayerResult, Unit]): Request[DisconnectPlayerResult, AWSError] = js.native
  /**
    * Disconnects a player from the game runtime.  If a player has multiple connections, this operation attempts to close all of them. 
    */
  def disconnectPlayer(params: DisconnectPlayerRequest): Request[DisconnectPlayerResult, AWSError] = js.native
  def disconnectPlayer(
    params: DisconnectPlayerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisconnectPlayerResult, Unit]
  ): Request[DisconnectPlayerResult, AWSError] = js.native
  
  /**
    * Exports a game configuration snapshot.
    */
  def exportSnapshot(): Request[ExportSnapshotResult, AWSError] = js.native
  def exportSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ ExportSnapshotResult, Unit]): Request[ExportSnapshotResult, AWSError] = js.native
  /**
    * Exports a game configuration snapshot.
    */
  def exportSnapshot(params: ExportSnapshotRequest): Request[ExportSnapshotResult, AWSError] = js.native
  def exportSnapshot(
    params: ExportSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ExportSnapshotResult, Unit]
  ): Request[ExportSnapshotResult, AWSError] = js.native
  
  /**
    * Gets details about a specified extension.
    */
  def getExtension(): Request[GetExtensionResult, AWSError] = js.native
  def getExtension(callback: js.Function2[/* err */ AWSError, /* data */ GetExtensionResult, Unit]): Request[GetExtensionResult, AWSError] = js.native
  /**
    * Gets details about a specified extension.
    */
  def getExtension(params: GetExtensionRequest): Request[GetExtensionResult, AWSError] = js.native
  def getExtension(
    params: GetExtensionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetExtensionResult, Unit]
  ): Request[GetExtensionResult, AWSError] = js.native
  
  /**
    * Gets details about a specified extension version.
    */
  def getExtensionVersion(): Request[GetExtensionVersionResult, AWSError] = js.native
  def getExtensionVersion(callback: js.Function2[/* err */ AWSError, /* data */ GetExtensionVersionResult, Unit]): Request[GetExtensionVersionResult, AWSError] = js.native
  /**
    * Gets details about a specified extension version.
    */
  def getExtensionVersion(params: GetExtensionVersionRequest): Request[GetExtensionVersionResult, AWSError] = js.native
  def getExtensionVersion(
    params: GetExtensionVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetExtensionVersionResult, Unit]
  ): Request[GetExtensionVersionResult, AWSError] = js.native
  
  /**
    * Gets details about a game.
    */
  def getGame(): Request[GetGameResult, AWSError] = js.native
  def getGame(callback: js.Function2[/* err */ AWSError, /* data */ GetGameResult, Unit]): Request[GetGameResult, AWSError] = js.native
  /**
    * Gets details about a game.
    */
  def getGame(params: GetGameRequest): Request[GetGameResult, AWSError] = js.native
  def getGame(params: GetGameRequest, callback: js.Function2[/* err */ AWSError, /* data */ GetGameResult, Unit]): Request[GetGameResult, AWSError] = js.native
  
  /**
    * Gets the configuration of the game.
    */
  def getGameConfiguration(): Request[GetGameConfigurationResult, AWSError] = js.native
  def getGameConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ GetGameConfigurationResult, Unit]): Request[GetGameConfigurationResult, AWSError] = js.native
  /**
    * Gets the configuration of the game.
    */
  def getGameConfiguration(params: GetGameConfigurationRequest): Request[GetGameConfigurationResult, AWSError] = js.native
  def getGameConfiguration(
    params: GetGameConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetGameConfigurationResult, Unit]
  ): Request[GetGameConfigurationResult, AWSError] = js.native
  
  /**
    * Gets details about a job that is generating code for a snapshot.
    */
  def getGeneratedCodeJob(): Request[GetGeneratedCodeJobResult, AWSError] = js.native
  def getGeneratedCodeJob(callback: js.Function2[/* err */ AWSError, /* data */ GetGeneratedCodeJobResult, Unit]): Request[GetGeneratedCodeJobResult, AWSError] = js.native
  /**
    * Gets details about a job that is generating code for a snapshot.
    */
  def getGeneratedCodeJob(params: GetGeneratedCodeJobRequest): Request[GetGeneratedCodeJobResult, AWSError] = js.native
  def getGeneratedCodeJob(
    params: GetGeneratedCodeJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetGeneratedCodeJobResult, Unit]
  ): Request[GetGeneratedCodeJobResult, AWSError] = js.native
  
  /**
    * Gets the status of a player's connection to the game runtime.  It's possible for a single player to have multiple connections to the game runtime. If a player is not connected, this operation returns an empty list. 
    */
  def getPlayerConnectionStatus(): Request[GetPlayerConnectionStatusResult, AWSError] = js.native
  def getPlayerConnectionStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetPlayerConnectionStatusResult, Unit]): Request[GetPlayerConnectionStatusResult, AWSError] = js.native
  /**
    * Gets the status of a player's connection to the game runtime.  It's possible for a single player to have multiple connections to the game runtime. If a player is not connected, this operation returns an empty list. 
    */
  def getPlayerConnectionStatus(params: GetPlayerConnectionStatusRequest): Request[GetPlayerConnectionStatusResult, AWSError] = js.native
  def getPlayerConnectionStatus(
    params: GetPlayerConnectionStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPlayerConnectionStatusResult, Unit]
  ): Request[GetPlayerConnectionStatusResult, AWSError] = js.native
  
  /**
    * Gets a copy of the game configuration in a snapshot.
    */
  def getSnapshot(): Request[GetSnapshotResult, AWSError] = js.native
  def getSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ GetSnapshotResult, Unit]): Request[GetSnapshotResult, AWSError] = js.native
  /**
    * Gets a copy of the game configuration in a snapshot.
    */
  def getSnapshot(params: GetSnapshotRequest): Request[GetSnapshotResult, AWSError] = js.native
  def getSnapshot(
    params: GetSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSnapshotResult, Unit]
  ): Request[GetSnapshotResult, AWSError] = js.native
  
  /**
    * Gets information about a stage.
    */
  def getStage(): Request[GetStageResult, AWSError] = js.native
  def getStage(callback: js.Function2[/* err */ AWSError, /* data */ GetStageResult, Unit]): Request[GetStageResult, AWSError] = js.native
  /**
    * Gets information about a stage.
    */
  def getStage(params: GetStageRequest): Request[GetStageResult, AWSError] = js.native
  def getStage(
    params: GetStageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStageResult, Unit]
  ): Request[GetStageResult, AWSError] = js.native
  
  /**
    * Gets information about a stage deployment.
    */
  def getStageDeployment(): Request[GetStageDeploymentResult, AWSError] = js.native
  def getStageDeployment(callback: js.Function2[/* err */ AWSError, /* data */ GetStageDeploymentResult, Unit]): Request[GetStageDeploymentResult, AWSError] = js.native
  /**
    * Gets information about a stage deployment.
    */
  def getStageDeployment(params: GetStageDeploymentRequest): Request[GetStageDeploymentResult, AWSError] = js.native
  def getStageDeployment(
    params: GetStageDeploymentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStageDeploymentResult, Unit]
  ): Request[GetStageDeploymentResult, AWSError] = js.native
  
  /**
    * Imports a game configuration.  This operation replaces the current configuration of the game with the provided input. This is not a reversible operation. If you want to preserve the previous configuration, use CreateSnapshot to make a new snapshot before importing. 
    */
  def importGameConfiguration(): Request[ImportGameConfigurationResult, AWSError] = js.native
  def importGameConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ ImportGameConfigurationResult, Unit]): Request[ImportGameConfigurationResult, AWSError] = js.native
  /**
    * Imports a game configuration.  This operation replaces the current configuration of the game with the provided input. This is not a reversible operation. If you want to preserve the previous configuration, use CreateSnapshot to make a new snapshot before importing. 
    */
  def importGameConfiguration(params: ImportGameConfigurationRequest): Request[ImportGameConfigurationResult, AWSError] = js.native
  def importGameConfiguration(
    params: ImportGameConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ImportGameConfigurationResult, Unit]
  ): Request[ImportGameConfigurationResult, AWSError] = js.native
  
  /**
    * Gets a paginated list of available versions for the extension.  Each time an API change is made to an extension, the version is incremented. The list retrieved by this operation shows the versions that are currently available. 
    */
  def listExtensionVersions(): Request[ListExtensionVersionsResult, AWSError] = js.native
  def listExtensionVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListExtensionVersionsResult, Unit]): Request[ListExtensionVersionsResult, AWSError] = js.native
  /**
    * Gets a paginated list of available versions for the extension.  Each time an API change is made to an extension, the version is incremented. The list retrieved by this operation shows the versions that are currently available. 
    */
  def listExtensionVersions(params: ListExtensionVersionsRequest): Request[ListExtensionVersionsResult, AWSError] = js.native
  def listExtensionVersions(
    params: ListExtensionVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListExtensionVersionsResult, Unit]
  ): Request[ListExtensionVersionsResult, AWSError] = js.native
  
  /**
    * Gets a paginated list of available extensions.  Extensions provide features that games can use from scripts. 
    */
  def listExtensions(): Request[ListExtensionsResult, AWSError] = js.native
  def listExtensions(callback: js.Function2[/* err */ AWSError, /* data */ ListExtensionsResult, Unit]): Request[ListExtensionsResult, AWSError] = js.native
  /**
    * Gets a paginated list of available extensions.  Extensions provide features that games can use from scripts. 
    */
  def listExtensions(params: ListExtensionsRequest): Request[ListExtensionsResult, AWSError] = js.native
  def listExtensions(
    params: ListExtensionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListExtensionsResult, Unit]
  ): Request[ListExtensionsResult, AWSError] = js.native
  
  /**
    * Gets a paginated list of games.
    */
  def listGames(): Request[ListGamesResult, AWSError] = js.native
  def listGames(callback: js.Function2[/* err */ AWSError, /* data */ ListGamesResult, Unit]): Request[ListGamesResult, AWSError] = js.native
  /**
    * Gets a paginated list of games.
    */
  def listGames(params: ListGamesRequest): Request[ListGamesResult, AWSError] = js.native
  def listGames(
    params: ListGamesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGamesResult, Unit]
  ): Request[ListGamesResult, AWSError] = js.native
  
  /**
    * Gets a paginated list of code generation jobs for a snapshot.
    */
  def listGeneratedCodeJobs(): Request[ListGeneratedCodeJobsResult, AWSError] = js.native
  def listGeneratedCodeJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListGeneratedCodeJobsResult, Unit]): Request[ListGeneratedCodeJobsResult, AWSError] = js.native
  /**
    * Gets a paginated list of code generation jobs for a snapshot.
    */
  def listGeneratedCodeJobs(params: ListGeneratedCodeJobsRequest): Request[ListGeneratedCodeJobsResult, AWSError] = js.native
  def listGeneratedCodeJobs(
    params: ListGeneratedCodeJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGeneratedCodeJobsResult, Unit]
  ): Request[ListGeneratedCodeJobsResult, AWSError] = js.native
  
  /**
    * Gets a paginated list of snapshot summaries from the game.
    */
  def listSnapshots(): Request[ListSnapshotsResult, AWSError] = js.native
  def listSnapshots(callback: js.Function2[/* err */ AWSError, /* data */ ListSnapshotsResult, Unit]): Request[ListSnapshotsResult, AWSError] = js.native
  /**
    * Gets a paginated list of snapshot summaries from the game.
    */
  def listSnapshots(params: ListSnapshotsRequest): Request[ListSnapshotsResult, AWSError] = js.native
  def listSnapshots(
    params: ListSnapshotsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSnapshotsResult, Unit]
  ): Request[ListSnapshotsResult, AWSError] = js.native
  
  /**
    * Gets a paginated list of stage deployment summaries from the game.
    */
  def listStageDeployments(): Request[ListStageDeploymentsResult, AWSError] = js.native
  def listStageDeployments(callback: js.Function2[/* err */ AWSError, /* data */ ListStageDeploymentsResult, Unit]): Request[ListStageDeploymentsResult, AWSError] = js.native
  /**
    * Gets a paginated list of stage deployment summaries from the game.
    */
  def listStageDeployments(params: ListStageDeploymentsRequest): Request[ListStageDeploymentsResult, AWSError] = js.native
  def listStageDeployments(
    params: ListStageDeploymentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStageDeploymentsResult, Unit]
  ): Request[ListStageDeploymentsResult, AWSError] = js.native
  
  /**
    * Gets a paginated list of stage summaries from the game.
    */
  def listStages(): Request[ListStagesResult, AWSError] = js.native
  def listStages(callback: js.Function2[/* err */ AWSError, /* data */ ListStagesResult, Unit]): Request[ListStagesResult, AWSError] = js.native
  /**
    * Gets a paginated list of stage summaries from the game.
    */
  def listStages(params: ListStagesRequest): Request[ListStagesResult, AWSError] = js.native
  def listStages(
    params: ListStagesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStagesResult, Unit]
  ): Request[ListStagesResult, AWSError] = js.native
  
  /**
    * Lists the tags associated with a GameSparks resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResult, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResult, Unit]): Request[ListTagsForResourceResult, AWSError] = js.native
  /**
    * Lists the tags associated with a GameSparks resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResult, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResult, Unit]
  ): Request[ListTagsForResourceResult, AWSError] = js.native
  
  /**
    *  Starts an asynchronous process that generates client code for system-defined and custom messages. The resulting code is collected as a .zip file and uploaded to a pre-signed Amazon S3 URL. 
    */
  def startGeneratedCodeJob(): Request[StartGeneratedCodeJobResult, AWSError] = js.native
  def startGeneratedCodeJob(callback: js.Function2[/* err */ AWSError, /* data */ StartGeneratedCodeJobResult, Unit]): Request[StartGeneratedCodeJobResult, AWSError] = js.native
  /**
    *  Starts an asynchronous process that generates client code for system-defined and custom messages. The resulting code is collected as a .zip file and uploaded to a pre-signed Amazon S3 URL. 
    */
  def startGeneratedCodeJob(params: StartGeneratedCodeJobRequest): Request[StartGeneratedCodeJobResult, AWSError] = js.native
  def startGeneratedCodeJob(
    params: StartGeneratedCodeJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartGeneratedCodeJobResult, Unit]
  ): Request[StartGeneratedCodeJobResult, AWSError] = js.native
  
  /**
    * Deploys a snapshot to the stage and creates a new game runtime.  After you call this operation, you can check the deployment status by using GetStageDeployment.   If there are any players connected to the previous game runtime, then both runtimes persist. Existing connections to the previous runtime are maintained. When players disconnect and reconnect, they connect to the new runtime. After there are no connections to the previous game runtime, it is deleted. 
    */
  def startStageDeployment(): Request[StartStageDeploymentResult, AWSError] = js.native
  def startStageDeployment(callback: js.Function2[/* err */ AWSError, /* data */ StartStageDeploymentResult, Unit]): Request[StartStageDeploymentResult, AWSError] = js.native
  /**
    * Deploys a snapshot to the stage and creates a new game runtime.  After you call this operation, you can check the deployment status by using GetStageDeployment.   If there are any players connected to the previous game runtime, then both runtimes persist. Existing connections to the previous runtime are maintained. When players disconnect and reconnect, they connect to the new runtime. After there are no connections to the previous game runtime, it is deleted. 
    */
  def startStageDeployment(params: StartStageDeploymentRequest): Request[StartStageDeploymentResult, AWSError] = js.native
  def startStageDeployment(
    params: StartStageDeploymentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartStageDeploymentResult, Unit]
  ): Request[StartStageDeploymentResult, AWSError] = js.native
  
  /**
    * Adds tags to a GameSparks resource.
    */
  def tagResource(): Request[TagResourceResult, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResult, Unit]): Request[TagResourceResult, AWSError] = js.native
  /**
    * Adds tags to a GameSparks resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResult, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResult, Unit]
  ): Request[TagResourceResult, AWSError] = js.native
  
  /**
    * Removes tags from a GameSparks resource.
    */
  def untagResource(): Request[UntagResourceResult, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResult, Unit]): Request[UntagResourceResult, AWSError] = js.native
  /**
    * Removes tags from a GameSparks resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResult, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResult, Unit]
  ): Request[UntagResourceResult, AWSError] = js.native
  
  /**
    * Updates details of the game.
    */
  def updateGame(): Request[UpdateGameResult, AWSError] = js.native
  def updateGame(callback: js.Function2[/* err */ AWSError, /* data */ UpdateGameResult, Unit]): Request[UpdateGameResult, AWSError] = js.native
  /**
    * Updates details of the game.
    */
  def updateGame(params: UpdateGameRequest): Request[UpdateGameResult, AWSError] = js.native
  def updateGame(
    params: UpdateGameRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateGameResult, Unit]
  ): Request[UpdateGameResult, AWSError] = js.native
  
  /**
    * Updates one or more sections of the game configuration.
    */
  def updateGameConfiguration(): Request[UpdateGameConfigurationResult, AWSError] = js.native
  def updateGameConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ UpdateGameConfigurationResult, Unit]): Request[UpdateGameConfigurationResult, AWSError] = js.native
  /**
    * Updates one or more sections of the game configuration.
    */
  def updateGameConfiguration(params: UpdateGameConfigurationRequest): Request[UpdateGameConfigurationResult, AWSError] = js.native
  def updateGameConfiguration(
    params: UpdateGameConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateGameConfigurationResult, Unit]
  ): Request[UpdateGameConfigurationResult, AWSError] = js.native
  
  /**
    * Updates the metadata of a GameSparks snapshot.
    */
  def updateSnapshot(): Request[UpdateSnapshotResult, AWSError] = js.native
  def updateSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSnapshotResult, Unit]): Request[UpdateSnapshotResult, AWSError] = js.native
  /**
    * Updates the metadata of a GameSparks snapshot.
    */
  def updateSnapshot(params: UpdateSnapshotRequest): Request[UpdateSnapshotResult, AWSError] = js.native
  def updateSnapshot(
    params: UpdateSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSnapshotResult, Unit]
  ): Request[UpdateSnapshotResult, AWSError] = js.native
  
  /**
    * Updates the metadata of a stage.
    */
  def updateStage(): Request[UpdateStageResult, AWSError] = js.native
  def updateStage(callback: js.Function2[/* err */ AWSError, /* data */ UpdateStageResult, Unit]): Request[UpdateStageResult, AWSError] = js.native
  /**
    * Updates the metadata of a stage.
    */
  def updateStage(params: UpdateStageRequest): Request[UpdateStageResult, AWSError] = js.native
  def updateStage(
    params: UpdateStageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateStageResult, Unit]
  ): Request[UpdateStageResult, AWSError] = js.native
}
