package typings
package awsDashSdkLib.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/sms", "SMS")
@js.native
object SMSNs extends js.Object {
  trait AppSummary extends js.Object {
    /**
      * Unique ID of the application.
      */
    var appId: js.UndefOr[AppId] = js.undefined
    /**
      * Time of creation of this application.
      */
    var creationTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * Description of the application.
      */
    var description: js.UndefOr[AppDescription] = js.undefined
    /**
      * Timestamp of the application's creation.
      */
    var lastModified: js.UndefOr[Timestamp] = js.undefined
    /**
      * Timestamp of the application's most recent successful replication.
      */
    var latestReplicationTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * Details about the latest launch of the application.
      */
    var launchDetails: js.UndefOr[LaunchDetails] = js.undefined
    /**
      * Launch status of the application.
      */
    var launchStatus: js.UndefOr[AppLaunchStatus] = js.undefined
    /**
      * A message related to the launch status of the application.
      */
    var launchStatusMessage: js.UndefOr[AppLaunchStatusMessage] = js.undefined
    /**
      * Name of the application.
      */
    var name: js.UndefOr[AppName] = js.undefined
    /**
      * Replication status of the application.
      */
    var replicationStatus: js.UndefOr[AppReplicationStatus] = js.undefined
    /**
      * A message related to the replication status of the application.
      */
    var replicationStatusMessage: js.UndefOr[AppReplicationStatusMessage] = js.undefined
    /**
      * Name of the service role in the customer's account used by AWS SMS.
      */
    var roleName: js.UndefOr[RoleName] = js.undefined
    /**
      * Status of the application.
      */
    var status: js.UndefOr[AppStatus] = js.undefined
    /**
      * A message related to the status of the application
      */
    var statusMessage: js.UndefOr[AppStatusMessage] = js.undefined
    /**
      * Number of server groups present in the application.
      */
    var totalServerGroups: js.UndefOr[TotalServerGroups] = js.undefined
    /**
      * Number of servers present in the application.
      */
    var totalServers: js.UndefOr[TotalServers] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait Connector extends js.Object {
    /**
      * The time the connector was associated.
      */
    var associatedOn: js.UndefOr[Timestamp] = js.undefined
    /**
      * The capabilities of the connector.
      */
    var capabilityList: js.UndefOr[ConnectorCapabilityList] = js.undefined
    /**
      * The identifier of the connector.
      */
    var connectorId: js.UndefOr[ConnectorId] = js.undefined
    /**
      * The IP address of the connector.
      */
    var ipAddress: js.UndefOr[IpAddress] = js.undefined
    /**
      * The MAC address of the connector.
      */
    var macAddress: js.UndefOr[MacAddress] = js.undefined
    /**
      * The status of the connector.
      */
    var status: js.UndefOr[ConnectorStatus] = js.undefined
    /**
      * The connector version.
      */
    var version: js.UndefOr[ConnectorVersion] = js.undefined
    /**
      * The identifier of the VM manager.
      */
    var vmManagerId: js.UndefOr[VmManagerId] = js.undefined
    /**
      * The name of the VM manager.
      */
    var vmManagerName: js.UndefOr[VmManagerName] = js.undefined
    /**
      * The VM management product.
      */
    var vmManagerType: js.UndefOr[VmManagerType] = js.undefined
  }
  
  trait CreateAppRequest extends js.Object {
    /**
      * A unique, case-sensitive identifier you provide to ensure idempotency of application creation.
      */
    var clientToken: js.UndefOr[ClientToken] = js.undefined
    /**
      * Description of the new application
      */
    var description: js.UndefOr[AppDescription] = js.undefined
    /**
      * Name of the new application.
      */
    var name: js.UndefOr[AppName] = js.undefined
    /**
      * Name of service role in customer's account to be used by AWS SMS.
      */
    var roleName: js.UndefOr[RoleName] = js.undefined
    /**
      * List of server groups to include in the application.
      */
    var serverGroups: js.UndefOr[ServerGroups] = js.undefined
    /**
      * List of tags to be associated with the application.
      */
    var tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait CreateAppResponse extends js.Object {
    /**
      * Summary description of the application.
      */
    var appSummary: js.UndefOr[AppSummary] = js.undefined
    /**
      * List of server groups included in the application.
      */
    var serverGroups: js.UndefOr[ServerGroups] = js.undefined
    /**
      * List of taags associated with the application.
      */
    var tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait CreateReplicationJobRequest extends js.Object {
    /**
      * The description of the replication job.
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      * When true, the replication job produces encrypted AMIs. See also KmsKeyId below.
      */
    var encrypted: js.UndefOr[Encrypted] = js.undefined
    /**
      * The time between consecutive replication runs, in hours.
      */
    var frequency: js.UndefOr[Frequency] = js.undefined
    /**
      * KMS key ID for replication jobs that produce encrypted AMIs. Can be any of the following:    KMS key ID   KMS key alias   ARN referring to KMS key ID   ARN referring to KMS key alias    If encrypted is true but a KMS key id is not specified, the customer's default KMS key for EBS is used. 
      */
    var kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    /**
      * The license type to be used for the AMI created by a successful replication run.
      */
    var licenseType: js.UndefOr[LicenseType] = js.undefined
    /**
      * The maximum number of SMS-created AMIs to retain. The oldest will be deleted once the maximum number is reached and a new AMI is created.
      */
    var numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep] = js.undefined
    /**
      * The name of the IAM role to be used by the AWS SMS.
      */
    var roleName: js.UndefOr[RoleName] = js.undefined
    /**
      * 
      */
    var runOnce: js.UndefOr[RunOnce] = js.undefined
    /**
      * The seed replication time.
      */
    var seedReplicationTime: Timestamp
    /**
      * The identifier of the server.
      */
    var serverId: ServerId
  }
  
