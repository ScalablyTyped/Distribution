package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * The availability status of the cluster for queries. Possible values are the following:   Available - The cluster is available for queries.    Unavailable - The cluster is not available for queries.   Maintenance - The cluster is intermittently available for queries due to maintenance activities.   Modifying - The cluster is intermittently available for queries due to changes that modify the cluster.   Failed - The cluster failed and is not available for queries.  
    */
  var ClusterAvailabilityStatus: js.UndefOr[String] = js.undefined
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
  var ClusterSnapshotCopyStatus: js.UndefOr[typings.awsDashSdk.clientsRedshiftMod.ClusterSnapshotCopyStatus] = js.undefined
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
  /**
    * 
    */
  var DataTransferProgress: js.UndefOr[typings.awsDashSdk.clientsRedshiftMod.DataTransferProgress] = js.undefined
  /**
    * Describes a group of DeferredMaintenanceWindow objects.
    */
  var DeferredMaintenanceWindows: js.UndefOr[DeferredMaintenanceWindowsList] = js.undefined
  /**
    * The status of the elastic IP (EIP) address.
    */
  var ElasticIpStatus: js.UndefOr[typings.awsDashSdk.clientsRedshiftMod.ElasticIpStatus] = js.undefined
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
  var Endpoint: js.UndefOr[typings.awsDashSdk.clientsRedshiftMod.Endpoint] = js.undefined
  /**
    * An option that specifies whether to create the cluster with enhanced VPC routing enabled. To create a cluster that uses enhanced VPC routing, the cluster must be in a VPC. For more information, see Enhanced VPC Routing in the Amazon Redshift Cluster Management Guide. If this option is true, enhanced VPC routing is enabled.  Default: false
    */
  var EnhancedVpcRouting: js.UndefOr[Boolean] = js.undefined
  /**
    * The date and time when the next snapshot is expected to be taken for clusters with a valid snapshot schedule and backups enabled. 
    */
  var ExpectedNextSnapshotScheduleTime: js.UndefOr[TStamp] = js.undefined
  /**
    *  The status of next expected snapshot for clusters having a valid snapshot schedule and backups enabled. Possible values are the following:   OnTrack - The next snapshot is expected to be taken on time.    Pending - The next snapshot is pending to be taken.   
    */
  var ExpectedNextSnapshotScheduleTimeStatus: js.UndefOr[String] = js.undefined
  /**
    * A value that reports whether the Amazon Redshift cluster has finished applying any hardware security module (HSM) settings changes specified in a modify cluster command. Values: active, applying
    */
  var HsmStatus: js.UndefOr[typings.awsDashSdk.clientsRedshiftMod.HsmStatus] = js.undefined
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
    * The date and time in UTC when system maintenance can begin.
    */
  var NextMaintenanceWindowStartTime: js.UndefOr[TStamp] = js.undefined
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
  var PendingModifiedValues: js.UndefOr[typings.awsDashSdk.clientsRedshiftMod.PendingModifiedValues] = js.undefined
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
  var ResizeInfo: js.UndefOr[typings.awsDashSdk.clientsRedshiftMod.ResizeInfo] = js.undefined
  /**
    * A value that describes the status of a cluster restore action. This parameter returns null if the cluster was not created by restoring a snapshot.
    */
  var RestoreStatus: js.UndefOr[typings.awsDashSdk.clientsRedshiftMod.RestoreStatus] = js.undefined
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

