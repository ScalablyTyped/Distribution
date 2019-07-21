package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateEndpointMessage extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the certificate.
    */
  var CertificateArn: js.UndefOr[String] = js.undefined
  /**
    * The name of the endpoint database.
    */
  var DatabaseName: js.UndefOr[String] = js.undefined
  /**
    * The settings in JSON format for the DMS transfer type of source endpoint.  Possible attributes include the following:    serviceAccessRoleArn - The IAM role that has permission to access the Amazon S3 bucket.    bucketName - The name of the S3 bucket to use.    compressionType - An optional parameter to use GZIP to compress the target files. To use GZIP, set this value to NONE (the default). To keep the files uncompressed, don't use this value.   Shorthand syntax for these attributes is as follows: ServiceAccessRoleArn=string,BucketName=string,CompressionType=string  JSON syntax for these attributes is as follows: { "ServiceAccessRoleArn": "string", "BucketName": "string", "CompressionType": "none"|"gzip" }  
    */
  var DmsTransferSettings: js.UndefOr[DmsTransferSettings] = js.undefined
  /**
    * Settings in JSON format for the target Amazon DynamoDB endpoint. For more information about the available settings, see Using Object Mapping to Migrate Data to DynamoDB in the AWS Database Migration Service User Guide. 
    */
  var DynamoDbSettings: js.UndefOr[DynamoDbSettings] = js.undefined
  /**
    * Settings in JSON format for the target Elasticsearch endpoint. For more information about the available settings, see Extra Connection Attributes When Using Elasticsearch as a Target for AWS DMS in the AWS Database Migration User Guide. 
    */
  var ElasticsearchSettings: js.UndefOr[ElasticsearchSettings] = js.undefined
  /**
    * The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters, digits, and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
    */
  var EndpointIdentifier: String
  /**
    * The type of endpoint. Valid values are source and target.
    */
  var EndpointType: ReplicationEndpointTypeValue
  /**
    * The type of engine for the endpoint. Valid values, depending on the EndpointType value, include mysql, oracle, postgres, mariadb, aurora, aurora-postgresql, redshift, s3, db2, azuredb, sybase, dynamodb, mongodb, and sqlserver.
    */
  var EngineName: String
  /**
    * The external table definition. 
    */
  var ExternalTableDefinition: js.UndefOr[String] = js.undefined
  /**
    * Additional attributes associated with the connection. Each attribute is specified as a name-value pair associated by an equal sign (=). Multiple attributes are separated by a semicolon (;) with no additional white space. For information on the attributes available for connecting your source or target endpoint, see Working with AWS DMS Endpoints in the AWS Database Migration Service User Guide. 
    */
  var ExtraConnectionAttributes: js.UndefOr[String] = js.undefined
  /**
    * Settings in JSON format for the target Amazon Kinesis Data Streams endpoint. For more information about the available settings, see Using Object Mapping to Migrate Data to a Kinesis Data Stream in the AWS Database Migration User Guide. 
    */
  var KinesisSettings: js.UndefOr[KinesisSettings] = js.undefined
  /**
    * An AWS KMS key identifier that is used to encrypt the connection parameters for the endpoint. If you don't specify a value for the KmsKeyId parameter, then AWS DMS uses your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS Region.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  /**
    * Settings in JSON format for the source MongoDB endpoint. For more information about the available settings, see the configuration properties section in  Using MongoDB as a Target for AWS Database Migration Service in the AWS Database Migration Service User Guide. 
    */
  var MongoDbSettings: js.UndefOr[MongoDbSettings] = js.undefined
  /**
    * The password to be used to log in to the endpoint database.
    */
  var Password: js.UndefOr[SecretString] = js.undefined
  /**
    * The port used by the endpoint database.
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  var RedshiftSettings: js.UndefOr[RedshiftSettings] = js.undefined
  /**
    * Settings in JSON format for the target Amazon S3 endpoint. For more information about the available settings, see Extra Connection Attributes When Using Amazon S3 as a Target for AWS DMS in the AWS Database Migration Service User Guide. 
    */
  var S3Settings: js.UndefOr[S3Settings] = js.undefined
  /**
    * The name of the server where the endpoint database resides.
    */
  var ServerName: js.UndefOr[String] = js.undefined
  /**
    *  The Amazon Resource Name (ARN) for the service access role that you want to use to create the endpoint. 
    */
  var ServiceAccessRoleArn: js.UndefOr[String] = js.undefined
  /**
    * The Secure Sockets Layer (SSL) mode to use for the SSL connection. The default is none 
    */
  var SslMode: js.UndefOr[DmsSslModeValue] = js.undefined
  /**
    * One or more tags to be assigned to the endpoint.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The user name to be used to log in to the endpoint database.
    */
  var Username: js.UndefOr[String] = js.undefined
}