  trait CreateReplicationJobResponse extends js.Object {
    /**
      * The unique identifier of the replication job.
      */
    var replicationJobId: js.UndefOr[ReplicationJobId] = js.undefined
  }
  
  trait DeleteAppLaunchConfigurationRequest extends js.Object {
    /**
      * ID of the application associated with the launch configuration.
      */
    var appId: js.UndefOr[AppId] = js.undefined
  }
  
  trait DeleteAppLaunchConfigurationResponse extends js.Object
  
  trait DeleteAppReplicationConfigurationRequest extends js.Object {
    /**
      * ID of the application associated with the replication configuration.
      */
    var appId: js.UndefOr[AppId] = js.undefined
  }
  
  trait DeleteAppReplicationConfigurationResponse extends js.Object
  
  trait DeleteAppRequest extends js.Object {
    /**
      * ID of the application to delete.
      */
    var appId: js.UndefOr[AppId] = js.undefined
    /**
      * While deleting the application, stop all replication jobs corresponding to the servers in the application.
      */
    var forceStopAppReplication: js.UndefOr[ForceStopAppReplication] = js.undefined
    /**
      * While deleting the application, terminate the stack corresponding to the application.
      */
    var forceTerminateApp: js.UndefOr[ForceTerminateApp] = js.undefined
  }
  
  trait DeleteAppResponse extends js.Object
  
  trait DeleteReplicationJobRequest extends js.Object {
    /**
      * The identifier of the replication job.
      */
    var replicationJobId: ReplicationJobId
  }
  
  trait DeleteReplicationJobResponse extends js.Object
  
  trait DeleteServerCatalogRequest extends js.Object
  
  trait DeleteServerCatalogResponse extends js.Object
  
  trait DisassociateConnectorRequest extends js.Object {
    /**
      * The identifier of the connector.
      */
    var connectorId: ConnectorId
  }
  
  trait DisassociateConnectorResponse extends js.Object
  
  trait GenerateChangeSetRequest extends js.Object {
    /**
      * ID of the application associated with the change set.
      */
    var appId: js.UndefOr[AppId] = js.undefined
    /**
      * Format for the change set.
      */
    var changesetFormat: js.UndefOr[OutputFormat] = js.undefined
  }
  
  trait GenerateChangeSetResponse extends js.Object {
    /**
      * Location of the Amazon S3 object.
      */
    var s3Location: js.UndefOr[S3Location] = js.undefined
  }
  
  trait GenerateTemplateRequest extends js.Object {
    /**
      * ID of the application associated with the Amazon CloudFormation template.
      */
    var appId: js.UndefOr[AppId] = js.undefined
    /**
      * Format for generating the Amazon CloudFormation template.
      */
    var templateFormat: js.UndefOr[OutputFormat] = js.undefined
  }
  
  trait GenerateTemplateResponse extends js.Object {
    /**
      * Location of the Amazon S3 object.
      */
    var s3Location: js.UndefOr[S3Location] = js.undefined
  }
  
  trait GetAppLaunchConfigurationRequest extends js.Object {
    /**
      * ID of the application launch configuration.
      */
    var appId: js.UndefOr[AppId] = js.undefined
  }
  
  trait GetAppLaunchConfigurationResponse extends js.Object {
    /**
      * ID of the application associated with the launch configuration.
      */
    var appId: js.UndefOr[AppId] = js.undefined
    /**
      * Name of the service role in the customer's account that Amazon CloudFormation uses to launch the application.
      */
    var roleName: js.UndefOr[RoleName] = js.undefined
    /**
      * List of launch configurations for server groups in this application.
      */
    var serverGroupLaunchConfigurations: js.UndefOr[ServerGroupLaunchConfigurations] = js.undefined
  }
  
