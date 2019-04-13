package typings
package awsDashSdkLib.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SMS
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_SMS: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Creates an application. An application consists of one or more server groups. Each server group contain one or more servers.
    */
  def createApp(): awsDashSdkLib.libRequestMod.Request[CreateAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createApp(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateAppResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an application. An application consists of one or more server groups. Each server group contain one or more servers.
    */
  def createApp(params: CreateAppRequest): awsDashSdkLib.libRequestMod.Request[CreateAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createApp(
    params: CreateAppRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateAppResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a replication job. The replication job schedules periodic replication runs to replicate your server to AWS. Each replication run creates an Amazon Machine Image (AMI).
    */
  def createReplicationJob(): awsDashSdkLib.libRequestMod.Request[CreateReplicationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createReplicationJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateReplicationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateReplicationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a replication job. The replication job schedules periodic replication runs to replicate your server to AWS. Each replication run creates an Amazon Machine Image (AMI).
    */
  def createReplicationJob(params: CreateReplicationJobRequest): awsDashSdkLib.libRequestMod.Request[CreateReplicationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createReplicationJob(
    params: CreateReplicationJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateReplicationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateReplicationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an existing application. Optionally deletes the launched stack associated with the application and all AWS SMS replication jobs for servers in the application.
    */
  def deleteApp(): awsDashSdkLib.libRequestMod.Request[DeleteAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteApp(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteAppResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an existing application. Optionally deletes the launched stack associated with the application and all AWS SMS replication jobs for servers in the application.
    */
  def deleteApp(params: DeleteAppRequest): awsDashSdkLib.libRequestMod.Request[DeleteAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteApp(
    params: DeleteAppRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteAppResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes existing launch configuration for an application.
    */
  def deleteAppLaunchConfiguration(): awsDashSdkLib.libRequestMod.Request[DeleteAppLaunchConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAppLaunchConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteAppLaunchConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteAppLaunchConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes existing launch configuration for an application.
    */
  def deleteAppLaunchConfiguration(params: DeleteAppLaunchConfigurationRequest): awsDashSdkLib.libRequestMod.Request[DeleteAppLaunchConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAppLaunchConfiguration(
    params: DeleteAppLaunchConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteAppLaunchConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteAppLaunchConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes existing replication configuration for an application.
    */
  def deleteAppReplicationConfiguration(): awsDashSdkLib.libRequestMod.Request[DeleteAppReplicationConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAppReplicationConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteAppReplicationConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteAppReplicationConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes existing replication configuration for an application.
    */
  def deleteAppReplicationConfiguration(params: DeleteAppReplicationConfigurationRequest): awsDashSdkLib.libRequestMod.Request[DeleteAppReplicationConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAppReplicationConfiguration(
    params: DeleteAppReplicationConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteAppReplicationConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteAppReplicationConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified replication job. After you delete a replication job, there are no further replication runs. AWS deletes the contents of the Amazon S3 bucket used to store AWS SMS artifacts. The AMIs created by the replication runs are not deleted.
    */
  def deleteReplicationJob(): awsDashSdkLib.libRequestMod.Request[DeleteReplicationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteReplicationJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteReplicationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteReplicationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified replication job. After you delete a replication job, there are no further replication runs. AWS deletes the contents of the Amazon S3 bucket used to store AWS SMS artifacts. The AMIs created by the replication runs are not deleted.
    */
  def deleteReplicationJob(params: DeleteReplicationJobRequest): awsDashSdkLib.libRequestMod.Request[DeleteReplicationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteReplicationJob(
    params: DeleteReplicationJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteReplicationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteReplicationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes all servers from your server catalog.
    */
  def deleteServerCatalog(): awsDashSdkLib.libRequestMod.Request[DeleteServerCatalogResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteServerCatalog(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteServerCatalogResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteServerCatalogResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes all servers from your server catalog.
    */
  def deleteServerCatalog(params: DeleteServerCatalogRequest): awsDashSdkLib.libRequestMod.Request[DeleteServerCatalogResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteServerCatalog(
    params: DeleteServerCatalogRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteServerCatalogResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteServerCatalogResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates the specified connector from AWS SMS. After you disassociate a connector, it is no longer available to support replication jobs.
    */
  def disassociateConnector(): awsDashSdkLib.libRequestMod.Request[DisassociateConnectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateConnector(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateConnectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociateConnectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates the specified connector from AWS SMS. After you disassociate a connector, it is no longer available to support replication jobs.
    */
  def disassociateConnector(params: DisassociateConnectorRequest): awsDashSdkLib.libRequestMod.Request[DisassociateConnectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateConnector(
    params: DisassociateConnectorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateConnectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociateConnectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Generates a target change set for a currently launched stack and writes it to an Amazon S3 object in the customer’s Amazon S3 bucket.
    */
  def generateChangeSet(): awsDashSdkLib.libRequestMod.Request[GenerateChangeSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def generateChangeSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GenerateChangeSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GenerateChangeSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Generates a target change set for a currently launched stack and writes it to an Amazon S3 object in the customer’s Amazon S3 bucket.
    */
  def generateChangeSet(params: GenerateChangeSetRequest): awsDashSdkLib.libRequestMod.Request[GenerateChangeSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def generateChangeSet(
    params: GenerateChangeSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GenerateChangeSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GenerateChangeSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Generates an Amazon CloudFormation template based on the current launch configuration and writes it to an Amazon S3 object in the customer’s Amazon S3 bucket.
    */
  def generateTemplate(): awsDashSdkLib.libRequestMod.Request[GenerateTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def generateTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GenerateTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GenerateTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Generates an Amazon CloudFormation template based on the current launch configuration and writes it to an Amazon S3 object in the customer’s Amazon S3 bucket.
    */
  def generateTemplate(params: GenerateTemplateRequest): awsDashSdkLib.libRequestMod.Request[GenerateTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def generateTemplate(
    params: GenerateTemplateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GenerateTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GenerateTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieve information about an application.
    */
  def getApp(): awsDashSdkLib.libRequestMod.Request[GetAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApp(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetAppResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieve information about an application.
    */
  def getApp(params: GetAppRequest): awsDashSdkLib.libRequestMod.Request[GetAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getApp(
    params: GetAppRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetAppResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the application launch configuration associated with an application.
    */
  def getAppLaunchConfiguration(): awsDashSdkLib.libRequestMod.Request[GetAppLaunchConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getAppLaunchConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetAppLaunchConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetAppLaunchConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the application launch configuration associated with an application.
    */
  def getAppLaunchConfiguration(params: GetAppLaunchConfigurationRequest): awsDashSdkLib.libRequestMod.Request[GetAppLaunchConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getAppLaunchConfiguration(
    params: GetAppLaunchConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetAppLaunchConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetAppLaunchConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves an application replication configuration associatd with an application.
    */
  def getAppReplicationConfiguration(): awsDashSdkLib.libRequestMod.Request[GetAppReplicationConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getAppReplicationConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetAppReplicationConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetAppReplicationConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves an application replication configuration associatd with an application.
    */
  def getAppReplicationConfiguration(params: GetAppReplicationConfigurationRequest): awsDashSdkLib.libRequestMod.Request[GetAppReplicationConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getAppReplicationConfiguration(
    params: GetAppReplicationConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetAppReplicationConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetAppReplicationConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the connectors registered with the AWS SMS.
    */
  def getConnectors(): awsDashSdkLib.libRequestMod.Request[GetConnectorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getConnectors(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetConnectorsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetConnectorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the connectors registered with the AWS SMS.
    */
  def getConnectors(params: GetConnectorsRequest): awsDashSdkLib.libRequestMod.Request[GetConnectorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getConnectors(
    params: GetConnectorsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetConnectorsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetConnectorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the specified replication job or all of your replication jobs.
    */
  def getReplicationJobs(): awsDashSdkLib.libRequestMod.Request[GetReplicationJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getReplicationJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetReplicationJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetReplicationJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the specified replication job or all of your replication jobs.
    */
  def getReplicationJobs(params: GetReplicationJobsRequest): awsDashSdkLib.libRequestMod.Request[GetReplicationJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getReplicationJobs(
    params: GetReplicationJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetReplicationJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetReplicationJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the replication runs for the specified replication job.
    */
  def getReplicationRuns(): awsDashSdkLib.libRequestMod.Request[GetReplicationRunsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getReplicationRuns(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetReplicationRunsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetReplicationRunsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the replication runs for the specified replication job.
    */
  def getReplicationRuns(params: GetReplicationRunsRequest): awsDashSdkLib.libRequestMod.Request[GetReplicationRunsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getReplicationRuns(
    params: GetReplicationRunsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetReplicationRunsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetReplicationRunsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the servers in your server catalog. Before you can describe your servers, you must import them using ImportServerCatalog.
    */
  def getServers(): awsDashSdkLib.libRequestMod.Request[GetServersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getServers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetServersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetServersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the servers in your server catalog. Before you can describe your servers, you must import them using ImportServerCatalog.
    */
  def getServers(params: GetServersRequest): awsDashSdkLib.libRequestMod.Request[GetServersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getServers(
    params: GetServersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetServersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetServersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gathers a complete list of on-premises servers. Connectors must be installed and monitoring all servers that you want to import. This call returns immediately, but might take additional time to retrieve all the servers.
    */
  def importServerCatalog(): awsDashSdkLib.libRequestMod.Request[ImportServerCatalogResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def importServerCatalog(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ImportServerCatalogResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ImportServerCatalogResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gathers a complete list of on-premises servers. Connectors must be installed and monitoring all servers that you want to import. This call returns immediately, but might take additional time to retrieve all the servers.
    */
  def importServerCatalog(params: ImportServerCatalogRequest): awsDashSdkLib.libRequestMod.Request[ImportServerCatalogResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def importServerCatalog(
    params: ImportServerCatalogRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ImportServerCatalogResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ImportServerCatalogResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Launches an application stack.
    */
  def launchApp(): awsDashSdkLib.libRequestMod.Request[LaunchAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def launchApp(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ LaunchAppResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[LaunchAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Launches an application stack.
    */
  def launchApp(params: LaunchAppRequest): awsDashSdkLib.libRequestMod.Request[LaunchAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def launchApp(
    params: LaunchAppRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ LaunchAppResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[LaunchAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of summaries for all applications.
    */
  def listApps(): awsDashSdkLib.libRequestMod.Request[ListAppsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listApps(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAppsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAppsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of summaries for all applications.
    */
  def listApps(params: ListAppsRequest): awsDashSdkLib.libRequestMod.Request[ListAppsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listApps(
    params: ListAppsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAppsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAppsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a launch configuration for an application.
    */
  def putAppLaunchConfiguration(): awsDashSdkLib.libRequestMod.Request[PutAppLaunchConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putAppLaunchConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutAppLaunchConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutAppLaunchConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a launch configuration for an application.
    */
  def putAppLaunchConfiguration(params: PutAppLaunchConfigurationRequest): awsDashSdkLib.libRequestMod.Request[PutAppLaunchConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putAppLaunchConfiguration(
    params: PutAppLaunchConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutAppLaunchConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutAppLaunchConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates or updates a replication configuration for an application.
    */
  def putAppReplicationConfiguration(): awsDashSdkLib.libRequestMod.Request[PutAppReplicationConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putAppReplicationConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutAppReplicationConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutAppReplicationConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates or updates a replication configuration for an application.
    */
  def putAppReplicationConfiguration(params: PutAppReplicationConfigurationRequest): awsDashSdkLib.libRequestMod.Request[PutAppReplicationConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putAppReplicationConfiguration(
    params: PutAppReplicationConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutAppReplicationConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutAppReplicationConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts replicating an application.
    */
  def startAppReplication(): awsDashSdkLib.libRequestMod.Request[StartAppReplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startAppReplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartAppReplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartAppReplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts replicating an application.
    */
  def startAppReplication(params: StartAppReplicationRequest): awsDashSdkLib.libRequestMod.Request[StartAppReplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startAppReplication(
    params: StartAppReplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartAppReplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartAppReplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts an on-demand replication run for the specified replication job. This replication run starts immediately. This replication run is in addition to the ones already scheduled. There is a limit on the number of on-demand replications runs you can request in a 24-hour period.
    */
  def startOnDemandReplicationRun(): awsDashSdkLib.libRequestMod.Request[StartOnDemandReplicationRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startOnDemandReplicationRun(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartOnDemandReplicationRunResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartOnDemandReplicationRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts an on-demand replication run for the specified replication job. This replication run starts immediately. This replication run is in addition to the ones already scheduled. There is a limit on the number of on-demand replications runs you can request in a 24-hour period.
    */
  def startOnDemandReplicationRun(params: StartOnDemandReplicationRunRequest): awsDashSdkLib.libRequestMod.Request[StartOnDemandReplicationRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startOnDemandReplicationRun(
    params: StartOnDemandReplicationRunRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartOnDemandReplicationRunResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartOnDemandReplicationRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops replicating an application.
    */
  def stopAppReplication(): awsDashSdkLib.libRequestMod.Request[StopAppReplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopAppReplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopAppReplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopAppReplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops replicating an application.
    */
  def stopAppReplication(params: StopAppReplicationRequest): awsDashSdkLib.libRequestMod.Request[StopAppReplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopAppReplication(
    params: StopAppReplicationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopAppReplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopAppReplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Terminates the stack for an application.
    */
  def terminateApp(): awsDashSdkLib.libRequestMod.Request[TerminateAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def terminateApp(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TerminateAppResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TerminateAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Terminates the stack for an application.
    */
  def terminateApp(params: TerminateAppRequest): awsDashSdkLib.libRequestMod.Request[TerminateAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def terminateApp(
    params: TerminateAppRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TerminateAppResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TerminateAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an application.
    */
  def updateApp(): awsDashSdkLib.libRequestMod.Request[UpdateAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateApp(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateAppResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an application.
    */
  def updateApp(params: UpdateAppRequest): awsDashSdkLib.libRequestMod.Request[UpdateAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateApp(
    params: UpdateAppRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateAppResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateAppResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified settings for the specified replication job.
    */
  def updateReplicationJob(): awsDashSdkLib.libRequestMod.Request[UpdateReplicationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateReplicationJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateReplicationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateReplicationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified settings for the specified replication job.
    */
  def updateReplicationJob(params: UpdateReplicationJobRequest): awsDashSdkLib.libRequestMod.Request[UpdateReplicationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateReplicationJob(
    params: UpdateReplicationJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateReplicationJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateReplicationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

