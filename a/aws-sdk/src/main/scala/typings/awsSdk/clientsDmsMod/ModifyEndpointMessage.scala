package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyEndpointMessage extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the certificate used for SSL connection.
    */
  var CertificateArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the endpoint database. For a MySQL source or target endpoint, do not specify DatabaseName.
    */
  var DatabaseName: js.UndefOr[String] = js.undefined
  
  /**
    * The settings in JSON format for the DMS transfer type of source endpoint.  Attributes include the following:   serviceAccessRoleArn - The Amazon Resource Name (ARN) used by the service access IAM role. The role must allow the iam:PassRole action.   BucketName - The name of the S3 bucket to use.   Shorthand syntax for these settings is as follows: ServiceAccessRoleArn=string ,BucketName=string  JSON syntax for these settings is as follows: { "ServiceAccessRoleArn": "string", "BucketName": "string"}  
    */
  var DmsTransferSettings: js.UndefOr[typings.awsSdk.clientsDmsMod.DmsTransferSettings] = js.undefined
  
  /**
    * Settings in JSON format for the source DocumentDB endpoint. For more information about the available settings, see the configuration properties section in  Using DocumentDB as a Target for Database Migration Service  in the Database Migration Service User Guide. 
    */
  var DocDbSettings: js.UndefOr[typings.awsSdk.clientsDmsMod.DocDbSettings] = js.undefined
  
  /**
    * Settings in JSON format for the target Amazon DynamoDB endpoint. For information about other available settings, see Using Object Mapping to Migrate Data to DynamoDB in the Database Migration Service User Guide. 
    */
  var DynamoDbSettings: js.UndefOr[typings.awsSdk.clientsDmsMod.DynamoDbSettings] = js.undefined
  
  /**
    * Settings in JSON format for the target OpenSearch endpoint. For more information about the available settings, see Extra Connection Attributes When Using OpenSearch as a Target for DMS in the Database Migration Service User Guide. 
    */
  var ElasticsearchSettings: js.UndefOr[typings.awsSdk.clientsDmsMod.ElasticsearchSettings] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
    */
  var EndpointArn: String
  
  /**
    * The database endpoint identifier. Identifiers must begin with a letter and must contain only ASCII letters, digits, and hyphens. They can't end with a hyphen or contain two consecutive hyphens.
    */
  var EndpointIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The type of endpoint. Valid values are source and target.
    */
  var EndpointType: js.UndefOr[ReplicationEndpointTypeValue] = js.undefined
  
  /**
    * The type of engine for the endpoint. Valid values, depending on the EndpointType, include "mysql", "oracle", "postgres", "mariadb", "aurora", "aurora-postgresql", "opensearch", "redshift", "s3", "db2", "azuredb", "sybase", "dynamodb", "mongodb", "kinesis", "kafka", "elasticsearch", "documentdb", "sqlserver", and "neptune".
    */
  var EngineName: js.UndefOr[String] = js.undefined
  
  /**
    * If this attribute is Y, the current call to ModifyEndpoint replaces all existing endpoint settings with the exact settings that you specify in this call. If this attribute is N, the current call to ModifyEndpoint does two things:    It replaces any endpoint settings that already exist with new values, for settings with the same names.   It creates new endpoint settings that you specify in the call, for settings with different names.    For example, if you call create-endpoint ... --endpoint-settings '{"a":1}' ..., the endpoint has the following endpoint settings: '{"a":1}'. If you then call modify-endpoint ... --endpoint-settings '{"b":2}' ... for the same endpoint, the endpoint has the following settings: '{"a":1,"b":2}'.  However, suppose that you follow this with a call to modify-endpoint ... --endpoint-settings '{"b":2}' --exact-settings ... for that same endpoint again. Then the endpoint has the following settings: '{"b":2}'. All existing settings are replaced with the exact settings that you specify. 
    */
  var ExactSettings: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The external table definition.
    */
  var ExternalTableDefinition: js.UndefOr[String] = js.undefined
  
  /**
    * Additional attributes associated with the connection. To reset this parameter, pass the empty string ("") as an argument.
    */
  var ExtraConnectionAttributes: js.UndefOr[String] = js.undefined
  
  /**
    * Settings in JSON format for the source GCP MySQL endpoint.
    */
  var GcpMySQLSettings: js.UndefOr[typings.awsSdk.clientsDmsMod.GcpMySQLSettings] = js.undefined
  
  /**
    * Settings in JSON format for the source IBM Db2 LUW endpoint. For information about other available settings, see Extra connection attributes when using Db2 LUW as a source for DMS in the Database Migration Service User Guide. 
    */
  var IBMDb2Settings: js.UndefOr[typings.awsSdk.clientsDmsMod.IBMDb2Settings] = js.undefined
  
  /**
    * Settings in JSON format for the target Apache Kafka endpoint. For more information about the available settings, see Using object mapping to migrate data to a Kafka topic in the Database Migration Service User Guide. 
    */
  var KafkaSettings: js.UndefOr[typings.awsSdk.clientsDmsMod.KafkaSettings] = js.undefined
  
  /**
    * Settings in JSON format for the target endpoint for Amazon Kinesis Data Streams. For more information about the available settings, see Using object mapping to migrate data to a Kinesis data stream in the Database Migration Service User Guide. 
    */
  var KinesisSettings: js.UndefOr[typings.awsSdk.clientsDmsMod.KinesisSettings] = js.undefined
  
  /**
    * Settings in JSON format for the source and target Microsoft SQL Server endpoint. For information about other available settings, see Extra connection attributes when using SQL Server as a source for DMS and  Extra connection attributes when using SQL Server as a target for DMS in the Database Migration Service User Guide. 
    */
  var MicrosoftSQLServerSettings: js.UndefOr[typings.awsSdk.clientsDmsMod.MicrosoftSQLServerSettings] = js.undefined
  
  /**
    * Settings in JSON format for the source MongoDB endpoint. For more information about the available settings, see the configuration properties section in Endpoint configuration settings when using MongoDB as a source for Database Migration Service in the Database Migration Service User Guide. 
    */
  var MongoDbSettings: js.UndefOr[typings.awsSdk.clientsDmsMod.MongoDbSettings] = js.undefined
  
  /**
    * Settings in JSON format for the source and target MySQL endpoint. For information about other available settings, see Extra connection attributes when using MySQL as a source for DMS and Extra connection attributes when using a MySQL-compatible database as a target for DMS in the Database Migration Service User Guide. 
    */
  var MySQLSettings: js.UndefOr[typings.awsSdk.clientsDmsMod.MySQLSettings] = js.undefined
  
  /**
    * Settings in JSON format for the target Amazon Neptune endpoint. For more information about the available settings, see Specifying graph-mapping rules using Gremlin and R2RML for Amazon Neptune as a target in the Database Migration Service User Guide. 
    */
  var NeptuneSettings: js.UndefOr[typings.awsSdk.clientsDmsMod.NeptuneSettings] = js.undefined
  
  /**
    * Settings in JSON format for the source and target Oracle endpoint. For information about other available settings, see Extra connection attributes when using Oracle as a source for DMS and  Extra connection attributes when using Oracle as a target for DMS in the Database Migration Service User Guide. 
    */
  var OracleSettings: js.UndefOr[typings.awsSdk.clientsDmsMod.OracleSettings] = js.undefined
  
  /**
    * The password to be used to login to the endpoint database.
    */
  var Password: js.UndefOr[SecretString] = js.undefined
  
  /**
    * The port used by the endpoint database.
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Settings in JSON format for the source and target PostgreSQL endpoint. For information about other available settings, see Extra connection attributes when using PostgreSQL as a source for DMS and  Extra connection attributes when using PostgreSQL as a target for DMS in the Database Migration Service User Guide. 
    */
  var PostgreSQLSettings: js.UndefOr[typings.awsSdk.clientsDmsMod.PostgreSQLSettings] = js.undefined
  
  /**
    * Settings in JSON format for the Redis target endpoint.
    */
  var RedisSettings: js.UndefOr[typings.awsSdk.clientsDmsMod.RedisSettings] = js.undefined
  
  var RedshiftSettings: js.UndefOr[typings.awsSdk.clientsDmsMod.RedshiftSettings] = js.undefined
  
  /**
    * Settings in JSON format for the target Amazon S3 endpoint. For more information about the available settings, see Extra Connection Attributes When Using Amazon S3 as a Target for DMS in the Database Migration Service User Guide. 
    */
  var S3Settings: js.UndefOr[typings.awsSdk.clientsDmsMod.S3Settings] = js.undefined
  
  /**
    * The name of the server where the endpoint database resides.
    */
  var ServerName: js.UndefOr[String] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) for the IAM role you want to use to modify the endpoint. The role must allow the iam:PassRole action.
    */
  var ServiceAccessRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * The SSL mode used to connect to the endpoint. The default value is none.
    */
  var SslMode: js.UndefOr[DmsSslModeValue] = js.undefined
  
  /**
    * Settings in JSON format for the source and target SAP ASE endpoint. For information about other available settings, see Extra connection attributes when using SAP ASE as a source for DMS and Extra connection attributes when using SAP ASE as a target for DMS in the Database Migration Service User Guide. 
    */
  var SybaseSettings: js.UndefOr[typings.awsSdk.clientsDmsMod.SybaseSettings] = js.undefined
  
  /**
    * The user name to be used to login to the endpoint database.
    */
  var Username: js.UndefOr[String] = js.undefined
}
object ModifyEndpointMessage {
  
