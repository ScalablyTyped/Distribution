package typings.awsDashSdk.clientsSmsMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SMS extends Service {
  @JSName("config")
  var config_SMS: ConfigBase with ClientConfiguration = js.native
  /**
    * Creates an application. An application consists of one or more server groups. Each server group contain one or more servers.
    */
  def createApp(): Request[CreateAppResponse, AWSError] = js.native
  def createApp(callback: js.Function2[/* err */ AWSError, /* data */ CreateAppResponse, Unit]): Request[CreateAppResponse, AWSError] = js.native
  /**
    * Creates an application. An application consists of one or more server groups. Each server group contain one or more servers.
    */
  def createApp(params: CreateAppRequest): Request[CreateAppResponse, AWSError] = js.native
  def createApp(
    params: CreateAppRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAppResponse, Unit]
  ): Request[CreateAppResponse, AWSError] = js.native
  /**
    * Creates a replication job. The replication job schedules periodic replication runs to replicate your server to AWS. Each replication run creates an Amazon Machine Image (AMI).
    */
  def createReplicationJob(): Request[CreateReplicationJobResponse, AWSError] = js.native
  def createReplicationJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateReplicationJobResponse, Unit]): Request[CreateReplicationJobResponse, AWSError] = js.native
  /**
    * Creates a replication job. The replication job schedules periodic replication runs to replicate your server to AWS. Each replication run creates an Amazon Machine Image (AMI).
    */
  def createReplicationJob(params: CreateReplicationJobRequest): Request[CreateReplicationJobResponse, AWSError] = js.native
  def createReplicationJob(
    params: CreateReplicationJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateReplicationJobResponse, Unit]
  ): Request[CreateReplicationJobResponse, AWSError] = js.native
  /**
    * Deletes an existing application. Optionally deletes the launched stack associated with the application and all AWS SMS replication jobs for servers in the application.
    */
  def deleteApp(): Request[DeleteAppResponse, AWSError] = js.native
  def deleteApp(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAppResponse, Unit]): Request[DeleteAppResponse, AWSError] = js.native
  /**
    * Deletes an existing application. Optionally deletes the launched stack associated with the application and all AWS SMS replication jobs for servers in the application.
    */
  def deleteApp(params: DeleteAppRequest): Request[DeleteAppResponse, AWSError] = js.native
  def deleteApp(
    params: DeleteAppRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAppResponse, Unit]
  ): Request[DeleteAppResponse, AWSError] = js.native
  /**
    * Deletes existing launch configuration for an application.
    */
  def deleteAppLaunchConfiguration(): Request[DeleteAppLaunchConfigurationResponse, AWSError] = js.native
  def deleteAppLaunchConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAppLaunchConfigurationResponse, Unit]): Request[DeleteAppLaunchConfigurationResponse, AWSError] = js.native
  /**
    * Deletes existing launch configuration for an application.
    */
  def deleteAppLaunchConfiguration(params: DeleteAppLaunchConfigurationRequest): Request[DeleteAppLaunchConfigurationResponse, AWSError] = js.native
  def deleteAppLaunchConfiguration(
    params: DeleteAppLaunchConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAppLaunchConfigurationResponse, Unit]
  ): Request[DeleteAppLaunchConfigurationResponse, AWSError] = js.native
  /**
    * Deletes existing replication configuration for an application.
    */
  def deleteAppReplicationConfiguration(): Request[DeleteAppReplicationConfigurationResponse, AWSError] = js.native
  def deleteAppReplicationConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAppReplicationConfigurationResponse, Unit]
  ): Request[DeleteAppReplicationConfigurationResponse, AWSError] = js.native
  /**
    * Deletes existing replication configuration for an application.
    */
  def deleteAppReplicationConfiguration(params: DeleteAppReplicationConfigurationRequest): Request[DeleteAppReplicationConfigurationResponse, AWSError] = js.native
  def deleteAppReplicationConfiguration(
    params: DeleteAppReplicationConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAppReplicationConfigurationResponse, Unit]
  ): Request[DeleteAppReplicationConfigurationResponse, AWSError] = js.native
  /**
    * Deletes the specified replication job. After you delete a replication job, there are no further replication runs. AWS deletes the contents of the Amazon S3 bucket used to store AWS SMS artifacts. The AMIs created by the replication runs are not deleted.
    */
  def deleteReplicationJob(): Request[DeleteReplicationJobResponse, AWSError] = js.native
  def deleteReplicationJob(callback: js.Function2[/* err */ AWSError, /* data */ DeleteReplicationJobResponse, Unit]): Request[DeleteReplicationJobResponse, AWSError] = js.native
  /**
    * Deletes the specified replication job. After you delete a replication job, there are no further replication runs. AWS deletes the contents of the Amazon S3 bucket used to store AWS SMS artifacts. The AMIs created by the replication runs are not deleted.
    */
  def deleteReplicationJob(params: DeleteReplicationJobRequest): Request[DeleteReplicationJobResponse, AWSError] = js.native
  def deleteReplicationJob(
    params: DeleteReplicationJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteReplicationJobResponse, Unit]
  ): Request[DeleteReplicationJobResponse, AWSError] = js.native
  /**
    * Deletes all servers from your server catalog.
    */
  def deleteServerCatalog(): Request[DeleteServerCatalogResponse, AWSError] = js.native
  def deleteServerCatalog(callback: js.Function2[/* err */ AWSError, /* data */ DeleteServerCatalogResponse, Unit]): Request[DeleteServerCatalogResponse, AWSError] = js.native
  /**
    * Deletes all servers from your server catalog.
    */
  def deleteServerCatalog(params: DeleteServerCatalogRequest): Request[DeleteServerCatalogResponse, AWSError] = js.native
  def deleteServerCatalog(
    params: DeleteServerCatalogRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteServerCatalogResponse, Unit]
  ): Request[DeleteServerCatalogResponse, AWSError] = js.native
  /**
    * Disassociates the specified connector from AWS SMS. After you disassociate a connector, it is no longer available to support replication jobs.
    */
  def disassociateConnector(): Request[DisassociateConnectorResponse, AWSError] = js.native
  def disassociateConnector(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateConnectorResponse, Unit]): Request[DisassociateConnectorResponse, AWSError] = js.native
  /**
    * Disassociates the specified connector from AWS SMS. After you disassociate a connector, it is no longer available to support replication jobs.
    */
  def disassociateConnector(params: DisassociateConnectorRequest): Request[DisassociateConnectorResponse, AWSError] = js.native
  def disassociateConnector(
    params: DisassociateConnectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateConnectorResponse, Unit]
  ): Request[DisassociateConnectorResponse, AWSError] = js.native
  /**
    * Generates a target change set for a currently launched stack and writes it to an Amazon S3 object in the customer’s Amazon S3 bucket.
    */
  def generateChangeSet(): Request[GenerateChangeSetResponse, AWSError] = js.native
  def generateChangeSet(callback: js.Function2[/* err */ AWSError, /* data */ GenerateChangeSetResponse, Unit]): Request[GenerateChangeSetResponse, AWSError] = js.native
  /**
    * Generates a target change set for a currently launched stack and writes it to an Amazon S3 object in the customer’s Amazon S3 bucket.
    */
  def generateChangeSet(params: GenerateChangeSetRequest): Request[GenerateChangeSetResponse, AWSError] = js.native
  def generateChangeSet(
    params: GenerateChangeSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GenerateChangeSetResponse, Unit]
  ): Request[GenerateChangeSetResponse, AWSError] = js.native
  /**
    * Generates an Amazon CloudFormation template based on the current launch configuration and writes it to an Amazon S3 object in the customer’s Amazon S3 bucket.
    */
  def generateTemplate(): Request[GenerateTemplateResponse, AWSError] = js.native
  def generateTemplate(callback: js.Function2[/* err */ AWSError, /* data */ GenerateTemplateResponse, Unit]): Request[GenerateTemplateResponse, AWSError] = js.native
  /**
    * Generates an Amazon CloudFormation template based on the current launch configuration and writes it to an Amazon S3 object in the customer’s Amazon S3 bucket.
    */
  def generateTemplate(params: GenerateTemplateRequest): Request[GenerateTemplateResponse, AWSError] = js.native
  def generateTemplate(
    params: GenerateTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GenerateTemplateResponse, Unit]
  ): Request[GenerateTemplateResponse, AWSError] = js.native
  /**
    * Retrieve information about an application.
    */
  def getApp(): Request[GetAppResponse, AWSError] = js.native
  def getApp(callback: js.Function2[/* err */ AWSError, /* data */ GetAppResponse, Unit]): Request[GetAppResponse, AWSError] = js.native
  /**
    * Retrieve information about an application.
    */
  def getApp(params: GetAppRequest): Request[GetAppResponse, AWSError] = js.native
  def getApp(params: GetAppRequest, callback: js.Function2[/* err */ AWSError, /* data */ GetAppResponse, Unit]): Request[GetAppResponse, AWSError] = js.native
  /**
    * Retrieves the application launch configuration associated with an application.
    */
  def getAppLaunchConfiguration(): Request[GetAppLaunchConfigurationResponse, AWSError] = js.native
  def getAppLaunchConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ GetAppLaunchConfigurationResponse, Unit]): Request[GetAppLaunchConfigurationResponse, AWSError] = js.native
  /**
    * Retrieves the application launch configuration associated with an application.
    */
  def getAppLaunchConfiguration(params: GetAppLaunchConfigurationRequest): Request[GetAppLaunchConfigurationResponse, AWSError] = js.native
  def getAppLaunchConfiguration(
    params: GetAppLaunchConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAppLaunchConfigurationResponse, Unit]
  ): Request[GetAppLaunchConfigurationResponse, AWSError] = js.native
  /**
    * Retrieves an application replication configuration associatd with an application.
    */
  def getAppReplicationConfiguration(): Request[GetAppReplicationConfigurationResponse, AWSError] = js.native
  def getAppReplicationConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ GetAppReplicationConfigurationResponse, Unit]
  ): Request[GetAppReplicationConfigurationResponse, AWSError] = js.native
  /**
    * Retrieves an application replication configuration associatd with an application.
    */
  def getAppReplicationConfiguration(params: GetAppReplicationConfigurationRequest): Request[GetAppReplicationConfigurationResponse, AWSError] = js.native
  def getAppReplicationConfiguration(
    params: GetAppReplicationConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAppReplicationConfigurationResponse, Unit]
  ): Request[GetAppReplicationConfigurationResponse, AWSError] = js.native
  /**
    * Describes the connectors registered with the AWS SMS.
    */
  def getConnectors(): Request[GetConnectorsResponse, AWSError] = js.native
  def getConnectors(callback: js.Function2[/* err */ AWSError, /* data */ GetConnectorsResponse, Unit]): Request[GetConnectorsResponse, AWSError] = js.native
  /**
    * Describes the connectors registered with the AWS SMS.
    */
  def getConnectors(params: GetConnectorsRequest): Request[GetConnectorsResponse, AWSError] = js.native
  def getConnectors(
    params: GetConnectorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetConnectorsResponse, Unit]
  ): Request[GetConnectorsResponse, AWSError] = js.native
  /**
    * Describes the specified replication job or all of your replication jobs.
    */
  def getReplicationJobs(): Request[GetReplicationJobsResponse, AWSError] = js.native
  def getReplicationJobs(callback: js.Function2[/* err */ AWSError, /* data */ GetReplicationJobsResponse, Unit]): Request[GetReplicationJobsResponse, AWSError] = js.native
  /**
    * Describes the specified replication job or all of your replication jobs.
    */
  def getReplicationJobs(params: GetReplicationJobsRequest): Request[GetReplicationJobsResponse, AWSError] = js.native
  def getReplicationJobs(
    params: GetReplicationJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReplicationJobsResponse, Unit]
  ): Request[GetReplicationJobsResponse, AWSError] = js.native
  /**
    * Describes the replication runs for the specified replication job.
    */
  def getReplicationRuns(): Request[GetReplicationRunsResponse, AWSError] = js.native
  def getReplicationRuns(callback: js.Function2[/* err */ AWSError, /* data */ GetReplicationRunsResponse, Unit]): Request[GetReplicationRunsResponse, AWSError] = js.native
  /**
    * Describes the replication runs for the specified replication job.
    */
  def getReplicationRuns(params: GetReplicationRunsRequest): Request[GetReplicationRunsResponse, AWSError] = js.native
  def getReplicationRuns(
    params: GetReplicationRunsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReplicationRunsResponse, Unit]
  ): Request[GetReplicationRunsResponse, AWSError] = js.native
  /**
    * Describes the servers in your server catalog. Before you can describe your servers, you must import them using ImportServerCatalog.
    */
  def getServers(): Request[GetServersResponse, AWSError] = js.native
  def getServers(callback: js.Function2[/* err */ AWSError, /* data */ GetServersResponse, Unit]): Request[GetServersResponse, AWSError] = js.native
  /**
    * Describes the servers in your server catalog. Before you can describe your servers, you must import them using ImportServerCatalog.
    */
  def getServers(params: GetServersRequest): Request[GetServersResponse, AWSError] = js.native
  def getServers(
    params: GetServersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServersResponse, Unit]
  ): Request[GetServersResponse, AWSError] = js.native
  /**
    * Gathers a complete list of on-premises servers. Connectors must be installed and monitoring all servers that you want to import. This call returns immediately, but might take additional time to retrieve all the servers.
    */
  def importServerCatalog(): Request[ImportServerCatalogResponse, AWSError] = js.native
  def importServerCatalog(callback: js.Function2[/* err */ AWSError, /* data */ ImportServerCatalogResponse, Unit]): Request[ImportServerCatalogResponse, AWSError] = js.native
  /**
    * Gathers a complete list of on-premises servers. Connectors must be installed and monitoring all servers that you want to import. This call returns immediately, but might take additional time to retrieve all the servers.
    */
  def importServerCatalog(params: ImportServerCatalogRequest): Request[ImportServerCatalogResponse, AWSError] = js.native
  def importServerCatalog(
    params: ImportServerCatalogRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ImportServerCatalogResponse, Unit]
  ): Request[ImportServerCatalogResponse, AWSError] = js.native
  /**
    * Launches an application stack.
    */
  def launchApp(): Request[LaunchAppResponse, AWSError] = js.native
  def launchApp(callback: js.Function2[/* err */ AWSError, /* data */ LaunchAppResponse, Unit]): Request[LaunchAppResponse, AWSError] = js.native
  /**
    * Launches an application stack.
    */
  def launchApp(params: LaunchAppRequest): Request[LaunchAppResponse, AWSError] = js.native
  def launchApp(
    params: LaunchAppRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ LaunchAppResponse, Unit]
  ): Request[LaunchAppResponse, AWSError] = js.native
  /**
    * Returns a list of summaries for all applications.
    */
  def listApps(): Request[ListAppsResponse, AWSError] = js.native
  def listApps(callback: js.Function2[/* err */ AWSError, /* data */ ListAppsResponse, Unit]): Request[ListAppsResponse, AWSError] = js.native
  /**
    * Returns a list of summaries for all applications.
    */
  def listApps(params: ListAppsRequest): Request[ListAppsResponse, AWSError] = js.native
  def listApps(
    params: ListAppsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAppsResponse, Unit]
  ): Request[ListAppsResponse, AWSError] = js.native
  /**
    * Creates a launch configuration for an application.
    */
  def putAppLaunchConfiguration(): Request[PutAppLaunchConfigurationResponse, AWSError] = js.native
  def putAppLaunchConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ PutAppLaunchConfigurationResponse, Unit]): Request[PutAppLaunchConfigurationResponse, AWSError] = js.native
  /**
    * Creates a launch configuration for an application.
    */
  def putAppLaunchConfiguration(params: PutAppLaunchConfigurationRequest): Request[PutAppLaunchConfigurationResponse, AWSError] = js.native
  def putAppLaunchConfiguration(
    params: PutAppLaunchConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutAppLaunchConfigurationResponse, Unit]
  ): Request[PutAppLaunchConfigurationResponse, AWSError] = js.native
  /**
    * Creates or updates a replication configuration for an application.
    */
  def putAppReplicationConfiguration(): Request[PutAppReplicationConfigurationResponse, AWSError] = js.native
  def putAppReplicationConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ PutAppReplicationConfigurationResponse, Unit]
  ): Request[PutAppReplicationConfigurationResponse, AWSError] = js.native
  /**
    * Creates or updates a replication configuration for an application.
    */
  def putAppReplicationConfiguration(params: PutAppReplicationConfigurationRequest): Request[PutAppReplicationConfigurationResponse, AWSError] = js.native
  def putAppReplicationConfiguration(
    params: PutAppReplicationConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutAppReplicationConfigurationResponse, Unit]
  ): Request[PutAppReplicationConfigurationResponse, AWSError] = js.native
  /**
    * Starts replicating an application.
    */
  def startAppReplication(): Request[StartAppReplicationResponse, AWSError] = js.native
  def startAppReplication(callback: js.Function2[/* err */ AWSError, /* data */ StartAppReplicationResponse, Unit]): Request[StartAppReplicationResponse, AWSError] = js.native
  /**
    * Starts replicating an application.
    */
  def startAppReplication(params: StartAppReplicationRequest): Request[StartAppReplicationResponse, AWSError] = js.native
  def startAppReplication(
    params: StartAppReplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartAppReplicationResponse, Unit]
  ): Request[StartAppReplicationResponse, AWSError] = js.native
  /**
    * Starts an on-demand replication run for the specified replication job. This replication run starts immediately. This replication run is in addition to the ones already scheduled. There is a limit on the number of on-demand replications runs you can request in a 24-hour period.
    */
  def startOnDemandReplicationRun(): Request[StartOnDemandReplicationRunResponse, AWSError] = js.native
  def startOnDemandReplicationRun(callback: js.Function2[/* err */ AWSError, /* data */ StartOnDemandReplicationRunResponse, Unit]): Request[StartOnDemandReplicationRunResponse, AWSError] = js.native
  /**
    * Starts an on-demand replication run for the specified replication job. This replication run starts immediately. This replication run is in addition to the ones already scheduled. There is a limit on the number of on-demand replications runs you can request in a 24-hour period.
    */
  def startOnDemandReplicationRun(params: StartOnDemandReplicationRunRequest): Request[StartOnDemandReplicationRunResponse, AWSError] = js.native
  def startOnDemandReplicationRun(
    params: StartOnDemandReplicationRunRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartOnDemandReplicationRunResponse, Unit]
  ): Request[StartOnDemandReplicationRunResponse, AWSError] = js.native
  /**
    * Stops replicating an application.
    */
  def stopAppReplication(): Request[StopAppReplicationResponse, AWSError] = js.native
  def stopAppReplication(callback: js.Function2[/* err */ AWSError, /* data */ StopAppReplicationResponse, Unit]): Request[StopAppReplicationResponse, AWSError] = js.native
  /**
    * Stops replicating an application.
    */
  def stopAppReplication(params: StopAppReplicationRequest): Request[StopAppReplicationResponse, AWSError] = js.native
  def stopAppReplication(
    params: StopAppReplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopAppReplicationResponse, Unit]
  ): Request[StopAppReplicationResponse, AWSError] = js.native
  /**
    * Terminates the stack for an application.
    */
  def terminateApp(): Request[TerminateAppResponse, AWSError] = js.native
  def terminateApp(callback: js.Function2[/* err */ AWSError, /* data */ TerminateAppResponse, Unit]): Request[TerminateAppResponse, AWSError] = js.native
  /**
    * Terminates the stack for an application.
    */
  def terminateApp(params: TerminateAppRequest): Request[TerminateAppResponse, AWSError] = js.native
  def terminateApp(
    params: TerminateAppRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TerminateAppResponse, Unit]
  ): Request[TerminateAppResponse, AWSError] = js.native
  /**
    * Updates an application.
    */
  def updateApp(): Request[UpdateAppResponse, AWSError] = js.native
  def updateApp(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAppResponse, Unit]): Request[UpdateAppResponse, AWSError] = js.native
  /**
    * Updates an application.
    */
  def updateApp(params: UpdateAppRequest): Request[UpdateAppResponse, AWSError] = js.native
  def updateApp(
    params: UpdateAppRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAppResponse, Unit]
  ): Request[UpdateAppResponse, AWSError] = js.native
  /**
    * Updates the specified settings for the specified replication job.
    */
  def updateReplicationJob(): Request[UpdateReplicationJobResponse, AWSError] = js.native
  def updateReplicationJob(callback: js.Function2[/* err */ AWSError, /* data */ UpdateReplicationJobResponse, Unit]): Request[UpdateReplicationJobResponse, AWSError] = js.native
  /**
    * Updates the specified settings for the specified replication job.
    */
  def updateReplicationJob(params: UpdateReplicationJobRequest): Request[UpdateReplicationJobResponse, AWSError] = js.native
  def updateReplicationJob(
    params: UpdateReplicationJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateReplicationJobResponse, Unit]
  ): Request[UpdateReplicationJobResponse, AWSError] = js.native
}

