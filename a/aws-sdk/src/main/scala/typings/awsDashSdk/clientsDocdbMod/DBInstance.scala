package typings.awsDashSdk.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBInstance extends js.Object {
  /**
    * Indicates that minor version patches are applied automatically.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies the name of the Availability Zone that the DB instance is located in.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * Specifies the number of days for which automatic DB snapshots are retained.
    */
  var BackupRetentionPeriod: js.UndefOr[Integer] = js.undefined
  /**
    * Contains the name of the DB cluster that the DB instance is a member of if the DB instance is a member of a DB cluster.
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the DB instance.
    */
  var DBInstanceArn: js.UndefOr[String] = js.undefined
  /**
    * Contains the name of the compute and memory capacity class of the DB instance.
    */
  var DBInstanceClass: js.UndefOr[String] = js.undefined
  /**
    * Contains a user-provided database identifier. This identifier is the unique key that identifies a DB instance.
    */
  var DBInstanceIdentifier: js.UndefOr[String] = js.undefined
  /**
    * Specifies the current state of this database.
    */
  var DBInstanceStatus: js.UndefOr[String] = js.undefined
  /**
    * Specifies information on the subnet group that is associated with the DB instance, including the name, description, and subnets in the subnet group.
    */
  var DBSubnetGroup: js.UndefOr[typings.awsDashSdk.clientsDocdbMod.DBSubnetGroup] = js.undefined
  /**
    * The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB instance is accessed.
    */
  var DbiResourceId: js.UndefOr[String] = js.undefined
  /**
    * A list of log types that this DB instance is configured to export to Amazon CloudWatch Logs.
    */
  var EnabledCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined
  /**
    * Specifies the connection endpoint.
    */
  var Endpoint: js.UndefOr[typings.awsDashSdk.clientsDocdbMod.Endpoint] = js.undefined
  /**
    * Provides the name of the database engine to be used for this DB instance.
    */
  var Engine: js.UndefOr[String] = js.undefined
  /**
    * Indicates the database engine version.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  /**
    * Provides the date and time that the DB instance was created.
    */
  var InstanceCreateTime: js.UndefOr[TStamp] = js.undefined
  /**
    *  If StorageEncrypted is true, the AWS KMS key identifier for the encrypted DB instance. 
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  /**
    * Specifies the latest time to which a database can be restored with point-in-time restore.
    */
  var LatestRestorableTime: js.UndefOr[TStamp] = js.undefined
  /**
    * Specifies that changes to the DB instance are pending. This element is included only when changes are pending. Specific changes are identified by subelements.
    */
  var PendingModifiedValues: js.UndefOr[typings.awsDashSdk.clientsDocdbMod.PendingModifiedValues] = js.undefined
  /**
    *  Specifies the daily time range during which automated backups are created if automated backups are enabled, as determined by the BackupRetentionPeriod. 
    */
  var PreferredBackupWindow: js.UndefOr[String] = js.undefined
  /**
    * Specifies the weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
  /**
    * A value that specifies the order in which an Amazon DocumentDB replica is promoted to the primary instance after a failure of the existing primary instance.
    */
  var PromotionTier: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * Specifies the availability options for the DB instance. A value of true specifies an internet-facing instance with a publicly resolvable DNS name, which resolves to a public IP address. A value of false specifies an internal instance with a DNS name that resolves to a private IP address.
    */
  var PubliclyAccessible: js.UndefOr[Boolean] = js.undefined
  /**
    * The status of a read replica. If the instance is not a read replica, this is blank.
    */
  var StatusInfos: js.UndefOr[DBInstanceStatusInfoList] = js.undefined
  /**
    * Specifies whether the DB instance is encrypted.
    */
  var StorageEncrypted: js.UndefOr[Boolean] = js.undefined
  /**
    * Provides a list of VPC security group elements that the DB instance belongs to.
    */
  var VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined
}

