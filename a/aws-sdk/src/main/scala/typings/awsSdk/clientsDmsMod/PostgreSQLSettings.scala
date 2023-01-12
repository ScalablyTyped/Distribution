package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostgreSQLSettings extends StObject {
  
  /**
    * For use with change data capture (CDC) only, this attribute has DMS bypass foreign keys and user triggers to reduce the time it takes to bulk load data. Example: afterConnectScript=SET session_replication_role='replica' 
    */
  var AfterConnectScript: js.UndefOr[String] = js.undefined
  
  /**
    * To capture DDL events, DMS creates various artifacts in the PostgreSQL database when the task starts. You can later remove these artifacts. If this value is set to N, you don't have to create tables or triggers on the source database.
    */
  var CaptureDdls: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Database name for the endpoint.
    */
  var DatabaseName: js.UndefOr[String] = js.undefined
  
  /**
    * The schema in which the operational DDL database artifacts are created. Example: ddlArtifactsSchema=xyzddlschema; 
    */
  var DdlArtifactsSchema: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the client statement timeout for the PostgreSQL instance, in seconds. The default value is 60 seconds. Example: executeTimeout=100; 
    */
  var ExecuteTimeout: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * When set to true, this value causes a task to fail if the actual size of a LOB column is greater than the specified LobMaxSize. If task is set to Limited LOB mode and this option is set to true, the task fails instead of truncating the LOB data.
    */
  var FailTasksOnLobTruncation: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The write-ahead log (WAL) heartbeat feature mimics a dummy transaction. By doing this, it prevents idle logical replication slots from holding onto old WAL logs, which can result in storage full situations on the source. This heartbeat keeps restart_lsn moving and prevents storage full scenarios.
    */
  var HeartbeatEnable: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Sets the WAL heartbeat frequency (in minutes).
    */
  var HeartbeatFrequency: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Sets the schema in which the heartbeat artifacts are created.
    */
  var HeartbeatSchema: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the maximum size (in KB) of any .csv file used to transfer data to PostgreSQL. Example: maxFileSize=512 
    */
  var MaxFileSize: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Endpoint connection password.
    */
  var Password: js.UndefOr[SecretString] = js.undefined
  
  /**
    * Specifies the plugin to use to create a replication slot.
    */
  var PluginName: js.UndefOr[PluginNameValue] = js.undefined
  
  /**
    * Endpoint TCP port. The default is 5432.
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The full Amazon Resource Name (ARN) of the IAM role that specifies DMS as the trusted entity and grants the required permissions to access the value in SecretsManagerSecret. The role must allow the iam:PassRole action. SecretsManagerSecret has the value of the Amazon Web Services Secrets Manager secret that allows access to the PostgreSQL endpoint.  You can specify one of two sets of values for these permissions. You can specify the values for this setting and SecretsManagerSecretId. Or you can specify clear-text values for UserName, Password, ServerName, and Port. You can't specify both. For more information on creating this SecretsManagerSecret and the SecretsManagerAccessRoleArn and SecretsManagerSecretId required to access it, see Using secrets to access Database Migration Service resources in the Database Migration Service User Guide. 
    */
  var SecretsManagerAccessRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * The full ARN, partial ARN, or friendly name of the SecretsManagerSecret that contains the PostgreSQL endpoint connection details.
    */
  var SecretsManagerSecretId: js.UndefOr[String] = js.undefined
  
  /**
    * Fully qualified domain name of the endpoint.
    */
  var ServerName: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the name of a previously created logical replication slot for a change data capture (CDC) load of the PostgreSQL source instance.  When used with the CdcStartPosition request parameter for the DMS API , this attribute also makes it possible to use native CDC start points. DMS verifies that the specified logical replication slot exists before starting the CDC load task. It also verifies that the task was created with a valid setting of CdcStartPosition. If the specified slot doesn't exist or the task doesn't have a valid CdcStartPosition setting, DMS raises an error. For more information about setting the CdcStartPosition request parameter, see Determining a CDC native start point in the Database Migration Service User Guide. For more information about using CdcStartPosition, see CreateReplicationTask, StartReplicationTask, and ModifyReplicationTask.
    */
  var SlotName: js.UndefOr[String] = js.undefined
  
  /**
    * Use the TrimSpaceInChar source endpoint setting to trim data on CHAR and NCHAR data types during migration. The default value is true.
    */
  var TrimSpaceInChar: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Endpoint connection user name.
    */
  var Username: js.UndefOr[String] = js.undefined
}
object PostgreSQLSettings {
  
