package typings
package awsDashSdkLib.clientsOpsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Backup extends js.Object {
  /**
    * The ARN of the backup. 
    */
  var BackupArn: js.UndefOr[String] = js.undefined
  /**
    *  The generated ID of the backup. Example: myServerName-yyyyMMddHHmmssSSS 
    */
  var BackupId: js.UndefOr[BackupId] = js.undefined
  /**
    *  The backup type. Valid values are automated or manual. 
    */
  var BackupType: js.UndefOr[BackupType] = js.undefined
  /**
    *  The time stamp when the backup was created in the database. Example: 2016-07-29T13:38:47.520Z 
    */
  var CreatedAt: js.UndefOr[Timestamp] = js.undefined
  /**
    *  A user-provided description for a manual backup. This field is empty for automated backups. 
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    *  The engine type that is obtained from the server when the backup is created. 
    */
  var Engine: js.UndefOr[String] = js.undefined
  /**
    *  The engine model that is obtained from the server when the backup is created. 
    */
  var EngineModel: js.UndefOr[String] = js.undefined
  /**
    *  The engine version that is obtained from the server when the backup is created. 
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  /**
    *  The EC2 instance profile ARN that is obtained from the server when the backup is created. Because this value is stored, you are not required to provide the InstanceProfileArn again if you restore a backup. 
    */
  var InstanceProfileArn: js.UndefOr[String] = js.undefined
  /**
    *  The instance type that is obtained from the server when the backup is created. 
    */
  var InstanceType: js.UndefOr[String] = js.undefined
  /**
    *  The key pair that is obtained from the server when the backup is created. 
    */
  var KeyPair: js.UndefOr[String] = js.undefined
  /**
    *  The preferred backup period that is obtained from the server when the backup is created. 
    */
  var PreferredBackupWindow: js.UndefOr[TimeWindowDefinition] = js.undefined
  /**
    *  The preferred maintenance period that is obtained from the server when the backup is created. 
    */
  var PreferredMaintenanceWindow: js.UndefOr[TimeWindowDefinition] = js.undefined
  /**
    *  This field is deprecated and is no longer used. 
    */
  var S3DataSize: js.UndefOr[Integer] = js.undefined
  /**
    *  This field is deprecated and is no longer used. 
    */
  var S3DataUrl: js.UndefOr[String] = js.undefined
  /**
    *  The Amazon S3 URL of the backup's log file. 
    */
  var S3LogUrl: js.UndefOr[String] = js.undefined
  /**
    *  The security group IDs that are obtained from the server when the backup is created. 
    */
  var SecurityGroupIds: js.UndefOr[Strings] = js.undefined
  /**
    *  The name of the server from which the backup was made. 
    */
  var ServerName: js.UndefOr[ServerName] = js.undefined
  /**
    *  The service role ARN that is obtained from the server when the backup is created. 
    */
  var ServiceRoleArn: js.UndefOr[String] = js.undefined
  /**
    * The status of a backup while in progress. 
    */
  var Status: js.UndefOr[BackupStatus] = js.undefined
  /**
    *  An informational message about backup status. 
    */
  var StatusDescription: js.UndefOr[String] = js.undefined
  /**
    *  The subnet IDs that are obtained from the server when the backup is created. 
    */
  var SubnetIds: js.UndefOr[Strings] = js.undefined
  /**
    *  The version of AWS OpsWorks CM-specific tools that is obtained from the server when the backup is created. 
    */
  var ToolsVersion: js.UndefOr[String] = js.undefined
  /**
    *  The IAM user ARN of the requester for manual backups. This field is empty for automated backups. 
    */
  var UserArn: js.UndefOr[String] = js.undefined
}

object Backup {
  @scala.inline
  def apply(
    BackupArn: String = null,
    BackupId: BackupId = null,
    BackupType: BackupType = null,
    CreatedAt: Timestamp = null,
    Description: String = null,
    Engine: String = null,
    EngineModel: String = null,
    EngineVersion: String = null,
    InstanceProfileArn: String = null,
    InstanceType: String = null,
    KeyPair: String = null,
    PreferredBackupWindow: TimeWindowDefinition = null,
    PreferredMaintenanceWindow: TimeWindowDefinition = null,
    S3DataSize: js.UndefOr[Integer] = js.undefined,
    S3DataUrl: String = null,
    S3LogUrl: String = null,
    SecurityGroupIds: Strings = null,
    ServerName: ServerName = null,
    ServiceRoleArn: String = null,
    Status: BackupStatus = null,
    StatusDescription: String = null,
    SubnetIds: Strings = null,
    ToolsVersion: String = null,
    UserArn: String = null
  ): Backup = {
    val __obj = js.Dynamic.literal()
    if (BackupArn != null) __obj.updateDynamic("BackupArn")(BackupArn)
    if (BackupId != null) __obj.updateDynamic("BackupId")(BackupId)
    if (BackupType != null) __obj.updateDynamic("BackupType")(BackupType.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Engine != null) __obj.updateDynamic("Engine")(Engine)
    if (EngineModel != null) __obj.updateDynamic("EngineModel")(EngineModel)
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (InstanceProfileArn != null) __obj.updateDynamic("InstanceProfileArn")(InstanceProfileArn)
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType)
    if (KeyPair != null) __obj.updateDynamic("KeyPair")(KeyPair)
    if (PreferredBackupWindow != null) __obj.updateDynamic("PreferredBackupWindow")(PreferredBackupWindow)
    if (PreferredMaintenanceWindow != null) __obj.updateDynamic("PreferredMaintenanceWindow")(PreferredMaintenanceWindow)
    if (!js.isUndefined(S3DataSize)) __obj.updateDynamic("S3DataSize")(S3DataSize)
    if (S3DataUrl != null) __obj.updateDynamic("S3DataUrl")(S3DataUrl)
    if (S3LogUrl != null) __obj.updateDynamic("S3LogUrl")(S3LogUrl)
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds)
    if (ServerName != null) __obj.updateDynamic("ServerName")(ServerName)
    if (ServiceRoleArn != null) __obj.updateDynamic("ServiceRoleArn")(ServiceRoleArn)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusDescription != null) __obj.updateDynamic("StatusDescription")(StatusDescription)
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds)
    if (ToolsVersion != null) __obj.updateDynamic("ToolsVersion")(ToolsVersion)
    if (UserArn != null) __obj.updateDynamic("UserArn")(UserArn)
    __obj.asInstanceOf[Backup]
  }
}

