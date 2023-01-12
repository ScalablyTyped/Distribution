package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OracleSettings extends StObject {
  
  /**
    * Set this attribute to false in order to use the Binary Reader to capture change data for an Amazon RDS for Oracle as the source. This tells the DMS instance to not access redo logs through any specified path prefix replacement using direct file access.
    */
  var AccessAlternateDirectly: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Set this attribute to set up table-level supplemental logging for the Oracle database. This attribute enables PRIMARY KEY supplemental logging on all tables selected for a migration task. If you use this option, you still need to enable database-level supplemental logging.
    */
  var AddSupplementalLogging: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Set this attribute with ArchivedLogDestId in a primary/ standby setup. This attribute is useful in the case of a switchover. In this case, DMS needs to know which destination to get archive redo logs from to read changes. This need arises because the previous primary instance is now a standby instance after switchover. Although DMS supports the use of the Oracle RESETLOGS option to open the database, never use RESETLOGS unless necessary. For additional information about RESETLOGS, see RMAN Data Repair Concepts in the Oracle Database Backup and Recovery User's Guide.
    */
  var AdditionalArchivedLogDestId: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Set this attribute to true to enable replication of Oracle tables containing columns that are nested tables or defined types.
    */
  var AllowSelectNestedTables: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Specifies the ID of the destination for the archived redo logs. This value should be the same as a number in the dest_id column of the v$archived_log view. If you work with an additional redo log destination, use the AdditionalArchivedLogDestId option to specify the additional destination ID. Doing this improves performance by ensuring that the correct logs are accessed from the outset.
    */
  var ArchivedLogDestId: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * When this field is set to Y, DMS only accesses the archived redo logs. If the archived redo logs are stored on Oracle ASM only, the DMS user account needs to be granted ASM privileges.
    */
  var ArchivedLogsOnly: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * For an Oracle source endpoint, your Oracle Automatic Storage Management (ASM) password. You can set this value from the  asm_user_password  value. You set this value as part of the comma-separated value that you set to the Password request parameter when you create the endpoint to access transaction logs using Binary Reader. For more information, see Configuration for change data capture (CDC) on an Oracle source database.
    */
  var AsmPassword: js.UndefOr[SecretString] = js.undefined
  
  /**
    * For an Oracle source endpoint, your ASM server address. You can set this value from the asm_server value. You set asm_server as part of the extra connection attribute string to access an Oracle server with Binary Reader that uses ASM. For more information, see Configuration for change data capture (CDC) on an Oracle source database.
    */
  var AsmServer: js.UndefOr[String] = js.undefined
  
  /**
    * For an Oracle source endpoint, your ASM user name. You can set this value from the asm_user value. You set asm_user as part of the extra connection attribute string to access an Oracle server with Binary Reader that uses ASM. For more information, see Configuration for change data capture (CDC) on an Oracle source database.
    */
  var AsmUser: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the length of a character column is in bytes or in characters. To indicate that the character column length is in characters, set this attribute to CHAR. Otherwise, the character column length is in bytes. Example: charLengthSemantics=CHAR; 
    */
  var CharLengthSemantics: js.UndefOr[typings.awsSdk.clientsDmsMod.CharLengthSemantics] = js.undefined
  
  /**
    * Database name for the endpoint.
    */
  var DatabaseName: js.UndefOr[String] = js.undefined
  
  /**
    * When set to true, this attribute helps to increase the commit rate on the Oracle target database by writing directly to tables and not writing a trail to database logs.
    */
  var DirectPathNoLog: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * When set to true, this attribute specifies a parallel load when useDirectPathFullLoad is set to Y. This attribute also only applies when you use the DMS parallel load feature. Note that the target table cannot have any constraints or indexes.
    */
  var DirectPathParallelLoad: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Set this attribute to enable homogenous tablespace replication and create existing tables or indexes under the same tablespace on the target.
    */
  var EnableHomogenousTablespace: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Specifies the IDs of one more destinations for one or more archived redo logs. These IDs are the values of the dest_id column in the v$archived_log view. Use this setting with the archivedLogDestId extra connection attribute in a primary-to-single setup or a primary-to-multiple-standby setup.  This setting is useful in a switchover when you use an Oracle Data Guard database as a source. In this case, DMS needs information about what destination to get archive redo logs from to read changes. DMS needs this because after the switchover the previous primary is a standby instance. For example, in a primary-to-single standby setup you might apply the following settings.   archivedLogDestId=1; ExtraArchivedLogDestIds=[2]  In a primary-to-multiple-standby setup, you might apply the following settings.  archivedLogDestId=1; ExtraArchivedLogDestIds=[2,3,4]  Although DMS supports the use of the Oracle RESETLOGS option to open the database, never use RESETLOGS unless it's necessary. For more information about RESETLOGS, see  RMAN Data Repair Concepts in the Oracle Database Backup and Recovery User's Guide.
    */
  var ExtraArchivedLogDestIds: js.UndefOr[IntegerList] = js.undefined
  
  /**
    * When set to true, this attribute causes a task to fail if the actual size of an LOB column is greater than the specified LobMaxSize. If a task is set to limited LOB mode and this option is set to true, the task fails instead of truncating the LOB data.
    */
  var FailTasksOnLobTruncation: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Specifies the number scale. You can select a scale up to 38, or you can select FLOAT. By default, the NUMBER data type is converted to precision 38, scale 10. Example: numberDataTypeScale=12 
    */
  var NumberDatatypeScale: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Set this string attribute to the required value in order to use the Binary Reader to capture change data for an Amazon RDS for Oracle as the source. This value specifies the default Oracle root used to access the redo logs.
    */
  var OraclePathPrefix: js.UndefOr[String] = js.undefined
  
  /**
    * Set this attribute to change the number of threads that DMS configures to perform a change data capture (CDC) load using Oracle Automatic Storage Management (ASM). You can specify an integer value between 2 (the default) and 8 (the maximum). Use this attribute together with the readAheadBlocks attribute.
    */
  var ParallelAsmReadThreads: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Endpoint connection password.
    */
  var Password: js.UndefOr[SecretString] = js.undefined
  
  /**
    * Endpoint TCP port.
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Set this attribute to change the number of read-ahead blocks that DMS configures to perform a change data capture (CDC) load using Oracle Automatic Storage Management (ASM). You can specify an integer value between 1000 (the default) and 200,000 (the maximum).
    */
  var ReadAheadBlocks: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * When set to true, this attribute supports tablespace replication.
    */
  var ReadTableSpaceName: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Set this attribute to true in order to use the Binary Reader to capture change data for an Amazon RDS for Oracle as the source. This setting tells DMS instance to replace the default Oracle root with the specified usePathPrefix setting to access the redo logs.
    */
  var ReplacePathPrefix: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Specifies the number of seconds that the system waits before resending a query. Example: retryInterval=6; 
    */
  var RetryInterval: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The full Amazon Resource Name (ARN) of the IAM role that specifies DMS as the trusted entity and grants the required permissions to access the value in SecretsManagerSecret. The role must allow the iam:PassRole action. SecretsManagerSecret has the value of the Amazon Web Services Secrets Manager secret that allows access to the Oracle endpoint.  You can specify one of two sets of values for these permissions. You can specify the values for this setting and SecretsManagerSecretId. Or you can specify clear-text values for UserName, Password, ServerName, and Port. You can't specify both. For more information on creating this SecretsManagerSecret and the SecretsManagerAccessRoleArn and SecretsManagerSecretId required to access it, see Using secrets to access Database Migration Service resources in the Database Migration Service User Guide. 
    */
  var SecretsManagerAccessRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * Required only if your Oracle endpoint uses Advanced Storage Manager (ASM). The full ARN of the IAM role that specifies DMS as the trusted entity and grants the required permissions to access the SecretsManagerOracleAsmSecret. This SecretsManagerOracleAsmSecret has the secret value that allows access to the Oracle ASM of the endpoint.  You can specify one of two sets of values for these permissions. You can specify the values for this setting and SecretsManagerOracleAsmSecretId. Or you can specify clear-text values for AsmUserName, AsmPassword, and AsmServerName. You can't specify both. For more information on creating this SecretsManagerOracleAsmSecret and the SecretsManagerOracleAsmAccessRoleArn and SecretsManagerOracleAsmSecretId required to access it, see Using secrets to access Database Migration Service resources in the Database Migration Service User Guide. 
    */
  var SecretsManagerOracleAsmAccessRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * Required only if your Oracle endpoint uses Advanced Storage Manager (ASM). The full ARN, partial ARN, or friendly name of the SecretsManagerOracleAsmSecret that contains the Oracle ASM connection details for the Oracle endpoint.
    */
  var SecretsManagerOracleAsmSecretId: js.UndefOr[String] = js.undefined
  
  /**
    * The full ARN, partial ARN, or friendly name of the SecretsManagerSecret that contains the Oracle endpoint connection details.
    */
  var SecretsManagerSecretId: js.UndefOr[String] = js.undefined
  
  /**
    * For an Oracle source endpoint, the transparent data encryption (TDE) password required by AWM DMS to access Oracle redo logs encrypted by TDE using Binary Reader. It is also the  TDE_Password  part of the comma-separated value you set to the Password request parameter when you create the endpoint. The SecurityDbEncryptian setting is related to this SecurityDbEncryptionName setting. For more information, see  Supported encryption methods for using Oracle as a source for DMS  in the Database Migration Service User Guide. 
    */
  var SecurityDbEncryption: js.UndefOr[SecretString] = js.undefined
  
  /**
    * For an Oracle source endpoint, the name of a key used for the transparent data encryption (TDE) of the columns and tablespaces in an Oracle source database that is encrypted using TDE. The key value is the value of the SecurityDbEncryption setting. For more information on setting the key name value of SecurityDbEncryptionName, see the information and example for setting the securityDbEncryptionName extra connection attribute in  Supported encryption methods for using Oracle as a source for DMS  in the Database Migration Service User Guide.
    */
  var SecurityDbEncryptionName: js.UndefOr[String] = js.undefined
  
  /**
    * Fully qualified domain name of the endpoint.
    */
  var ServerName: js.UndefOr[String] = js.undefined
  
  /**
    * Use this attribute to convert SDO_GEOMETRY to GEOJSON format. By default, DMS calls the SDO2GEOJSON custom function if present and accessible. Or you can create your own custom function that mimics the operation of SDOGEOJSON and set SpatialDataOptionToGeoJsonFunctionName to call it instead. 
    */
  var SpatialDataOptionToGeoJsonFunctionName: js.UndefOr[String] = js.undefined
  
  /**
    * Use this attribute to specify a time in minutes for the delay in standby sync. If the source is an Oracle Active Data Guard standby database, use this attribute to specify the time lag between primary and standby databases. In DMS, you can create an Oracle CDC task that uses an Active Data Guard standby instance as a source for replicating ongoing changes. Doing this eliminates the need to connect to an active database that might be in production.
    */
  var StandbyDelayTime: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Use the TrimSpaceInChar source endpoint setting to trim data on CHAR and NCHAR data types during migration. The default value is true.
    */
  var TrimSpaceInChar: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Set this attribute to true in order to use the Binary Reader to capture change data for an Amazon RDS for Oracle as the source. This tells the DMS instance to use any specified prefix replacement to access all online redo logs.
    */
  var UseAlternateFolderForOnline: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Set this attribute to Y to capture change data using the Binary Reader utility. Set UseLogminerReader to N to set this attribute to Y. To use Binary Reader with Amazon RDS for Oracle as the source, you set additional attributes. For more information about using this setting with Oracle Automatic Storage Management (ASM), see  Using Oracle LogMiner or DMS Binary Reader for CDC.
    */
  var UseBFile: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Set this attribute to Y to have DMS use a direct path full load. Specify this value to use the direct path protocol in the Oracle Call Interface (OCI). By using this OCI protocol, you can bulk-load Oracle target tables during a full load.
    */
  var UseDirectPathFullLoad: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Set this attribute to Y to capture change data using the Oracle LogMiner utility (the default). Set this attribute to N if you want to access the redo logs as a binary file. When you set UseLogminerReader to N, also set UseBfile to Y. For more information on this setting and using Oracle ASM, see  Using Oracle LogMiner or DMS Binary Reader for CDC in the DMS User Guide.
    */
  var UseLogminerReader: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Set this string attribute to the required value in order to use the Binary Reader to capture change data for an Amazon RDS for Oracle as the source. This value specifies the path prefix used to replace the default Oracle root to access the redo logs.
    */
  var UsePathPrefix: js.UndefOr[String] = js.undefined
  
  /**
    * Endpoint connection user name.
    */
  var Username: js.UndefOr[String] = js.undefined
}
object OracleSettings {
  
