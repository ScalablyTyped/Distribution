package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/redshift", "Redshift")
@js.native
object RedshiftNs extends js.Object {
  trait AcceptReservedNodeExchangeInputMessage extends js.Object {
    /**
      * A string representing the node identifier of the DC1 Reserved Node to be exchanged.
      */
    var ReservedNodeId: String
    /**
      * The unique identifier of the DC2 Reserved Node offering to be used for the exchange. You can obtain the value for the parameter by calling GetReservedNodeExchangeOfferings 
      */
    var TargetReservedNodeOfferingId: String
  }
  
  trait AcceptReservedNodeExchangeOutputMessage extends js.Object {
    var ExchangedReservedNode: js.UndefOr[ReservedNode] = js.undefined
  }
  
  trait AccountAttribute extends js.Object {
    /**
      * The name of the attribute.
      */
    var AttributeName: js.UndefOr[String] = js.undefined
    /**
      * A list of attribute values.
      */
    var AttributeValues: js.UndefOr[AttributeValueList] = js.undefined
  }
  
  trait AccountAttributeList extends js.Object {
    /**
      * A list of attributes assigned to an account.
      */
    var AccountAttributes: js.UndefOr[AttributeList] = js.undefined
  }
  
  trait AccountWithRestoreAccess extends js.Object {
    /**
      * The identifier of an AWS support account authorized to restore a snapshot. For AWS support, the identifier is amazon-redshift-support. 
      */
    var AccountAlias: js.UndefOr[String] = js.undefined
    /**
      * The identifier of an AWS customer account authorized to restore a snapshot.
      */
    var AccountId: js.UndefOr[String] = js.undefined
  }
  
  trait AttributeValueTarget extends js.Object {
    /**
      * The value of the attribute.
      */
    var AttributeValue: js.UndefOr[String] = js.undefined
  }
  
  trait AuthorizeClusterSecurityGroupIngressMessage extends js.Object {
    /**
      * The IP range to be added the Amazon Redshift security group.
      */
    var CIDRIP: js.UndefOr[String] = js.undefined
    /**
      * The name of the security group to which the ingress rule is added.
      */
    var ClusterSecurityGroupName: String
    /**
      * The EC2 security group to be added the Amazon Redshift security group.
      */
    var EC2SecurityGroupName: js.UndefOr[String] = js.undefined
    /**
      * The AWS account number of the owner of the security group specified by the EC2SecurityGroupName parameter. The AWS Access Key ID is not an acceptable value.  Example: 111122223333 
      */
    var EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined
  }
  
  trait AuthorizeClusterSecurityGroupIngressResult extends js.Object {
    var ClusterSecurityGroup: js.UndefOr[ClusterSecurityGroup] = js.undefined
  }
  
  trait AuthorizeSnapshotAccessMessage extends js.Object {
    /**
      * The identifier of the AWS customer account authorized to restore the specified snapshot. To share a snapshot with AWS support, specify amazon-redshift-support.
      */
    var AccountWithRestoreAccess: String
    /**
      * The identifier of the cluster the snapshot was created from. This parameter is required if your IAM user has a policy containing a snapshot resource element that specifies anything other than * for the cluster name.
      */
    var SnapshotClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The identifier of the snapshot the account is authorized to restore.
      */
    var SnapshotIdentifier: String
  }
  
  trait AuthorizeSnapshotAccessResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot] = js.undefined
  }
  
  trait AvailabilityZone extends js.Object {
    /**
      * The name of the availability zone.
      */
    var Name: js.UndefOr[String] = js.undefined
    var SupportedPlatforms: js.UndefOr[SupportedPlatformsList] = js.undefined
  }
  
  trait BatchDeleteClusterSnapshotsRequest extends js.Object {
    /**
      * A list of identifiers for the snapshots that you want to delete.
      */
    var Identifiers: DeleteClusterSnapshotMessageList
  }
  
  trait BatchDeleteClusterSnapshotsResult extends js.Object {
    /**
      * A list of any errors returned.
      */
    var Errors: js.UndefOr[BatchSnapshotOperationErrorList] = js.undefined
    /**
      * A list of the snapshot identifiers that were deleted. 
      */
    var Resources: js.UndefOr[SnapshotIdentifierList] = js.undefined
  }
  
  trait BatchModifyClusterSnapshotsMessage extends js.Object {
    /**
      * A boolean value indicating whether to override an exception if the retention period has passed. 
      */
    var Force: js.UndefOr[Boolean] = js.undefined
    /**
      * The number of days that a manual snapshot is retained. If you specify the value -1, the manual snapshot is retained indefinitely. The number must be either -1 or an integer between 1 and 3,653. If you decrease the manual snapshot retention period from its current value, existing manual snapshots that fall outside of the new retention period will return an error. If you want to suppress the errors and delete the snapshots, use the force option. 
      */
    var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * A list of snapshot identifiers you want to modify.
      */
    var SnapshotIdentifierList: awsDashSdkLib.clientsRedshiftMod.RedshiftNs.SnapshotIdentifierList
  }
  
  trait BatchModifyClusterSnapshotsOutputMessage extends js.Object {
    /**
      * A list of any errors returned.
      */
    var Errors: js.UndefOr[BatchSnapshotOperationErrors] = js.undefined
    /**
      * A list of the snapshots that were modified.
      */
    var Resources: js.UndefOr[SnapshotIdentifierList] = js.undefined
  }
  
  trait CancelResizeMessage extends js.Object {
    /**
      * The unique identifier for the cluster that you want to cancel a resize operation for.
      */
    var ClusterIdentifier: String
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait Cluster extends js.Object {
    /**
      * A boolean value that, if true, indicates that major version upgrades will be applied automatically to the cluster during the maintenance window. 
      */
    var AllowVersionUpgrade: js.UndefOr[Boolean] = js.undefined
    /**
      * The number of days that automatic cluster snapshots are retained.
      */
    var AutomatedSnapshotRetentionPeriod: js.UndefOr[Integer] = js.undefined
    /**
      * The name of the Availability Zone in which the cluster is located.
      */
    var AvailabilityZone: js.UndefOr[String] = js.undefined
    /**
      * The date and time that the cluster was created.
      */
    var ClusterCreateTime: js.UndefOr[TStamp] = js.undefined
    /**
      * The unique identifier of the cluster.
      */
    var ClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The nodes in the cluster.
      */
    var ClusterNodes: js.UndefOr[ClusterNodesList] = js.undefined
    /**
      * The list of cluster parameter groups that are associated with this cluster. Each parameter group in the list is returned with its status.
      */
    var ClusterParameterGroups: js.UndefOr[ClusterParameterGroupStatusList] = js.undefined
    /**
      * The public key for the cluster.
      */
    var ClusterPublicKey: js.UndefOr[String] = js.undefined
    /**
      * The specific revision number of the database in the cluster.
      */
    var ClusterRevisionNumber: js.UndefOr[String] = js.undefined
    /**
      * A list of cluster security group that are associated with the cluster. Each security group is represented by an element that contains ClusterSecurityGroup.Name and ClusterSecurityGroup.Status subelements.  Cluster security groups are used when the cluster is not created in an Amazon Virtual Private Cloud (VPC). Clusters that are created in a VPC use VPC security groups, which are listed by the VpcSecurityGroups parameter. 
      */
    var ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroupMembershipList] = js.undefined
    /**
      * A value that returns the destination region and retention period that are configured for cross-region snapshot copy.
      */
    var ClusterSnapshotCopyStatus: js.UndefOr[ClusterSnapshotCopyStatus] = js.undefined
    /**
      *  The current state of the cluster. Possible values are the following:    available     available, prep-for-resize     available, resize-cleanup     cancelling-resize     creating     deleting     final-snapshot     hardware-failure     incompatible-hsm     incompatible-network     incompatible-parameters     incompatible-restore     modifying     rebooting     renaming     resizing     rotating-keys     storage-full     updating-hsm   
      */
    var ClusterStatus: js.UndefOr[String] = js.undefined
    /**
      * The name of the subnet group that is associated with the cluster. This parameter is valid only when the cluster is in a VPC.
      */
    var ClusterSubnetGroupName: js.UndefOr[String] = js.undefined
    /**
      * The version ID of the Amazon Redshift engine that is running on the cluster.
      */
    var ClusterVersion: js.UndefOr[String] = js.undefined
    /**
      * The name of the initial database that was created when the cluster was created. This same name is returned for the life of the cluster. If an initial database was not specified, a database named devdev was created by default. 
      */
    var DBName: js.UndefOr[String] = js.undefined
    var DataTransferProgress: js.UndefOr[DataTransferProgress] = js.undefined
    /**
      * Describes a group of DeferredMaintenanceWindow objects.
      */
    var DeferredMaintenanceWindows: js.UndefOr[DeferredMaintenanceWindowsList] = js.undefined
    /**
      * The status of the elastic IP (EIP) address.
      */
    var ElasticIpStatus: js.UndefOr[ElasticIpStatus] = js.undefined
    /**
      * The number of nodes that you can resize the cluster to with the elastic resize method. 
      */
    var ElasticResizeNumberOfNodeOptions: js.UndefOr[String] = js.undefined
    /**
      * A boolean value that, if true, indicates that data in the cluster is encrypted at rest.
      */
    var Encrypted: js.UndefOr[Boolean] = js.undefined
    /**
      * The connection endpoint.
      */
    var Endpoint: js.UndefOr[Endpoint] = js.undefined
    /**
      * An option that specifies whether to create the cluster with enhanced VPC routing enabled. To create a cluster that uses enhanced VPC routing, the cluster must be in a VPC. For more information, see Enhanced VPC Routing in the Amazon Redshift Cluster Management Guide. If this option is true, enhanced VPC routing is enabled.  Default: false
      */
    var EnhancedVpcRouting: js.UndefOr[Boolean] = js.undefined
    /**
      * A value that reports whether the Amazon Redshift cluster has finished applying any hardware security module (HSM) settings changes specified in a modify cluster command. Values: active, applying
      */
    var HsmStatus: js.UndefOr[HsmStatus] = js.undefined
    /**
      * A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other AWS services.
      */
    var IamRoles: js.UndefOr[ClusterIamRoleList] = js.undefined
    /**
      * The AWS Key Management Service (AWS KMS) key ID of the encryption key used to encrypt data in the cluster.
      */
    var KmsKeyId: js.UndefOr[String] = js.undefined
    /**
      * The name of the maintenance track for the cluster.
      */
    var MaintenanceTrackName: js.UndefOr[String] = js.undefined
    /**
      * The default number of days to retain a manual snapshot. If the value is -1, the snapshot is retained indefinitely. This setting doesn't change the retention period of existing snapshots. The value must be either -1 or an integer between 1 and 3,653.
      */
    var ManualSnapshotRetentionPeriod: js.UndefOr[Integer] = js.undefined
    /**
      * The master user name for the cluster. This name is used to connect to the database that is specified in the DBName parameter. 
      */
    var MasterUsername: js.UndefOr[String] = js.undefined
    /**
      * The status of a modify operation, if any, initiated for the cluster.
      */
    var ModifyStatus: js.UndefOr[String] = js.undefined
    /**
      * The node type for the nodes in the cluster.
      */
    var NodeType: js.UndefOr[String] = js.undefined
    /**
      * The number of compute nodes in the cluster.
      */
    var NumberOfNodes: js.UndefOr[Integer] = js.undefined
    /**
      * Cluster operations that are waiting to be started.
      */
    var PendingActions: js.UndefOr[PendingActionsList] = js.undefined
    /**
      * A value that, if present, indicates that changes to the cluster are pending. Specific pending changes are identified by subelements.
      */
    var PendingModifiedValues: js.UndefOr[PendingModifiedValues] = js.undefined
    /**
      * The weekly time range, in Universal Coordinated Time (UTC), during which system maintenance can occur.
      */
    var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
    /**
      * A boolean value that, if true, indicates that the cluster can be accessed from a public network.
      */
    var PubliclyAccessible: js.UndefOr[Boolean] = js.undefined
    /**
      * Returns the following:   AllowCancelResize: a boolean value indicating if the resize operation can be cancelled.   ResizeType: Returns ClassicResize  
      */
    var ResizeInfo: js.UndefOr[ResizeInfo] = js.undefined
    /**
      * A value that describes the status of a cluster restore action. This parameter returns null if the cluster was not created by restoring a snapshot.
      */
    var RestoreStatus: js.UndefOr[RestoreStatus] = js.undefined
    /**
      * A unique identifier for the cluster snapshot schedule.
      */
    var SnapshotScheduleIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The current state of the cluster snapshot schedule.
      */
    var SnapshotScheduleState: js.UndefOr[ScheduleState] = js.undefined
    /**
      * The list of tags for the cluster.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
      * The identifier of the VPC the cluster is in, if the cluster is in a VPC.
      */
    var VpcId: js.UndefOr[String] = js.undefined
    /**
      * A list of Amazon Virtual Private Cloud (Amazon VPC) security groups that are associated with the cluster. This parameter is returned only if the cluster is in a VPC.
      */
    var VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined
  }
  
  trait ClusterAssociatedToSchedule extends js.Object {
    var ClusterIdentifier: js.UndefOr[String] = js.undefined
    var ScheduleAssociationState: js.UndefOr[ScheduleState] = js.undefined
  }
  
  trait ClusterCredentials extends js.Object {
    /**
      * A temporary password that authorizes the user name returned by DbUser to log on to the database DbName. 
      */
    var DbPassword: js.UndefOr[SensitiveString] = js.undefined
    /**
      * A database user name that is authorized to log on to the database DbName using the password DbPassword. If the specified DbUser exists in the database, the new user name has the same database privileges as the the user named in DbUser. By default, the user is added to PUBLIC. If the DbGroups parameter is specifed, DbUser is added to the listed groups for any sessions created using these credentials.
      */
    var DbUser: js.UndefOr[String] = js.undefined
    /**
      * The date and time the password in DbPassword expires.
      */
    var Expiration: js.UndefOr[TStamp] = js.undefined
  }
  
  trait ClusterDbRevision extends js.Object {
    /**
      * The unique identifier of the cluster.
      */
    var ClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
      * A string representing the current cluster version.
      */
    var CurrentDatabaseRevision: js.UndefOr[String] = js.undefined
    /**
      * The date on which the database revision was released.
      */
    var DatabaseRevisionReleaseDate: js.UndefOr[TStamp] = js.undefined
    /**
      * A list of RevisionTarget objects, where each object describes the database revision that a cluster can be updated to.
      */
    var RevisionTargets: js.UndefOr[RevisionTargetsList] = js.undefined
  }
  
  trait ClusterDbRevisionsMessage extends js.Object {
    /**
      * A list of revisions.
      */
    var ClusterDbRevisions: js.UndefOr[ClusterDbRevisionsList] = js.undefined
    /**
      * A string representing the starting point for the next set of revisions. If a value is returned in a response, you can retrieve the next set of revisions by providing the value in the marker parameter and retrying the command. If the marker field is empty, all revisions have already been returned.
      */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  trait ClusterIamRole extends js.Object {
    /**
      * A value that describes the status of the IAM role's association with an Amazon Redshift cluster. The following are possible statuses and descriptions.    in-sync: The role is available for use by the cluster.    adding: The role is in the process of being associated with the cluster.    removing: The role is in the process of being disassociated with the cluster.  
      */
    var ApplyStatus: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the IAM role, for example, arn:aws:iam::123456789012:role/RedshiftCopyUnload. 
      */
    var IamRoleArn: js.UndefOr[String] = js.undefined
  }
  
  trait ClusterNode extends js.Object {
    /**
      * Whether the node is a leader node or a compute node.
      */
    var NodeRole: js.UndefOr[String] = js.undefined
    /**
      * The private IP address of a node within a cluster.
      */
    var PrivateIPAddress: js.UndefOr[String] = js.undefined
    /**
      * The public IP address of a node within a cluster.
      */
    var PublicIPAddress: js.UndefOr[String] = js.undefined
  }
  
  trait ClusterParameterGroup extends js.Object {
    /**
      * The description of the parameter group.
      */
    var Description: js.UndefOr[String] = js.undefined
    /**
      * The name of the cluster parameter group family that this cluster parameter group is compatible with.
      */
    var ParameterGroupFamily: js.UndefOr[String] = js.undefined
    /**
      * The name of the cluster parameter group.
      */
    var ParameterGroupName: js.UndefOr[String] = js.undefined
    /**
      * The list of tags for the cluster parameter group.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait ClusterParameterGroupDetails extends js.Object {
    /**
      * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * A list of Parameter instances. Each instance lists the parameters of one cluster parameter group. 
      */
    var Parameters: js.UndefOr[ParametersList] = js.undefined
  }
  
  trait ClusterParameterGroupNameMessage extends js.Object {
    /**
      * The name of the cluster parameter group.
      */
    var ParameterGroupName: js.UndefOr[String] = js.undefined
    /**
      * The status of the parameter group. For example, if you made a change to a parameter group name-value pair, then the change could be pending a reboot of an associated cluster.
      */
    var ParameterGroupStatus: js.UndefOr[String] = js.undefined
  }
  
  trait ClusterParameterGroupStatus extends js.Object {
    /**
      * The list of parameter statuses.  For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
      */
    var ClusterParameterStatusList: js.UndefOr[ClusterParameterStatusList] = js.undefined
    /**
      * The status of parameter updates.
      */
    var ParameterApplyStatus: js.UndefOr[String] = js.undefined
    /**
      * The name of the cluster parameter group.
      */
    var ParameterGroupName: js.UndefOr[String] = js.undefined
  }
  
  trait ClusterParameterGroupsMessage extends js.Object {
    /**
      * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * A list of ClusterParameterGroup instances. Each instance describes one cluster parameter group. 
      */
    var ParameterGroups: js.UndefOr[ParameterGroupList] = js.undefined
  }
  
  trait ClusterParameterStatus extends js.Object {
    /**
      * The error that prevented the parameter from being applied to the database.
      */
    var ParameterApplyErrorDescription: js.UndefOr[String] = js.undefined
    /**
      * The status of the parameter that indicates whether the parameter is in sync with the database, waiting for a cluster reboot, or encountered an error when being applied. The following are possible statuses and descriptions.    in-sync: The parameter value is in sync with the database.    pending-reboot: The parameter value will be applied after the cluster reboots.    applying: The parameter value is being applied to the database.    invalid-parameter: Cannot apply the parameter value because it has an invalid value or syntax.    apply-deferred: The parameter contains static property changes. The changes are deferred until the cluster reboots.    apply-error: Cannot connect to the cluster. The parameter change will be applied after the cluster reboots.    unknown-error: Cannot apply the parameter change right now. The change will be applied after the cluster reboots.  
      */
    var ParameterApplyStatus: js.UndefOr[String] = js.undefined
    /**
      * The name of the parameter.
      */
    var ParameterName: js.UndefOr[String] = js.undefined
  }
  
  trait ClusterSecurityGroup extends js.Object {
    /**
      * The name of the cluster security group to which the operation was applied.
      */
    var ClusterSecurityGroupName: js.UndefOr[String] = js.undefined
    /**
      * A description of the security group.
      */
    var Description: js.UndefOr[String] = js.undefined
    /**
      * A list of EC2 security groups that are permitted to access clusters associated with this cluster security group.
      */
    var EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList] = js.undefined
    /**
      * A list of IP ranges (CIDR blocks) that are permitted to access clusters associated with this cluster security group.
      */
    var IPRanges: js.UndefOr[IPRangeList] = js.undefined
    /**
      * The list of tags for the cluster security group.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait ClusterSecurityGroupMembership extends js.Object {
    /**
      * The name of the cluster security group.
      */
    var ClusterSecurityGroupName: js.UndefOr[String] = js.undefined
    /**
      * The status of the cluster security group.
      */
    var Status: js.UndefOr[String] = js.undefined
  }
  
  trait ClusterSecurityGroupMessage extends js.Object {
    /**
      * A list of ClusterSecurityGroup instances. 
      */
    var ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroups] = js.undefined
    /**
      * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
      */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  trait ClusterSnapshotCopyStatus extends js.Object {
    /**
      * The destination region that snapshots are automatically copied to when cross-region snapshot copy is enabled.
      */
    var DestinationRegion: js.UndefOr[String] = js.undefined
    /**
      * The number of days that automated snapshots are retained in the destination region after they are copied from a source region. If the value is -1, the manual snapshot is retained indefinitely.  The value must be either -1 or an integer between 1 and 3,653.
      */
    var ManualSnapshotRetentionPeriod: js.UndefOr[Integer] = js.undefined
    /**
      * The number of days that automated snapshots are retained in the destination region after they are copied from a source region.
      */
    var RetentionPeriod: js.UndefOr[Long] = js.undefined
    /**
      * The name of the snapshot copy grant.
      */
    var SnapshotCopyGrantName: js.UndefOr[String] = js.undefined
  }
  
  trait ClusterSubnetGroup extends js.Object {
    /**
      * The name of the cluster subnet group.
      */
    var ClusterSubnetGroupName: js.UndefOr[String] = js.undefined
    /**
      * The description of the cluster subnet group.
      */
    var Description: js.UndefOr[String] = js.undefined
    /**
      * The status of the cluster subnet group. Possible values are Complete, Incomplete and Invalid. 
      */
    var SubnetGroupStatus: js.UndefOr[String] = js.undefined
    /**
      * A list of the VPC Subnet elements. 
      */
    var Subnets: js.UndefOr[SubnetList] = js.undefined
    /**
      * The list of tags for the cluster subnet group.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
      * The VPC ID of the cluster subnet group.
      */
    var VpcId: js.UndefOr[String] = js.undefined
  }
  
  trait ClusterSubnetGroupMessage extends js.Object {
    /**
      * A list of ClusterSubnetGroup instances. 
      */
    var ClusterSubnetGroups: js.UndefOr[ClusterSubnetGroups] = js.undefined
    /**
      * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
      */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  trait ClusterVersion extends js.Object {
    /**
      * The name of the cluster parameter group family for the cluster.
      */
    var ClusterParameterGroupFamily: js.UndefOr[String] = js.undefined
    /**
      * The version number used by the cluster.
      */
    var ClusterVersion: js.UndefOr[String] = js.undefined
    /**
      * The description of the cluster version.
      */
    var Description: js.UndefOr[String] = js.undefined
  }
  
  trait ClusterVersionsMessage extends js.Object {
    /**
      * A list of Version elements. 
      */
    var ClusterVersions: js.UndefOr[ClusterVersionList] = js.undefined
    /**
      * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
      */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  trait ClustersMessage extends js.Object {
    /**
      * A list of Cluster objects, where each object describes one cluster. 
      */
    var Clusters: js.UndefOr[ClusterList] = js.undefined
    /**
      * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
      */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  trait CopyClusterSnapshotMessage extends js.Object {
    /**
      * The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained indefinitely.  The value must be either -1 or an integer between 1 and 3,653. The default value is -1.
      */
    var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The identifier of the cluster the source snapshot was created from. This parameter is required if your IAM user has a policy containing a snapshot resource element that specifies anything other than * for the cluster name. Constraints:   Must be the identifier for a valid cluster.  
      */
    var SourceSnapshotClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The identifier for the source snapshot. Constraints:   Must be the identifier for a valid automated snapshot whose state is available.  
      */
    var SourceSnapshotIdentifier: String
    /**
      * The identifier given to the new manual snapshot. Constraints:   Cannot be null, empty, or blank.   Must contain from 1 to 255 alphanumeric characters or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Must be unique for the AWS account that is making the request.  
      */
    var TargetSnapshotIdentifier: String
  }
  
  trait CopyClusterSnapshotResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot] = js.undefined
  }
  
  trait CreateClusterMessage extends js.Object {
    /**
      * Reserved.
      */
    var AdditionalInfo: js.UndefOr[String] = js.undefined
    /**
      * If true, major version upgrades can be applied during the maintenance window to the Amazon Redshift engine that is running on the cluster. When a new major version of the Amazon Redshift engine is released, you can request that the service automatically apply upgrades during the maintenance window to the Amazon Redshift engine that is running on your cluster. Default: true 
      */
    var AllowVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * The number of days that automated snapshots are retained. If the value is 0, automated snapshots are disabled. Even if automated snapshots are disabled, you can still create manual snapshots when you want with CreateClusterSnapshot.  Default: 1  Constraints: Must be a value from 0 to 35.
      */
    var AutomatedSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The EC2 Availability Zone (AZ) in which you want Amazon Redshift to provision the cluster. For example, if you have several EC2 instances running in a specific Availability Zone, then you might want the cluster to be provisioned in the same zone in order to decrease network latency. Default: A random, system-chosen Availability Zone in the region that is specified by the endpoint. Example: us-east-1d  Constraint: The specified Availability Zone must be in the same region as the current endpoint.
      */
    var AvailabilityZone: js.UndefOr[String] = js.undefined
    /**
      * A unique identifier for the cluster. You use this identifier to refer to the cluster for any subsequent cluster operations such as deleting or modifying. The identifier also appears in the Amazon Redshift console. Constraints:   Must contain from 1 to 63 alphanumeric characters or hyphens.   Alphabetic characters must be lowercase.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Must be unique for all clusters within an AWS account.   Example: myexamplecluster 
      */
    var ClusterIdentifier: String
    /**
      * The name of the parameter group to be associated with this cluster. Default: The default Amazon Redshift cluster parameter group. For information about the default parameter group, go to Working with Amazon Redshift Parameter Groups  Constraints:   Must be 1 to 255 alphanumeric characters or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.  
      */
    var ClusterParameterGroupName: js.UndefOr[String] = js.undefined
    /**
      * A list of security groups to be associated with this cluster. Default: The default cluster security group for Amazon Redshift.
      */
    var ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroupNameList] = js.undefined
    /**
      * The name of a cluster subnet group to be associated with this cluster. If this parameter is not provided the resulting cluster will be deployed outside virtual private cloud (VPC).
      */
    var ClusterSubnetGroupName: js.UndefOr[String] = js.undefined
    /**
      * The type of the cluster. When cluster type is specified as    single-node, the NumberOfNodes parameter is not required.    multi-node, the NumberOfNodes parameter is required.   Valid Values: multi-node | single-node  Default: multi-node 
      */
    var ClusterType: js.UndefOr[String] = js.undefined
    /**
      * The version of the Amazon Redshift engine software that you want to deploy on the cluster. The version selected runs on all the nodes in the cluster. Constraints: Only version 1.0 is currently available. Example: 1.0 
      */
    var ClusterVersion: js.UndefOr[String] = js.undefined
    /**
      * The name of the first database to be created when the cluster is created. To create additional databases after the cluster is created, connect to the cluster with a SQL client and use SQL commands to create a database. For more information, go to Create a Database in the Amazon Redshift Database Developer Guide.  Default: dev  Constraints:   Must contain 1 to 64 alphanumeric characters.   Must contain only lowercase letters.   Cannot be a word that is reserved by the service. A list of reserved words can be found in Reserved Words in the Amazon Redshift Database Developer Guide.   
      */
    var DBName: js.UndefOr[String] = js.undefined
    /**
      * The Elastic IP (EIP) address for the cluster. Constraints: The cluster must be provisioned in EC2-VPC and publicly-accessible through an Internet gateway. For more information about provisioning clusters in EC2-VPC, go to Supported Platforms to Launch Your Cluster in the Amazon Redshift Cluster Management Guide.
      */
    var ElasticIp: js.UndefOr[String] = js.undefined
    /**
      * If true, the data in the cluster is encrypted at rest.  Default: false
      */
    var Encrypted: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * An option that specifies whether to create the cluster with enhanced VPC routing enabled. To create a cluster that uses enhanced VPC routing, the cluster must be in a VPC. For more information, see Enhanced VPC Routing in the Amazon Redshift Cluster Management Guide. If this option is true, enhanced VPC routing is enabled.  Default: false
      */
    var EnhancedVpcRouting: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * Specifies the name of the HSM client certificate the Amazon Redshift cluster uses to retrieve the data encryption keys stored in an HSM.
      */
    var HsmClientCertificateIdentifier: js.UndefOr[String] = js.undefined
    /**
      * Specifies the name of the HSM configuration that contains the information the Amazon Redshift cluster can use to retrieve and store keys in an HSM.
      */
    var HsmConfigurationIdentifier: js.UndefOr[String] = js.undefined
    /**
      * A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other AWS services. You must supply the IAM roles in their Amazon Resource Name (ARN) format. You can supply up to 10 IAM roles in a single request. A cluster can have up to 10 IAM roles associated with it at any time.
      */
    var IamRoles: js.UndefOr[IamRoleArnList] = js.undefined
    /**
      * The AWS Key Management Service (KMS) key ID of the encryption key that you want to use to encrypt data in the cluster.
      */
    var KmsKeyId: js.UndefOr[String] = js.undefined
    /**
      * An optional parameter for the name of the maintenance track for the cluster. If you don't provide a maintenance track name, the cluster is assigned to the current track.
      */
    var MaintenanceTrackName: js.UndefOr[String] = js.undefined
    /**
      * The default number of days to retain a manual snapshot. If the value is -1, the snapshot is retained indefinitely. This setting doesn't change the retention period of existing snapshots. The value must be either -1 or an integer between 1 and 3,653.
      */
    var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The password associated with the master user account for the cluster that is being created. Constraints:   Must be between 8 and 64 characters in length.   Must contain at least one uppercase letter.   Must contain at least one lowercase letter.   Must contain one number.   Can be any printable ASCII character (ASCII code 33 to 126) except ' (single quote), " (double quote), \, /, @, or space.  
      */
    var MasterUserPassword: String
    /**
      * The user name associated with the master user account for the cluster that is being created. Constraints:   Must be 1 - 128 alphanumeric characters. The user name can't be PUBLIC.   First character must be a letter.   Cannot be a reserved word. A list of reserved words can be found in Reserved Words in the Amazon Redshift Database Developer Guide.   
      */
    var MasterUsername: String
    /**
      * The node type to be provisioned for the cluster. For information about node types, go to  Working with Clusters in the Amazon Redshift Cluster Management Guide.  Valid Values: ds2.xlarge | ds2.8xlarge | ds2.xlarge | ds2.8xlarge | dc1.large | dc1.8xlarge | dc2.large | dc2.8xlarge 
      */
    var NodeType: String
    /**
      * The number of compute nodes in the cluster. This parameter is required when the ClusterType parameter is specified as multi-node.  For information about determining how many nodes you need, go to  Working with Clusters in the Amazon Redshift Cluster Management Guide.  If you don't specify this parameter, you get a single-node cluster. When requesting a multi-node cluster, you must specify the number of nodes that you want in the cluster. Default: 1  Constraints: Value must be at least 1 and no more than 100.
      */
    var NumberOfNodes: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The port number on which the cluster accepts incoming connections. The cluster is accessible only via the JDBC and ODBC connection strings. Part of the connection string requires the port on which the cluster will listen for incoming connections. Default: 5439  Valid Values: 1150-65535 
      */
    var Port: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The weekly time range (in UTC) during which automated cluster maintenance can occur.  Format: ddd:hh24:mi-ddd:hh24:mi   Default: A 30-minute window selected at random from an 8-hour block of time per region, occurring on a random day of the week. For more information about the time blocks for each region, see Maintenance Windows in Amazon Redshift Cluster Management Guide. Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun Constraints: Minimum 30-minute window.
      */
    var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
    /**
      * If true, the cluster can be accessed from a public network. 
      */
    var PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * A unique identifier for the snapshot schedule.
      */
    var SnapshotScheduleIdentifier: js.UndefOr[String] = js.undefined
    /**
      * A list of tag instances.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
      * A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster. Default: The default VPC security group is associated with the cluster.
      */
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
  }
  
  trait CreateClusterParameterGroupMessage extends js.Object {
    /**
      * A description of the parameter group.
      */
    var Description: String
    /**
      * The Amazon Redshift engine version to which the cluster parameter group applies. The cluster engine version determines the set of parameters. To get a list of valid parameter group family names, you can call DescribeClusterParameterGroups. By default, Amazon Redshift returns a list of all the parameter groups that are owned by your AWS account, including the default parameter groups for each Amazon Redshift engine version. The parameter group family names associated with the default parameter groups provide you the valid values. For example, a valid family name is "redshift-1.0". 
      */
    var ParameterGroupFamily: String
    /**
      * The name of the cluster parameter group. Constraints:   Must be 1 to 255 alphanumeric characters or hyphens   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Must be unique withing your AWS account.    This value is stored as a lower-case string. 
      */
    var ParameterGroupName: String
    /**
      * A list of tag instances.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateClusterParameterGroupResult extends js.Object {
    var ClusterParameterGroup: js.UndefOr[ClusterParameterGroup] = js.undefined
  }
  
  trait CreateClusterResult extends js.Object {
    var Cluster: js.UndefOr[Cluster] = js.undefined
  }
  
  trait CreateClusterSecurityGroupMessage extends js.Object {
    /**
      * The name for the security group. Amazon Redshift stores the value as a lowercase string. Constraints:   Must contain no more than 255 alphanumeric characters or hyphens.   Must not be "Default".   Must be unique for all security groups that are created by your AWS account.   Example: examplesecuritygroup 
      */
    var ClusterSecurityGroupName: String
    /**
      * A description for the security group.
      */
    var Description: String
    /**
      * A list of tag instances.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateClusterSecurityGroupResult extends js.Object {
    var ClusterSecurityGroup: js.UndefOr[ClusterSecurityGroup] = js.undefined
  }
  
  trait CreateClusterSnapshotMessage extends js.Object {
    /**
      * The cluster identifier for which you want a snapshot.
      */
    var ClusterIdentifier: String
    /**
      * The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained indefinitely.  The value must be either -1 or an integer between 1 and 3,653. The default value is -1.
      */
    var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * A unique identifier for the snapshot that you are requesting. This identifier must be unique for all snapshots within the AWS account. Constraints:   Cannot be null, empty, or blank   Must contain from 1 to 255 alphanumeric characters or hyphens   First character must be a letter   Cannot end with a hyphen or contain two consecutive hyphens   Example: my-snapshot-id 
      */
    var SnapshotIdentifier: String
    /**
      * A list of tag instances.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateClusterSnapshotResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot] = js.undefined
  }
  
  trait CreateClusterSubnetGroupMessage extends js.Object {
    /**
      * The name for the subnet group. Amazon Redshift stores the value as a lowercase string. Constraints:   Must contain no more than 255 alphanumeric characters or hyphens.   Must not be "Default".   Must be unique for all subnet groups that are created by your AWS account.   Example: examplesubnetgroup 
      */
    var ClusterSubnetGroupName: String
    /**
      * A description for the subnet group.
      */
    var Description: String
    /**
      * An array of VPC subnet IDs. A maximum of 20 subnets can be modified in a single request.
      */
    var SubnetIds: SubnetIdentifierList
    /**
      * A list of tag instances.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateClusterSubnetGroupResult extends js.Object {
    var ClusterSubnetGroup: js.UndefOr[ClusterSubnetGroup] = js.undefined
  }
  
  trait CreateEventSubscriptionMessage extends js.Object {
    /**
      * A boolean value; set to true to activate the subscription, and set to false to create the subscription but not activate it. 
      */
    var Enabled: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * Specifies the Amazon Redshift event categories to be published by the event notification subscription. Values: configuration, management, monitoring, security
      */
    var EventCategories: js.UndefOr[EventCategoriesList] = js.undefined
    /**
      * Specifies the Amazon Redshift event severity to be published by the event notification subscription. Values: ERROR, INFO
      */
    var Severity: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the Amazon SNS topic used to transmit the event notifications. The ARN is created by Amazon SNS when you create a topic and subscribe to it.
      */
    var SnsTopicArn: String
    /**
      * A list of one or more identifiers of Amazon Redshift source objects. All of the objects must be of the same type as was specified in the source type parameter. The event subscription will return only events generated by the specified objects. If not specified, then events are returned for all objects within the source type specified. Example: my-cluster-1, my-cluster-2 Example: my-snapshot-20131010
      */
    var SourceIds: js.UndefOr[SourceIdsList] = js.undefined
    /**
      * The type of source that will be generating the events. For example, if you want to be notified of events generated by a cluster, you would set this parameter to cluster. If this value is not specified, events are returned for all Amazon Redshift objects in your AWS account. You must specify a source type in order to specify source IDs. Valid values: cluster, cluster-parameter-group, cluster-security-group, and cluster-snapshot.
      */
    var SourceType: js.UndefOr[String] = js.undefined
    /**
      * The name of the event subscription to be created. Constraints:   Cannot be null, empty, or blank.   Must contain from 1 to 255 alphanumeric characters or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.  
      */
    var SubscriptionName: String
    /**
      * A list of tag instances.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateEventSubscriptionResult extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription] = js.undefined
  }
  
  trait CreateHsmClientCertificateMessage extends js.Object {
    /**
      * The identifier to be assigned to the new HSM client certificate that the cluster will use to connect to the HSM to use the database encryption keys.
      */
    var HsmClientCertificateIdentifier: String
    /**
      * A list of tag instances.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateHsmClientCertificateResult extends js.Object {
    var HsmClientCertificate: js.UndefOr[HsmClientCertificate] = js.undefined
  }
  
  trait CreateHsmConfigurationMessage extends js.Object {
    /**
      * A text description of the HSM configuration to be created.
      */
    var Description: String
    /**
      * The identifier to be assigned to the new Amazon Redshift HSM configuration.
      */
    var HsmConfigurationIdentifier: String
    /**
      * The IP address that the Amazon Redshift cluster must use to access the HSM.
      */
    var HsmIpAddress: String
    /**
      * The name of the partition in the HSM where the Amazon Redshift clusters will store their database encryption keys.
      */
    var HsmPartitionName: String
    /**
      * The password required to access the HSM partition.
      */
    var HsmPartitionPassword: String
    /**
      * The HSMs public certificate file. When using Cloud HSM, the file name is server.pem.
      */
    var HsmServerPublicCertificate: String
    /**
      * A list of tag instances.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateHsmConfigurationResult extends js.Object {
    var HsmConfiguration: js.UndefOr[HsmConfiguration] = js.undefined
  }
  
  trait CreateSnapshotCopyGrantMessage extends js.Object {
    /**
      * The unique identifier of the customer master key (CMK) to which to grant Amazon Redshift permission. If no key is specified, the default key is used.
      */
    var KmsKeyId: js.UndefOr[String] = js.undefined
    /**
      * The name of the snapshot copy grant. This name must be unique in the region for the AWS account. Constraints:   Must contain from 1 to 63 alphanumeric characters or hyphens.   Alphabetic characters must be lowercase.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Must be unique for all clusters within an AWS account.  
      */
    var SnapshotCopyGrantName: String
    /**
      * A list of tag instances.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateSnapshotCopyGrantResult extends js.Object {
    var SnapshotCopyGrant: js.UndefOr[SnapshotCopyGrant] = js.undefined
  }
  
  trait CreateSnapshotScheduleMessage extends js.Object {
    var DryRun: js.UndefOr[BooleanOptional] = js.undefined
    var NextInvocations: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The definition of the snapshot schedule. The definition is made up of schedule expressions, for example "cron(30 12 *)" or "rate(12 hours)". 
      */
    var ScheduleDefinitions: js.UndefOr[ScheduleDefinitionList] = js.undefined
    /**
      * The description of the snapshot schedule.
      */
    var ScheduleDescription: js.UndefOr[String] = js.undefined
    /**
      * A unique identifier for a snapshot schedule. Only alphanumeric characters are allowed for the identifier.
      */
    var ScheduleIdentifier: js.UndefOr[String] = js.undefined
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateTagsMessage extends js.Object {
    /**
      * The Amazon Resource Name (ARN) to which you want to add the tag or tags. For example, arn:aws:redshift:us-east-1:123456789:cluster:t1. 
      */
    var ResourceName: String
    /**
      * One or more name/value pairs to add as tags to the specified resource. Each tag name is passed in with the parameter Key and the corresponding value is passed in with the parameter Value. The Key and Value parameters are separated by a comma (,). Separate multiple tags with a space. For example, --tags "Key"="owner","Value"="admin" "Key"="environment","Value"="test" "Key"="version","Value"="1.0". 
      */
    var Tags: TagList
  }
  
  trait CustomerStorageMessage extends js.Object {
    /**
      * The total amount of storage currently used for snapshots.
      */
    var TotalBackupSizeInMegaBytes: js.UndefOr[Double] = js.undefined
    /**
      * The total amount of storage currently provisioned.
      */
    var TotalProvisionedStorageInMegaBytes: js.UndefOr[Double] = js.undefined
  }
  
  trait DataTransferProgress extends js.Object {
    /**
      * Describes the data transfer rate in MB's per second.
      */
    var CurrentRateInMegaBytesPerSecond: js.UndefOr[DoubleOptional] = js.undefined
    /**
      * Describes the total amount of data that has been transfered in MB's.
      */
    var DataTransferredInMegaBytes: js.UndefOr[Long] = js.undefined
    /**
      * Describes the number of seconds that have elapsed during the data transfer.
      */
    var ElapsedTimeInSeconds: js.UndefOr[LongOptional] = js.undefined
    /**
      * Describes the estimated number of seconds remaining to complete the transfer.
      */
    var EstimatedTimeToCompletionInSeconds: js.UndefOr[LongOptional] = js.undefined
    /**
      * Describes the status of the cluster. While the transfer is in progress the status is transferringdata.
      */
    var Status: js.UndefOr[String] = js.undefined
    /**
      * Describes the total amount of data to be transfered in megabytes.
      */
    var TotalDataInMegaBytes: js.UndefOr[Long] = js.undefined
  }
  
  trait DefaultClusterParameters extends js.Object {
    /**
      * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The name of the cluster parameter group family to which the engine default parameters apply.
      */
    var ParameterGroupFamily: js.UndefOr[String] = js.undefined
    /**
      * The list of cluster default parameters.
      */
    var Parameters: js.UndefOr[ParametersList] = js.undefined
  }
  
  trait DeferredMaintenanceWindow extends js.Object {
    /**
      *  A timestamp for the end of the time period when we defer maintenance.
      */
    var DeferMaintenanceEndTime: js.UndefOr[TStamp] = js.undefined
    /**
      * A unique identifier for the maintenance window.
      */
    var DeferMaintenanceIdentifier: js.UndefOr[String] = js.undefined
    /**
      *  A timestamp for the beginning of the time period when we defer maintenance.
      */
    var DeferMaintenanceStartTime: js.UndefOr[TStamp] = js.undefined
  }
  
  trait DeleteClusterMessage extends js.Object {
    /**
      * The identifier of the cluster to be deleted. Constraints:   Must contain lowercase characters.   Must contain from 1 to 63 alphanumeric characters or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.  
      */
    var ClusterIdentifier: String
    /**
      * The identifier of the final snapshot that is to be created immediately before deleting the cluster. If this parameter is provided, SkipFinalClusterSnapshot must be false.  Constraints:   Must be 1 to 255 alphanumeric characters.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.  
      */
    var FinalClusterSnapshotIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained indefinitely. The value must be either -1 or an integer between 1 and 3,653. The default value is -1.
      */
    var FinalClusterSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * Determines whether a final snapshot of the cluster is created before Amazon Redshift deletes the cluster. If true, a final cluster snapshot is not created. If false, a final cluster snapshot is created before the cluster is deleted.   The FinalClusterSnapshotIdentifier parameter must be specified if SkipFinalClusterSnapshot is false.  Default: false 
      */
    var SkipFinalClusterSnapshot: js.UndefOr[Boolean] = js.undefined
  }
  
  trait DeleteClusterParameterGroupMessage extends js.Object {
    /**
      * The name of the parameter group to be deleted. Constraints:   Must be the name of an existing cluster parameter group.   Cannot delete a default cluster parameter group.  
      */
    var ParameterGroupName: String
  }
  
  trait DeleteClusterResult extends js.Object {
    var Cluster: js.UndefOr[Cluster] = js.undefined
  }
  
  trait DeleteClusterSecurityGroupMessage extends js.Object {
    /**
      * The name of the cluster security group to be deleted.
      */
    var ClusterSecurityGroupName: String
  }
  
  trait DeleteClusterSnapshotMessage extends js.Object {
    /**
      * The unique identifier of the cluster the snapshot was created from. This parameter is required if your IAM user has a policy containing a snapshot resource element that specifies anything other than * for the cluster name. Constraints: Must be the name of valid cluster.
      */
    var SnapshotClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The unique identifier of the manual snapshot to be deleted. Constraints: Must be the name of an existing snapshot that is in the available, failed, or cancelled state.
      */
    var SnapshotIdentifier: String
  }
  
  trait DeleteClusterSnapshotResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot] = js.undefined
  }
  
  trait DeleteClusterSubnetGroupMessage extends js.Object {
    /**
      * The name of the cluster subnet group name to be deleted.
      */
    var ClusterSubnetGroupName: String
  }
  
  trait DeleteEventSubscriptionMessage extends js.Object {
    /**
      * The name of the Amazon Redshift event notification subscription to be deleted.
      */
    var SubscriptionName: String
  }
  
  trait DeleteHsmClientCertificateMessage extends js.Object {
    /**
      * The identifier of the HSM client certificate to be deleted.
      */
    var HsmClientCertificateIdentifier: String
  }
  
  trait DeleteHsmConfigurationMessage extends js.Object {
    /**
      * The identifier of the Amazon Redshift HSM configuration to be deleted.
      */
    var HsmConfigurationIdentifier: String
  }
  
  trait DeleteSnapshotCopyGrantMessage extends js.Object {
    /**
      * The name of the snapshot copy grant to delete.
      */
    var SnapshotCopyGrantName: String
  }
  
  trait DeleteSnapshotScheduleMessage extends js.Object {
    /**
      * A unique identifier of the snapshot schedule to delete.
      */
    var ScheduleIdentifier: String
  }
  
  trait DeleteTagsMessage extends js.Object {
    /**
      * The Amazon Resource Name (ARN) from which you want to remove the tag or tags. For example, arn:aws:redshift:us-east-1:123456789:cluster:t1. 
      */
    var ResourceName: String
    /**
      * The tag key that you want to delete.
      */
    var TagKeys: TagKeyList
  }
  
  trait DescribeAccountAttributesMessage extends js.Object {
    /**
      * A list of attribute names.
      */
    var AttributeNames: js.UndefOr[AttributeNameList] = js.undefined
  }
  
  trait DescribeClusterDbRevisionsMessage extends js.Object {
    /**
      * A unique identifier for a cluster whose ClusterDbRevisions you are requesting. This parameter is case sensitive. All clusters defined for an account are returned by default.
      */
    var ClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
      * An optional parameter that specifies the starting point for returning a set of response records. When the results of a DescribeClusterDbRevisions request exceed the value specified in MaxRecords, Amazon Redshift returns a value in the marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the marker parameter and retrying the request.  Constraints: You can specify either the ClusterIdentifier parameter, or the marker parameter, but not both.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in the marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the marker parameter and retrying the request.  Default: 100 Constraints: minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  trait DescribeClusterParameterGroupsMessage extends js.Object {
    /**
      * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeClusterParameterGroups request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.  Default: 100  Constraints: minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The name of a specific parameter group for which to return details. By default, details about all parameter groups and the default parameter group are returned.
      */
    var ParameterGroupName: js.UndefOr[String] = js.undefined
    /**
      * A tag key or keys for which you want to return all matching cluster parameter groups that are associated with the specified key or keys. For example, suppose that you have parameter groups that are tagged with keys called owner and environment. If you specify both of these tag keys in the request, Amazon Redshift returns a response with the parameter groups that have either or both of these tag keys associated with them.
      */
    var TagKeys: js.UndefOr[TagKeyList] = js.undefined
    /**
      * A tag value or values for which you want to return all matching cluster parameter groups that are associated with the specified tag value or values. For example, suppose that you have parameter groups that are tagged with values called admin and test. If you specify both of these tag values in the request, Amazon Redshift returns a response with the parameter groups that have either or both of these tag values associated with them.
      */
    var TagValues: js.UndefOr[TagValueList] = js.undefined
  }
  
  trait DescribeClusterParametersMessage extends js.Object {
    /**
      * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeClusterParameters request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.  Default: 100  Constraints: minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The name of a cluster parameter group for which to return details.
      */
    var ParameterGroupName: String
    /**
      * The parameter types to return. Specify user to show parameters that are different form the default. Similarly, specify engine-default to show parameters that are the same as the default parameter group.  Default: All parameter types returned. Valid Values: user | engine-default 
      */
    var Source: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeClusterSecurityGroupsMessage extends js.Object {
    /**
      * The name of a cluster security group for which you are requesting details. You can specify either the Marker parameter or a ClusterSecurityGroupName parameter, but not both.   Example: securitygroup1 
      */
    var ClusterSecurityGroupName: js.UndefOr[String] = js.undefined
    /**
      * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeClusterSecurityGroups request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request.  Constraints: You can specify either the ClusterSecurityGroupName parameter or the Marker parameter, but not both. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.  Default: 100  Constraints: minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * A tag key or keys for which you want to return all matching cluster security groups that are associated with the specified key or keys. For example, suppose that you have security groups that are tagged with keys called owner and environment. If you specify both of these tag keys in the request, Amazon Redshift returns a response with the security groups that have either or both of these tag keys associated with them.
      */
    var TagKeys: js.UndefOr[TagKeyList] = js.undefined
    /**
      * A tag value or values for which you want to return all matching cluster security groups that are associated with the specified tag value or values. For example, suppose that you have security groups that are tagged with values called admin and test. If you specify both of these tag values in the request, Amazon Redshift returns a response with the security groups that have either or both of these tag values associated with them.
      */
    var TagValues: js.UndefOr[TagValueList] = js.undefined
  }
  
  trait DescribeClusterSnapshotsMessage extends js.Object {
    /**
      * A value that indicates whether to return snapshots only for an existing cluster. Table-level restore can be performed only using a snapshot of an existing cluster, that is, a cluster that has not been deleted. If ClusterExists is set to true, ClusterIdentifier is required.
      */
    var ClusterExists: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * The identifier of the cluster for which information about snapshots is requested.
      */
    var ClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
      * A time value that requests only snapshots created at or before the specified time. The time value is specified in ISO 8601 format. For more information about ISO 8601, go to the ISO8601 Wikipedia page.  Example: 2012-07-16T18:00:00Z 
      */
    var EndTime: js.UndefOr[TStamp] = js.undefined
    /**
      * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeClusterSnapshots request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.  Default: 100  Constraints: minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The AWS customer account used to create or copy the snapshot. Use this field to filter the results to snapshots owned by a particular account. To describe snapshots you own, either specify your AWS customer account, or do not specify the parameter.
      */
    var OwnerAccount: js.UndefOr[String] = js.undefined
    /**
      * The snapshot identifier of the snapshot about which to return information.
      */
    var SnapshotIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The type of snapshots for which you are requesting information. By default, snapshots of all types are returned. Valid Values: automated | manual 
      */
    var SnapshotType: js.UndefOr[String] = js.undefined
    var SortingEntities: js.UndefOr[SnapshotSortingEntityList] = js.undefined
    /**
      * A value that requests only snapshots created at or after the specified time. The time value is specified in ISO 8601 format. For more information about ISO 8601, go to the ISO8601 Wikipedia page.  Example: 2012-07-16T18:00:00Z 
      */
    var StartTime: js.UndefOr[TStamp] = js.undefined
    /**
      * A tag key or keys for which you want to return all matching cluster snapshots that are associated with the specified key or keys. For example, suppose that you have snapshots that are tagged with keys called owner and environment. If you specify both of these tag keys in the request, Amazon Redshift returns a response with the snapshots that have either or both of these tag keys associated with them.
      */
    var TagKeys: js.UndefOr[TagKeyList] = js.undefined
    /**
      * A tag value or values for which you want to return all matching cluster snapshots that are associated with the specified tag value or values. For example, suppose that you have snapshots that are tagged with values called admin and test. If you specify both of these tag values in the request, Amazon Redshift returns a response with the snapshots that have either or both of these tag values associated with them.
      */
    var TagValues: js.UndefOr[TagValueList] = js.undefined
  }
  
  trait DescribeClusterSubnetGroupsMessage extends js.Object {
    /**
      * The name of the cluster subnet group for which information is requested.
      */
    var ClusterSubnetGroupName: js.UndefOr[String] = js.undefined
    /**
      * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeClusterSubnetGroups request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.  Default: 100  Constraints: minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * A tag key or keys for which you want to return all matching cluster subnet groups that are associated with the specified key or keys. For example, suppose that you have subnet groups that are tagged with keys called owner and environment. If you specify both of these tag keys in the request, Amazon Redshift returns a response with the subnet groups that have either or both of these tag keys associated with them.
      */
    var TagKeys: js.UndefOr[TagKeyList] = js.undefined
    /**
      * A tag value or values for which you want to return all matching cluster subnet groups that are associated with the specified tag value or values. For example, suppose that you have subnet groups that are tagged with values called admin and test. If you specify both of these tag values in the request, Amazon Redshift returns a response with the subnet groups that have either or both of these tag values associated with them.
      */
    var TagValues: js.UndefOr[TagValueList] = js.undefined
  }
  
  trait DescribeClusterTracksMessage extends js.Object {
    /**
      * The name of the maintenance track. 
      */
    var MaintenanceTrackName: js.UndefOr[String] = js.undefined
    /**
      * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeClusterTracks request exceed the value specified in MaxRecords, Amazon Redshift returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * An integer value for the maximum number of maintenance tracks to return.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  trait DescribeClusterVersionsMessage extends js.Object {
    /**
      * The name of a specific cluster parameter group family to return details for. Constraints:   Must be 1 to 255 alphanumeric characters   First character must be a letter   Cannot end with a hyphen or contain two consecutive hyphens  
      */
    var ClusterParameterGroupFamily: js.UndefOr[String] = js.undefined
    /**
      * The specific cluster version to return. Example: 1.0 
      */
    var ClusterVersion: js.UndefOr[String] = js.undefined
    /**
      * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeClusterVersions request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.  Default: 100  Constraints: minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  trait DescribeClustersMessage extends js.Object {
    /**
      * The unique identifier of a cluster whose properties you are requesting. This parameter is case sensitive. The default is that all clusters defined for an account are returned.
      */
    var ClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
      * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeClusters request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request.  Constraints: You can specify either the ClusterIdentifier parameter or the Marker parameter, but not both. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.  Default: 100  Constraints: minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * A tag key or keys for which you want to return all matching clusters that are associated with the specified key or keys. For example, suppose that you have clusters that are tagged with keys called owner and environment. If you specify both of these tag keys in the request, Amazon Redshift returns a response with the clusters that have either or both of these tag keys associated with them.
      */
    var TagKeys: js.UndefOr[TagKeyList] = js.undefined
    /**
      * A tag value or values for which you want to return all matching clusters that are associated with the specified tag value or values. For example, suppose that you have clusters that are tagged with values called admin and test. If you specify both of these tag values in the request, Amazon Redshift returns a response with the clusters that have either or both of these tag values associated with them.
      */
    var TagValues: js.UndefOr[TagValueList] = js.undefined
  }
  
  trait DescribeDefaultClusterParametersMessage extends js.Object {
    /**
      * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeDefaultClusterParameters request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.  Default: 100  Constraints: minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The name of the cluster parameter group family.
      */
    var ParameterGroupFamily: String
  }
  
  trait DescribeDefaultClusterParametersResult extends js.Object {
    var DefaultClusterParameters: js.UndefOr[DefaultClusterParameters] = js.undefined
  }
  
  trait DescribeEventCategoriesMessage extends js.Object {
    /**
      * The source type, such as cluster or parameter group, to which the described event categories apply. Valid values: cluster, cluster-snapshot, cluster-parameter-group, and cluster-security-group.
      */
    var SourceType: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeEventSubscriptionsMessage extends js.Object {
    /**
      * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeEventSubscriptions request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.  Default: 100  Constraints: minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The name of the Amazon Redshift event notification subscription to be described.
      */
    var SubscriptionName: js.UndefOr[String] = js.undefined
    /**
      * A tag key or keys for which you want to return all matching event notification subscriptions that are associated with the specified key or keys. For example, suppose that you have subscriptions that are tagged with keys called owner and environment. If you specify both of these tag keys in the request, Amazon Redshift returns a response with the subscriptions that have either or both of these tag keys associated with them.
      */
    var TagKeys: js.UndefOr[TagKeyList] = js.undefined
    /**
      * A tag value or values for which you want to return all matching event notification subscriptions that are associated with the specified tag value or values. For example, suppose that you have subscriptions that are tagged with values called admin and test. If you specify both of these tag values in the request, Amazon Redshift returns a response with the subscriptions that have either or both of these tag values associated with them.
      */
    var TagValues: js.UndefOr[TagValueList] = js.undefined
  }
  
  trait DescribeEventsMessage extends js.Object {
    /**
      * The number of minutes prior to the time of the request for which to retrieve events. For example, if the request is sent at 18:00 and you specify a duration of 60, then only events which have occurred after 17:00 will be returned. Default: 60 
      */
    var Duration: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The end of the time interval for which to retrieve events, specified in ISO 8601 format. For more information about ISO 8601, go to the ISO8601 Wikipedia page.  Example: 2009-07-08T18:00Z 
      */
    var EndTime: js.UndefOr[TStamp] = js.undefined
    /**
      * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeEvents request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.  Default: 100  Constraints: minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The identifier of the event source for which events will be returned. If this parameter is not specified, then all sources are included in the response. Constraints: If SourceIdentifier is supplied, SourceType must also be provided.   Specify a cluster identifier when SourceType is cluster.   Specify a cluster security group name when SourceType is cluster-security-group.   Specify a cluster parameter group name when SourceType is cluster-parameter-group.   Specify a cluster snapshot identifier when SourceType is cluster-snapshot.  
      */
    var SourceIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The event source to retrieve events for. If no value is specified, all events are returned. Constraints: If SourceType is supplied, SourceIdentifier must also be provided.   Specify cluster when SourceIdentifier is a cluster identifier.   Specify cluster-security-group when SourceIdentifier is a cluster security group name.   Specify cluster-parameter-group when SourceIdentifier is a cluster parameter group name.   Specify cluster-snapshot when SourceIdentifier is a cluster snapshot identifier.  
      */
    var SourceType: js.UndefOr[SourceType] = js.undefined
    /**
      * The beginning of the time interval to retrieve events for, specified in ISO 8601 format. For more information about ISO 8601, go to the ISO8601 Wikipedia page.  Example: 2009-07-08T18:00Z 
      */
    var StartTime: js.UndefOr[TStamp] = js.undefined
  }
  
  trait DescribeHsmClientCertificatesMessage extends js.Object {
    /**
      * The identifier of a specific HSM client certificate for which you want information. If no identifier is specified, information is returned for all HSM client certificates owned by your AWS customer account.
      */
    var HsmClientCertificateIdentifier: js.UndefOr[String] = js.undefined
    /**
      * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeHsmClientCertificates request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.  Default: 100  Constraints: minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * A tag key or keys for which you want to return all matching HSM client certificates that are associated with the specified key or keys. For example, suppose that you have HSM client certificates that are tagged with keys called owner and environment. If you specify both of these tag keys in the request, Amazon Redshift returns a response with the HSM client certificates that have either or both of these tag keys associated with them.
      */
    var TagKeys: js.UndefOr[TagKeyList] = js.undefined
    /**
      * A tag value or values for which you want to return all matching HSM client certificates that are associated with the specified tag value or values. For example, suppose that you have HSM client certificates that are tagged with values called admin and test. If you specify both of these tag values in the request, Amazon Redshift returns a response with the HSM client certificates that have either or both of these tag values associated with them.
      */
    var TagValues: js.UndefOr[TagValueList] = js.undefined
  }
  
  trait DescribeHsmConfigurationsMessage extends js.Object {
    /**
      * The identifier of a specific Amazon Redshift HSM configuration to be described. If no identifier is specified, information is returned for all HSM configurations owned by your AWS customer account.
      */
    var HsmConfigurationIdentifier: js.UndefOr[String] = js.undefined
    /**
      * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeHsmConfigurations request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.  Default: 100  Constraints: minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * A tag key or keys for which you want to return all matching HSM configurations that are associated with the specified key or keys. For example, suppose that you have HSM configurations that are tagged with keys called owner and environment. If you specify both of these tag keys in the request, Amazon Redshift returns a response with the HSM configurations that have either or both of these tag keys associated with them.
      */
    var TagKeys: js.UndefOr[TagKeyList] = js.undefined
    /**
      * A tag value or values for which you want to return all matching HSM configurations that are associated with the specified tag value or values. For example, suppose that you have HSM configurations that are tagged with values called admin and test. If you specify both of these tag values in the request, Amazon Redshift returns a response with the HSM configurations that have either or both of these tag values associated with them.
      */
    var TagValues: js.UndefOr[TagValueList] = js.undefined
  }
  
  trait DescribeLoggingStatusMessage extends js.Object {
    /**
      * The identifier of the cluster from which to get the logging status. Example: examplecluster 
      */
    var ClusterIdentifier: String
  }
  
  trait DescribeOrderableClusterOptionsMessage extends js.Object {
    /**
      * The version filter value. Specify this parameter to show only the available offerings matching the specified version. Default: All versions. Constraints: Must be one of the version returned from DescribeClusterVersions.
      */
    var ClusterVersion: js.UndefOr[String] = js.undefined
    /**
      * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeOrderableClusterOptions request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.  Default: 100  Constraints: minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The node type filter value. Specify this parameter to show only the available offerings matching the specified node type.
      */
    var NodeType: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeReservedNodeOfferingsMessage extends js.Object {
    /**
      * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeReservedNodeOfferings request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.  Default: 100  Constraints: minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The unique identifier for the offering.
      */
    var ReservedNodeOfferingId: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeReservedNodesMessage extends js.Object {
    /**
      * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeReservedNodes request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.  Default: 100  Constraints: minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * Identifier for the node reservation.
      */
    var ReservedNodeId: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeResizeMessage extends js.Object {
    /**
      * The unique identifier of a cluster whose resize progress you are requesting. This parameter is case-sensitive. By default, resize operations for all clusters defined for an AWS account are returned.
      */
    var ClusterIdentifier: String
  }
  
  trait DescribeSnapshotCopyGrantsMessage extends js.Object {
    /**
      * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeSnapshotCopyGrant request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request.  Constraints: You can specify either the SnapshotCopyGrantName parameter or the Marker parameter, but not both. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.  Default: 100  Constraints: minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The name of the snapshot copy grant.
      */
    var SnapshotCopyGrantName: js.UndefOr[String] = js.undefined
    /**
      * A tag key or keys for which you want to return all matching resources that are associated with the specified key or keys. For example, suppose that you have resources tagged with keys called owner and environment. If you specify both of these tag keys in the request, Amazon Redshift returns a response with all resources that have either or both of these tag keys associated with them.
      */
    var TagKeys: js.UndefOr[TagKeyList] = js.undefined
    /**
      * A tag value or values for which you want to return all matching resources that are associated with the specified value or values. For example, suppose that you have resources tagged with values called admin and test. If you specify both of these tag values in the request, Amazon Redshift returns a response with all resources that have either or both of these tag values associated with them.
      */
    var TagValues: js.UndefOr[TagValueList] = js.undefined
  }
  
  trait DescribeSnapshotSchedulesMessage extends js.Object {
    /**
      * The unique identifier for the cluster whose snapshot schedules you want to view.
      */
    var ClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
      * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the marker parameter and retrying the command. If the marker field is empty, all response records have been retrieved for the request.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The maximum number or response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * A unique identifier for a snapshot schedule.
      */
    var ScheduleIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The key value for a snapshot schedule tag.
      */
    var TagKeys: js.UndefOr[TagKeyList] = js.undefined
    /**
      * The value corresponding to the key of the snapshot schedule tag.
      */
    var TagValues: js.UndefOr[TagValueList] = js.undefined
  }
  
  trait DescribeSnapshotSchedulesOutputMessage extends js.Object {
    /**
      * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the marker parameter and retrying the command. If the marker field is empty, all response records have been retrieved for the request.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * A list of SnapshotSchedules.
      */
    var SnapshotSchedules: js.UndefOr[SnapshotScheduleList] = js.undefined
  }
  
  trait DescribeTableRestoreStatusMessage extends js.Object {
    /**
      * The Amazon Redshift cluster that the table is being restored to.
      */
    var ClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
      * An optional pagination token provided by a previous DescribeTableRestoreStatus request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by the MaxRecords parameter.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The identifier of the table restore request to return status for. If you don't specify a TableRestoreRequestId value, then DescribeTableRestoreStatus returns the status of all in-progress table restore requests.
      */
    var TableRestoreRequestId: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeTagsMessage extends js.Object {
    /**
      * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the marker parameter and retrying the command. If the marker field is empty, all response records have been retrieved for the request. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The maximum number or response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value. 
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The Amazon Resource Name (ARN) for which you want to describe the tag or tags. For example, arn:aws:redshift:us-east-1:123456789:cluster:t1. 
      */
    var ResourceName: js.UndefOr[String] = js.undefined
    /**
      * The type of resource with which you want to view tags. Valid resource types are:    Cluster   CIDR/IP   EC2 security group   Snapshot   Cluster security group   Subnet group   HSM connection   HSM certificate   Parameter group   Snapshot copy grant   For more information about Amazon Redshift resource types and constructing ARNs, go to Specifying Policy Elements: Actions, Effects, Resources, and Principals in the Amazon Redshift Cluster Management Guide. 
      */
    var ResourceType: js.UndefOr[String] = js.undefined
    /**
      * A tag key or keys for which you want to return all matching resources that are associated with the specified key or keys. For example, suppose that you have resources tagged with keys called owner and environment. If you specify both of these tag keys in the request, Amazon Redshift returns a response with all resources that have either or both of these tag keys associated with them.
      */
    var TagKeys: js.UndefOr[TagKeyList] = js.undefined
    /**
      * A tag value or values for which you want to return all matching resources that are associated with the specified value or values. For example, suppose that you have resources tagged with values called admin and test. If you specify both of these tag values in the request, Amazon Redshift returns a response with all resources that have either or both of these tag values associated with them.
      */
    var TagValues: js.UndefOr[TagValueList] = js.undefined
  }
  
  trait DisableLoggingMessage extends js.Object {
    /**
      * The identifier of the cluster on which logging is to be stopped. Example: examplecluster 
      */
    var ClusterIdentifier: String
  }
  
  trait DisableSnapshotCopyMessage extends js.Object {
    /**
      * The unique identifier of the source cluster that you want to disable copying of snapshots to a destination region. Constraints: Must be the valid name of an existing cluster that has cross-region snapshot copy enabled.
      */
    var ClusterIdentifier: String
  }
  
  trait DisableSnapshotCopyResult extends js.Object {
    var Cluster: js.UndefOr[Cluster] = js.undefined
  }
  
  trait EC2SecurityGroup extends js.Object {
    /**
      * The name of the EC2 Security Group.
      */
    var EC2SecurityGroupName: js.UndefOr[String] = js.undefined
    /**
      * The AWS ID of the owner of the EC2 security group specified in the EC2SecurityGroupName field. 
      */
    var EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined
    /**
      * The status of the EC2 security group.
      */
    var Status: js.UndefOr[String] = js.undefined
    /**
      * The list of tags for the EC2 security group.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait ElasticIpStatus extends js.Object {
    /**
      * The elastic IP (EIP) address for the cluster.
      */
    var ElasticIp: js.UndefOr[String] = js.undefined
    /**
      * The status of the elastic IP (EIP) address.
      */
    var Status: js.UndefOr[String] = js.undefined
  }
  
  trait EnableLoggingMessage extends js.Object {
    /**
      * The name of an existing S3 bucket where the log files are to be stored. Constraints:   Must be in the same region as the cluster   The cluster must have read bucket and put object permissions  
      */
    var BucketName: String
    /**
      * The identifier of the cluster on which logging is to be started. Example: examplecluster 
      */
    var ClusterIdentifier: String
    /**
      * The prefix applied to the log file names. Constraints:   Cannot exceed 512 characters   Cannot contain spaces( ), double quotes ("), single quotes ('), a backslash (\), or control characters. The hexadecimal codes for invalid characters are:    x00 to x20   x22   x27   x5c   x7f or larger    
      */
    var S3KeyPrefix: js.UndefOr[String] = js.undefined
  }
  
  trait EnableSnapshotCopyMessage extends js.Object {
    /**
      * The unique identifier of the source cluster to copy snapshots from. Constraints: Must be the valid name of an existing cluster that does not already have cross-region snapshot copy enabled.
      */
    var ClusterIdentifier: String
    /**
      * The destination AWS Region that you want to copy snapshots to. Constraints: Must be the name of a valid AWS Region. For more information, see Regions and Endpoints in the Amazon Web Services General Reference. 
      */
    var DestinationRegion: String
    /**
      * The number of days to retain newly copied snapshots in the destination AWS Region after they are copied from the source AWS Region. If the value is -1, the manual snapshot is retained indefinitely.  The value must be either -1 or an integer between 1 and 3,653.
      */
    var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The number of days to retain automated snapshots in the destination region after they are copied from the source region. Default: 7. Constraints: Must be at least 1 and no more than 35.
      */
    var RetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The name of the snapshot copy grant to use when snapshots of an AWS KMS-encrypted cluster are copied to the destination region.
      */
    var SnapshotCopyGrantName: js.UndefOr[String] = js.undefined
  }
  
  trait EnableSnapshotCopyResult extends js.Object {
    var Cluster: js.UndefOr[Cluster] = js.undefined
  }
  
  trait Endpoint extends js.Object {
    /**
      * The DNS address of the Cluster.
      */
    var Address: js.UndefOr[String] = js.undefined
    /**
      * The port that the database engine is listening on.
      */
    var Port: js.UndefOr[Integer] = js.undefined
  }
  
  trait Event extends js.Object {
    /**
      * The date and time of the event.
      */
    var Date: js.UndefOr[TStamp] = js.undefined
    /**
      * A list of the event categories. Values: Configuration, Management, Monitoring, Security
      */
    var EventCategories: js.UndefOr[EventCategoriesList] = js.undefined
    /**
      * The identifier of the event.
      */
    var EventId: js.UndefOr[String] = js.undefined
    /**
      * The text of this event.
      */
    var Message: js.UndefOr[String] = js.undefined
    /**
      * The severity of the event. Values: ERROR, INFO
      */
    var Severity: js.UndefOr[String] = js.undefined
    /**
      * The identifier for the source of the event.
      */
    var SourceIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The source type for this event.
      */
    var SourceType: js.UndefOr[SourceType] = js.undefined
  }
  
  trait EventCategoriesMap extends js.Object {
    /**
      * The events in the event category.
      */
    var Events: js.UndefOr[EventInfoMapList] = js.undefined
    /**
      * The source type, such as cluster or cluster-snapshot, that the returned categories belong to.
      */
    var SourceType: js.UndefOr[String] = js.undefined
  }
  
  trait EventCategoriesMessage extends js.Object {
    /**
      * A list of event categories descriptions.
      */
    var EventCategoriesMapList: js.UndefOr[EventCategoriesMapList] = js.undefined
  }
  
  trait EventInfoMap extends js.Object {
    /**
      * The category of an Amazon Redshift event.
      */
    var EventCategories: js.UndefOr[EventCategoriesList] = js.undefined
    /**
      * The description of an Amazon Redshift event.
      */
    var EventDescription: js.UndefOr[String] = js.undefined
    /**
      * The identifier of an Amazon Redshift event.
      */
    var EventId: js.UndefOr[String] = js.undefined
    /**
      * The severity of the event. Values: ERROR, INFO
      */
    var Severity: js.UndefOr[String] = js.undefined
  }
  
  trait EventSubscription extends js.Object {
    /**
      * The name of the Amazon Redshift event notification subscription.
      */
    var CustSubscriptionId: js.UndefOr[String] = js.undefined
    /**
      * The AWS customer account associated with the Amazon Redshift event notification subscription.
      */
    var CustomerAwsId: js.UndefOr[String] = js.undefined
    /**
      * A boolean value indicating whether the subscription is enabled; true indicates that the subscription is enabled.
      */
    var Enabled: js.UndefOr[Boolean] = js.undefined
    /**
      * The list of Amazon Redshift event categories specified in the event notification subscription. Values: Configuration, Management, Monitoring, Security
      */
    var EventCategoriesList: js.UndefOr[EventCategoriesList] = js.undefined
    /**
      * The event severity specified in the Amazon Redshift event notification subscription. Values: ERROR, INFO
      */
    var Severity: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the Amazon SNS topic used by the event notification subscription.
      */
    var SnsTopicArn: js.UndefOr[String] = js.undefined
    /**
      * A list of the sources that publish events to the Amazon Redshift event notification subscription.
      */
    var SourceIdsList: js.UndefOr[SourceIdsList] = js.undefined
    /**
      * The source type of the events returned the Amazon Redshift event notification, such as cluster, or cluster-snapshot.
      */
    var SourceType: js.UndefOr[String] = js.undefined
    /**
      * The status of the Amazon Redshift event notification subscription. Constraints:   Can be one of the following: active | no-permission | topic-not-exist   The status "no-permission" indicates that Amazon Redshift no longer has permission to post to the Amazon SNS topic. The status "topic-not-exist" indicates that the topic was deleted after the subscription was created.  
      */
    var Status: js.UndefOr[String] = js.undefined
    /**
      * The date and time the Amazon Redshift event notification subscription was created.
      */
    var SubscriptionCreationTime: js.UndefOr[TStamp] = js.undefined
    /**
      * The list of tags for the event subscription.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait EventSubscriptionsMessage extends js.Object {
    /**
      * A list of event subscriptions.
      */
    var EventSubscriptionsList: js.UndefOr[EventSubscriptionsList] = js.undefined
    /**
      * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
      */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  trait EventsMessage extends js.Object {
    /**
      * A list of Event instances. 
      */
    var Events: js.UndefOr[EventList] = js.undefined
    /**
      * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
      */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  trait GetClusterCredentialsMessage extends js.Object {
    /**
      * Create a database user with the name specified for the user named in DbUser if one does not exist.
      */
    var AutoCreate: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * The unique identifier of the cluster that contains the database for which your are requesting credentials. This parameter is case sensitive.
      */
    var ClusterIdentifier: String
    /**
      * A list of the names of existing database groups that the user named in DbUser will join for the current session, in addition to any group memberships for an existing user. If not specified, a new user is added only to PUBLIC. Database group name constraints   Must be 1 to 64 alphanumeric characters or hyphens   Must contain only lowercase letters, numbers, underscore, plus sign, period (dot), at symbol (@), or hyphen.   First character must be a letter.   Must not contain a colon ( : ) or slash ( / ).    Cannot be a reserved word. A list of reserved words can be found in Reserved Words in the Amazon Redshift Database Developer Guide.  
      */
    var DbGroups: js.UndefOr[DbGroupList] = js.undefined
    /**
      * The name of a database that DbUser is authorized to log on to. If DbName is not specified, DbUser can log on to any existing database. Constraints:   Must be 1 to 64 alphanumeric characters or hyphens   Must contain only lowercase letters, numbers, underscore, plus sign, period (dot), at symbol (@), or hyphen.   First character must be a letter.   Must not contain a colon ( : ) or slash ( / ).    Cannot be a reserved word. A list of reserved words can be found in Reserved Words in the Amazon Redshift Database Developer Guide.  
      */
    var DbName: js.UndefOr[String] = js.undefined
    /**
      * The name of a database user. If a user name matching DbUser exists in the database, the temporary user credentials have the same permissions as the existing user. If DbUser doesn't exist in the database and Autocreate is True, a new user is created using the value for DbUser with PUBLIC permissions. If a database user matching the value for DbUser doesn't exist and Autocreate is False, then the command succeeds but the connection attempt will fail because the user doesn't exist in the database. For more information, see CREATE USER in the Amazon Redshift Database Developer Guide.  Constraints:   Must be 1 to 64 alphanumeric characters or hyphens. The user name can't be PUBLIC.   Must contain only lowercase letters, numbers, underscore, plus sign, period (dot), at symbol (@), or hyphen.   First character must be a letter.   Must not contain a colon ( : ) or slash ( / ).    Cannot be a reserved word. A list of reserved words can be found in Reserved Words in the Amazon Redshift Database Developer Guide.  
      */
    var DbUser: String
    /**
      * The number of seconds until the returned temporary password expires. Constraint: minimum 900, maximum 3600. Default: 900
      */
    var DurationSeconds: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  trait GetReservedNodeExchangeOfferingsInputMessage extends js.Object {
    /**
      * A value that indicates the starting point for the next set of ReservedNodeOfferings.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * An integer setting the maximum number of ReservedNodeOfferings to retrieve.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * A string representing the node identifier for the DC1 Reserved Node to be exchanged.
      */
    var ReservedNodeId: String
  }
  
  trait GetReservedNodeExchangeOfferingsOutputMessage extends js.Object {
    /**
      * An optional parameter that specifies the starting point for returning a set of response records. When the results of a GetReservedNodeExchangeOfferings request exceed the value specified in MaxRecords, Amazon Redshift returns a value in the marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the marker parameter and retrying the request. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * Returns an array of ReservedNodeOffering objects.
      */
    var ReservedNodeOfferings: js.UndefOr[ReservedNodeOfferingList] = js.undefined
  }
  
  trait HsmClientCertificate extends js.Object {
    /**
      * The identifier of the HSM client certificate.
      */
    var HsmClientCertificateIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The public key that the Amazon Redshift cluster will use to connect to the HSM. You must register the public key in the HSM.
      */
    var HsmClientCertificatePublicKey: js.UndefOr[String] = js.undefined
    /**
      * The list of tags for the HSM client certificate.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait HsmClientCertificateMessage extends js.Object {
    /**
      * A list of the identifiers for one or more HSM client certificates used by Amazon Redshift clusters to store and retrieve database encryption keys in an HSM.
      */
    var HsmClientCertificates: js.UndefOr[HsmClientCertificateList] = js.undefined
    /**
      * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
      */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  trait HsmConfiguration extends js.Object {
    /**
      * A text description of the HSM configuration.
      */
    var Description: js.UndefOr[String] = js.undefined
    /**
      * The name of the Amazon Redshift HSM configuration.
      */
    var HsmConfigurationIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The IP address that the Amazon Redshift cluster must use to access the HSM.
      */
    var HsmIpAddress: js.UndefOr[String] = js.undefined
    /**
      * The name of the partition in the HSM where the Amazon Redshift clusters will store their database encryption keys.
      */
    var HsmPartitionName: js.UndefOr[String] = js.undefined
    /**
      * The list of tags for the HSM configuration.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait HsmConfigurationMessage extends js.Object {
    /**
      * A list of HsmConfiguration objects.
      */
    var HsmConfigurations: js.UndefOr[HsmConfigurationList] = js.undefined
    /**
      * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
      */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  trait HsmStatus extends js.Object {
    /**
      * Specifies the name of the HSM client certificate the Amazon Redshift cluster uses to retrieve the data encryption keys stored in an HSM.
      */
    var HsmClientCertificateIdentifier: js.UndefOr[String] = js.undefined
    /**
      * Specifies the name of the HSM configuration that contains the information the Amazon Redshift cluster can use to retrieve and store keys in an HSM.
      */
    var HsmConfigurationIdentifier: js.UndefOr[String] = js.undefined
    /**
      * Reports whether the Amazon Redshift cluster has finished applying any HSM settings changes specified in a modify cluster command. Values: active, applying
      */
    var Status: js.UndefOr[String] = js.undefined
  }
  
  trait IPRange extends js.Object {
    /**
      * The IP range in Classless Inter-Domain Routing (CIDR) notation.
      */
    var CIDRIP: js.UndefOr[String] = js.undefined
    /**
      * The status of the IP range, for example, "authorized".
      */
    var Status: js.UndefOr[String] = js.undefined
    /**
      * The list of tags for the IP range.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait LoggingStatus extends js.Object {
    /**
      * The name of the S3 bucket where the log files are stored.
      */
    var BucketName: js.UndefOr[String] = js.undefined
    /**
      * The message indicating that logs failed to be delivered.
      */
    var LastFailureMessage: js.UndefOr[String] = js.undefined
    /**
      * The last time when logs failed to be delivered.
      */
    var LastFailureTime: js.UndefOr[TStamp] = js.undefined
    /**
      * The last time that logs were delivered.
      */
    var LastSuccessfulDeliveryTime: js.UndefOr[TStamp] = js.undefined
    /**
      *  true if logging is on, false if logging is off.
      */
    var LoggingEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * The prefix applied to the log file names.
      */
    var S3KeyPrefix: js.UndefOr[String] = js.undefined
  }
  
  trait MaintenanceTrack extends js.Object {
    /**
      * The version number for the cluster release.
      */
    var DatabaseVersion: js.UndefOr[String] = js.undefined
    /**
      * The name of the maintenance track. Possible values are current and trailing.
      */
    var MaintenanceTrackName: js.UndefOr[String] = js.undefined
    /**
      * An array of UpdateTarget objects to update with the maintenance track. 
      */
    var UpdateTargets: js.UndefOr[EligibleTracksToUpdateList] = js.undefined
  }
  
  trait ModifyClusterDbRevisionMessage extends js.Object {
    /**
      * The unique identifier of a cluster whose database revision you want to modify.  Example: examplecluster 
      */
    var ClusterIdentifier: String
    /**
      * The identifier of the database revision. You can retrieve this value from the response to the DescribeClusterDbRevisions request.
      */
    var RevisionTarget: String
  }
  
  trait ModifyClusterDbRevisionResult extends js.Object {
    var Cluster: js.UndefOr[Cluster] = js.undefined
  }
  
  trait ModifyClusterIamRolesMessage extends js.Object {
    /**
      * Zero or more IAM roles to associate with the cluster. The roles must be in their Amazon Resource Name (ARN) format. You can associate up to 10 IAM roles with a single cluster in a single request.
      */
    var AddIamRoles: js.UndefOr[IamRoleArnList] = js.undefined
    /**
      * The unique identifier of the cluster for which you want to associate or disassociate IAM roles.
      */
    var ClusterIdentifier: String
    /**
      * Zero or more IAM roles in ARN format to disassociate from the cluster. You can disassociate up to 10 IAM roles from a single cluster in a single request.
      */
    var RemoveIamRoles: js.UndefOr[IamRoleArnList] = js.undefined
  }
  
  trait ModifyClusterIamRolesResult extends js.Object {
    var Cluster: js.UndefOr[Cluster] = js.undefined
  }
  
  trait ModifyClusterMaintenanceMessage extends js.Object {
    /**
      * A unique identifier for the cluster.
      */
    var ClusterIdentifier: String
    /**
      * A boolean indicating whether to enable the deferred maintenance window. 
      */
    var DeferMaintenance: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * An integer indicating the duration of the maintenance window in days. If you specify a duration, you can't specify an end time. The duration must be 14 days or less.
      */
    var DeferMaintenanceDuration: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * A timestamp indicating end time for the deferred maintenance window. If you specify an end time, you can't specify a duration.
      */
    var DeferMaintenanceEndTime: js.UndefOr[TStamp] = js.undefined
    /**
      * A unique identifier for the deferred maintenance window.
      */
    var DeferMaintenanceIdentifier: js.UndefOr[String] = js.undefined
    /**
      * A timestamp indicating the start time for the deferred maintenance window.
      */
    var DeferMaintenanceStartTime: js.UndefOr[TStamp] = js.undefined
  }
  
  trait ModifyClusterMaintenanceResult extends js.Object {
    var Cluster: js.UndefOr[Cluster] = js.undefined
  }
  
  trait ModifyClusterMessage extends js.Object {
    /**
      * If true, major version upgrades will be applied automatically to the cluster during the maintenance window.  Default: false 
      */
    var AllowVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * The number of days that automated snapshots are retained. If the value is 0, automated snapshots are disabled. Even if automated snapshots are disabled, you can still create manual snapshots when you want with CreateClusterSnapshot.  If you decrease the automated snapshot retention period from its current value, existing automated snapshots that fall outside of the new retention period will be immediately deleted. Default: Uses existing setting. Constraints: Must be a value from 0 to 35.
      */
    var AutomatedSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The unique identifier of the cluster to be modified. Example: examplecluster 
      */
    var ClusterIdentifier: String
    /**
      * The name of the cluster parameter group to apply to this cluster. This change is applied only after the cluster is rebooted. To reboot a cluster use RebootCluster.  Default: Uses existing setting. Constraints: The cluster parameter group must be in the same parameter group family that matches the cluster version.
      */
    var ClusterParameterGroupName: js.UndefOr[String] = js.undefined
    /**
      * A list of cluster security groups to be authorized on this cluster. This change is asynchronously applied as soon as possible. Security groups currently associated with the cluster, and not in the list of groups to apply, will be revoked from the cluster. Constraints:   Must be 1 to 255 alphanumeric characters or hyphens   First character must be a letter   Cannot end with a hyphen or contain two consecutive hyphens  
      */
    var ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroupNameList] = js.undefined
    /**
      * The new cluster type. When you submit your cluster resize request, your existing cluster goes into a read-only mode. After Amazon Redshift provisions a new cluster based on your resize requirements, there will be outage for a period while the old cluster is deleted and your connection is switched to the new cluster. You can use DescribeResize to track the progress of the resize request.  Valid Values:  multi-node | single-node  
      */
    var ClusterType: js.UndefOr[String] = js.undefined
    /**
      * The new version number of the Amazon Redshift engine to upgrade to. For major version upgrades, if a non-default cluster parameter group is currently in use, a new cluster parameter group in the cluster parameter group family for the new version must be specified. The new cluster parameter group can be the default for that cluster parameter group family. For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide. Example: 1.0 
      */
    var ClusterVersion: js.UndefOr[String] = js.undefined
    /**
      * The Elastic IP (EIP) address for the cluster. Constraints: The cluster must be provisioned in EC2-VPC and publicly-accessible through an Internet gateway. For more information about provisioning clusters in EC2-VPC, go to Supported Platforms to Launch Your Cluster in the Amazon Redshift Cluster Management Guide.
      */
    var ElasticIp: js.UndefOr[String] = js.undefined
    /**
      * Indicates whether the cluster is encrypted. If the cluster is encrypted and you provide a value for the KmsKeyId parameter, we will encrypt the cluster with the provided KmsKeyId. If you don't provide a KmsKeyId, we will encrypt with the default key. In the China region we will use legacy encryption if you specify that the cluster is encrypted.
      */
    var Encrypted: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * An option that specifies whether to create the cluster with enhanced VPC routing enabled. To create a cluster that uses enhanced VPC routing, the cluster must be in a VPC. For more information, see Enhanced VPC Routing in the Amazon Redshift Cluster Management Guide. If this option is true, enhanced VPC routing is enabled.  Default: false
      */
    var EnhancedVpcRouting: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * Specifies the name of the HSM client certificate the Amazon Redshift cluster uses to retrieve the data encryption keys stored in an HSM.
      */
    var HsmClientCertificateIdentifier: js.UndefOr[String] = js.undefined
    /**
      * Specifies the name of the HSM configuration that contains the information the Amazon Redshift cluster can use to retrieve and store keys in an HSM.
      */
    var HsmConfigurationIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The AWS Key Management Service (KMS) key ID of the encryption key that you want to use to encrypt data in the cluster.
      */
    var KmsKeyId: js.UndefOr[String] = js.undefined
    /**
      * The name for the maintenance track that you want to assign for the cluster. This name change is asynchronous. The new track name stays in the PendingModifiedValues for the cluster until the next maintenance window. When the maintenance track changes, the cluster is switched to the latest cluster release available for the maintenance track. At this point, the maintenance track name is applied.
      */
    var MaintenanceTrackName: js.UndefOr[String] = js.undefined
    /**
      * The default for number of days that a newly created manual snapshot is retained. If the value is -1, the manual snapshot is retained indefinitely. This value doesn't retroactively change the retention periods of existing manual snapshots. The value must be either -1 or an integer between 1 and 3,653. The default value is -1.
      */
    var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The new password for the cluster master user. This change is asynchronously applied as soon as possible. Between the time of the request and the completion of the request, the MasterUserPassword element exists in the PendingModifiedValues element of the operation response.   Operations never return the password, so this operation provides a way to regain access to the master user account for a cluster if the password is lost.  Default: Uses existing setting. Constraints:   Must be between 8 and 64 characters in length.   Must contain at least one uppercase letter.   Must contain at least one lowercase letter.   Must contain one number.   Can be any printable ASCII character (ASCII code 33 to 126) except ' (single quote), " (double quote), \, /, @, or space.  
      */
    var MasterUserPassword: js.UndefOr[String] = js.undefined
    /**
      * The new identifier for the cluster. Constraints:   Must contain from 1 to 63 alphanumeric characters or hyphens.   Alphabetic characters must be lowercase.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Must be unique for all clusters within an AWS account.   Example: examplecluster 
      */
    var NewClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The new node type of the cluster. If you specify a new node type, you must also specify the number of nodes parameter. When you submit your request to resize a cluster, Amazon Redshift sets access permissions for the cluster to read-only. After Amazon Redshift provisions a new cluster according to your resize requirements, there will be a temporary outage while the old cluster is deleted and your connection is switched to the new cluster. When the new connection is complete, the original access permissions for the cluster are restored. You can use DescribeResize to track the progress of the resize request.  Valid Values: ds2.xlarge | ds2.8xlarge | dc1.large | dc1.8xlarge | dc2.large | dc2.8xlarge 
      */
    var NodeType: js.UndefOr[String] = js.undefined
    /**
      * The new number of nodes of the cluster. If you specify a new number of nodes, you must also specify the node type parameter. When you submit your request to resize a cluster, Amazon Redshift sets access permissions for the cluster to read-only. After Amazon Redshift provisions a new cluster according to your resize requirements, there will be a temporary outage while the old cluster is deleted and your connection is switched to the new cluster. When the new connection is complete, the original access permissions for the cluster are restored. You can use DescribeResize to track the progress of the resize request.  Valid Values: Integer greater than 0.
      */
    var NumberOfNodes: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The weekly time range (in UTC) during which system maintenance can occur, if necessary. If system maintenance is necessary during the window, it may result in an outage. This maintenance window change is made immediately. If the new maintenance window indicates the current time, there must be at least 120 minutes between the current time and end of the window in order to ensure that pending changes are applied. Default: Uses existing setting. Format: ddd:hh24:mi-ddd:hh24:mi, for example wed:07:30-wed:08:00. Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun Constraints: Must be at least 30 minutes.
      */
    var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
    /**
      * If true, the cluster can be accessed from a public network. Only clusters in VPCs can be set to be publicly available.
      */
    var PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * A list of virtual private cloud (VPC) security groups to be associated with the cluster. This change is asynchronously applied as soon as possible.
      */
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
  }
  
  trait ModifyClusterParameterGroupMessage extends js.Object {
    /**
      * The name of the parameter group to be modified.
      */
    var ParameterGroupName: String
    /**
      * An array of parameters to be modified. A maximum of 20 parameters can be modified in a single request. For each parameter to be modified, you must supply at least the parameter name and parameter value; other name-value pairs of the parameter are optional. For the workload management (WLM) configuration, you must supply all the name-value pairs in the wlm_json_configuration parameter.
      */
    var Parameters: ParametersList
  }
  
  trait ModifyClusterResult extends js.Object {
    var Cluster: js.UndefOr[Cluster] = js.undefined
  }
  
  trait ModifyClusterSnapshotMessage extends js.Object {
    /**
      * A Boolean option to override an exception if the retention period has already passed.
      */
    var Force: js.UndefOr[Boolean] = js.undefined
    /**
      * The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained indefinitely. If the manual snapshot falls outside of the new retention period, you can specify the force option to immediately delete the snapshot. The value must be either -1 or an integer between 1 and 3,653.
      */
    var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The identifier of the snapshot whose setting you want to modify.
      */
    var SnapshotIdentifier: String
  }
  
  trait ModifyClusterSnapshotResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot] = js.undefined
  }
  
  trait ModifyClusterSnapshotScheduleMessage extends js.Object {
    /**
      * A unique identifier for the cluster whose snapshot schedule you want to modify. 
      */
    var ClusterIdentifier: String
    /**
      * A boolean to indicate whether to remove the assoiciation between the cluster and the schedule.
      */
    var DisassociateSchedule: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * A unique alphanumeric identifier for the schedule that you want to associate with the cluster.
      */
    var ScheduleIdentifier: js.UndefOr[String] = js.undefined
  }
  
  trait ModifyClusterSubnetGroupMessage extends js.Object {
    /**
      * The name of the subnet group to be modified.
      */
    var ClusterSubnetGroupName: String
    /**
      * A text description of the subnet group to be modified.
      */
    var Description: js.UndefOr[String] = js.undefined
    /**
      * An array of VPC subnet IDs. A maximum of 20 subnets can be modified in a single request.
      */
    var SubnetIds: SubnetIdentifierList
  }
  
  trait ModifyClusterSubnetGroupResult extends js.Object {
    var ClusterSubnetGroup: js.UndefOr[ClusterSubnetGroup] = js.undefined
  }
  
  trait ModifyEventSubscriptionMessage extends js.Object {
    /**
      * A Boolean value indicating if the subscription is enabled. true indicates the subscription is enabled 
      */
    var Enabled: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * Specifies the Amazon Redshift event categories to be published by the event notification subscription. Values: configuration, management, monitoring, security
      */
    var EventCategories: js.UndefOr[EventCategoriesList] = js.undefined
    /**
      * Specifies the Amazon Redshift event severity to be published by the event notification subscription. Values: ERROR, INFO
      */
    var Severity: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the SNS topic to be used by the event notification subscription.
      */
    var SnsTopicArn: js.UndefOr[String] = js.undefined
    /**
      * A list of one or more identifiers of Amazon Redshift source objects. All of the objects must be of the same type as was specified in the source type parameter. The event subscription will return only events generated by the specified objects. If not specified, then events are returned for all objects within the source type specified. Example: my-cluster-1, my-cluster-2 Example: my-snapshot-20131010
      */
    var SourceIds: js.UndefOr[SourceIdsList] = js.undefined
    /**
      * The type of source that will be generating the events. For example, if you want to be notified of events generated by a cluster, you would set this parameter to cluster. If this value is not specified, events are returned for all Amazon Redshift objects in your AWS account. You must specify a source type in order to specify source IDs. Valid values: cluster, cluster-parameter-group, cluster-security-group, and cluster-snapshot.
      */
    var SourceType: js.UndefOr[String] = js.undefined
    /**
      * The name of the modified Amazon Redshift event notification subscription.
      */
    var SubscriptionName: String
  }
  
  trait ModifyEventSubscriptionResult extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription] = js.undefined
  }
  
  trait ModifySnapshotCopyRetentionPeriodMessage extends js.Object {
    /**
      * The unique identifier of the cluster for which you want to change the retention period for either automated or manual snapshots that are copied to a destination AWS Region. Constraints: Must be the valid name of an existing cluster that has cross-region snapshot copy enabled.
      */
    var ClusterIdentifier: String
    /**
      * Indicates whether to apply the snapshot retention period to newly copied manual snapshots instead of automated snapshots.
      */
    var Manual: js.UndefOr[Boolean] = js.undefined
    /**
      * The number of days to retain automated snapshots in the destination AWS Region after they are copied from the source AWS Region. By default, this only changes the retention period of copied automated snapshots.  If you decrease the retention period for automated snapshots that are copied to a destination AWS Region, Amazon Redshift deletes any existing automated snapshots that were copied to the destination AWS Region and that fall outside of the new retention period. Constraints: Must be at least 1 and no more than 35 for automated snapshots.  If you specify the manual option, only newly copied manual snapshots will have the new retention period.  If you specify the value of -1 newly copied manual snapshots are retained indefinitely. Constraints: The number of days must be either -1 or an integer between 1 and 3,653 for manual snapshots.
      */
    var RetentionPeriod: Integer
  }
  
  trait ModifySnapshotCopyRetentionPeriodResult extends js.Object {
    var Cluster: js.UndefOr[Cluster] = js.undefined
  }
  
  trait ModifySnapshotScheduleMessage extends js.Object {
    /**
      * An updated list of schedule definitions. A schedule definition is made up of schedule expressions, for example, "cron(30 12 *)" or "rate(12 hours)".
      */
    var ScheduleDefinitions: ScheduleDefinitionList
    /**
      * A unique alphanumeric identifier of the schedule to modify.
      */
    var ScheduleIdentifier: String
  }
  
  trait OrderableClusterOption extends js.Object {
    /**
      * A list of availability zones for the orderable cluster.
      */
    var AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined
    /**
      * The cluster type, for example multi-node. 
      */
    var ClusterType: js.UndefOr[String] = js.undefined
    /**
      * The version of the orderable cluster.
      */
    var ClusterVersion: js.UndefOr[String] = js.undefined
    /**
      * The node type for the orderable cluster.
      */
    var NodeType: js.UndefOr[String] = js.undefined
  }
  
  trait OrderableClusterOptionsMessage extends js.Object {
    /**
      * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * An OrderableClusterOption structure containing information about orderable options for the cluster.
      */
    var OrderableClusterOptions: js.UndefOr[OrderableClusterOptionsList] = js.undefined
  }
  
  trait Parameter extends js.Object {
    /**
      * The valid range of values for the parameter.
      */
    var AllowedValues: js.UndefOr[String] = js.undefined
    /**
      * Specifies how to apply the WLM configuration parameter. Some properties can be applied dynamically, while other properties require that any associated clusters be rebooted for the configuration changes to be applied. For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
      */
    var ApplyType: js.UndefOr[ParameterApplyType] = js.undefined
    /**
      * The data type of the parameter.
      */
    var DataType: js.UndefOr[String] = js.undefined
    /**
      * A description of the parameter.
      */
    var Description: js.UndefOr[String] = js.undefined
    /**
      * If true, the parameter can be modified. Some parameters have security or operational implications that prevent them from being changed. 
      */
    var IsModifiable: js.UndefOr[Boolean] = js.undefined
    /**
      * The earliest engine version to which the parameter can apply.
      */
    var MinimumEngineVersion: js.UndefOr[String] = js.undefined
    /**
      * The name of the parameter.
      */
    var ParameterName: js.UndefOr[String] = js.undefined
    /**
      * The value of the parameter.
      */
    var ParameterValue: js.UndefOr[String] = js.undefined
    /**
      * The source of the parameter value, such as "engine-default" or "user".
      */
    var Source: js.UndefOr[String] = js.undefined
  }
  
  trait PendingModifiedValues extends js.Object {
    /**
      * The pending or in-progress change of the automated snapshot retention period.
      */
    var AutomatedSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The pending or in-progress change of the new identifier for the cluster.
      */
    var ClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The pending or in-progress change of the cluster type.
      */
    var ClusterType: js.UndefOr[String] = js.undefined
    /**
      * The pending or in-progress change of the service version.
      */
    var ClusterVersion: js.UndefOr[String] = js.undefined
    /**
      * The encryption type for a cluster. Possible values are: KMS and None. For the China region the possible values are None, and Legacy. 
      */
    var EncryptionType: js.UndefOr[String] = js.undefined
    /**
      * An option that specifies whether to create the cluster with enhanced VPC routing enabled. To create a cluster that uses enhanced VPC routing, the cluster must be in a VPC. For more information, see Enhanced VPC Routing in the Amazon Redshift Cluster Management Guide. If this option is true, enhanced VPC routing is enabled.  Default: false
      */
    var EnhancedVpcRouting: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * The name of the maintenance track that the cluster will change to during the next maintenance window.
      */
    var MaintenanceTrackName: js.UndefOr[String] = js.undefined
    /**
      * The pending or in-progress change of the master user password for the cluster.
      */
    var MasterUserPassword: js.UndefOr[String] = js.undefined
    /**
      * The pending or in-progress change of the cluster's node type.
      */
    var NodeType: js.UndefOr[String] = js.undefined
    /**
      * The pending or in-progress change of the number of nodes in the cluster.
      */
    var NumberOfNodes: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The pending or in-progress change of the ability to connect to the cluster from the public network.
      */
    var PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined
  }
  
  trait PurchaseReservedNodeOfferingMessage extends js.Object {
    /**
      * The number of reserved nodes that you want to purchase. Default: 1 
      */
    var NodeCount: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The unique identifier of the reserved node offering you want to purchase.
      */
    var ReservedNodeOfferingId: String
  }
  
  trait PurchaseReservedNodeOfferingResult extends js.Object {
    var ReservedNode: js.UndefOr[ReservedNode] = js.undefined
  }
  
  trait RebootClusterMessage extends js.Object {
    /**
      * The cluster identifier.
      */
    var ClusterIdentifier: String
  }
  
  trait RebootClusterResult extends js.Object {
    var Cluster: js.UndefOr[Cluster] = js.undefined
  }
  
  trait RecurringCharge extends js.Object {
    /**
      * The amount charged per the period of time specified by the recurring charge frequency.
      */
    var RecurringChargeAmount: js.UndefOr[Double] = js.undefined
    /**
      * The frequency at which the recurring charge amount is applied.
      */
    var RecurringChargeFrequency: js.UndefOr[String] = js.undefined
  }
  
  trait ReservedNode extends js.Object {
    /**
      * The currency code for the reserved cluster.
      */
    var CurrencyCode: js.UndefOr[String] = js.undefined
    /**
      * The duration of the node reservation in seconds.
      */
    var Duration: js.UndefOr[Integer] = js.undefined
    /**
      * The fixed cost Amazon Redshift charges you for this reserved node.
      */
    var FixedPrice: js.UndefOr[Double] = js.undefined
    /**
      * The number of reserved compute nodes.
      */
    var NodeCount: js.UndefOr[Integer] = js.undefined
    /**
      * The node type of the reserved node.
      */
    var NodeType: js.UndefOr[String] = js.undefined
    /**
      * The anticipated utilization of the reserved node, as defined in the reserved node offering.
      */
    var OfferingType: js.UndefOr[String] = js.undefined
    /**
      * The recurring charges for the reserved node.
      */
    var RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined
    /**
      * The unique identifier for the reservation.
      */
    var ReservedNodeId: js.UndefOr[String] = js.undefined
    /**
      * The identifier for the reserved node offering.
      */
    var ReservedNodeOfferingId: js.UndefOr[String] = js.undefined
    var ReservedNodeOfferingType: js.UndefOr[ReservedNodeOfferingType] = js.undefined
    /**
      * The time the reservation started. You purchase a reserved node offering for a duration. This is the start time of that duration.
      */
    var StartTime: js.UndefOr[TStamp] = js.undefined
    /**
      * The state of the reserved compute node. Possible Values:   pending-payment-This reserved node has recently been purchased, and the sale has been approved, but payment has not yet been confirmed.   active-This reserved node is owned by the caller and is available for use.   payment-failed-Payment failed for the purchase attempt.   retired-The reserved node is no longer available.    exchanging-The owner is exchanging the reserved node for another reserved node.  
      */
    var State: js.UndefOr[String] = js.undefined
    /**
      * The hourly rate Amazon Redshift charges you for this reserved node.
      */
    var UsagePrice: js.UndefOr[Double] = js.undefined
  }
  
  trait ReservedNodeOffering extends js.Object {
    /**
      * The currency code for the compute nodes offering.
      */
    var CurrencyCode: js.UndefOr[String] = js.undefined
    /**
      * The duration, in seconds, for which the offering will reserve the node.
      */
    var Duration: js.UndefOr[Integer] = js.undefined
    /**
      * The upfront fixed charge you will pay to purchase the specific reserved node offering.
      */
    var FixedPrice: js.UndefOr[Double] = js.undefined
    /**
      * The node type offered by the reserved node offering.
      */
    var NodeType: js.UndefOr[String] = js.undefined
    /**
      * The anticipated utilization of the reserved node, as defined in the reserved node offering.
      */
    var OfferingType: js.UndefOr[String] = js.undefined
    /**
      * The charge to your account regardless of whether you are creating any clusters using the node offering. Recurring charges are only in effect for heavy-utilization reserved nodes.
      */
    var RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined
    /**
      * The offering identifier.
      */
    var ReservedNodeOfferingId: js.UndefOr[String] = js.undefined
    var ReservedNodeOfferingType: js.UndefOr[ReservedNodeOfferingType] = js.undefined
    /**
      * The rate you are charged for each hour the cluster that is using the offering is running.
      */
    var UsagePrice: js.UndefOr[Double] = js.undefined
  }
  
  trait ReservedNodeOfferingsMessage extends js.Object {
    /**
      * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * A list of ReservedNodeOffering objects.
      */
    var ReservedNodeOfferings: js.UndefOr[ReservedNodeOfferingList] = js.undefined
  }
  
  trait ReservedNodesMessage extends js.Object {
    /**
      * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The list of ReservedNode objects.
      */
    var ReservedNodes: js.UndefOr[ReservedNodeList] = js.undefined
  }
  
  trait ResetClusterParameterGroupMessage extends js.Object {
    /**
      * The name of the cluster parameter group to be reset.
      */
    var ParameterGroupName: String
    /**
      * An array of names of parameters to be reset. If ResetAllParameters option is not used, then at least one parameter name must be supplied.  Constraints: A maximum of 20 parameters can be reset in a single request.
      */
    var Parameters: js.UndefOr[ParametersList] = js.undefined
    /**
      * If true, all parameters in the specified parameter group will be reset to their default values.  Default: true 
      */
    var ResetAllParameters: js.UndefOr[Boolean] = js.undefined
  }
  
  trait ResizeClusterMessage extends js.Object {
    /**
      * A boolean value indicating whether the resize operation is using the classic resize process. If you don't provide this parameter or set the value to false, the resize type is elastic. 
      */
    var Classic: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * The unique identifier for the cluster to resize.
      */
    var ClusterIdentifier: String
    /**
      * The new cluster type for the specified cluster.
      */
    var ClusterType: js.UndefOr[String] = js.undefined
    /**
      * The new node type for the nodes you are adding.
      */
    var NodeType: js.UndefOr[String] = js.undefined
    /**
      * The new number of nodes for the cluster.
      */
    var NumberOfNodes: Integer
  }
  
  trait ResizeClusterResult extends js.Object {
    var Cluster: js.UndefOr[Cluster] = js.undefined
  }
  
  trait ResizeInfo extends js.Object {
    /**
      * A boolean value indicating if the resize operation can be cancelled.
      */
    var AllowCancelResize: js.UndefOr[Boolean] = js.undefined
    /**
      * Returns the value ClassicResize.
      */
    var ResizeType: js.UndefOr[String] = js.undefined
  }
  
  trait ResizeProgressMessage extends js.Object {
    /**
      * The average rate of the resize operation over the last few minutes, measured in megabytes per second. After the resize operation completes, this value shows the average rate of the entire resize operation.
      */
    var AvgResizeRateInMegaBytesPerSecond: js.UndefOr[DoubleOptional] = js.undefined
    /**
      * The amount of seconds that have elapsed since the resize operation began. After the resize operation completes, this value shows the total actual time, in seconds, for the resize operation.
      */
    var ElapsedTimeInSeconds: js.UndefOr[LongOptional] = js.undefined
    /**
      * The estimated time remaining, in seconds, until the resize operation is complete. This value is calculated based on the average resize rate and the estimated amount of data remaining to be processed. Once the resize operation is complete, this value will be 0.
      */
    var EstimatedTimeToCompletionInSeconds: js.UndefOr[LongOptional] = js.undefined
    /**
      * The names of tables that have been completely imported . Valid Values: List of table names.
      */
    var ImportTablesCompleted: js.UndefOr[ImportTablesCompleted] = js.undefined
    /**
      * The names of tables that are being currently imported. Valid Values: List of table names.
      */
    var ImportTablesInProgress: js.UndefOr[ImportTablesInProgress] = js.undefined
    /**
      * The names of tables that have not been yet imported. Valid Values: List of table names
      */
    var ImportTablesNotStarted: js.UndefOr[ImportTablesNotStarted] = js.undefined
    /**
      * An optional string to provide additional details about the resize action.
      */
    var Message: js.UndefOr[String] = js.undefined
    /**
      * While the resize operation is in progress, this value shows the current amount of data, in megabytes, that has been processed so far. When the resize operation is complete, this value shows the total amount of data, in megabytes, on the cluster, which may be more or less than TotalResizeDataInMegaBytes (the estimated total amount of data before resize).
      */
    var ProgressInMegaBytes: js.UndefOr[LongOptional] = js.undefined
    /**
      * An enum with possible values of ClassicResize and ElasticResize. These values describe the type of resize operation being performed. 
      */
    var ResizeType: js.UndefOr[String] = js.undefined
    /**
      * The status of the resize operation. Valid Values: NONE | IN_PROGRESS | FAILED | SUCCEEDED | CANCELLING 
      */
    var Status: js.UndefOr[String] = js.undefined
    /**
      * The cluster type after the resize operation is complete. Valid Values: multi-node | single-node 
      */
    var TargetClusterType: js.UndefOr[String] = js.undefined
    /**
      * The type of encryption for the cluster after the resize is complete. Possible values are KMS and None. In the China region possible values are: Legacy and None.
      */
    var TargetEncryptionType: js.UndefOr[String] = js.undefined
    /**
      * The node type that the cluster will have after the resize operation is complete.
      */
    var TargetNodeType: js.UndefOr[String] = js.undefined
    /**
      * The number of nodes that the cluster will have after the resize operation is complete.
      */
    var TargetNumberOfNodes: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The estimated total amount of data, in megabytes, on the cluster before the resize operation began.
      */
    var TotalResizeDataInMegaBytes: js.UndefOr[LongOptional] = js.undefined
  }
  
  trait RestoreFromClusterSnapshotMessage extends js.Object {
    /**
      * Reserved.
      */
    var AdditionalInfo: js.UndefOr[String] = js.undefined
    /**
      * If true, major version upgrades can be applied during the maintenance window to the Amazon Redshift engine that is running on the cluster.  Default: true 
      */
    var AllowVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * The number of days that automated snapshots are retained. If the value is 0, automated snapshots are disabled. Even if automated snapshots are disabled, you can still create manual snapshots when you want with CreateClusterSnapshot.  Default: The value selected for the cluster from which the snapshot was taken. Constraints: Must be a value from 0 to 35.
      */
    var AutomatedSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The Amazon EC2 Availability Zone in which to restore the cluster. Default: A random, system-chosen Availability Zone. Example: us-east-1a 
      */
    var AvailabilityZone: js.UndefOr[String] = js.undefined
    /**
      * The identifier of the cluster that will be created from restoring the snapshot. Constraints:   Must contain from 1 to 63 alphanumeric characters or hyphens.   Alphabetic characters must be lowercase.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Must be unique for all clusters within an AWS account.  
      */
    var ClusterIdentifier: String
    /**
      * The name of the parameter group to be associated with this cluster. Default: The default Amazon Redshift cluster parameter group. For information about the default parameter group, go to Working with Amazon Redshift Parameter Groups. Constraints:   Must be 1 to 255 alphanumeric characters or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.  
      */
    var ClusterParameterGroupName: js.UndefOr[String] = js.undefined
    /**
      * A list of security groups to be associated with this cluster. Default: The default cluster security group for Amazon Redshift. Cluster security groups only apply to clusters outside of VPCs.
      */
    var ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroupNameList] = js.undefined
    /**
      * The name of the subnet group where you want to cluster restored. A snapshot of cluster in VPC can be restored only in VPC. Therefore, you must provide subnet group name where you want the cluster restored.
      */
    var ClusterSubnetGroupName: js.UndefOr[String] = js.undefined
    /**
      * The elastic IP (EIP) address for the cluster.
      */
    var ElasticIp: js.UndefOr[String] = js.undefined
    /**
      * An option that specifies whether to create the cluster with enhanced VPC routing enabled. To create a cluster that uses enhanced VPC routing, the cluster must be in a VPC. For more information, see Enhanced VPC Routing in the Amazon Redshift Cluster Management Guide. If this option is true, enhanced VPC routing is enabled.  Default: false
      */
    var EnhancedVpcRouting: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * Specifies the name of the HSM client certificate the Amazon Redshift cluster uses to retrieve the data encryption keys stored in an HSM.
      */
    var HsmClientCertificateIdentifier: js.UndefOr[String] = js.undefined
    /**
      * Specifies the name of the HSM configuration that contains the information the Amazon Redshift cluster can use to retrieve and store keys in an HSM.
      */
    var HsmConfigurationIdentifier: js.UndefOr[String] = js.undefined
    /**
      * A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other AWS services. You must supply the IAM roles in their Amazon Resource Name (ARN) format. You can supply up to 10 IAM roles in a single request. A cluster can have up to 10 IAM roles associated at any time.
      */
    var IamRoles: js.UndefOr[IamRoleArnList] = js.undefined
    /**
      * The AWS Key Management Service (KMS) key ID of the encryption key that you want to use to encrypt data in the cluster that you restore from a shared snapshot.
      */
    var KmsKeyId: js.UndefOr[String] = js.undefined
    /**
      * The name of the maintenance track for the restored cluster. When you take a snapshot, the snapshot inherits the MaintenanceTrack value from the cluster. The snapshot might be on a different track than the cluster that was the source for the snapshot. For example, suppose that you take a snapshot of a cluster that is on the current track and then change the cluster to be on the trailing track. In this case, the snapshot and the source cluster are on different tracks.
      */
    var MaintenanceTrackName: js.UndefOr[String] = js.undefined
    var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The node type that the restored cluster will be provisioned with. Default: The node type of the cluster from which the snapshot was taken. You can modify this if you are using any DS node type. In that case, you can choose to restore into another DS node type of the same size. For example, you can restore ds1.8xlarge into ds2.8xlarge, or ds1.xlarge into ds2.xlarge. If you have a DC instance type, you must restore into that same instance type and size. In other words, you can only restore a dc1.large instance type into another dc1.large instance type or dc2.large instance type. You can't restore dc1.8xlarge to dc2.8xlarge. First restore to a dc1.8xlareg cluster, then resize to a dc2.8large cluster. For more information about node types, see  About Clusters and Nodes in the Amazon Redshift Cluster Management Guide. 
      */
    var NodeType: js.UndefOr[String] = js.undefined
    /**
      * The AWS customer account used to create or copy the snapshot. Required if you are restoring a snapshot you do not own, optional if you own the snapshot.
      */
    var OwnerAccount: js.UndefOr[String] = js.undefined
    /**
      * The port number on which the cluster accepts connections. Default: The same port as the original cluster. Constraints: Must be between 1115 and 65535.
      */
    var Port: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The weekly time range (in UTC) during which automated cluster maintenance can occur.  Format: ddd:hh24:mi-ddd:hh24:mi   Default: The value selected for the cluster from which the snapshot was taken. For more information about the time blocks for each region, see Maintenance Windows in Amazon Redshift Cluster Management Guide.  Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun Constraints: Minimum 30-minute window.
      */
    var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
    /**
      * If true, the cluster can be accessed from a public network. 
      */
    var PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * The name of the cluster the source snapshot was created from. This parameter is required if your IAM user has a policy containing a snapshot resource element that specifies anything other than * for the cluster name.
      */
    var SnapshotClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The name of the snapshot from which to create the new cluster. This parameter isn't case sensitive. Example: my-snapshot-id 
      */
    var SnapshotIdentifier: String
    /**
      * A unique identifier for the snapshot schedule.
      */
    var SnapshotScheduleIdentifier: js.UndefOr[String] = js.undefined
    /**
      * A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster. Default: The default VPC security group is associated with the cluster. VPC security groups only apply to clusters in VPCs.
      */
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
  }
  
  trait RestoreFromClusterSnapshotResult extends js.Object {
    var Cluster: js.UndefOr[Cluster] = js.undefined
  }
  
  trait RestoreStatus extends js.Object {
    /**
      * The number of megabytes per second being transferred from the backup storage. Returns the average rate for a completed backup.
      */
    var CurrentRestoreRateInMegaBytesPerSecond: js.UndefOr[Double] = js.undefined
    /**
      * The amount of time an in-progress restore has been running, or the amount of time it took a completed restore to finish.
      */
    var ElapsedTimeInSeconds: js.UndefOr[Long] = js.undefined
    /**
      * The estimate of the time remaining before the restore will complete. Returns 0 for a completed restore.
      */
    var EstimatedTimeToCompletionInSeconds: js.UndefOr[Long] = js.undefined
    /**
      * The number of megabytes that have been transferred from snapshot storage.
      */
    var ProgressInMegaBytes: js.UndefOr[Long] = js.undefined
    /**
      * The size of the set of snapshot data used to restore the cluster.
      */
    var SnapshotSizeInMegaBytes: js.UndefOr[Long] = js.undefined
    /**
      * The status of the restore action. Returns starting, restoring, completed, or failed.
      */
    var Status: js.UndefOr[String] = js.undefined
  }
  
  trait RestoreTableFromClusterSnapshotMessage extends js.Object {
    /**
      * The identifier of the Amazon Redshift cluster to restore the table to.
      */
    var ClusterIdentifier: String
    /**
      * The name of the table to create as a result of the current request.
      */
    var NewTableName: String
    /**
      * The identifier of the snapshot to restore the table from. This snapshot must have been created from the Amazon Redshift cluster specified by the ClusterIdentifier parameter.
      */
    var SnapshotIdentifier: String
    /**
      * The name of the source database that contains the table to restore from.
      */
    var SourceDatabaseName: String
    /**
      * The name of the source schema that contains the table to restore from. If you do not specify a SourceSchemaName value, the default is public.
      */
    var SourceSchemaName: js.UndefOr[String] = js.undefined
    /**
      * The name of the source table to restore from.
      */
    var SourceTableName: String
    /**
      * The name of the database to restore the table to.
      */
    var TargetDatabaseName: js.UndefOr[String] = js.undefined
    /**
      * The name of the schema to restore the table to.
      */
    var TargetSchemaName: js.UndefOr[String] = js.undefined
  }
  
  trait RestoreTableFromClusterSnapshotResult extends js.Object {
    var TableRestoreStatus: js.UndefOr[TableRestoreStatus] = js.undefined
  }
  
  trait RevisionTarget extends js.Object {
    /**
      * A unique string that identifies the version to update the cluster to. You can use this value in ModifyClusterDbRevision.
      */
    var DatabaseRevision: js.UndefOr[String] = js.undefined
    /**
      * The date on which the database revision was released.
      */
    var DatabaseRevisionReleaseDate: js.UndefOr[TStamp] = js.undefined
    /**
      * A string that describes the changes and features that will be applied to the cluster when it is updated to the corresponding ClusterDbRevision.
      */
    var Description: js.UndefOr[String] = js.undefined
  }
  
  trait RevokeClusterSecurityGroupIngressMessage extends js.Object {
    /**
      * The IP range for which to revoke access. This range must be a valid Classless Inter-Domain Routing (CIDR) block of IP addresses. If CIDRIP is specified, EC2SecurityGroupName and EC2SecurityGroupOwnerId cannot be provided. 
      */
    var CIDRIP: js.UndefOr[String] = js.undefined
    /**
      * The name of the security Group from which to revoke the ingress rule.
      */
    var ClusterSecurityGroupName: String
    /**
      * The name of the EC2 Security Group whose access is to be revoked. If EC2SecurityGroupName is specified, EC2SecurityGroupOwnerId must also be provided and CIDRIP cannot be provided. 
      */
    var EC2SecurityGroupName: js.UndefOr[String] = js.undefined
    /**
      * The AWS account number of the owner of the security group specified in the EC2SecurityGroupName parameter. The AWS access key ID is not an acceptable value. If EC2SecurityGroupOwnerId is specified, EC2SecurityGroupName must also be provided. and CIDRIP cannot be provided.  Example: 111122223333 
      */
    var EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined
  }
  
  trait RevokeClusterSecurityGroupIngressResult extends js.Object {
    var ClusterSecurityGroup: js.UndefOr[ClusterSecurityGroup] = js.undefined
  }
  
  trait RevokeSnapshotAccessMessage extends js.Object {
    /**
      * The identifier of the AWS customer account that can no longer restore the specified snapshot.
      */
    var AccountWithRestoreAccess: String
    /**
      * The identifier of the cluster the snapshot was created from. This parameter is required if your IAM user has a policy containing a snapshot resource element that specifies anything other than * for the cluster name.
      */
    var SnapshotClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The identifier of the snapshot that the account can no longer access.
      */
    var SnapshotIdentifier: String
  }
  
  trait RevokeSnapshotAccessResult extends js.Object {
    var Snapshot: js.UndefOr[Snapshot] = js.undefined
  }
  
  trait RotateEncryptionKeyMessage extends js.Object {
    /**
      * The unique identifier of the cluster that you want to rotate the encryption keys for. Constraints: Must be the name of valid cluster that has encryption enabled.
      */
    var ClusterIdentifier: String
  }
  
  trait RotateEncryptionKeyResult extends js.Object {
    var Cluster: js.UndefOr[Cluster] = js.undefined
  }
  
  trait Snapshot extends js.Object {
    /**
      * A list of the AWS customer accounts authorized to restore the snapshot. Returns null if no accounts are authorized. Visible only to the snapshot owner. 
      */
    var AccountsWithRestoreAccess: js.UndefOr[AccountsWithRestoreAccessList] = js.undefined
    /**
      * The size of the incremental backup.
      */
    var ActualIncrementalBackupSizeInMegaBytes: js.UndefOr[Double] = js.undefined
    /**
      * The Availability Zone in which the cluster was created.
      */
    var AvailabilityZone: js.UndefOr[String] = js.undefined
    /**
      * The number of megabytes that have been transferred to the snapshot backup.
      */
    var BackupProgressInMegaBytes: js.UndefOr[Double] = js.undefined
    /**
      * The time (UTC) when the cluster was originally created.
      */
    var ClusterCreateTime: js.UndefOr[TStamp] = js.undefined
    /**
      * The identifier of the cluster for which the snapshot was taken.
      */
    var ClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The version ID of the Amazon Redshift engine that is running on the cluster.
      */
    var ClusterVersion: js.UndefOr[String] = js.undefined
    /**
      * The number of megabytes per second being transferred to the snapshot backup. Returns 0 for a completed backup. 
      */
    var CurrentBackupRateInMegaBytesPerSecond: js.UndefOr[Double] = js.undefined
    /**
      * The name of the database that was created when the cluster was created.
      */
    var DBName: js.UndefOr[String] = js.undefined
    /**
      * The amount of time an in-progress snapshot backup has been running, or the amount of time it took a completed backup to finish.
      */
    var ElapsedTimeInSeconds: js.UndefOr[Long] = js.undefined
    /**
      * If true, the data in the snapshot is encrypted at rest.
      */
    var Encrypted: js.UndefOr[Boolean] = js.undefined
    /**
      * A boolean that indicates whether the snapshot data is encrypted using the HSM keys of the source cluster. true indicates that the data is encrypted using HSM keys.
      */
    var EncryptedWithHSM: js.UndefOr[Boolean] = js.undefined
    /**
      * An option that specifies whether to create the cluster with enhanced VPC routing enabled. To create a cluster that uses enhanced VPC routing, the cluster must be in a VPC. For more information, see Enhanced VPC Routing in the Amazon Redshift Cluster Management Guide. If this option is true, enhanced VPC routing is enabled.  Default: false
      */
    var EnhancedVpcRouting: js.UndefOr[Boolean] = js.undefined
    /**
      * The estimate of the time remaining before the snapshot backup will complete. Returns 0 for a completed backup. 
      */
    var EstimatedSecondsToCompletion: js.UndefOr[Long] = js.undefined
    /**
      * The AWS Key Management Service (KMS) key ID of the encryption key that was used to encrypt data in the cluster from which the snapshot was taken.
      */
    var KmsKeyId: js.UndefOr[String] = js.undefined
    /**
      * The name of the maintenance track for the snapshot.
      */
    var MaintenanceTrackName: js.UndefOr[String] = js.undefined
    /**
      * The number of days until a manual snapshot will pass its retention period.
      */
    var ManualSnapshotRemainingDays: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained indefinitely.  The value must be either -1 or an integer between 1 and 3,653.
      */
    var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The master user name for the cluster.
      */
    var MasterUsername: js.UndefOr[String] = js.undefined
    /**
      * The node type of the nodes in the cluster.
      */
    var NodeType: js.UndefOr[String] = js.undefined
    /**
      * The number of nodes in the cluster.
      */
    var NumberOfNodes: js.UndefOr[Integer] = js.undefined
    /**
      * For manual snapshots, the AWS customer account used to create or copy the snapshot. For automatic snapshots, the owner of the cluster. The owner can perform all snapshot actions, such as sharing a manual snapshot.
      */
    var OwnerAccount: js.UndefOr[String] = js.undefined
    /**
      * The port that the cluster is listening on.
      */
    var Port: js.UndefOr[Integer] = js.undefined
    /**
      * The list of node types that this cluster snapshot is able to restore into.
      */
    var RestorableNodeTypes: js.UndefOr[RestorableNodeTypeList] = js.undefined
    /**
      * The time (in UTC format) when Amazon Redshift began the snapshot. A snapshot contains a copy of the cluster data as of this exact time.
      */
    var SnapshotCreateTime: js.UndefOr[TStamp] = js.undefined
    /**
      * The snapshot identifier that is provided in the request.
      */
    var SnapshotIdentifier: js.UndefOr[String] = js.undefined
    /**
      * A timestamp representing the start of the retention period for the snapshot.
      */
    var SnapshotRetentionStartTime: js.UndefOr[TStamp] = js.undefined
    /**
      * The snapshot type. Snapshots created using CreateClusterSnapshot and CopyClusterSnapshot are of type "manual". 
      */
    var SnapshotType: js.UndefOr[String] = js.undefined
    /**
      * The source region from which the snapshot was copied.
      */
    var SourceRegion: js.UndefOr[String] = js.undefined
    /**
      * The snapshot status. The value of the status depends on the API operation used:     CreateClusterSnapshot and CopyClusterSnapshot returns status as "creating".     DescribeClusterSnapshots returns status as "creating", "available", "final snapshot", or "failed".    DeleteClusterSnapshot returns status as "deleted".  
      */
    var Status: js.UndefOr[String] = js.undefined
    /**
      * The list of tags for the cluster snapshot.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
      * The size of the complete set of backup data that would be used to restore the cluster.
      */
    var TotalBackupSizeInMegaBytes: js.UndefOr[Double] = js.undefined
    /**
      * The VPC identifier of the cluster if the snapshot is from a cluster in a VPC. Otherwise, this field is not in the output.
      */
    var VpcId: js.UndefOr[String] = js.undefined
  }
  
  trait SnapshotCopyGrant extends js.Object {
    /**
      * The unique identifier of the customer master key (CMK) in AWS KMS to which Amazon Redshift is granted permission.
      */
    var KmsKeyId: js.UndefOr[String] = js.undefined
    /**
      * The name of the snapshot copy grant.
      */
    var SnapshotCopyGrantName: js.UndefOr[String] = js.undefined
    /**
      * A list of tag instances.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait SnapshotCopyGrantMessage extends js.Object {
    /**
      * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeSnapshotCopyGrant request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request.  Constraints: You can specify either the SnapshotCopyGrantName parameter or the Marker parameter, but not both. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The list of SnapshotCopyGrant objects.
      */
    var SnapshotCopyGrants: js.UndefOr[SnapshotCopyGrantList] = js.undefined
  }
  
  trait SnapshotErrorMessage extends js.Object {
    /**
      * The failure code for the error.
      */
    var FailureCode: js.UndefOr[String] = js.undefined
    /**
      * The text message describing the error.
      */
    var FailureReason: js.UndefOr[String] = js.undefined
    /**
      * A unique identifier for the cluster.
      */
    var SnapshotClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
      * A unique identifier for the snapshot returning the error.
      */
    var SnapshotIdentifier: js.UndefOr[String] = js.undefined
  }
  
  trait SnapshotMessage extends js.Object {
    /**
      * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * A list of Snapshot instances. 
      */
    var Snapshots: js.UndefOr[SnapshotList] = js.undefined
  }
  
  trait SnapshotSchedule extends js.Object {
    var AssociatedClusterCount: js.UndefOr[IntegerOptional] = js.undefined
    var AssociatedClusters: js.UndefOr[AssociatedClusterList] = js.undefined
    var NextInvocations: js.UndefOr[ScheduledSnapshotTimeList] = js.undefined
    /**
      * A list of ScheduleDefinitions
      */
    var ScheduleDefinitions: js.UndefOr[ScheduleDefinitionList] = js.undefined
    /**
      * The description of the schedule.
      */
    var ScheduleDescription: js.UndefOr[String] = js.undefined
    /**
      * A unique identifier for the schedule.
      */
    var ScheduleIdentifier: js.UndefOr[String] = js.undefined
    /**
      * An optional set of tags describing the schedule.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait SnapshotSortingEntity extends js.Object {
    /**
      * The category for sorting the snapshots.
      */
    var Attribute: SnapshotAttributeToSortBy
    /**
      * The order for listing the attributes.
      */
    var SortOrder: js.UndefOr[SortByOrder] = js.undefined
  }
  
  trait Subnet extends js.Object {
    var SubnetAvailabilityZone: js.UndefOr[AvailabilityZone] = js.undefined
    /**
      * The identifier of the subnet.
      */
    var SubnetIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The status of the subnet.
      */
    var SubnetStatus: js.UndefOr[String] = js.undefined
  }
  
  trait SupportedOperation extends js.Object {
    /**
      * A list of the supported operations.
      */
    var OperationName: js.UndefOr[String] = js.undefined
  }
  
  trait SupportedPlatform extends js.Object {
    var Name: js.UndefOr[String] = js.undefined
  }
  
  trait TableRestoreStatus extends js.Object {
    /**
      * The identifier of the Amazon Redshift cluster that the table is being restored to.
      */
    var ClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
      * A description of the status of the table restore request. Status values include SUCCEEDED, FAILED, CANCELED, PENDING, IN_PROGRESS.
      */
    var Message: js.UndefOr[String] = js.undefined
    /**
      * The name of the table to create as a result of the table restore request.
      */
    var NewTableName: js.UndefOr[String] = js.undefined
    /**
      * The amount of data restored to the new table so far, in megabytes (MB).
      */
    var ProgressInMegaBytes: js.UndefOr[LongOptional] = js.undefined
    /**
      * The time that the table restore request was made, in Universal Coordinated Time (UTC).
      */
    var RequestTime: js.UndefOr[TStamp] = js.undefined
    /**
      * The identifier of the snapshot that the table is being restored from.
      */
    var SnapshotIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The name of the source database that contains the table being restored.
      */
    var SourceDatabaseName: js.UndefOr[String] = js.undefined
    /**
      * The name of the source schema that contains the table being restored.
      */
    var SourceSchemaName: js.UndefOr[String] = js.undefined
    /**
      * The name of the source table being restored.
      */
    var SourceTableName: js.UndefOr[String] = js.undefined
    /**
      * A value that describes the current state of the table restore request. Valid Values: SUCCEEDED, FAILED, CANCELED, PENDING, IN_PROGRESS 
      */
    var Status: js.UndefOr[TableRestoreStatusType] = js.undefined
    /**
      * The unique identifier for the table restore request.
      */
    var TableRestoreRequestId: js.UndefOr[String] = js.undefined
    /**
      * The name of the database to restore the table to.
      */
    var TargetDatabaseName: js.UndefOr[String] = js.undefined
    /**
      * The name of the schema to restore the table to.
      */
    var TargetSchemaName: js.UndefOr[String] = js.undefined
    /**
      * The total amount of data to restore to the new table, in megabytes (MB).
      */
    var TotalDataInMegaBytes: js.UndefOr[LongOptional] = js.undefined
  }
  
  trait TableRestoreStatusMessage extends js.Object {
    /**
      * A pagination token that can be used in a subsequent DescribeTableRestoreStatus request.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * A list of status details for one or more table restore requests.
      */
    var TableRestoreStatusDetails: js.UndefOr[TableRestoreStatusList] = js.undefined
  }
  
  trait Tag extends js.Object {
    /**
      * The key, or name, for the resource tag.
      */
    var Key: js.UndefOr[String] = js.undefined
    /**
      * The value for the resource tag.
      */
    var Value: js.UndefOr[String] = js.undefined
  }
  
  trait TaggedResource extends js.Object {
    /**
      * The Amazon Resource Name (ARN) with which the tag is associated, for example: arn:aws:redshift:us-east-1:123456789:cluster:t1.
      */
    var ResourceName: js.UndefOr[String] = js.undefined
    /**
      * The type of resource with which the tag is associated. Valid resource types are:    Cluster   CIDR/IP   EC2 security group   Snapshot   Cluster security group   Subnet group   HSM connection   HSM certificate   Parameter group   For more information about Amazon Redshift resource types and constructing ARNs, go to Constructing an Amazon Redshift Amazon Resource Name (ARN) in the Amazon Redshift Cluster Management Guide. 
      */
    var ResourceType: js.UndefOr[String] = js.undefined
    /**
      * The tag for the resource.
      */
    var Tag: js.UndefOr[Tag] = js.undefined
  }
  
  trait TaggedResourceListMessage extends js.Object {
    /**
      * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * A list of tags with their associated resources.
      */
    var TaggedResources: js.UndefOr[TaggedResourceList] = js.undefined
  }
  
  trait TrackListMessage extends js.Object {
    /**
      * A list of maintenance tracks output by the DescribeClusterTracks operation. 
      */
    var MaintenanceTracks: js.UndefOr[TrackList] = js.undefined
    /**
      * The starting point to return a set of response tracklist records. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request.
      */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Exchanges a DC1 Reserved Node for a DC2 Reserved Node with no changes to the configuration (term, payment type, or number of nodes) and no additional costs. 
      */
    def acceptReservedNodeExchange(): awsDashSdkLib.libRequestMod.Request[AcceptReservedNodeExchangeOutputMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def acceptReservedNodeExchange(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AcceptReservedNodeExchangeOutputMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AcceptReservedNodeExchangeOutputMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Exchanges a DC1 Reserved Node for a DC2 Reserved Node with no changes to the configuration (term, payment type, or number of nodes) and no additional costs. 
      */
    def acceptReservedNodeExchange(params: AcceptReservedNodeExchangeInputMessage): awsDashSdkLib.libRequestMod.Request[AcceptReservedNodeExchangeOutputMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def acceptReservedNodeExchange(
      params: AcceptReservedNodeExchangeInputMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AcceptReservedNodeExchangeOutputMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AcceptReservedNodeExchangeOutputMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds an inbound (ingress) rule to an Amazon Redshift security group. Depending on whether the application accessing your cluster is running on the Internet or an Amazon EC2 instance, you can authorize inbound access to either a Classless Interdomain Routing (CIDR)/Internet Protocol (IP) range or to an Amazon EC2 security group. You can add as many as 20 ingress rules to an Amazon Redshift security group. If you authorize access to an Amazon EC2 security group, specify EC2SecurityGroupName and EC2SecurityGroupOwnerId. The Amazon EC2 security group and Amazon Redshift cluster must be in the same AWS Region.  If you authorize access to a CIDR/IP address range, specify CIDRIP. For an overview of CIDR blocks, see the Wikipedia article on Classless Inter-Domain Routing.  You must also associate the security group with a cluster so that clients running on these IP addresses or the EC2 instance are authorized to connect to the cluster. For information about managing security groups, go to Working with Security Groups in the Amazon Redshift Cluster Management Guide.
      */
    def authorizeClusterSecurityGroupIngress(): awsDashSdkLib.libRequestMod.Request[AuthorizeClusterSecurityGroupIngressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def authorizeClusterSecurityGroupIngress(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AuthorizeClusterSecurityGroupIngressResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AuthorizeClusterSecurityGroupIngressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds an inbound (ingress) rule to an Amazon Redshift security group. Depending on whether the application accessing your cluster is running on the Internet or an Amazon EC2 instance, you can authorize inbound access to either a Classless Interdomain Routing (CIDR)/Internet Protocol (IP) range or to an Amazon EC2 security group. You can add as many as 20 ingress rules to an Amazon Redshift security group. If you authorize access to an Amazon EC2 security group, specify EC2SecurityGroupName and EC2SecurityGroupOwnerId. The Amazon EC2 security group and Amazon Redshift cluster must be in the same AWS Region.  If you authorize access to a CIDR/IP address range, specify CIDRIP. For an overview of CIDR blocks, see the Wikipedia article on Classless Inter-Domain Routing.  You must also associate the security group with a cluster so that clients running on these IP addresses or the EC2 instance are authorized to connect to the cluster. For information about managing security groups, go to Working with Security Groups in the Amazon Redshift Cluster Management Guide.
      */
    def authorizeClusterSecurityGroupIngress(params: AuthorizeClusterSecurityGroupIngressMessage): awsDashSdkLib.libRequestMod.Request[AuthorizeClusterSecurityGroupIngressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def authorizeClusterSecurityGroupIngress(
      params: AuthorizeClusterSecurityGroupIngressMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AuthorizeClusterSecurityGroupIngressResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AuthorizeClusterSecurityGroupIngressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Authorizes the specified AWS customer account to restore the specified snapshot.  For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
      */
    def authorizeSnapshotAccess(): awsDashSdkLib.libRequestMod.Request[AuthorizeSnapshotAccessResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def authorizeSnapshotAccess(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AuthorizeSnapshotAccessResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AuthorizeSnapshotAccessResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Authorizes the specified AWS customer account to restore the specified snapshot.  For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
      */
    def authorizeSnapshotAccess(params: AuthorizeSnapshotAccessMessage): awsDashSdkLib.libRequestMod.Request[AuthorizeSnapshotAccessResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def authorizeSnapshotAccess(
      params: AuthorizeSnapshotAccessMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AuthorizeSnapshotAccessResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AuthorizeSnapshotAccessResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a set of cluster snapshots.
      */
    def batchDeleteClusterSnapshots(): awsDashSdkLib.libRequestMod.Request[BatchDeleteClusterSnapshotsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchDeleteClusterSnapshots(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchDeleteClusterSnapshotsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchDeleteClusterSnapshotsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a set of cluster snapshots.
      */
    def batchDeleteClusterSnapshots(params: BatchDeleteClusterSnapshotsRequest): awsDashSdkLib.libRequestMod.Request[BatchDeleteClusterSnapshotsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchDeleteClusterSnapshots(
      params: BatchDeleteClusterSnapshotsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchDeleteClusterSnapshotsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchDeleteClusterSnapshotsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the settings for a list of snapshots.
      */
    def batchModifyClusterSnapshots(): awsDashSdkLib.libRequestMod.Request[BatchModifyClusterSnapshotsOutputMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchModifyClusterSnapshots(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchModifyClusterSnapshotsOutputMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchModifyClusterSnapshotsOutputMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the settings for a list of snapshots.
      */
    def batchModifyClusterSnapshots(params: BatchModifyClusterSnapshotsMessage): awsDashSdkLib.libRequestMod.Request[BatchModifyClusterSnapshotsOutputMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchModifyClusterSnapshots(
      params: BatchModifyClusterSnapshotsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchModifyClusterSnapshotsOutputMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchModifyClusterSnapshotsOutputMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Cancels a resize operation.
      */
    def cancelResize(): awsDashSdkLib.libRequestMod.Request[ResizeProgressMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def cancelResize(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ResizeProgressMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ResizeProgressMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Cancels a resize operation.
      */
    def cancelResize(params: CancelResizeMessage): awsDashSdkLib.libRequestMod.Request[ResizeProgressMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def cancelResize(
      params: CancelResizeMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ResizeProgressMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ResizeProgressMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Copies the specified automated cluster snapshot to a new manual cluster snapshot. The source must be an automated snapshot and it must be in the available state. When you delete a cluster, Amazon Redshift deletes any automated snapshots of the cluster. Also, when the retention period of the snapshot expires, Amazon Redshift automatically deletes it. If you want to keep an automated snapshot for a longer period, you can make a manual copy of the snapshot. Manual snapshots are retained until you delete them.  For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
      */
    def copyClusterSnapshot(): awsDashSdkLib.libRequestMod.Request[CopyClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def copyClusterSnapshot(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CopyClusterSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CopyClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Copies the specified automated cluster snapshot to a new manual cluster snapshot. The source must be an automated snapshot and it must be in the available state. When you delete a cluster, Amazon Redshift deletes any automated snapshots of the cluster. Also, when the retention period of the snapshot expires, Amazon Redshift automatically deletes it. If you want to keep an automated snapshot for a longer period, you can make a manual copy of the snapshot. Manual snapshots are retained until you delete them.  For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
      */
    def copyClusterSnapshot(params: CopyClusterSnapshotMessage): awsDashSdkLib.libRequestMod.Request[CopyClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def copyClusterSnapshot(
      params: CopyClusterSnapshotMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CopyClusterSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CopyClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new cluster. To create a cluster in Virtual Private Cloud (VPC), you must provide a cluster subnet group name. The cluster subnet group identifies the subnets of your VPC that Amazon Redshift uses when creating the cluster. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide.
      */
    def createCluster(): awsDashSdkLib.libRequestMod.Request[CreateClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createCluster(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new cluster. To create a cluster in Virtual Private Cloud (VPC), you must provide a cluster subnet group name. The cluster subnet group identifies the subnets of your VPC that Amazon Redshift uses when creating the cluster. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide.
      */
    def createCluster(params: CreateClusterMessage): awsDashSdkLib.libRequestMod.Request[CreateClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createCluster(
      params: CreateClusterMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an Amazon Redshift parameter group. Creating parameter groups is independent of creating clusters. You can associate a cluster with a parameter group when you create the cluster. You can also associate an existing cluster with a parameter group after the cluster is created by using ModifyCluster.  Parameters in the parameter group define specific behavior that applies to the databases you create on the cluster. For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
      */
    def createClusterParameterGroup(): awsDashSdkLib.libRequestMod.Request[CreateClusterParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createClusterParameterGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateClusterParameterGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateClusterParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an Amazon Redshift parameter group. Creating parameter groups is independent of creating clusters. You can associate a cluster with a parameter group when you create the cluster. You can also associate an existing cluster with a parameter group after the cluster is created by using ModifyCluster.  Parameters in the parameter group define specific behavior that applies to the databases you create on the cluster. For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
      */
    def createClusterParameterGroup(params: CreateClusterParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[CreateClusterParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createClusterParameterGroup(
      params: CreateClusterParameterGroupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateClusterParameterGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateClusterParameterGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new Amazon Redshift security group. You use security groups to control access to non-VPC clusters.  For information about managing security groups, go to Amazon Redshift Cluster Security Groups in the Amazon Redshift Cluster Management Guide.
      */
    def createClusterSecurityGroup(): awsDashSdkLib.libRequestMod.Request[CreateClusterSecurityGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createClusterSecurityGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateClusterSecurityGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateClusterSecurityGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new Amazon Redshift security group. You use security groups to control access to non-VPC clusters.  For information about managing security groups, go to Amazon Redshift Cluster Security Groups in the Amazon Redshift Cluster Management Guide.
      */
    def createClusterSecurityGroup(params: CreateClusterSecurityGroupMessage): awsDashSdkLib.libRequestMod.Request[CreateClusterSecurityGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createClusterSecurityGroup(
      params: CreateClusterSecurityGroupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateClusterSecurityGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateClusterSecurityGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a manual snapshot of the specified cluster. The cluster must be in the available state.   For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
      */
    def createClusterSnapshot(): awsDashSdkLib.libRequestMod.Request[CreateClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createClusterSnapshot(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateClusterSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a manual snapshot of the specified cluster. The cluster must be in the available state.   For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
      */
    def createClusterSnapshot(params: CreateClusterSnapshotMessage): awsDashSdkLib.libRequestMod.Request[CreateClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createClusterSnapshot(
      params: CreateClusterSnapshotMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateClusterSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new Amazon Redshift subnet group. You must provide a list of one or more subnets in your existing Amazon Virtual Private Cloud (Amazon VPC) when creating Amazon Redshift subnet group.  For information about subnet groups, go to Amazon Redshift Cluster Subnet Groups in the Amazon Redshift Cluster Management Guide.
      */
    def createClusterSubnetGroup(): awsDashSdkLib.libRequestMod.Request[CreateClusterSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createClusterSubnetGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateClusterSubnetGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateClusterSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new Amazon Redshift subnet group. You must provide a list of one or more subnets in your existing Amazon Virtual Private Cloud (Amazon VPC) when creating Amazon Redshift subnet group.  For information about subnet groups, go to Amazon Redshift Cluster Subnet Groups in the Amazon Redshift Cluster Management Guide.
      */
    def createClusterSubnetGroup(params: CreateClusterSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[CreateClusterSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createClusterSubnetGroup(
      params: CreateClusterSubnetGroupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateClusterSubnetGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateClusterSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an Amazon Redshift event notification subscription. This action requires an ARN (Amazon Resource Name) of an Amazon SNS topic created by either the Amazon Redshift console, the Amazon SNS console, or the Amazon SNS API. To obtain an ARN with Amazon SNS, you must create a topic in Amazon SNS and subscribe to the topic. The ARN is displayed in the SNS console. You can specify the source type, and lists of Amazon Redshift source IDs, event categories, and event severities. Notifications will be sent for all events you want that match those criteria. For example, you can specify source type = cluster, source ID = my-cluster-1 and mycluster2, event categories = Availability, Backup, and severity = ERROR. The subscription will only send notifications for those ERROR events in the Availability and Backup categories for the specified clusters. If you specify both the source type and source IDs, such as source type = cluster and source identifier = my-cluster-1, notifications will be sent for all the cluster events for my-cluster-1. If you specify a source type but do not specify a source identifier, you will receive notice of the events for the objects of that type in your AWS account. If you do not specify either the SourceType nor the SourceIdentifier, you will be notified of events generated from all Amazon Redshift sources belonging to your AWS account. You must specify a source type if you specify a source ID.
      */
    def createEventSubscription(): awsDashSdkLib.libRequestMod.Request[CreateEventSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createEventSubscription(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateEventSubscriptionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateEventSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an Amazon Redshift event notification subscription. This action requires an ARN (Amazon Resource Name) of an Amazon SNS topic created by either the Amazon Redshift console, the Amazon SNS console, or the Amazon SNS API. To obtain an ARN with Amazon SNS, you must create a topic in Amazon SNS and subscribe to the topic. The ARN is displayed in the SNS console. You can specify the source type, and lists of Amazon Redshift source IDs, event categories, and event severities. Notifications will be sent for all events you want that match those criteria. For example, you can specify source type = cluster, source ID = my-cluster-1 and mycluster2, event categories = Availability, Backup, and severity = ERROR. The subscription will only send notifications for those ERROR events in the Availability and Backup categories for the specified clusters. If you specify both the source type and source IDs, such as source type = cluster and source identifier = my-cluster-1, notifications will be sent for all the cluster events for my-cluster-1. If you specify a source type but do not specify a source identifier, you will receive notice of the events for the objects of that type in your AWS account. If you do not specify either the SourceType nor the SourceIdentifier, you will be notified of events generated from all Amazon Redshift sources belonging to your AWS account. You must specify a source type if you specify a source ID.
      */
    def createEventSubscription(params: CreateEventSubscriptionMessage): awsDashSdkLib.libRequestMod.Request[CreateEventSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createEventSubscription(
      params: CreateEventSubscriptionMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateEventSubscriptionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateEventSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an HSM client certificate that an Amazon Redshift cluster will use to connect to the client's HSM in order to store and retrieve the keys used to encrypt the cluster databases. The command returns a public key, which you must store in the HSM. In addition to creating the HSM certificate, you must create an Amazon Redshift HSM configuration that provides a cluster the information needed to store and use encryption keys in the HSM. For more information, go to Hardware Security Modules in the Amazon Redshift Cluster Management Guide.
      */
    def createHsmClientCertificate(): awsDashSdkLib.libRequestMod.Request[CreateHsmClientCertificateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createHsmClientCertificate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateHsmClientCertificateResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateHsmClientCertificateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an HSM client certificate that an Amazon Redshift cluster will use to connect to the client's HSM in order to store and retrieve the keys used to encrypt the cluster databases. The command returns a public key, which you must store in the HSM. In addition to creating the HSM certificate, you must create an Amazon Redshift HSM configuration that provides a cluster the information needed to store and use encryption keys in the HSM. For more information, go to Hardware Security Modules in the Amazon Redshift Cluster Management Guide.
      */
    def createHsmClientCertificate(params: CreateHsmClientCertificateMessage): awsDashSdkLib.libRequestMod.Request[CreateHsmClientCertificateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createHsmClientCertificate(
      params: CreateHsmClientCertificateMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateHsmClientCertificateResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateHsmClientCertificateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an HSM configuration that contains the information required by an Amazon Redshift cluster to store and use database encryption keys in a Hardware Security Module (HSM). After creating the HSM configuration, you can specify it as a parameter when creating a cluster. The cluster will then store its encryption keys in the HSM. In addition to creating an HSM configuration, you must also create an HSM client certificate. For more information, go to Hardware Security Modules in the Amazon Redshift Cluster Management Guide.
      */
    def createHsmConfiguration(): awsDashSdkLib.libRequestMod.Request[CreateHsmConfigurationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createHsmConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateHsmConfigurationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateHsmConfigurationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an HSM configuration that contains the information required by an Amazon Redshift cluster to store and use database encryption keys in a Hardware Security Module (HSM). After creating the HSM configuration, you can specify it as a parameter when creating a cluster. The cluster will then store its encryption keys in the HSM. In addition to creating an HSM configuration, you must also create an HSM client certificate. For more information, go to Hardware Security Modules in the Amazon Redshift Cluster Management Guide.
      */
    def createHsmConfiguration(params: CreateHsmConfigurationMessage): awsDashSdkLib.libRequestMod.Request[CreateHsmConfigurationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createHsmConfiguration(
      params: CreateHsmConfigurationMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateHsmConfigurationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateHsmConfigurationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a snapshot copy grant that permits Amazon Redshift to use a customer master key (CMK) from AWS Key Management Service (AWS KMS) to encrypt copied snapshots in a destination region.  For more information about managing snapshot copy grants, go to Amazon Redshift Database Encryption in the Amazon Redshift Cluster Management Guide. 
      */
    def createSnapshotCopyGrant(): awsDashSdkLib.libRequestMod.Request[CreateSnapshotCopyGrantResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createSnapshotCopyGrant(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSnapshotCopyGrantResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSnapshotCopyGrantResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a snapshot copy grant that permits Amazon Redshift to use a customer master key (CMK) from AWS Key Management Service (AWS KMS) to encrypt copied snapshots in a destination region.  For more information about managing snapshot copy grants, go to Amazon Redshift Database Encryption in the Amazon Redshift Cluster Management Guide. 
      */
    def createSnapshotCopyGrant(params: CreateSnapshotCopyGrantMessage): awsDashSdkLib.libRequestMod.Request[CreateSnapshotCopyGrantResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createSnapshotCopyGrant(
      params: CreateSnapshotCopyGrantMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSnapshotCopyGrantResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSnapshotCopyGrantResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new snapshot schedule.
      */
    def createSnapshotSchedule(): awsDashSdkLib.libRequestMod.Request[SnapshotSchedule, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createSnapshotSchedule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SnapshotSchedule, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SnapshotSchedule, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new snapshot schedule.
      */
    def createSnapshotSchedule(params: CreateSnapshotScheduleMessage): awsDashSdkLib.libRequestMod.Request[SnapshotSchedule, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createSnapshotSchedule(
      params: CreateSnapshotScheduleMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SnapshotSchedule, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SnapshotSchedule, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds one or more tags to a specified resource. A resource can have up to 50 tags. If you try to create more than 50 tags for a resource, you will receive an error and the attempt will fail. If you specify a key that already exists for the resource, the value for that key will be updated with the new value.
      */
    def createTags(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createTags(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds one or more tags to a specified resource. A resource can have up to 50 tags. If you try to create more than 50 tags for a resource, you will receive an error and the attempt will fail. If you specify a key that already exists for the resource, the value for that key will be updated with the new value.
      */
    def createTags(params: CreateTagsMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createTags(
      params: CreateTagsMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a previously provisioned cluster. A successful response from the web service indicates that the request was received correctly. Use DescribeClusters to monitor the status of the deletion. The delete operation cannot be canceled or reverted once submitted. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide. If you want to shut down the cluster and retain it for future use, set SkipFinalClusterSnapshot to false and specify a name for FinalClusterSnapshotIdentifier. You can later restore this snapshot to resume using the cluster. If a final cluster snapshot is requested, the status of the cluster will be "final-snapshot" while the snapshot is being taken, then it's "deleting" once Amazon Redshift begins deleting the cluster.   For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide.
      */
    def deleteCluster(): awsDashSdkLib.libRequestMod.Request[DeleteClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteCluster(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a previously provisioned cluster. A successful response from the web service indicates that the request was received correctly. Use DescribeClusters to monitor the status of the deletion. The delete operation cannot be canceled or reverted once submitted. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide. If you want to shut down the cluster and retain it for future use, set SkipFinalClusterSnapshot to false and specify a name for FinalClusterSnapshotIdentifier. You can later restore this snapshot to resume using the cluster. If a final cluster snapshot is requested, the status of the cluster will be "final-snapshot" while the snapshot is being taken, then it's "deleting" once Amazon Redshift begins deleting the cluster.   For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide.
      */
    def deleteCluster(params: DeleteClusterMessage): awsDashSdkLib.libRequestMod.Request[DeleteClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteCluster(
      params: DeleteClusterMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a specified Amazon Redshift parameter group.  You cannot delete a parameter group if it is associated with a cluster. 
      */
    def deleteClusterParameterGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteClusterParameterGroup(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a specified Amazon Redshift parameter group.  You cannot delete a parameter group if it is associated with a cluster. 
      */
    def deleteClusterParameterGroup(params: DeleteClusterParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteClusterParameterGroup(
      params: DeleteClusterParameterGroupMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an Amazon Redshift security group.  You cannot delete a security group that is associated with any clusters. You cannot delete the default security group.   For information about managing security groups, go to Amazon Redshift Cluster Security Groups in the Amazon Redshift Cluster Management Guide.
      */
    def deleteClusterSecurityGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteClusterSecurityGroup(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an Amazon Redshift security group.  You cannot delete a security group that is associated with any clusters. You cannot delete the default security group.   For information about managing security groups, go to Amazon Redshift Cluster Security Groups in the Amazon Redshift Cluster Management Guide.
      */
    def deleteClusterSecurityGroup(params: DeleteClusterSecurityGroupMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteClusterSecurityGroup(
      params: DeleteClusterSecurityGroupMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified manual snapshot. The snapshot must be in the available state, with no other users authorized to access the snapshot.  Unlike automated snapshots, manual snapshots are retained even after you delete your cluster. Amazon Redshift does not delete your manual snapshots. You must delete manual snapshot explicitly to avoid getting charged. If other accounts are authorized to access the snapshot, you must revoke all of the authorizations before you can delete the snapshot.
      */
    def deleteClusterSnapshot(): awsDashSdkLib.libRequestMod.Request[DeleteClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteClusterSnapshot(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteClusterSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified manual snapshot. The snapshot must be in the available state, with no other users authorized to access the snapshot.  Unlike automated snapshots, manual snapshots are retained even after you delete your cluster. Amazon Redshift does not delete your manual snapshots. You must delete manual snapshot explicitly to avoid getting charged. If other accounts are authorized to access the snapshot, you must revoke all of the authorizations before you can delete the snapshot.
      */
    def deleteClusterSnapshot(params: DeleteClusterSnapshotMessage): awsDashSdkLib.libRequestMod.Request[DeleteClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteClusterSnapshot(
      params: DeleteClusterSnapshotMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteClusterSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified cluster subnet group.
      */
    def deleteClusterSubnetGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteClusterSubnetGroup(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified cluster subnet group.
      */
    def deleteClusterSubnetGroup(params: DeleteClusterSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteClusterSubnetGroup(
      params: DeleteClusterSubnetGroupMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an Amazon Redshift event notification subscription.
      */
    def deleteEventSubscription(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteEventSubscription(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an Amazon Redshift event notification subscription.
      */
    def deleteEventSubscription(params: DeleteEventSubscriptionMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteEventSubscription(
      params: DeleteEventSubscriptionMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified HSM client certificate.
      */
    def deleteHsmClientCertificate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteHsmClientCertificate(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified HSM client certificate.
      */
    def deleteHsmClientCertificate(params: DeleteHsmClientCertificateMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteHsmClientCertificate(
      params: DeleteHsmClientCertificateMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified Amazon Redshift HSM configuration.
      */
    def deleteHsmConfiguration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteHsmConfiguration(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified Amazon Redshift HSM configuration.
      */
    def deleteHsmConfiguration(params: DeleteHsmConfigurationMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteHsmConfiguration(
      params: DeleteHsmConfigurationMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified snapshot copy grant.
      */
    def deleteSnapshotCopyGrant(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSnapshotCopyGrant(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified snapshot copy grant.
      */
    def deleteSnapshotCopyGrant(params: DeleteSnapshotCopyGrantMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSnapshotCopyGrant(
      params: DeleteSnapshotCopyGrantMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a snapshot schedule.
      */
    def deleteSnapshotSchedule(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSnapshotSchedule(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a snapshot schedule.
      */
    def deleteSnapshotSchedule(params: DeleteSnapshotScheduleMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSnapshotSchedule(
      params: DeleteSnapshotScheduleMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a tag or tags from a resource. You must provide the ARN of the resource from which you want to delete the tag or tags.
      */
    def deleteTags(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteTags(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a tag or tags from a resource. You must provide the ARN of the resource from which you want to delete the tag or tags.
      */
    def deleteTags(params: DeleteTagsMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteTags(
      params: DeleteTagsMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of attributes attached to an account
      */
    def describeAccountAttributes(): awsDashSdkLib.libRequestMod.Request[AccountAttributeList, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAccountAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AccountAttributeList, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AccountAttributeList, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of attributes attached to an account
      */
    def describeAccountAttributes(params: DescribeAccountAttributesMessage): awsDashSdkLib.libRequestMod.Request[AccountAttributeList, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAccountAttributes(
      params: DescribeAccountAttributesMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AccountAttributeList, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AccountAttributeList, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns an array of ClusterDbRevision objects.
      */
    def describeClusterDbRevisions(): awsDashSdkLib.libRequestMod.Request[ClusterDbRevisionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeClusterDbRevisions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ClusterDbRevisionsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ClusterDbRevisionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns an array of ClusterDbRevision objects.
      */
    def describeClusterDbRevisions(params: DescribeClusterDbRevisionsMessage): awsDashSdkLib.libRequestMod.Request[ClusterDbRevisionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeClusterDbRevisions(
      params: DescribeClusterDbRevisionsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ClusterDbRevisionsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ClusterDbRevisionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of Amazon Redshift parameter groups, including parameter groups you created and the default parameter group. For each parameter group, the response includes the parameter group name, description, and parameter group family name. You can optionally specify a name to retrieve the description of a specific parameter group.  For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all parameter groups that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all parameter groups that have any combination of those values are returned. If both tag keys and values are omitted from the request, parameter groups are returned regardless of whether they have tag keys or values associated with them.
      */
    def describeClusterParameterGroups(): awsDashSdkLib.libRequestMod.Request[ClusterParameterGroupsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeClusterParameterGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ClusterParameterGroupsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ClusterParameterGroupsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of Amazon Redshift parameter groups, including parameter groups you created and the default parameter group. For each parameter group, the response includes the parameter group name, description, and parameter group family name. You can optionally specify a name to retrieve the description of a specific parameter group.  For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all parameter groups that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all parameter groups that have any combination of those values are returned. If both tag keys and values are omitted from the request, parameter groups are returned regardless of whether they have tag keys or values associated with them.
      */
    def describeClusterParameterGroups(params: DescribeClusterParameterGroupsMessage): awsDashSdkLib.libRequestMod.Request[ClusterParameterGroupsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeClusterParameterGroups(
      params: DescribeClusterParameterGroupsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ClusterParameterGroupsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ClusterParameterGroupsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a detailed list of parameters contained within the specified Amazon Redshift parameter group. For each parameter the response includes information such as parameter name, description, data type, value, whether the parameter value is modifiable, and so on. You can specify source filter to retrieve parameters of only specific type. For example, to retrieve parameters that were modified by a user action such as from ModifyClusterParameterGroup, you can specify source equal to user.  For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
      */
    def describeClusterParameters(): awsDashSdkLib.libRequestMod.Request[ClusterParameterGroupDetails, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeClusterParameters(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ClusterParameterGroupDetails, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ClusterParameterGroupDetails, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a detailed list of parameters contained within the specified Amazon Redshift parameter group. For each parameter the response includes information such as parameter name, description, data type, value, whether the parameter value is modifiable, and so on. You can specify source filter to retrieve parameters of only specific type. For example, to retrieve parameters that were modified by a user action such as from ModifyClusterParameterGroup, you can specify source equal to user.  For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
      */
    def describeClusterParameters(params: DescribeClusterParametersMessage): awsDashSdkLib.libRequestMod.Request[ClusterParameterGroupDetails, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeClusterParameters(
      params: DescribeClusterParametersMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ClusterParameterGroupDetails, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ClusterParameterGroupDetails, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about Amazon Redshift security groups. If the name of a security group is specified, the response will contain only information about only that security group.  For information about managing security groups, go to Amazon Redshift Cluster Security Groups in the Amazon Redshift Cluster Management Guide. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all security groups that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all security groups that have any combination of those values are returned. If both tag keys and values are omitted from the request, security groups are returned regardless of whether they have tag keys or values associated with them.
      */
    def describeClusterSecurityGroups(): awsDashSdkLib.libRequestMod.Request[ClusterSecurityGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeClusterSecurityGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ClusterSecurityGroupMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ClusterSecurityGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about Amazon Redshift security groups. If the name of a security group is specified, the response will contain only information about only that security group.  For information about managing security groups, go to Amazon Redshift Cluster Security Groups in the Amazon Redshift Cluster Management Guide. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all security groups that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all security groups that have any combination of those values are returned. If both tag keys and values are omitted from the request, security groups are returned regardless of whether they have tag keys or values associated with them.
      */
    def describeClusterSecurityGroups(params: DescribeClusterSecurityGroupsMessage): awsDashSdkLib.libRequestMod.Request[ClusterSecurityGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeClusterSecurityGroups(
      params: DescribeClusterSecurityGroupsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ClusterSecurityGroupMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ClusterSecurityGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns one or more snapshot objects, which contain metadata about your cluster snapshots. By default, this operation returns information about all snapshots of all clusters that are owned by you AWS customer account. No information is returned for snapshots owned by inactive AWS customer accounts. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all snapshots that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all snapshots that have any combination of those values are returned. Only snapshots that you own are returned in the response; shared snapshots are not returned with the tag key and tag value request parameters. If both tag keys and values are omitted from the request, snapshots are returned regardless of whether they have tag keys or values associated with them.
      */
    def describeClusterSnapshots(): awsDashSdkLib.libRequestMod.Request[SnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeClusterSnapshots(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ SnapshotMessage, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[SnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns one or more snapshot objects, which contain metadata about your cluster snapshots. By default, this operation returns information about all snapshots of all clusters that are owned by you AWS customer account. No information is returned for snapshots owned by inactive AWS customer accounts. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all snapshots that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all snapshots that have any combination of those values are returned. Only snapshots that you own are returned in the response; shared snapshots are not returned with the tag key and tag value request parameters. If both tag keys and values are omitted from the request, snapshots are returned regardless of whether they have tag keys or values associated with them.
      */
    def describeClusterSnapshots(params: DescribeClusterSnapshotsMessage): awsDashSdkLib.libRequestMod.Request[SnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeClusterSnapshots(
      params: DescribeClusterSnapshotsMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ SnapshotMessage, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[SnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns one or more cluster subnet group objects, which contain metadata about your cluster subnet groups. By default, this operation returns information about all cluster subnet groups that are defined in you AWS account. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all subnet groups that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all subnet groups that have any combination of those values are returned. If both tag keys and values are omitted from the request, subnet groups are returned regardless of whether they have tag keys or values associated with them.
      */
    def describeClusterSubnetGroups(): awsDashSdkLib.libRequestMod.Request[ClusterSubnetGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeClusterSubnetGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ClusterSubnetGroupMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ClusterSubnetGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns one or more cluster subnet group objects, which contain metadata about your cluster subnet groups. By default, this operation returns information about all cluster subnet groups that are defined in you AWS account. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all subnet groups that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all subnet groups that have any combination of those values are returned. If both tag keys and values are omitted from the request, subnet groups are returned regardless of whether they have tag keys or values associated with them.
      */
    def describeClusterSubnetGroups(params: DescribeClusterSubnetGroupsMessage): awsDashSdkLib.libRequestMod.Request[ClusterSubnetGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeClusterSubnetGroups(
      params: DescribeClusterSubnetGroupsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ClusterSubnetGroupMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ClusterSubnetGroupMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of all the available maintenance tracks.
      */
    def describeClusterTracks(): awsDashSdkLib.libRequestMod.Request[TrackListMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeClusterTracks(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TrackListMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TrackListMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of all the available maintenance tracks.
      */
    def describeClusterTracks(params: DescribeClusterTracksMessage): awsDashSdkLib.libRequestMod.Request[TrackListMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeClusterTracks(
      params: DescribeClusterTracksMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TrackListMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TrackListMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns descriptions of the available Amazon Redshift cluster versions. You can call this operation even before creating any clusters to learn more about the Amazon Redshift versions. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide.
      */
    def describeClusterVersions(): awsDashSdkLib.libRequestMod.Request[ClusterVersionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeClusterVersions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ClusterVersionsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ClusterVersionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns descriptions of the available Amazon Redshift cluster versions. You can call this operation even before creating any clusters to learn more about the Amazon Redshift versions. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide.
      */
    def describeClusterVersions(params: DescribeClusterVersionsMessage): awsDashSdkLib.libRequestMod.Request[ClusterVersionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeClusterVersions(
      params: DescribeClusterVersionsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ClusterVersionsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ClusterVersionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns properties of provisioned clusters including general cluster properties, cluster database properties, maintenance and backup properties, and security and access properties. This operation supports pagination. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all clusters that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all clusters that have any combination of those values are returned. If both tag keys and values are omitted from the request, clusters are returned regardless of whether they have tag keys or values associated with them.
      */
    def describeClusters(): awsDashSdkLib.libRequestMod.Request[ClustersMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeClusters(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ClustersMessage, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ClustersMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns properties of provisioned clusters including general cluster properties, cluster database properties, maintenance and backup properties, and security and access properties. This operation supports pagination. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all clusters that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all clusters that have any combination of those values are returned. If both tag keys and values are omitted from the request, clusters are returned regardless of whether they have tag keys or values associated with them.
      */
    def describeClusters(params: DescribeClustersMessage): awsDashSdkLib.libRequestMod.Request[ClustersMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeClusters(
      params: DescribeClustersMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ClustersMessage, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ClustersMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of parameter settings for the specified parameter group family.  For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
      */
    def describeDefaultClusterParameters(): awsDashSdkLib.libRequestMod.Request[DescribeDefaultClusterParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDefaultClusterParameters(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDefaultClusterParametersResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDefaultClusterParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of parameter settings for the specified parameter group family.  For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
      */
    def describeDefaultClusterParameters(params: DescribeDefaultClusterParametersMessage): awsDashSdkLib.libRequestMod.Request[DescribeDefaultClusterParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDefaultClusterParameters(
      params: DescribeDefaultClusterParametersMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDefaultClusterParametersResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDefaultClusterParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Displays a list of event categories for all event source types, or for a specified source type. For a list of the event categories and source types, go to Amazon Redshift Event Notifications.
      */
    def describeEventCategories(): awsDashSdkLib.libRequestMod.Request[EventCategoriesMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEventCategories(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EventCategoriesMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EventCategoriesMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Displays a list of event categories for all event source types, or for a specified source type. For a list of the event categories and source types, go to Amazon Redshift Event Notifications.
      */
    def describeEventCategories(params: DescribeEventCategoriesMessage): awsDashSdkLib.libRequestMod.Request[EventCategoriesMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEventCategories(
      params: DescribeEventCategoriesMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EventCategoriesMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EventCategoriesMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists descriptions of all the Amazon Redshift event notification subscriptions for a customer account. If you specify a subscription name, lists the description for that subscription. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all event notification subscriptions that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all subscriptions that have any combination of those values are returned. If both tag keys and values are omitted from the request, subscriptions are returned regardless of whether they have tag keys or values associated with them.
      */
    def describeEventSubscriptions(): awsDashSdkLib.libRequestMod.Request[EventSubscriptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEventSubscriptions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EventSubscriptionsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EventSubscriptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists descriptions of all the Amazon Redshift event notification subscriptions for a customer account. If you specify a subscription name, lists the description for that subscription. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all event notification subscriptions that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all subscriptions that have any combination of those values are returned. If both tag keys and values are omitted from the request, subscriptions are returned regardless of whether they have tag keys or values associated with them.
      */
    def describeEventSubscriptions(params: DescribeEventSubscriptionsMessage): awsDashSdkLib.libRequestMod.Request[EventSubscriptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEventSubscriptions(
      params: DescribeEventSubscriptionsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EventSubscriptionsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EventSubscriptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns events related to clusters, security groups, snapshots, and parameter groups for the past 14 days. Events specific to a particular cluster, security group, snapshot or parameter group can be obtained by providing the name as a parameter. By default, the past hour of events are returned.
      */
    def describeEvents(): awsDashSdkLib.libRequestMod.Request[EventsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEvents(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ EventsMessage, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[EventsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns events related to clusters, security groups, snapshots, and parameter groups for the past 14 days. Events specific to a particular cluster, security group, snapshot or parameter group can be obtained by providing the name as a parameter. By default, the past hour of events are returned.
      */
    def describeEvents(params: DescribeEventsMessage): awsDashSdkLib.libRequestMod.Request[EventsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEvents(
      params: DescribeEventsMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ EventsMessage, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[EventsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the specified HSM client certificate. If no certificate ID is specified, returns information about all the HSM certificates owned by your AWS customer account. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all HSM client certificates that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all HSM client certificates that have any combination of those values are returned. If both tag keys and values are omitted from the request, HSM client certificates are returned regardless of whether they have tag keys or values associated with them.
      */
    def describeHsmClientCertificates(): awsDashSdkLib.libRequestMod.Request[HsmClientCertificateMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeHsmClientCertificates(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ HsmClientCertificateMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[HsmClientCertificateMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the specified HSM client certificate. If no certificate ID is specified, returns information about all the HSM certificates owned by your AWS customer account. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all HSM client certificates that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all HSM client certificates that have any combination of those values are returned. If both tag keys and values are omitted from the request, HSM client certificates are returned regardless of whether they have tag keys or values associated with them.
      */
    def describeHsmClientCertificates(params: DescribeHsmClientCertificatesMessage): awsDashSdkLib.libRequestMod.Request[HsmClientCertificateMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeHsmClientCertificates(
      params: DescribeHsmClientCertificatesMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ HsmClientCertificateMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[HsmClientCertificateMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the specified Amazon Redshift HSM configuration. If no configuration ID is specified, returns information about all the HSM configurations owned by your AWS customer account. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all HSM connections that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all HSM connections that have any combination of those values are returned. If both tag keys and values are omitted from the request, HSM connections are returned regardless of whether they have tag keys or values associated with them.
      */
    def describeHsmConfigurations(): awsDashSdkLib.libRequestMod.Request[HsmConfigurationMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeHsmConfigurations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ HsmConfigurationMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[HsmConfigurationMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the specified Amazon Redshift HSM configuration. If no configuration ID is specified, returns information about all the HSM configurations owned by your AWS customer account. If you specify both tag keys and tag values in the same request, Amazon Redshift returns all HSM connections that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all HSM connections that have any combination of those values are returned. If both tag keys and values are omitted from the request, HSM connections are returned regardless of whether they have tag keys or values associated with them.
      */
    def describeHsmConfigurations(params: DescribeHsmConfigurationsMessage): awsDashSdkLib.libRequestMod.Request[HsmConfigurationMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeHsmConfigurations(
      params: DescribeHsmConfigurationsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ HsmConfigurationMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[HsmConfigurationMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes whether information, such as queries and connection attempts, is being logged for the specified Amazon Redshift cluster.
      */
    def describeLoggingStatus(): awsDashSdkLib.libRequestMod.Request[LoggingStatus, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeLoggingStatus(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ LoggingStatus, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[LoggingStatus, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes whether information, such as queries and connection attempts, is being logged for the specified Amazon Redshift cluster.
      */
    def describeLoggingStatus(params: DescribeLoggingStatusMessage): awsDashSdkLib.libRequestMod.Request[LoggingStatus, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeLoggingStatus(
      params: DescribeLoggingStatusMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ LoggingStatus, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[LoggingStatus, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of orderable cluster options. Before you create a new cluster you can use this operation to find what options are available, such as the EC2 Availability Zones (AZ) in the specific AWS Region that you can specify, and the node types you can request. The node types differ by available storage, memory, CPU and price. With the cost involved you might want to obtain a list of cluster options in the specific region and specify values when creating a cluster. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide.
      */
    def describeOrderableClusterOptions(): awsDashSdkLib.libRequestMod.Request[OrderableClusterOptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeOrderableClusterOptions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ OrderableClusterOptionsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[OrderableClusterOptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of orderable cluster options. Before you create a new cluster you can use this operation to find what options are available, such as the EC2 Availability Zones (AZ) in the specific AWS Region that you can specify, and the node types you can request. The node types differ by available storage, memory, CPU and price. With the cost involved you might want to obtain a list of cluster options in the specific region and specify values when creating a cluster. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide.
      */
    def describeOrderableClusterOptions(params: DescribeOrderableClusterOptionsMessage): awsDashSdkLib.libRequestMod.Request[OrderableClusterOptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeOrderableClusterOptions(
      params: DescribeOrderableClusterOptionsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ OrderableClusterOptionsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[OrderableClusterOptionsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of the available reserved node offerings by Amazon Redshift with their descriptions including the node type, the fixed and recurring costs of reserving the node and duration the node will be reserved for you. These descriptions help you determine which reserve node offering you want to purchase. You then use the unique offering ID in you call to PurchaseReservedNodeOffering to reserve one or more nodes for your Amazon Redshift cluster.   For more information about reserved node offerings, go to Purchasing Reserved Nodes in the Amazon Redshift Cluster Management Guide.
      */
    def describeReservedNodeOfferings(): awsDashSdkLib.libRequestMod.Request[ReservedNodeOfferingsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeReservedNodeOfferings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ReservedNodeOfferingsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ReservedNodeOfferingsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of the available reserved node offerings by Amazon Redshift with their descriptions including the node type, the fixed and recurring costs of reserving the node and duration the node will be reserved for you. These descriptions help you determine which reserve node offering you want to purchase. You then use the unique offering ID in you call to PurchaseReservedNodeOffering to reserve one or more nodes for your Amazon Redshift cluster.   For more information about reserved node offerings, go to Purchasing Reserved Nodes in the Amazon Redshift Cluster Management Guide.
      */
    def describeReservedNodeOfferings(params: DescribeReservedNodeOfferingsMessage): awsDashSdkLib.libRequestMod.Request[ReservedNodeOfferingsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeReservedNodeOfferings(
      params: DescribeReservedNodeOfferingsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ReservedNodeOfferingsMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ReservedNodeOfferingsMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the descriptions of the reserved nodes.
      */
    def describeReservedNodes(): awsDashSdkLib.libRequestMod.Request[ReservedNodesMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeReservedNodes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ReservedNodesMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ReservedNodesMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the descriptions of the reserved nodes.
      */
    def describeReservedNodes(params: DescribeReservedNodesMessage): awsDashSdkLib.libRequestMod.Request[ReservedNodesMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeReservedNodes(
      params: DescribeReservedNodesMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ReservedNodesMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ReservedNodesMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the last resize operation for the specified cluster. If no resize operation has ever been initiated for the specified cluster, a HTTP 404 error is returned. If a resize operation was initiated and completed, the status of the resize remains as SUCCEEDED until the next resize.  A resize operation can be requested using ModifyCluster and specifying a different number or type of nodes for the cluster. 
      */
    def describeResize(): awsDashSdkLib.libRequestMod.Request[ResizeProgressMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeResize(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ResizeProgressMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ResizeProgressMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the last resize operation for the specified cluster. If no resize operation has ever been initiated for the specified cluster, a HTTP 404 error is returned. If a resize operation was initiated and completed, the status of the resize remains as SUCCEEDED until the next resize.  A resize operation can be requested using ModifyCluster and specifying a different number or type of nodes for the cluster. 
      */
    def describeResize(params: DescribeResizeMessage): awsDashSdkLib.libRequestMod.Request[ResizeProgressMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeResize(
      params: DescribeResizeMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ResizeProgressMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ResizeProgressMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of snapshot copy grants owned by the AWS account in the destination region.  For more information about managing snapshot copy grants, go to Amazon Redshift Database Encryption in the Amazon Redshift Cluster Management Guide. 
      */
    def describeSnapshotCopyGrants(): awsDashSdkLib.libRequestMod.Request[SnapshotCopyGrantMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeSnapshotCopyGrants(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SnapshotCopyGrantMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SnapshotCopyGrantMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of snapshot copy grants owned by the AWS account in the destination region.  For more information about managing snapshot copy grants, go to Amazon Redshift Database Encryption in the Amazon Redshift Cluster Management Guide. 
      */
    def describeSnapshotCopyGrants(params: DescribeSnapshotCopyGrantsMessage): awsDashSdkLib.libRequestMod.Request[SnapshotCopyGrantMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeSnapshotCopyGrants(
      params: DescribeSnapshotCopyGrantsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SnapshotCopyGrantMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SnapshotCopyGrantMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of snapshot schedules. 
      */
    def describeSnapshotSchedules(): awsDashSdkLib.libRequestMod.Request[DescribeSnapshotSchedulesOutputMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeSnapshotSchedules(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSnapshotSchedulesOutputMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSnapshotSchedulesOutputMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of snapshot schedules. 
      */
    def describeSnapshotSchedules(params: DescribeSnapshotSchedulesMessage): awsDashSdkLib.libRequestMod.Request[DescribeSnapshotSchedulesOutputMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeSnapshotSchedules(
      params: DescribeSnapshotSchedulesMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSnapshotSchedulesOutputMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSnapshotSchedulesOutputMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the total amount of snapshot usage and provisioned storage for a user in megabytes.
      */
    def describeStorage(): awsDashSdkLib.libRequestMod.Request[CustomerStorageMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStorage(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CustomerStorageMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CustomerStorageMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the status of one or more table restore requests made using the RestoreTableFromClusterSnapshot API action. If you don't specify a value for the TableRestoreRequestId parameter, then DescribeTableRestoreStatus returns the status of all table restore requests ordered by the date and time of the request in ascending order. Otherwise DescribeTableRestoreStatus returns the status of the table specified by TableRestoreRequestId.
      */
    def describeTableRestoreStatus(): awsDashSdkLib.libRequestMod.Request[TableRestoreStatusMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeTableRestoreStatus(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TableRestoreStatusMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TableRestoreStatusMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the status of one or more table restore requests made using the RestoreTableFromClusterSnapshot API action. If you don't specify a value for the TableRestoreRequestId parameter, then DescribeTableRestoreStatus returns the status of all table restore requests ordered by the date and time of the request in ascending order. Otherwise DescribeTableRestoreStatus returns the status of the table specified by TableRestoreRequestId.
      */
    def describeTableRestoreStatus(params: DescribeTableRestoreStatusMessage): awsDashSdkLib.libRequestMod.Request[TableRestoreStatusMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeTableRestoreStatus(
      params: DescribeTableRestoreStatusMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TableRestoreStatusMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TableRestoreStatusMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of tags. You can return tags from a specific resource by specifying an ARN, or you can return all tags for a given type of resource, such as clusters, snapshots, and so on. The following are limitations for DescribeTags:    You cannot specify an ARN and a resource-type value together in the same request.   You cannot use the MaxRecords and Marker parameters together with the ARN parameter.   The MaxRecords parameter can be a range from 10 to 50 results to return in a request.   If you specify both tag keys and tag values in the same request, Amazon Redshift returns all resources that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all resources that have any combination of those values are returned. If both tag keys and values are omitted from the request, resources are returned regardless of whether they have tag keys or values associated with them.
      */
    def describeTags(): awsDashSdkLib.libRequestMod.Request[TaggedResourceListMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeTags(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TaggedResourceListMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TaggedResourceListMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of tags. You can return tags from a specific resource by specifying an ARN, or you can return all tags for a given type of resource, such as clusters, snapshots, and so on. The following are limitations for DescribeTags:    You cannot specify an ARN and a resource-type value together in the same request.   You cannot use the MaxRecords and Marker parameters together with the ARN parameter.   The MaxRecords parameter can be a range from 10 to 50 results to return in a request.   If you specify both tag keys and tag values in the same request, Amazon Redshift returns all resources that match any combination of the specified keys and values. For example, if you have owner and environment for tag keys, and admin and test for tag values, all resources that have any combination of those values are returned. If both tag keys and values are omitted from the request, resources are returned regardless of whether they have tag keys or values associated with them.
      */
    def describeTags(params: DescribeTagsMessage): awsDashSdkLib.libRequestMod.Request[TaggedResourceListMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeTags(
      params: DescribeTagsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TaggedResourceListMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TaggedResourceListMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Stops logging information, such as queries and connection attempts, for the specified Amazon Redshift cluster.
      */
    def disableLogging(): awsDashSdkLib.libRequestMod.Request[LoggingStatus, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disableLogging(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ LoggingStatus, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[LoggingStatus, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Stops logging information, such as queries and connection attempts, for the specified Amazon Redshift cluster.
      */
    def disableLogging(params: DisableLoggingMessage): awsDashSdkLib.libRequestMod.Request[LoggingStatus, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disableLogging(
      params: DisableLoggingMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ LoggingStatus, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[LoggingStatus, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disables the automatic copying of snapshots from one region to another region for a specified cluster. If your cluster and its snapshots are encrypted using a customer master key (CMK) from AWS KMS, use DeleteSnapshotCopyGrant to delete the grant that grants Amazon Redshift permission to the CMK in the destination region. 
      */
    def disableSnapshotCopy(): awsDashSdkLib.libRequestMod.Request[DisableSnapshotCopyResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disableSnapshotCopy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisableSnapshotCopyResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisableSnapshotCopyResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disables the automatic copying of snapshots from one region to another region for a specified cluster. If your cluster and its snapshots are encrypted using a customer master key (CMK) from AWS KMS, use DeleteSnapshotCopyGrant to delete the grant that grants Amazon Redshift permission to the CMK in the destination region. 
      */
    def disableSnapshotCopy(params: DisableSnapshotCopyMessage): awsDashSdkLib.libRequestMod.Request[DisableSnapshotCopyResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disableSnapshotCopy(
      params: DisableSnapshotCopyMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisableSnapshotCopyResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisableSnapshotCopyResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts logging information, such as queries and connection attempts, for the specified Amazon Redshift cluster.
      */
    def enableLogging(): awsDashSdkLib.libRequestMod.Request[LoggingStatus, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def enableLogging(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ LoggingStatus, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[LoggingStatus, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts logging information, such as queries and connection attempts, for the specified Amazon Redshift cluster.
      */
    def enableLogging(params: EnableLoggingMessage): awsDashSdkLib.libRequestMod.Request[LoggingStatus, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def enableLogging(
      params: EnableLoggingMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ LoggingStatus, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[LoggingStatus, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enables the automatic copy of snapshots from one region to another region for a specified cluster.
      */
    def enableSnapshotCopy(): awsDashSdkLib.libRequestMod.Request[EnableSnapshotCopyResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def enableSnapshotCopy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EnableSnapshotCopyResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EnableSnapshotCopyResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enables the automatic copy of snapshots from one region to another region for a specified cluster.
      */
    def enableSnapshotCopy(params: EnableSnapshotCopyMessage): awsDashSdkLib.libRequestMod.Request[EnableSnapshotCopyResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def enableSnapshotCopy(
      params: EnableSnapshotCopyMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EnableSnapshotCopyResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EnableSnapshotCopyResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a database user name and temporary password with temporary authorization to log on to an Amazon Redshift database. The action returns the database user name prefixed with IAM: if AutoCreate is False or IAMA: if AutoCreate is True. You can optionally specify one or more database user groups that the user will join at log on. By default, the temporary credentials expire in 900 seconds. You can optionally specify a duration between 900 seconds (15 minutes) and 3600 seconds (60 minutes). For more information, see Using IAM Authentication to Generate Database User Credentials in the Amazon Redshift Cluster Management Guide. The AWS Identity and Access Management (IAM)user or role that executes GetClusterCredentials must have an IAM policy attached that allows access to all necessary actions and resources. For more information about permissions, see Resource Policies for GetClusterCredentials in the Amazon Redshift Cluster Management Guide. If the DbGroups parameter is specified, the IAM policy must allow the redshift:JoinGroup action with access to the listed dbgroups.  In addition, if the AutoCreate parameter is set to True, then the policy must include the redshift:CreateClusterUser privilege. If the DbName parameter is specified, the IAM policy must allow access to the resource dbname for the specified database name. 
      */
    def getClusterCredentials(): awsDashSdkLib.libRequestMod.Request[ClusterCredentials, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getClusterCredentials(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ClusterCredentials, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ClusterCredentials, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a database user name and temporary password with temporary authorization to log on to an Amazon Redshift database. The action returns the database user name prefixed with IAM: if AutoCreate is False or IAMA: if AutoCreate is True. You can optionally specify one or more database user groups that the user will join at log on. By default, the temporary credentials expire in 900 seconds. You can optionally specify a duration between 900 seconds (15 minutes) and 3600 seconds (60 minutes). For more information, see Using IAM Authentication to Generate Database User Credentials in the Amazon Redshift Cluster Management Guide. The AWS Identity and Access Management (IAM)user or role that executes GetClusterCredentials must have an IAM policy attached that allows access to all necessary actions and resources. For more information about permissions, see Resource Policies for GetClusterCredentials in the Amazon Redshift Cluster Management Guide. If the DbGroups parameter is specified, the IAM policy must allow the redshift:JoinGroup action with access to the listed dbgroups.  In addition, if the AutoCreate parameter is set to True, then the policy must include the redshift:CreateClusterUser privilege. If the DbName parameter is specified, the IAM policy must allow access to the resource dbname for the specified database name. 
      */
    def getClusterCredentials(params: GetClusterCredentialsMessage): awsDashSdkLib.libRequestMod.Request[ClusterCredentials, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getClusterCredentials(
      params: GetClusterCredentialsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ClusterCredentials, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ClusterCredentials, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns an array of DC2 ReservedNodeOfferings that matches the payment type, term, and usage price of the given DC1 reserved node.
      */
    def getReservedNodeExchangeOfferings(): awsDashSdkLib.libRequestMod.Request[GetReservedNodeExchangeOfferingsOutputMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getReservedNodeExchangeOfferings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetReservedNodeExchangeOfferingsOutputMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetReservedNodeExchangeOfferingsOutputMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns an array of DC2 ReservedNodeOfferings that matches the payment type, term, and usage price of the given DC1 reserved node.
      */
    def getReservedNodeExchangeOfferings(params: GetReservedNodeExchangeOfferingsInputMessage): awsDashSdkLib.libRequestMod.Request[GetReservedNodeExchangeOfferingsOutputMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getReservedNodeExchangeOfferings(
      params: GetReservedNodeExchangeOfferingsInputMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetReservedNodeExchangeOfferingsOutputMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetReservedNodeExchangeOfferingsOutputMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the settings for a cluster. For example, you can add another security or parameter group, update the preferred maintenance window, or change the master user password. Resetting a cluster password or modifying the security groups associated with a cluster do not need a reboot. However, modifying a parameter group requires a reboot for parameters to take effect. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide. You can also change node type and the number of nodes to scale up or down the cluster. When resizing a cluster, you must specify both the number of nodes and the node type even if one of the parameters does not change.
      */
    def modifyCluster(): awsDashSdkLib.libRequestMod.Request[ModifyClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyCluster(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the settings for a cluster. For example, you can add another security or parameter group, update the preferred maintenance window, or change the master user password. Resetting a cluster password or modifying the security groups associated with a cluster do not need a reboot. However, modifying a parameter group requires a reboot for parameters to take effect. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide. You can also change node type and the number of nodes to scale up or down the cluster. When resizing a cluster, you must specify both the number of nodes and the node type even if one of the parameters does not change.
      */
    def modifyCluster(params: ModifyClusterMessage): awsDashSdkLib.libRequestMod.Request[ModifyClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyCluster(
      params: ModifyClusterMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the database revision of a cluster. The database revision is a unique revision of the database running in a cluster.
      */
    def modifyClusterDbRevision(): awsDashSdkLib.libRequestMod.Request[ModifyClusterDbRevisionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyClusterDbRevision(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyClusterDbRevisionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyClusterDbRevisionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the database revision of a cluster. The database revision is a unique revision of the database running in a cluster.
      */
    def modifyClusterDbRevision(params: ModifyClusterDbRevisionMessage): awsDashSdkLib.libRequestMod.Request[ModifyClusterDbRevisionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyClusterDbRevision(
      params: ModifyClusterDbRevisionMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyClusterDbRevisionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyClusterDbRevisionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other AWS services. A cluster can have up to 10 IAM roles associated at any time.
      */
    def modifyClusterIamRoles(): awsDashSdkLib.libRequestMod.Request[ModifyClusterIamRolesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyClusterIamRoles(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyClusterIamRolesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyClusterIamRolesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other AWS services. A cluster can have up to 10 IAM roles associated at any time.
      */
    def modifyClusterIamRoles(params: ModifyClusterIamRolesMessage): awsDashSdkLib.libRequestMod.Request[ModifyClusterIamRolesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyClusterIamRoles(
      params: ModifyClusterIamRolesMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyClusterIamRolesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyClusterIamRolesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the maintenance settings of a cluster. For example, you can defer a maintenance window. You can also update or cancel a deferment. 
      */
    def modifyClusterMaintenance(): awsDashSdkLib.libRequestMod.Request[ModifyClusterMaintenanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyClusterMaintenance(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyClusterMaintenanceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyClusterMaintenanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the maintenance settings of a cluster. For example, you can defer a maintenance window. You can also update or cancel a deferment. 
      */
    def modifyClusterMaintenance(params: ModifyClusterMaintenanceMessage): awsDashSdkLib.libRequestMod.Request[ModifyClusterMaintenanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyClusterMaintenance(
      params: ModifyClusterMaintenanceMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyClusterMaintenanceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyClusterMaintenanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the parameters of a parameter group.  For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
      */
    def modifyClusterParameterGroup(): awsDashSdkLib.libRequestMod.Request[ClusterParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyClusterParameterGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ClusterParameterGroupNameMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ClusterParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the parameters of a parameter group.  For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
      */
    def modifyClusterParameterGroup(params: ModifyClusterParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[ClusterParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyClusterParameterGroup(
      params: ModifyClusterParameterGroupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ClusterParameterGroupNameMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ClusterParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the settings for a snapshot.
      */
    def modifyClusterSnapshot(): awsDashSdkLib.libRequestMod.Request[ModifyClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyClusterSnapshot(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyClusterSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the settings for a snapshot.
      */
    def modifyClusterSnapshot(params: ModifyClusterSnapshotMessage): awsDashSdkLib.libRequestMod.Request[ModifyClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyClusterSnapshot(
      params: ModifyClusterSnapshotMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyClusterSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies a snapshot schedule for a cluster.
      */
    def modifyClusterSnapshotSchedule(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyClusterSnapshotSchedule(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies a snapshot schedule for a cluster.
      */
    def modifyClusterSnapshotSchedule(params: ModifyClusterSnapshotScheduleMessage): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyClusterSnapshotSchedule(
      params: ModifyClusterSnapshotScheduleMessage,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies a cluster subnet group to include the specified list of VPC subnets. The operation replaces the existing list of subnets with the new list of subnets.
      */
    def modifyClusterSubnetGroup(): awsDashSdkLib.libRequestMod.Request[ModifyClusterSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyClusterSubnetGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyClusterSubnetGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyClusterSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies a cluster subnet group to include the specified list of VPC subnets. The operation replaces the existing list of subnets with the new list of subnets.
      */
    def modifyClusterSubnetGroup(params: ModifyClusterSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[ModifyClusterSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyClusterSubnetGroup(
      params: ModifyClusterSubnetGroupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyClusterSubnetGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyClusterSubnetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies an existing Amazon Redshift event notification subscription.
      */
    def modifyEventSubscription(): awsDashSdkLib.libRequestMod.Request[ModifyEventSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyEventSubscription(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyEventSubscriptionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyEventSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies an existing Amazon Redshift event notification subscription.
      */
    def modifyEventSubscription(params: ModifyEventSubscriptionMessage): awsDashSdkLib.libRequestMod.Request[ModifyEventSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyEventSubscription(
      params: ModifyEventSubscriptionMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyEventSubscriptionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyEventSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the number of days to retain snapshots in the destination AWS Region after they are copied from the source AWS Region. By default, this operation only changes the retention period of copied automated snapshots. The retention periods for both new and existing copied automated snapshots are updated with the new retention period. You can set the manual option to change only the retention periods of copied manual snapshots. If you set this option, only newly copied manual snapshots have the new retention period. 
      */
    def modifySnapshotCopyRetentionPeriod(): awsDashSdkLib.libRequestMod.Request[ModifySnapshotCopyRetentionPeriodResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifySnapshotCopyRetentionPeriod(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifySnapshotCopyRetentionPeriodResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifySnapshotCopyRetentionPeriodResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the number of days to retain snapshots in the destination AWS Region after they are copied from the source AWS Region. By default, this operation only changes the retention period of copied automated snapshots. The retention periods for both new and existing copied automated snapshots are updated with the new retention period. You can set the manual option to change only the retention periods of copied manual snapshots. If you set this option, only newly copied manual snapshots have the new retention period. 
      */
    def modifySnapshotCopyRetentionPeriod(params: ModifySnapshotCopyRetentionPeriodMessage): awsDashSdkLib.libRequestMod.Request[ModifySnapshotCopyRetentionPeriodResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifySnapshotCopyRetentionPeriod(
      params: ModifySnapshotCopyRetentionPeriodMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifySnapshotCopyRetentionPeriodResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifySnapshotCopyRetentionPeriodResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies a snapshot schedule. Any schedule associated with a cluster is modified asynchronously.
      */
    def modifySnapshotSchedule(): awsDashSdkLib.libRequestMod.Request[SnapshotSchedule, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifySnapshotSchedule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SnapshotSchedule, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SnapshotSchedule, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies a snapshot schedule. Any schedule associated with a cluster is modified asynchronously.
      */
    def modifySnapshotSchedule(params: ModifySnapshotScheduleMessage): awsDashSdkLib.libRequestMod.Request[SnapshotSchedule, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifySnapshotSchedule(
      params: ModifySnapshotScheduleMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SnapshotSchedule, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SnapshotSchedule, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Allows you to purchase reserved nodes. Amazon Redshift offers a predefined set of reserved node offerings. You can purchase one or more of the offerings. You can call the DescribeReservedNodeOfferings API to obtain the available reserved node offerings. You can call this API by providing a specific reserved node offering and the number of nodes you want to reserve.   For more information about reserved node offerings, go to Purchasing Reserved Nodes in the Amazon Redshift Cluster Management Guide.
      */
    def purchaseReservedNodeOffering(): awsDashSdkLib.libRequestMod.Request[PurchaseReservedNodeOfferingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def purchaseReservedNodeOffering(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PurchaseReservedNodeOfferingResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PurchaseReservedNodeOfferingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Allows you to purchase reserved nodes. Amazon Redshift offers a predefined set of reserved node offerings. You can purchase one or more of the offerings. You can call the DescribeReservedNodeOfferings API to obtain the available reserved node offerings. You can call this API by providing a specific reserved node offering and the number of nodes you want to reserve.   For more information about reserved node offerings, go to Purchasing Reserved Nodes in the Amazon Redshift Cluster Management Guide.
      */
    def purchaseReservedNodeOffering(params: PurchaseReservedNodeOfferingMessage): awsDashSdkLib.libRequestMod.Request[PurchaseReservedNodeOfferingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def purchaseReservedNodeOffering(
      params: PurchaseReservedNodeOfferingMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PurchaseReservedNodeOfferingResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PurchaseReservedNodeOfferingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Reboots a cluster. This action is taken as soon as possible. It results in a momentary outage to the cluster, during which the cluster status is set to rebooting. A cluster event is created when the reboot is completed. Any pending cluster modifications (see ModifyCluster) are applied at this reboot. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide. 
      */
    def rebootCluster(): awsDashSdkLib.libRequestMod.Request[RebootClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def rebootCluster(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RebootClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RebootClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Reboots a cluster. This action is taken as soon as possible. It results in a momentary outage to the cluster, during which the cluster status is set to rebooting. A cluster event is created when the reboot is completed. Any pending cluster modifications (see ModifyCluster) are applied at this reboot. For more information about managing clusters, go to Amazon Redshift Clusters in the Amazon Redshift Cluster Management Guide. 
      */
    def rebootCluster(params: RebootClusterMessage): awsDashSdkLib.libRequestMod.Request[RebootClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def rebootCluster(
      params: RebootClusterMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RebootClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RebootClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets one or more parameters of the specified parameter group to their default values and sets the source values of the parameters to "engine-default". To reset the entire parameter group specify the ResetAllParameters parameter. For parameter changes to take effect you must reboot any associated clusters. 
      */
    def resetClusterParameterGroup(): awsDashSdkLib.libRequestMod.Request[ClusterParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def resetClusterParameterGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ClusterParameterGroupNameMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ClusterParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets one or more parameters of the specified parameter group to their default values and sets the source values of the parameters to "engine-default". To reset the entire parameter group specify the ResetAllParameters parameter. For parameter changes to take effect you must reboot any associated clusters. 
      */
    def resetClusterParameterGroup(params: ResetClusterParameterGroupMessage): awsDashSdkLib.libRequestMod.Request[ClusterParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def resetClusterParameterGroup(
      params: ResetClusterParameterGroupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ClusterParameterGroupNameMessage, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ClusterParameterGroupNameMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Changes the size of the cluster. You can change the cluster's type, or change the number or type of nodes. The default behavior is to use the elastic resize method. With an elastic resize, your cluster is available for read and write operations more quickly than with the classic resize method.  Elastic resize operations have the following restrictions:   You can only resize clusters of the following types:   dc2.large   dc2.8xlarge   ds2.xlarge   ds2.8xlarge     The type of nodes that you add must match the node type for the cluster.  
      */
    def resizeCluster(): awsDashSdkLib.libRequestMod.Request[ResizeClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def resizeCluster(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ResizeClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ResizeClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Changes the size of the cluster. You can change the cluster's type, or change the number or type of nodes. The default behavior is to use the elastic resize method. With an elastic resize, your cluster is available for read and write operations more quickly than with the classic resize method.  Elastic resize operations have the following restrictions:   You can only resize clusters of the following types:   dc2.large   dc2.8xlarge   ds2.xlarge   ds2.8xlarge     The type of nodes that you add must match the node type for the cluster.  
      */
    def resizeCluster(params: ResizeClusterMessage): awsDashSdkLib.libRequestMod.Request[ResizeClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def resizeCluster(
      params: ResizeClusterMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ResizeClusterResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ResizeClusterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new cluster from a snapshot. By default, Amazon Redshift creates the resulting cluster with the same configuration as the original cluster from which the snapshot was created, except that the new cluster is created with the default cluster security and parameter groups. After Amazon Redshift creates the cluster, you can use the ModifyCluster API to associate a different security group and different parameter group with the restored cluster. If you are using a DS node type, you can also choose to change to another DS node type of the same size during restore. If you restore a cluster into a VPC, you must provide a cluster subnet group where you want the cluster restored.  For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
      */
    def restoreFromClusterSnapshot(): awsDashSdkLib.libRequestMod.Request[RestoreFromClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def restoreFromClusterSnapshot(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RestoreFromClusterSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RestoreFromClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new cluster from a snapshot. By default, Amazon Redshift creates the resulting cluster with the same configuration as the original cluster from which the snapshot was created, except that the new cluster is created with the default cluster security and parameter groups. After Amazon Redshift creates the cluster, you can use the ModifyCluster API to associate a different security group and different parameter group with the restored cluster. If you are using a DS node type, you can also choose to change to another DS node type of the same size during restore. If you restore a cluster into a VPC, you must provide a cluster subnet group where you want the cluster restored.  For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
      */
    def restoreFromClusterSnapshot(params: RestoreFromClusterSnapshotMessage): awsDashSdkLib.libRequestMod.Request[RestoreFromClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def restoreFromClusterSnapshot(
      params: RestoreFromClusterSnapshotMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RestoreFromClusterSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RestoreFromClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new table from a table in an Amazon Redshift cluster snapshot. You must create the new table within the Amazon Redshift cluster that the snapshot was taken from. You cannot use RestoreTableFromClusterSnapshot to restore a table with the same name as an existing table in an Amazon Redshift cluster. That is, you cannot overwrite an existing table in a cluster with a restored table. If you want to replace your original table with a new, restored table, then rename or drop your original table before you call RestoreTableFromClusterSnapshot. When you have renamed your original table, then you can pass the original name of the table as the NewTableName parameter value in the call to RestoreTableFromClusterSnapshot. This way, you can replace the original table with the table created from the snapshot.
      */
    def restoreTableFromClusterSnapshot(): awsDashSdkLib.libRequestMod.Request[RestoreTableFromClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def restoreTableFromClusterSnapshot(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RestoreTableFromClusterSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RestoreTableFromClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new table from a table in an Amazon Redshift cluster snapshot. You must create the new table within the Amazon Redshift cluster that the snapshot was taken from. You cannot use RestoreTableFromClusterSnapshot to restore a table with the same name as an existing table in an Amazon Redshift cluster. That is, you cannot overwrite an existing table in a cluster with a restored table. If you want to replace your original table with a new, restored table, then rename or drop your original table before you call RestoreTableFromClusterSnapshot. When you have renamed your original table, then you can pass the original name of the table as the NewTableName parameter value in the call to RestoreTableFromClusterSnapshot. This way, you can replace the original table with the table created from the snapshot.
      */
    def restoreTableFromClusterSnapshot(params: RestoreTableFromClusterSnapshotMessage): awsDashSdkLib.libRequestMod.Request[RestoreTableFromClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def restoreTableFromClusterSnapshot(
      params: RestoreTableFromClusterSnapshotMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RestoreTableFromClusterSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RestoreTableFromClusterSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Revokes an ingress rule in an Amazon Redshift security group for a previously authorized IP range or Amazon EC2 security group. To add an ingress rule, see AuthorizeClusterSecurityGroupIngress. For information about managing security groups, go to Amazon Redshift Cluster Security Groups in the Amazon Redshift Cluster Management Guide. 
      */
    def revokeClusterSecurityGroupIngress(): awsDashSdkLib.libRequestMod.Request[RevokeClusterSecurityGroupIngressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def revokeClusterSecurityGroupIngress(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RevokeClusterSecurityGroupIngressResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RevokeClusterSecurityGroupIngressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Revokes an ingress rule in an Amazon Redshift security group for a previously authorized IP range or Amazon EC2 security group. To add an ingress rule, see AuthorizeClusterSecurityGroupIngress. For information about managing security groups, go to Amazon Redshift Cluster Security Groups in the Amazon Redshift Cluster Management Guide. 
      */
    def revokeClusterSecurityGroupIngress(params: RevokeClusterSecurityGroupIngressMessage): awsDashSdkLib.libRequestMod.Request[RevokeClusterSecurityGroupIngressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def revokeClusterSecurityGroupIngress(
      params: RevokeClusterSecurityGroupIngressMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RevokeClusterSecurityGroupIngressResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RevokeClusterSecurityGroupIngressResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the ability of the specified AWS customer account to restore the specified snapshot. If the account is currently restoring the snapshot, the restore will run to completion.  For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
      */
    def revokeSnapshotAccess(): awsDashSdkLib.libRequestMod.Request[RevokeSnapshotAccessResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def revokeSnapshotAccess(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RevokeSnapshotAccessResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RevokeSnapshotAccessResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the ability of the specified AWS customer account to restore the specified snapshot. If the account is currently restoring the snapshot, the restore will run to completion.  For more information about working with snapshots, go to Amazon Redshift Snapshots in the Amazon Redshift Cluster Management Guide.
      */
    def revokeSnapshotAccess(params: RevokeSnapshotAccessMessage): awsDashSdkLib.libRequestMod.Request[RevokeSnapshotAccessResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def revokeSnapshotAccess(
      params: RevokeSnapshotAccessMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RevokeSnapshotAccessResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RevokeSnapshotAccessResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Rotates the encryption keys for a cluster.
      */
    def rotateEncryptionKey(): awsDashSdkLib.libRequestMod.Request[RotateEncryptionKeyResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def rotateEncryptionKey(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RotateEncryptionKeyResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RotateEncryptionKeyResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Rotates the encryption keys for a cluster.
      */
    def rotateEncryptionKey(params: RotateEncryptionKeyMessage): awsDashSdkLib.libRequestMod.Request[RotateEncryptionKeyResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def rotateEncryptionKey(
      params: RotateEncryptionKeyMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RotateEncryptionKeyResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RotateEncryptionKeyResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the clusterAvailable state by periodically calling the underlying Redshift.describeClustersoperation every 60 seconds (at most 30 times).
      */
    @JSName("waitFor")
    def waitFor_clusterAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.clusterAvailable): awsDashSdkLib.libRequestMod.Request[ClustersMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_clusterAvailable(
      state: awsDashSdkLib.awsDashSdkLibStrings.clusterAvailable,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ClustersMessage, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ClustersMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the clusterAvailable state by periodically calling the underlying Redshift.describeClustersoperation every 60 seconds (at most 30 times).
      */
    @JSName("waitFor")
    def waitFor_clusterAvailable(
      state: awsDashSdkLib.awsDashSdkLibStrings.clusterAvailable,
      params: DescribeClustersMessage with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[ClustersMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_clusterAvailable(
      state: awsDashSdkLib.awsDashSdkLibStrings.clusterAvailable,
      params: DescribeClustersMessage with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ClustersMessage, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ClustersMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the clusterDeleted state by periodically calling the underlying Redshift.describeClustersoperation every 60 seconds (at most 30 times).
      */
    @JSName("waitFor")
    def waitFor_clusterDeleted(state: awsDashSdkLib.awsDashSdkLibStrings.clusterDeleted): awsDashSdkLib.libRequestMod.Request[ClustersMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_clusterDeleted(
      state: awsDashSdkLib.awsDashSdkLibStrings.clusterDeleted,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ClustersMessage, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ClustersMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the clusterDeleted state by periodically calling the underlying Redshift.describeClustersoperation every 60 seconds (at most 30 times).
      */
    @JSName("waitFor")
    def waitFor_clusterDeleted(
      state: awsDashSdkLib.awsDashSdkLibStrings.clusterDeleted,
      params: DescribeClustersMessage with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[ClustersMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_clusterDeleted(
      state: awsDashSdkLib.awsDashSdkLibStrings.clusterDeleted,
      params: DescribeClustersMessage with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ClustersMessage, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ClustersMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the clusterRestored state by periodically calling the underlying Redshift.describeClustersoperation every 60 seconds (at most 30 times).
      */
    @JSName("waitFor")
    def waitFor_clusterRestored(state: awsDashSdkLib.awsDashSdkLibStrings.clusterRestored): awsDashSdkLib.libRequestMod.Request[ClustersMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_clusterRestored(
      state: awsDashSdkLib.awsDashSdkLibStrings.clusterRestored,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ClustersMessage, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ClustersMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the clusterRestored state by periodically calling the underlying Redshift.describeClustersoperation every 60 seconds (at most 30 times).
      */
    @JSName("waitFor")
    def waitFor_clusterRestored(
      state: awsDashSdkLib.awsDashSdkLibStrings.clusterRestored,
      params: DescribeClustersMessage with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[ClustersMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_clusterRestored(
      state: awsDashSdkLib.awsDashSdkLibStrings.clusterRestored,
      params: DescribeClustersMessage with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ClustersMessage, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ClustersMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the snapshotAvailable state by periodically calling the underlying Redshift.describeClusterSnapshotsoperation every 15 seconds (at most 20 times).
      */
    @JSName("waitFor")
    def waitFor_snapshotAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.snapshotAvailable): awsDashSdkLib.libRequestMod.Request[SnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_snapshotAvailable(
      state: awsDashSdkLib.awsDashSdkLibStrings.snapshotAvailable,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ SnapshotMessage, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[SnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the snapshotAvailable state by periodically calling the underlying Redshift.describeClusterSnapshotsoperation every 15 seconds (at most 20 times).
      */
    @JSName("waitFor")
    def waitFor_snapshotAvailable(
      state: awsDashSdkLib.awsDashSdkLibStrings.snapshotAvailable,
      params: DescribeClusterSnapshotsMessage with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[SnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_snapshotAvailable(
      state: awsDashSdkLib.awsDashSdkLibStrings.snapshotAvailable,
      params: DescribeClusterSnapshotsMessage with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ SnapshotMessage, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[SnapshotMessage, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UpdateTarget extends js.Object {
    /**
      * The cluster version for the new maintenance track.
      */
    var DatabaseVersion: js.UndefOr[String] = js.undefined
    /**
      * The name of the new maintenance track.
      */
    var MaintenanceTrackName: js.UndefOr[String] = js.undefined
    /**
      * A list of operations supported by the maintenance track.
      */
    var SupportedOperations: js.UndefOr[SupportedOperationList] = js.undefined
  }
  
  trait VpcSecurityGroupMembership extends js.Object {
    /**
      * The status of the VPC security group.
      */
    var Status: js.UndefOr[String] = js.undefined
    /**
      * The identifier of the VPC security group.
      */
    var VpcSecurityGroupId: js.UndefOr[String] = js.undefined
  }
  
  trait _ParameterApplyType extends js.Object
  
  trait _ReservedNodeOfferingType extends js.Object
  
  trait _ScheduleState extends js.Object
  
  trait _SnapshotAttributeToSortBy extends js.Object
  
  trait _SortByOrder extends js.Object
  
  trait _SourceType extends js.Object
  
  trait _TableRestoreStatusType extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type AccountsWithRestoreAccessList = js.Array[AccountWithRestoreAccess]
  type AssociatedClusterList = js.Array[ClusterAssociatedToSchedule]
  type AttributeList = js.Array[AccountAttribute]
  type AttributeNameList = js.Array[String]
  type AttributeValueList = js.Array[AttributeValueTarget]
  type AvailabilityZoneList = js.Array[AvailabilityZone]
  type BatchSnapshotOperationErrorList = js.Array[SnapshotErrorMessage]
  type BatchSnapshotOperationErrors = js.Array[SnapshotErrorMessage]
  type Boolean = scala.Boolean
  type BooleanOptional = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClusterDbRevisionsList = js.Array[ClusterDbRevision]
  type ClusterIamRoleList = js.Array[ClusterIamRole]
  type ClusterList = js.Array[Cluster]
  type ClusterNodesList = js.Array[ClusterNode]
  type ClusterParameterGroupStatusList = js.Array[ClusterParameterGroupStatus]
  type ClusterParameterStatusList = js.Array[ClusterParameterStatus]
  type ClusterSecurityGroupMembershipList = js.Array[ClusterSecurityGroupMembership]
  type ClusterSecurityGroupNameList = js.Array[String]
  type ClusterSecurityGroups = js.Array[ClusterSecurityGroup]
  type ClusterSubnetGroups = js.Array[ClusterSubnetGroup]
  type ClusterVersionList = js.Array[ClusterVersion]
  type DbGroupList = js.Array[String]
  type DeferredMaintenanceWindowsList = js.Array[DeferredMaintenanceWindow]
  type DeleteClusterSnapshotMessageList = js.Array[DeleteClusterSnapshotMessage]
  type Double = scala.Double
  type DoubleOptional = scala.Double
  type EC2SecurityGroupList = js.Array[EC2SecurityGroup]
  type EligibleTracksToUpdateList = js.Array[UpdateTarget]
  type EventCategoriesList = js.Array[String]
  type EventCategoriesMapList = js.Array[EventCategoriesMap]
  type EventInfoMapList = js.Array[EventInfoMap]
  type EventList = js.Array[Event]
  type EventSubscriptionsList = js.Array[EventSubscription]
  type HsmClientCertificateList = js.Array[HsmClientCertificate]
  type HsmConfigurationList = js.Array[HsmConfiguration]
  type IPRangeList = js.Array[IPRange]
  type IamRoleArnList = js.Array[String]
  type ImportTablesCompleted = js.Array[String]
  type ImportTablesInProgress = js.Array[String]
  type ImportTablesNotStarted = js.Array[String]
  type Integer = scala.Double
  type IntegerOptional = scala.Double
  type Long = scala.Double
  type LongOptional = scala.Double
  type OrderableClusterOptionsList = js.Array[OrderableClusterOption]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.static
    - awsDashSdkLib.awsDashSdkLibStrings.dynamic
    - java.lang.String
  */
  type ParameterApplyType = _ParameterApplyType | java.lang.String
  type ParameterGroupList = js.Array[ClusterParameterGroup]
  type ParametersList = js.Array[Parameter]
  type PendingActionsList = js.Array[String]
  type RecurringChargeList = js.Array[RecurringCharge]
  type ReservedNodeList = js.Array[ReservedNode]
  type ReservedNodeOfferingList = js.Array[ReservedNodeOffering]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Regular
    - awsDashSdkLib.awsDashSdkLibStrings.Upgradable
    - java.lang.String
  */
  type ReservedNodeOfferingType = _ReservedNodeOfferingType | java.lang.String
  type RestorableNodeTypeList = js.Array[String]
  type RevisionTargetsList = js.Array[RevisionTarget]
  type ScheduleDefinitionList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.MODIFYING
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type ScheduleState = _ScheduleState | java.lang.String
  type ScheduledSnapshotTimeList = js.Array[TStamp]
  type SensitiveString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SOURCE_TYPE
    - awsDashSdkLib.awsDashSdkLibStrings.TOTAL_SIZE
    - awsDashSdkLib.awsDashSdkLibStrings.CREATE_TIME
    - java.lang.String
  */
  type SnapshotAttributeToSortBy = _SnapshotAttributeToSortBy | java.lang.String
  type SnapshotCopyGrantList = js.Array[SnapshotCopyGrant]
  type SnapshotIdentifierList = js.Array[String]
  type SnapshotList = js.Array[Snapshot]
  type SnapshotScheduleList = js.Array[SnapshotSchedule]
  type SnapshotSortingEntityList = js.Array[SnapshotSortingEntity]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ASC
    - awsDashSdkLib.awsDashSdkLibStrings.DESC
    - java.lang.String
  */
  type SortByOrder = _SortByOrder | java.lang.String
  type SourceIdsList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.cluster
    - awsDashSdkLib.awsDashSdkLibStrings.`cluster-parameter-group`
    - awsDashSdkLib.awsDashSdkLibStrings.`cluster-security-group`
    - awsDashSdkLib.awsDashSdkLibStrings.`cluster-snapshot`
    - java.lang.String
  */
  type SourceType = _SourceType | java.lang.String
  type String = java.lang.String
  type SubnetIdentifierList = js.Array[String]
  type SubnetList = js.Array[Subnet]
  type SupportedOperationList = js.Array[SupportedOperation]
  type SupportedPlatformsList = js.Array[SupportedPlatform]
  type TStamp = stdLib.Date
  type TableRestoreStatusList = js.Array[TableRestoreStatus]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.CANCELED
    - java.lang.String
  */
  type TableRestoreStatusType = _TableRestoreStatusType | java.lang.String
  type TagKeyList = js.Array[String]
  type TagList = js.Array[Tag]
  type TagValueList = js.Array[String]
  type TaggedResourceList = js.Array[TaggedResource]
  type TrackList = js.Array[MaintenanceTrack]
  type VpcSecurityGroupIdList = js.Array[String]
  type VpcSecurityGroupMembershipList = js.Array[VpcSecurityGroupMembership]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2012-12-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}

