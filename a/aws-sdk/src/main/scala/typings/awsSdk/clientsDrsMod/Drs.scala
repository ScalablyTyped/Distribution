package typings.awsSdk.clientsDrsMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Drs extends Service {
  
  @JSName("config")
  var config_Drs: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Create an extended source server in the target Account based on the source server in staging account.
    */
  def createExtendedSourceServer(): Request[CreateExtendedSourceServerResponse, AWSError] = js.native
  def createExtendedSourceServer(callback: js.Function2[/* err */ AWSError, /* data */ CreateExtendedSourceServerResponse, Unit]): Request[CreateExtendedSourceServerResponse, AWSError] = js.native
  /**
    * Create an extended source server in the target Account based on the source server in staging account.
    */
  def createExtendedSourceServer(params: CreateExtendedSourceServerRequest): Request[CreateExtendedSourceServerResponse, AWSError] = js.native
  def createExtendedSourceServer(
    params: CreateExtendedSourceServerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateExtendedSourceServerResponse, Unit]
  ): Request[CreateExtendedSourceServerResponse, AWSError] = js.native
  
  /**
    * Creates a new ReplicationConfigurationTemplate.
    */
  def createReplicationConfigurationTemplate(): Request[ReplicationConfigurationTemplate, AWSError] = js.native
  def createReplicationConfigurationTemplate(callback: js.Function2[/* err */ AWSError, /* data */ ReplicationConfigurationTemplate, Unit]): Request[ReplicationConfigurationTemplate, AWSError] = js.native
  /**
    * Creates a new ReplicationConfigurationTemplate.
    */
  def createReplicationConfigurationTemplate(params: CreateReplicationConfigurationTemplateRequest): Request[ReplicationConfigurationTemplate, AWSError] = js.native
  def createReplicationConfigurationTemplate(
    params: CreateReplicationConfigurationTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ReplicationConfigurationTemplate, Unit]
  ): Request[ReplicationConfigurationTemplate, AWSError] = js.native
  
  /**
    * Deletes a single Job by ID.
    */
  def deleteJob(): Request[DeleteJobResponse, AWSError] = js.native
  def deleteJob(callback: js.Function2[/* err */ AWSError, /* data */ DeleteJobResponse, Unit]): Request[DeleteJobResponse, AWSError] = js.native
  /**
    * Deletes a single Job by ID.
    */
  def deleteJob(params: DeleteJobRequest): Request[DeleteJobResponse, AWSError] = js.native
  def deleteJob(
    params: DeleteJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteJobResponse, Unit]
  ): Request[DeleteJobResponse, AWSError] = js.native
  
  /**
    * Deletes a single Recovery Instance by ID. This deletes the Recovery Instance resource from Elastic Disaster Recovery. The Recovery Instance must be disconnected first in order to delete it.
    */
  def deleteRecoveryInstance(): Request[js.Object, AWSError] = js.native
  def deleteRecoveryInstance(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a single Recovery Instance by ID. This deletes the Recovery Instance resource from Elastic Disaster Recovery. The Recovery Instance must be disconnected first in order to delete it.
    */
  def deleteRecoveryInstance(params: DeleteRecoveryInstanceRequest): Request[js.Object, AWSError] = js.native
  def deleteRecoveryInstance(
    params: DeleteRecoveryInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a single Replication Configuration Template by ID
    */
  def deleteReplicationConfigurationTemplate(): Request[DeleteReplicationConfigurationTemplateResponse, AWSError] = js.native
  def deleteReplicationConfigurationTemplate(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteReplicationConfigurationTemplateResponse, Unit]
  ): Request[DeleteReplicationConfigurationTemplateResponse, AWSError] = js.native
  /**
    * Deletes a single Replication Configuration Template by ID
    */
  def deleteReplicationConfigurationTemplate(params: DeleteReplicationConfigurationTemplateRequest): Request[DeleteReplicationConfigurationTemplateResponse, AWSError] = js.native
  def deleteReplicationConfigurationTemplate(
    params: DeleteReplicationConfigurationTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteReplicationConfigurationTemplateResponse, Unit]
  ): Request[DeleteReplicationConfigurationTemplateResponse, AWSError] = js.native
  
  /**
    * Deletes a single Source Server by ID. The Source Server must be disconnected first.
    */
  def deleteSourceServer(): Request[DeleteSourceServerResponse, AWSError] = js.native
  def deleteSourceServer(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSourceServerResponse, Unit]): Request[DeleteSourceServerResponse, AWSError] = js.native
  /**
    * Deletes a single Source Server by ID. The Source Server must be disconnected first.
    */
  def deleteSourceServer(params: DeleteSourceServerRequest): Request[DeleteSourceServerResponse, AWSError] = js.native
  def deleteSourceServer(
    params: DeleteSourceServerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSourceServerResponse, Unit]
  ): Request[DeleteSourceServerResponse, AWSError] = js.native
  
  /**
    * Retrieves a detailed Job log with pagination.
    */
  def describeJobLogItems(): Request[DescribeJobLogItemsResponse, AWSError] = js.native
  def describeJobLogItems(callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobLogItemsResponse, Unit]): Request[DescribeJobLogItemsResponse, AWSError] = js.native
  /**
    * Retrieves a detailed Job log with pagination.
    */
  def describeJobLogItems(params: DescribeJobLogItemsRequest): Request[DescribeJobLogItemsResponse, AWSError] = js.native
  def describeJobLogItems(
    params: DescribeJobLogItemsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobLogItemsResponse, Unit]
  ): Request[DescribeJobLogItemsResponse, AWSError] = js.native
  
  /**
    * Returns a list of Jobs. Use the JobsID and fromDate and toDate filters to limit which jobs are returned. The response is sorted by creationDataTime - latest date first. Jobs are created by the StartRecovery, TerminateRecoveryInstances and StartFailbackLaunch APIs. Jobs are also created by DiagnosticLaunch and TerminateDiagnosticInstances, which are APIs available only to *Support* and only used in response to relevant support tickets.
    */
  def describeJobs(): Request[DescribeJobsResponse, AWSError] = js.native
  def describeJobs(callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobsResponse, Unit]): Request[DescribeJobsResponse, AWSError] = js.native
  /**
    * Returns a list of Jobs. Use the JobsID and fromDate and toDate filters to limit which jobs are returned. The response is sorted by creationDataTime - latest date first. Jobs are created by the StartRecovery, TerminateRecoveryInstances and StartFailbackLaunch APIs. Jobs are also created by DiagnosticLaunch and TerminateDiagnosticInstances, which are APIs available only to *Support* and only used in response to relevant support tickets.
    */
  def describeJobs(params: DescribeJobsRequest): Request[DescribeJobsResponse, AWSError] = js.native
  def describeJobs(
    params: DescribeJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobsResponse, Unit]
  ): Request[DescribeJobsResponse, AWSError] = js.native
  
  /**
    * Lists all Recovery Instances or multiple Recovery Instances by ID.
    */
  def describeRecoveryInstances(): Request[DescribeRecoveryInstancesResponse, AWSError] = js.native
  def describeRecoveryInstances(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRecoveryInstancesResponse, Unit]): Request[DescribeRecoveryInstancesResponse, AWSError] = js.native
  /**
    * Lists all Recovery Instances or multiple Recovery Instances by ID.
    */
  def describeRecoveryInstances(params: DescribeRecoveryInstancesRequest): Request[DescribeRecoveryInstancesResponse, AWSError] = js.native
  def describeRecoveryInstances(
    params: DescribeRecoveryInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRecoveryInstancesResponse, Unit]
  ): Request[DescribeRecoveryInstancesResponse, AWSError] = js.native
  
  /**
    * Lists all Recovery Snapshots for a single Source Server.
    */
  def describeRecoverySnapshots(): Request[DescribeRecoverySnapshotsResponse, AWSError] = js.native
  def describeRecoverySnapshots(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRecoverySnapshotsResponse, Unit]): Request[DescribeRecoverySnapshotsResponse, AWSError] = js.native
  /**
    * Lists all Recovery Snapshots for a single Source Server.
    */
  def describeRecoverySnapshots(params: DescribeRecoverySnapshotsRequest): Request[DescribeRecoverySnapshotsResponse, AWSError] = js.native
  def describeRecoverySnapshots(
    params: DescribeRecoverySnapshotsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRecoverySnapshotsResponse, Unit]
  ): Request[DescribeRecoverySnapshotsResponse, AWSError] = js.native
  
  /**
    * Lists all ReplicationConfigurationTemplates, filtered by Source Server IDs.
    */
  def describeReplicationConfigurationTemplates(): Request[DescribeReplicationConfigurationTemplatesResponse, AWSError] = js.native
  def describeReplicationConfigurationTemplates(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeReplicationConfigurationTemplatesResponse, 
      Unit
    ]
  ): Request[DescribeReplicationConfigurationTemplatesResponse, AWSError] = js.native
  /**
    * Lists all ReplicationConfigurationTemplates, filtered by Source Server IDs.
    */
  def describeReplicationConfigurationTemplates(params: DescribeReplicationConfigurationTemplatesRequest): Request[DescribeReplicationConfigurationTemplatesResponse, AWSError] = js.native
  def describeReplicationConfigurationTemplates(
    params: DescribeReplicationConfigurationTemplatesRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeReplicationConfigurationTemplatesResponse, 
      Unit
    ]
  ): Request[DescribeReplicationConfigurationTemplatesResponse, AWSError] = js.native
  
  /**
    * Lists all Source Servers or multiple Source Servers filtered by ID.
    */
  def describeSourceServers(): Request[DescribeSourceServersResponse, AWSError] = js.native
  def describeSourceServers(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSourceServersResponse, Unit]): Request[DescribeSourceServersResponse, AWSError] = js.native
  /**
    * Lists all Source Servers or multiple Source Servers filtered by ID.
    */
  def describeSourceServers(params: DescribeSourceServersRequest): Request[DescribeSourceServersResponse, AWSError] = js.native
  def describeSourceServers(
    params: DescribeSourceServersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSourceServersResponse, Unit]
  ): Request[DescribeSourceServersResponse, AWSError] = js.native
  
  /**
    * Disconnect a Recovery Instance from Elastic Disaster Recovery. Data replication is stopped immediately. All AWS resources created by Elastic Disaster Recovery for enabling the replication of the Recovery Instance will be terminated / deleted within 90 minutes. If the agent on the Recovery Instance has not been prevented from communicating with the Elastic Disaster Recovery service, then it will receive a command to uninstall itself (within approximately 10 minutes). The following properties of the Recovery Instance will be changed immediately: dataReplicationInfo.dataReplicationState will be set to DISCONNECTED; The totalStorageBytes property for each of dataReplicationInfo.replicatedDisks will be set to zero; dataReplicationInfo.lagDuration and dataReplicationInfo.lagDuration will be nullified.
    */
  def disconnectRecoveryInstance(): Request[js.Object, AWSError] = js.native
  def disconnectRecoveryInstance(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Disconnect a Recovery Instance from Elastic Disaster Recovery. Data replication is stopped immediately. All AWS resources created by Elastic Disaster Recovery for enabling the replication of the Recovery Instance will be terminated / deleted within 90 minutes. If the agent on the Recovery Instance has not been prevented from communicating with the Elastic Disaster Recovery service, then it will receive a command to uninstall itself (within approximately 10 minutes). The following properties of the Recovery Instance will be changed immediately: dataReplicationInfo.dataReplicationState will be set to DISCONNECTED; The totalStorageBytes property for each of dataReplicationInfo.replicatedDisks will be set to zero; dataReplicationInfo.lagDuration and dataReplicationInfo.lagDuration will be nullified.
    */
  def disconnectRecoveryInstance(params: DisconnectRecoveryInstanceRequest): Request[js.Object, AWSError] = js.native
  def disconnectRecoveryInstance(
    params: DisconnectRecoveryInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Disconnects a specific Source Server from Elastic Disaster Recovery. Data replication is stopped immediately. All AWS resources created by Elastic Disaster Recovery for enabling the replication of the Source Server will be terminated / deleted within 90 minutes. You cannot disconnect a Source Server if it has a Recovery Instance. If the agent on the Source Server has not been prevented from communicating with the Elastic Disaster Recovery service, then it will receive a command to uninstall itself (within approximately 10 minutes). The following properties of the SourceServer will be changed immediately: dataReplicationInfo.dataReplicationState will be set to DISCONNECTED; The totalStorageBytes property for each of dataReplicationInfo.replicatedDisks will be set to zero; dataReplicationInfo.lagDuration and dataReplicationInfo.lagDuration will be nullified.
    */
  def disconnectSourceServer(): Request[SourceServer, AWSError] = js.native
  def disconnectSourceServer(callback: js.Function2[/* err */ AWSError, /* data */ SourceServer, Unit]): Request[SourceServer, AWSError] = js.native
  /**
    * Disconnects a specific Source Server from Elastic Disaster Recovery. Data replication is stopped immediately. All AWS resources created by Elastic Disaster Recovery for enabling the replication of the Source Server will be terminated / deleted within 90 minutes. You cannot disconnect a Source Server if it has a Recovery Instance. If the agent on the Source Server has not been prevented from communicating with the Elastic Disaster Recovery service, then it will receive a command to uninstall itself (within approximately 10 minutes). The following properties of the SourceServer will be changed immediately: dataReplicationInfo.dataReplicationState will be set to DISCONNECTED; The totalStorageBytes property for each of dataReplicationInfo.replicatedDisks will be set to zero; dataReplicationInfo.lagDuration and dataReplicationInfo.lagDuration will be nullified.
    */
  def disconnectSourceServer(params: DisconnectSourceServerRequest): Request[SourceServer, AWSError] = js.native
  def disconnectSourceServer(
    params: DisconnectSourceServerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SourceServer, Unit]
  ): Request[SourceServer, AWSError] = js.native
  
  /**
    * Lists all Failback ReplicationConfigurations, filtered by Recovery Instance ID.
    */
  def getFailbackReplicationConfiguration(): Request[GetFailbackReplicationConfigurationResponse, AWSError] = js.native
  def getFailbackReplicationConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ GetFailbackReplicationConfigurationResponse, Unit]
  ): Request[GetFailbackReplicationConfigurationResponse, AWSError] = js.native
  /**
    * Lists all Failback ReplicationConfigurations, filtered by Recovery Instance ID.
    */
  def getFailbackReplicationConfiguration(params: GetFailbackReplicationConfigurationRequest): Request[GetFailbackReplicationConfigurationResponse, AWSError] = js.native
  def getFailbackReplicationConfiguration(
    params: GetFailbackReplicationConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFailbackReplicationConfigurationResponse, Unit]
  ): Request[GetFailbackReplicationConfigurationResponse, AWSError] = js.native
  
  /**
    * Gets a LaunchConfiguration, filtered by Source Server IDs.
    */
  def getLaunchConfiguration(): Request[LaunchConfiguration, AWSError] = js.native
  def getLaunchConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ LaunchConfiguration, Unit]): Request[LaunchConfiguration, AWSError] = js.native
  /**
    * Gets a LaunchConfiguration, filtered by Source Server IDs.
    */
  def getLaunchConfiguration(params: GetLaunchConfigurationRequest): Request[LaunchConfiguration, AWSError] = js.native
  def getLaunchConfiguration(
    params: GetLaunchConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ LaunchConfiguration, Unit]
  ): Request[LaunchConfiguration, AWSError] = js.native
  
  /**
    * Gets a ReplicationConfiguration, filtered by Source Server ID.
    */
  def getReplicationConfiguration(): Request[ReplicationConfiguration, AWSError] = js.native
  def getReplicationConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ ReplicationConfiguration, Unit]): Request[ReplicationConfiguration, AWSError] = js.native
  /**
    * Gets a ReplicationConfiguration, filtered by Source Server ID.
    */
  def getReplicationConfiguration(params: GetReplicationConfigurationRequest): Request[ReplicationConfiguration, AWSError] = js.native
  def getReplicationConfiguration(
    params: GetReplicationConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ReplicationConfiguration, Unit]
  ): Request[ReplicationConfiguration, AWSError] = js.native
  
  /**
    * Initialize Elastic Disaster Recovery.
    */
  def initializeService(): Request[InitializeServiceResponse, AWSError] = js.native
  def initializeService(callback: js.Function2[/* err */ AWSError, /* data */ InitializeServiceResponse, Unit]): Request[InitializeServiceResponse, AWSError] = js.native
  /**
    * Initialize Elastic Disaster Recovery.
    */
  def initializeService(params: InitializeServiceRequest): Request[InitializeServiceResponse, AWSError] = js.native
  def initializeService(
    params: InitializeServiceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ InitializeServiceResponse, Unit]
  ): Request[InitializeServiceResponse, AWSError] = js.native
  
  /**
    * Returns a list of source servers on a staging account that are extensible, which means that: a. The source server is not already extended into this Account. b. The source server on the Account we’re reading from is not an extension of another source server. 
    */
  def listExtensibleSourceServers(): Request[ListExtensibleSourceServersResponse, AWSError] = js.native
  def listExtensibleSourceServers(callback: js.Function2[/* err */ AWSError, /* data */ ListExtensibleSourceServersResponse, Unit]): Request[ListExtensibleSourceServersResponse, AWSError] = js.native
  /**
    * Returns a list of source servers on a staging account that are extensible, which means that: a. The source server is not already extended into this Account. b. The source server on the Account we’re reading from is not an extension of another source server. 
    */
  def listExtensibleSourceServers(params: ListExtensibleSourceServersRequest): Request[ListExtensibleSourceServersResponse, AWSError] = js.native
  def listExtensibleSourceServers(
    params: ListExtensibleSourceServersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListExtensibleSourceServersResponse, Unit]
  ): Request[ListExtensibleSourceServersResponse, AWSError] = js.native
  
  /**
    * Returns an array of staging accounts for existing extended source servers.
    */
  def listStagingAccounts(): Request[ListStagingAccountsResponse, AWSError] = js.native
  def listStagingAccounts(callback: js.Function2[/* err */ AWSError, /* data */ ListStagingAccountsResponse, Unit]): Request[ListStagingAccountsResponse, AWSError] = js.native
  /**
    * Returns an array of staging accounts for existing extended source servers.
    */
  def listStagingAccounts(params: ListStagingAccountsRequest): Request[ListStagingAccountsResponse, AWSError] = js.native
  def listStagingAccounts(
    params: ListStagingAccountsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStagingAccountsResponse, Unit]
  ): Request[ListStagingAccountsResponse, AWSError] = js.native
  
  /**
    * List all tags for your Elastic Disaster Recovery resources.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * List all tags for your Elastic Disaster Recovery resources.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Causes the data replication initiation sequence to begin immediately upon next Handshake for the specified Source Server ID, regardless of when the previous initiation started. This command will work only if the Source Server is stalled or is in a DISCONNECTED or STOPPED state.
    */
  def retryDataReplication(): Request[SourceServer, AWSError] = js.native
  def retryDataReplication(callback: js.Function2[/* err */ AWSError, /* data */ SourceServer, Unit]): Request[SourceServer, AWSError] = js.native
  /**
    * Causes the data replication initiation sequence to begin immediately upon next Handshake for the specified Source Server ID, regardless of when the previous initiation started. This command will work only if the Source Server is stalled or is in a DISCONNECTED or STOPPED state.
    */
  def retryDataReplication(params: RetryDataReplicationRequest): Request[SourceServer, AWSError] = js.native
  def retryDataReplication(
    params: RetryDataReplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SourceServer, Unit]
  ): Request[SourceServer, AWSError] = js.native
  
  /**
    * Initiates a Job for launching the machine that is being failed back to from the specified Recovery Instance. This will run conversion on the failback client and will reboot your machine, thus completing the failback process.
    */
  def startFailbackLaunch(): Request[StartFailbackLaunchResponse, AWSError] = js.native
  def startFailbackLaunch(callback: js.Function2[/* err */ AWSError, /* data */ StartFailbackLaunchResponse, Unit]): Request[StartFailbackLaunchResponse, AWSError] = js.native
  /**
    * Initiates a Job for launching the machine that is being failed back to from the specified Recovery Instance. This will run conversion on the failback client and will reboot your machine, thus completing the failback process.
    */
  def startFailbackLaunch(params: StartFailbackLaunchRequest): Request[StartFailbackLaunchResponse, AWSError] = js.native
  def startFailbackLaunch(
    params: StartFailbackLaunchRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartFailbackLaunchResponse, Unit]
  ): Request[StartFailbackLaunchResponse, AWSError] = js.native
  
  /**
    * Launches Recovery Instances for the specified Source Servers. For each Source Server you may choose a point in time snapshot to launch from, or use an on demand snapshot.
    */
  def startRecovery(): Request[StartRecoveryResponse, AWSError] = js.native
  def startRecovery(callback: js.Function2[/* err */ AWSError, /* data */ StartRecoveryResponse, Unit]): Request[StartRecoveryResponse, AWSError] = js.native
  /**
    * Launches Recovery Instances for the specified Source Servers. For each Source Server you may choose a point in time snapshot to launch from, or use an on demand snapshot.
    */
  def startRecovery(params: StartRecoveryRequest): Request[StartRecoveryResponse, AWSError] = js.native
  def startRecovery(
    params: StartRecoveryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartRecoveryResponse, Unit]
  ): Request[StartRecoveryResponse, AWSError] = js.native
  
  /**
    * Stops the failback process for a specified Recovery Instance. This changes the Failback State of the Recovery Instance back to FAILBACK_NOT_STARTED.
    */
  def stopFailback(): Request[js.Object, AWSError] = js.native
  def stopFailback(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Stops the failback process for a specified Recovery Instance. This changes the Failback State of the Recovery Instance back to FAILBACK_NOT_STARTED.
    */
  def stopFailback(params: StopFailbackRequest): Request[js.Object, AWSError] = js.native
  def stopFailback(
    params: StopFailbackRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Adds or overwrites only the specified tags for the specified Elastic Disaster Recovery resource or resources. When you specify an existing tag key, the value is overwritten with the new value. Each resource can have a maximum of 50 tags. Each tag consists of a key and optional value.
    */
  def tagResource(): Request[js.Object, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds or overwrites only the specified tags for the specified Elastic Disaster Recovery resource or resources. When you specify an existing tag key, the value is overwritten with the new value. Each resource can have a maximum of 50 tags. Each tag consists of a key and optional value.
    */
  def tagResource(params: TagResourceRequest): Request[js.Object, AWSError] = js.native
  def tagResource(params: TagResourceRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Initiates a Job for terminating the EC2 resources associated with the specified Recovery Instances, and then will delete the Recovery Instances from the Elastic Disaster Recovery service.
    */
  def terminateRecoveryInstances(): Request[TerminateRecoveryInstancesResponse, AWSError] = js.native
  def terminateRecoveryInstances(callback: js.Function2[/* err */ AWSError, /* data */ TerminateRecoveryInstancesResponse, Unit]): Request[TerminateRecoveryInstancesResponse, AWSError] = js.native
  /**
    * Initiates a Job for terminating the EC2 resources associated with the specified Recovery Instances, and then will delete the Recovery Instances from the Elastic Disaster Recovery service.
    */
  def terminateRecoveryInstances(params: TerminateRecoveryInstancesRequest): Request[TerminateRecoveryInstancesResponse, AWSError] = js.native
  def terminateRecoveryInstances(
    params: TerminateRecoveryInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TerminateRecoveryInstancesResponse, Unit]
  ): Request[TerminateRecoveryInstancesResponse, AWSError] = js.native
  
  /**
    * Deletes the specified set of tags from the specified set of Elastic Disaster Recovery resources.
    */
  def untagResource(): Request[js.Object, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified set of tags from the specified set of Elastic Disaster Recovery resources.
    */
  def untagResource(params: UntagResourceRequest): Request[js.Object, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Allows you to update the failback replication configuration of a Recovery Instance by ID.
    */
  def updateFailbackReplicationConfiguration(): Request[js.Object, AWSError] = js.native
  def updateFailbackReplicationConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Allows you to update the failback replication configuration of a Recovery Instance by ID.
    */
  def updateFailbackReplicationConfiguration(params: UpdateFailbackReplicationConfigurationRequest): Request[js.Object, AWSError] = js.native
  def updateFailbackReplicationConfiguration(
    params: UpdateFailbackReplicationConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates a LaunchConfiguration by Source Server ID.
    */
  def updateLaunchConfiguration(): Request[LaunchConfiguration, AWSError] = js.native
  def updateLaunchConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ LaunchConfiguration, Unit]): Request[LaunchConfiguration, AWSError] = js.native
  /**
    * Updates a LaunchConfiguration by Source Server ID.
    */
  def updateLaunchConfiguration(params: UpdateLaunchConfigurationRequest): Request[LaunchConfiguration, AWSError] = js.native
  def updateLaunchConfiguration(
    params: UpdateLaunchConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ LaunchConfiguration, Unit]
  ): Request[LaunchConfiguration, AWSError] = js.native
  
  /**
    * Allows you to update a ReplicationConfiguration by Source Server ID.
    */
  def updateReplicationConfiguration(): Request[ReplicationConfiguration, AWSError] = js.native
  def updateReplicationConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ ReplicationConfiguration, Unit]): Request[ReplicationConfiguration, AWSError] = js.native
  /**
    * Allows you to update a ReplicationConfiguration by Source Server ID.
    */
  def updateReplicationConfiguration(params: UpdateReplicationConfigurationRequest): Request[ReplicationConfiguration, AWSError] = js.native
  def updateReplicationConfiguration(
    params: UpdateReplicationConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ReplicationConfiguration, Unit]
  ): Request[ReplicationConfiguration, AWSError] = js.native
  
  /**
    * Updates a ReplicationConfigurationTemplate by ID.
    */
  def updateReplicationConfigurationTemplate(): Request[ReplicationConfigurationTemplate, AWSError] = js.native
  def updateReplicationConfigurationTemplate(callback: js.Function2[/* err */ AWSError, /* data */ ReplicationConfigurationTemplate, Unit]): Request[ReplicationConfigurationTemplate, AWSError] = js.native
  /**
    * Updates a ReplicationConfigurationTemplate by ID.
    */
  def updateReplicationConfigurationTemplate(params: UpdateReplicationConfigurationTemplateRequest): Request[ReplicationConfigurationTemplate, AWSError] = js.native
  def updateReplicationConfigurationTemplate(
    params: UpdateReplicationConfigurationTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ReplicationConfigurationTemplate, Unit]
  ): Request[ReplicationConfigurationTemplate, AWSError] = js.native
}
