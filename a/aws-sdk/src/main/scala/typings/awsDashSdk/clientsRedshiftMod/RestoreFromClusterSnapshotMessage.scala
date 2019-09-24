package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  /**
    * The default number of days to retain a manual snapshot. If the value is -1, the snapshot is retained indefinitely. This setting doesn't change the retention period of existing snapshots. The value must be either -1 or an integer between 1 and 3,653.
    */
  var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The node type that the restored cluster will be provisioned with. Default: The node type of the cluster from which the snapshot was taken. You can modify this if you are using any DS node type. In that case, you can choose to restore into another DS node type of the same size. For example, you can restore ds1.8xlarge into ds2.8xlarge, or ds1.xlarge into ds2.xlarge. If you have a DC instance type, you must restore into that same instance type and size. In other words, you can only restore a dc1.large instance type into another dc1.large instance type or dc2.large instance type. You can't restore dc1.8xlarge to dc2.8xlarge. First restore to a dc1.8xlareg cluster, then resize to a dc2.8large cluster. For more information about node types, see  About Clusters and Nodes in the Amazon Redshift Cluster Management Guide. 
    */
  var NodeType: js.UndefOr[String] = js.undefined
  /**
    * The number of nodes specified when provisioning the restored cluster.
    */
  var NumberOfNodes: js.UndefOr[IntegerOptional] = js.undefined
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

object RestoreFromClusterSnapshotMessage {
  @scala.inline
  def apply(
    ClusterIdentifier: String,
    SnapshotIdentifier: String,
    AdditionalInfo: String = null,
    AllowVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
    AutomatedSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
    AvailabilityZone: String = null,
    ClusterParameterGroupName: String = null,
    ClusterSecurityGroups: ClusterSecurityGroupNameList = null,
    ClusterSubnetGroupName: String = null,
    ElasticIp: String = null,
    EnhancedVpcRouting: js.UndefOr[BooleanOptional] = js.undefined,
    HsmClientCertificateIdentifier: String = null,
    HsmConfigurationIdentifier: String = null,
    IamRoles: IamRoleArnList = null,
    KmsKeyId: String = null,
    MaintenanceTrackName: String = null,
    ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
    NodeType: String = null,
    NumberOfNodes: js.UndefOr[IntegerOptional] = js.undefined,
    OwnerAccount: String = null,
    Port: js.UndefOr[IntegerOptional] = js.undefined,
    PreferredMaintenanceWindow: String = null,
    PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined,
    SnapshotClusterIdentifier: String = null,
    SnapshotScheduleIdentifier: String = null,
    VpcSecurityGroupIds: VpcSecurityGroupIdList = null
  ): RestoreFromClusterSnapshotMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier, SnapshotIdentifier = SnapshotIdentifier)
    if (AdditionalInfo != null) __obj.updateDynamic("AdditionalInfo")(AdditionalInfo)
    if (!js.isUndefined(AllowVersionUpgrade)) __obj.updateDynamic("AllowVersionUpgrade")(AllowVersionUpgrade)
    if (!js.isUndefined(AutomatedSnapshotRetentionPeriod)) __obj.updateDynamic("AutomatedSnapshotRetentionPeriod")(AutomatedSnapshotRetentionPeriod)
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (ClusterParameterGroupName != null) __obj.updateDynamic("ClusterParameterGroupName")(ClusterParameterGroupName)
    if (ClusterSecurityGroups != null) __obj.updateDynamic("ClusterSecurityGroups")(ClusterSecurityGroups)
    if (ClusterSubnetGroupName != null) __obj.updateDynamic("ClusterSubnetGroupName")(ClusterSubnetGroupName)
    if (ElasticIp != null) __obj.updateDynamic("ElasticIp")(ElasticIp)
    if (!js.isUndefined(EnhancedVpcRouting)) __obj.updateDynamic("EnhancedVpcRouting")(EnhancedVpcRouting)
    if (HsmClientCertificateIdentifier != null) __obj.updateDynamic("HsmClientCertificateIdentifier")(HsmClientCertificateIdentifier)
    if (HsmConfigurationIdentifier != null) __obj.updateDynamic("HsmConfigurationIdentifier")(HsmConfigurationIdentifier)
    if (IamRoles != null) __obj.updateDynamic("IamRoles")(IamRoles)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (MaintenanceTrackName != null) __obj.updateDynamic("MaintenanceTrackName")(MaintenanceTrackName)
    if (!js.isUndefined(ManualSnapshotRetentionPeriod)) __obj.updateDynamic("ManualSnapshotRetentionPeriod")(ManualSnapshotRetentionPeriod)
    if (NodeType != null) __obj.updateDynamic("NodeType")(NodeType)
    if (!js.isUndefined(NumberOfNodes)) __obj.updateDynamic("NumberOfNodes")(NumberOfNodes)
    if (OwnerAccount != null) __obj.updateDynamic("OwnerAccount")(OwnerAccount)
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port)
    if (PreferredMaintenanceWindow != null) __obj.updateDynamic("PreferredMaintenanceWindow")(PreferredMaintenanceWindow)
    if (!js.isUndefined(PubliclyAccessible)) __obj.updateDynamic("PubliclyAccessible")(PubliclyAccessible)
    if (SnapshotClusterIdentifier != null) __obj.updateDynamic("SnapshotClusterIdentifier")(SnapshotClusterIdentifier)
    if (SnapshotScheduleIdentifier != null) __obj.updateDynamic("SnapshotScheduleIdentifier")(SnapshotScheduleIdentifier)
    if (VpcSecurityGroupIds != null) __obj.updateDynamic("VpcSecurityGroupIds")(VpcSecurityGroupIds)
    __obj.asInstanceOf[RestoreFromClusterSnapshotMessage]
  }
}