  inline def apply(): OracleSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OracleSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OracleSettings] (val x: Self) extends AnyVal {
    
    inline def setAccessAlternateDirectly(value: BooleanOptional): Self = StObject.set(x, "AccessAlternateDirectly", value.asInstanceOf[js.Any])
    
    inline def setAccessAlternateDirectlyUndefined: Self = StObject.set(x, "AccessAlternateDirectly", js.undefined)
    
    inline def setAddSupplementalLogging(value: BooleanOptional): Self = StObject.set(x, "AddSupplementalLogging", value.asInstanceOf[js.Any])
    
    inline def setAddSupplementalLoggingUndefined: Self = StObject.set(x, "AddSupplementalLogging", js.undefined)
    
    inline def setAdditionalArchivedLogDestId(value: IntegerOptional): Self = StObject.set(x, "AdditionalArchivedLogDestId", value.asInstanceOf[js.Any])
    
    inline def setAdditionalArchivedLogDestIdUndefined: Self = StObject.set(x, "AdditionalArchivedLogDestId", js.undefined)
    
    inline def setAllowSelectNestedTables(value: BooleanOptional): Self = StObject.set(x, "AllowSelectNestedTables", value.asInstanceOf[js.Any])
    
    inline def setAllowSelectNestedTablesUndefined: Self = StObject.set(x, "AllowSelectNestedTables", js.undefined)
    
    inline def setArchivedLogDestId(value: IntegerOptional): Self = StObject.set(x, "ArchivedLogDestId", value.asInstanceOf[js.Any])
    
    inline def setArchivedLogDestIdUndefined: Self = StObject.set(x, "ArchivedLogDestId", js.undefined)
    
    inline def setArchivedLogsOnly(value: BooleanOptional): Self = StObject.set(x, "ArchivedLogsOnly", value.asInstanceOf[js.Any])
    
    inline def setArchivedLogsOnlyUndefined: Self = StObject.set(x, "ArchivedLogsOnly", js.undefined)
    
    inline def setAsmPassword(value: SecretString): Self = StObject.set(x, "AsmPassword", value.asInstanceOf[js.Any])
    
    inline def setAsmPasswordUndefined: Self = StObject.set(x, "AsmPassword", js.undefined)
    
    inline def setAsmServer(value: String): Self = StObject.set(x, "AsmServer", value.asInstanceOf[js.Any])
    
    inline def setAsmServerUndefined: Self = StObject.set(x, "AsmServer", js.undefined)
    
    inline def setAsmUser(value: String): Self = StObject.set(x, "AsmUser", value.asInstanceOf[js.Any])
    
    inline def setAsmUserUndefined: Self = StObject.set(x, "AsmUser", js.undefined)
    
    inline def setCharLengthSemantics(value: CharLengthSemantics): Self = StObject.set(x, "CharLengthSemantics", value.asInstanceOf[js.Any])
    
    inline def setCharLengthSemanticsUndefined: Self = StObject.set(x, "CharLengthSemantics", js.undefined)
    
    inline def setDatabaseName(value: String): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    inline def setDirectPathNoLog(value: BooleanOptional): Self = StObject.set(x, "DirectPathNoLog", value.asInstanceOf[js.Any])
    
    inline def setDirectPathNoLogUndefined: Self = StObject.set(x, "DirectPathNoLog", js.undefined)
    
    inline def setDirectPathParallelLoad(value: BooleanOptional): Self = StObject.set(x, "DirectPathParallelLoad", value.asInstanceOf[js.Any])
    
    inline def setDirectPathParallelLoadUndefined: Self = StObject.set(x, "DirectPathParallelLoad", js.undefined)
    
    inline def setEnableHomogenousTablespace(value: BooleanOptional): Self = StObject.set(x, "EnableHomogenousTablespace", value.asInstanceOf[js.Any])
    
    inline def setEnableHomogenousTablespaceUndefined: Self = StObject.set(x, "EnableHomogenousTablespace", js.undefined)
    
    inline def setExtraArchivedLogDestIds(value: IntegerList): Self = StObject.set(x, "ExtraArchivedLogDestIds", value.asInstanceOf[js.Any])
    
    inline def setExtraArchivedLogDestIdsUndefined: Self = StObject.set(x, "ExtraArchivedLogDestIds", js.undefined)
    
    inline def setExtraArchivedLogDestIdsVarargs(value: Integer*): Self = StObject.set(x, "ExtraArchivedLogDestIds", js.Array(value*))
    
    inline def setFailTasksOnLobTruncation(value: BooleanOptional): Self = StObject.set(x, "FailTasksOnLobTruncation", value.asInstanceOf[js.Any])
    
    inline def setFailTasksOnLobTruncationUndefined: Self = StObject.set(x, "FailTasksOnLobTruncation", js.undefined)
    
    inline def setNumberDatatypeScale(value: IntegerOptional): Self = StObject.set(x, "NumberDatatypeScale", value.asInstanceOf[js.Any])
    
    inline def setNumberDatatypeScaleUndefined: Self = StObject.set(x, "NumberDatatypeScale", js.undefined)
    
    inline def setOraclePathPrefix(value: String): Self = StObject.set(x, "OraclePathPrefix", value.asInstanceOf[js.Any])
    
    inline def setOraclePathPrefixUndefined: Self = StObject.set(x, "OraclePathPrefix", js.undefined)
    
    inline def setParallelAsmReadThreads(value: IntegerOptional): Self = StObject.set(x, "ParallelAsmReadThreads", value.asInstanceOf[js.Any])
    
    inline def setParallelAsmReadThreadsUndefined: Self = StObject.set(x, "ParallelAsmReadThreads", js.undefined)
    
    inline def setPassword(value: SecretString): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "Password", js.undefined)
    
    inline def setPort(value: IntegerOptional): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setReadAheadBlocks(value: IntegerOptional): Self = StObject.set(x, "ReadAheadBlocks", value.asInstanceOf[js.Any])
    
    inline def setReadAheadBlocksUndefined: Self = StObject.set(x, "ReadAheadBlocks", js.undefined)
    
    inline def setReadTableSpaceName(value: BooleanOptional): Self = StObject.set(x, "ReadTableSpaceName", value.asInstanceOf[js.Any])
    
    inline def setReadTableSpaceNameUndefined: Self = StObject.set(x, "ReadTableSpaceName", js.undefined)
    
    inline def setReplacePathPrefix(value: BooleanOptional): Self = StObject.set(x, "ReplacePathPrefix", value.asInstanceOf[js.Any])
    
    inline def setReplacePathPrefixUndefined: Self = StObject.set(x, "ReplacePathPrefix", js.undefined)
    
    inline def setRetryInterval(value: IntegerOptional): Self = StObject.set(x, "RetryInterval", value.asInstanceOf[js.Any])
    
    inline def setRetryIntervalUndefined: Self = StObject.set(x, "RetryInterval", js.undefined)
    
    inline def setSecretsManagerAccessRoleArn(value: String): Self = StObject.set(x, "SecretsManagerAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setSecretsManagerAccessRoleArnUndefined: Self = StObject.set(x, "SecretsManagerAccessRoleArn", js.undefined)
    
    inline def setSecretsManagerOracleAsmAccessRoleArn(value: String): Self = StObject.set(x, "SecretsManagerOracleAsmAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setSecretsManagerOracleAsmAccessRoleArnUndefined: Self = StObject.set(x, "SecretsManagerOracleAsmAccessRoleArn", js.undefined)
    
    inline def setSecretsManagerOracleAsmSecretId(value: String): Self = StObject.set(x, "SecretsManagerOracleAsmSecretId", value.asInstanceOf[js.Any])
    
    inline def setSecretsManagerOracleAsmSecretIdUndefined: Self = StObject.set(x, "SecretsManagerOracleAsmSecretId", js.undefined)
    
    inline def setSecretsManagerSecretId(value: String): Self = StObject.set(x, "SecretsManagerSecretId", value.asInstanceOf[js.Any])
    
    inline def setSecretsManagerSecretIdUndefined: Self = StObject.set(x, "SecretsManagerSecretId", js.undefined)
    
    inline def setSecurityDbEncryption(value: SecretString): Self = StObject.set(x, "SecurityDbEncryption", value.asInstanceOf[js.Any])
    
    inline def setSecurityDbEncryptionName(value: String): Self = StObject.set(x, "SecurityDbEncryptionName", value.asInstanceOf[js.Any])
    
    inline def setSecurityDbEncryptionNameUndefined: Self = StObject.set(x, "SecurityDbEncryptionName", js.undefined)
    
    inline def setSecurityDbEncryptionUndefined: Self = StObject.set(x, "SecurityDbEncryption", js.undefined)
    
    inline def setServerName(value: String): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
    
    inline def setServerNameUndefined: Self = StObject.set(x, "ServerName", js.undefined)
    
    inline def setSpatialDataOptionToGeoJsonFunctionName(value: String): Self = StObject.set(x, "SpatialDataOptionToGeoJsonFunctionName", value.asInstanceOf[js.Any])
    
    inline def setSpatialDataOptionToGeoJsonFunctionNameUndefined: Self = StObject.set(x, "SpatialDataOptionToGeoJsonFunctionName", js.undefined)
    
    inline def setStandbyDelayTime(value: IntegerOptional): Self = StObject.set(x, "StandbyDelayTime", value.asInstanceOf[js.Any])
    
    inline def setStandbyDelayTimeUndefined: Self = StObject.set(x, "StandbyDelayTime", js.undefined)
    
    inline def setTrimSpaceInChar(value: BooleanOptional): Self = StObject.set(x, "TrimSpaceInChar", value.asInstanceOf[js.Any])
    
    inline def setTrimSpaceInCharUndefined: Self = StObject.set(x, "TrimSpaceInChar", js.undefined)
    
    inline def setUseAlternateFolderForOnline(value: BooleanOptional): Self = StObject.set(x, "UseAlternateFolderForOnline", value.asInstanceOf[js.Any])
    
    inline def setUseAlternateFolderForOnlineUndefined: Self = StObject.set(x, "UseAlternateFolderForOnline", js.undefined)
    
    inline def setUseBFile(value: BooleanOptional): Self = StObject.set(x, "UseBFile", value.asInstanceOf[js.Any])
    
    inline def setUseBFileUndefined: Self = StObject.set(x, "UseBFile", js.undefined)
    
    inline def setUseDirectPathFullLoad(value: BooleanOptional): Self = StObject.set(x, "UseDirectPathFullLoad", value.asInstanceOf[js.Any])
    
    inline def setUseDirectPathFullLoadUndefined: Self = StObject.set(x, "UseDirectPathFullLoad", js.undefined)
    
    inline def setUseLogminerReader(value: BooleanOptional): Self = StObject.set(x, "UseLogminerReader", value.asInstanceOf[js.Any])
    
    inline def setUseLogminerReaderUndefined: Self = StObject.set(x, "UseLogminerReader", js.undefined)
    
    inline def setUsePathPrefix(value: String): Self = StObject.set(x, "UsePathPrefix", value.asInstanceOf[js.Any])
    
    inline def setUsePathPrefixUndefined: Self = StObject.set(x, "UsePathPrefix", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
