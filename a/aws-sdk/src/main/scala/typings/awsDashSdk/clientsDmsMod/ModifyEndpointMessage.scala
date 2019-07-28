package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyEndpointMessage extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the certificate used for SSL connection.
    */
  var CertificateArn: js.UndefOr[String] = js.undefined
  /**
    * The name of the endpoint database.
    */
  var DatabaseName: js.UndefOr[String] = js.undefined
  /**
    * The settings in JSON format for the DMS transfer type of source endpoint.  Attributes include the following:   serviceAccessRoleArn - The IAM role that has permission to access the Amazon S3 bucket.   BucketName - The name of the S3 bucket to use.   compressionType - An optional parameter to use GZIP to compress the target files. Set to NONE (the default) or do not use to leave the files uncompressed.   Shorthand syntax: ServiceAccessRoleArn=string ,BucketName=string,CompressionType=string JSON syntax:  { "ServiceAccessRoleArn": "string", "BucketName": "string", "CompressionType": "none"|"gzip" } 
    */
  var DmsTransferSettings: js.UndefOr[typings.awsDashSdk.clientsDmsMod.DmsTransferSettings] = js.undefined
  /**
    * Settings in JSON format for the target Amazon DynamoDB endpoint. For more information about the available settings, see Using Object Mapping to Migrate Data to DynamoDB in the AWS Database Migration Service User Guide. 
    */
  var DynamoDbSettings: js.UndefOr[typings.awsDashSdk.clientsDmsMod.DynamoDbSettings] = js.undefined
  /**
    * Settings in JSON format for the target Elasticsearch endpoint. For more information about the available settings, see Extra Connection Attributes When Using Elasticsearch as a Target for AWS DMS in the AWS Database Migration User Guide. 
    */
  var ElasticsearchSettings: js.UndefOr[typings.awsDashSdk.clientsDmsMod.ElasticsearchSettings] = js.undefined
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
    */
  var EndpointArn: String
  /**
    * The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters, digits, and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
    */
  var EndpointIdentifier: js.UndefOr[String] = js.undefined
  /**
    * The type of endpoint. Valid values are source and target.
    */
  var EndpointType: js.UndefOr[ReplicationEndpointTypeValue] = js.undefined
  /**
    * The type of engine for the endpoint. Valid values, depending on the EndpointType, include mysql, oracle, postgres, mariadb, aurora, aurora-postgresql, redshift, s3, db2, azuredb, sybase, dynamodb, mongodb, and sqlserver.
    */
  var EngineName: js.UndefOr[String] = js.undefined
  /**
    * The external table definition.
    */
  var ExternalTableDefinition: js.UndefOr[String] = js.undefined
  /**
    * Additional attributes associated with the connection. To reset this parameter, pass the empty string ("") as an argument.
    */
  var ExtraConnectionAttributes: js.UndefOr[String] = js.undefined
  /**
    * Settings in JSON format for the target Amazon Kinesis Data Streams endpoint. For more information about the available settings, see Using Object Mapping to Migrate Data to a Kinesis Data Stream in the AWS Database Migration User Guide. 
    */
  var KinesisSettings: js.UndefOr[typings.awsDashSdk.clientsDmsMod.KinesisSettings] = js.undefined
  /**
    * Settings in JSON format for the source MongoDB endpoint. For more information about the available settings, see the configuration properties section in  Using MongoDB as a Target for AWS Database Migration Service in the AWS Database Migration Service User Guide. 
    */
  var MongoDbSettings: js.UndefOr[typings.awsDashSdk.clientsDmsMod.MongoDbSettings] = js.undefined
  /**
    * The password to be used to login to the endpoint database.
    */
  var Password: js.UndefOr[SecretString] = js.undefined
  /**
    * The port used by the endpoint database.
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  var RedshiftSettings: js.UndefOr[typings.awsDashSdk.clientsDmsMod.RedshiftSettings] = js.undefined
  /**
    * Settings in JSON format for the target Amazon S3 endpoint. For more information about the available settings, see Extra Connection Attributes When Using Amazon S3 as a Target for AWS DMS in the AWS Database Migration Service User Guide. 
    */
  var S3Settings: js.UndefOr[typings.awsDashSdk.clientsDmsMod.S3Settings] = js.undefined
  /**
    * The name of the server where the endpoint database resides.
    */
  var ServerName: js.UndefOr[String] = js.undefined
  /**
    *  The Amazon Resource Name (ARN) for the service access role you want to use to modify the endpoint. 
    */
  var ServiceAccessRoleArn: js.UndefOr[String] = js.undefined
  /**
    * The SSL mode used to connect to the endpoint. The default value is none.
    */
  var SslMode: js.UndefOr[DmsSslModeValue] = js.undefined
  /**
    * The user name to be used to login to the endpoint database.
    */
  var Username: js.UndefOr[String] = js.undefined
}

