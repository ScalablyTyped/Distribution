package typings.awsSdk.amplifyMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Amplify extends Service {
  @JSName("config")
  var config_Amplify: ConfigBase with ClientConfiguration = js.native
  /**
    *  Creates a new Amplify app. 
    */
  def createApp(): Request[CreateAppResult, AWSError] = js.native
  def createApp(callback: js.Function2[/* err */ AWSError, /* data */ CreateAppResult, Unit]): Request[CreateAppResult, AWSError] = js.native
  /**
    *  Creates a new Amplify app. 
    */
  def createApp(params: CreateAppRequest): Request[CreateAppResult, AWSError] = js.native
  def createApp(
    params: CreateAppRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAppResult, Unit]
  ): Request[CreateAppResult, AWSError] = js.native
  /**
    *  Creates a new backend environment for an Amplify app. 
    */
  def createBackendEnvironment(): Request[CreateBackendEnvironmentResult, AWSError] = js.native
  def createBackendEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ CreateBackendEnvironmentResult, Unit]): Request[CreateBackendEnvironmentResult, AWSError] = js.native
  /**
    *  Creates a new backend environment for an Amplify app. 
    */
  def createBackendEnvironment(params: CreateBackendEnvironmentRequest): Request[CreateBackendEnvironmentResult, AWSError] = js.native
  def createBackendEnvironment(
    params: CreateBackendEnvironmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateBackendEnvironmentResult, Unit]
  ): Request[CreateBackendEnvironmentResult, AWSError] = js.native
  /**
    *  Creates a new branch for an Amplify app. 
    */
  def createBranch(): Request[CreateBranchResult, AWSError] = js.native
  def createBranch(callback: js.Function2[/* err */ AWSError, /* data */ CreateBranchResult, Unit]): Request[CreateBranchResult, AWSError] = js.native
  /**
    *  Creates a new branch for an Amplify app. 
    */
  def createBranch(params: CreateBranchRequest): Request[CreateBranchResult, AWSError] = js.native
  def createBranch(
    params: CreateBranchRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateBranchResult, Unit]
  ): Request[CreateBranchResult, AWSError] = js.native
  /**
    *  Creates a deployment for a manually deployed Amplify app. Manually deployed apps are not connected to a repository. 
    */
  def createDeployment(): Request[CreateDeploymentResult, AWSError] = js.native
  def createDeployment(callback: js.Function2[/* err */ AWSError, /* data */ CreateDeploymentResult, Unit]): Request[CreateDeploymentResult, AWSError] = js.native
  /**
    *  Creates a deployment for a manually deployed Amplify app. Manually deployed apps are not connected to a repository. 
    */
  def createDeployment(params: CreateDeploymentRequest): Request[CreateDeploymentResult, AWSError] = js.native
  def createDeployment(
    params: CreateDeploymentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDeploymentResult, Unit]
  ): Request[CreateDeploymentResult, AWSError] = js.native
  /**
    *  Creates a new domain association for an Amplify app. This action associates a custom domain with the Amplify app 
    */
  def createDomainAssociation(): Request[CreateDomainAssociationResult, AWSError] = js.native
  def createDomainAssociation(callback: js.Function2[/* err */ AWSError, /* data */ CreateDomainAssociationResult, Unit]): Request[CreateDomainAssociationResult, AWSError] = js.native
  /**
    *  Creates a new domain association for an Amplify app. This action associates a custom domain with the Amplify app 
    */
  def createDomainAssociation(params: CreateDomainAssociationRequest): Request[CreateDomainAssociationResult, AWSError] = js.native
  def createDomainAssociation(
    params: CreateDomainAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDomainAssociationResult, Unit]
  ): Request[CreateDomainAssociationResult, AWSError] = js.native
  /**
    *  Creates a new webhook on an Amplify app. 
    */
  def createWebhook(): Request[CreateWebhookResult, AWSError] = js.native
  def createWebhook(callback: js.Function2[/* err */ AWSError, /* data */ CreateWebhookResult, Unit]): Request[CreateWebhookResult, AWSError] = js.native
  /**
    *  Creates a new webhook on an Amplify app. 
    */
  def createWebhook(params: CreateWebhookRequest): Request[CreateWebhookResult, AWSError] = js.native
  def createWebhook(
    params: CreateWebhookRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWebhookResult, Unit]
  ): Request[CreateWebhookResult, AWSError] = js.native
  /**
    *  Deletes an existing Amplify app specified by an app ID. 
    */
  def deleteApp(): Request[DeleteAppResult, AWSError] = js.native
  def deleteApp(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAppResult, Unit]): Request[DeleteAppResult, AWSError] = js.native
  /**
    *  Deletes an existing Amplify app specified by an app ID. 
    */
  def deleteApp(params: DeleteAppRequest): Request[DeleteAppResult, AWSError] = js.native
  def deleteApp(
    params: DeleteAppRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAppResult, Unit]
  ): Request[DeleteAppResult, AWSError] = js.native
  /**
    *  Deletes a backend environment for an Amplify app. 
    */
  def deleteBackendEnvironment(): Request[DeleteBackendEnvironmentResult, AWSError] = js.native
  def deleteBackendEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ DeleteBackendEnvironmentResult, Unit]): Request[DeleteBackendEnvironmentResult, AWSError] = js.native
  /**
    *  Deletes a backend environment for an Amplify app. 
    */
  def deleteBackendEnvironment(params: DeleteBackendEnvironmentRequest): Request[DeleteBackendEnvironmentResult, AWSError] = js.native
  def deleteBackendEnvironment(
    params: DeleteBackendEnvironmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteBackendEnvironmentResult, Unit]
  ): Request[DeleteBackendEnvironmentResult, AWSError] = js.native
  /**
    *  Deletes a branch for an Amplify app. 
    */
  def deleteBranch(): Request[DeleteBranchResult, AWSError] = js.native
  def deleteBranch(callback: js.Function2[/* err */ AWSError, /* data */ DeleteBranchResult, Unit]): Request[DeleteBranchResult, AWSError] = js.native
  /**
    *  Deletes a branch for an Amplify app. 
    */
  def deleteBranch(params: DeleteBranchRequest): Request[DeleteBranchResult, AWSError] = js.native
  def deleteBranch(
    params: DeleteBranchRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteBranchResult, Unit]
  ): Request[DeleteBranchResult, AWSError] = js.native
  /**
    *  Deletes a domain association for an Amplify app. 
    */
  def deleteDomainAssociation(): Request[DeleteDomainAssociationResult, AWSError] = js.native
  def deleteDomainAssociation(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDomainAssociationResult, Unit]): Request[DeleteDomainAssociationResult, AWSError] = js.native
  /**
    *  Deletes a domain association for an Amplify app. 
    */
  def deleteDomainAssociation(params: DeleteDomainAssociationRequest): Request[DeleteDomainAssociationResult, AWSError] = js.native
  def deleteDomainAssociation(
    params: DeleteDomainAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDomainAssociationResult, Unit]
  ): Request[DeleteDomainAssociationResult, AWSError] = js.native
  /**
    *  Deletes a job for a branch of an Amplify app. 
    */
  def deleteJob(): Request[DeleteJobResult, AWSError] = js.native
  def deleteJob(callback: js.Function2[/* err */ AWSError, /* data */ DeleteJobResult, Unit]): Request[DeleteJobResult, AWSError] = js.native
  /**
    *  Deletes a job for a branch of an Amplify app. 
    */
  def deleteJob(params: DeleteJobRequest): Request[DeleteJobResult, AWSError] = js.native
  def deleteJob(
    params: DeleteJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteJobResult, Unit]
  ): Request[DeleteJobResult, AWSError] = js.native
  /**
    *  Deletes a webhook. 
    */
  def deleteWebhook(): Request[DeleteWebhookResult, AWSError] = js.native
  def deleteWebhook(callback: js.Function2[/* err */ AWSError, /* data */ DeleteWebhookResult, Unit]): Request[DeleteWebhookResult, AWSError] = js.native
  /**
    *  Deletes a webhook. 
    */
  def deleteWebhook(params: DeleteWebhookRequest): Request[DeleteWebhookResult, AWSError] = js.native
  def deleteWebhook(
    params: DeleteWebhookRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteWebhookResult, Unit]
  ): Request[DeleteWebhookResult, AWSError] = js.native
  /**
    *  Returns the website access logs for a specific time range using a presigned URL. 
    */
  def generateAccessLogs(): Request[GenerateAccessLogsResult, AWSError] = js.native
  def generateAccessLogs(callback: js.Function2[/* err */ AWSError, /* data */ GenerateAccessLogsResult, Unit]): Request[GenerateAccessLogsResult, AWSError] = js.native
  /**
    *  Returns the website access logs for a specific time range using a presigned URL. 
    */
  def generateAccessLogs(params: GenerateAccessLogsRequest): Request[GenerateAccessLogsResult, AWSError] = js.native
  def generateAccessLogs(
    params: GenerateAccessLogsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GenerateAccessLogsResult, Unit]
  ): Request[GenerateAccessLogsResult, AWSError] = js.native
  /**
    *  Returns an existing Amplify app by appID. 
    */
  def getApp(): Request[GetAppResult, AWSError] = js.native
  def getApp(callback: js.Function2[/* err */ AWSError, /* data */ GetAppResult, Unit]): Request[GetAppResult, AWSError] = js.native
  /**
    *  Returns an existing Amplify app by appID. 
    */
  def getApp(params: GetAppRequest): Request[GetAppResult, AWSError] = js.native
  def getApp(params: GetAppRequest, callback: js.Function2[/* err */ AWSError, /* data */ GetAppResult, Unit]): Request[GetAppResult, AWSError] = js.native
  /**
    *  Returns the artifact info that corresponds to an artifact id. 
    */
  def getArtifactUrl(): Request[GetArtifactUrlResult, AWSError] = js.native
  def getArtifactUrl(callback: js.Function2[/* err */ AWSError, /* data */ GetArtifactUrlResult, Unit]): Request[GetArtifactUrlResult, AWSError] = js.native
  /**
    *  Returns the artifact info that corresponds to an artifact id. 
    */
  def getArtifactUrl(params: GetArtifactUrlRequest): Request[GetArtifactUrlResult, AWSError] = js.native
  def getArtifactUrl(
    params: GetArtifactUrlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetArtifactUrlResult, Unit]
  ): Request[GetArtifactUrlResult, AWSError] = js.native
  /**
    *  Returns a backend environment for an Amplify app. 
    */
  def getBackendEnvironment(): Request[GetBackendEnvironmentResult, AWSError] = js.native
  def getBackendEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ GetBackendEnvironmentResult, Unit]): Request[GetBackendEnvironmentResult, AWSError] = js.native
  /**
    *  Returns a backend environment for an Amplify app. 
    */
  def getBackendEnvironment(params: GetBackendEnvironmentRequest): Request[GetBackendEnvironmentResult, AWSError] = js.native
  def getBackendEnvironment(
    params: GetBackendEnvironmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBackendEnvironmentResult, Unit]
  ): Request[GetBackendEnvironmentResult, AWSError] = js.native
  /**
    *  Returns a branch for an Amplify app. 
    */
  def getBranch(): Request[GetBranchResult, AWSError] = js.native
  def getBranch(callback: js.Function2[/* err */ AWSError, /* data */ GetBranchResult, Unit]): Request[GetBranchResult, AWSError] = js.native
  /**
    *  Returns a branch for an Amplify app. 
    */
  def getBranch(params: GetBranchRequest): Request[GetBranchResult, AWSError] = js.native
  def getBranch(
    params: GetBranchRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBranchResult, Unit]
  ): Request[GetBranchResult, AWSError] = js.native
  /**
    *  Returns the domain information for an Amplify app. 
    */
  def getDomainAssociation(): Request[GetDomainAssociationResult, AWSError] = js.native
  def getDomainAssociation(callback: js.Function2[/* err */ AWSError, /* data */ GetDomainAssociationResult, Unit]): Request[GetDomainAssociationResult, AWSError] = js.native
  /**
    *  Returns the domain information for an Amplify app. 
    */
  def getDomainAssociation(params: GetDomainAssociationRequest): Request[GetDomainAssociationResult, AWSError] = js.native
  def getDomainAssociation(
    params: GetDomainAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDomainAssociationResult, Unit]
  ): Request[GetDomainAssociationResult, AWSError] = js.native
  /**
    *  Returns a job for a branch of an Amplify app. 
    */
  def getJob(): Request[GetJobResult, AWSError] = js.native
  def getJob(callback: js.Function2[/* err */ AWSError, /* data */ GetJobResult, Unit]): Request[GetJobResult, AWSError] = js.native
  /**
    *  Returns a job for a branch of an Amplify app. 
    */
  def getJob(params: GetJobRequest): Request[GetJobResult, AWSError] = js.native
  def getJob(params: GetJobRequest, callback: js.Function2[/* err */ AWSError, /* data */ GetJobResult, Unit]): Request[GetJobResult, AWSError] = js.native
  /**
    *  Returns the webhook information that corresponds to a specified webhook ID. 
    */
  def getWebhook(): Request[GetWebhookResult, AWSError] = js.native
  def getWebhook(callback: js.Function2[/* err */ AWSError, /* data */ GetWebhookResult, Unit]): Request[GetWebhookResult, AWSError] = js.native
  /**
    *  Returns the webhook information that corresponds to a specified webhook ID. 
    */
  def getWebhook(params: GetWebhookRequest): Request[GetWebhookResult, AWSError] = js.native
  def getWebhook(
    params: GetWebhookRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetWebhookResult, Unit]
  ): Request[GetWebhookResult, AWSError] = js.native
  /**
    *  Returns a list of the existing Amplify apps. 
    */
  def listApps(): Request[ListAppsResult, AWSError] = js.native
  def listApps(callback: js.Function2[/* err */ AWSError, /* data */ ListAppsResult, Unit]): Request[ListAppsResult, AWSError] = js.native
  /**
    *  Returns a list of the existing Amplify apps. 
    */
  def listApps(params: ListAppsRequest): Request[ListAppsResult, AWSError] = js.native
  def listApps(
    params: ListAppsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAppsResult, Unit]
  ): Request[ListAppsResult, AWSError] = js.native
  /**
    *  Returns a list of artifacts for a specified app, branch, and job. 
    */
  def listArtifacts(): Request[ListArtifactsResult, AWSError] = js.native
  def listArtifacts(callback: js.Function2[/* err */ AWSError, /* data */ ListArtifactsResult, Unit]): Request[ListArtifactsResult, AWSError] = js.native
  /**
    *  Returns a list of artifacts for a specified app, branch, and job. 
    */
  def listArtifacts(params: ListArtifactsRequest): Request[ListArtifactsResult, AWSError] = js.native
  def listArtifacts(
    params: ListArtifactsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListArtifactsResult, Unit]
  ): Request[ListArtifactsResult, AWSError] = js.native
  /**
    *  Lists the backend environments for an Amplify app. 
    */
  def listBackendEnvironments(): Request[ListBackendEnvironmentsResult, AWSError] = js.native
  def listBackendEnvironments(callback: js.Function2[/* err */ AWSError, /* data */ ListBackendEnvironmentsResult, Unit]): Request[ListBackendEnvironmentsResult, AWSError] = js.native
  /**
    *  Lists the backend environments for an Amplify app. 
    */
  def listBackendEnvironments(params: ListBackendEnvironmentsRequest): Request[ListBackendEnvironmentsResult, AWSError] = js.native
  def listBackendEnvironments(
    params: ListBackendEnvironmentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBackendEnvironmentsResult, Unit]
  ): Request[ListBackendEnvironmentsResult, AWSError] = js.native
  /**
    *  Lists the branches of an Amplify app. 
    */
  def listBranches(): Request[ListBranchesResult, AWSError] = js.native
  def listBranches(callback: js.Function2[/* err */ AWSError, /* data */ ListBranchesResult, Unit]): Request[ListBranchesResult, AWSError] = js.native
  /**
    *  Lists the branches of an Amplify app. 
    */
  def listBranches(params: ListBranchesRequest): Request[ListBranchesResult, AWSError] = js.native
  def listBranches(
    params: ListBranchesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBranchesResult, Unit]
  ): Request[ListBranchesResult, AWSError] = js.native
  /**
    *  Returns the domain associations for an Amplify app. 
    */
  def listDomainAssociations(): Request[ListDomainAssociationsResult, AWSError] = js.native
  def listDomainAssociations(callback: js.Function2[/* err */ AWSError, /* data */ ListDomainAssociationsResult, Unit]): Request[ListDomainAssociationsResult, AWSError] = js.native
  /**
    *  Returns the domain associations for an Amplify app. 
    */
  def listDomainAssociations(params: ListDomainAssociationsRequest): Request[ListDomainAssociationsResult, AWSError] = js.native
  def listDomainAssociations(
    params: ListDomainAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDomainAssociationsResult, Unit]
  ): Request[ListDomainAssociationsResult, AWSError] = js.native
  /**
    *  Lists the jobs for a branch of an Amplify app. 
    */
  def listJobs(): Request[ListJobsResult, AWSError] = js.native
  def listJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListJobsResult, Unit]): Request[ListJobsResult, AWSError] = js.native
  /**
    *  Lists the jobs for a branch of an Amplify app. 
    */
  def listJobs(params: ListJobsRequest): Request[ListJobsResult, AWSError] = js.native
  def listJobs(
    params: ListJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListJobsResult, Unit]
  ): Request[ListJobsResult, AWSError] = js.native
  /**
    *  Returns a list of tags for a specified Amazon Resource Name (ARN). 
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    *  Returns a list of tags for a specified Amazon Resource Name (ARN). 
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    *  Returns a list of webhooks for an Amplify app. 
    */
  def listWebhooks(): Request[ListWebhooksResult, AWSError] = js.native
  def listWebhooks(callback: js.Function2[/* err */ AWSError, /* data */ ListWebhooksResult, Unit]): Request[ListWebhooksResult, AWSError] = js.native
  /**
    *  Returns a list of webhooks for an Amplify app. 
    */
  def listWebhooks(params: ListWebhooksRequest): Request[ListWebhooksResult, AWSError] = js.native
  def listWebhooks(
    params: ListWebhooksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWebhooksResult, Unit]
  ): Request[ListWebhooksResult, AWSError] = js.native
  /**
    *  Starts a deployment for a manually deployed app. Manually deployed apps are not connected to a repository. 
    */
  def startDeployment(): Request[StartDeploymentResult, AWSError] = js.native
  def startDeployment(callback: js.Function2[/* err */ AWSError, /* data */ StartDeploymentResult, Unit]): Request[StartDeploymentResult, AWSError] = js.native
  /**
    *  Starts a deployment for a manually deployed app. Manually deployed apps are not connected to a repository. 
    */
  def startDeployment(params: StartDeploymentRequest): Request[StartDeploymentResult, AWSError] = js.native
  def startDeployment(
    params: StartDeploymentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartDeploymentResult, Unit]
  ): Request[StartDeploymentResult, AWSError] = js.native
  /**
    *  Starts a new job for a branch of an Amplify app. 
    */
  def startJob(): Request[StartJobResult, AWSError] = js.native
  def startJob(callback: js.Function2[/* err */ AWSError, /* data */ StartJobResult, Unit]): Request[StartJobResult, AWSError] = js.native
  /**
    *  Starts a new job for a branch of an Amplify app. 
    */
  def startJob(params: StartJobRequest): Request[StartJobResult, AWSError] = js.native
  def startJob(
    params: StartJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartJobResult, Unit]
  ): Request[StartJobResult, AWSError] = js.native
  /**
    *  Stops a job that is in progress for a branch of an Amplify app. 
    */
  def stopJob(): Request[StopJobResult, AWSError] = js.native
  def stopJob(callback: js.Function2[/* err */ AWSError, /* data */ StopJobResult, Unit]): Request[StopJobResult, AWSError] = js.native
  /**
    *  Stops a job that is in progress for a branch of an Amplify app. 
    */
  def stopJob(params: StopJobRequest): Request[StopJobResult, AWSError] = js.native
  def stopJob(params: StopJobRequest, callback: js.Function2[/* err */ AWSError, /* data */ StopJobResult, Unit]): Request[StopJobResult, AWSError] = js.native
  /**
    *  Tags the resource with a tag key and value. 
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    *  Tags the resource with a tag key and value. 
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  /**
    *  Untags a resource with a specified Amazon Resource Name (ARN). 
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    *  Untags a resource with a specified Amazon Resource Name (ARN). 
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  /**
    *  Updates an existing Amplify app. 
    */
  def updateApp(): Request[UpdateAppResult, AWSError] = js.native
  def updateApp(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAppResult, Unit]): Request[UpdateAppResult, AWSError] = js.native
  /**
    *  Updates an existing Amplify app. 
    */
  def updateApp(params: UpdateAppRequest): Request[UpdateAppResult, AWSError] = js.native
  def updateApp(
    params: UpdateAppRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAppResult, Unit]
  ): Request[UpdateAppResult, AWSError] = js.native
  /**
    *  Updates a branch for an Amplify app. 
    */
  def updateBranch(): Request[UpdateBranchResult, AWSError] = js.native
  def updateBranch(callback: js.Function2[/* err */ AWSError, /* data */ UpdateBranchResult, Unit]): Request[UpdateBranchResult, AWSError] = js.native
  /**
    *  Updates a branch for an Amplify app. 
    */
  def updateBranch(params: UpdateBranchRequest): Request[UpdateBranchResult, AWSError] = js.native
  def updateBranch(
    params: UpdateBranchRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateBranchResult, Unit]
  ): Request[UpdateBranchResult, AWSError] = js.native
  /**
    *  Creates a new domain association for an Amplify app.
    */
  def updateDomainAssociation(): Request[UpdateDomainAssociationResult, AWSError] = js.native
  def updateDomainAssociation(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDomainAssociationResult, Unit]): Request[UpdateDomainAssociationResult, AWSError] = js.native
  /**
    *  Creates a new domain association for an Amplify app.
    */
  def updateDomainAssociation(params: UpdateDomainAssociationRequest): Request[UpdateDomainAssociationResult, AWSError] = js.native
  def updateDomainAssociation(
    params: UpdateDomainAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDomainAssociationResult, Unit]
  ): Request[UpdateDomainAssociationResult, AWSError] = js.native
  /**
    *  Updates a webhook. 
    */
  def updateWebhook(): Request[UpdateWebhookResult, AWSError] = js.native
  def updateWebhook(callback: js.Function2[/* err */ AWSError, /* data */ UpdateWebhookResult, Unit]): Request[UpdateWebhookResult, AWSError] = js.native
  /**
    *  Updates a webhook. 
    */
  def updateWebhook(params: UpdateWebhookRequest): Request[UpdateWebhookResult, AWSError] = js.native
  def updateWebhook(
    params: UpdateWebhookRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateWebhookResult, Unit]
  ): Request[UpdateWebhookResult, AWSError] = js.native
}

