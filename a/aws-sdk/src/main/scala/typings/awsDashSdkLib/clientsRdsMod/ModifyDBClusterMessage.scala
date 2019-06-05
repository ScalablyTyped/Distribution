package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyDBClusterMessage extends js.Object {
  /**
    * A value that indicates whether the modifications in this request and any pending modifications are asynchronously applied as soon as possible, regardless of the PreferredMaintenanceWindow setting for the DB cluster. If this parameter is disabled, changes to the DB cluster are applied during the next maintenance window. The ApplyImmediately parameter only affects the EnableIAMDatabaseAuthentication, MasterUserPassword, and NewDBClusterIdentifier values. If the ApplyImmediately parameter is disabled, then changes to the EnableIAMDatabaseAuthentication, MasterUserPassword, and NewDBClusterIdentifier values are applied during the next maintenance window. All other changes are applied immediately, regardless of the value of the ApplyImmediately parameter. By default, this parameter is disabled.
    */
  var ApplyImmediately: js.UndefOr[Boolean] = js.undefined
  /**
    * The target backtrack window, in seconds. To disable backtracking, set this value to 0. Default: 0 Constraints:   If specified, this value must be set to a number from 0 to 259,200 (72 hours).  
    */
  var BacktrackWindow: js.UndefOr[LongOptional] = js.undefined
  /**
    * The number of days for which automated backups are retained. You must specify a minimum value of 1. Default: 1 Constraints:   Must be a value from 1 to 35  
    */
  var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB cluster.
    */
  var CloudwatchLogsExportConfiguration: js.UndefOr[CloudwatchLogsExportConfiguration] = js.undefined
  /**
    * A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The default is not to copy them.
    */
  var CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * The DB cluster identifier for the cluster being modified. This parameter is not case-sensitive. Constraints:   Must match the identifier of an existing DBCluster.  
    */
  var DBClusterIdentifier: String
  /**
    * The name of the DB cluster parameter group to use for the DB cluster.
    */
  var DBClusterParameterGroupName: js.UndefOr[String] = js.undefined
  /**
    * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when deletion protection is enabled. By default, deletion protection is disabled. 
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless DB cluster. By default, the HTTP endpoint is disabled. When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the Aurora Serverless DB cluster. You can also query your database from inside the RDS console with the query editor. For more information, see Using the Data API for Aurora Serverless in the Amazon Aurora User Guide.
    */
  var EnableHttpEndpoint: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts. By default, mapping is disabled.
    */
  var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * The version number of the database engine to which you want to upgrade. Changing this parameter results in an outage. The change is applied during the next maintenance window unless ApplyImmediately is enabled. For a list of valid engine versions, use DescribeDBEngineVersions.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  /**
    * The new password for the master database user. This password can contain any printable ASCII character except "/", """, or "@". Constraints: Must contain from 8 to 41 characters.
    */
  var MasterUserPassword: js.UndefOr[String] = js.undefined
  /**
    * The new DB cluster identifier for the DB cluster when renaming a DB cluster. This value is stored as a lowercase string. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens   The first character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Example: my-cluster2 
    */
  var NewDBClusterIdentifier: js.UndefOr[String] = js.undefined
  /**
    * A value that indicates that the DB cluster should be associated with the specified option group. Changing this parameter doesn't result in an outage except in the following case, and the change is applied during the next maintenance window unless the ApplyImmediately is enabled for this request. If the parameter change results in an option group that enables OEM, this change can cause a brief (sub-second) period during which new connections are rejected but existing connections are not interrupted.  Permanent options can't be removed from an option group. The option group can't be removed from a DB cluster once it is associated with a DB cluster.
    */
  var OptionGroupName: js.UndefOr[String] = js.undefined
  /**
    * The port number on which the DB cluster accepts connections. Constraints: Value must be 1150-65535  Default: The same port as the original DB cluster.
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The daily time range during which automated backups are created if automated backups are enabled, using the BackupRetentionPeriod parameter.  The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. To see the time blocks available, see  Adjusting the Preferred DB Cluster Maintenance Window in the Amazon Aurora User Guide.  Constraints:   Must be in the format hh24:mi-hh24:mi.   Must be in Universal Coordinated Time (UTC).   Must not conflict with the preferred maintenance window.   Must be at least 30 minutes.  
    */
  var PreferredBackupWindow: js.UndefOr[String] = js.undefined
  /**
    * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC). Format: ddd:hh24:mi-ddd:hh24:mi  The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region, occurring on a random day of the week. To see the time blocks available, see  Adjusting the Preferred DB Cluster Maintenance Window in the Amazon Aurora User Guide.  Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun. Constraints: Minimum 30-minute window.
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
  /**
    * The scaling properties of the DB cluster. You can only modify scaling properties for DB clusters in serverless DB engine mode.
    */
  var ScalingConfiguration: js.UndefOr[ScalingConfiguration] = js.undefined
  /**
    * A list of VPC security groups that the DB cluster will belong to.
    */
  var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
}