object Cluster {
  @scala.inline
  def apply(
    AllowVersionUpgrade: js.UndefOr[Boolean] = js.undefined,
    AutomatedSnapshotRetentionPeriod: js.UndefOr[Integer] = js.undefined,
    AvailabilityZone: String = null,
    ClusterAvailabilityStatus: String = null,
    ClusterCreateTime: TStamp = null,
    ClusterIdentifier: String = null,
    ClusterNodes: ClusterNodesList = null,
    ClusterParameterGroups: ClusterParameterGroupStatusList = null,
    ClusterPublicKey: String = null,
    ClusterRevisionNumber: String = null,
    ClusterSecurityGroups: ClusterSecurityGroupMembershipList = null,
    ClusterSnapshotCopyStatus: ClusterSnapshotCopyStatus = null,
    ClusterStatus: String = null,
    ClusterSubnetGroupName: String = null,
    ClusterVersion: String = null,
    DBName: String = null,
    DataTransferProgress: DataTransferProgress = null,
    DeferredMaintenanceWindows: DeferredMaintenanceWindowsList = null,
    ElasticIpStatus: ElasticIpStatus = null,
    ElasticResizeNumberOfNodeOptions: String = null,
    Encrypted: js.UndefOr[Boolean] = js.undefined,
    Endpoint: Endpoint = null,
    EnhancedVpcRouting: js.UndefOr[Boolean] = js.undefined,
    ExpectedNextSnapshotScheduleTime: TStamp = null,
    ExpectedNextSnapshotScheduleTimeStatus: String = null,
    HsmStatus: HsmStatus = null,
    IamRoles: ClusterIamRoleList = null,
    KmsKeyId: String = null,
    MaintenanceTrackName: String = null,
    ManualSnapshotRetentionPeriod: js.UndefOr[Integer] = js.undefined,
    MasterUsername: String = null,
    ModifyStatus: String = null,
    NextMaintenanceWindowStartTime: TStamp = null,
    NodeType: String = null,
    NumberOfNodes: js.UndefOr[Integer] = js.undefined,
    PendingActions: PendingActionsList = null,
    PendingModifiedValues: PendingModifiedValues = null,
    PreferredMaintenanceWindow: String = null,
    PubliclyAccessible: js.UndefOr[Boolean] = js.undefined,
    ResizeInfo: ResizeInfo = null,
    RestoreStatus: RestoreStatus = null,
    SnapshotScheduleIdentifier: String = null,
    SnapshotScheduleState: ScheduleState = null,
    Tags: TagList = null,
    VpcId: String = null,
    VpcSecurityGroups: VpcSecurityGroupMembershipList = null
  ): Cluster = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllowVersionUpgrade)) __obj.updateDynamic("AllowVersionUpgrade")(AllowVersionUpgrade)
    if (!js.isUndefined(AutomatedSnapshotRetentionPeriod)) __obj.updateDynamic("AutomatedSnapshotRetentionPeriod")(AutomatedSnapshotRetentionPeriod)
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (ClusterAvailabilityStatus != null) __obj.updateDynamic("ClusterAvailabilityStatus")(ClusterAvailabilityStatus)
    if (ClusterCreateTime != null) __obj.updateDynamic("ClusterCreateTime")(ClusterCreateTime)
    if (ClusterIdentifier != null) __obj.updateDynamic("ClusterIdentifier")(ClusterIdentifier)
    if (ClusterNodes != null) __obj.updateDynamic("ClusterNodes")(ClusterNodes)
    if (ClusterParameterGroups != null) __obj.updateDynamic("ClusterParameterGroups")(ClusterParameterGroups)
    if (ClusterPublicKey != null) __obj.updateDynamic("ClusterPublicKey")(ClusterPublicKey)
    if (ClusterRevisionNumber != null) __obj.updateDynamic("ClusterRevisionNumber")(ClusterRevisionNumber)
    if (ClusterSecurityGroups != null) __obj.updateDynamic("ClusterSecurityGroups")(ClusterSecurityGroups)
    if (ClusterSnapshotCopyStatus != null) __obj.updateDynamic("ClusterSnapshotCopyStatus")(ClusterSnapshotCopyStatus)
    if (ClusterStatus != null) __obj.updateDynamic("ClusterStatus")(ClusterStatus)
    if (ClusterSubnetGroupName != null) __obj.updateDynamic("ClusterSubnetGroupName")(ClusterSubnetGroupName)
    if (ClusterVersion != null) __obj.updateDynamic("ClusterVersion")(ClusterVersion)
    if (DBName != null) __obj.updateDynamic("DBName")(DBName)
    if (DataTransferProgress != null) __obj.updateDynamic("DataTransferProgress")(DataTransferProgress)
    if (DeferredMaintenanceWindows != null) __obj.updateDynamic("DeferredMaintenanceWindows")(DeferredMaintenanceWindows)
    if (ElasticIpStatus != null) __obj.updateDynamic("ElasticIpStatus")(ElasticIpStatus)
    if (ElasticResizeNumberOfNodeOptions != null) __obj.updateDynamic("ElasticResizeNumberOfNodeOptions")(ElasticResizeNumberOfNodeOptions)
    if (!js.isUndefined(Encrypted)) __obj.updateDynamic("Encrypted")(Encrypted)
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint)
    if (!js.isUndefined(EnhancedVpcRouting)) __obj.updateDynamic("EnhancedVpcRouting")(EnhancedVpcRouting)
    if (ExpectedNextSnapshotScheduleTime != null) __obj.updateDynamic("ExpectedNextSnapshotScheduleTime")(ExpectedNextSnapshotScheduleTime)
    if (ExpectedNextSnapshotScheduleTimeStatus != null) __obj.updateDynamic("ExpectedNextSnapshotScheduleTimeStatus")(ExpectedNextSnapshotScheduleTimeStatus)
    if (HsmStatus != null) __obj.updateDynamic("HsmStatus")(HsmStatus)
    if (IamRoles != null) __obj.updateDynamic("IamRoles")(IamRoles)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (MaintenanceTrackName != null) __obj.updateDynamic("MaintenanceTrackName")(MaintenanceTrackName)
    if (!js.isUndefined(ManualSnapshotRetentionPeriod)) __obj.updateDynamic("ManualSnapshotRetentionPeriod")(ManualSnapshotRetentionPeriod)
    if (MasterUsername != null) __obj.updateDynamic("MasterUsername")(MasterUsername)
    if (ModifyStatus != null) __obj.updateDynamic("ModifyStatus")(ModifyStatus)
    if (NextMaintenanceWindowStartTime != null) __obj.updateDynamic("NextMaintenanceWindowStartTime")(NextMaintenanceWindowStartTime)
    if (NodeType != null) __obj.updateDynamic("NodeType")(NodeType)
    if (!js.isUndefined(NumberOfNodes)) __obj.updateDynamic("NumberOfNodes")(NumberOfNodes)
    if (PendingActions != null) __obj.updateDynamic("PendingActions")(PendingActions)
    if (PendingModifiedValues != null) __obj.updateDynamic("PendingModifiedValues")(PendingModifiedValues)
    if (PreferredMaintenanceWindow != null) __obj.updateDynamic("PreferredMaintenanceWindow")(PreferredMaintenanceWindow)
    if (!js.isUndefined(PubliclyAccessible)) __obj.updateDynamic("PubliclyAccessible")(PubliclyAccessible)
    if (ResizeInfo != null) __obj.updateDynamic("ResizeInfo")(ResizeInfo)
    if (RestoreStatus != null) __obj.updateDynamic("RestoreStatus")(RestoreStatus)
    if (SnapshotScheduleIdentifier != null) __obj.updateDynamic("SnapshotScheduleIdentifier")(SnapshotScheduleIdentifier)
    if (SnapshotScheduleState != null) __obj.updateDynamic("SnapshotScheduleState")(SnapshotScheduleState.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    if (VpcSecurityGroups != null) __obj.updateDynamic("VpcSecurityGroups")(VpcSecurityGroups)
    __obj.asInstanceOf[Cluster]
  }
}

