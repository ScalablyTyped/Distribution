package typings.awsDashSdk.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDBClusterMessage extends js.Object {
  /**
    * A list of EC2 Availability Zones that instances in the DB cluster can be created in.
    */
  var AvailabilityZones: js.UndefOr[typings.awsDashSdk.clientsNeptuneMod.AvailabilityZones] = js.undefined
  /**
    * The number of days for which automated backups are retained. You must specify a minimum value of 1. Default: 1 Constraints:   Must be a value from 1 to 35  
    */
  var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * A value that indicates that the DB cluster should be associated with the specified CharacterSet.
    */
  var CharacterSetName: js.UndefOr[String] = js.undefined
  /**
    * The DB cluster identifier. This parameter is stored as a lowercase string. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Example: my-cluster1 
    */
  var DBClusterIdentifier: String
  /**
    *  The name of the DB cluster parameter group to associate with this DB cluster. If this argument is omitted, the default is used. Constraints:   If supplied, must match the name of an existing DBClusterParameterGroup.  
    */
  var DBClusterParameterGroupName: js.UndefOr[String] = js.undefined
  /**
    * A DB subnet group to associate with this DB cluster. Constraints: Must match the name of an existing DBSubnetGroup. Must not be default. Example: mySubnetgroup 
    */
  var DBSubnetGroupName: js.UndefOr[String] = js.undefined
  /**
    * The name for your database of up to 64 alpha-numeric characters. If you do not provide a name, Amazon Neptune will not create a database in the DB cluster you are creating.
    */
  var DatabaseName: js.UndefOr[String] = js.undefined
  /**
    * The list of log types that need to be enabled for exporting to CloudWatch Logs.
    */
  var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined
  /**
    * True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and otherwise false. Default: false 
    */
  var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * The name of the database engine to be used for this DB cluster. Valid Values: neptune 
    */
  var Engine: String
  /**
    * The version number of the database engine to use. Example: 1.0.1 
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  /**
    * The AWS KMS key identifier for an encrypted DB cluster. The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a DB cluster with the same AWS account that owns the KMS encryption key used to encrypt the new DB cluster, then you can use the KMS key alias instead of the ARN for the KMS encryption key. If an encryption key is not specified in KmsKeyId:   If ReplicationSourceIdentifier identifies an encrypted source, then Amazon Neptune will use the encryption key used to encrypt the source. Otherwise, Amazon Neptune will use your default encryption key.   If the StorageEncrypted parameter is true and ReplicationSourceIdentifier is not specified, then Amazon Neptune will use your default encryption key.   AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS Region. If you create a Read Replica of an encrypted DB cluster in another AWS Region, you must set KmsKeyId to a KMS key ID that is valid in the destination AWS Region. This key is used to encrypt the Read Replica in that AWS Region.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  /**
    * The password for the master database user. This password can contain any printable ASCII character except "/", """, or "@". Constraints: Must contain from 8 to 41 characters.
    */
  var MasterUserPassword: js.UndefOr[String] = js.undefined
  /**
    * The name of the master user for the DB cluster. Constraints:   Must be 1 to 16 letters or numbers.   First character must be a letter.   Cannot be a reserved word for the chosen database engine.  
    */
  var MasterUsername: js.UndefOr[String] = js.undefined
  /**
    * A value that indicates that the DB cluster should be associated with the specified option group. Permanent options can't be removed from an option group. The option group can't be removed from a DB cluster once it is associated with a DB cluster.
    */
  var OptionGroupName: js.UndefOr[String] = js.undefined
  /**
    * The port number on which the instances in the DB cluster accept connections.  Default: 8182 
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * This parameter is not currently supported.
    */
  var PreSignedUrl: js.UndefOr[String] = js.undefined
  /**
    * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter. The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. To see the time blocks available, see  Adjusting the Preferred Maintenance Window in the Amazon Neptune User Guide.  Constraints:   Must be in the format hh24:mi-hh24:mi.   Must be in Universal Coordinated Time (UTC).   Must not conflict with the preferred maintenance window.   Must be at least 30 minutes.  
    */
  var PreferredBackupWindow: js.UndefOr[String] = js.undefined
  /**
    * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC). Format: ddd:hh24:mi-ddd:hh24:mi  The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region, occurring on a random day of the week. To see the time blocks available, see  Adjusting the Preferred Maintenance Window in the Amazon Neptune User Guide.  Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun. Constraints: Minimum 30-minute window.
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the source DB instance or DB cluster if this DB cluster is created as a Read Replica.
    */
  var ReplicationSourceIdentifier: js.UndefOr[String] = js.undefined
  /**
    * Specifies whether the DB cluster is encrypted.
    */
  var StorageEncrypted: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * The tags to assign to the new DB cluster.
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
    AvailabilityZones: AvailabilityZones = null,
    BackupRetentionPeriod: Int | scala.Double = null,
    CharacterSetName: String = null,
    DBClusterParameterGroupName: String = null,
    DBSubnetGroupName: String = null,
    DatabaseName: String = null,
    EnableCloudwatchLogsExports: LogTypeList = null,
    EnableIAMDatabaseAuthentication: js.UndefOr[scala.Boolean] = js.undefined,
    EngineVersion: String = null,
    KmsKeyId: String = null,
    MasterUserPassword: String = null,
    MasterUsername: String = null,
    OptionGroupName: String = null,
    Port: Int | scala.Double = null,
    PreSignedUrl: String = null,
    PreferredBackupWindow: String = null,
    PreferredMaintenanceWindow: String = null,
    ReplicationSourceIdentifier: String = null,
    StorageEncrypted: js.UndefOr[scala.Boolean] = js.undefined,
    Tags: TagList = null,
    VpcSecurityGroupIds: VpcSecurityGroupIdList = null
  ): CreateDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier, Engine = Engine)
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones)
    if (BackupRetentionPeriod != null) __obj.updateDynamic("BackupRetentionPeriod")(BackupRetentionPeriod.asInstanceOf[js.Any])
    if (CharacterSetName != null) __obj.updateDynamic("CharacterSetName")(CharacterSetName)
    if (DBClusterParameterGroupName != null) __obj.updateDynamic("DBClusterParameterGroupName")(DBClusterParameterGroupName)
    if (DBSubnetGroupName != null) __obj.updateDynamic("DBSubnetGroupName")(DBSubnetGroupName)
    if (DatabaseName != null) __obj.updateDynamic("DatabaseName")(DatabaseName)
    if (EnableCloudwatchLogsExports != null) __obj.updateDynamic("EnableCloudwatchLogsExports")(EnableCloudwatchLogsExports)
    if (!js.isUndefined(EnableIAMDatabaseAuthentication)) __obj.updateDynamic("EnableIAMDatabaseAuthentication")(EnableIAMDatabaseAuthentication)
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (MasterUserPassword != null) __obj.updateDynamic("MasterUserPassword")(MasterUserPassword)
    if (MasterUsername != null) __obj.updateDynamic("MasterUsername")(MasterUsername)
    if (OptionGroupName != null) __obj.updateDynamic("OptionGroupName")(OptionGroupName)
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    if (PreSignedUrl != null) __obj.updateDynamic("PreSignedUrl")(PreSignedUrl)
    if (PreferredBackupWindow != null) __obj.updateDynamic("PreferredBackupWindow")(PreferredBackupWindow)
    if (PreferredMaintenanceWindow != null) __obj.updateDynamic("PreferredMaintenanceWindow")(PreferredMaintenanceWindow)
    if (ReplicationSourceIdentifier != null) __obj.updateDynamic("ReplicationSourceIdentifier")(ReplicationSourceIdentifier)
    if (!js.isUndefined(StorageEncrypted)) __obj.updateDynamic("StorageEncrypted")(StorageEncrypted)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (VpcSecurityGroupIds != null) __obj.updateDynamic("VpcSecurityGroupIds")(VpcSecurityGroupIds)
    __obj.asInstanceOf[CreateDBClusterMessage]
  }
}

