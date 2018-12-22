package typings
package awsDashSdkLib.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/firehose", "Firehose")
@js.native
object FirehoseNs extends js.Object {
  
  trait BufferingHints extends js.Object {
    /**
         * Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The default value is 300.
         */
    var IntervalInSeconds: js.UndefOr[IntervalInSeconds] = js.undefined
    /**
         * Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default value is 5. We recommend setting this parameter to a value greater than the amount of data you typically ingest into the delivery stream in 10 seconds. For example, if you typically ingest data at 1 MB/sec, the value should be 10 MB or higher.
         */
    var SizeInMBs: js.UndefOr[SizeInMBs] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait CloudWatchLoggingOptions extends js.Object {
    /**
         * Enables or disables CloudWatch logging.
         */
    var Enabled: js.UndefOr[BooleanObject] = js.undefined
    /**
         * The CloudWatch group name for logging. This value is required if CloudWatch logging is enabled.
         */
    var LogGroupName: js.UndefOr[LogGroupName] = js.undefined
    /**
         * The CloudWatch log stream name for logging. This value is required if CloudWatch logging is enabled.
         */
    var LogStreamName: js.UndefOr[LogStreamName] = js.undefined
  }
  
  
  trait ColumnToJsonKeyMappings
    extends /* key */ org.scalablytyped.runtime.StringDictionary[NonEmptyString]
  
  
  trait CopyCommand extends js.Object {
    /**
         * Optional parameters to use with the Amazon Redshift COPY command. For more information, see the "Optional Parameters" section of Amazon Redshift COPY command. Some possible examples that would apply to Kinesis Data Firehose are as follows:  delimiter '\t' lzop; - fields are delimited with "\t" (TAB character) and compressed using lzop.  delimiter '|' - fields are delimited with "|" (this is the default delimiter).  delimiter '|' escape - the delimiter should be escaped.  fixedwidth 'venueid:3,venuename:25,venuecity:12,venuestate:2,venueseats:6' - fields are fixed width in the source, with each width specified after every column in the table.  JSON 's3://mybucket/jsonpaths.txt' - data is in JSON format, and the path specified is the format of the data. For more examples, see Amazon Redshift COPY command examples.
         */
    var CopyOptions: js.UndefOr[CopyOptions] = js.undefined
    /**
         * A comma-separated list of column names.
         */
    var DataTableColumns: js.UndefOr[DataTableColumns] = js.undefined
    /**
         * The name of the target table. The table must already exist in the database.
         */
    var DataTableName: DataTableName
  }
  
  
  trait CreateDeliveryStreamInput extends js.Object {
    /**
         * The name of the delivery stream. This name must be unique per AWS account in the same AWS Region. If the delivery streams are in different accounts or different Regions, you can have multiple delivery streams with the same name.
         */
    var DeliveryStreamName: DeliveryStreamName
    /**
         * The delivery stream type. This parameter can be one of the following values:    DirectPut: Provider applications access the delivery stream directly.    KinesisStreamAsSource: The delivery stream uses a Kinesis data stream as a source.  
         */
    var DeliveryStreamType: js.UndefOr[DeliveryStreamType] = js.undefined
    /**
         * The destination in Amazon ES. You can specify only one destination.
         */
    var ElasticsearchDestinationConfiguration: js.UndefOr[ElasticsearchDestinationConfiguration] = js.undefined
    /**
         * The destination in Amazon S3. You can specify only one destination.
         */
    var ExtendedS3DestinationConfiguration: js.UndefOr[ExtendedS3DestinationConfiguration] = js.undefined
    /**
         * When a Kinesis data stream is used as the source for the delivery stream, a KinesisStreamSourceConfiguration containing the Kinesis data stream Amazon Resource Name (ARN) and the role ARN for the source stream.
         */
    var KinesisStreamSourceConfiguration: js.UndefOr[KinesisStreamSourceConfiguration] = js.undefined
    /**
         * The destination in Amazon Redshift. You can specify only one destination.
         */
    var RedshiftDestinationConfiguration: js.UndefOr[RedshiftDestinationConfiguration] = js.undefined
    /**
         * [Deprecated] The destination in Amazon S3. You can specify only one destination.
         */
    var S3DestinationConfiguration: js.UndefOr[S3DestinationConfiguration] = js.undefined
    /**
         * The destination in Splunk. You can specify only one destination.
         */
    var SplunkDestinationConfiguration: js.UndefOr[SplunkDestinationConfiguration] = js.undefined
    /**
         * A set of tags to assign to the delivery stream. A tag is a key-value pair that you can define and assign to AWS resources. Tags are metadata. For example, you can add friendly names and descriptions or other types of information that can help you distinguish the delivery stream. For more information about tags, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide. You can specify up to 50 tags when creating a delivery stream.
         */
    var Tags: js.UndefOr[TagDeliveryStreamInputTagList] = js.undefined
  }
  
  
  trait CreateDeliveryStreamOutput extends js.Object {
    /**
         * The ARN of the delivery stream.
         */
    var DeliveryStreamARN: js.UndefOr[DeliveryStreamARN] = js.undefined
  }
  
  
  trait DataFormatConversionConfiguration extends js.Object {
    /**
         * Defaults to true. Set it to false if you want to disable format conversion while preserving the configuration details.
         */
    var Enabled: js.UndefOr[BooleanObject] = js.undefined
    /**
         * Specifies the deserializer that you want Kinesis Data Firehose to use to convert the format of your data from JSON.
         */
    var InputFormatConfiguration: js.UndefOr[InputFormatConfiguration] = js.undefined
    /**
         * Specifies the serializer that you want Kinesis Data Firehose to use to convert the format of your data to the Parquet or ORC format.
         */
    var OutputFormatConfiguration: js.UndefOr[OutputFormatConfiguration] = js.undefined
    /**
         * Specifies the AWS Glue Data Catalog table that contains the column information.
         */
    var SchemaConfiguration: js.UndefOr[SchemaConfiguration] = js.undefined
  }
  
  
  trait DeleteDeliveryStreamInput extends js.Object {
    /**
         * The name of the delivery stream.
         */
    var DeliveryStreamName: DeliveryStreamName
  }
  
  
  trait DeleteDeliveryStreamOutput extends js.Object
  
  
  trait DeliveryStreamDescription extends js.Object {
    /**
         * The date and time that the delivery stream was created.
         */
    var CreateTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the delivery stream. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
         */
    var DeliveryStreamARN: DeliveryStreamARN
    /**
         * Indicates the server-side encryption (SSE) status for the delivery stream.
         */
    var DeliveryStreamEncryptionConfiguration: js.UndefOr[DeliveryStreamEncryptionConfiguration] = js.undefined
    /**
         * The name of the delivery stream.
         */
    var DeliveryStreamName: DeliveryStreamName
    /**
         * The status of the delivery stream.
         */
    var DeliveryStreamStatus: DeliveryStreamStatus
    /**
         * The delivery stream type. This can be one of the following values:    DirectPut: Provider applications access the delivery stream directly.    KinesisStreamAsSource: The delivery stream uses a Kinesis data stream as a source.  
         */
    var DeliveryStreamType: DeliveryStreamType
    /**
         * The destinations.
         */
    var Destinations: DestinationDescriptionList
    /**
         * Indicates whether there are more destinations available to list.
         */
    var HasMoreDestinations: BooleanObject
    /**
         * The date and time that the delivery stream was last updated.
         */
    var LastUpdateTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
         * If the DeliveryStreamType parameter is KinesisStreamAsSource, a SourceDescription object describing the source Kinesis data stream.
         */
    var Source: js.UndefOr[SourceDescription] = js.undefined
    /**
         * Each time the destination is updated for a delivery stream, the version ID is changed, and the current version ID is required when updating the destination. This is so that the service knows it is applying the changes to the correct version of the delivery stream.
         */
    var VersionId: DeliveryStreamVersionId
  }
  
  
  trait DeliveryStreamEncryptionConfiguration extends js.Object {
    /**
         * For a full description of the different values of this status, see StartDeliveryStreamEncryption and StopDeliveryStreamEncryption.
         */
    var Status: js.UndefOr[DeliveryStreamEncryptionStatus] = js.undefined
  }
  
  
  trait DescribeDeliveryStreamInput extends js.Object {
    /**
         * The name of the delivery stream.
         */
    var DeliveryStreamName: DeliveryStreamName
    /**
         * The ID of the destination to start returning the destination information. Kinesis Data Firehose supports one destination per delivery stream.
         */
    var ExclusiveStartDestinationId: js.UndefOr[DestinationId] = js.undefined
    /**
         * The limit on the number of destinations to return. You can have one destination per delivery stream.
         */
    var Limit: js.UndefOr[DescribeDeliveryStreamInputLimit] = js.undefined
  }
  
  
  trait DescribeDeliveryStreamOutput extends js.Object {
    /**
         * Information about the delivery stream.
         */
    var DeliveryStreamDescription: DeliveryStreamDescription
  }
  
  
  trait Deserializer extends js.Object {
    /**
         * The native Hive / HCatalog JsonSerDe. Used by Kinesis Data Firehose for deserializing data, which means converting it from the JSON format in preparation for serializing it to the Parquet or ORC format. This is one of two deserializers you can choose, depending on which one offers the functionality you need. The other option is the OpenX SerDe.
         */
    var HiveJsonSerDe: js.UndefOr[HiveJsonSerDe] = js.undefined
    /**
         * The OpenX SerDe. Used by Kinesis Data Firehose for deserializing data, which means converting it from the JSON format in preparation for serializing it to the Parquet or ORC format. This is one of two deserializers you can choose, depending on which one offers the functionality you need. The other option is the native Hive / HCatalog JsonSerDe.
         */
    var OpenXJsonSerDe: js.UndefOr[OpenXJsonSerDe] = js.undefined
  }
  
  
  trait DestinationDescription extends js.Object {
    /**
         * The ID of the destination.
         */
    var DestinationId: DestinationId
    /**
         * The destination in Amazon ES.
         */
    var ElasticsearchDestinationDescription: js.UndefOr[ElasticsearchDestinationDescription] = js.undefined
    /**
         * The destination in Amazon S3.
         */
    var ExtendedS3DestinationDescription: js.UndefOr[ExtendedS3DestinationDescription] = js.undefined
    /**
         * The destination in Amazon Redshift.
         */
    var RedshiftDestinationDescription: js.UndefOr[RedshiftDestinationDescription] = js.undefined
    /**
         * [Deprecated] The destination in Amazon S3.
         */
    var S3DestinationDescription: js.UndefOr[S3DestinationDescription] = js.undefined
    /**
         * The destination in Splunk.
         */
    var SplunkDestinationDescription: js.UndefOr[SplunkDestinationDescription] = js.undefined
  }
  
  
  trait ElasticsearchBufferingHints extends js.Object {
    /**
         * Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The default value is 300 (5 minutes).
         */
    var IntervalInSeconds: js.UndefOr[ElasticsearchBufferingIntervalInSeconds] = js.undefined
    /**
         * Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default value is 5. We recommend setting this parameter to a value greater than the amount of data you typically ingest into the delivery stream in 10 seconds. For example, if you typically ingest data at 1 MB/sec, the value should be 10 MB or higher.
         */
    var SizeInMBs: js.UndefOr[ElasticsearchBufferingSizeInMBs] = js.undefined
  }
  
  
  trait ElasticsearchDestinationConfiguration extends js.Object {
    /**
         * The buffering options. If no value is specified, the default values for ElasticsearchBufferingHints are used.
         */
    var BufferingHints: js.UndefOr[ElasticsearchBufferingHints] = js.undefined
    /**
         * The Amazon CloudWatch logging options for your delivery stream.
         */
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined
    /**
         * The ARN of the Amazon ES domain. The IAM role must have permissions for DescribeElasticsearchDomain, DescribeElasticsearchDomains, and DescribeElasticsearchDomainConfig after assuming the role specified in RoleARN. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
         */
    var DomainARN: ElasticsearchDomainARN
    /**
         * The Elasticsearch index name.
         */
    var IndexName: ElasticsearchIndexName
    /**
         * The Elasticsearch index rotation period. Index rotation appends a timestamp to the IndexName to facilitate the expiration of old data. For more information, see Index Rotation for the Amazon ES Destination. The default value is OneDay.
         */
    var IndexRotationPeriod: js.UndefOr[ElasticsearchIndexRotationPeriod] = js.undefined
    /**
         * The data processing configuration.
         */
    var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration] = js.undefined
    /**
         * The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon ES. The default value is 300 (5 minutes).
         */
    var RetryOptions: js.UndefOr[ElasticsearchRetryOptions] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data Firehose for calling the Amazon ES Configuration API and for indexing documents. For more information, see Grant Kinesis Data Firehose Access to an Amazon S3 Destination and Amazon Resource Names (ARNs) and AWS Service Namespaces.
         */
    var RoleARN: RoleARN
    /**
         * Defines how documents should be delivered to Amazon S3. When it is set to FailedDocumentsOnly, Kinesis Data Firehose writes any documents that could not be indexed to the configured Amazon S3 destination, with elasticsearch-failed/ appended to the key prefix. When set to AllDocuments, Kinesis Data Firehose delivers all incoming records to Amazon S3, and also writes failed documents with elasticsearch-failed/ appended to the prefix. For more information, see Amazon S3 Backup for the Amazon ES Destination. Default value is FailedDocumentsOnly.
         */
    var S3BackupMode: js.UndefOr[ElasticsearchS3BackupMode] = js.undefined
    /**
         * The configuration for the backup Amazon S3 location.
         */
    var S3Configuration: S3DestinationConfiguration
    /**
         * The Elasticsearch type name. For Elasticsearch 6.x, there can be only one type per index. If you try to specify a new type for an existing index that already has another type, Kinesis Data Firehose returns an error during run time.
         */
    var TypeName: ElasticsearchTypeName
  }
  
  
  trait ElasticsearchDestinationDescription extends js.Object {
    /**
         * The buffering options.
         */
    var BufferingHints: js.UndefOr[ElasticsearchBufferingHints] = js.undefined
    /**
         * The Amazon CloudWatch logging options.
         */
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined
    /**
         * The ARN of the Amazon ES domain. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
         */
    var DomainARN: js.UndefOr[ElasticsearchDomainARN] = js.undefined
    /**
         * The Elasticsearch index name.
         */
    var IndexName: js.UndefOr[ElasticsearchIndexName] = js.undefined
    /**
         * The Elasticsearch index rotation period
         */
    var IndexRotationPeriod: js.UndefOr[ElasticsearchIndexRotationPeriod] = js.undefined
    /**
         * The data processing configuration.
         */
    var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration] = js.undefined
    /**
         * The Amazon ES retry options.
         */
    var RetryOptions: js.UndefOr[ElasticsearchRetryOptions] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the AWS credentials. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
         */
    var RoleARN: js.UndefOr[RoleARN] = js.undefined
    /**
         * The Amazon S3 backup mode.
         */
    var S3BackupMode: js.UndefOr[ElasticsearchS3BackupMode] = js.undefined
    /**
         * The Amazon S3 destination.
         */
    var S3DestinationDescription: js.UndefOr[S3DestinationDescription] = js.undefined
    /**
         * The Elasticsearch type name.
         */
    var TypeName: js.UndefOr[ElasticsearchTypeName] = js.undefined
  }
  
  
  trait ElasticsearchDestinationUpdate extends js.Object {
    /**
         * The buffering options. If no value is specified, ElasticsearchBufferingHints object default values are used. 
         */
    var BufferingHints: js.UndefOr[ElasticsearchBufferingHints] = js.undefined
    /**
         * The CloudWatch logging options for your delivery stream.
         */
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined
    /**
         * The ARN of the Amazon ES domain. The IAM role must have permissions for DescribeElasticsearchDomain, DescribeElasticsearchDomains, and DescribeElasticsearchDomainConfig after assuming the IAM role specified in RoleARN. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
         */
    var DomainARN: js.UndefOr[ElasticsearchDomainARN] = js.undefined
    /**
         * The Elasticsearch index name.
         */
    var IndexName: js.UndefOr[ElasticsearchIndexName] = js.undefined
    /**
         * The Elasticsearch index rotation period. Index rotation appends a timestamp to IndexName to facilitate the expiration of old data. For more information, see Index Rotation for the Amazon ES Destination. Default value is OneDay.
         */
    var IndexRotationPeriod: js.UndefOr[ElasticsearchIndexRotationPeriod] = js.undefined
    /**
         * The data processing configuration.
         */
    var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration] = js.undefined
    /**
         * The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon ES. The default value is 300 (5 minutes).
         */
    var RetryOptions: js.UndefOr[ElasticsearchRetryOptions] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data Firehose for calling the Amazon ES Configuration API and for indexing documents. For more information, see Grant Kinesis Data Firehose Access to an Amazon S3 Destination and Amazon Resource Names (ARNs) and AWS Service Namespaces.
         */
    var RoleARN: js.UndefOr[RoleARN] = js.undefined
    /**
         * The Amazon S3 destination.
         */
    var S3Update: js.UndefOr[S3DestinationUpdate] = js.undefined
    /**
         * The Elasticsearch type name. For Elasticsearch 6.x, there can be only one type per index. If you try to specify a new type for an existing index that already has another type, Kinesis Data Firehose returns an error during runtime.
         */
    var TypeName: js.UndefOr[ElasticsearchTypeName] = js.undefined
  }
  
  
  trait ElasticsearchRetryOptions extends js.Object {
    /**
         * After an initial failure to deliver to Amazon ES, the total amount of time during which Kinesis Data Firehose retries delivery (including the first attempt). After this time has elapsed, the failed documents are written to Amazon S3. Default value is 300 seconds (5 minutes). A value of 0 (zero) results in no retries.
         */
    var DurationInSeconds: js.UndefOr[ElasticsearchRetryDurationInSeconds] = js.undefined
  }
  
  
  trait EncryptionConfiguration extends js.Object {
    /**
         * The encryption key.
         */
    var KMSEncryptionConfig: js.UndefOr[KMSEncryptionConfig] = js.undefined
    /**
         * Specifically override existing encryption information to ensure that no encryption is used.
         */
    var NoEncryptionConfig: js.UndefOr[NoEncryptionConfig] = js.undefined
  }
  
  
  trait ExtendedS3DestinationConfiguration extends js.Object {
    /**
         * The ARN of the S3 bucket. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
         */
    var BucketARN: BucketARN
    /**
         * The buffering option.
         */
    var BufferingHints: js.UndefOr[BufferingHints] = js.undefined
    /**
         * The Amazon CloudWatch logging options for your delivery stream.
         */
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined
    /**
         * The compression format. If no value is specified, the default is UNCOMPRESSED.
         */
    var CompressionFormat: js.UndefOr[CompressionFormat] = js.undefined
    /**
         * The serializer, deserializer, and schema for converting data from the JSON format to the Parquet or ORC format before writing it to Amazon S3.
         */
    var DataFormatConversionConfiguration: js.UndefOr[DataFormatConversionConfiguration] = js.undefined
    /**
         * The encryption configuration. If no value is specified, the default is no encryption.
         */
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined
    /**
         * A prefix that Kinesis Data Firehose evaluates and adds to failed records before writing them to S3. This prefix appears immediately following the bucket name. 
         */
    var ErrorOutputPrefix: js.UndefOr[ErrorOutputPrefix] = js.undefined
    /**
         * The "YYYY/MM/DD/HH" time format prefix is automatically used for delivered Amazon S3 files. You can specify an extra prefix to be added in front of the time format prefix. If the prefix ends with a slash, it appears as a folder in the S3 bucket. For more information, see Amazon S3 Object Name Format in the Amazon Kinesis Data Firehose Developer Guide.
         */
    var Prefix: js.UndefOr[Prefix] = js.undefined
    /**
         * The data processing configuration.
         */
    var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the AWS credentials. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
         */
    var RoleARN: RoleARN
    /**
         * The configuration for backup in Amazon S3.
         */
    var S3BackupConfiguration: js.UndefOr[S3DestinationConfiguration] = js.undefined
    /**
         * The Amazon S3 backup mode.
         */
    var S3BackupMode: js.UndefOr[S3BackupMode] = js.undefined
  }
  
  
  trait ExtendedS3DestinationDescription extends js.Object {
    /**
         * The ARN of the S3 bucket. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
         */
    var BucketARN: BucketARN
    /**
         * The buffering option.
         */
    var BufferingHints: BufferingHints
    /**
         * The Amazon CloudWatch logging options for your delivery stream.
         */
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined
    /**
         * The compression format. If no value is specified, the default is UNCOMPRESSED.
         */
    var CompressionFormat: CompressionFormat
    /**
         * The serializer, deserializer, and schema for converting data from the JSON format to the Parquet or ORC format before writing it to Amazon S3.
         */
    var DataFormatConversionConfiguration: js.UndefOr[DataFormatConversionConfiguration] = js.undefined
    /**
         * The encryption configuration. If no value is specified, the default is no encryption.
         */
    var EncryptionConfiguration: EncryptionConfiguration
    /**
         * A prefix that Kinesis Data Firehose evaluates and adds to failed records before writing them to S3. This prefix appears immediately following the bucket name.
         */
    var ErrorOutputPrefix: js.UndefOr[ErrorOutputPrefix] = js.undefined
    /**
         * The "YYYY/MM/DD/HH" time format prefix is automatically used for delivered Amazon S3 files. You can specify an extra prefix to be added in front of the time format prefix. If the prefix ends with a slash, it appears as a folder in the S3 bucket. For more information, see Amazon S3 Object Name Format in the Amazon Kinesis Data Firehose Developer Guide.
         */
    var Prefix: js.UndefOr[Prefix] = js.undefined
    /**
         * The data processing configuration.
         */
    var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the AWS credentials. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
         */
    var RoleARN: RoleARN
    /**
         * The configuration for backup in Amazon S3.
         */
    var S3BackupDescription: js.UndefOr[S3DestinationDescription] = js.undefined
    /**
         * The Amazon S3 backup mode.
         */
    var S3BackupMode: js.UndefOr[S3BackupMode] = js.undefined
  }
  
  
  trait ExtendedS3DestinationUpdate extends js.Object {
    /**
         * The ARN of the S3 bucket. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
         */
    var BucketARN: js.UndefOr[BucketARN] = js.undefined
    /**
         * The buffering option.
         */
    var BufferingHints: js.UndefOr[BufferingHints] = js.undefined
    /**
         * The Amazon CloudWatch logging options for your delivery stream.
         */
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined
    /**
         * The compression format. If no value is specified, the default is UNCOMPRESSED. 
         */
    var CompressionFormat: js.UndefOr[CompressionFormat] = js.undefined
    /**
         * The serializer, deserializer, and schema for converting data from the JSON format to the Parquet or ORC format before writing it to Amazon S3.
         */
    var DataFormatConversionConfiguration: js.UndefOr[DataFormatConversionConfiguration] = js.undefined
    /**
         * The encryption configuration. If no value is specified, the default is no encryption.
         */
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined
    /**
         * A prefix that Kinesis Data Firehose evaluates and adds to failed records before writing them to S3. This prefix appears immediately following the bucket name.
         */
    var ErrorOutputPrefix: js.UndefOr[ErrorOutputPrefix] = js.undefined
    /**
         * The "YYYY/MM/DD/HH" time format prefix is automatically used for delivered Amazon S3 files. You can specify an extra prefix to be added in front of the time format prefix. If the prefix ends with a slash, it appears as a folder in the S3 bucket. For more information, see Amazon S3 Object Name Format in the Amazon Kinesis Data Firehose Developer Guide.
         */
    var Prefix: js.UndefOr[Prefix] = js.undefined
    /**
         * The data processing configuration.
         */
    var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the AWS credentials. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
         */
    var RoleARN: js.UndefOr[RoleARN] = js.undefined
    /**
         * Enables or disables Amazon S3 backup mode.
         */
    var S3BackupMode: js.UndefOr[S3BackupMode] = js.undefined
    /**
         * The Amazon S3 destination for backup.
         */
    var S3BackupUpdate: js.UndefOr[S3DestinationUpdate] = js.undefined
  }
  
  
  trait HiveJsonSerDe extends js.Object {
    /**
         * Indicates how you want Kinesis Data Firehose to parse the date and timestamps that may be present in your input data JSON. To specify these format strings, follow the pattern syntax of JodaTime's DateTimeFormat format strings. For more information, see Class DateTimeFormat. You can also use the special value millis to parse timestamps in epoch milliseconds. If you don't specify a format, Kinesis Data Firehose uses java.sql.Timestamp::valueOf by default.
         */
    var TimestampFormats: js.UndefOr[ListOfNonEmptyStrings] = js.undefined
  }
  
  
  trait InputFormatConfiguration extends js.Object {
    /**
         * Specifies which deserializer to use. You can choose either the Apache Hive JSON SerDe or the OpenX JSON SerDe. If both are non-null, the server rejects the request.
         */
    var Deserializer: js.UndefOr[Deserializer] = js.undefined
  }
  
  
  trait KMSEncryptionConfig extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the encryption key. Must belong to the same AWS Region as the destination Amazon S3 bucket. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
         */
    var AWSKMSKeyARN: AWSKMSKeyARN
  }
  
  
  trait KinesisStreamSourceConfiguration extends js.Object {
    /**
         * The ARN of the source Kinesis data stream. For more information, see Amazon Kinesis Data Streams ARN Format.
         */
    var KinesisStreamARN: KinesisStreamARN
    /**
         * The ARN of the role that provides access to the source Kinesis data stream. For more information, see AWS Identity and Access Management (IAM) ARN Format.
         */
    var RoleARN: RoleARN
  }
  
  
  trait KinesisStreamSourceDescription extends js.Object {
    /**
         * Kinesis Data Firehose starts retrieving records from the Kinesis data stream starting with this timestamp.
         */
    var DeliveryStartTimestamp: js.UndefOr[DeliveryStartTimestamp] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the source Kinesis data stream. For more information, see Amazon Kinesis Data Streams ARN Format.
         */
    var KinesisStreamARN: js.UndefOr[KinesisStreamARN] = js.undefined
    /**
         * The ARN of the role used by the source Kinesis data stream. For more information, see AWS Identity and Access Management (IAM) ARN Format.
         */
    var RoleARN: js.UndefOr[RoleARN] = js.undefined
  }
  
  
  trait ListDeliveryStreamsInput extends js.Object {
    /**
         * The delivery stream type. This can be one of the following values:    DirectPut: Provider applications access the delivery stream directly.    KinesisStreamAsSource: The delivery stream uses a Kinesis data stream as a source.   This parameter is optional. If this parameter is omitted, delivery streams of all types are returned.
         */
    var DeliveryStreamType: js.UndefOr[DeliveryStreamType] = js.undefined
    /**
         * The list of delivery streams returned by this call to ListDeliveryStreams will start with the delivery stream whose name comes alphabetically immediately after the name you specify in ExclusiveStartDeliveryStreamName.
         */
    var ExclusiveStartDeliveryStreamName: js.UndefOr[DeliveryStreamName] = js.undefined
    /**
         * The maximum number of delivery streams to list. The default value is 10.
         */
    var Limit: js.UndefOr[ListDeliveryStreamsInputLimit] = js.undefined
  }
  
  
  trait ListDeliveryStreamsOutput extends js.Object {
    /**
         * The names of the delivery streams.
         */
    var DeliveryStreamNames: DeliveryStreamNameList
    /**
         * Indicates whether there are more delivery streams available to list.
         */
    var HasMoreDeliveryStreams: BooleanObject
  }
  
  
  trait ListTagsForDeliveryStreamInput extends js.Object {
    /**
         * The name of the delivery stream whose tags you want to list.
         */
    var DeliveryStreamName: DeliveryStreamName
    /**
         * The key to use as the starting point for the list of tags. If you set this parameter, ListTagsForDeliveryStream gets all tags that occur after ExclusiveStartTagKey.
         */
    var ExclusiveStartTagKey: js.UndefOr[TagKey] = js.undefined
    /**
         * The number of tags to return. If this number is less than the total number of tags associated with the delivery stream, HasMoreTags is set to true in the response. To list additional tags, set ExclusiveStartTagKey to the last key in the response. 
         */
    var Limit: js.UndefOr[ListTagsForDeliveryStreamInputLimit] = js.undefined
  }
  
  
  trait ListTagsForDeliveryStreamOutput extends js.Object {
    /**
         * If this is true in the response, more tags are available. To list the remaining tags, set ExclusiveStartTagKey to the key of the last tag returned and call ListTagsForDeliveryStream again.
         */
    var HasMoreTags: BooleanObject
    /**
         * A list of tags associated with DeliveryStreamName, starting with the first tag after ExclusiveStartTagKey and up to the specified Limit.
         */
    var Tags: ListTagsForDeliveryStreamOutputTagList
  }
  
  
  trait OpenXJsonSerDe extends js.Object {
    /**
         * When set to true, which is the default, Kinesis Data Firehose converts JSON keys to lowercase before deserializing them.
         */
    var CaseInsensitive: js.UndefOr[BooleanObject] = js.undefined
    /**
         * Maps column names to JSON keys that aren't identical to the column names. This is useful when the JSON contains keys that are Hive keywords. For example, timestamp is a Hive keyword. If you have a JSON key named timestamp, set this parameter to {"ts": "timestamp"} to map this key to a column named ts.
         */
    var ColumnToJsonKeyMappings: js.UndefOr[ColumnToJsonKeyMappings] = js.undefined
    /**
         * When set to true, specifies that the names of the keys include dots and that you want Kinesis Data Firehose to replace them with underscores. This is useful because Apache Hive does not allow dots in column names. For example, if the JSON contains a key whose name is "a.b", you can define the column name to be "a_b" when using this option. The default is false.
         */
    var ConvertDotsInJsonKeysToUnderscores: js.UndefOr[BooleanObject] = js.undefined
  }
  
  
  trait OrcSerDe extends js.Object {
    /**
         * The Hadoop Distributed File System (HDFS) block size. This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is 256 MiB and the minimum is 64 MiB. Kinesis Data Firehose uses this value for padding calculations.
         */
    var BlockSizeBytes: js.UndefOr[BlockSizeBytes] = js.undefined
    /**
         * The column names for which you want Kinesis Data Firehose to create bloom filters. The default is null.
         */
    var BloomFilterColumns: js.UndefOr[ListOfNonEmptyStringsWithoutWhitespace] = js.undefined
    /**
         * The Bloom filter false positive probability (FPP). The lower the FPP, the bigger the Bloom filter. The default value is 0.05, the minimum is 0, and the maximum is 1.
         */
    var BloomFilterFalsePositiveProbability: js.UndefOr[Proportion] = js.undefined
    /**
         * The compression code to use over data blocks. The default is SNAPPY.
         */
    var Compression: js.UndefOr[OrcCompression] = js.undefined
    /**
         * Represents the fraction of the total number of non-null rows. To turn off dictionary encoding, set this fraction to a number that is less than the number of distinct keys in a dictionary. To always use dictionary encoding, set this threshold to 1.
         */
    var DictionaryKeyThreshold: js.UndefOr[Proportion] = js.undefined
    /**
         * Set this to true to indicate that you want stripes to be padded to the HDFS block boundaries. This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is false.
         */
    var EnablePadding: js.UndefOr[BooleanObject] = js.undefined
    /**
         * The version of the file to write. The possible values are V0_11 and V0_12. The default is V0_12.
         */
    var FormatVersion: js.UndefOr[OrcFormatVersion] = js.undefined
    /**
         * A number between 0 and 1 that defines the tolerance for block padding as a decimal fraction of stripe size. The default value is 0.05, which means 5 percent of stripe size. For the default values of 64 MiB ORC stripes and 256 MiB HDFS blocks, the default block padding tolerance of 5 percent reserves a maximum of 3.2 MiB for padding within the 256 MiB block. In such a case, if the available size within the block is more than 3.2 MiB, a new, smaller stripe is inserted to fit within that space. This ensures that no stripe crosses block boundaries and causes remote reads within a node-local task. Kinesis Data Firehose ignores this parameter when OrcSerDe$EnablePadding is false.
         */
    var PaddingTolerance: js.UndefOr[Proportion] = js.undefined
    /**
         * The number of rows between index entries. The default is 10,000 and the minimum is 1,000.
         */
    var RowIndexStride: js.UndefOr[OrcRowIndexStride] = js.undefined
    /**
         * The number of bytes in each stripe. The default is 64 MiB and the minimum is 8 MiB.
         */
    var StripeSizeBytes: js.UndefOr[OrcStripeSizeBytes] = js.undefined
  }
  
  
  trait OutputFormatConfiguration extends js.Object {
    /**
         * Specifies which serializer to use. You can choose either the ORC SerDe or the Parquet SerDe. If both are non-null, the server rejects the request.
         */
    var Serializer: js.UndefOr[Serializer] = js.undefined
  }
  
  
  trait ParquetSerDe extends js.Object {
    /**
         * The Hadoop Distributed File System (HDFS) block size. This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is 256 MiB and the minimum is 64 MiB. Kinesis Data Firehose uses this value for padding calculations.
         */
    var BlockSizeBytes: js.UndefOr[BlockSizeBytes] = js.undefined
    /**
         * The compression code to use over data blocks. The possible values are UNCOMPRESSED, SNAPPY, and GZIP, with the default being SNAPPY. Use SNAPPY for higher decompression speed. Use GZIP if the compression ration is more important than speed.
         */
    var Compression: js.UndefOr[ParquetCompression] = js.undefined
    /**
         * Indicates whether to enable dictionary compression.
         */
    var EnableDictionaryCompression: js.UndefOr[BooleanObject] = js.undefined
    /**
         * The maximum amount of padding to apply. This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is 0.
         */
    var MaxPaddingBytes: js.UndefOr[NonNegativeIntegerObject] = js.undefined
    /**
         * The Parquet page size. Column chunks are divided into pages. A page is conceptually an indivisible unit (in terms of compression and encoding). The minimum value is 64 KiB and the default is 1 MiB.
         */
    var PageSizeBytes: js.UndefOr[ParquetPageSizeBytes] = js.undefined
    /**
         * Indicates the version of row format to output. The possible values are V1 and V2. The default is V1.
         */
    var WriterVersion: js.UndefOr[ParquetWriterVersion] = js.undefined
  }
  
  
  trait ProcessingConfiguration extends js.Object {
    /**
         * Enables or disables data processing.
         */
    var Enabled: js.UndefOr[BooleanObject] = js.undefined
    /**
         * The data processors.
         */
    var Processors: js.UndefOr[ProcessorList] = js.undefined
  }
  
  
  trait Processor extends js.Object {
    /**
         * The processor parameters.
         */
    var Parameters: js.UndefOr[ProcessorParameterList] = js.undefined
    /**
         * The type of processor.
         */
    var Type: ProcessorType
  }
  
  
  trait ProcessorParameter extends js.Object {
    /**
         * The name of the parameter.
         */
    var ParameterName: ProcessorParameterName
    /**
         * The parameter value.
         */
    var ParameterValue: ProcessorParameterValue
  }
  
  
  trait PutRecordBatchInput extends js.Object {
    /**
         * The name of the delivery stream.
         */
    var DeliveryStreamName: DeliveryStreamName
    /**
         * One or more records.
         */
    var Records: PutRecordBatchRequestEntryList
  }
  
  
  trait PutRecordBatchOutput extends js.Object {
    /**
         * Indicates whether server-side encryption (SSE) was enabled during this operation.
         */
    var Encrypted: js.UndefOr[BooleanObject] = js.undefined
    /**
         * The number of records that might have failed processing. This number might be greater than 0 even if the PutRecordBatch call succeeds. Check FailedPutCount to determine whether there are records that you need to resend.
         */
    var FailedPutCount: NonNegativeIntegerObject
    /**
         * The results array. For each record, the index of the response element is the same as the index used in the request array.
         */
    var RequestResponses: PutRecordBatchResponseEntryList
  }
  
  
  trait PutRecordBatchResponseEntry extends js.Object {
    /**
         * The error code for an individual record result.
         */
    var ErrorCode: js.UndefOr[ErrorCode] = js.undefined
    /**
         * The error message for an individual record result.
         */
    var ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined
    /**
         * The ID of the record.
         */
    var RecordId: js.UndefOr[PutResponseRecordId] = js.undefined
  }
  
  
  trait PutRecordInput extends js.Object {
    /**
         * The name of the delivery stream.
         */
    var DeliveryStreamName: DeliveryStreamName
    /**
         * The record.
         */
    var Record: Record
  }
  
  
  trait PutRecordOutput extends js.Object {
    /**
         * Indicates whether server-side encryption (SSE) was enabled during this operation.
         */
    var Encrypted: js.UndefOr[BooleanObject] = js.undefined
    /**
         * The ID of the record.
         */
    var RecordId: PutResponseRecordId
  }
  
  
  trait Record extends js.Object {
    /**
         * The data blob, which is base64-encoded when the blob is serialized. The maximum size of the data blob, before base64-encoding, is 1,000 KiB.
         */
    var Data: Data
  }
  
  
  trait RedshiftDestinationConfiguration extends js.Object {
    /**
         * The CloudWatch logging options for your delivery stream.
         */
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined
    /**
         * The database connection string.
         */
    var ClusterJDBCURL: ClusterJDBCURL
    /**
         * The COPY command.
         */
    var CopyCommand: CopyCommand
    /**
         * The user password.
         */
    var Password: Password
    /**
         * The data processing configuration.
         */
    var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration] = js.undefined
    /**
         * The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon Redshift. Default value is 3600 (60 minutes).
         */
    var RetryOptions: js.UndefOr[RedshiftRetryOptions] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the AWS credentials. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
         */
    var RoleARN: RoleARN
    /**
         * The configuration for backup in Amazon S3.
         */
    var S3BackupConfiguration: js.UndefOr[S3DestinationConfiguration] = js.undefined
    /**
         * The Amazon S3 backup mode.
         */
    var S3BackupMode: js.UndefOr[RedshiftS3BackupMode] = js.undefined
    /**
         * The configuration for the intermediate Amazon S3 location from which Amazon Redshift obtains data. Restrictions are described in the topic for CreateDeliveryStream. The compression formats SNAPPY or ZIP cannot be specified in RedshiftDestinationConfiguration.S3Configuration because the Amazon Redshift COPY operation that reads from the S3 bucket doesn't support these compression formats.
         */
    var S3Configuration: S3DestinationConfiguration
    /**
         * The name of the user.
         */
    var Username: Username
  }
  
  
  trait RedshiftDestinationDescription extends js.Object {
    /**
         * The Amazon CloudWatch logging options for your delivery stream.
         */
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined
    /**
         * The database connection string.
         */
    var ClusterJDBCURL: ClusterJDBCURL
    /**
         * The COPY command.
         */
    var CopyCommand: CopyCommand
    /**
         * The data processing configuration.
         */
    var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration] = js.undefined
    /**
         * The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon Redshift. Default value is 3600 (60 minutes).
         */
    var RetryOptions: js.UndefOr[RedshiftRetryOptions] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the AWS credentials. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
         */
    var RoleARN: RoleARN
    /**
         * The configuration for backup in Amazon S3.
         */
    var S3BackupDescription: js.UndefOr[S3DestinationDescription] = js.undefined
    /**
         * The Amazon S3 backup mode.
         */
    var S3BackupMode: js.UndefOr[RedshiftS3BackupMode] = js.undefined
    /**
         * The Amazon S3 destination.
         */
    var S3DestinationDescription: S3DestinationDescription
    /**
         * The name of the user.
         */
    var Username: Username
  }
  
  
  trait RedshiftDestinationUpdate extends js.Object {
    /**
         * The Amazon CloudWatch logging options for your delivery stream.
         */
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined
    /**
         * The database connection string.
         */
    var ClusterJDBCURL: js.UndefOr[ClusterJDBCURL] = js.undefined
    /**
         * The COPY command.
         */
    var CopyCommand: js.UndefOr[CopyCommand] = js.undefined
    /**
         * The user password.
         */
    var Password: js.UndefOr[Password] = js.undefined
    /**
         * The data processing configuration.
         */
    var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration] = js.undefined
    /**
         * The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon Redshift. Default value is 3600 (60 minutes).
         */
    var RetryOptions: js.UndefOr[RedshiftRetryOptions] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the AWS credentials. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
         */
    var RoleARN: js.UndefOr[RoleARN] = js.undefined
    /**
         * The Amazon S3 backup mode.
         */
    var S3BackupMode: js.UndefOr[RedshiftS3BackupMode] = js.undefined
    /**
         * The Amazon S3 destination for backup.
         */
    var S3BackupUpdate: js.UndefOr[S3DestinationUpdate] = js.undefined
    /**
         * The Amazon S3 destination. The compression formats SNAPPY or ZIP cannot be specified in RedshiftDestinationUpdate.S3Update because the Amazon Redshift COPY operation that reads from the S3 bucket doesn't support these compression formats.
         */
    var S3Update: js.UndefOr[S3DestinationUpdate] = js.undefined
    /**
         * The name of the user.
         */
    var Username: js.UndefOr[Username] = js.undefined
  }
  
  
  trait RedshiftRetryOptions extends js.Object {
    /**
         * The length of time during which Kinesis Data Firehose retries delivery after a failure, starting from the initial request and including the first attempt. The default value is 3600 seconds (60 minutes). Kinesis Data Firehose does not retry if the value of DurationInSeconds is 0 (zero) or if the first delivery attempt takes longer than the current value.
         */
    var DurationInSeconds: js.UndefOr[RedshiftRetryDurationInSeconds] = js.undefined
  }
  
  
  trait S3DestinationConfiguration extends js.Object {
    /**
         * The ARN of the S3 bucket. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
         */
    var BucketARN: BucketARN
    /**
         * The buffering option. If no value is specified, BufferingHints object default values are used.
         */
    var BufferingHints: js.UndefOr[BufferingHints] = js.undefined
    /**
         * The CloudWatch logging options for your delivery stream.
         */
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined
    /**
         * The compression format. If no value is specified, the default is UNCOMPRESSED. The compression formats SNAPPY or ZIP cannot be specified for Amazon Redshift destinations because they are not supported by the Amazon Redshift COPY operation that reads from the S3 bucket.
         */
    var CompressionFormat: js.UndefOr[CompressionFormat] = js.undefined
    /**
         * The encryption configuration. If no value is specified, the default is no encryption.
         */
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined
    /**
         * A prefix that Kinesis Data Firehose evaluates and adds to failed records before writing them to S3. This prefix appears immediately following the bucket name.
         */
    var ErrorOutputPrefix: js.UndefOr[ErrorOutputPrefix] = js.undefined
    /**
         * The "YYYY/MM/DD/HH" time format prefix is automatically used for delivered Amazon S3 files. You can specify an extra prefix to be added in front of the time format prefix. If the prefix ends with a slash, it appears as a folder in the S3 bucket. For more information, see Amazon S3 Object Name Format in the Amazon Kinesis Data Firehose Developer Guide.
         */
    var Prefix: js.UndefOr[Prefix] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the AWS credentials. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
         */
    var RoleARN: RoleARN
  }
  
  
  trait S3DestinationDescription extends js.Object {
    /**
         * The ARN of the S3 bucket. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
         */
    var BucketARN: BucketARN
    /**
         * The buffering option. If no value is specified, BufferingHints object default values are used.
         */
    var BufferingHints: BufferingHints
    /**
         * The Amazon CloudWatch logging options for your delivery stream.
         */
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined
    /**
         * The compression format. If no value is specified, the default is UNCOMPRESSED.
         */
    var CompressionFormat: CompressionFormat
    /**
         * The encryption configuration. If no value is specified, the default is no encryption.
         */
    var EncryptionConfiguration: EncryptionConfiguration
    /**
         * A prefix that Kinesis Data Firehose evaluates and adds to failed records before writing them to S3. This prefix appears immediately following the bucket name.
         */
    var ErrorOutputPrefix: js.UndefOr[ErrorOutputPrefix] = js.undefined
    /**
         * The "YYYY/MM/DD/HH" time format prefix is automatically used for delivered Amazon S3 files. You can specify an extra prefix to be added in front of the time format prefix. If the prefix ends with a slash, it appears as a folder in the S3 bucket. For more information, see Amazon S3 Object Name Format in the Amazon Kinesis Data Firehose Developer Guide.
         */
    var Prefix: js.UndefOr[Prefix] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the AWS credentials. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
         */
    var RoleARN: RoleARN
  }
  
  
  trait S3DestinationUpdate extends js.Object {
    /**
         * The ARN of the S3 bucket. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
         */
    var BucketARN: js.UndefOr[BucketARN] = js.undefined
    /**
         * The buffering option. If no value is specified, BufferingHints object default values are used.
         */
    var BufferingHints: js.UndefOr[BufferingHints] = js.undefined
    /**
         * The CloudWatch logging options for your delivery stream.
         */
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined
    /**
         * The compression format. If no value is specified, the default is UNCOMPRESSED. The compression formats SNAPPY or ZIP cannot be specified for Amazon Redshift destinations because they are not supported by the Amazon Redshift COPY operation that reads from the S3 bucket.
         */
    var CompressionFormat: js.UndefOr[CompressionFormat] = js.undefined
    /**
         * The encryption configuration. If no value is specified, the default is no encryption.
         */
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined
    /**
         * A prefix that Kinesis Data Firehose evaluates and adds to failed records before writing them to S3. This prefix appears immediately following the bucket name.
         */
    var ErrorOutputPrefix: js.UndefOr[ErrorOutputPrefix] = js.undefined
    /**
         * The "YYYY/MM/DD/HH" time format prefix is automatically used for delivered Amazon S3 files. You can specify an extra prefix to be added in front of the time format prefix. If the prefix ends with a slash, it appears as a folder in the S3 bucket. For more information, see Amazon S3 Object Name Format in the Amazon Kinesis Data Firehose Developer Guide.
         */
    var Prefix: js.UndefOr[Prefix] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the AWS credentials. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
         */
    var RoleARN: js.UndefOr[RoleARN] = js.undefined
  }
  
  
  trait SchemaConfiguration extends js.Object {
    /**
         * The ID of the AWS Glue Data Catalog. If you don't supply this, the AWS account ID is used by default.
         */
    var CatalogId: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.undefined
    /**
         * Specifies the name of the AWS Glue database that contains the schema for the output data.
         */
    var DatabaseName: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.undefined
    /**
         * If you don't specify an AWS Region, the default is the current Region.
         */
    var Region: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.undefined
    /**
         * The role that Kinesis Data Firehose can use to access AWS Glue. This role must be in the same account you use for Kinesis Data Firehose. Cross-account roles aren't allowed.
         */
    var RoleARN: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.undefined
    /**
         * Specifies the AWS Glue table that contains the column information that constitutes your data schema.
         */
    var TableName: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.undefined
    /**
         * Specifies the table version for the output data schema. If you don't specify this version ID, or if you set it to LATEST, Kinesis Data Firehose uses the most recent version. This means that any updates to the table are automatically picked up.
         */
    var VersionId: js.UndefOr[NonEmptyStringWithoutWhitespace] = js.undefined
  }
  
  
  trait Serializer extends js.Object {
    /**
         * A serializer to use for converting data to the ORC format before storing it in Amazon S3. For more information, see Apache ORC.
         */
    var OrcSerDe: js.UndefOr[OrcSerDe] = js.undefined
    /**
         * A serializer to use for converting data to the Parquet format before storing it in Amazon S3. For more information, see Apache Parquet.
         */
    var ParquetSerDe: js.UndefOr[ParquetSerDe] = js.undefined
  }
  
  
  trait SourceDescription extends js.Object {
    /**
         * The KinesisStreamSourceDescription value for the source Kinesis data stream.
         */
    var KinesisStreamSourceDescription: js.UndefOr[KinesisStreamSourceDescription] = js.undefined
  }
  
  
  trait SplunkDestinationConfiguration extends js.Object {
    /**
         * The Amazon CloudWatch logging options for your delivery stream.
         */
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined
    /**
         * The amount of time that Kinesis Data Firehose waits to receive an acknowledgment from Splunk after it sends it data. At the end of the timeout period, Kinesis Data Firehose either tries to send the data again or considers it an error, based on your retry settings.
         */
    var HECAcknowledgmentTimeoutInSeconds: js.UndefOr[HECAcknowledgmentTimeoutInSeconds] = js.undefined
    /**
         * The HTTP Event Collector (HEC) endpoint to which Kinesis Data Firehose sends your data.
         */
    var HECEndpoint: HECEndpoint
    /**
         * This type can be either "Raw" or "Event."
         */
    var HECEndpointType: HECEndpointType
    /**
         * This is a GUID that you obtain from your Splunk cluster when you create a new HEC endpoint.
         */
    var HECToken: HECToken
    /**
         * The data processing configuration.
         */
    var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration] = js.undefined
    /**
         * The retry behavior in case Kinesis Data Firehose is unable to deliver data to Splunk, or if it doesn't receive an acknowledgment of receipt from Splunk.
         */
    var RetryOptions: js.UndefOr[SplunkRetryOptions] = js.undefined
    /**
         * Defines how documents should be delivered to Amazon S3. When set to FailedDocumentsOnly, Kinesis Data Firehose writes any data that could not be indexed to the configured Amazon S3 destination. When set to AllDocuments, Kinesis Data Firehose delivers all incoming records to Amazon S3, and also writes failed documents to Amazon S3. Default value is FailedDocumentsOnly. 
         */
    var S3BackupMode: js.UndefOr[SplunkS3BackupMode] = js.undefined
    /**
         * The configuration for the backup Amazon S3 location.
         */
    var S3Configuration: S3DestinationConfiguration
  }
  
  
  trait SplunkDestinationDescription extends js.Object {
    /**
         * The Amazon CloudWatch logging options for your delivery stream.
         */
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined
    /**
         * The amount of time that Kinesis Data Firehose waits to receive an acknowledgment from Splunk after it sends it data. At the end of the timeout period, Kinesis Data Firehose either tries to send the data again or considers it an error, based on your retry settings.
         */
    var HECAcknowledgmentTimeoutInSeconds: js.UndefOr[HECAcknowledgmentTimeoutInSeconds] = js.undefined
    /**
         * The HTTP Event Collector (HEC) endpoint to which Kinesis Data Firehose sends your data.
         */
    var HECEndpoint: js.UndefOr[HECEndpoint] = js.undefined
    /**
         * This type can be either "Raw" or "Event."
         */
    var HECEndpointType: js.UndefOr[HECEndpointType] = js.undefined
    /**
         * A GUID you obtain from your Splunk cluster when you create a new HEC endpoint.
         */
    var HECToken: js.UndefOr[HECToken] = js.undefined
    /**
         * The data processing configuration.
         */
    var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration] = js.undefined
    /**
         * The retry behavior in case Kinesis Data Firehose is unable to deliver data to Splunk or if it doesn't receive an acknowledgment of receipt from Splunk.
         */
    var RetryOptions: js.UndefOr[SplunkRetryOptions] = js.undefined
    /**
         * Defines how documents should be delivered to Amazon S3. When set to FailedDocumentsOnly, Kinesis Data Firehose writes any data that could not be indexed to the configured Amazon S3 destination. When set to AllDocuments, Kinesis Data Firehose delivers all incoming records to Amazon S3, and also writes failed documents to Amazon S3. Default value is FailedDocumentsOnly. 
         */
    var S3BackupMode: js.UndefOr[SplunkS3BackupMode] = js.undefined
    /**
         * The Amazon S3 destination.&gt;
         */
    var S3DestinationDescription: js.UndefOr[S3DestinationDescription] = js.undefined
  }
  
  
  trait SplunkDestinationUpdate extends js.Object {
    /**
         * The Amazon CloudWatch logging options for your delivery stream.
         */
    var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined
    /**
         * The amount of time that Kinesis Data Firehose waits to receive an acknowledgment from Splunk after it sends data. At the end of the timeout period, Kinesis Data Firehose either tries to send the data again or considers it an error, based on your retry settings.
         */
    var HECAcknowledgmentTimeoutInSeconds: js.UndefOr[HECAcknowledgmentTimeoutInSeconds] = js.undefined
    /**
         * The HTTP Event Collector (HEC) endpoint to which Kinesis Data Firehose sends your data.
         */
    var HECEndpoint: js.UndefOr[HECEndpoint] = js.undefined
    /**
         * This type can be either "Raw" or "Event."
         */
    var HECEndpointType: js.UndefOr[HECEndpointType] = js.undefined
    /**
         * A GUID that you obtain from your Splunk cluster when you create a new HEC endpoint.
         */
    var HECToken: js.UndefOr[HECToken] = js.undefined
    /**
         * The data processing configuration.
         */
    var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration] = js.undefined
    /**
         * The retry behavior in case Kinesis Data Firehose is unable to deliver data to Splunk or if it doesn't receive an acknowledgment of receipt from Splunk.
         */
    var RetryOptions: js.UndefOr[SplunkRetryOptions] = js.undefined
    /**
         * Defines how documents should be delivered to Amazon S3. When set to FailedDocumentsOnly, Kinesis Data Firehose writes any data that could not be indexed to the configured Amazon S3 destination. When set to AllDocuments, Kinesis Data Firehose delivers all incoming records to Amazon S3, and also writes failed documents to Amazon S3. Default value is FailedDocumentsOnly. 
         */
    var S3BackupMode: js.UndefOr[SplunkS3BackupMode] = js.undefined
    /**
         * Your update to the configuration of the backup Amazon S3 location.
         */
    var S3Update: js.UndefOr[S3DestinationUpdate] = js.undefined
  }
  
  
  trait SplunkRetryOptions extends js.Object {
    /**
         * The total amount of time that Kinesis Data Firehose spends on retries. This duration starts after the initial attempt to send data to Splunk fails. It doesn't include the periods during which Kinesis Data Firehose waits for acknowledgment from Splunk after each attempt.
         */
    var DurationInSeconds: js.UndefOr[SplunkRetryDurationInSeconds] = js.undefined
  }
  
  
  trait StartDeliveryStreamEncryptionInput extends js.Object {
    /**
         * The name of the delivery stream for which you want to enable server-side encryption (SSE).
         */
    var DeliveryStreamName: DeliveryStreamName
  }
  
  
  trait StartDeliveryStreamEncryptionOutput extends js.Object
  
  
  trait StopDeliveryStreamEncryptionInput extends js.Object {
    /**
         * The name of the delivery stream for which you want to disable server-side encryption (SSE).
         */
    var DeliveryStreamName: DeliveryStreamName
  }
  
  
  trait StopDeliveryStreamEncryptionOutput extends js.Object
  
  
  trait Tag extends js.Object {
    /**
         * A unique identifier for the tag. Maximum length: 128 characters. Valid characters: Unicode letters, digits, white space, _ . / = + - % @
         */
    var Key: TagKey
    /**
         * An optional string, which you can use to describe or define the tag. Maximum length: 256 characters. Valid characters: Unicode letters, digits, white space, _ . / = + - % @
         */
    var Value: js.UndefOr[TagValue] = js.undefined
  }
  
  
  trait TagDeliveryStreamInput extends js.Object {
    /**
         * The name of the delivery stream to which you want to add the tags.
         */
    var DeliveryStreamName: DeliveryStreamName
    /**
         * A set of key-value pairs to use to create the tags.
         */
    var Tags: TagDeliveryStreamInputTagList
  }
  
  
  trait TagDeliveryStreamOutput extends js.Object
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Creates a Kinesis Data Firehose delivery stream. By default, you can create up to 50 delivery streams per AWS Region. This is an asynchronous operation that immediately returns. The initial status of the delivery stream is CREATING. After the delivery stream is created, its status is ACTIVE and it now accepts data. Attempts to send data to a delivery stream that is not in the ACTIVE state cause an exception. To check the state of a delivery stream, use DescribeDeliveryStream. A Kinesis Data Firehose delivery stream can be configured to receive records directly from providers using PutRecord or PutRecordBatch, or it can be configured to use an existing Kinesis stream as its source. To specify a Kinesis data stream as input, set the DeliveryStreamType parameter to KinesisStreamAsSource, and provide the Kinesis stream Amazon Resource Name (ARN) and role ARN in the KinesisStreamSourceConfiguration parameter. A delivery stream is configured with a single destination: Amazon S3, Amazon ES, Amazon Redshift, or Splunk. You must specify only one of the following destination configuration parameters: ExtendedS3DestinationConfiguration, S3DestinationConfiguration, ElasticsearchDestinationConfiguration, RedshiftDestinationConfiguration, or SplunkDestinationConfiguration. When you specify S3DestinationConfiguration, you can also provide the following optional values: BufferingHints, EncryptionConfiguration, and CompressionFormat. By default, if no BufferingHints value is provided, Kinesis Data Firehose buffers data up to 5 MB or for 5 minutes, whichever condition is satisfied first. BufferingHints is a hint, so there are some cases where the service cannot adhere to these conditions strictly. For example, record boundaries might be such that the size is a little over or under the configured buffering size. By default, no encryption is performed. We strongly recommend that you enable encryption to ensure secure data storage in Amazon S3. A few notes about Amazon Redshift as a destination:   An Amazon Redshift destination requires an S3 bucket as intermediate location. Kinesis Data Firehose first delivers data to Amazon S3 and then uses COPY syntax to load data into an Amazon Redshift table. This is specified in the RedshiftDestinationConfiguration.S3Configuration parameter.   The compression formats SNAPPY or ZIP cannot be specified in RedshiftDestinationConfiguration.S3Configuration because the Amazon Redshift COPY operation that reads from the S3 bucket doesn't support these compression formats.   We strongly recommend that you use the user name and password you provide exclusively with Kinesis Data Firehose, and that the permissions for the account are restricted for Amazon Redshift INSERT permissions.   Kinesis Data Firehose assumes the IAM role that is configured as part of the destination. The role should allow the Kinesis Data Firehose principal to assume the role, and the role should have permissions that allow the service to deliver the data. For more information, see Grant Kinesis Data Firehose Access to an Amazon S3 Destination in the Amazon Kinesis Data Firehose Developer Guide.
       */
    def createDeliveryStream(): awsDashSdkLib.libRequestMod.Request[CreateDeliveryStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a Kinesis Data Firehose delivery stream. By default, you can create up to 50 delivery streams per AWS Region. This is an asynchronous operation that immediately returns. The initial status of the delivery stream is CREATING. After the delivery stream is created, its status is ACTIVE and it now accepts data. Attempts to send data to a delivery stream that is not in the ACTIVE state cause an exception. To check the state of a delivery stream, use DescribeDeliveryStream. A Kinesis Data Firehose delivery stream can be configured to receive records directly from providers using PutRecord or PutRecordBatch, or it can be configured to use an existing Kinesis stream as its source. To specify a Kinesis data stream as input, set the DeliveryStreamType parameter to KinesisStreamAsSource, and provide the Kinesis stream Amazon Resource Name (ARN) and role ARN in the KinesisStreamSourceConfiguration parameter. A delivery stream is configured with a single destination: Amazon S3, Amazon ES, Amazon Redshift, or Splunk. You must specify only one of the following destination configuration parameters: ExtendedS3DestinationConfiguration, S3DestinationConfiguration, ElasticsearchDestinationConfiguration, RedshiftDestinationConfiguration, or SplunkDestinationConfiguration. When you specify S3DestinationConfiguration, you can also provide the following optional values: BufferingHints, EncryptionConfiguration, and CompressionFormat. By default, if no BufferingHints value is provided, Kinesis Data Firehose buffers data up to 5 MB or for 5 minutes, whichever condition is satisfied first. BufferingHints is a hint, so there are some cases where the service cannot adhere to these conditions strictly. For example, record boundaries might be such that the size is a little over or under the configured buffering size. By default, no encryption is performed. We strongly recommend that you enable encryption to ensure secure data storage in Amazon S3. A few notes about Amazon Redshift as a destination:   An Amazon Redshift destination requires an S3 bucket as intermediate location. Kinesis Data Firehose first delivers data to Amazon S3 and then uses COPY syntax to load data into an Amazon Redshift table. This is specified in the RedshiftDestinationConfiguration.S3Configuration parameter.   The compression formats SNAPPY or ZIP cannot be specified in RedshiftDestinationConfiguration.S3Configuration because the Amazon Redshift COPY operation that reads from the S3 bucket doesn't support these compression formats.   We strongly recommend that you use the user name and password you provide exclusively with Kinesis Data Firehose, and that the permissions for the account are restricted for Amazon Redshift INSERT permissions.   Kinesis Data Firehose assumes the IAM role that is configured as part of the destination. The role should allow the Kinesis Data Firehose principal to assume the role, and the role should have permissions that allow the service to deliver the data. For more information, see Grant Kinesis Data Firehose Access to an Amazon S3 Destination in the Amazon Kinesis Data Firehose Developer Guide.
       */
    def createDeliveryStream(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDeliveryStreamOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDeliveryStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a Kinesis Data Firehose delivery stream. By default, you can create up to 50 delivery streams per AWS Region. This is an asynchronous operation that immediately returns. The initial status of the delivery stream is CREATING. After the delivery stream is created, its status is ACTIVE and it now accepts data. Attempts to send data to a delivery stream that is not in the ACTIVE state cause an exception. To check the state of a delivery stream, use DescribeDeliveryStream. A Kinesis Data Firehose delivery stream can be configured to receive records directly from providers using PutRecord or PutRecordBatch, or it can be configured to use an existing Kinesis stream as its source. To specify a Kinesis data stream as input, set the DeliveryStreamType parameter to KinesisStreamAsSource, and provide the Kinesis stream Amazon Resource Name (ARN) and role ARN in the KinesisStreamSourceConfiguration parameter. A delivery stream is configured with a single destination: Amazon S3, Amazon ES, Amazon Redshift, or Splunk. You must specify only one of the following destination configuration parameters: ExtendedS3DestinationConfiguration, S3DestinationConfiguration, ElasticsearchDestinationConfiguration, RedshiftDestinationConfiguration, or SplunkDestinationConfiguration. When you specify S3DestinationConfiguration, you can also provide the following optional values: BufferingHints, EncryptionConfiguration, and CompressionFormat. By default, if no BufferingHints value is provided, Kinesis Data Firehose buffers data up to 5 MB or for 5 minutes, whichever condition is satisfied first. BufferingHints is a hint, so there are some cases where the service cannot adhere to these conditions strictly. For example, record boundaries might be such that the size is a little over or under the configured buffering size. By default, no encryption is performed. We strongly recommend that you enable encryption to ensure secure data storage in Amazon S3. A few notes about Amazon Redshift as a destination:   An Amazon Redshift destination requires an S3 bucket as intermediate location. Kinesis Data Firehose first delivers data to Amazon S3 and then uses COPY syntax to load data into an Amazon Redshift table. This is specified in the RedshiftDestinationConfiguration.S3Configuration parameter.   The compression formats SNAPPY or ZIP cannot be specified in RedshiftDestinationConfiguration.S3Configuration because the Amazon Redshift COPY operation that reads from the S3 bucket doesn't support these compression formats.   We strongly recommend that you use the user name and password you provide exclusively with Kinesis Data Firehose, and that the permissions for the account are restricted for Amazon Redshift INSERT permissions.   Kinesis Data Firehose assumes the IAM role that is configured as part of the destination. The role should allow the Kinesis Data Firehose principal to assume the role, and the role should have permissions that allow the service to deliver the data. For more information, see Grant Kinesis Data Firehose Access to an Amazon S3 Destination in the Amazon Kinesis Data Firehose Developer Guide.
       */
    def createDeliveryStream(params: CreateDeliveryStreamInput): awsDashSdkLib.libRequestMod.Request[CreateDeliveryStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a Kinesis Data Firehose delivery stream. By default, you can create up to 50 delivery streams per AWS Region. This is an asynchronous operation that immediately returns. The initial status of the delivery stream is CREATING. After the delivery stream is created, its status is ACTIVE and it now accepts data. Attempts to send data to a delivery stream that is not in the ACTIVE state cause an exception. To check the state of a delivery stream, use DescribeDeliveryStream. A Kinesis Data Firehose delivery stream can be configured to receive records directly from providers using PutRecord or PutRecordBatch, or it can be configured to use an existing Kinesis stream as its source. To specify a Kinesis data stream as input, set the DeliveryStreamType parameter to KinesisStreamAsSource, and provide the Kinesis stream Amazon Resource Name (ARN) and role ARN in the KinesisStreamSourceConfiguration parameter. A delivery stream is configured with a single destination: Amazon S3, Amazon ES, Amazon Redshift, or Splunk. You must specify only one of the following destination configuration parameters: ExtendedS3DestinationConfiguration, S3DestinationConfiguration, ElasticsearchDestinationConfiguration, RedshiftDestinationConfiguration, or SplunkDestinationConfiguration. When you specify S3DestinationConfiguration, you can also provide the following optional values: BufferingHints, EncryptionConfiguration, and CompressionFormat. By default, if no BufferingHints value is provided, Kinesis Data Firehose buffers data up to 5 MB or for 5 minutes, whichever condition is satisfied first. BufferingHints is a hint, so there are some cases where the service cannot adhere to these conditions strictly. For example, record boundaries might be such that the size is a little over or under the configured buffering size. By default, no encryption is performed. We strongly recommend that you enable encryption to ensure secure data storage in Amazon S3. A few notes about Amazon Redshift as a destination:   An Amazon Redshift destination requires an S3 bucket as intermediate location. Kinesis Data Firehose first delivers data to Amazon S3 and then uses COPY syntax to load data into an Amazon Redshift table. This is specified in the RedshiftDestinationConfiguration.S3Configuration parameter.   The compression formats SNAPPY or ZIP cannot be specified in RedshiftDestinationConfiguration.S3Configuration because the Amazon Redshift COPY operation that reads from the S3 bucket doesn't support these compression formats.   We strongly recommend that you use the user name and password you provide exclusively with Kinesis Data Firehose, and that the permissions for the account are restricted for Amazon Redshift INSERT permissions.   Kinesis Data Firehose assumes the IAM role that is configured as part of the destination. The role should allow the Kinesis Data Firehose principal to assume the role, and the role should have permissions that allow the service to deliver the data. For more information, see Grant Kinesis Data Firehose Access to an Amazon S3 Destination in the Amazon Kinesis Data Firehose Developer Guide.
       */
    def createDeliveryStream(
      params: CreateDeliveryStreamInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDeliveryStreamOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDeliveryStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a delivery stream and its data. You can delete a delivery stream only if it is in ACTIVE or DELETING state, and not in the CREATING state. While the deletion request is in process, the delivery stream is in the DELETING state. To check the state of a delivery stream, use DescribeDeliveryStream. While the delivery stream is DELETING state, the service might continue to accept the records, but it doesn't make any guarantees with respect to delivering the data. Therefore, as a best practice, you should first stop any applications that are sending records before deleting a delivery stream.
       */
    def deleteDeliveryStream(): awsDashSdkLib.libRequestMod.Request[DeleteDeliveryStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a delivery stream and its data. You can delete a delivery stream only if it is in ACTIVE or DELETING state, and not in the CREATING state. While the deletion request is in process, the delivery stream is in the DELETING state. To check the state of a delivery stream, use DescribeDeliveryStream. While the delivery stream is DELETING state, the service might continue to accept the records, but it doesn't make any guarantees with respect to delivering the data. Therefore, as a best practice, you should first stop any applications that are sending records before deleting a delivery stream.
       */
    def deleteDeliveryStream(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDeliveryStreamOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDeliveryStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a delivery stream and its data. You can delete a delivery stream only if it is in ACTIVE or DELETING state, and not in the CREATING state. While the deletion request is in process, the delivery stream is in the DELETING state. To check the state of a delivery stream, use DescribeDeliveryStream. While the delivery stream is DELETING state, the service might continue to accept the records, but it doesn't make any guarantees with respect to delivering the data. Therefore, as a best practice, you should first stop any applications that are sending records before deleting a delivery stream.
       */
    def deleteDeliveryStream(params: DeleteDeliveryStreamInput): awsDashSdkLib.libRequestMod.Request[DeleteDeliveryStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a delivery stream and its data. You can delete a delivery stream only if it is in ACTIVE or DELETING state, and not in the CREATING state. While the deletion request is in process, the delivery stream is in the DELETING state. To check the state of a delivery stream, use DescribeDeliveryStream. While the delivery stream is DELETING state, the service might continue to accept the records, but it doesn't make any guarantees with respect to delivering the data. Therefore, as a best practice, you should first stop any applications that are sending records before deleting a delivery stream.
       */
    def deleteDeliveryStream(
      params: DeleteDeliveryStreamInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDeliveryStreamOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDeliveryStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the specified delivery stream and gets the status. For example, after your delivery stream is created, call DescribeDeliveryStream to see whether the delivery stream is ACTIVE and therefore ready for data to be sent to it.
       */
    def describeDeliveryStream(): awsDashSdkLib.libRequestMod.Request[DescribeDeliveryStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the specified delivery stream and gets the status. For example, after your delivery stream is created, call DescribeDeliveryStream to see whether the delivery stream is ACTIVE and therefore ready for data to be sent to it.
       */
    def describeDeliveryStream(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDeliveryStreamOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDeliveryStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the specified delivery stream and gets the status. For example, after your delivery stream is created, call DescribeDeliveryStream to see whether the delivery stream is ACTIVE and therefore ready for data to be sent to it.
       */
    def describeDeliveryStream(params: DescribeDeliveryStreamInput): awsDashSdkLib.libRequestMod.Request[DescribeDeliveryStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the specified delivery stream and gets the status. For example, after your delivery stream is created, call DescribeDeliveryStream to see whether the delivery stream is ACTIVE and therefore ready for data to be sent to it.
       */
    def describeDeliveryStream(
      params: DescribeDeliveryStreamInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDeliveryStreamOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDeliveryStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists your delivery streams in alphabetical order of their names. The number of delivery streams might be too large to return using a single call to ListDeliveryStreams. You can limit the number of delivery streams returned, using the Limit parameter. To determine whether there are more delivery streams to list, check the value of HasMoreDeliveryStreams in the output. If there are more delivery streams to list, you can request them by calling this operation again and setting the ExclusiveStartDeliveryStreamName parameter to the name of the last delivery stream returned in the last call.
       */
    def listDeliveryStreams(): awsDashSdkLib.libRequestMod.Request[ListDeliveryStreamsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists your delivery streams in alphabetical order of their names. The number of delivery streams might be too large to return using a single call to ListDeliveryStreams. You can limit the number of delivery streams returned, using the Limit parameter. To determine whether there are more delivery streams to list, check the value of HasMoreDeliveryStreams in the output. If there are more delivery streams to list, you can request them by calling this operation again and setting the ExclusiveStartDeliveryStreamName parameter to the name of the last delivery stream returned in the last call.
       */
    def listDeliveryStreams(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDeliveryStreamsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDeliveryStreamsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists your delivery streams in alphabetical order of their names. The number of delivery streams might be too large to return using a single call to ListDeliveryStreams. You can limit the number of delivery streams returned, using the Limit parameter. To determine whether there are more delivery streams to list, check the value of HasMoreDeliveryStreams in the output. If there are more delivery streams to list, you can request them by calling this operation again and setting the ExclusiveStartDeliveryStreamName parameter to the name of the last delivery stream returned in the last call.
       */
    def listDeliveryStreams(params: ListDeliveryStreamsInput): awsDashSdkLib.libRequestMod.Request[ListDeliveryStreamsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists your delivery streams in alphabetical order of their names. The number of delivery streams might be too large to return using a single call to ListDeliveryStreams. You can limit the number of delivery streams returned, using the Limit parameter. To determine whether there are more delivery streams to list, check the value of HasMoreDeliveryStreams in the output. If there are more delivery streams to list, you can request them by calling this operation again and setting the ExclusiveStartDeliveryStreamName parameter to the name of the last delivery stream returned in the last call.
       */
    def listDeliveryStreams(
      params: ListDeliveryStreamsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDeliveryStreamsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDeliveryStreamsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the tags for the specified delivery stream. This operation has a limit of five transactions per second per account. 
       */
    def listTagsForDeliveryStream(): awsDashSdkLib.libRequestMod.Request[ListTagsForDeliveryStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the tags for the specified delivery stream. This operation has a limit of five transactions per second per account. 
       */
    def listTagsForDeliveryStream(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForDeliveryStreamOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForDeliveryStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the tags for the specified delivery stream. This operation has a limit of five transactions per second per account. 
       */
    def listTagsForDeliveryStream(params: ListTagsForDeliveryStreamInput): awsDashSdkLib.libRequestMod.Request[ListTagsForDeliveryStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the tags for the specified delivery stream. This operation has a limit of five transactions per second per account. 
       */
    def listTagsForDeliveryStream(
      params: ListTagsForDeliveryStreamInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForDeliveryStreamOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForDeliveryStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Writes a single data record into an Amazon Kinesis Data Firehose delivery stream. To write multiple data records into a delivery stream, use PutRecordBatch. Applications using these operations are referred to as producers. By default, each delivery stream can take in up to 2,000 transactions per second, 5,000 records per second, or 5 MB per second. If you use PutRecord and PutRecordBatch, the limits are an aggregate across these two operations for each delivery stream. For more information about limits and how to request an increase, see Amazon Kinesis Data Firehose Limits.  You must specify the name of the delivery stream and the data record when using PutRecord. The data record consists of a data blob that can be up to 1,000 KB in size, and any kind of data. For example, it can be a segment from a log file, geographic location data, website clickstream data, and so on. Kinesis Data Firehose buffers records before delivering them to the destination. To disambiguate the data blobs at the destination, a common solution is to use delimiters in the data, such as a newline (\n) or some other character unique within the data. This allows the consumer application to parse individual data items when reading the data from the destination. The PutRecord operation returns a RecordId, which is a unique string assigned to each record. Producer applications can use this ID for purposes such as auditability and investigation. If the PutRecord operation throws a ServiceUnavailableException, back off and retry. If the exception persists, it is possible that the throughput limits have been exceeded for the delivery stream.  Data records sent to Kinesis Data Firehose are stored for 24 hours from the time they are added to a delivery stream as it tries to send the records to the destination. If the destination is unreachable for more than 24 hours, the data is no longer available.  Don't concatenate two or more base64 strings to form the data fields of your records. Instead, concatenate the raw data, then perform base64 encoding. 
       */
    def putRecord(): awsDashSdkLib.libRequestMod.Request[PutRecordOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Writes a single data record into an Amazon Kinesis Data Firehose delivery stream. To write multiple data records into a delivery stream, use PutRecordBatch. Applications using these operations are referred to as producers. By default, each delivery stream can take in up to 2,000 transactions per second, 5,000 records per second, or 5 MB per second. If you use PutRecord and PutRecordBatch, the limits are an aggregate across these two operations for each delivery stream. For more information about limits and how to request an increase, see Amazon Kinesis Data Firehose Limits.  You must specify the name of the delivery stream and the data record when using PutRecord. The data record consists of a data blob that can be up to 1,000 KB in size, and any kind of data. For example, it can be a segment from a log file, geographic location data, website clickstream data, and so on. Kinesis Data Firehose buffers records before delivering them to the destination. To disambiguate the data blobs at the destination, a common solution is to use delimiters in the data, such as a newline (\n) or some other character unique within the data. This allows the consumer application to parse individual data items when reading the data from the destination. The PutRecord operation returns a RecordId, which is a unique string assigned to each record. Producer applications can use this ID for purposes such as auditability and investigation. If the PutRecord operation throws a ServiceUnavailableException, back off and retry. If the exception persists, it is possible that the throughput limits have been exceeded for the delivery stream.  Data records sent to Kinesis Data Firehose are stored for 24 hours from the time they are added to a delivery stream as it tries to send the records to the destination. If the destination is unreachable for more than 24 hours, the data is no longer available.  Don't concatenate two or more base64 strings to form the data fields of your records. Instead, concatenate the raw data, then perform base64 encoding. 
       */
    def putRecord(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ PutRecordOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[PutRecordOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Writes a single data record into an Amazon Kinesis Data Firehose delivery stream. To write multiple data records into a delivery stream, use PutRecordBatch. Applications using these operations are referred to as producers. By default, each delivery stream can take in up to 2,000 transactions per second, 5,000 records per second, or 5 MB per second. If you use PutRecord and PutRecordBatch, the limits are an aggregate across these two operations for each delivery stream. For more information about limits and how to request an increase, see Amazon Kinesis Data Firehose Limits.  You must specify the name of the delivery stream and the data record when using PutRecord. The data record consists of a data blob that can be up to 1,000 KB in size, and any kind of data. For example, it can be a segment from a log file, geographic location data, website clickstream data, and so on. Kinesis Data Firehose buffers records before delivering them to the destination. To disambiguate the data blobs at the destination, a common solution is to use delimiters in the data, such as a newline (\n) or some other character unique within the data. This allows the consumer application to parse individual data items when reading the data from the destination. The PutRecord operation returns a RecordId, which is a unique string assigned to each record. Producer applications can use this ID for purposes such as auditability and investigation. If the PutRecord operation throws a ServiceUnavailableException, back off and retry. If the exception persists, it is possible that the throughput limits have been exceeded for the delivery stream.  Data records sent to Kinesis Data Firehose are stored for 24 hours from the time they are added to a delivery stream as it tries to send the records to the destination. If the destination is unreachable for more than 24 hours, the data is no longer available.  Don't concatenate two or more base64 strings to form the data fields of your records. Instead, concatenate the raw data, then perform base64 encoding. 
       */
    def putRecord(params: PutRecordInput): awsDashSdkLib.libRequestMod.Request[PutRecordOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Writes a single data record into an Amazon Kinesis Data Firehose delivery stream. To write multiple data records into a delivery stream, use PutRecordBatch. Applications using these operations are referred to as producers. By default, each delivery stream can take in up to 2,000 transactions per second, 5,000 records per second, or 5 MB per second. If you use PutRecord and PutRecordBatch, the limits are an aggregate across these two operations for each delivery stream. For more information about limits and how to request an increase, see Amazon Kinesis Data Firehose Limits.  You must specify the name of the delivery stream and the data record when using PutRecord. The data record consists of a data blob that can be up to 1,000 KB in size, and any kind of data. For example, it can be a segment from a log file, geographic location data, website clickstream data, and so on. Kinesis Data Firehose buffers records before delivering them to the destination. To disambiguate the data blobs at the destination, a common solution is to use delimiters in the data, such as a newline (\n) or some other character unique within the data. This allows the consumer application to parse individual data items when reading the data from the destination. The PutRecord operation returns a RecordId, which is a unique string assigned to each record. Producer applications can use this ID for purposes such as auditability and investigation. If the PutRecord operation throws a ServiceUnavailableException, back off and retry. If the exception persists, it is possible that the throughput limits have been exceeded for the delivery stream.  Data records sent to Kinesis Data Firehose are stored for 24 hours from the time they are added to a delivery stream as it tries to send the records to the destination. If the destination is unreachable for more than 24 hours, the data is no longer available.  Don't concatenate two or more base64 strings to form the data fields of your records. Instead, concatenate the raw data, then perform base64 encoding. 
       */
    def putRecord(
      params: PutRecordInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ PutRecordOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[PutRecordOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Writes multiple data records into a delivery stream in a single call, which can achieve higher throughput per producer than when writing single records. To write single data records into a delivery stream, use PutRecord. Applications using these operations are referred to as producers. By default, each delivery stream can take in up to 2,000 transactions per second, 5,000 records per second, or 5 MB per second. If you use PutRecord and PutRecordBatch, the limits are an aggregate across these two operations for each delivery stream. For more information about limits, see Amazon Kinesis Data Firehose Limits. Each PutRecordBatch request supports up to 500 records. Each record in the request can be as large as 1,000 KB (before 64-bit encoding), up to a limit of 4 MB for the entire request. These limits cannot be changed. You must specify the name of the delivery stream and the data record when using PutRecord. The data record consists of a data blob that can be up to 1,000 KB in size, and any kind of data. For example, it could be a segment from a log file, geographic location data, website clickstream data, and so on. Kinesis Data Firehose buffers records before delivering them to the destination. To disambiguate the data blobs at the destination, a common solution is to use delimiters in the data, such as a newline (\n) or some other character unique within the data. This allows the consumer application to parse individual data items when reading the data from the destination. The PutRecordBatch response includes a count of failed records, FailedPutCount, and an array of responses, RequestResponses. Even if the PutRecordBatch call succeeds, the value of FailedPutCount may be greater than 0, indicating that there are records for which the operation didn't succeed. Each entry in the RequestResponses array provides additional information about the processed record. It directly correlates with a record in the request array using the same ordering, from the top to the bottom. The response array always includes the same number of records as the request array. RequestResponses includes both successfully and unsuccessfully processed records. Kinesis Data Firehose tries to process all records in each PutRecordBatch request. A single record failure does not stop the processing of subsequent records.  A successfully processed record includes a RecordId value, which is unique for the record. An unsuccessfully processed record includes ErrorCode and ErrorMessage values. ErrorCode reflects the type of error, and is one of the following values: ServiceUnavailableException or InternalFailure. ErrorMessage provides more detailed information about the error. If there is an internal server error or a timeout, the write might have completed or it might have failed. If FailedPutCount is greater than 0, retry the request, resending only those records that might have failed processing. This minimizes the possible duplicate records and also reduces the total bytes sent (and corresponding charges). We recommend that you handle any duplicates at the destination. If PutRecordBatch throws ServiceUnavailableException, back off and retry. If the exception persists, it is possible that the throughput limits have been exceeded for the delivery stream. Data records sent to Kinesis Data Firehose are stored for 24 hours from the time they are added to a delivery stream as it attempts to send the records to the destination. If the destination is unreachable for more than 24 hours, the data is no longer available.  Don't concatenate two or more base64 strings to form the data fields of your records. Instead, concatenate the raw data, then perform base64 encoding. 
       */
    def putRecordBatch(): awsDashSdkLib.libRequestMod.Request[PutRecordBatchOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Writes multiple data records into a delivery stream in a single call, which can achieve higher throughput per producer than when writing single records. To write single data records into a delivery stream, use PutRecord. Applications using these operations are referred to as producers. By default, each delivery stream can take in up to 2,000 transactions per second, 5,000 records per second, or 5 MB per second. If you use PutRecord and PutRecordBatch, the limits are an aggregate across these two operations for each delivery stream. For more information about limits, see Amazon Kinesis Data Firehose Limits. Each PutRecordBatch request supports up to 500 records. Each record in the request can be as large as 1,000 KB (before 64-bit encoding), up to a limit of 4 MB for the entire request. These limits cannot be changed. You must specify the name of the delivery stream and the data record when using PutRecord. The data record consists of a data blob that can be up to 1,000 KB in size, and any kind of data. For example, it could be a segment from a log file, geographic location data, website clickstream data, and so on. Kinesis Data Firehose buffers records before delivering them to the destination. To disambiguate the data blobs at the destination, a common solution is to use delimiters in the data, such as a newline (\n) or some other character unique within the data. This allows the consumer application to parse individual data items when reading the data from the destination. The PutRecordBatch response includes a count of failed records, FailedPutCount, and an array of responses, RequestResponses. Even if the PutRecordBatch call succeeds, the value of FailedPutCount may be greater than 0, indicating that there are records for which the operation didn't succeed. Each entry in the RequestResponses array provides additional information about the processed record. It directly correlates with a record in the request array using the same ordering, from the top to the bottom. The response array always includes the same number of records as the request array. RequestResponses includes both successfully and unsuccessfully processed records. Kinesis Data Firehose tries to process all records in each PutRecordBatch request. A single record failure does not stop the processing of subsequent records.  A successfully processed record includes a RecordId value, which is unique for the record. An unsuccessfully processed record includes ErrorCode and ErrorMessage values. ErrorCode reflects the type of error, and is one of the following values: ServiceUnavailableException or InternalFailure. ErrorMessage provides more detailed information about the error. If there is an internal server error or a timeout, the write might have completed or it might have failed. If FailedPutCount is greater than 0, retry the request, resending only those records that might have failed processing. This minimizes the possible duplicate records and also reduces the total bytes sent (and corresponding charges). We recommend that you handle any duplicates at the destination. If PutRecordBatch throws ServiceUnavailableException, back off and retry. If the exception persists, it is possible that the throughput limits have been exceeded for the delivery stream. Data records sent to Kinesis Data Firehose are stored for 24 hours from the time they are added to a delivery stream as it attempts to send the records to the destination. If the destination is unreachable for more than 24 hours, the data is no longer available.  Don't concatenate two or more base64 strings to form the data fields of your records. Instead, concatenate the raw data, then perform base64 encoding. 
       */
    def putRecordBatch(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutRecordBatchOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutRecordBatchOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Writes multiple data records into a delivery stream in a single call, which can achieve higher throughput per producer than when writing single records. To write single data records into a delivery stream, use PutRecord. Applications using these operations are referred to as producers. By default, each delivery stream can take in up to 2,000 transactions per second, 5,000 records per second, or 5 MB per second. If you use PutRecord and PutRecordBatch, the limits are an aggregate across these two operations for each delivery stream. For more information about limits, see Amazon Kinesis Data Firehose Limits. Each PutRecordBatch request supports up to 500 records. Each record in the request can be as large as 1,000 KB (before 64-bit encoding), up to a limit of 4 MB for the entire request. These limits cannot be changed. You must specify the name of the delivery stream and the data record when using PutRecord. The data record consists of a data blob that can be up to 1,000 KB in size, and any kind of data. For example, it could be a segment from a log file, geographic location data, website clickstream data, and so on. Kinesis Data Firehose buffers records before delivering them to the destination. To disambiguate the data blobs at the destination, a common solution is to use delimiters in the data, such as a newline (\n) or some other character unique within the data. This allows the consumer application to parse individual data items when reading the data from the destination. The PutRecordBatch response includes a count of failed records, FailedPutCount, and an array of responses, RequestResponses. Even if the PutRecordBatch call succeeds, the value of FailedPutCount may be greater than 0, indicating that there are records for which the operation didn't succeed. Each entry in the RequestResponses array provides additional information about the processed record. It directly correlates with a record in the request array using the same ordering, from the top to the bottom. The response array always includes the same number of records as the request array. RequestResponses includes both successfully and unsuccessfully processed records. Kinesis Data Firehose tries to process all records in each PutRecordBatch request. A single record failure does not stop the processing of subsequent records.  A successfully processed record includes a RecordId value, which is unique for the record. An unsuccessfully processed record includes ErrorCode and ErrorMessage values. ErrorCode reflects the type of error, and is one of the following values: ServiceUnavailableException or InternalFailure. ErrorMessage provides more detailed information about the error. If there is an internal server error or a timeout, the write might have completed or it might have failed. If FailedPutCount is greater than 0, retry the request, resending only those records that might have failed processing. This minimizes the possible duplicate records and also reduces the total bytes sent (and corresponding charges). We recommend that you handle any duplicates at the destination. If PutRecordBatch throws ServiceUnavailableException, back off and retry. If the exception persists, it is possible that the throughput limits have been exceeded for the delivery stream. Data records sent to Kinesis Data Firehose are stored for 24 hours from the time they are added to a delivery stream as it attempts to send the records to the destination. If the destination is unreachable for more than 24 hours, the data is no longer available.  Don't concatenate two or more base64 strings to form the data fields of your records. Instead, concatenate the raw data, then perform base64 encoding. 
       */
    def putRecordBatch(params: PutRecordBatchInput): awsDashSdkLib.libRequestMod.Request[PutRecordBatchOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Writes multiple data records into a delivery stream in a single call, which can achieve higher throughput per producer than when writing single records. To write single data records into a delivery stream, use PutRecord. Applications using these operations are referred to as producers. By default, each delivery stream can take in up to 2,000 transactions per second, 5,000 records per second, or 5 MB per second. If you use PutRecord and PutRecordBatch, the limits are an aggregate across these two operations for each delivery stream. For more information about limits, see Amazon Kinesis Data Firehose Limits. Each PutRecordBatch request supports up to 500 records. Each record in the request can be as large as 1,000 KB (before 64-bit encoding), up to a limit of 4 MB for the entire request. These limits cannot be changed. You must specify the name of the delivery stream and the data record when using PutRecord. The data record consists of a data blob that can be up to 1,000 KB in size, and any kind of data. For example, it could be a segment from a log file, geographic location data, website clickstream data, and so on. Kinesis Data Firehose buffers records before delivering them to the destination. To disambiguate the data blobs at the destination, a common solution is to use delimiters in the data, such as a newline (\n) or some other character unique within the data. This allows the consumer application to parse individual data items when reading the data from the destination. The PutRecordBatch response includes a count of failed records, FailedPutCount, and an array of responses, RequestResponses. Even if the PutRecordBatch call succeeds, the value of FailedPutCount may be greater than 0, indicating that there are records for which the operation didn't succeed. Each entry in the RequestResponses array provides additional information about the processed record. It directly correlates with a record in the request array using the same ordering, from the top to the bottom. The response array always includes the same number of records as the request array. RequestResponses includes both successfully and unsuccessfully processed records. Kinesis Data Firehose tries to process all records in each PutRecordBatch request. A single record failure does not stop the processing of subsequent records.  A successfully processed record includes a RecordId value, which is unique for the record. An unsuccessfully processed record includes ErrorCode and ErrorMessage values. ErrorCode reflects the type of error, and is one of the following values: ServiceUnavailableException or InternalFailure. ErrorMessage provides more detailed information about the error. If there is an internal server error or a timeout, the write might have completed or it might have failed. If FailedPutCount is greater than 0, retry the request, resending only those records that might have failed processing. This minimizes the possible duplicate records and also reduces the total bytes sent (and corresponding charges). We recommend that you handle any duplicates at the destination. If PutRecordBatch throws ServiceUnavailableException, back off and retry. If the exception persists, it is possible that the throughput limits have been exceeded for the delivery stream. Data records sent to Kinesis Data Firehose are stored for 24 hours from the time they are added to a delivery stream as it attempts to send the records to the destination. If the destination is unreachable for more than 24 hours, the data is no longer available.  Don't concatenate two or more base64 strings to form the data fields of your records. Instead, concatenate the raw data, then perform base64 encoding. 
       */
    def putRecordBatch(
      params: PutRecordBatchInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutRecordBatchOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutRecordBatchOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables server-side encryption (SSE) for the delivery stream.  This operation is asynchronous. It returns immediately. When you invoke it, Kinesis Data Firehose first sets the status of the stream to ENABLING, and then to ENABLED. You can continue to read and write data to your stream while its status is ENABLING, but the data is not encrypted. It can take up to 5 seconds after the encryption status changes to ENABLED before all records written to the delivery stream are encrypted. To find out whether a record or a batch of records was encrypted, check the response elements PutRecordOutput$Encrypted and PutRecordBatchOutput$Encrypted, respectively. To check the encryption state of a delivery stream, use DescribeDeliveryStream. You can only enable SSE for a delivery stream that uses DirectPut as its source.  The StartDeliveryStreamEncryption and StopDeliveryStreamEncryption operations have a combined limit of 25 calls per delivery stream per 24 hours. For example, you reach the limit if you call StartDeliveryStreamEncryption 13 times and StopDeliveryStreamEncryption 12 times for the same delivery stream in a 24-hour period.
       */
    def startDeliveryStreamEncryption(): awsDashSdkLib.libRequestMod.Request[StartDeliveryStreamEncryptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables server-side encryption (SSE) for the delivery stream.  This operation is asynchronous. It returns immediately. When you invoke it, Kinesis Data Firehose first sets the status of the stream to ENABLING, and then to ENABLED. You can continue to read and write data to your stream while its status is ENABLING, but the data is not encrypted. It can take up to 5 seconds after the encryption status changes to ENABLED before all records written to the delivery stream are encrypted. To find out whether a record or a batch of records was encrypted, check the response elements PutRecordOutput$Encrypted and PutRecordBatchOutput$Encrypted, respectively. To check the encryption state of a delivery stream, use DescribeDeliveryStream. You can only enable SSE for a delivery stream that uses DirectPut as its source.  The StartDeliveryStreamEncryption and StopDeliveryStreamEncryption operations have a combined limit of 25 calls per delivery stream per 24 hours. For example, you reach the limit if you call StartDeliveryStreamEncryption 13 times and StopDeliveryStreamEncryption 12 times for the same delivery stream in a 24-hour period.
       */
    def startDeliveryStreamEncryption(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartDeliveryStreamEncryptionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartDeliveryStreamEncryptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables server-side encryption (SSE) for the delivery stream.  This operation is asynchronous. It returns immediately. When you invoke it, Kinesis Data Firehose first sets the status of the stream to ENABLING, and then to ENABLED. You can continue to read and write data to your stream while its status is ENABLING, but the data is not encrypted. It can take up to 5 seconds after the encryption status changes to ENABLED before all records written to the delivery stream are encrypted. To find out whether a record or a batch of records was encrypted, check the response elements PutRecordOutput$Encrypted and PutRecordBatchOutput$Encrypted, respectively. To check the encryption state of a delivery stream, use DescribeDeliveryStream. You can only enable SSE for a delivery stream that uses DirectPut as its source.  The StartDeliveryStreamEncryption and StopDeliveryStreamEncryption operations have a combined limit of 25 calls per delivery stream per 24 hours. For example, you reach the limit if you call StartDeliveryStreamEncryption 13 times and StopDeliveryStreamEncryption 12 times for the same delivery stream in a 24-hour period.
       */
    def startDeliveryStreamEncryption(params: StartDeliveryStreamEncryptionInput): awsDashSdkLib.libRequestMod.Request[StartDeliveryStreamEncryptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables server-side encryption (SSE) for the delivery stream.  This operation is asynchronous. It returns immediately. When you invoke it, Kinesis Data Firehose first sets the status of the stream to ENABLING, and then to ENABLED. You can continue to read and write data to your stream while its status is ENABLING, but the data is not encrypted. It can take up to 5 seconds after the encryption status changes to ENABLED before all records written to the delivery stream are encrypted. To find out whether a record or a batch of records was encrypted, check the response elements PutRecordOutput$Encrypted and PutRecordBatchOutput$Encrypted, respectively. To check the encryption state of a delivery stream, use DescribeDeliveryStream. You can only enable SSE for a delivery stream that uses DirectPut as its source.  The StartDeliveryStreamEncryption and StopDeliveryStreamEncryption operations have a combined limit of 25 calls per delivery stream per 24 hours. For example, you reach the limit if you call StartDeliveryStreamEncryption 13 times and StopDeliveryStreamEncryption 12 times for the same delivery stream in a 24-hour period.
       */
    def startDeliveryStreamEncryption(
      params: StartDeliveryStreamEncryptionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartDeliveryStreamEncryptionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartDeliveryStreamEncryptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disables server-side encryption (SSE) for the delivery stream.  This operation is asynchronous. It returns immediately. When you invoke it, Kinesis Data Firehose first sets the status of the stream to DISABLING, and then to DISABLED. You can continue to read and write data to your stream while its status is DISABLING. It can take up to 5 seconds after the encryption status changes to DISABLED before all records written to the delivery stream are no longer subject to encryption. To find out whether a record or a batch of records was encrypted, check the response elements PutRecordOutput$Encrypted and PutRecordBatchOutput$Encrypted, respectively. To check the encryption state of a delivery stream, use DescribeDeliveryStream.  The StartDeliveryStreamEncryption and StopDeliveryStreamEncryption operations have a combined limit of 25 calls per delivery stream per 24 hours. For example, you reach the limit if you call StartDeliveryStreamEncryption 13 times and StopDeliveryStreamEncryption 12 times for the same delivery stream in a 24-hour period.
       */
    def stopDeliveryStreamEncryption(): awsDashSdkLib.libRequestMod.Request[StopDeliveryStreamEncryptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disables server-side encryption (SSE) for the delivery stream.  This operation is asynchronous. It returns immediately. When you invoke it, Kinesis Data Firehose first sets the status of the stream to DISABLING, and then to DISABLED. You can continue to read and write data to your stream while its status is DISABLING. It can take up to 5 seconds after the encryption status changes to DISABLED before all records written to the delivery stream are no longer subject to encryption. To find out whether a record or a batch of records was encrypted, check the response elements PutRecordOutput$Encrypted and PutRecordBatchOutput$Encrypted, respectively. To check the encryption state of a delivery stream, use DescribeDeliveryStream.  The StartDeliveryStreamEncryption and StopDeliveryStreamEncryption operations have a combined limit of 25 calls per delivery stream per 24 hours. For example, you reach the limit if you call StartDeliveryStreamEncryption 13 times and StopDeliveryStreamEncryption 12 times for the same delivery stream in a 24-hour period.
       */
    def stopDeliveryStreamEncryption(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopDeliveryStreamEncryptionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopDeliveryStreamEncryptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disables server-side encryption (SSE) for the delivery stream.  This operation is asynchronous. It returns immediately. When you invoke it, Kinesis Data Firehose first sets the status of the stream to DISABLING, and then to DISABLED. You can continue to read and write data to your stream while its status is DISABLING. It can take up to 5 seconds after the encryption status changes to DISABLED before all records written to the delivery stream are no longer subject to encryption. To find out whether a record or a batch of records was encrypted, check the response elements PutRecordOutput$Encrypted and PutRecordBatchOutput$Encrypted, respectively. To check the encryption state of a delivery stream, use DescribeDeliveryStream.  The StartDeliveryStreamEncryption and StopDeliveryStreamEncryption operations have a combined limit of 25 calls per delivery stream per 24 hours. For example, you reach the limit if you call StartDeliveryStreamEncryption 13 times and StopDeliveryStreamEncryption 12 times for the same delivery stream in a 24-hour period.
       */
    def stopDeliveryStreamEncryption(params: StopDeliveryStreamEncryptionInput): awsDashSdkLib.libRequestMod.Request[StopDeliveryStreamEncryptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disables server-side encryption (SSE) for the delivery stream.  This operation is asynchronous. It returns immediately. When you invoke it, Kinesis Data Firehose first sets the status of the stream to DISABLING, and then to DISABLED. You can continue to read and write data to your stream while its status is DISABLING. It can take up to 5 seconds after the encryption status changes to DISABLED before all records written to the delivery stream are no longer subject to encryption. To find out whether a record or a batch of records was encrypted, check the response elements PutRecordOutput$Encrypted and PutRecordBatchOutput$Encrypted, respectively. To check the encryption state of a delivery stream, use DescribeDeliveryStream.  The StartDeliveryStreamEncryption and StopDeliveryStreamEncryption operations have a combined limit of 25 calls per delivery stream per 24 hours. For example, you reach the limit if you call StartDeliveryStreamEncryption 13 times and StopDeliveryStreamEncryption 12 times for the same delivery stream in a 24-hour period.
       */
    def stopDeliveryStreamEncryption(
      params: StopDeliveryStreamEncryptionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopDeliveryStreamEncryptionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopDeliveryStreamEncryptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds or updates tags for the specified delivery stream. A tag is a key-value pair that you can define and assign to AWS resources. If you specify a tag that already exists, the tag value is replaced with the value that you specify in the request. Tags are metadata. For example, you can add friendly names and descriptions or other types of information that can help you distinguish the delivery stream. For more information about tags, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.  Each delivery stream can have up to 50 tags.  This operation has a limit of five transactions per second per account. 
       */
    def tagDeliveryStream(): awsDashSdkLib.libRequestMod.Request[TagDeliveryStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds or updates tags for the specified delivery stream. A tag is a key-value pair that you can define and assign to AWS resources. If you specify a tag that already exists, the tag value is replaced with the value that you specify in the request. Tags are metadata. For example, you can add friendly names and descriptions or other types of information that can help you distinguish the delivery stream. For more information about tags, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.  Each delivery stream can have up to 50 tags.  This operation has a limit of five transactions per second per account. 
       */
    def tagDeliveryStream(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TagDeliveryStreamOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TagDeliveryStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds or updates tags for the specified delivery stream. A tag is a key-value pair that you can define and assign to AWS resources. If you specify a tag that already exists, the tag value is replaced with the value that you specify in the request. Tags are metadata. For example, you can add friendly names and descriptions or other types of information that can help you distinguish the delivery stream. For more information about tags, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.  Each delivery stream can have up to 50 tags.  This operation has a limit of five transactions per second per account. 
       */
    def tagDeliveryStream(params: TagDeliveryStreamInput): awsDashSdkLib.libRequestMod.Request[TagDeliveryStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds or updates tags for the specified delivery stream. A tag is a key-value pair that you can define and assign to AWS resources. If you specify a tag that already exists, the tag value is replaced with the value that you specify in the request. Tags are metadata. For example, you can add friendly names and descriptions or other types of information that can help you distinguish the delivery stream. For more information about tags, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.  Each delivery stream can have up to 50 tags.  This operation has a limit of five transactions per second per account. 
       */
    def tagDeliveryStream(
      params: TagDeliveryStreamInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TagDeliveryStreamOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TagDeliveryStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes tags from the specified delivery stream. Removed tags are deleted, and you can't recover them after this operation successfully completes. If you specify a tag that doesn't exist, the operation ignores it. This operation has a limit of five transactions per second per account. 
       */
    def untagDeliveryStream(): awsDashSdkLib.libRequestMod.Request[UntagDeliveryStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes tags from the specified delivery stream. Removed tags are deleted, and you can't recover them after this operation successfully completes. If you specify a tag that doesn't exist, the operation ignores it. This operation has a limit of five transactions per second per account. 
       */
    def untagDeliveryStream(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UntagDeliveryStreamOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UntagDeliveryStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes tags from the specified delivery stream. Removed tags are deleted, and you can't recover them after this operation successfully completes. If you specify a tag that doesn't exist, the operation ignores it. This operation has a limit of five transactions per second per account. 
       */
    def untagDeliveryStream(params: UntagDeliveryStreamInput): awsDashSdkLib.libRequestMod.Request[UntagDeliveryStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes tags from the specified delivery stream. Removed tags are deleted, and you can't recover them after this operation successfully completes. If you specify a tag that doesn't exist, the operation ignores it. This operation has a limit of five transactions per second per account. 
       */
    def untagDeliveryStream(
      params: UntagDeliveryStreamInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UntagDeliveryStreamOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UntagDeliveryStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the specified destination of the specified delivery stream. Use this operation to change the destination type (for example, to replace the Amazon S3 destination with Amazon Redshift) or change the parameters associated with a destination (for example, to change the bucket name of the Amazon S3 destination). The update might not occur immediately. The target delivery stream remains active while the configurations are updated, so data writes to the delivery stream can continue during this process. The updated configurations are usually effective within a few minutes. Switching between Amazon ES and other services is not supported. For an Amazon ES destination, you can only update to another Amazon ES destination. If the destination type is the same, Kinesis Data Firehose merges the configuration parameters specified with the destination configuration that already exists on the delivery stream. If any of the parameters are not specified in the call, the existing values are retained. For example, in the Amazon S3 destination, if EncryptionConfiguration is not specified, then the existing EncryptionConfiguration is maintained on the destination. If the destination type is not the same, for example, changing the destination from Amazon S3 to Amazon Redshift, Kinesis Data Firehose does not merge any parameters. In this case, all parameters must be specified. Kinesis Data Firehose uses CurrentDeliveryStreamVersionId to avoid race conditions and conflicting merges. This is a required field, and the service updates the configuration only if the existing configuration has a version ID that matches. After the update is applied successfully, the version ID is updated, and can be retrieved using DescribeDeliveryStream. Use the new version ID to set CurrentDeliveryStreamVersionId in the next call.
       */
    def updateDestination(): awsDashSdkLib.libRequestMod.Request[UpdateDestinationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the specified destination of the specified delivery stream. Use this operation to change the destination type (for example, to replace the Amazon S3 destination with Amazon Redshift) or change the parameters associated with a destination (for example, to change the bucket name of the Amazon S3 destination). The update might not occur immediately. The target delivery stream remains active while the configurations are updated, so data writes to the delivery stream can continue during this process. The updated configurations are usually effective within a few minutes. Switching between Amazon ES and other services is not supported. For an Amazon ES destination, you can only update to another Amazon ES destination. If the destination type is the same, Kinesis Data Firehose merges the configuration parameters specified with the destination configuration that already exists on the delivery stream. If any of the parameters are not specified in the call, the existing values are retained. For example, in the Amazon S3 destination, if EncryptionConfiguration is not specified, then the existing EncryptionConfiguration is maintained on the destination. If the destination type is not the same, for example, changing the destination from Amazon S3 to Amazon Redshift, Kinesis Data Firehose does not merge any parameters. In this case, all parameters must be specified. Kinesis Data Firehose uses CurrentDeliveryStreamVersionId to avoid race conditions and conflicting merges. This is a required field, and the service updates the configuration only if the existing configuration has a version ID that matches. After the update is applied successfully, the version ID is updated, and can be retrieved using DescribeDeliveryStream. Use the new version ID to set CurrentDeliveryStreamVersionId in the next call.
       */
    def updateDestination(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateDestinationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateDestinationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the specified destination of the specified delivery stream. Use this operation to change the destination type (for example, to replace the Amazon S3 destination with Amazon Redshift) or change the parameters associated with a destination (for example, to change the bucket name of the Amazon S3 destination). The update might not occur immediately. The target delivery stream remains active while the configurations are updated, so data writes to the delivery stream can continue during this process. The updated configurations are usually effective within a few minutes. Switching between Amazon ES and other services is not supported. For an Amazon ES destination, you can only update to another Amazon ES destination. If the destination type is the same, Kinesis Data Firehose merges the configuration parameters specified with the destination configuration that already exists on the delivery stream. If any of the parameters are not specified in the call, the existing values are retained. For example, in the Amazon S3 destination, if EncryptionConfiguration is not specified, then the existing EncryptionConfiguration is maintained on the destination. If the destination type is not the same, for example, changing the destination from Amazon S3 to Amazon Redshift, Kinesis Data Firehose does not merge any parameters. In this case, all parameters must be specified. Kinesis Data Firehose uses CurrentDeliveryStreamVersionId to avoid race conditions and conflicting merges. This is a required field, and the service updates the configuration only if the existing configuration has a version ID that matches. After the update is applied successfully, the version ID is updated, and can be retrieved using DescribeDeliveryStream. Use the new version ID to set CurrentDeliveryStreamVersionId in the next call.
       */
    def updateDestination(params: UpdateDestinationInput): awsDashSdkLib.libRequestMod.Request[UpdateDestinationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the specified destination of the specified delivery stream. Use this operation to change the destination type (for example, to replace the Amazon S3 destination with Amazon Redshift) or change the parameters associated with a destination (for example, to change the bucket name of the Amazon S3 destination). The update might not occur immediately. The target delivery stream remains active while the configurations are updated, so data writes to the delivery stream can continue during this process. The updated configurations are usually effective within a few minutes. Switching between Amazon ES and other services is not supported. For an Amazon ES destination, you can only update to another Amazon ES destination. If the destination type is the same, Kinesis Data Firehose merges the configuration parameters specified with the destination configuration that already exists on the delivery stream. If any of the parameters are not specified in the call, the existing values are retained. For example, in the Amazon S3 destination, if EncryptionConfiguration is not specified, then the existing EncryptionConfiguration is maintained on the destination. If the destination type is not the same, for example, changing the destination from Amazon S3 to Amazon Redshift, Kinesis Data Firehose does not merge any parameters. In this case, all parameters must be specified. Kinesis Data Firehose uses CurrentDeliveryStreamVersionId to avoid race conditions and conflicting merges. This is a required field, and the service updates the configuration only if the existing configuration has a version ID that matches. After the update is applied successfully, the version ID is updated, and can be retrieved using DescribeDeliveryStream. Use the new version ID to set CurrentDeliveryStreamVersionId in the next call.
       */
    def updateDestination(
      params: UpdateDestinationInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateDestinationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateDestinationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UntagDeliveryStreamInput extends js.Object {
    /**
         * The name of the delivery stream.
         */
    var DeliveryStreamName: DeliveryStreamName
    /**
         * A list of tag keys. Each corresponding tag is removed from the delivery stream.
         */
    var TagKeys: TagKeyList
  }
  
  
  trait UntagDeliveryStreamOutput extends js.Object
  
  
  trait UpdateDestinationInput extends js.Object {
    /**
         * Obtain this value from the VersionId result of DeliveryStreamDescription. This value is required, and helps the service perform conditional operations. For example, if there is an interleaving update and this value is null, then the update destination fails. After the update is successful, the VersionId value is updated. The service then performs a merge of the old configuration with the new configuration.
         */
    var CurrentDeliveryStreamVersionId: DeliveryStreamVersionId
    /**
         * The name of the delivery stream.
         */
    var DeliveryStreamName: DeliveryStreamName
    /**
         * The ID of the destination.
         */
    var DestinationId: DestinationId
    /**
         * Describes an update for a destination in Amazon ES.
         */
    var ElasticsearchDestinationUpdate: js.UndefOr[ElasticsearchDestinationUpdate] = js.undefined
    /**
         * Describes an update for a destination in Amazon S3.
         */
    var ExtendedS3DestinationUpdate: js.UndefOr[ExtendedS3DestinationUpdate] = js.undefined
    /**
         * Describes an update for a destination in Amazon Redshift.
         */
    var RedshiftDestinationUpdate: js.UndefOr[RedshiftDestinationUpdate] = js.undefined
    /**
         * [Deprecated] Describes an update for a destination in Amazon S3.
         */
    var S3DestinationUpdate: js.UndefOr[S3DestinationUpdate] = js.undefined
    /**
         * Describes an update for a destination in Splunk.
         */
    var SplunkDestinationUpdate: js.UndefOr[SplunkDestinationUpdate] = js.undefined
  }
  
  
  trait UpdateDestinationOutput extends js.Object
  
  val TypesNs: this.type = js.native
  type AWSKMSKeyARN = java.lang.String
  type BlockSizeBytes = scala.Double
  type BooleanObject = scala.Boolean
  type BucketARN = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClusterJDBCURL = java.lang.String
  type CompressionFormat = awsDashSdkLib.awsDashSdkLibStrings.UNCOMPRESSED | awsDashSdkLib.awsDashSdkLibStrings.GZIP | awsDashSdkLib.awsDashSdkLibStrings.ZIP | awsDashSdkLib.awsDashSdkLibStrings.Snappy | java.lang.String
  type CopyOptions = java.lang.String
  type Data = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsFirehoseMod.Blob | java.lang.String
  type DataTableColumns = java.lang.String
  type DataTableName = java.lang.String
  type DeliveryStartTimestamp = stdLib.Date
  type DeliveryStreamARN = java.lang.String
  type DeliveryStreamEncryptionStatus = awsDashSdkLib.awsDashSdkLibStrings.ENABLED | awsDashSdkLib.awsDashSdkLibStrings.ENABLING | awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.DISABLING | java.lang.String
  type DeliveryStreamName = java.lang.String
  type DeliveryStreamNameList = js.Array[DeliveryStreamName]
  type DeliveryStreamStatus = awsDashSdkLib.awsDashSdkLibStrings.CREATING | awsDashSdkLib.awsDashSdkLibStrings.DELETING | awsDashSdkLib.awsDashSdkLibStrings.ACTIVE | java.lang.String
  type DeliveryStreamType = awsDashSdkLib.awsDashSdkLibStrings.DirectPut | awsDashSdkLib.awsDashSdkLibStrings.KinesisStreamAsSource | java.lang.String
  type DeliveryStreamVersionId = java.lang.String
  type DescribeDeliveryStreamInputLimit = scala.Double
  type DestinationDescriptionList = js.Array[DestinationDescription]
  type DestinationId = java.lang.String
  type ElasticsearchBufferingIntervalInSeconds = scala.Double
  type ElasticsearchBufferingSizeInMBs = scala.Double
  type ElasticsearchDomainARN = java.lang.String
  type ElasticsearchIndexName = java.lang.String
  type ElasticsearchIndexRotationPeriod = awsDashSdkLib.awsDashSdkLibStrings.NoRotation | awsDashSdkLib.awsDashSdkLibStrings.OneHour | awsDashSdkLib.awsDashSdkLibStrings.OneDay | awsDashSdkLib.awsDashSdkLibStrings.OneWeek | awsDashSdkLib.awsDashSdkLibStrings.OneMonth | java.lang.String
  type ElasticsearchRetryDurationInSeconds = scala.Double
  type ElasticsearchS3BackupMode = awsDashSdkLib.awsDashSdkLibStrings.FailedDocumentsOnly | awsDashSdkLib.awsDashSdkLibStrings.AllDocuments | java.lang.String
  type ElasticsearchTypeName = java.lang.String
  type ErrorCode = java.lang.String
  type ErrorMessage = java.lang.String
  type ErrorOutputPrefix = java.lang.String
  type HECAcknowledgmentTimeoutInSeconds = scala.Double
  type HECEndpoint = java.lang.String
  type HECEndpointType = awsDashSdkLib.awsDashSdkLibStrings.Raw | awsDashSdkLib.awsDashSdkLibStrings.Event | java.lang.String
  type HECToken = java.lang.String
  type IntervalInSeconds = scala.Double
  type KinesisStreamARN = java.lang.String
  type ListDeliveryStreamsInputLimit = scala.Double
  type ListOfNonEmptyStrings = js.Array[NonEmptyString]
  type ListOfNonEmptyStringsWithoutWhitespace = js.Array[NonEmptyStringWithoutWhitespace]
  type ListTagsForDeliveryStreamInputLimit = scala.Double
  type ListTagsForDeliveryStreamOutputTagList = js.Array[Tag]
  type LogGroupName = java.lang.String
  type LogStreamName = java.lang.String
  type NoEncryptionConfig = awsDashSdkLib.awsDashSdkLibStrings.NoEncryption | java.lang.String
  type NonEmptyString = java.lang.String
  type NonEmptyStringWithoutWhitespace = java.lang.String
  type NonNegativeIntegerObject = scala.Double
  type OrcCompression = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.ZLIB | awsDashSdkLib.awsDashSdkLibStrings.SNAPPY | java.lang.String
  type OrcFormatVersion = awsDashSdkLib.awsDashSdkLibStrings.V0_11 | awsDashSdkLib.awsDashSdkLibStrings.V0_12 | java.lang.String
  type OrcRowIndexStride = scala.Double
  type OrcStripeSizeBytes = scala.Double
  type ParquetCompression = awsDashSdkLib.awsDashSdkLibStrings.UNCOMPRESSED | awsDashSdkLib.awsDashSdkLibStrings.GZIP | awsDashSdkLib.awsDashSdkLibStrings.SNAPPY | java.lang.String
  type ParquetPageSizeBytes = scala.Double
  type ParquetWriterVersion = awsDashSdkLib.awsDashSdkLibStrings.V1 | awsDashSdkLib.awsDashSdkLibStrings.V2 | java.lang.String
  type Password = java.lang.String
  type Prefix = java.lang.String
  type ProcessorList = js.Array[Processor]
  type ProcessorParameterList = js.Array[ProcessorParameter]
  type ProcessorParameterName = awsDashSdkLib.awsDashSdkLibStrings.LambdaArn | awsDashSdkLib.awsDashSdkLibStrings.NumberOfRetries | awsDashSdkLib.awsDashSdkLibStrings.RoleArn | awsDashSdkLib.awsDashSdkLibStrings.BufferSizeInMBs | awsDashSdkLib.awsDashSdkLibStrings.BufferIntervalInSeconds | java.lang.String
  type ProcessorParameterValue = java.lang.String
  type ProcessorType = awsDashSdkLib.awsDashSdkLibStrings.Lambda | java.lang.String
  type Proportion = scala.Double
  type PutRecordBatchRequestEntryList = js.Array[Record]
  type PutRecordBatchResponseEntryList = js.Array[PutRecordBatchResponseEntry]
  type PutResponseRecordId = java.lang.String
  type RedshiftRetryDurationInSeconds = scala.Double
  type RedshiftS3BackupMode = awsDashSdkLib.awsDashSdkLibStrings.Disabled | awsDashSdkLib.awsDashSdkLibStrings.Enabled | java.lang.String
  type RoleARN = java.lang.String
  type S3BackupMode = awsDashSdkLib.awsDashSdkLibStrings.Disabled | awsDashSdkLib.awsDashSdkLibStrings.Enabled | java.lang.String
  type SizeInMBs = scala.Double
  type SplunkRetryDurationInSeconds = scala.Double
  type SplunkS3BackupMode = awsDashSdkLib.awsDashSdkLibStrings.FailedEventsOnly | awsDashSdkLib.awsDashSdkLibStrings.AllEvents | java.lang.String
  type TagDeliveryStreamInputTagList = js.Array[Tag]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagValue = java.lang.String
  type Timestamp = stdLib.Date
  type Username = java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2015-08-04` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

