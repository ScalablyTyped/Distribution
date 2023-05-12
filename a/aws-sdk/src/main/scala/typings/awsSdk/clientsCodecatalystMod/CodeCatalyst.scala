package typings.awsSdk.clientsCodecatalystMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeCatalyst extends Service {
  
  @JSName("config")
  var config_CodeCatalyst: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a personal access token (PAT) for the current user. A personal access token (PAT) is similar to a password. It is associated with your user identity for use across all spaces and projects in Amazon CodeCatalyst. You use PATs to access CodeCatalyst from resources that include integrated development environments (IDEs) and Git-based source repositories. PATs represent you in Amazon CodeCatalyst and you can manage them in your user settings.For more information, see Managing personal access tokens in Amazon CodeCatalyst.
    */
  def createAccessToken(): Request[CreateAccessTokenResponse, AWSError] = js.native
  def createAccessToken(callback: js.Function2[/* err */ AWSError, /* data */ CreateAccessTokenResponse, Unit]): Request[CreateAccessTokenResponse, AWSError] = js.native
  /**
    * Creates a personal access token (PAT) for the current user. A personal access token (PAT) is similar to a password. It is associated with your user identity for use across all spaces and projects in Amazon CodeCatalyst. You use PATs to access CodeCatalyst from resources that include integrated development environments (IDEs) and Git-based source repositories. PATs represent you in Amazon CodeCatalyst and you can manage them in your user settings.For more information, see Managing personal access tokens in Amazon CodeCatalyst.
    */
  def createAccessToken(params: CreateAccessTokenRequest): Request[CreateAccessTokenResponse, AWSError] = js.native
  def createAccessToken(
    params: CreateAccessTokenRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAccessTokenResponse, Unit]
  ): Request[CreateAccessTokenResponse, AWSError] = js.native
  
  /**
    * Creates a Dev Environment in Amazon CodeCatalyst, a cloud-based development environment that you can use to quickly work on the code stored in the source repositories of your project.   When created in the Amazon CodeCatalyst console, by default a Dev Environment is configured to have a 2 core processor, 4GB of RAM, and 16GB of persistent storage. None of these defaults apply to a Dev Environment created programmatically. 
    */
  def createDevEnvironment(): Request[CreateDevEnvironmentResponse, AWSError] = js.native
  def createDevEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ CreateDevEnvironmentResponse, Unit]): Request[CreateDevEnvironmentResponse, AWSError] = js.native
  /**
    * Creates a Dev Environment in Amazon CodeCatalyst, a cloud-based development environment that you can use to quickly work on the code stored in the source repositories of your project.   When created in the Amazon CodeCatalyst console, by default a Dev Environment is configured to have a 2 core processor, 4GB of RAM, and 16GB of persistent storage. None of these defaults apply to a Dev Environment created programmatically. 
    */
  def createDevEnvironment(params: CreateDevEnvironmentRequest): Request[CreateDevEnvironmentResponse, AWSError] = js.native
  def createDevEnvironment(
    params: CreateDevEnvironmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDevEnvironmentResponse, Unit]
  ): Request[CreateDevEnvironmentResponse, AWSError] = js.native
  
  /**
    * Creates a project in a specified space.
    */
  def createProject(): Request[CreateProjectResponse, AWSError] = js.native
  def createProject(callback: js.Function2[/* err */ AWSError, /* data */ CreateProjectResponse, Unit]): Request[CreateProjectResponse, AWSError] = js.native
  /**
    * Creates a project in a specified space.
    */
  def createProject(params: CreateProjectRequest): Request[CreateProjectResponse, AWSError] = js.native
  def createProject(
    params: CreateProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProjectResponse, Unit]
  ): Request[CreateProjectResponse, AWSError] = js.native
  
  /**
    * Creates a branch in a specified source repository in Amazon CodeCatalyst.   This API only creates a branch in a source repository hosted in Amazon CodeCatalyst. You cannot use this API to create a branch in a linked repository. 
    */
  def createSourceRepositoryBranch(): Request[CreateSourceRepositoryBranchResponse, AWSError] = js.native
  def createSourceRepositoryBranch(callback: js.Function2[/* err */ AWSError, /* data */ CreateSourceRepositoryBranchResponse, Unit]): Request[CreateSourceRepositoryBranchResponse, AWSError] = js.native
  /**
    * Creates a branch in a specified source repository in Amazon CodeCatalyst.   This API only creates a branch in a source repository hosted in Amazon CodeCatalyst. You cannot use this API to create a branch in a linked repository. 
    */
  def createSourceRepositoryBranch(params: CreateSourceRepositoryBranchRequest): Request[CreateSourceRepositoryBranchResponse, AWSError] = js.native
  def createSourceRepositoryBranch(
    params: CreateSourceRepositoryBranchRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSourceRepositoryBranchResponse, Unit]
  ): Request[CreateSourceRepositoryBranchResponse, AWSError] = js.native
  
  /**
    * Deletes a specified personal access token (PAT). A personal access token can only be deleted by the user who created it.
    */
  def deleteAccessToken(): Request[DeleteAccessTokenResponse, AWSError] = js.native
  def deleteAccessToken(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAccessTokenResponse, Unit]): Request[DeleteAccessTokenResponse, AWSError] = js.native
  /**
    * Deletes a specified personal access token (PAT). A personal access token can only be deleted by the user who created it.
    */
  def deleteAccessToken(params: DeleteAccessTokenRequest): Request[DeleteAccessTokenResponse, AWSError] = js.native
  def deleteAccessToken(
    params: DeleteAccessTokenRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAccessTokenResponse, Unit]
  ): Request[DeleteAccessTokenResponse, AWSError] = js.native
  
  /**
    * Deletes a Dev Environment. 
    */
  def deleteDevEnvironment(): Request[DeleteDevEnvironmentResponse, AWSError] = js.native
  def deleteDevEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDevEnvironmentResponse, Unit]): Request[DeleteDevEnvironmentResponse, AWSError] = js.native
  /**
    * Deletes a Dev Environment. 
    */
  def deleteDevEnvironment(params: DeleteDevEnvironmentRequest): Request[DeleteDevEnvironmentResponse, AWSError] = js.native
  def deleteDevEnvironment(
    params: DeleteDevEnvironmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDevEnvironmentResponse, Unit]
  ): Request[DeleteDevEnvironmentResponse, AWSError] = js.native
  
  /**
    * Returns information about a Dev Environment for a source repository in a project. Dev Environments are specific to the user who creates them.
    */
  def getDevEnvironment(): Request[GetDevEnvironmentResponse, AWSError] = js.native
  def getDevEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ GetDevEnvironmentResponse, Unit]): Request[GetDevEnvironmentResponse, AWSError] = js.native
  /**
    * Returns information about a Dev Environment for a source repository in a project. Dev Environments are specific to the user who creates them.
    */
  def getDevEnvironment(params: GetDevEnvironmentRequest): Request[GetDevEnvironmentResponse, AWSError] = js.native
  def getDevEnvironment(
    params: GetDevEnvironmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDevEnvironmentResponse, Unit]
  ): Request[GetDevEnvironmentResponse, AWSError] = js.native
  
  /**
    * Returns information about a project.
    */
  def getProject(): Request[GetProjectResponse, AWSError] = js.native
  def getProject(callback: js.Function2[/* err */ AWSError, /* data */ GetProjectResponse, Unit]): Request[GetProjectResponse, AWSError] = js.native
  /**
    * Returns information about a project.
    */
  def getProject(params: GetProjectRequest): Request[GetProjectResponse, AWSError] = js.native
  def getProject(
    params: GetProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetProjectResponse, Unit]
  ): Request[GetProjectResponse, AWSError] = js.native
  
  /**
    * Returns information about the URLs that can be used with a Git client to clone a source repository.
    */
  def getSourceRepositoryCloneUrls(): Request[GetSourceRepositoryCloneUrlsResponse, AWSError] = js.native
  def getSourceRepositoryCloneUrls(callback: js.Function2[/* err */ AWSError, /* data */ GetSourceRepositoryCloneUrlsResponse, Unit]): Request[GetSourceRepositoryCloneUrlsResponse, AWSError] = js.native
  /**
    * Returns information about the URLs that can be used with a Git client to clone a source repository.
    */
  def getSourceRepositoryCloneUrls(params: GetSourceRepositoryCloneUrlsRequest): Request[GetSourceRepositoryCloneUrlsResponse, AWSError] = js.native
  def getSourceRepositoryCloneUrls(
    params: GetSourceRepositoryCloneUrlsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSourceRepositoryCloneUrlsResponse, Unit]
  ): Request[GetSourceRepositoryCloneUrlsResponse, AWSError] = js.native
  
  /**
    * Returns information about an space.
    */
  def getSpace(): Request[GetSpaceResponse, AWSError] = js.native
  def getSpace(callback: js.Function2[/* err */ AWSError, /* data */ GetSpaceResponse, Unit]): Request[GetSpaceResponse, AWSError] = js.native
  /**
    * Returns information about an space.
    */
  def getSpace(params: GetSpaceRequest): Request[GetSpaceResponse, AWSError] = js.native
  def getSpace(
    params: GetSpaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSpaceResponse, Unit]
  ): Request[GetSpaceResponse, AWSError] = js.native
  
  /**
    * Returns information about the Amazon Web Services account used for billing purposes and the billing plan for the space.
    */
  def getSubscription(): Request[GetSubscriptionResponse, AWSError] = js.native
  def getSubscription(callback: js.Function2[/* err */ AWSError, /* data */ GetSubscriptionResponse, Unit]): Request[GetSubscriptionResponse, AWSError] = js.native
  /**
    * Returns information about the Amazon Web Services account used for billing purposes and the billing plan for the space.
    */
  def getSubscription(params: GetSubscriptionRequest): Request[GetSubscriptionResponse, AWSError] = js.native
  def getSubscription(
    params: GetSubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSubscriptionResponse, Unit]
  ): Request[GetSubscriptionResponse, AWSError] = js.native
  
  /**
    * Returns information about a user. 
    */
  def getUserDetails(): Request[GetUserDetailsResponse, AWSError] = js.native
  def getUserDetails(callback: js.Function2[/* err */ AWSError, /* data */ GetUserDetailsResponse, Unit]): Request[GetUserDetailsResponse, AWSError] = js.native
  /**
    * Returns information about a user. 
    */
  def getUserDetails(params: GetUserDetailsRequest): Request[GetUserDetailsResponse, AWSError] = js.native
  def getUserDetails(
    params: GetUserDetailsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetUserDetailsResponse, Unit]
  ): Request[GetUserDetailsResponse, AWSError] = js.native
  
  /**
    * Lists all personal access tokens (PATs) associated with the user who calls the API. You can only list PATs associated with your Amazon Web Services Builder ID.
    */
  def listAccessTokens(): Request[ListAccessTokensResponse, AWSError] = js.native
  def listAccessTokens(callback: js.Function2[/* err */ AWSError, /* data */ ListAccessTokensResponse, Unit]): Request[ListAccessTokensResponse, AWSError] = js.native
  /**
    * Lists all personal access tokens (PATs) associated with the user who calls the API. You can only list PATs associated with your Amazon Web Services Builder ID.
    */
  def listAccessTokens(params: ListAccessTokensRequest): Request[ListAccessTokensResponse, AWSError] = js.native
  def listAccessTokens(
    params: ListAccessTokensRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAccessTokensResponse, Unit]
  ): Request[ListAccessTokensResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of Dev Environments in a project.
    */
  def listDevEnvironments(): Request[ListDevEnvironmentsResponse, AWSError] = js.native
  def listDevEnvironments(callback: js.Function2[/* err */ AWSError, /* data */ ListDevEnvironmentsResponse, Unit]): Request[ListDevEnvironmentsResponse, AWSError] = js.native
  /**
    * Retrieves a list of Dev Environments in a project.
    */
  def listDevEnvironments(params: ListDevEnvironmentsRequest): Request[ListDevEnvironmentsResponse, AWSError] = js.native
  def listDevEnvironments(
    params: ListDevEnvironmentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDevEnvironmentsResponse, Unit]
  ): Request[ListDevEnvironmentsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of events that occurred during a specified time period in a space. You can use these events to audit user and system activity in a space.
    */
  def listEventLogs(): Request[ListEventLogsResponse, AWSError] = js.native
  def listEventLogs(callback: js.Function2[/* err */ AWSError, /* data */ ListEventLogsResponse, Unit]): Request[ListEventLogsResponse, AWSError] = js.native
  /**
    * Retrieves a list of events that occurred during a specified time period in a space. You can use these events to audit user and system activity in a space.
    */
  def listEventLogs(params: ListEventLogsRequest): Request[ListEventLogsResponse, AWSError] = js.native
  def listEventLogs(
    params: ListEventLogsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEventLogsResponse, Unit]
  ): Request[ListEventLogsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of projects.
    */
  def listProjects(): Request[ListProjectsResponse, AWSError] = js.native
  def listProjects(callback: js.Function2[/* err */ AWSError, /* data */ ListProjectsResponse, Unit]): Request[ListProjectsResponse, AWSError] = js.native
  /**
    * Retrieves a list of projects.
    */
  def listProjects(params: ListProjectsRequest): Request[ListProjectsResponse, AWSError] = js.native
  def listProjects(
    params: ListProjectsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProjectsResponse, Unit]
  ): Request[ListProjectsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of source repositories in a project.
    */
  def listSourceRepositories(): Request[ListSourceRepositoriesResponse, AWSError] = js.native
  def listSourceRepositories(callback: js.Function2[/* err */ AWSError, /* data */ ListSourceRepositoriesResponse, Unit]): Request[ListSourceRepositoriesResponse, AWSError] = js.native
  /**
    * Retrieves a list of source repositories in a project.
    */
  def listSourceRepositories(params: ListSourceRepositoriesRequest): Request[ListSourceRepositoriesResponse, AWSError] = js.native
  def listSourceRepositories(
    params: ListSourceRepositoriesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSourceRepositoriesResponse, Unit]
  ): Request[ListSourceRepositoriesResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of branches in a specified source repository.
    */
  def listSourceRepositoryBranches(): Request[ListSourceRepositoryBranchesResponse, AWSError] = js.native
  def listSourceRepositoryBranches(callback: js.Function2[/* err */ AWSError, /* data */ ListSourceRepositoryBranchesResponse, Unit]): Request[ListSourceRepositoryBranchesResponse, AWSError] = js.native
  /**
    * Retrieves a list of branches in a specified source repository.
    */
  def listSourceRepositoryBranches(params: ListSourceRepositoryBranchesRequest): Request[ListSourceRepositoryBranchesResponse, AWSError] = js.native
  def listSourceRepositoryBranches(
    params: ListSourceRepositoryBranchesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSourceRepositoryBranchesResponse, Unit]
  ): Request[ListSourceRepositoryBranchesResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of spaces.
    */
  def listSpaces(): Request[ListSpacesResponse, AWSError] = js.native
  def listSpaces(callback: js.Function2[/* err */ AWSError, /* data */ ListSpacesResponse, Unit]): Request[ListSpacesResponse, AWSError] = js.native
  /**
    * Retrieves a list of spaces.
    */
  def listSpaces(params: ListSpacesRequest): Request[ListSpacesResponse, AWSError] = js.native
  def listSpaces(
    params: ListSpacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSpacesResponse, Unit]
  ): Request[ListSpacesResponse, AWSError] = js.native
  
  /**
    * Starts a specified Dev Environment and puts it into an active state. 
    */
  def startDevEnvironment(): Request[StartDevEnvironmentResponse, AWSError] = js.native
  def startDevEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ StartDevEnvironmentResponse, Unit]): Request[StartDevEnvironmentResponse, AWSError] = js.native
  /**
    * Starts a specified Dev Environment and puts it into an active state. 
    */
  def startDevEnvironment(params: StartDevEnvironmentRequest): Request[StartDevEnvironmentResponse, AWSError] = js.native
  def startDevEnvironment(
    params: StartDevEnvironmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartDevEnvironmentResponse, Unit]
  ): Request[StartDevEnvironmentResponse, AWSError] = js.native
  
  /**
    * Starts a session for a specified Dev Environment.
    */
  def startDevEnvironmentSession(): Request[StartDevEnvironmentSessionResponse, AWSError] = js.native
  def startDevEnvironmentSession(callback: js.Function2[/* err */ AWSError, /* data */ StartDevEnvironmentSessionResponse, Unit]): Request[StartDevEnvironmentSessionResponse, AWSError] = js.native
  /**
    * Starts a session for a specified Dev Environment.
    */
  def startDevEnvironmentSession(params: StartDevEnvironmentSessionRequest): Request[StartDevEnvironmentSessionResponse, AWSError] = js.native
  def startDevEnvironmentSession(
    params: StartDevEnvironmentSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartDevEnvironmentSessionResponse, Unit]
  ): Request[StartDevEnvironmentSessionResponse, AWSError] = js.native
  
  /**
    * Pauses a specified Dev Environment and places it in a non-running state. Stopped Dev Environments do not consume compute minutes.
    */
  def stopDevEnvironment(): Request[StopDevEnvironmentResponse, AWSError] = js.native
  def stopDevEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ StopDevEnvironmentResponse, Unit]): Request[StopDevEnvironmentResponse, AWSError] = js.native
  /**
    * Pauses a specified Dev Environment and places it in a non-running state. Stopped Dev Environments do not consume compute minutes.
    */
  def stopDevEnvironment(params: StopDevEnvironmentRequest): Request[StopDevEnvironmentResponse, AWSError] = js.native
  def stopDevEnvironment(
    params: StopDevEnvironmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopDevEnvironmentResponse, Unit]
  ): Request[StopDevEnvironmentResponse, AWSError] = js.native
  
  /**
    * Stops a session for a specified Dev Environment.
    */
  def stopDevEnvironmentSession(): Request[StopDevEnvironmentSessionResponse, AWSError] = js.native
  def stopDevEnvironmentSession(callback: js.Function2[/* err */ AWSError, /* data */ StopDevEnvironmentSessionResponse, Unit]): Request[StopDevEnvironmentSessionResponse, AWSError] = js.native
  /**
    * Stops a session for a specified Dev Environment.
    */
  def stopDevEnvironmentSession(params: StopDevEnvironmentSessionRequest): Request[StopDevEnvironmentSessionResponse, AWSError] = js.native
  def stopDevEnvironmentSession(
    params: StopDevEnvironmentSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopDevEnvironmentSessionResponse, Unit]
  ): Request[StopDevEnvironmentSessionResponse, AWSError] = js.native
  
  /**
    * Changes one or more values for a Dev Environment. Updating certain values of the Dev Environment will cause a restart.
    */
  def updateDevEnvironment(): Request[UpdateDevEnvironmentResponse, AWSError] = js.native
  def updateDevEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDevEnvironmentResponse, Unit]): Request[UpdateDevEnvironmentResponse, AWSError] = js.native
  /**
    * Changes one or more values for a Dev Environment. Updating certain values of the Dev Environment will cause a restart.
    */
  def updateDevEnvironment(params: UpdateDevEnvironmentRequest): Request[UpdateDevEnvironmentResponse, AWSError] = js.native
  def updateDevEnvironment(
    params: UpdateDevEnvironmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDevEnvironmentResponse, Unit]
  ): Request[UpdateDevEnvironmentResponse, AWSError] = js.native
  
  /**
    * Verifies whether the calling user has a valid Amazon CodeCatalyst login and session. If successful, this returns the ID of the user in Amazon CodeCatalyst.
    */
  def verifySession(): Request[VerifySessionResponse, AWSError] = js.native
  def verifySession(callback: js.Function2[/* err */ AWSError, /* data */ VerifySessionResponse, Unit]): Request[VerifySessionResponse, AWSError] = js.native
}