  trait GetAppReplicationConfigurationRequest extends js.Object {
    /**
      * ID of the application associated with the replication configuration.
      */
    var appId: js.UndefOr[AppId] = js.undefined
  }
  
  trait GetAppReplicationConfigurationResponse extends js.Object {
    /**
      * Replication configurations associated with server groups in this application.
      */
    var serverGroupReplicationConfigurations: js.UndefOr[ServerGroupReplicationConfigurations] = js.undefined
  }
  
  trait GetAppRequest extends js.Object {
    /**
      * ID of the application whose information is being retrieved.
      */
    var appId: js.UndefOr[AppId] = js.undefined
  }
  
  trait GetAppResponse extends js.Object {
    /**
      * Information about the application.
      */
    var appSummary: js.UndefOr[AppSummary] = js.undefined
    /**
      * List of server groups belonging to the application.
      */
    var serverGroups: js.UndefOr[ServerGroups] = js.undefined
    /**
      * List of tags associated with the application.
      */
    var tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait GetConnectorsRequest extends js.Object {
    /**
      * The maximum number of results to return in a single call. The default value is 50. To retrieve the remaining results, make another call with the returned NextToken value.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token for the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait GetConnectorsResponse extends js.Object {
    /**
      * Information about the registered connectors.
      */
    var connectorList: js.UndefOr[ConnectorList] = js.undefined
    /**
      * The token required to retrieve the next set of results. This value is null when there are no more results to return.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait GetReplicationJobsRequest extends js.Object {
    /**
      * The maximum number of results to return in a single call. The default value is 50. To retrieve the remaining results, make another call with the returned NextToken value.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token for the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The identifier of the replication job.
      */
    var replicationJobId: js.UndefOr[ReplicationJobId] = js.undefined
  }
  
  trait GetReplicationJobsResponse extends js.Object {
    /**
      * The token required to retrieve the next set of results. This value is null when there are no more results to return.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Information about the replication jobs.
      */
    var replicationJobList: js.UndefOr[ReplicationJobList] = js.undefined
  }
  
  trait GetReplicationRunsRequest extends js.Object {
    /**
      * The maximum number of results to return in a single call. The default value is 50. To retrieve the remaining results, make another call with the returned NextToken value.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token for the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The identifier of the replication job.
      */
    var replicationJobId: ReplicationJobId
  }
  
  trait GetReplicationRunsResponse extends js.Object {
    /**
      * The token required to retrieve the next set of results. This value is null when there are no more results to return.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Information about the replication job.
      */
    var replicationJob: js.UndefOr[ReplicationJob] = js.undefined
    /**
      * Information about the replication runs.
      */
    var replicationRunList: js.UndefOr[ReplicationRunList] = js.undefined
  }
  
  trait GetServersRequest extends js.Object {
    /**
      * The maximum number of results to return in a single call. The default value is 50. To retrieve the remaining results, make another call with the returned NextToken value.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token for the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * List of VmServerAddress objects
      */
    var vmServerAddressList: js.UndefOr[VmServerAddressList] = js.undefined
  }
  
  trait GetServersResponse extends js.Object {
    /**
      * The time when the server was last modified.
      */
    var lastModifiedOn: js.UndefOr[Timestamp] = js.undefined
    /**
      * The token required to retrieve the next set of results. This value is null when there are no more results to return.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The status of the server catalog.
      */
    var serverCatalogStatus: js.UndefOr[ServerCatalogStatus] = js.undefined
    /**
      * Information about the servers.
      */
    var serverList: js.UndefOr[ServerList] = js.undefined
  }
  
  trait ImportServerCatalogRequest extends js.Object
  
  trait ImportServerCatalogResponse extends js.Object
  
  trait LaunchAppRequest extends js.Object {
    /**
      * ID of the application to launch.
      */
    var appId: js.UndefOr[AppId] = js.undefined
  }
  
  trait LaunchAppResponse extends js.Object
  
  trait LaunchDetails extends js.Object {
    /**
      * Latest time this application was launched successfully.
      */
    var latestLaunchTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * Identifier of the latest stack launched for this application.
      */
    var stackId: js.UndefOr[StackId] = js.undefined
    /**
      * Name of the latest stack launched for this application.
      */
    var stackName: js.UndefOr[StackName] = js.undefined
  }
  
