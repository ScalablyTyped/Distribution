package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MySQLSettings extends StObject {
  
  /**
    * Specifies a script to run immediately after DMS connects to the endpoint. The migration task continues running regardless if the SQL statement succeeds or fails. For this parameter, provide the code of the script itself, not the name of a file containing the script.
    */
  var AfterConnectScript: js.UndefOr[String] = js.undefined
  
  /**
    * Adjusts the behavior of DMS when migrating from an SQL Server source database that is hosted as part of an Always On availability group cluster. If you need DMS to poll all the nodes in the Always On cluster for transaction backups, set this attribute to false.
    */
  var CleanSourceMetadataOnMismatch: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Database name for the endpoint. For a MySQL source or target endpoint, don't explicitly specify the database using the DatabaseName request parameter on either the CreateEndpoint or ModifyEndpoint API call. Specifying DatabaseName when you create or modify a MySQL endpoint replicates all the task tables to this single database. For MySQL endpoints, you specify the database only when you specify the schema in the table-mapping rules of the DMS task.
    */
  var DatabaseName: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies how often to check the binary log for new changes/events when the database is idle. The default is five seconds. Example: eventsPollInterval=5;  In the example, DMS checks for changes in the binary logs every five seconds.
    */
  var EventsPollInterval: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Specifies the maximum size (in KB) of any .csv file used to transfer data to a MySQL-compatible database. Example: maxFileSize=512 
    */
  var MaxFileSize: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Improves performance when loading data into the MySQL-compatible target database. Specifies how many threads to use to load the data into the MySQL-compatible target database. Setting a large number of threads can have an adverse effect on database performance, because a separate connection is required for each thread. The default is one. Example: parallelLoadThreads=1 
    */
  var ParallelLoadThreads: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Endpoint connection password.
    */
  var Password: js.UndefOr[SecretString] = js.undefined
  
  /**
    * Endpoint TCP port.
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The full Amazon Resource Name (ARN) of the IAM role that specifies DMS as the trusted entity and grants the required permissions to access the value in SecretsManagerSecret. The role must allow the iam:PassRole action. SecretsManagerSecret has the value of the Amazon Web Services Secrets Manager secret that allows access to the MySQL endpoint.  You can specify one of two sets of values for these permissions. You can specify the values for this setting and SecretsManagerSecretId. Or you can specify clear-text values for UserName, Password, ServerName, and Port. You can't specify both. For more information on creating this SecretsManagerSecret and the SecretsManagerAccessRoleArn and SecretsManagerSecretId required to access it, see Using secrets to access Database Migration Service resources in the Database Migration Service User Guide. 
    */
  var SecretsManagerAccessRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * The full ARN, partial ARN, or friendly name of the SecretsManagerSecret that contains the MySQL endpoint connection details.
    */
  var SecretsManagerSecretId: js.UndefOr[String] = js.undefined
  
  /**
    * Fully qualified domain name of the endpoint.
    */
  var ServerName: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the time zone for the source MySQL database. Example: serverTimezone=US/Pacific;  Note: Do not enclose time zones in single quotes.
    */
  var ServerTimezone: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies where to migrate source tables on the target, either to a single database or multiple databases. If you specify SPECIFIC_DATABASE, specify the database name using the DatabaseName parameter of the Endpoint object. Example: targetDbType=MULTIPLE_DATABASES 
    */
  var TargetDbType: js.UndefOr[typings.awsSdk.clientsDmsMod.TargetDbType] = js.undefined
  
  /**
    * Endpoint connection user name.
    */
  var Username: js.UndefOr[String] = js.undefined
}
object MySQLSettings {
  
  inline def apply(): MySQLSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MySQLSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MySQLSettings] (val x: Self) extends AnyVal {
    
    inline def setAfterConnectScript(value: String): Self = StObject.set(x, "AfterConnectScript", value.asInstanceOf[js.Any])
    
    inline def setAfterConnectScriptUndefined: Self = StObject.set(x, "AfterConnectScript", js.undefined)
    
    inline def setCleanSourceMetadataOnMismatch(value: BooleanOptional): Self = StObject.set(x, "CleanSourceMetadataOnMismatch", value.asInstanceOf[js.Any])
    
    inline def setCleanSourceMetadataOnMismatchUndefined: Self = StObject.set(x, "CleanSourceMetadataOnMismatch", js.undefined)
    
    inline def setDatabaseName(value: String): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    inline def setEventsPollInterval(value: IntegerOptional): Self = StObject.set(x, "EventsPollInterval", value.asInstanceOf[js.Any])
    
    inline def setEventsPollIntervalUndefined: Self = StObject.set(x, "EventsPollInterval", js.undefined)
    
    inline def setMaxFileSize(value: IntegerOptional): Self = StObject.set(x, "MaxFileSize", value.asInstanceOf[js.Any])
    
    inline def setMaxFileSizeUndefined: Self = StObject.set(x, "MaxFileSize", js.undefined)
    
    inline def setParallelLoadThreads(value: IntegerOptional): Self = StObject.set(x, "ParallelLoadThreads", value.asInstanceOf[js.Any])
    
    inline def setParallelLoadThreadsUndefined: Self = StObject.set(x, "ParallelLoadThreads", js.undefined)
    
    inline def setPassword(value: SecretString): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "Password", js.undefined)
    
    inline def setPort(value: IntegerOptional): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setSecretsManagerAccessRoleArn(value: String): Self = StObject.set(x, "SecretsManagerAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setSecretsManagerAccessRoleArnUndefined: Self = StObject.set(x, "SecretsManagerAccessRoleArn", js.undefined)
    
    inline def setSecretsManagerSecretId(value: String): Self = StObject.set(x, "SecretsManagerSecretId", value.asInstanceOf[js.Any])
    
    inline def setSecretsManagerSecretIdUndefined: Self = StObject.set(x, "SecretsManagerSecretId", js.undefined)
    
    inline def setServerName(value: String): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
    
    inline def setServerNameUndefined: Self = StObject.set(x, "ServerName", js.undefined)
    
    inline def setServerTimezone(value: String): Self = StObject.set(x, "ServerTimezone", value.asInstanceOf[js.Any])
    
    inline def setServerTimezoneUndefined: Self = StObject.set(x, "ServerTimezone", js.undefined)
    
    inline def setTargetDbType(value: TargetDbType): Self = StObject.set(x, "TargetDbType", value.asInstanceOf[js.Any])
    
    inline def setTargetDbTypeUndefined: Self = StObject.set(x, "TargetDbType", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
