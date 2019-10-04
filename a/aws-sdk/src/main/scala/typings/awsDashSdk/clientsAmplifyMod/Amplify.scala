package typings.awsDashSdk.clientsAmplifyMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Amplify extends Service {
  @JSName("config")
  var config_Amplify: ConfigBase with ClientConfiguration = js.native
  /**
    *  Creates a new Amplify App. 
    */
  def createApp(): Request[CreateAppResult, AWSError] = js.native
  def createApp(callback: js.Function2[/* err */ AWSError, /* data */ CreateAppResult, Unit]): Request[CreateAppResult, AWSError] = js.native
  /**
    *  Creates a new Amplify App. 
    */
  def createApp(params: CreateAppRequest): Request[CreateAppResult, AWSError] = js.native
  def createApp(
    params: CreateAppRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAppResult, Unit]
  ): Request[CreateAppResult, AWSError] = js.native
  /**
    *  Creates a new Branch for an Amplify App. 
    */
  def createBranch(): Request[CreateBranchResult, AWSError] = js.native
  def createBranch(callback: js.Function2[/* err */ AWSError, /* data */ CreateBranchResult, Unit]): Request[CreateBranchResult, AWSError] = js.native
  /**
    *  Creates a new Branch for an Amplify App. 
    */
  def createBranch(params: CreateBranchRequest): Request[CreateBranchResult, AWSError] = js.native
  def createBranch(
    params: CreateBranchRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateBranchResult, Unit]
  ): Request[CreateBranchResult, AWSError] = js.native
  /**
    *  Create a deployment for manual deploy apps. (Apps are not connected to repository) 
    */
  def createDeployment(): Request[CreateDeploymentResult, AWSError] = js.native
  def createDeployment(callback: js.Function2[/* err */ AWSError, /* data */ CreateDeploymentResult, Unit]): Request[CreateDeploymentResult, AWSError] = js.native
  /**
    *  Create a deployment for manual deploy apps. (Apps are not connected to repository) 
    */
  def createDeployment(params: CreateDeploymentRequest): Request[CreateDeploymentResult, AWSError] = js.native
  def createDeployment(
    params: CreateDeploymentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDeploymentResult, Unit]
  ): Request[CreateDeploymentResult, AWSError] = js.native
  /**
    *  Create a new DomainAssociation on an App 
    */
  def createDomainAssociation(): Request[CreateDomainAssociationResult, AWSError] = js.native
  def createDomainAssociation(callback: js.Function2[/* err */ AWSError, /* data */ CreateDomainAssociationResult, Unit]): Request[CreateDomainAssociationResult, AWSError] = js.native
  /**
    *  Create a new DomainAssociation on an App 
    */
  def createDomainAssociation(params: CreateDomainAssociationRequest): Request[CreateDomainAssociationResult, AWSError] = js.native
  def createDomainAssociation(
    params: CreateDomainAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDomainAssociationResult, Unit]
  ): Request[CreateDomainAssociationResult, AWSError] = js.native
  /**
    *  Create a new webhook on an App. 
    */
  def createWebhook(): Request[CreateWebhookResult, AWSError] = js.native
  def createWebhook(callback: js.Function2[/* err */ AWSError, /* data */ CreateWebhookResult, Unit]): Request[CreateWebhookResult, AWSError] = js.native
  /**
    *  Create a new webhook on an App. 
    */
  def createWebhook(params: CreateWebhookRequest): Request[CreateWebhookResult, AWSError] = js.native
  def createWebhook(
    params: CreateWebhookRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWebhookResult, Unit]
  ): Request[CreateWebhookResult, AWSError] = js.native
  /**
    *  Delete an existing Amplify App by appId. 
    */
  def deleteApp(): Request[DeleteAppResult, AWSError] = js.native
  def deleteApp(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAppResult, Unit]): Request[DeleteAppResult, AWSError] = js.native
  /**
    *  Delete an existing Amplify App by appId. 
    */
  def deleteApp(params: DeleteAppRequest): Request[DeleteAppResult, AWSError] = js.native
  def deleteApp(
    params: DeleteAppRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAppResult, Unit]
  ): Request[DeleteAppResult, AWSError] = js.native
  /**
    *  Deletes a branch for an Amplify App. 
    */
  def deleteBranch(): Request[DeleteBranchResult, AWSError] = js.native
  def deleteBranch(callback: js.Function2[/* err */ AWSError, /* data */ DeleteBranchResult, Unit]): Request[DeleteBranchResult, AWSError] = js.native
  /**
    *  Deletes a branch for an Amplify App. 
    */
  def deleteBranch(params: DeleteBranchRequest): Request[DeleteBranchResult, AWSError] = js.native
  def deleteBranch(
    params: DeleteBranchRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteBranchResult, Unit]
  ): Request[DeleteBranchResult, AWSError] = js.native
  /**
    *  Deletes a DomainAssociation. 
    */
  def deleteDomainAssociation(): Request[DeleteDomainAssociationResult, AWSError] = js.native
  def deleteDomainAssociation(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDomainAssociationResult, Unit]): Request[DeleteDomainAssociationResult, AWSError] = js.native
  /**
    *  Deletes a DomainAssociation. 
    */
  def deleteDomainAssociation(params: DeleteDomainAssociationRequest): Request[DeleteDomainAssociationResult, AWSError] = js.native
  def deleteDomainAssociation(
    params: DeleteDomainAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDomainAssociationResult, Unit]
  ): Request[DeleteDomainAssociationResult, AWSError] = js.native
  /**
    *  Delete a job, for an Amplify branch, part of Amplify App. 
    */
  def deleteJob(): Request[DeleteJobResult, AWSError] = js.native
  def deleteJob(callback: js.Function2[/* err */ AWSError, /* data */ DeleteJobResult, Unit]): Request[DeleteJobResult, AWSError] = js.native
  /**
    *  Delete a job, for an Amplify branch, part of Amplify App. 
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
    *  Retrieve website access logs for a specific time range via a pre-signed URL. Optionally, deliver the logs to a given S3 bucket. 
    */
  def generateAccessLogs(): Request[GenerateAccessLogsResult, AWSError] = js.native
  def generateAccessLogs(callback: js.Function2[/* err */ AWSError, /* data */ GenerateAccessLogsResult, Unit]): Request[GenerateAccessLogsResult, AWSError] = js.native
  /**
    *  Retrieve website access logs for a specific time range via a pre-signed URL. Optionally, deliver the logs to a given S3 bucket. 
    */
  def generateAccessLogs(params: GenerateAccessLogsRequest): Request[GenerateAccessLogsResult, AWSError] = js.native
  def generateAccessLogs(
    params: GenerateAccessLogsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GenerateAccessLogsResult, Unit]
  ): Request[GenerateAccessLogsResult, AWSError] = js.native
  /**
    *  Retrieves an existing Amplify App by appId. 
    */
  def getApp(): Request[GetAppResult, AWSError] = js.native
  def getApp(callback: js.Function2[/* err */ AWSError, /* data */ GetAppResult, Unit]): Request[GetAppResult, AWSError] = js.native
  /**
    *  Retrieves an existing Amplify App by appId. 
    */
  def getApp(params: GetAppRequest): Request[GetAppResult, AWSError] = js.native
  def getApp(params: GetAppRequest, callback: js.Function2[/* err */ AWSError, /* data */ GetAppResult, Unit]): Request[GetAppResult, AWSError] = js.native
  /**
    *  Retrieves artifact info that corresponds to a artifactId. 
    */
  def getArtifactUrl(): Request[GetArtifactUrlResult, AWSError] = js.native
  def getArtifactUrl(callback: js.Function2[/* err */ AWSError, /* data */ GetArtifactUrlResult, Unit]): Request[GetArtifactUrlResult, AWSError] = js.native
  /**
    *  Retrieves artifact info that corresponds to a artifactId. 
    */
  def getArtifactUrl(params: GetArtifactUrlRequest): Request[GetArtifactUrlResult, AWSError] = js.native
  def getArtifactUrl(
    params: GetArtifactUrlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetArtifactUrlResult, Unit]
  ): Request[GetArtifactUrlResult, AWSError] = js.native
  /**
    *  Retrieves a branch for an Amplify App. 
    */
  def getBranch(): Request[GetBranchResult, AWSError] = js.native
  def getBranch(callback: js.Function2[/* err */ AWSError, /* data */ GetBranchResult, Unit]): Request[GetBranchResult, AWSError] = js.native
  /**
    *  Retrieves a branch for an Amplify App. 
    */
  def getBranch(params: GetBranchRequest): Request[GetBranchResult, AWSError] = js.native
  def getBranch(
    params: GetBranchRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBranchResult, Unit]
  ): Request[GetBranchResult, AWSError] = js.native
  /**
    *  Retrieves domain info that corresponds to an appId and domainName. 
    */
  def getDomainAssociation(): Request[GetDomainAssociationResult, AWSError] = js.native
  def getDomainAssociation(callback: js.Function2[/* err */ AWSError, /* data */ GetDomainAssociationResult, Unit]): Request[GetDomainAssociationResult, AWSError] = js.native
  /**
    *  Retrieves domain info that corresponds to an appId and domainName. 
    */
  def getDomainAssociation(params: GetDomainAssociationRequest): Request[GetDomainAssociationResult, AWSError] = js.native
  def getDomainAssociation(
    params: GetDomainAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDomainAssociationResult, Unit]
  ): Request[GetDomainAssociationResult, AWSError] = js.native
  /**
    *  Get a job for a branch, part of an Amplify App. 
    */
  def getJob(): Request[GetJobResult, AWSError] = js.native
  def getJob(callback: js.Function2[/* err */ AWSError, /* data */ GetJobResult, Unit]): Request[GetJobResult, AWSError] = js.native
  /**
    *  Get a job for a branch, part of an Amplify App. 
    */
  def getJob(params: GetJobRequest): Request[GetJobResult, AWSError] = js.native
  def getJob(params: GetJobRequest, callback: js.Function2[/* err */ AWSError, /* data */ GetJobResult, Unit]): Request[GetJobResult, AWSError] = js.native
  /**
    *  Retrieves webhook info that corresponds to a webhookId. 
    */
  def getWebhook(): Request[GetWebhookResult, AWSError] = js.native
  def getWebhook(callback: js.Function2[/* err */ AWSError, /* data */ GetWebhookResult, Unit]): Request[GetWebhookResult, AWSError] = js.native
  /**
    *  Retrieves webhook info that corresponds to a webhookId. 
    */
  def getWebhook(params: GetWebhookRequest): Request[GetWebhookResult, AWSError] = js.native
  def getWebhook(
    params: GetWebhookRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetWebhookResult, Unit]
  ): Request[GetWebhookResult, AWSError] = js.native
  /**
    *  Lists existing Amplify Apps. 
    */
  def listApps(): Request[ListAppsResult, AWSError] = js.native
  def listApps(callback: js.Function2[/* err */ AWSError, /* data */ ListAppsResult, Unit]): Request[ListAppsResult, AWSError] = js.native
  /**
    *  Lists existing Amplify Apps. 
    */
  def listApps(params: ListAppsRequest): Request[ListAppsResult, AWSError] = js.native
  def listApps(
    params: ListAppsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAppsResult, Unit]
  ): Request[ListAppsResult, AWSError] = js.native
  /**
    *  List artifacts with an app, a branch, a job and an artifact type. 
    */
  def listArtifacts(): Request[ListArtifactsResult, AWSError] = js.native
  def listArtifacts(callback: js.Function2[/* err */ AWSError, /* data */ ListArtifactsResult, Unit]): Request[ListArtifactsResult, AWSError] = js.native
  /**
    *  List artifacts with an app, a branch, a job and an artifact type. 
    */
  def listArtifacts(params: ListArtifactsRequest): Request[ListArtifactsResult, AWSError] = js.native
  def listArtifacts(
    params: ListArtifactsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListArtifactsResult, Unit]
  ): Request[ListArtifactsResult, AWSError] = js.native
  /**
    *  Lists branches for an Amplify App. 
    */
  def listBranches(): Request[ListBranchesResult, AWSError] = js.native
  def listBranches(callback: js.Function2[/* err */ AWSError, /* data */ ListBranchesResult, Unit]): Request[ListBranchesResult, AWSError] = js.native
  /**
    *  Lists branches for an Amplify App. 
    */
  def listBranches(params: ListBranchesRequest): Request[ListBranchesResult, AWSError] = js.native
  def listBranches(
    params: ListBranchesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBranchesResult, Unit]
  ): Request[ListBranchesResult, AWSError] = js.native
  /**
    *  List domains with an app 
    */
  def listDomainAssociations(): Request[ListDomainAssociationsResult, AWSError] = js.native
  def listDomainAssociations(callback: js.Function2[/* err */ AWSError, /* data */ ListDomainAssociationsResult, Unit]): Request[ListDomainAssociationsResult, AWSError] = js.native
  /**
    *  List domains with an app 
    */
  def listDomainAssociations(params: ListDomainAssociationsRequest): Request[ListDomainAssociationsResult, AWSError] = js.native
  def listDomainAssociations(
    params: ListDomainAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDomainAssociationsResult, Unit]
  ): Request[ListDomainAssociationsResult, AWSError] = js.native
  /**
    *  List Jobs for a branch, part of an Amplify App. 
    */
  def listJobs(): Request[ListJobsResult, AWSError] = js.native
  def listJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListJobsResult, Unit]): Request[ListJobsResult, AWSError] = js.native
  /**
    *  List Jobs for a branch, part of an Amplify App. 
    */
  def listJobs(params: ListJobsRequest): Request[ListJobsResult, AWSError] = js.native
  def listJobs(
    params: ListJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListJobsResult, Unit]
  ): Request[ListJobsResult, AWSError] = js.native
  /**
    *  List tags for resource. 
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    *  List tags for resource. 
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    *  List webhooks with an app. 
    */
  def listWebhooks(): Request[ListWebhooksResult, AWSError] = js.native
  def listWebhooks(callback: js.Function2[/* err */ AWSError, /* data */ ListWebhooksResult, Unit]): Request[ListWebhooksResult, AWSError] = js.native
  /**
    *  List webhooks with an app. 
    */
  def listWebhooks(params: ListWebhooksRequest): Request[ListWebhooksResult, AWSError] = js.native
  def listWebhooks(
    params: ListWebhooksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWebhooksResult, Unit]
  ): Request[ListWebhooksResult, AWSError] = js.native
  /**
    *  Start a deployment for manual deploy apps. (Apps are not connected to repository) 
    */
  def startDeployment(): Request[StartDeploymentResult, AWSError] = js.native
  def startDeployment(callback: js.Function2[/* err */ AWSError, /* data */ StartDeploymentResult, Unit]): Request[StartDeploymentResult, AWSError] = js.native
  /**
    *  Start a deployment for manual deploy apps. (Apps are not connected to repository) 
    */
  def startDeployment(params: StartDeploymentRequest): Request[StartDeploymentResult, AWSError] = js.native
  def startDeployment(
    params: StartDeploymentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartDeploymentResult, Unit]
  ): Request[StartDeploymentResult, AWSError] = js.native
  /**
    *  Starts a new job for a branch, part of an Amplify App. 
    */
  def startJob(): Request[StartJobResult, AWSError] = js.native
  def startJob(callback: js.Function2[/* err */ AWSError, /* data */ StartJobResult, Unit]): Request[StartJobResult, AWSError] = js.native
  /**
    *  Starts a new job for a branch, part of an Amplify App. 
    */
  def startJob(params: StartJobRequest): Request[StartJobResult, AWSError] = js.native
  def startJob(
    params: StartJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartJobResult, Unit]
  ): Request[StartJobResult, AWSError] = js.native
  /**
    *  Stop a job that is in progress, for an Amplify branch, part of Amplify App. 
    */
  def stopJob(): Request[StopJobResult, AWSError] = js.native
  def stopJob(callback: js.Function2[/* err */ AWSError, /* data */ StopJobResult, Unit]): Request[StopJobResult, AWSError] = js.native
  /**
    *  Stop a job that is in progress, for an Amplify branch, part of Amplify App. 
    */
  def stopJob(params: StopJobRequest): Request[StopJobResult, AWSError] = js.native
  def stopJob(params: StopJobRequest, callback: js.Function2[/* err */ AWSError, /* data */ StopJobResult, Unit]): Request[StopJobResult, AWSError] = js.native
  /**
    *  Tag resource with tag key and value. 
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    *  Tag resource with tag key and value. 
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  /**
    *  Untag resource with resourceArn. 
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    *  Untag resource with resourceArn. 
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  /**
    *  Updates an existing Amplify App. 
    */
  def updateApp(): Request[UpdateAppResult, AWSError] = js.native
  def updateApp(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAppResult, Unit]): Request[UpdateAppResult, AWSError] = js.native
  /**
    *  Updates an existing Amplify App. 
    */
  def updateApp(params: UpdateAppRequest): Request[UpdateAppResult, AWSError] = js.native
  def updateApp(
    params: UpdateAppRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAppResult, Unit]
  ): Request[UpdateAppResult, AWSError] = js.native
  /**
    *  Updates a branch for an Amplify App. 
    */
  def updateBranch(): Request[UpdateBranchResult, AWSError] = js.native
  def updateBranch(callback: js.Function2[/* err */ AWSError, /* data */ UpdateBranchResult, Unit]): Request[UpdateBranchResult, AWSError] = js.native
  /**
    *  Updates a branch for an Amplify App. 
    */
  def updateBranch(params: UpdateBranchRequest): Request[UpdateBranchResult, AWSError] = js.native
  def updateBranch(
    params: UpdateBranchRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateBranchResult, Unit]
  ): Request[UpdateBranchResult, AWSError] = js.native
  /**
    *  Create a new DomainAssociation on an App 
    */
  def updateDomainAssociation(): Request[UpdateDomainAssociationResult, AWSError] = js.native
  def updateDomainAssociation(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDomainAssociationResult, Unit]): Request[UpdateDomainAssociationResult, AWSError] = js.native
  /**
    *  Create a new DomainAssociation on an App 
    */
  def updateDomainAssociation(params: UpdateDomainAssociationRequest): Request[UpdateDomainAssociationResult, AWSError] = js.native
  def updateDomainAssociation(
    params: UpdateDomainAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDomainAssociationResult, Unit]
  ): Request[UpdateDomainAssociationResult, AWSError] = js.native
  /**
    *  Update a webhook. 
    */
  def updateWebhook(): Request[UpdateWebhookResult, AWSError] = js.native
  def updateWebhook(callback: js.Function2[/* err */ AWSError, /* data */ UpdateWebhookResult, Unit]): Request[UpdateWebhookResult, AWSError] = js.native
  /**
    *  Update a webhook. 
    */
  def updateWebhook(params: UpdateWebhookRequest): Request[UpdateWebhookResult, AWSError] = js.native
  def updateWebhook(
    params: UpdateWebhookRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateWebhookResult, Unit]
  ): Request[UpdateWebhookResult, AWSError] = js.native
}

