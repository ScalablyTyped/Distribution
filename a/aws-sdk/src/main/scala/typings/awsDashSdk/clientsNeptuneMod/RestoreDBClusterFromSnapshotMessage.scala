package typings.awsDashSdk.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreDBClusterFromSnapshotMessage extends js.Object {
  /**
    * Provides the list of EC2 Availability Zones that instances in the restored DB cluster can be created in.
    */
  var AvailabilityZones: js.UndefOr[typings.awsDashSdk.clientsNeptuneMod.AvailabilityZones] = js.undefined
  /**
    * The name of the DB cluster to create from the DB snapshot or DB cluster snapshot. This parameter isn't case-sensitive. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens   First character must be a letter   Cannot end with a hyphen or contain two consecutive hyphens   Example: my-snapshot-id 
    */
  var DBClusterIdentifier: String
  /**
    * The name of the DB cluster parameter group to associate with the new DB cluster. Constraints:   If supplied, must match the name of an existing DBClusterParameterGroup.  
    */
  var DBClusterParameterGroupName: js.UndefOr[String] = js.undefined
  /**
    * The name of the DB subnet group to use for the new DB cluster. Constraints: If supplied, must match the name of an existing DBSubnetGroup. Example: mySubnetgroup 
    */
  var DBSubnetGroupName: js.UndefOr[String] = js.undefined
  /**
    * Not supported.
    */
  var DatabaseName: js.UndefOr[String] = js.undefined
  /**
    * The list of logs that the restored DB cluster is to export to Amazon CloudWatch Logs.
    */
  var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined
  /**
    * True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and otherwise false. Default: false 
    */
  var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * The database engine to use for the new DB cluster. Default: The same as source Constraint: Must be compatible with the engine of the source
    */
  var Engine: String
  /**
    * The version of the database engine to use for the new DB cluster.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  /**
    * The AWS KMS key identifier to use when restoring an encrypted DB cluster from a DB snapshot or DB cluster snapshot. The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are restoring a DB cluster with the same AWS account that owns the KMS encryption key used to encrypt the new DB cluster, then you can use the KMS key alias instead of the ARN for the KMS encryption key. If you do not specify a value for the KmsKeyId parameter, then the following will occur:   If the DB snapshot or DB cluster snapshot in SnapshotIdentifier is encrypted, then the restored DB cluster is encrypted using the KMS key that was used to encrypt the DB snapshot or DB cluster snapshot.   If the DB snapshot or DB cluster snapshot in SnapshotIdentifier is not encrypted, then the restored DB cluster is not encrypted.  
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  /**
    * The name of the option group to use for the restored DB cluster.
    */
  var OptionGroupName: js.UndefOr[String] = js.undefined
  /**
    * The port number on which the new DB cluster accepts connections. Constraints: Value must be 1150-65535  Default: The same port as the original DB cluster.
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The identifier for the DB snapshot or DB cluster snapshot to restore from. You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster snapshot. However, you can use only the ARN to specify a DB snapshot. Constraints:   Must match the identifier of an existing Snapshot.  
    */
  var SnapshotIdentifier: String
  /**
    * The tags to be assigned to the restored DB cluster.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * A list of VPC security groups that the new DB cluster will belong to.
    */
  var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
}

object RestoreDBClusterFromSnapshotMessage {
  @scala.inline
  def apply(
    DBClusterIdentifier: String,
    Engine: String,
    SnapshotIdentifier: String,
    AvailabilityZones: AvailabilityZones = null,
    DBClusterParameterGroupName: String = null,
    DBSubnetGroupName: String = null,
    DatabaseName: String = null,
    EnableCloudwatchLogsExports: LogTypeList = null,
    EnableIAMDatabaseAuthentication: js.UndefOr[scala.Boolean] = js.undefined,
    EngineVersion: String = null,
    KmsKeyId: String = null,
    OptionGroupName: String = null,
    Port: Int | scala.Double = null,
    Tags: TagList = null,
    VpcSecurityGroupIds: VpcSecurityGroupIdList = null
  ): RestoreDBClusterFromSnapshotMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier, Engine = Engine, SnapshotIdentifier = SnapshotIdentifier)
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones)
    if (DBClusterParameterGroupName != null) __obj.updateDynamic("DBClusterParameterGroupName")(DBClusterParameterGroupName)
    if (DBSubnetGroupName != null) __obj.updateDynamic("DBSubnetGroupName")(DBSubnetGroupName)
    if (DatabaseName != null) __obj.updateDynamic("DatabaseName")(DatabaseName)
    if (EnableCloudwatchLogsExports != null) __obj.updateDynamic("EnableCloudwatchLogsExports")(EnableCloudwatchLogsExports)
    if (!js.isUndefined(EnableIAMDatabaseAuthentication)) __obj.updateDynamic("EnableIAMDatabaseAuthentication")(EnableIAMDatabaseAuthentication)
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (OptionGroupName != null) __obj.updateDynamic("OptionGroupName")(OptionGroupName)
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (VpcSecurityGroupIds != null) __obj.updateDynamic("VpcSecurityGroupIds")(VpcSecurityGroupIds)
    __obj.asInstanceOf[RestoreDBClusterFromSnapshotMessage]
  }
}

