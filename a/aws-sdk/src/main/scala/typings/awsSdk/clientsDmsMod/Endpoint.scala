package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Endpoint extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) used for SSL connection to the endpoint.
    */
  var CertificateArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the database at the endpoint.
    */
  var DatabaseName: js.UndefOr[String] = js.undefined
  
  /**
    * The settings for the DMS Transfer type source. For more information, see the DmsTransferSettings structure. 
    */
  var DmsTransferSettings: js.UndefOr[typings.awsSdk.clientsDmsMod.DmsTransferSettings] = js.undefined
  
  var DocDbSettings: js.UndefOr[typings.awsSdk.clientsDmsMod.DocDbSettings] = js.undefined
  
  /**
    * The settings for the DynamoDB target endpoint. For more information, see the DynamoDBSettings structure.
    */
  var DynamoDbSettings: js.UndefOr[typings.awsSdk.clientsDmsMod.DynamoDbSettings] = js.undefined
  
  /**
    * The settings for the OpenSearch source endpoint. For more information, see the ElasticsearchSettings structure.
    */
  var ElasticsearchSettings: js.UndefOr[typings.awsSdk.clientsDmsMod.ElasticsearchSettings] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
    */
  var EndpointArn: js.UndefOr[String] = js.undefined
  
  /**
    * The database endpoint identifier. Identifiers must begin with a letter and must contain only ASCII letters, digits, and hyphens. They can't end with a hyphen or contain two consecutive hyphens.
    */
  var EndpointIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The type of endpoint. Valid values are source and target.
    */
  var EndpointType: js.UndefOr[ReplicationEndpointTypeValue] = js.undefined
  
  /**
    * The expanded name for the engine name. For example, if the EngineName parameter is "aurora", this value would be "Amazon Aurora MySQL".
    */
  var EngineDisplayName: js.UndefOr[String] = js.undefined
  
  /**
    * The database engine name. Valid values, depending on the EndpointType, include "mysql", "oracle", "postgres", "mariadb", "aurora", "aurora-postgresql", "redshift", "s3", "db2", "db2-zos", "azuredb", "sybase", "dynamodb", "mongodb", "kinesis", "kafka", "elasticsearch", "documentdb", "sqlserver", "neptune", and "babelfish".
    */
  var EngineName: js.UndefOr[String] = js.undefined
  
  /**
    *  Value returned by a call to CreateEndpoint that can be used for cross-account validation. Use it on a subsequent call to CreateEndpoint to create the endpoint with a cross-account. 
    */
  var ExternalId: js.UndefOr[String] = js.undefined
  
  /**
    * The external table definition.
    */
  var ExternalTableDefinition: js.UndefOr[String] = js.undefined
  
  /**
    * Additional connection attributes used to connect to the endpoint.
    */
  var ExtraConnectionAttributes: js.UndefOr[String] = js.undefined
  
  /**
    * Settings in JSON format for the source GCP MySQL endpoint.
    */
  var GcpMySQLSettings: js.UndefOr[typings.awsSdk.clientsDmsMod.GcpMySQLSettings] = js.undefined
  
  /**
    * The settings for the IBM Db2 LUW source endpoint. For more information, see the IBMDb2Settings structure. 
    */
  var IBMDb2Settings: js.UndefOr[typings.awsSdk.clientsDmsMod.IBMDb2Settings] = js.undefined
  
  /**
    * The settings for the Apache Kafka target endpoint. For more information, see the KafkaSettings structure.
    */
  var KafkaSettings: js.UndefOr[typings.awsSdk.clientsDmsMod.KafkaSettings] = js.undefined
  
  /**
    * The settings for the Amazon Kinesis target endpoint. For more information, see the KinesisSettings structure.
    */
  var KinesisSettings: js.UndefOr[typings.awsSdk.clientsDmsMod.KinesisSettings] = js.undefined
  
  /**
    * An KMS key identifier that is used to encrypt the connection parameters for the endpoint. If you don't specify a value for the KmsKeyId parameter, then DMS uses your default encryption key. KMS creates the default encryption key for your Amazon Web Services account. Your Amazon Web Services account has a different default encryption key for each Amazon Web Services Region.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The settings for the Microsoft SQL Server source and target endpoint. For more information, see the MicrosoftSQLServerSettings structure.
    */
  var MicrosoftSQLServerSettings: js.UndefOr[typings.awsSdk.clientsDmsMod.MicrosoftSQLServerSettings] = js.undefined
  
  /**
    * The settings for the MongoDB source endpoint. For more information, see the MongoDbSettings structure.
    */
  var MongoDbSettings: js.UndefOr[typings.awsSdk.clientsDmsMod.MongoDbSettings] = js.undefined
  
  /**
    * The settings for the MySQL source and target endpoint. For more information, see the MySQLSettings structure.
    */
  var MySQLSettings: js.UndefOr[typings.awsSdk.clientsDmsMod.MySQLSettings] = js.undefined
  
  /**
    * The settings for the Amazon Neptune target endpoint. For more information, see the NeptuneSettings structure.
    */
  var NeptuneSettings: js.UndefOr[typings.awsSdk.clientsDmsMod.NeptuneSettings] = js.undefined
  
  /**
    * The settings for the Oracle source and target endpoint. For more information, see the OracleSettings structure.
    */
  var OracleSettings: js.UndefOr[typings.awsSdk.clientsDmsMod.OracleSettings] = js.undefined
  
  /**
    * The port value used to access the endpoint.
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The settings for the PostgreSQL source and target endpoint. For more information, see the PostgreSQLSettings structure.
    */
  var PostgreSQLSettings: js.UndefOr[typings.awsSdk.clientsDmsMod.PostgreSQLSettings] = js.undefined
  
  /**
    * The settings for the Redis target endpoint. For more information, see the RedisSettings structure.
    */
  var RedisSettings: js.UndefOr[typings.awsSdk.clientsDmsMod.RedisSettings] = js.undefined
  
  /**
    * Settings for the Amazon Redshift endpoint.
    */
  var RedshiftSettings: js.UndefOr[typings.awsSdk.clientsDmsMod.RedshiftSettings] = js.undefined
  
  /**
    * The settings for the S3 target endpoint. For more information, see the S3Settings structure.
    */
  var S3Settings: js.UndefOr[typings.awsSdk.clientsDmsMod.S3Settings] = js.undefined
  
  /**
    * The name of the server at the endpoint.
    */
  var ServerName: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) used by the service to access the IAM role. The role must allow the iam:PassRole action.
    */
  var ServiceAccessRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * The SSL mode used to connect to the endpoint. The default value is none.
    */
  var SslMode: js.UndefOr[DmsSslModeValue] = js.undefined
  
  /**
    * The status of the endpoint.
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * The settings for the SAP ASE source and target endpoint. For more information, see the SybaseSettings structure.
    */
  var SybaseSettings: js.UndefOr[typings.awsSdk.clientsDmsMod.SybaseSettings] = js.undefined
  
  /**
    * The user name used to connect to the endpoint.
    */
  var Username: js.UndefOr[String] = js.undefined
}
object Endpoint {
  
