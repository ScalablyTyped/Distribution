package typings.awsDashSdk.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBClusterSnapshot extends js.Object {
  /**
    * Specifies the allocated storage size in gibibytes (GiB).
    */
  var AllocatedStorage: js.UndefOr[Integer] = js.undefined
  /**
    * Provides the list of EC2 Availability Zones that instances in the DB cluster snapshot can be restored in.
    */
  var AvailabilityZones: js.UndefOr[typings.awsDashSdk.clientsNeptuneMod.AvailabilityZones] = js.undefined
  /**
    * Specifies the time when the DB cluster was created, in Universal Coordinated Time (UTC).
    */
  var ClusterCreateTime: js.UndefOr[TStamp] = js.undefined
  /**
    * Specifies the DB cluster identifier of the DB cluster that this DB cluster snapshot was created from.
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the DB cluster snapshot.
    */
  var DBClusterSnapshotArn: js.UndefOr[String] = js.undefined
  /**
    * Specifies the identifier for the DB cluster snapshot.
    */
  var DBClusterSnapshotIdentifier: js.UndefOr[String] = js.undefined
  /**
    * Specifies the name of the database engine.
    */
  var Engine: js.UndefOr[String] = js.undefined
  /**
    * Provides the version of the database engine for this DB cluster snapshot.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  /**
    * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and otherwise false.
    */
  var IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * If StorageEncrypted is true, the AWS KMS key identifier for the encrypted DB cluster snapshot.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  /**
    * Provides the license model information for this DB cluster snapshot.
    */
  var LicenseModel: js.UndefOr[String] = js.undefined
  /**
    * Provides the master username for the DB cluster snapshot.
    */
  var MasterUsername: js.UndefOr[String] = js.undefined
  /**
    * Specifies the percentage of the estimated data that has been transferred.
    */
  var PercentProgress: js.UndefOr[Integer] = js.undefined
  /**
    * Specifies the port that the DB cluster was listening on at the time of the snapshot.
    */
  var Port: js.UndefOr[Integer] = js.undefined
  /**
    * Provides the time when the snapshot was taken, in Universal Coordinated Time (UTC).
    */
  var SnapshotCreateTime: js.UndefOr[TStamp] = js.undefined
  /**
    * Provides the type of the DB cluster snapshot.
    */
  var SnapshotType: js.UndefOr[String] = js.undefined
  /**
    * If the DB cluster snapshot was copied from a source DB cluster snapshot, the Amazon Resource Name (ARN) for the source DB cluster snapshot, otherwise, a null value.
    */
  var SourceDBClusterSnapshotArn: js.UndefOr[String] = js.undefined
  /**
    * Specifies the status of this DB cluster snapshot.
    */
  var Status: js.UndefOr[String] = js.undefined
  /**
    * Specifies whether the DB cluster snapshot is encrypted.
    */
  var StorageEncrypted: js.UndefOr[Boolean] = js.undefined
  /**
    * Provides the VPC ID associated with the DB cluster snapshot.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}

object DBClusterSnapshot {
  @scala.inline
  def apply(
    AllocatedStorage: Int | scala.Double = null,
    AvailabilityZones: AvailabilityZones = null,
    ClusterCreateTime: TStamp = null,
    DBClusterIdentifier: String = null,
    DBClusterSnapshotArn: String = null,
    DBClusterSnapshotIdentifier: String = null,
    Engine: String = null,
    EngineVersion: String = null,
    IAMDatabaseAuthenticationEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    KmsKeyId: String = null,
    LicenseModel: String = null,
    MasterUsername: String = null,
    PercentProgress: Int | scala.Double = null,
    Port: Int | scala.Double = null,
    SnapshotCreateTime: TStamp = null,
    SnapshotType: String = null,
    SourceDBClusterSnapshotArn: String = null,
    Status: String = null,
    StorageEncrypted: js.UndefOr[scala.Boolean] = js.undefined,
    VpcId: String = null
  ): DBClusterSnapshot = {
    val __obj = js.Dynamic.literal()
    if (AllocatedStorage != null) __obj.updateDynamic("AllocatedStorage")(AllocatedStorage.asInstanceOf[js.Any])
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones)
    if (ClusterCreateTime != null) __obj.updateDynamic("ClusterCreateTime")(ClusterCreateTime)
    if (DBClusterIdentifier != null) __obj.updateDynamic("DBClusterIdentifier")(DBClusterIdentifier)
    if (DBClusterSnapshotArn != null) __obj.updateDynamic("DBClusterSnapshotArn")(DBClusterSnapshotArn)
    if (DBClusterSnapshotIdentifier != null) __obj.updateDynamic("DBClusterSnapshotIdentifier")(DBClusterSnapshotIdentifier)
    if (Engine != null) __obj.updateDynamic("Engine")(Engine)
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (!js.isUndefined(IAMDatabaseAuthenticationEnabled)) __obj.updateDynamic("IAMDatabaseAuthenticationEnabled")(IAMDatabaseAuthenticationEnabled)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (LicenseModel != null) __obj.updateDynamic("LicenseModel")(LicenseModel)
    if (MasterUsername != null) __obj.updateDynamic("MasterUsername")(MasterUsername)
    if (PercentProgress != null) __obj.updateDynamic("PercentProgress")(PercentProgress.asInstanceOf[js.Any])
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    if (SnapshotCreateTime != null) __obj.updateDynamic("SnapshotCreateTime")(SnapshotCreateTime)
    if (SnapshotType != null) __obj.updateDynamic("SnapshotType")(SnapshotType)
    if (SourceDBClusterSnapshotArn != null) __obj.updateDynamic("SourceDBClusterSnapshotArn")(SourceDBClusterSnapshotArn)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (!js.isUndefined(StorageEncrypted)) __obj.updateDynamic("StorageEncrypted")(StorageEncrypted)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[DBClusterSnapshot]
  }
}