object ModifyDBClusterMessage {
  @scala.inline
  def apply(
    DBClusterIdentifier: String,
    ApplyImmediately: js.UndefOr[Boolean] = js.undefined,
    BacktrackWindow: js.UndefOr[LongOptional] = js.undefined,
    BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
    CloudwatchLogsExportConfiguration: CloudwatchLogsExportConfiguration = null,
    CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined,
    DBClusterParameterGroupName: String = null,
    DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
    EnableHttpEndpoint: js.UndefOr[BooleanOptional] = js.undefined,
    EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined,
    EngineVersion: String = null,
    MasterUserPassword: String = null,
    NewDBClusterIdentifier: String = null,
    OptionGroupName: String = null,
    Port: js.UndefOr[IntegerOptional] = js.undefined,
    PreferredBackupWindow: String = null,
    PreferredMaintenanceWindow: String = null,
    ScalingConfiguration: ScalingConfiguration = null,
    VpcSecurityGroupIds: VpcSecurityGroupIdList = null
  ): ModifyDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier)
    if (!js.isUndefined(ApplyImmediately)) __obj.updateDynamic("ApplyImmediately")(ApplyImmediately)
    if (!js.isUndefined(BacktrackWindow)) __obj.updateDynamic("BacktrackWindow")(BacktrackWindow)
    if (!js.isUndefined(BackupRetentionPeriod)) __obj.updateDynamic("BackupRetentionPeriod")(BackupRetentionPeriod)
    if (CloudwatchLogsExportConfiguration != null) __obj.updateDynamic("CloudwatchLogsExportConfiguration")(CloudwatchLogsExportConfiguration)
    if (!js.isUndefined(CopyTagsToSnapshot)) __obj.updateDynamic("CopyTagsToSnapshot")(CopyTagsToSnapshot)
    if (DBClusterParameterGroupName != null) __obj.updateDynamic("DBClusterParameterGroupName")(DBClusterParameterGroupName)
    if (!js.isUndefined(DeletionProtection)) __obj.updateDynamic("DeletionProtection")(DeletionProtection)
    if (!js.isUndefined(EnableHttpEndpoint)) __obj.updateDynamic("EnableHttpEndpoint")(EnableHttpEndpoint)
    if (!js.isUndefined(EnableIAMDatabaseAuthentication)) __obj.updateDynamic("EnableIAMDatabaseAuthentication")(EnableIAMDatabaseAuthentication)
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (MasterUserPassword != null) __obj.updateDynamic("MasterUserPassword")(MasterUserPassword)
    if (NewDBClusterIdentifier != null) __obj.updateDynamic("NewDBClusterIdentifier")(NewDBClusterIdentifier)
    if (OptionGroupName != null) __obj.updateDynamic("OptionGroupName")(OptionGroupName)
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port)
    if (PreferredBackupWindow != null) __obj.updateDynamic("PreferredBackupWindow")(PreferredBackupWindow)
    if (PreferredMaintenanceWindow != null) __obj.updateDynamic("PreferredMaintenanceWindow")(PreferredMaintenanceWindow)
    if (ScalingConfiguration != null) __obj.updateDynamic("ScalingConfiguration")(ScalingConfiguration)
    if (VpcSecurityGroupIds != null) __obj.updateDynamic("VpcSecurityGroupIds")(VpcSecurityGroupIds)
    __obj.asInstanceOf[ModifyDBClusterMessage]
  }
}