  inline def apply(): Endpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Endpoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Endpoint] (val x: Self) extends AnyVal {
    
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
    
    inline def setEndpointArnUndefined: Self = StObject.set(x, "EndpointArn", js.undefined)
    
    inline def setEndpointIdentifier(value: String): Self = StObject.set(x, "EndpointIdentifier", value.asInstanceOf[js.Any])
    
    inline def setEndpointIdentifierUndefined: Self = StObject.set(x, "EndpointIdentifier", js.undefined)
    
    inline def setEndpointType(value: ReplicationEndpointTypeValue): Self = StObject.set(x, "EndpointType", value.asInstanceOf[js.Any])
    
    inline def setEndpointTypeUndefined: Self = StObject.set(x, "EndpointType", js.undefined)
    
    inline def setEngineDisplayName(value: String): Self = StObject.set(x, "EngineDisplayName", value.asInstanceOf[js.Any])
    
    inline def setEngineDisplayNameUndefined: Self = StObject.set(x, "EngineDisplayName", js.undefined)
    
    inline def setEngineName(value: String): Self = StObject.set(x, "EngineName", value.asInstanceOf[js.Any])
    
    inline def setEngineNameUndefined: Self = StObject.set(x, "EngineName", js.undefined)
    
    inline def setExternalId(value: String): Self = StObject.set(x, "ExternalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "ExternalId", js.undefined)
    
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
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
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
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setSybaseSettings(value: SybaseSettings): Self = StObject.set(x, "SybaseSettings", value.asInstanceOf[js.Any])
    
    inline def setSybaseSettingsUndefined: Self = StObject.set(x, "SybaseSettings", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