  inline def apply(EndpointArn: String): ModifyEndpointMessage = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyEndpointMessage]
  }
  
  extension [Self <: ModifyEndpointMessage](x: Self) {
    
    inline def setCertificateArn(value: String): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateArnUndefined: Self = StObject.set(x, "CertificateArn", js.undefined)
    
    inline def setDatabaseName(value: String): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    inline def setDmsTransferSettings(value: DmsTransferSettings): Self = StObject.set(x, "DmsTransferSettings", value.asInstanceOf[js.Any])
    
    inline def setDmsTransferSettingsUndefined: Self = StObject.set(x, "DmsTransferSettings", js.undefined)
    
    inline def setDocDbSettings(value: DocDbSettings): Self = StObject.set(x, "DocDbSettings", value.asInstanceOf[js.Any])
    
    inline def setDocDbSettingsUndefined: Self = StObject.set(x, "DocDbSettings", js.undefined)
    
    inline def setDynamoDbSettings(value: DynamoDbSettings): Self = StObject.set(x, "DynamoDbSettings", value.asInstanceOf[js.Any])
    
    inline def setDynamoDbSettingsUndefined: Self = StObject.set(x, "DynamoDbSettings", js.undefined)
    
    inline def setElasticsearchSettings(value: ElasticsearchSettings): Self = StObject.set(x, "ElasticsearchSettings", value.asInstanceOf[js.Any])
    
    inline def setElasticsearchSettingsUndefined: Self = StObject.set(x, "ElasticsearchSettings", js.undefined)
    
    inline def setEndpointArn(value: String): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
    
    inline def setEndpointIdentifier(value: String): Self = StObject.set(x, "EndpointIdentifier", value.asInstanceOf[js.Any])
    
    inline def setEndpointIdentifierUndefined: Self = StObject.set(x, "EndpointIdentifier", js.undefined)
    
    inline def setEndpointType(value: ReplicationEndpointTypeValue): Self = StObject.set(x, "EndpointType", value.asInstanceOf[js.Any])
    
    inline def setEndpointTypeUndefined: Self = StObject.set(x, "EndpointType", js.undefined)
    
    inline def setEngineName(value: String): Self = StObject.set(x, "EngineName", value.asInstanceOf[js.Any])
    
    inline def setEngineNameUndefined: Self = StObject.set(x, "EngineName", js.undefined)
    
    inline def setExactSettings(value: BooleanOptional): Self = StObject.set(x, "ExactSettings", value.asInstanceOf[js.Any])
    
    inline def setExactSettingsUndefined: Self = StObject.set(x, "ExactSettings", js.undefined)
    
    inline def setExternalTableDefinition(value: String): Self = StObject.set(x, "ExternalTableDefinition", value.asInstanceOf[js.Any])
    
    inline def setExternalTableDefinitionUndefined: Self = StObject.set(x, "ExternalTableDefinition", js.undefined)
    
    inline def setExtraConnectionAttributes(value: String): Self = StObject.set(x, "ExtraConnectionAttributes", value.asInstanceOf[js.Any])
    
    inline def setExtraConnectionAttributesUndefined: Self = StObject.set(x, "ExtraConnectionAttributes", js.undefined)
    
    inline def setGcpMySQLSettings(value: GcpMySQLSettings): Self = StObject.set(x, "GcpMySQLSettings", value.asInstanceOf[js.Any])
    
    inline def setGcpMySQLSettingsUndefined: Self = StObject.set(x, "GcpMySQLSettings", js.undefined)
    
    inline def setIBMDb2Settings(value: IBMDb2Settings): Self = StObject.set(x, "IBMDb2Settings", value.asInstanceOf[js.Any])
    
    inline def setIBMDb2SettingsUndefined: Self = StObject.set(x, "IBMDb2Settings", js.undefined)
    
    inline def setKafkaSettings(value: KafkaSettings): Self = StObject.set(x, "KafkaSettings", value.asInstanceOf[js.Any])
    
    inline def setKafkaSettingsUndefined: Self = StObject.set(x, "KafkaSettings", js.undefined)
    
    inline def setKinesisSettings(value: KinesisSettings): Self = StObject.set(x, "KinesisSettings", value.asInstanceOf[js.Any])
    
    inline def setKinesisSettingsUndefined: Self = StObject.set(x, "KinesisSettings", js.undefined)
    
    inline def setMicrosoftSQLServerSettings(value: MicrosoftSQLServerSettings): Self = StObject.set(x, "MicrosoftSQLServerSettings", value.asInstanceOf[js.Any])
    
    inline def setMicrosoftSQLServerSettingsUndefined: Self = StObject.set(x, "MicrosoftSQLServerSettings", js.undefined)
    
    inline def setMongoDbSettings(value: MongoDbSettings): Self = StObject.set(x, "MongoDbSettings", value.asInstanceOf[js.Any])
    
    inline def setMongoDbSettingsUndefined: Self = StObject.set(x, "MongoDbSettings", js.undefined)
    
    inline def setMySQLSettings(value: MySQLSettings): Self = StObject.set(x, "MySQLSettings", value.asInstanceOf[js.Any])
    
    inline def setMySQLSettingsUndefined: Self = StObject.set(x, "MySQLSettings", js.undefined)
    
    inline def setNeptuneSettings(value: NeptuneSettings): Self = StObject.set(x, "NeptuneSettings", value.asInstanceOf[js.Any])
    
    inline def setNeptuneSettingsUndefined: Self = StObject.set(x, "NeptuneSettings", js.undefined)
    
    inline def setOracleSettings(value: OracleSettings): Self = StObject.set(x, "OracleSettings", value.asInstanceOf[js.Any])
    
    inline def setOracleSettingsUndefined: Self = StObject.set(x, "OracleSettings", js.undefined)
    
    inline def setPassword(value: SecretString): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "Password", js.undefined)
    
    inline def setPort(value: IntegerOptional): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setPostgreSQLSettings(value: PostgreSQLSettings): Self = StObject.set(x, "PostgreSQLSettings", value.asInstanceOf[js.Any])
    
    inline def setPostgreSQLSettingsUndefined: Self = StObject.set(x, "PostgreSQLSettings", js.undefined)
    
    inline def setRedisSettings(value: RedisSettings): Self = StObject.set(x, "RedisSettings", value.asInstanceOf[js.Any])
    
    inline def setRedisSettingsUndefined: Self = StObject.set(x, "RedisSettings", js.undefined)
    
    inline def setRedshiftSettings(value: RedshiftSettings): Self = StObject.set(x, "RedshiftSettings", value.asInstanceOf[js.Any])
    
    inline def setRedshiftSettingsUndefined: Self = StObject.set(x, "RedshiftSettings", js.undefined)
    
    inline def setS3Settings(value: S3Settings): Self = StObject.set(x, "S3Settings", value.asInstanceOf[js.Any])
    
    inline def setS3SettingsUndefined: Self = StObject.set(x, "S3Settings", js.undefined)
    
    inline def setServerName(value: String): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
    
    inline def setServerNameUndefined: Self = StObject.set(x, "ServerName", js.undefined)
    
    inline def setServiceAccessRoleArn(value: String): Self = StObject.set(x, "ServiceAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setServiceAccessRoleArnUndefined: Self = StObject.set(x, "ServiceAccessRoleArn", js.undefined)
    
    inline def setSslMode(value: DmsSslModeValue): Self = StObject.set(x, "SslMode", value.asInstanceOf[js.Any])
    
    inline def setSslModeUndefined: Self = StObject.set(x, "SslMode", js.undefined)
    
    inline def setSybaseSettings(value: SybaseSettings): Self = StObject.set(x, "SybaseSettings", value.asInstanceOf[js.Any])
    
    inline def setSybaseSettingsUndefined: Self = StObject.set(x, "SybaseSettings", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