  trait ListAppsRequest extends js.Object {
    /**
      * 
      */
    var appIds: js.UndefOr[AppIds] = js.undefined
    /**
      * The maximum number of results to return in a single call. The default value is 50. To retrieve the remaining results, make another call with the returned NextToken value. 
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token for the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListAppsResponse extends js.Object {
    /**
      * A list of application summaries.
      */
    var apps: js.UndefOr[Apps] = js.undefined
    /**
      * The token required to retrieve the next set of results. This value is null when there are no more results to return.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait PutAppLaunchConfigurationRequest extends js.Object {
    /**
      * ID of the application associated with the launch configuration.
      */
    var appId: js.UndefOr[AppId] = js.undefined
    /**
      * Name of service role in the customer's account that Amazon CloudFormation uses to launch the application.
      */
    var roleName: js.UndefOr[RoleName] = js.undefined
    /**
      * Launch configurations for server groups in the application.
      */
    var serverGroupLaunchConfigurations: js.UndefOr[ServerGroupLaunchConfigurations] = js.undefined
  }
  
  trait PutAppLaunchConfigurationResponse extends js.Object
  
  trait PutAppReplicationConfigurationRequest extends js.Object {
    /**
      * ID of the application tassociated with the replication configuration.
      */
    var appId: js.UndefOr[AppId] = js.undefined
    /**
      * Replication configurations for server groups in the application.
      */
    var serverGroupReplicationConfigurations: js.UndefOr[ServerGroupReplicationConfigurations] = js.undefined
  }
  
  trait PutAppReplicationConfigurationResponse extends js.Object
  
  trait ReplicationJob extends js.Object {
    /**
      * The description of the replication job.
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      * Whether the replication job should produce encrypted AMIs or not. See also KmsKeyId below.
      */
    var encrypted: js.UndefOr[Encrypted] = js.undefined
    /**
      * The time between consecutive replication runs, in hours.
      */
    var frequency: js.UndefOr[Frequency] = js.undefined
    /**
      * KMS key ID for replication jobs that produce encrypted AMIs. Can be any of the following:    KMS key ID   KMS key alias   ARN referring to KMS key ID   ARN referring to KMS key alias    If encrypted is true but a KMS key id is not specified, the customer's default KMS key for EBS is used. 
      */
    var kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    /**
      * The ID of the latest Amazon Machine Image (AMI).
      */
    var latestAmiId: js.UndefOr[AmiId] = js.undefined
    /**
      * The license type to be used for the AMI created by a successful replication run.
      */
    var licenseType: js.UndefOr[LicenseType] = js.undefined
    /**
      * The start time of the next replication run.
      */
    var nextReplicationRunStartTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * Number of recent AMIs to keep in the customer's account for a replication job. By default the value is set to zero, meaning that all AMIs are kept.
      */
    var numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep] = js.undefined
    /**
      * The identifier of the replication job.
      */
    var replicationJobId: js.UndefOr[ReplicationJobId] = js.undefined
    /**
      * Information about the replication runs.
      */
    var replicationRunList: js.UndefOr[ReplicationRunList] = js.undefined
    /**
      * The name of the IAM role to be used by the Server Migration Service.
      */
    var roleName: js.UndefOr[RoleName] = js.undefined
    /**
      * 
      */
    var runOnce: js.UndefOr[RunOnce] = js.undefined
    /**
      * The seed replication time.
      */
    var seedReplicationTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The identifier of the server.
      */
    var serverId: js.UndefOr[ServerId] = js.undefined
    /**
      * The type of server.
      */
    var serverType: js.UndefOr[ServerType] = js.undefined
    /**
      * The state of the replication job.
      */
    var state: js.UndefOr[ReplicationJobState] = js.undefined
    /**
      * The description of the current status of the replication job.
      */
    var statusMessage: js.UndefOr[ReplicationJobStatusMessage] = js.undefined
    /**
      * Information about the VM server.
      */
    var vmServer: js.UndefOr[VmServer] = js.undefined
  }
  
  trait ReplicationRun extends js.Object {
    /**
      * The identifier of the Amazon Machine Image (AMI) from the replication run.
      */
    var amiId: js.UndefOr[AmiId] = js.undefined
    /**
      * The completion time of the last replication run.
      */
    var completedTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The description of the replication run.
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      * Whether the replication run should produce encrypted AMI or not. See also KmsKeyId below.
      */
    var encrypted: js.UndefOr[Encrypted] = js.undefined
    /**
      * KMS key ID for replication jobs that produce encrypted AMIs. Can be any of the following:    KMS key ID   KMS key alias   ARN referring to KMS key ID   ARN referring to KMS key alias    If encrypted is true but a KMS key id is not specified, the customer's default KMS key for EBS is used. 
      */
    var kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    /**
      * The identifier of the replication run.
      */
    var replicationRunId: js.UndefOr[ReplicationRunId] = js.undefined
    /**
      * The start time of the next replication run.
      */
    var scheduledStartTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * Details of the current stage of the replication run.
      */
    var stageDetails: js.UndefOr[ReplicationRunStageDetails] = js.undefined
    /**
      * The state of the replication run.
      */
    var state: js.UndefOr[ReplicationRunState] = js.undefined
    /**
      * The description of the current status of the replication job.
      */
    var statusMessage: js.UndefOr[ReplicationRunStatusMessage] = js.undefined
    /**
      * The type of replication run.
      */
    var `type`: js.UndefOr[ReplicationRunType] = js.undefined
  }
  