  inline def apply(): PostgreSQLSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostgreSQLSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostgreSQLSettings] (val x: Self) extends AnyVal {
    
    inline def setAfterConnectScript(value: String): Self = StObject.set(x, "AfterConnectScript", value.asInstanceOf[js.Any])
    
    inline def setAfterConnectScriptUndefined: Self = StObject.set(x, "AfterConnectScript", js.undefined)
    
    inline def setCaptureDdls(value: BooleanOptional): Self = StObject.set(x, "CaptureDdls", value.asInstanceOf[js.Any])
    
    inline def setCaptureDdlsUndefined: Self = StObject.set(x, "CaptureDdls", js.undefined)
    
    inline def setDatabaseName(value: String): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    inline def setDdlArtifactsSchema(value: String): Self = StObject.set(x, "DdlArtifactsSchema", value.asInstanceOf[js.Any])
    
    inline def setDdlArtifactsSchemaUndefined: Self = StObject.set(x, "DdlArtifactsSchema", js.undefined)
    
    inline def setExecuteTimeout(value: IntegerOptional): Self = StObject.set(x, "ExecuteTimeout", value.asInstanceOf[js.Any])
    
    inline def setExecuteTimeoutUndefined: Self = StObject.set(x, "ExecuteTimeout", js.undefined)
    
    inline def setFailTasksOnLobTruncation(value: BooleanOptional): Self = StObject.set(x, "FailTasksOnLobTruncation", value.asInstanceOf[js.Any])
    
    inline def setFailTasksOnLobTruncationUndefined: Self = StObject.set(x, "FailTasksOnLobTruncation", js.undefined)
    
    inline def setHeartbeatEnable(value: BooleanOptional): Self = StObject.set(x, "HeartbeatEnable", value.asInstanceOf[js.Any])
    
    inline def setHeartbeatEnableUndefined: Self = StObject.set(x, "HeartbeatEnable", js.undefined)
    
    inline def setHeartbeatFrequency(value: IntegerOptional): Self = StObject.set(x, "HeartbeatFrequency", value.asInstanceOf[js.Any])
    
    inline def setHeartbeatFrequencyUndefined: Self = StObject.set(x, "HeartbeatFrequency", js.undefined)
    
    inline def setHeartbeatSchema(value: String): Self = StObject.set(x, "HeartbeatSchema", value.asInstanceOf[js.Any])
    
    inline def setHeartbeatSchemaUndefined: Self = StObject.set(x, "HeartbeatSchema", js.undefined)
    
    inline def setMaxFileSize(value: IntegerOptional): Self = StObject.set(x, "MaxFileSize", value.asInstanceOf[js.Any])
    
    inline def setMaxFileSizeUndefined: Self = StObject.set(x, "MaxFileSize", js.undefined)
    
    inline def setPassword(value: SecretString): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "Password", js.undefined)
    
    inline def setPluginName(value: PluginNameValue): Self = StObject.set(x, "PluginName", value.asInstanceOf[js.Any])
    
    inline def setPluginNameUndefined: Self = StObject.set(x, "PluginName", js.undefined)
    
    inline def setPort(value: IntegerOptional): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setSecretsManagerAccessRoleArn(value: String): Self = StObject.set(x, "SecretsManagerAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setSecretsManagerAccessRoleArnUndefined: Self = StObject.set(x, "SecretsManagerAccessRoleArn", js.undefined)
    
    inline def setSecretsManagerSecretId(value: String): Self = StObject.set(x, "SecretsManagerSecretId", value.asInstanceOf[js.Any])
    
    inline def setSecretsManagerSecretIdUndefined: Self = StObject.set(x, "SecretsManagerSecretId", js.undefined)
    
    inline def setServerName(value: String): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
    
    inline def setServerNameUndefined: Self = StObject.set(x, "ServerName", js.undefined)
    
    inline def setSlotName(value: String): Self = StObject.set(x, "SlotName", value.asInstanceOf[js.Any])
    
    inline def setSlotNameUndefined: Self = StObject.set(x, "SlotName", js.undefined)
    
    inline def setTrimSpaceInChar(value: BooleanOptional): Self = StObject.set(x, "TrimSpaceInChar", value.asInstanceOf[js.Any])
    
    inline def setTrimSpaceInCharUndefined: Self = StObject.set(x, "TrimSpaceInChar", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
