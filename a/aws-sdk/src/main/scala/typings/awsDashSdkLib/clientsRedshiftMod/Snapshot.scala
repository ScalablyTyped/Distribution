package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

object Snapshot {
  @scala.inline
  def apply(
    AccountsWithRestoreAccess: AccountsWithRestoreAccessList = null,
    ActualIncrementalBackupSizeInMegaBytes: js.UndefOr[Double] = js.undefined,
    AvailabilityZone: String = null,
    BackupProgressInMegaBytes: js.UndefOr[Double] = js.undefined,
    ClusterCreateTime: TStamp = null,
    ClusterIdentifier: String = null,
    ClusterVersion: String = null,
    CurrentBackupRateInMegaBytesPerSecond: js.UndefOr[Double] = js.undefined,
    DBName: String = null,
    ElapsedTimeInSeconds: js.UndefOr[Long] = js.undefined,
    Encrypted: js.UndefOr[Boolean] = js.undefined,
    EncryptedWithHSM: js.UndefOr[Boolean] = js.undefined,
    EnhancedVpcRouting: js.UndefOr[Boolean] = js.undefined,
    EstimatedSecondsToCompletion: js.UndefOr[Long] = js.undefined,
    KmsKeyId: String = null,
    MaintenanceTrackName: String = null,
    ManualSnapshotRemainingDays: js.UndefOr[IntegerOptional] = js.undefined,
    ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
    MasterUsername: String = null,
    NodeType: String = null,
    NumberOfNodes: js.UndefOr[Integer] = js.undefined,
    OwnerAccount: String = null,
    Port: js.UndefOr[Integer] = js.undefined,
    RestorableNodeTypes: RestorableNodeTypeList = null,
    SnapshotCreateTime: TStamp = null,
    SnapshotIdentifier: String = null,
    SnapshotRetentionStartTime: TStamp = null,
    SnapshotType: String = null,
    SourceRegion: String = null,
    Status: String = null,
    Tags: TagList = null,
    TotalBackupSizeInMegaBytes: js.UndefOr[Double] = js.undefined,
    VpcId: String = null
  ): Snapshot = {
    val __obj = js.Dynamic.literal()
    if (AccountsWithRestoreAccess != null) __obj.updateDynamic("AccountsWithRestoreAccess")(AccountsWithRestoreAccess)
    if (!js.isUndefined(ActualIncrementalBackupSizeInMegaBytes)) __obj.updateDynamic("ActualIncrementalBackupSizeInMegaBytes")(ActualIncrementalBackupSizeInMegaBytes)
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (!js.isUndefined(BackupProgressInMegaBytes)) __obj.updateDynamic("BackupProgressInMegaBytes")(BackupProgressInMegaBytes)
    if (ClusterCreateTime != null) __obj.updateDynamic("ClusterCreateTime")(ClusterCreateTime)
    if (ClusterIdentifier != null) __obj.updateDynamic("ClusterIdentifier")(ClusterIdentifier)
    if (ClusterVersion != null) __obj.updateDynamic("ClusterVersion")(ClusterVersion)
    if (!js.isUndefined(CurrentBackupRateInMegaBytesPerSecond)) __obj.updateDynamic("CurrentBackupRateInMegaBytesPerSecond")(CurrentBackupRateInMegaBytesPerSecond)
    if (DBName != null) __obj.updateDynamic("DBName")(DBName)
    if (!js.isUndefined(ElapsedTimeInSeconds)) __obj.updateDynamic("ElapsedTimeInSeconds")(ElapsedTimeInSeconds)
    if (!js.isUndefined(Encrypted)) __obj.updateDynamic("Encrypted")(Encrypted)
    if (!js.isUndefined(EncryptedWithHSM)) __obj.updateDynamic("EncryptedWithHSM")(EncryptedWithHSM)
    if (!js.isUndefined(EnhancedVpcRouting)) __obj.updateDynamic("EnhancedVpcRouting")(EnhancedVpcRouting)
    if (!js.isUndefined(EstimatedSecondsToCompletion)) __obj.updateDynamic("EstimatedSecondsToCompletion")(EstimatedSecondsToCompletion)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (MaintenanceTrackName != null) __obj.updateDynamic("MaintenanceTrackName")(MaintenanceTrackName)
    if (!js.isUndefined(ManualSnapshotRemainingDays)) __obj.updateDynamic("ManualSnapshotRemainingDays")(ManualSnapshotRemainingDays)
    if (!js.isUndefined(ManualSnapshotRetentionPeriod)) __obj.updateDynamic("ManualSnapshotRetentionPeriod")(ManualSnapshotRetentionPeriod)
    if (MasterUsername != null) __obj.updateDynamic("MasterUsername")(MasterUsername)
    if (NodeType != null) __obj.updateDynamic("NodeType")(NodeType)
    if (!js.isUndefined(NumberOfNodes)) __obj.updateDynamic("NumberOfNodes")(NumberOfNodes)
    if (OwnerAccount != null) __obj.updateDynamic("OwnerAccount")(OwnerAccount)
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port)
    if (RestorableNodeTypes != null) __obj.updateDynamic("RestorableNodeTypes")(RestorableNodeTypes)
    if (SnapshotCreateTime != null) __obj.updateDynamic("SnapshotCreateTime")(SnapshotCreateTime)
    if (SnapshotIdentifier != null) __obj.updateDynamic("SnapshotIdentifier")(SnapshotIdentifier)
    if (SnapshotRetentionStartTime != null) __obj.updateDynamic("SnapshotRetentionStartTime")(SnapshotRetentionStartTime)
    if (SnapshotType != null) __obj.updateDynamic("SnapshotType")(SnapshotType)
    if (SourceRegion != null) __obj.updateDynamic("SourceRegion")(SourceRegion)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (!js.isUndefined(TotalBackupSizeInMegaBytes)) __obj.updateDynamic("TotalBackupSizeInMegaBytes")(TotalBackupSizeInMegaBytes)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[Snapshot]
  }
}