  trait ReplicationRunStageDetails extends js.Object {
    /**
      * String describing the current stage of a replication run.
      */
    var stage: js.UndefOr[ReplicationRunStage] = js.undefined
    /**
      * String describing the progress of the current stage of a replication run.
      */
    var stageProgress: js.UndefOr[ReplicationRunStageProgress] = js.undefined
  }
  
  trait S3Location extends js.Object {
    /**
      * Amazon S3 bucket name.
      */
    var bucket: js.UndefOr[BucketName] = js.undefined
    /**
      * Amazon S3 bucket key.
      */
    var key: js.UndefOr[KeyName] = js.undefined
  }
  
  trait Server extends js.Object {
    /**
      * The identifier of the replication job.
      */
    var replicationJobId: js.UndefOr[ReplicationJobId] = js.undefined
    /**
      * Indicates whether the replication job is deleted or failed.
      */
    var replicationJobTerminated: js.UndefOr[ReplicationJobTerminated] = js.undefined
    /**
      * The identifier of the server.
      */
    var serverId: js.UndefOr[ServerId] = js.undefined
    /**
      * The type of server.
      */
    var serverType: js.UndefOr[ServerType] = js.undefined
    /**
      * Information about the VM server.
      */
    var vmServer: js.UndefOr[VmServer] = js.undefined
  }
  
  trait ServerGroup extends js.Object {
    /**
      * Name of a server group.
      */
    var name: js.UndefOr[ServerGroupName] = js.undefined
    /**
      * Identifier of a server group.
      */
    var serverGroupId: js.UndefOr[ServerGroupId] = js.undefined
    /**
      * List of servers belonging to a server group.
      */
    var serverList: js.UndefOr[ServerList] = js.undefined
  }
  
  trait ServerGroupLaunchConfiguration extends js.Object {
    /**
      * Launch order of servers in the server group.
      */
    var launchOrder: js.UndefOr[LaunchOrder] = js.undefined
    /**
      * Identifier of the server group the launch configuration is associated with.
      */
    var serverGroupId: js.UndefOr[ServerGroupId] = js.undefined
    /**
      * Launch configuration for servers in the server group.
      */
    var serverLaunchConfigurations: js.UndefOr[ServerLaunchConfigurations] = js.undefined
  }
  
  trait ServerGroupReplicationConfiguration extends js.Object {
    /**
      * Identifier of the server group this replication configuration is associated with.
      */
    var serverGroupId: js.UndefOr[ServerGroupId] = js.undefined
    /**
      * Replication configuration for servers in the server group.
      */
    var serverReplicationConfigurations: js.UndefOr[ServerReplicationConfigurations] = js.undefined
  }
  
  trait ServerLaunchConfiguration extends js.Object {
    /**
      * If true, a publicly accessible IP address is created when launching the server.
      */
    var associatePublicIpAddress: js.UndefOr[AssociatePublicIpAddress] = js.undefined
    /**
      * Name of the EC2 SSH Key to be used for connecting to the launched server.
      */
    var ec2KeyName: js.UndefOr[EC2KeyName] = js.undefined
    /**
      * Instance type to be used for launching the server.
      */
    var instanceType: js.UndefOr[InstanceType] = js.undefined
    /**
      * Logical ID of the server in the Amazon CloudFormation template.
      */
    var logicalId: js.UndefOr[LogicalId] = js.undefined
    /**
      * Identifier of the security group that applies to the launched server.
      */
    var securityGroup: js.UndefOr[SecurityGroup] = js.undefined
    /**
      * Identifier of the server the launch configuration is associated with.
      */
    var server: js.UndefOr[Server] = js.undefined
    /**
      * Identifier of the subnet the server should be launched into.
      */
    var subnet: js.UndefOr[Subnet] = js.undefined
    /**
      * Location of the user-data script to be executed when launching the server.
      */
    var userData: js.UndefOr[UserData] = js.undefined
    /**
      * Identifier of the VPC the server should be launched into.
      */
    var vpc: js.UndefOr[VPC] = js.undefined
  }
  
