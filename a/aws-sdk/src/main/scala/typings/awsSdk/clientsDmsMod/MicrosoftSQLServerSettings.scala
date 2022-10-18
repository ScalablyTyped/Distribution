package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MicrosoftSQLServerSettings extends StObject {
  
  /**
    * The maximum size of the packets (in bytes) used to transfer data using BCP.
    */
  var BcpPacketSize: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Specifies a file group for the DMS internal tables. When the replication task starts, all the internal DMS control tables (awsdms_ apply_exception, awsdms_apply, awsdms_changes) are created for the specified file group.
    */
  var ControlTablesFileGroup: js.UndefOr[String] = js.undefined
  
  /**
    * Database name for the endpoint.
    */
  var DatabaseName: js.UndefOr[String] = js.undefined
  
  /**
    * Endpoint connection password.
    */
  var Password: js.UndefOr[SecretString] = js.undefined
  
  /**
    * Endpoint TCP port.
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Cleans and recreates table metadata information on the replication instance when a mismatch occurs. An example is a situation where running an alter DDL statement on a table might result in different information about the table cached in the replication instance.
    */
  var QuerySingleAlwaysOnNode: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * When this attribute is set to Y, DMS only reads changes from transaction log backups and doesn't read from the active transaction log file during ongoing replication. Setting this parameter to Y enables you to control active transaction log file growth during full load and ongoing replication tasks. However, it can add some source latency to ongoing replication.
    */
  var ReadBackupOnly: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Use this attribute to minimize the need to access the backup log and enable DMS to prevent truncation using one of the following two methods.  Start transactions in the database: This is the default method. When this method is used, DMS prevents TLOG truncation by mimicking a transaction in the database. As long as such a transaction is open, changes that appear after the transaction started aren't truncated. If you need Microsoft Replication to be enabled in your database, then you must choose this method.  Exclusively use sp_repldone within a single task: When this method is used, DMS reads the changes and then uses sp_repldone to mark the TLOG transactions as ready for truncation. Although this method doesn't involve any transactional activities, it can only be used when Microsoft Replication isn't running. Also, when using this method, only one DMS task can access the database at any given time. Therefore, if you need to run parallel DMS tasks against the same database, use the default method.
    */
  var SafeguardPolicy: js.UndefOr[typings.awsSdk.clientsDmsMod.SafeguardPolicy] = js.undefined
  
  /**
    * The full Amazon Resource Name (ARN) of the IAM role that specifies DMS as the trusted entity and grants the required permissions to access the value in SecretsManagerSecret. The role must allow the iam:PassRole action. SecretsManagerSecret has the value of the Amazon Web Services Secrets Manager secret that allows access to the SQL Server endpoint.  You can specify one of two sets of values for these permissions. You can specify the values for this setting and SecretsManagerSecretId. Or you can specify clear-text values for UserName, Password, ServerName, and Port. You can't specify both. For more information on creating this SecretsManagerSecret and the SecretsManagerAccessRoleArn and SecretsManagerSecretId required to access it, see Using secrets to access Database Migration Service resources in the Database Migration Service User Guide. 
    */
  var SecretsManagerAccessRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * The full ARN, partial ARN, or friendly name of the SecretsManagerSecret that contains the SQL Server endpoint connection details.
    */
  var SecretsManagerSecretId: js.UndefOr[String] = js.undefined
  
  /**
    * Fully qualified domain name of the endpoint.
    */
  var ServerName: js.UndefOr[String] = js.undefined
  
  /**
    * Use the TrimSpaceInChar source endpoint setting to trim data on CHAR and NCHAR data types during migration. The default value is true.
    */
  var TrimSpaceInChar: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Use this to attribute to transfer data for full-load operations using BCP. When the target table contains an identity column that does not exist in the source table, you must disable the use BCP for loading table option.
    */
  var UseBcpFullLoad: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * When this attribute is set to Y, DMS processes third-party transaction log backups if they are created in native format.
    */
  var UseThirdPartyBackupDevice: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Endpoint connection user name.
    */
  var Username: js.UndefOr[String] = js.undefined
}
object MicrosoftSQLServerSettings {
  
  inline def apply(): MicrosoftSQLServerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MicrosoftSQLServerSettings]
  }
  
  extension [Self <: MicrosoftSQLServerSettings](x: Self) {
    
    inline def setBcpPacketSize(value: IntegerOptional): Self = StObject.set(x, "BcpPacketSize", value.asInstanceOf[js.Any])
    
    inline def setBcpPacketSizeUndefined: Self = StObject.set(x, "BcpPacketSize", js.undefined)
    
    inline def setControlTablesFileGroup(value: String): Self = StObject.set(x, "ControlTablesFileGroup", value.asInstanceOf[js.Any])
    
    inline def setControlTablesFileGroupUndefined: Self = StObject.set(x, "ControlTablesFileGroup", js.undefined)
    
    inline def setDatabaseName(value: String): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    inline def setPassword(value: SecretString): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "Password", js.undefined)
    
    inline def setPort(value: IntegerOptional): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setQuerySingleAlwaysOnNode(value: BooleanOptional): Self = StObject.set(x, "QuerySingleAlwaysOnNode", value.asInstanceOf[js.Any])
    
    inline def setQuerySingleAlwaysOnNodeUndefined: Self = StObject.set(x, "QuerySingleAlwaysOnNode", js.undefined)
    
    inline def setReadBackupOnly(value: BooleanOptional): Self = StObject.set(x, "ReadBackupOnly", value.asInstanceOf[js.Any])
    
    inline def setReadBackupOnlyUndefined: Self = StObject.set(x, "ReadBackupOnly", js.undefined)
    
    inline def setSafeguardPolicy(value: SafeguardPolicy): Self = StObject.set(x, "SafeguardPolicy", value.asInstanceOf[js.Any])
    
    inline def setSafeguardPolicyUndefined: Self = StObject.set(x, "SafeguardPolicy", js.undefined)
    
    inline def setSecretsManagerAccessRoleArn(value: String): Self = StObject.set(x, "SecretsManagerAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setSecretsManagerAccessRoleArnUndefined: Self = StObject.set(x, "SecretsManagerAccessRoleArn", js.undefined)
    
    inline def setSecretsManagerSecretId(value: String): Self = StObject.set(x, "SecretsManagerSecretId", value.asInstanceOf[js.Any])
    
    inline def setSecretsManagerSecretIdUndefined: Self = StObject.set(x, "SecretsManagerSecretId", js.undefined)
    
    inline def setServerName(value: String): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
    
    inline def setServerNameUndefined: Self = StObject.set(x, "ServerName", js.undefined)
    
    inline def setTrimSpaceInChar(value: BooleanOptional): Self = StObject.set(x, "TrimSpaceInChar", value.asInstanceOf[js.Any])
    
    inline def setTrimSpaceInCharUndefined: Self = StObject.set(x, "TrimSpaceInChar", js.undefined)
    
    inline def setUseBcpFullLoad(value: BooleanOptional): Self = StObject.set(x, "UseBcpFullLoad", value.asInstanceOf[js.Any])
    
    inline def setUseBcpFullLoadUndefined: Self = StObject.set(x, "UseBcpFullLoad", js.undefined)
    
    inline def setUseThirdPartyBackupDevice(value: BooleanOptional): Self = StObject.set(x, "UseThirdPartyBackupDevice", value.asInstanceOf[js.Any])
    
    inline def setUseThirdPartyBackupDeviceUndefined: Self = StObject.set(x, "UseThirdPartyBackupDevice", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