object DBInstance {
  @scala.inline
  def apply(
    AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.undefined,
    AvailabilityZone: String = null,
    BackupRetentionPeriod: js.UndefOr[Integer] = js.undefined,
    DBClusterIdentifier: String = null,
    DBInstanceArn: String = null,
    DBInstanceClass: String = null,
    DBInstanceIdentifier: String = null,
    DBInstanceStatus: String = null,
    DBSubnetGroup: DBSubnetGroup = null,
    DbiResourceId: String = null,
    EnabledCloudwatchLogsExports: LogTypeList = null,
    Endpoint: Endpoint = null,
    Engine: String = null,
    EngineVersion: String = null,
    InstanceCreateTime: TStamp = null,
    KmsKeyId: String = null,
    LatestRestorableTime: TStamp = null,
    PendingModifiedValues: PendingModifiedValues = null,
    PreferredBackupWindow: String = null,
    PreferredMaintenanceWindow: String = null,
    PromotionTier: js.UndefOr[IntegerOptional] = js.undefined,
    PubliclyAccessible: js.UndefOr[Boolean] = js.undefined,
    StatusInfos: DBInstanceStatusInfoList = null,
    StorageEncrypted: js.UndefOr[Boolean] = js.undefined,
    VpcSecurityGroups: VpcSecurityGroupMembershipList = null
  ): DBInstance = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoMinorVersionUpgrade)) __obj.updateDynamic("AutoMinorVersionUpgrade")(AutoMinorVersionUpgrade)
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (!js.isUndefined(BackupRetentionPeriod)) __obj.updateDynamic("BackupRetentionPeriod")(BackupRetentionPeriod)
    if (DBClusterIdentifier != null) __obj.updateDynamic("DBClusterIdentifier")(DBClusterIdentifier)
    if (DBInstanceArn != null) __obj.updateDynamic("DBInstanceArn")(DBInstanceArn)
    if (DBInstanceClass != null) __obj.updateDynamic("DBInstanceClass")(DBInstanceClass)
    if (DBInstanceIdentifier != null) __obj.updateDynamic("DBInstanceIdentifier")(DBInstanceIdentifier)
    if (DBInstanceStatus != null) __obj.updateDynamic("DBInstanceStatus")(DBInstanceStatus)
    if (DBSubnetGroup != null) __obj.updateDynamic("DBSubnetGroup")(DBSubnetGroup)
    if (DbiResourceId != null) __obj.updateDynamic("DbiResourceId")(DbiResourceId)
    if (EnabledCloudwatchLogsExports != null) __obj.updateDynamic("EnabledCloudwatchLogsExports")(EnabledCloudwatchLogsExports)
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint)
    if (Engine != null) __obj.updateDynamic("Engine")(Engine)
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (InstanceCreateTime != null) __obj.updateDynamic("InstanceCreateTime")(InstanceCreateTime)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (LatestRestorableTime != null) __obj.updateDynamic("LatestRestorableTime")(LatestRestorableTime)
    if (PendingModifiedValues != null) __obj.updateDynamic("PendingModifiedValues")(PendingModifiedValues)
    if (PreferredBackupWindow != null) __obj.updateDynamic("PreferredBackupWindow")(PreferredBackupWindow)
    if (PreferredMaintenanceWindow != null) __obj.updateDynamic("PreferredMaintenanceWindow")(PreferredMaintenanceWindow)
    if (!js.isUndefined(PromotionTier)) __obj.updateDynamic("PromotionTier")(PromotionTier)
    if (!js.isUndefined(PubliclyAccessible)) __obj.updateDynamic("PubliclyAccessible")(PubliclyAccessible)
    if (StatusInfos != null) __obj.updateDynamic("StatusInfos")(StatusInfos)
    if (!js.isUndefined(StorageEncrypted)) __obj.updateDynamic("StorageEncrypted")(StorageEncrypted)
    if (VpcSecurityGroups != null) __obj.updateDynamic("VpcSecurityGroups")(VpcSecurityGroups)
    __obj.asInstanceOf[DBInstance]
  }
}