  trait ServerReplicationConfiguration extends js.Object {
    /**
      * Identifier of the server this replication configuration is associated with.
      */
    var server: js.UndefOr[Server] = js.undefined
    /**
      * Parameters for replicating the server.
      */
    var serverReplicationParameters: js.UndefOr[ServerReplicationParameters] = js.undefined
  }
  
  trait ServerReplicationParameters extends js.Object {
    /**
      * When true, the replication job produces encrypted AMIs. See also KmsKeyId below.
      */
    var encrypted: js.UndefOr[Encrypted] = js.undefined
    /**
      * Frequency of creating replication jobs for the server.
      */
    var frequency: js.UndefOr[Frequency] = js.undefined
    /**
      *  KMS key ID for replication jobs that produce encrypted AMIs. Can be any of the following:    KMS key ID   KMS key alias   ARN referring to KMS key ID   ARN referring to KMS key alias    If encrypted is true but a KMS key id is not specified, the customer's default KMS key for EBS is used. 
      */
    var kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    /**
      * License type for creating a replication job for the server.
      */
    var licenseType: js.UndefOr[LicenseType] = js.undefined
    /**
      * Number of recent AMIs to keep when creating a replication job for this server.
      */
    var numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep] = js.undefined
    /**
      * 
      */
    var runOnce: js.UndefOr[RunOnce] = js.undefined
    /**
      * Seed time for creating a replication job for the server.
      */
    var seedTime: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait StartAppReplicationRequest extends js.Object {
    /**
      * ID of the application to replicate.
      */
    var appId: js.UndefOr[AppId] = js.undefined
  }
  
  trait StartAppReplicationResponse extends js.Object
  
  trait StartOnDemandReplicationRunRequest extends js.Object {
    /**
      * The description of the replication run.
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      * The identifier of the replication job.
      */
    var replicationJobId: ReplicationJobId
  }
  
  trait StartOnDemandReplicationRunResponse extends js.Object {
    /**
      * The identifier of the replication run.
      */
    var replicationRunId: js.UndefOr[ReplicationRunId] = js.undefined
  }
  
  trait StopAppReplicationRequest extends js.Object {
    /**
      * ID of the application to stop replicating.
      */
    var appId: js.UndefOr[AppId] = js.undefined
  }
  
  trait StopAppReplicationResponse extends js.Object
  
  trait Tag extends js.Object {
    /**
      * Tag key.
      */
    var key: js.UndefOr[TagKey] = js.undefined
    /**
      * Tag value.
      */
    var value: js.UndefOr[TagValue] = js.undefined
  }
  
  trait TerminateAppRequest extends js.Object {
    /**
      * ID of the application to terminate.
      */
    var appId: js.UndefOr[AppId] = js.undefined
  }
  
  trait TerminateAppResponse extends js.Object
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
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
  
  trait UpdateAppRequest extends js.Object {
    /**
      * ID of the application to update.
      */
    var appId: js.UndefOr[AppId] = js.undefined
    /**
      * New description of the application.
      */
    var description: js.UndefOr[AppDescription] = js.undefined
    /**
      * New name of the application.
      */
    var name: js.UndefOr[AppName] = js.undefined
    /**
      * Name of the service role in the customer's account used by AWS SMS.
      */
    var roleName: js.UndefOr[RoleName] = js.undefined
    /**
      * List of server groups in the application to update.
      */
    var serverGroups: js.UndefOr[ServerGroups] = js.undefined
    /**
      * List of tags to associate with the application.
      */
    var tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait UpdateAppResponse extends js.Object {
    /**
      * Summary description of the application.
      */
    var appSummary: js.UndefOr[AppSummary] = js.undefined
    /**
      * List of updated server groups in the application.
      */
    var serverGroups: js.UndefOr[ServerGroups] = js.undefined
    /**
      * List of tags associated with the application.
      */
    var tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait UpdateReplicationJobRequest extends js.Object {
    /**
      * The description of the replication job.
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      * When true, the replication job produces encrypted AMIs . See also KmsKeyId below.
      */
    var encrypted: js.UndefOr[Encrypted] = js.undefined
    /**
      * The time between consecutive replication runs, in hours.
      */
    var frequency: js.UndefOr[Frequency] = js.undefined
    /**
      *  KMS key ID for replication jobs that produce encrypted AMIs. Can be any of the following:    KMS key ID   KMS key alias   ARN referring to KMS key ID   ARN referring to KMS key alias    If encrypted is true but a KMS key id is not specified, the customer's default KMS key for EBS is used. 
      */
    var kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    /**
      * The license type to be used for the AMI created by a successful replication run.
      */
    var licenseType: js.UndefOr[LicenseType] = js.undefined
    /**
      * The start time of the next replication run.
      */
    var nextReplicationRunStartTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The maximum number of SMS-created AMIs to retain. The oldest will be deleted once the maximum number is reached and a new AMI is created.
      */
    var numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep] = js.undefined
    /**
      * The identifier of the replication job.
      */
    var replicationJobId: ReplicationJobId
    /**
      * The name of the IAM role to be used by AWS SMS.
      */
    var roleName: js.UndefOr[RoleName] = js.undefined
  }
  