object CreateEndpointMessage {
  @scala.inline
  def apply(
    EndpointIdentifier: String,
    EndpointType: ReplicationEndpointTypeValue,
    EngineName: String,
    CertificateArn: String = null,
    DatabaseName: String = null,
    DmsTransferSettings: DmsTransferSettings = null,
    DynamoDbSettings: DynamoDbSettings = null,
    ElasticsearchSettings: ElasticsearchSettings = null,
    ExternalTableDefinition: String = null,
    ExtraConnectionAttributes: String = null,
    KinesisSettings: KinesisSettings = null,
    KmsKeyId: String = null,
    MongoDbSettings: MongoDbSettings = null,
    Password: SecretString = null,
    Port: js.UndefOr[IntegerOptional] = js.undefined,
    RedshiftSettings: RedshiftSettings = null,
    S3Settings: S3Settings = null,
    ServerName: String = null,
    ServiceAccessRoleArn: String = null,
    SslMode: DmsSslModeValue = null,
    Tags: TagList = null,
    Username: String = null
  ): CreateEndpointMessage = {
    val __obj = js.Dynamic.literal(EndpointIdentifier = EndpointIdentifier, EndpointType = EndpointType.asInstanceOf[js.Any], EngineName = EngineName)
    if (CertificateArn != null) __obj.updateDynamic("CertificateArn")(CertificateArn)
    if (DatabaseName != null) __obj.updateDynamic("DatabaseName")(DatabaseName)
    if (DmsTransferSettings != null) __obj.updateDynamic("DmsTransferSettings")(DmsTransferSettings)
    if (DynamoDbSettings != null) __obj.updateDynamic("DynamoDbSettings")(DynamoDbSettings)
    if (ElasticsearchSettings != null) __obj.updateDynamic("ElasticsearchSettings")(ElasticsearchSettings)
    if (ExternalTableDefinition != null) __obj.updateDynamic("ExternalTableDefinition")(ExternalTableDefinition)
    if (ExtraConnectionAttributes != null) __obj.updateDynamic("ExtraConnectionAttributes")(ExtraConnectionAttributes)
    if (KinesisSettings != null) __obj.updateDynamic("KinesisSettings")(KinesisSettings)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (MongoDbSettings != null) __obj.updateDynamic("MongoDbSettings")(MongoDbSettings)
    if (Password != null) __obj.updateDynamic("Password")(Password)
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port)
    if (RedshiftSettings != null) __obj.updateDynamic("RedshiftSettings")(RedshiftSettings)
    if (S3Settings != null) __obj.updateDynamic("S3Settings")(S3Settings)
    if (ServerName != null) __obj.updateDynamic("ServerName")(ServerName)
    if (ServiceAccessRoleArn != null) __obj.updateDynamic("ServiceAccessRoleArn")(ServiceAccessRoleArn)
    if (SslMode != null) __obj.updateDynamic("SslMode")(SslMode.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (Username != null) __obj.updateDynamic("Username")(Username)
    __obj.asInstanceOf[CreateEndpointMessage]
  }
}