object ModifyEndpointMessage {
  @scala.inline
  def apply(
    EndpointArn: String,
    CertificateArn: String = null,
    DatabaseName: String = null,
    DmsTransferSettings: DmsTransferSettings = null,
    DynamoDbSettings: DynamoDbSettings = null,
    ElasticsearchSettings: ElasticsearchSettings = null,
    EndpointIdentifier: String = null,
    EndpointType: ReplicationEndpointTypeValue = null,
    EngineName: String = null,
    ExternalTableDefinition: String = null,
    ExtraConnectionAttributes: String = null,
    KinesisSettings: KinesisSettings = null,
    MongoDbSettings: MongoDbSettings = null,
    Password: SecretString = null,
    Port: js.UndefOr[IntegerOptional] = js.undefined,
    RedshiftSettings: RedshiftSettings = null,
    S3Settings: S3Settings = null,
    ServerName: String = null,
    ServiceAccessRoleArn: String = null,
    SslMode: DmsSslModeValue = null,
    Username: String = null
  ): ModifyEndpointMessage = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn)
    if (CertificateArn != null) __obj.updateDynamic("CertificateArn")(CertificateArn)
    if (DatabaseName != null) __obj.updateDynamic("DatabaseName")(DatabaseName)
    if (DmsTransferSettings != null) __obj.updateDynamic("DmsTransferSettings")(DmsTransferSettings)
    if (DynamoDbSettings != null) __obj.updateDynamic("DynamoDbSettings")(DynamoDbSettings)
    if (ElasticsearchSettings != null) __obj.updateDynamic("ElasticsearchSettings")(ElasticsearchSettings)
    if (EndpointIdentifier != null) __obj.updateDynamic("EndpointIdentifier")(EndpointIdentifier)
    if (EndpointType != null) __obj.updateDynamic("EndpointType")(EndpointType.asInstanceOf[js.Any])
    if (EngineName != null) __obj.updateDynamic("EngineName")(EngineName)
    if (ExternalTableDefinition != null) __obj.updateDynamic("ExternalTableDefinition")(ExternalTableDefinition)
    if (ExtraConnectionAttributes != null) __obj.updateDynamic("ExtraConnectionAttributes")(ExtraConnectionAttributes)
    if (KinesisSettings != null) __obj.updateDynamic("KinesisSettings")(KinesisSettings)
    if (MongoDbSettings != null) __obj.updateDynamic("MongoDbSettings")(MongoDbSettings)
    if (Password != null) __obj.updateDynamic("Password")(Password)
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port)
    if (RedshiftSettings != null) __obj.updateDynamic("RedshiftSettings")(RedshiftSettings)
    if (S3Settings != null) __obj.updateDynamic("S3Settings")(S3Settings)
    if (ServerName != null) __obj.updateDynamic("ServerName")(ServerName)
    if (ServiceAccessRoleArn != null) __obj.updateDynamic("ServiceAccessRoleArn")(ServiceAccessRoleArn)
    if (SslMode != null) __obj.updateDynamic("SslMode")(SslMode.asInstanceOf[js.Any])
    if (Username != null) __obj.updateDynamic("Username")(Username)
    __obj.asInstanceOf[ModifyEndpointMessage]
  }
}