  trait UpdateReplicationJobResponse extends js.Object
  
  trait UserData extends js.Object {
    /**
      * Amazon S3 location of the user-data script.
      */
    var s3Location: js.UndefOr[S3Location] = js.undefined
  }
  
  trait VmServer extends js.Object {
    /**
      * The name of the VM manager.
      */
    var vmManagerName: js.UndefOr[VmManagerName] = js.undefined
    /**
      * The type of VM management product.
      */
    var vmManagerType: js.UndefOr[VmManagerType] = js.undefined
    /**
      * The name of the VM.
      */
    var vmName: js.UndefOr[VmName] = js.undefined
    /**
      * The VM folder path in the vCenter Server virtual machine inventory tree.
      */
    var vmPath: js.UndefOr[VmPath] = js.undefined
    /**
      * Information about the VM server location.
      */
    var vmServerAddress: js.UndefOr[VmServerAddress] = js.undefined
  }
  
  trait VmServerAddress extends js.Object {
    /**
      * The identifier of the VM.
      */
    var vmId: js.UndefOr[VmId] = js.undefined
    /**
      * The identifier of the VM manager.
      */
    var vmManagerId: js.UndefOr[VmManagerId] = js.undefined
  }
  
  trait _AppLaunchStatus extends js.Object
  
  trait _AppReplicationStatus extends js.Object
  
  trait _AppStatus extends js.Object
  
  trait _ConnectorCapability extends js.Object
  
  trait _ConnectorStatus extends js.Object
  
  trait _LicenseType extends js.Object
  
  trait _OutputFormat extends js.Object
  
  trait _ReplicationJobState extends js.Object
  
  trait _ReplicationRunState extends js.Object
  
  trait _ReplicationRunType extends js.Object
  
  trait _ServerCatalogStatus extends js.Object
  
