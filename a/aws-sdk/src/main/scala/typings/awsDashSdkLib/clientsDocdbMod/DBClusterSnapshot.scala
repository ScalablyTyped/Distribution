package typings
package awsDashSdkLib.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBClusterSnapshot extends js.Object {
  /**
    * Provides the list of Amazon EC2 Availability Zones that instances in the DB cluster snapshot can be restored in.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined
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
    * If StorageEncrypted is true, the AWS KMS key identifier for the encrypted DB cluster snapshot.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  /**
    * Provides the master user name for the DB cluster snapshot.
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
    * Provides the time when the snapshot was taken, in UTC.
    */
  var SnapshotCreateTime: js.UndefOr[TStamp] = js.undefined
  /**
    * Provides the type of the DB cluster snapshot.
    */
  var SnapshotType: js.UndefOr[String] = js.undefined
  /**
    * If the DB cluster snapshot was copied from a source DB cluster snapshot, the ARN for the source DB cluster snapshot; otherwise, a null value.
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
    * Provides the virtual private cloud (VPC) ID that is associated with the DB cluster snapshot.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}

object DBClusterSnapshot {
  @scala.inline
  def apply(
    AvailabilityZones: AvailabilityZones = null,
    ClusterCreateTime: TStamp = null,
    DBClusterIdentifier: String = null,
    DBClusterSnapshotArn: String = null,
    DBClusterSnapshotIdentifier: String = null,
    Engine: String = null,
    EngineVersion: String = null,
    KmsKeyId: String = null,
    MasterUsername: String = null,
    PercentProgress: js.UndefOr[Integer] = js.undefined,
    Port: js.UndefOr[Integer] = js.undefined,
    SnapshotCreateTime: TStamp = null,
    SnapshotType: String = null,
    SourceDBClusterSnapshotArn: String = null,
    Status: String = null,
    StorageEncrypted: js.UndefOr[Boolean] = js.undefined,
    VpcId: String = null
  ): DBClusterSnapshot = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones)
    if (ClusterCreateTime != null) __obj.updateDynamic("ClusterCreateTime")(ClusterCreateTime)
    if (DBClusterIdentifier != null) __obj.updateDynamic("DBClusterIdentifier")(DBClusterIdentifier)
    if (DBClusterSnapshotArn != null) __obj.updateDynamic("DBClusterSnapshotArn")(DBClusterSnapshotArn)
    if (DBClusterSnapshotIdentifier != null) __obj.updateDynamic("DBClusterSnapshotIdentifier")(DBClusterSnapshotIdentifier)
    if (Engine != null) __obj.updateDynamic("Engine")(Engine)
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (MasterUsername != null) __obj.updateDynamic("MasterUsername")(MasterUsername)
    if (!js.isUndefined(PercentProgress)) __obj.updateDynamic("PercentProgress")(PercentProgress)
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port)
    if (SnapshotCreateTime != null) __obj.updateDynamic("SnapshotCreateTime")(SnapshotCreateTime)
    if (SnapshotType != null) __obj.updateDynamic("SnapshotType")(SnapshotType)
    if (SourceDBClusterSnapshotArn != null) __obj.updateDynamic("SourceDBClusterSnapshotArn")(SourceDBClusterSnapshotArn)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (!js.isUndefined(StorageEncrypted)) __obj.updateDynamic("StorageEncrypted")(StorageEncrypted)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[DBClusterSnapshot]
  }
}

