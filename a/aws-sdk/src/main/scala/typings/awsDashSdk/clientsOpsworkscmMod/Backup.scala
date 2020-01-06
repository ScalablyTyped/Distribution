package typings.awsDashSdk.clientsOpsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Backup extends js.Object {
  /**
    * The ARN of the backup. 
    */
  var BackupArn: js.UndefOr[String] = js.native
  /**
    *  The generated ID of the backup. Example: myServerName-yyyyMMddHHmmssSSS 
    */
  var BackupId: js.UndefOr[typings.awsDashSdk.clientsOpsworkscmMod.BackupId] = js.native
  /**
    *  The backup type. Valid values are automated or manual. 
    */
  var BackupType: js.UndefOr[typings.awsDashSdk.clientsOpsworkscmMod.BackupType] = js.native
  /**
    *  The time stamp when the backup was created in the database. Example: 2016-07-29T13:38:47.520Z 
    */
  var CreatedAt: js.UndefOr[Timestamp] = js.native
  /**
    *  A user-provided description for a manual backup. This field is empty for automated backups. 
    */
  var Description: js.UndefOr[String] = js.native
  /**
    *  The engine type that is obtained from the server when the backup is created. 
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    *  The engine model that is obtained from the server when the backup is created. 
    */
  var EngineModel: js.UndefOr[String] = js.native
  /**
    *  The engine version that is obtained from the server when the backup is created. 
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    *  The EC2 instance profile ARN that is obtained from the server when the backup is created. Because this value is stored, you are not required to provide the InstanceProfileArn again if you restore a backup. 
    */
  var InstanceProfileArn: js.UndefOr[String] = js.native
  /**
    *  The instance type that is obtained from the server when the backup is created. 
    */
  var InstanceType: js.UndefOr[String] = js.native
  /**
    *  The key pair that is obtained from the server when the backup is created. 
    */
  var KeyPair: js.UndefOr[String] = js.native
  /**
    *  The preferred backup period that is obtained from the server when the backup is created. 
    */
  var PreferredBackupWindow: js.UndefOr[TimeWindowDefinition] = js.native
  /**
    *  The preferred maintenance period that is obtained from the server when the backup is created. 
    */
  var PreferredMaintenanceWindow: js.UndefOr[TimeWindowDefinition] = js.native
  /**
    *  This field is deprecated and is no longer used. 
    */
  var S3DataSize: js.UndefOr[Integer] = js.native
  /**
    *  This field is deprecated and is no longer used. 
    */
  var S3DataUrl: js.UndefOr[String] = js.native
  /**
    *  The Amazon S3 URL of the backup's log file. 
    */
  var S3LogUrl: js.UndefOr[String] = js.native
  /**
    *  The security group IDs that are obtained from the server when the backup is created. 
    */
  var SecurityGroupIds: js.UndefOr[Strings] = js.native
  /**
    *  The name of the server from which the backup was made. 
    */
  var ServerName: js.UndefOr[typings.awsDashSdk.clientsOpsworkscmMod.ServerName] = js.native
  /**
    *  The service role ARN that is obtained from the server when the backup is created. 
    */
  var ServiceRoleArn: js.UndefOr[String] = js.native
  /**
    * The status of a backup while in progress. 
    */
  var Status: js.UndefOr[BackupStatus] = js.native
  /**
    *  An informational message about backup status. 
    */
  var StatusDescription: js.UndefOr[String] = js.native
  /**
    *  The subnet IDs that are obtained from the server when the backup is created. 
    */
  var SubnetIds: js.UndefOr[Strings] = js.native
  /**
    *  The version of AWS OpsWorks CM-specific tools that is obtained from the server when the backup is created. 
    */
  var ToolsVersion: js.UndefOr[String] = js.native
  /**
    *  The IAM user ARN of the requester for manual backups. This field is empty for automated backups. 
    */
  var UserArn: js.UndefOr[String] = js.native
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
    S3DataSize: Int | Double = null,
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
    if (BackupArn != null) __obj.updateDynamic("BackupArn")(BackupArn.asInstanceOf[js.Any])
    if (BackupId != null) __obj.updateDynamic("BackupId")(BackupId.asInstanceOf[js.Any])
    if (BackupType != null) __obj.updateDynamic("BackupType")(BackupType.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Engine != null) __obj.updateDynamic("Engine")(Engine.asInstanceOf[js.Any])
    if (EngineModel != null) __obj.updateDynamic("EngineModel")(EngineModel.asInstanceOf[js.Any])
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion.asInstanceOf[js.Any])
    if (InstanceProfileArn != null) __obj.updateDynamic("InstanceProfileArn")(InstanceProfileArn.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (KeyPair != null) __obj.updateDynamic("KeyPair")(KeyPair.asInstanceOf[js.Any])
    if (PreferredBackupWindow != null) __obj.updateDynamic("PreferredBackupWindow")(PreferredBackupWindow.asInstanceOf[js.Any])
    if (PreferredMaintenanceWindow != null) __obj.updateDynamic("PreferredMaintenanceWindow")(PreferredMaintenanceWindow.asInstanceOf[js.Any])
    if (S3DataSize != null) __obj.updateDynamic("S3DataSize")(S3DataSize.asInstanceOf[js.Any])
    if (S3DataUrl != null) __obj.updateDynamic("S3DataUrl")(S3DataUrl.asInstanceOf[js.Any])
    if (S3LogUrl != null) __obj.updateDynamic("S3LogUrl")(S3LogUrl.asInstanceOf[js.Any])
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds.asInstanceOf[js.Any])
    if (ServerName != null) __obj.updateDynamic("ServerName")(ServerName.asInstanceOf[js.Any])
    if (ServiceRoleArn != null) __obj.updateDynamic("ServiceRoleArn")(ServiceRoleArn.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusDescription != null) __obj.updateDynamic("StatusDescription")(StatusDescription.asInstanceOf[js.Any])
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds.asInstanceOf[js.Any])
    if (ToolsVersion != null) __obj.updateDynamic("ToolsVersion")(ToolsVersion.asInstanceOf[js.Any])
    if (UserArn != null) __obj.updateDynamic("UserArn")(UserArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Backup]
  }
}

