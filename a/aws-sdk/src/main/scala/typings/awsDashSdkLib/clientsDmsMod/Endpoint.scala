package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Endpoint extends js.Object {
  /**
    * The Amazon Resource Name (ARN) used for SSL connection to the endpoint.
    */
  var CertificateArn: js.UndefOr[String] = js.undefined
  /**
    * The name of the database at the endpoint.
    */
  var DatabaseName: js.UndefOr[String] = js.undefined
  /**
    * The settings in JSON format for the DMS transfer type of source endpoint.  Possible attributes include the following:    serviceAccessRoleArn - The IAM role that has permission to access the Amazon S3 bucket.    bucketName - The name of the S3 bucket to use.    compressionType - An optional parameter to use GZIP to compress the target files. To use GZIP, set this value to NONE (the default). To keep the files uncompressed, don't use this value.   Shorthand syntax for these attributes is as follows: ServiceAccessRoleArn=string,BucketName=string,CompressionType=string  JSON syntax for these attributes is as follows: { "ServiceAccessRoleArn": "string", "BucketName": "string", "CompressionType": "none"|"gzip" }  
    */
  var DmsTransferSettings: js.UndefOr[DmsTransferSettings] = js.undefined
  /**
    * The settings for the target DynamoDB database. For more information, see the DynamoDBSettings structure.
    */
  var DynamoDbSettings: js.UndefOr[DynamoDbSettings] = js.undefined
  /**
    * The settings for the Elasticsearch source endpoint. For more information, see the ElasticsearchSettings structure.
    */
  var ElasticsearchSettings: js.UndefOr[ElasticsearchSettings] = js.undefined
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
    */
  var EndpointArn: js.UndefOr[String] = js.undefined
  /**
    * The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters, digits, and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
    */
  var EndpointIdentifier: js.UndefOr[String] = js.undefined
  /**
    * The type of endpoint.
    */
  var EndpointType: js.UndefOr[ReplicationEndpointTypeValue] = js.undefined
  /**
    * The expanded name for the engine name. For example, if the EngineName parameter is "aurora," this value would be "Amazon Aurora MySQL."
    */
  var EngineDisplayName: js.UndefOr[String] = js.undefined
  /**
    * The database engine name. Valid values, depending on the EndPointType, include mysql, oracle, postgres, mariadb, aurora, aurora-postgresql, redshift, s3, db2, azuredb, sybase, sybase, dynamodb, mongodb, and sqlserver.
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
    * The settings for the Amazon Kinesis source endpoint. For more information, see the KinesisSettings structure.
    */
  var KinesisSettings: js.UndefOr[KinesisSettings] = js.undefined
  /**
    * The AWS KMS key identifier that is used to encrypt the content on the replication instance. If you don't specify a value for the KmsKeyId parameter, then AWS DMS uses your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS Region.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  /**
    * The settings for the MongoDB source endpoint. For more information, see the MongoDbSettings structure.
    */
  var MongoDbSettings: js.UndefOr[MongoDbSettings] = js.undefined
  /**
    * The port value used to access the endpoint.
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * Settings for the Amazon Redshift endpoint
    */
  var RedshiftSettings: js.UndefOr[RedshiftSettings] = js.undefined
  /**
    * The settings for the S3 target endpoint. For more information, see the S3Settings structure.
    */
  var S3Settings: js.UndefOr[S3Settings] = js.undefined
  /**
    * The name of the server at the endpoint.
    */
  var ServerName: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) used by the service access IAM role.
    */
  var ServiceAccessRoleArn: js.UndefOr[String] = js.undefined
  /**
    * The SSL mode used to connect to the endpoint. SSL mode can be one of four values: none, require, verify-ca, verify-full.  The default value is none.
    */
  var SslMode: js.UndefOr[DmsSslModeValue] = js.undefined
  /**
    * The status of the endpoint.
    */
  var Status: js.UndefOr[String] = js.undefined
  /**
    * The user name used to connect to the endpoint.
    */
  var Username: js.UndefOr[String] = js.undefined
}

object Endpoint {
  @scala.inline
  def apply(
    CertificateArn: String = null,
    DatabaseName: String = null,
    DmsTransferSettings: DmsTransferSettings = null,
    DynamoDbSettings: DynamoDbSettings = null,
    ElasticsearchSettings: ElasticsearchSettings = null,
    EndpointArn: String = null,
    EndpointIdentifier: String = null,
    EndpointType: ReplicationEndpointTypeValue = null,
    EngineDisplayName: String = null,
    EngineName: String = null,
    ExternalId: String = null,
    ExternalTableDefinition: String = null,
    ExtraConnectionAttributes: String = null,
    KinesisSettings: KinesisSettings = null,
    KmsKeyId: String = null,
    MongoDbSettings: MongoDbSettings = null,
    Port: js.UndefOr[IntegerOptional] = js.undefined,
    RedshiftSettings: RedshiftSettings = null,
    S3Settings: S3Settings = null,
    ServerName: String = null,
    ServiceAccessRoleArn: String = null,
    SslMode: DmsSslModeValue = null,
    Status: String = null,
    Username: String = null
  ): Endpoint = {
    val __obj = js.Dynamic.literal()
    if (CertificateArn != null) __obj.updateDynamic("CertificateArn")(CertificateArn)
    if (DatabaseName != null) __obj.updateDynamic("DatabaseName")(DatabaseName)
    if (DmsTransferSettings != null) __obj.updateDynamic("DmsTransferSettings")(DmsTransferSettings)
    if (DynamoDbSettings != null) __obj.updateDynamic("DynamoDbSettings")(DynamoDbSettings)
    if (ElasticsearchSettings != null) __obj.updateDynamic("ElasticsearchSettings")(ElasticsearchSettings)
    if (EndpointArn != null) __obj.updateDynamic("EndpointArn")(EndpointArn)
    if (EndpointIdentifier != null) __obj.updateDynamic("EndpointIdentifier")(EndpointIdentifier)
    if (EndpointType != null) __obj.updateDynamic("EndpointType")(EndpointType.asInstanceOf[js.Any])
    if (EngineDisplayName != null) __obj.updateDynamic("EngineDisplayName")(EngineDisplayName)
    if (EngineName != null) __obj.updateDynamic("EngineName")(EngineName)
    if (ExternalId != null) __obj.updateDynamic("ExternalId")(ExternalId)
    if (ExternalTableDefinition != null) __obj.updateDynamic("ExternalTableDefinition")(ExternalTableDefinition)
    if (ExtraConnectionAttributes != null) __obj.updateDynamic("ExtraConnectionAttributes")(ExtraConnectionAttributes)
    if (KinesisSettings != null) __obj.updateDynamic("KinesisSettings")(KinesisSettings)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (MongoDbSettings != null) __obj.updateDynamic("MongoDbSettings")(MongoDbSettings)
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port)
    if (RedshiftSettings != null) __obj.updateDynamic("RedshiftSettings")(RedshiftSettings)
    if (S3Settings != null) __obj.updateDynamic("S3Settings")(S3Settings)
    if (ServerName != null) __obj.updateDynamic("ServerName")(ServerName)
    if (ServiceAccessRoleArn != null) __obj.updateDynamic("ServiceAccessRoleArn")(ServiceAccessRoleArn)
    if (SslMode != null) __obj.updateDynamic("SslMode")(SslMode.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (Username != null) __obj.updateDynamic("Username")(Username)
    __obj.asInstanceOf[Endpoint]
  }
}