  trait _VmManagerType extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type AmiId = java.lang.String
  type AppDescription = java.lang.String
  type AppId = java.lang.String
  type AppIds = js.Array[AppId]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.READY_FOR_CONFIGURATION
    - awsDashSdkLib.awsDashSdkLibStrings.CONFIGURATION_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.CONFIGURATION_INVALID
    - awsDashSdkLib.awsDashSdkLibStrings.READY_FOR_LAUNCH
    - awsDashSdkLib.awsDashSdkLibStrings.VALIDATION_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.LAUNCH_PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.LAUNCH_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.LAUNCHED
    - awsDashSdkLib.awsDashSdkLibStrings.DELTA_LAUNCH_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.DELTA_LAUNCH_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.LAUNCH_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.TERMINATE_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.TERMINATE_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.TERMINATED
    - java.lang.String
  */
  type AppLaunchStatus = _AppLaunchStatus | java.lang.String
  type AppLaunchStatusMessage = java.lang.String
  type AppName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.READY_FOR_CONFIGURATION
    - awsDashSdkLib.awsDashSdkLibStrings.CONFIGURATION_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.CONFIGURATION_INVALID
    - awsDashSdkLib.awsDashSdkLibStrings.READY_FOR_REPLICATION
    - awsDashSdkLib.awsDashSdkLibStrings.VALIDATION_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.REPLICATION_PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.REPLICATION_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.REPLICATED
    - awsDashSdkLib.awsDashSdkLibStrings.DELTA_REPLICATION_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.DELTA_REPLICATED
    - awsDashSdkLib.awsDashSdkLibStrings.DELTA_REPLICATION_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.REPLICATION_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.REPLICATION_STOPPING
    - awsDashSdkLib.awsDashSdkLibStrings.REPLICATION_STOP_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.REPLICATION_STOPPED
    - java.lang.String
  */
  type AppReplicationStatus = _AppReplicationStatus | java.lang.String
  type AppReplicationStatusMessage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - awsDashSdkLib.awsDashSdkLibStrings.DELETE_FAILED
    - java.lang.String
  */
  type AppStatus = _AppStatus | java.lang.String
  type AppStatusMessage = java.lang.String
  type Apps = js.Array[AppSummary]
  type AssociatePublicIpAddress = scala.Boolean
  type BucketName = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.VSPHERE
    - awsDashSdkLib.awsDashSdkLibStrings.SCVMM
    - awsDashSdkLib.awsDashSdkLibStrings.`HYPERV-MANAGER`
    - awsDashSdkLib.awsDashSdkLibStrings.SNAPSHOT_BATCHING
    - java.lang.String
  */
  type ConnectorCapability = _ConnectorCapability | java.lang.String
  type ConnectorCapabilityList = js.Array[ConnectorCapability]
  type ConnectorId = java.lang.String
  type ConnectorList = js.Array[Connector]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.HEALTHY
    - awsDashSdkLib.awsDashSdkLibStrings.UNHEALTHY
    - java.lang.String
  */
  type ConnectorStatus = _ConnectorStatus | java.lang.String
  type ConnectorVersion = java.lang.String
  type Description = java.lang.String
  type EC2KeyName = java.lang.String
  type Encrypted = scala.Boolean
  type ForceStopAppReplication = scala.Boolean
  type ForceTerminateApp = scala.Boolean
  type Frequency = scala.Double
  type InstanceType = java.lang.String
  type IpAddress = java.lang.String
  type KeyName = java.lang.String
  type KmsKeyId = java.lang.String
  type LaunchOrder = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AWS
    - awsDashSdkLib.awsDashSdkLibStrings.BYOL
    - java.lang.String
  */
  type LicenseType = _LicenseType | java.lang.String
  type LogicalId = java.lang.String
  type MacAddress = java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type NumberOfRecentAmisToKeep = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.JSON
    - awsDashSdkLib.awsDashSdkLibStrings.YAML
    - java.lang.String
  */
  type OutputFormat = _OutputFormat | java.lang.String
  type ReplicationJobId = java.lang.String
  type ReplicationJobList = js.Array[ReplicationJob]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED
    - awsDashSdkLib.awsDashSdkLibStrings.PAUSED_ON_FAILURE
    - awsDashSdkLib.awsDashSdkLibStrings.FAILING
    - java.lang.String
  */
  type ReplicationJobState = _ReplicationJobState | java.lang.String
  type ReplicationJobStatusMessage = java.lang.String
  type ReplicationJobTerminated = scala.Boolean
  type ReplicationRunId = java.lang.String
  type ReplicationRunList = js.Array[ReplicationRun]
  type ReplicationRunStage = java.lang.String
  type ReplicationRunStageProgress = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.MISSED
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - java.lang.String
  */
  type ReplicationRunState = _ReplicationRunState | java.lang.String
  type ReplicationRunStatusMessage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ON_DEMAND
    - awsDashSdkLib.awsDashSdkLibStrings.AUTOMATIC
    - java.lang.String
  */
  type ReplicationRunType = _ReplicationRunType | java.lang.String
  type RoleName = java.lang.String
  type RunOnce = scala.Boolean
  type SecurityGroup = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NOT_IMPORTED
    - awsDashSdkLib.awsDashSdkLibStrings.IMPORTING
    - awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - awsDashSdkLib.awsDashSdkLibStrings.EXPIRED
    - java.lang.String
  */
  type ServerCatalogStatus = _ServerCatalogStatus | java.lang.String
  type ServerGroupId = java.lang.String
  type ServerGroupLaunchConfigurations = js.Array[ServerGroupLaunchConfiguration]
  type ServerGroupName = java.lang.String
  type ServerGroupReplicationConfigurations = js.Array[ServerGroupReplicationConfiguration]
  type ServerGroups = js.Array[ServerGroup]
  type ServerId = java.lang.String
  type ServerLaunchConfigurations = js.Array[ServerLaunchConfiguration]
  type ServerList = js.Array[Server]
  type ServerReplicationConfigurations = js.Array[ServerReplicationConfiguration]
  type ServerType = awsDashSdkLib.awsDashSdkLibStrings.VIRTUAL_MACHINE | java.lang.String
  type StackId = java.lang.String
  type StackName = java.lang.String
  type Subnet = java.lang.String
  type TagKey = java.lang.String
  type TagValue = java.lang.String
  type Tags = js.Array[Tag]
  type Timestamp = stdLib.Date
  type TotalServerGroups = scala.Double
  type TotalServers = scala.Double
  type VPC = java.lang.String
  type VmId = java.lang.String
  type VmManagerId = java.lang.String
  type VmManagerName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.VSPHERE
    - awsDashSdkLib.awsDashSdkLibStrings.SCVMM
    - awsDashSdkLib.awsDashSdkLibStrings.`HYPERV-MANAGER`
    - java.lang.String
  */
  type VmManagerType = _VmManagerType | java.lang.String
  type VmName = java.lang.String
  type VmPath = java.lang.String
  type VmServerAddressList = js.Array[VmServerAddress]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2016-10-24`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}

