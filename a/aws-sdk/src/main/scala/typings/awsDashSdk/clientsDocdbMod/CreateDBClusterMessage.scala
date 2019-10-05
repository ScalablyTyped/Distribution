package typings.awsDashSdk.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDBClusterMessage extends js.Object {
  /**
    * A list of Amazon EC2 Availability Zones that instances in the DB cluster can be created in.
    */
  var AvailabilityZones: js.UndefOr[typings.awsDashSdk.clientsDocdbMod.AvailabilityZones] = js.undefined
  /**
    * The number of days for which automated backups are retained. You must specify a minimum value of 1. Default: 1 Constraints:   Must be a value from 1 to 35.  
    */
  var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The DB cluster identifier. This parameter is stored as a lowercase string. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   The first character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Example: my-cluster 
    */
  var DBClusterIdentifier: String
  /**
    *  The name of the DB cluster parameter group to associate with this DB cluster.
    */
  var DBClusterParameterGroupName: js.UndefOr[String] = js.undefined
  /**
    * A DB subnet group to associate with this DB cluster. Constraints: Must match the name of an existing DBSubnetGroup. Must not be default. Example: mySubnetgroup 
    */
  var DBSubnetGroupName: js.UndefOr[String] = js.undefined
  /**
    * Specifies whether this cluster can be deleted. If DeletionProtection is enabled, the cluster cannot be deleted unless it is modified and DeletionProtection is disabled. DeletionProtection protects clusters from being accidentally deleted.
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * A list of log types that need to be enabled for exporting to Amazon CloudWatch Logs.
    */
  var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined
  /**
    * The name of the database engine to be used for this DB cluster. Valid values: docdb 
    */
  var Engine: String
  /**
    * The version number of the database engine to use.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  /**
    * The AWS KMS key identifier for an encrypted DB cluster. The AWS KMS key identifier is the Amazon Resource Name (ARN) for the AWS KMS encryption key. If you are creating a DB cluster using the same AWS account that owns the AWS KMS encryption key that is used to encrypt the new DB cluster, you can use the AWS KMS key alias instead of the ARN for the AWS KMS encryption key. If an encryption key is not specified in KmsKeyId:   If ReplicationSourceIdentifier identifies an encrypted source, then Amazon DocumentDB uses the encryption key that is used to encrypt the source. Otherwise, Amazon DocumentDB uses your default encryption key.    If the StorageEncrypted parameter is true and ReplicationSourceIdentifier is not specified, Amazon DocumentDB uses your default encryption key.   AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS Region. If you create a replica of an encrypted DB cluster in another AWS Region, you must set KmsKeyId to a KMS key ID that is valid in the destination AWS Region. This key is used to encrypt the replica in that AWS Region.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  /**
    * The password for the master database user. This password can contain any printable ASCII character except forward slash (/), double quote ("), or the "at" symbol (@). Constraints: Must contain from 8 to 100 characters.
    */
  var MasterUserPassword: String
  /**
    * The name of the master user for the DB cluster. Constraints:   Must be from 1 to 63 letters or numbers.   The first character must be a letter.   Cannot be a reserved word for the chosen database engine.  
    */
  var MasterUsername: String
  /**
    * The port number on which the instances in the DB cluster accept connections.
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter.  The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region.  Constraints:   Must be in the format hh24:mi-hh24:mi.   Must be in Universal Coordinated Time (UTC).   Must not conflict with the preferred maintenance window.   Must be at least 30 minutes.  
    */
  var PreferredBackupWindow: js.UndefOr[String] = js.undefined
  /**
    * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC). Format: ddd:hh24:mi-ddd:hh24:mi  The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region, occurring on a random day of the week. Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun Constraints: Minimum 30-minute window.
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
  /**
    * Specifies whether the DB cluster is encrypted.
    */
  var StorageEncrypted: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * The tags to be assigned to the DB cluster.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * A list of EC2 VPC security groups to associate with this DB cluster.
    */
  var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
}

object CreateDBClusterMessage {
  @scala.inline
  def apply(
    DBClusterIdentifier: String,
    Engine: String,
    MasterUserPassword: String,
    MasterUsername: String,
    AvailabilityZones: AvailabilityZones = null,
    BackupRetentionPeriod: Int | Double = null,
    DBClusterParameterGroupName: String = null,
    DBSubnetGroupName: String = null,
    DeletionProtection: js.UndefOr[scala.Boolean] = js.undefined,
    EnableCloudwatchLogsExports: LogTypeList = null,
    EngineVersion: String = null,
    KmsKeyId: String = null,
    Port: Int | Double = null,
    PreferredBackupWindow: String = null,
    PreferredMaintenanceWindow: String = null,
    StorageEncrypted: js.UndefOr[scala.Boolean] = js.undefined,
    Tags: TagList = null,
    VpcSecurityGroupIds: VpcSecurityGroupIdList = null
  ): CreateDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier, Engine = Engine, MasterUserPassword = MasterUserPassword, MasterUsername = MasterUsername)
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones)
    if (BackupRetentionPeriod != null) __obj.updateDynamic("BackupRetentionPeriod")(BackupRetentionPeriod.asInstanceOf[js.Any])
    if (DBClusterParameterGroupName != null) __obj.updateDynamic("DBClusterParameterGroupName")(DBClusterParameterGroupName)
    if (DBSubnetGroupName != null) __obj.updateDynamic("DBSubnetGroupName")(DBSubnetGroupName)
    if (!js.isUndefined(DeletionProtection)) __obj.updateDynamic("DeletionProtection")(DeletionProtection)
    if (EnableCloudwatchLogsExports != null) __obj.updateDynamic("EnableCloudwatchLogsExports")(EnableCloudwatchLogsExports)
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    if (PreferredBackupWindow != null) __obj.updateDynamic("PreferredBackupWindow")(PreferredBackupWindow)
    if (PreferredMaintenanceWindow != null) __obj.updateDynamic("PreferredMaintenanceWindow")(PreferredMaintenanceWindow)
    if (!js.isUndefined(StorageEncrypted)) __obj.updateDynamic("StorageEncrypted")(StorageEncrypted)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (VpcSecurityGroupIds != null) __obj.updateDynamic("VpcSecurityGroupIds")(VpcSecurityGroupIds)
    __obj.asInstanceOf[CreateDBClusterMessage]
  }
}

