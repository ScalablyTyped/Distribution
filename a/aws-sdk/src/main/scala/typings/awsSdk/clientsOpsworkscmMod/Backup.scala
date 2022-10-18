package typings.awsSdk.clientsOpsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Backup extends StObject {
  
  /**
    * The ARN of the backup. 
    */
  var BackupArn: js.UndefOr[String] = js.undefined
  
  /**
    *  The generated ID of the backup. Example: myServerName-yyyyMMddHHmmssSSS 
    */
  var BackupId: js.UndefOr[typings.awsSdk.clientsOpsworkscmMod.BackupId] = js.undefined
  
  /**
    *  The backup type. Valid values are automated or manual. 
    */
  var BackupType: js.UndefOr[typings.awsSdk.clientsOpsworkscmMod.BackupType] = js.undefined
  
  /**
    *  The time stamp when the backup was created in the database. Example: 2016-07-29T13:38:47.520Z 
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
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
  var ServerName: js.UndefOr[typings.awsSdk.clientsOpsworkscmMod.ServerName] = js.undefined
  
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
  
  inline def apply(): Backup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Backup]
  }
  
  extension [Self <: Backup](x: Self) {
    
    inline def setBackupArn(value: String): Self = StObject.set(x, "BackupArn", value.asInstanceOf[js.Any])
    
    inline def setBackupArnUndefined: Self = StObject.set(x, "BackupArn", js.undefined)
    
    inline def setBackupId(value: BackupId): Self = StObject.set(x, "BackupId", value.asInstanceOf[js.Any])
    
    inline def setBackupIdUndefined: Self = StObject.set(x, "BackupId", js.undefined)
    
    inline def setBackupType(value: BackupType): Self = StObject.set(x, "BackupType", value.asInstanceOf[js.Any])
    
    inline def setBackupTypeUndefined: Self = StObject.set(x, "BackupType", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineModel(value: String): Self = StObject.set(x, "EngineModel", value.asInstanceOf[js.Any])
    
    inline def setEngineModelUndefined: Self = StObject.set(x, "EngineModel", js.undefined)
    
    inline def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setInstanceProfileArn(value: String): Self = StObject.set(x, "InstanceProfileArn", value.asInstanceOf[js.Any])
    
    inline def setInstanceProfileArnUndefined: Self = StObject.set(x, "InstanceProfileArn", js.undefined)
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setKeyPair(value: String): Self = StObject.set(x, "KeyPair", value.asInstanceOf[js.Any])
    
    inline def setKeyPairUndefined: Self = StObject.set(x, "KeyPair", js.undefined)
    
    inline def setPreferredBackupWindow(value: TimeWindowDefinition): Self = StObject.set(x, "PreferredBackupWindow", value.asInstanceOf[js.Any])
    
    inline def setPreferredBackupWindowUndefined: Self = StObject.set(x, "PreferredBackupWindow", js.undefined)
    
    inline def setPreferredMaintenanceWindow(value: TimeWindowDefinition): Self = StObject.set(x, "PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    inline def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "PreferredMaintenanceWindow", js.undefined)
    
    inline def setS3DataSize(value: Integer): Self = StObject.set(x, "S3DataSize", value.asInstanceOf[js.Any])
    
    inline def setS3DataSizeUndefined: Self = StObject.set(x, "S3DataSize", js.undefined)
    
    inline def setS3DataUrl(value: String): Self = StObject.set(x, "S3DataUrl", value.asInstanceOf[js.Any])
    
    inline def setS3DataUrlUndefined: Self = StObject.set(x, "S3DataUrl", js.undefined)
    
    inline def setS3LogUrl(value: String): Self = StObject.set(x, "S3LogUrl", value.asInstanceOf[js.Any])
    
    inline def setS3LogUrlUndefined: Self = StObject.set(x, "S3LogUrl", js.undefined)
    
    inline def setSecurityGroupIds(value: Strings): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setServerName(value: ServerName): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
    
    inline def setServerNameUndefined: Self = StObject.set(x, "ServerName", js.undefined)
    
    inline def setServiceRoleArn(value: String): Self = StObject.set(x, "ServiceRoleArn", value.asInstanceOf[js.Any])
    
    inline def setServiceRoleArnUndefined: Self = StObject.set(x, "ServiceRoleArn", js.undefined)
    
    inline def setStatus(value: BackupStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusDescription(value: String): Self = StObject.set(x, "StatusDescription", value.asInstanceOf[js.Any])
    
    inline def setStatusDescriptionUndefined: Self = StObject.set(x, "StatusDescription", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setSubnetIds(value: Strings): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
    
    inline def setToolsVersion(value: String): Self = StObject.set(x, "ToolsVersion", value.asInstanceOf[js.Any])
    
    inline def setToolsVersionUndefined: Self = StObject.set(x, "ToolsVersion", js.undefined)
    
    inline def setUserArn(value: String): Self = StObject.set(x, "UserArn", value.asInstanceOf[js.Any])
    
    inline def setUserArnUndefined: Self = StObject.set(x, "UserArn", js.undefined)
  }
}
