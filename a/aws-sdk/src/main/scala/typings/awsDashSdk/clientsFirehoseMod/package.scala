package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsFirehoseMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.Lambda_
  import typings.awsDashSdk.awsDashSdkStrings.NoEncryption
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Date
  import typings.std.Uint8Array

  type AWSKMSKeyARN = String
  type BlockSizeBytes = Double
  type BooleanObject = Boolean
  type BucketARN = String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClusterJDBCURL = String
  type ColumnToJsonKeyMappings = StringDictionary[NonEmptyString]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.UNCOMPRESSED
    - typings.awsDashSdk.awsDashSdkStrings.GZIP
    - typings.awsDashSdk.awsDashSdkStrings.ZIP
    - typings.awsDashSdk.awsDashSdkStrings.Snappy_
    - java.lang.String
  */
  type CompressionFormat = _CompressionFormat | String
  type CopyOptions = String
  type Data = Buffer | Uint8Array | Blob | String
  type DataTableColumns = String
  type DataTableName = String
  type DeliveryStartTimestamp = Date
  type DeliveryStreamARN = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.ENABLING
    - typings.awsDashSdk.awsDashSdkStrings.ENABLING_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - typings.awsDashSdk.awsDashSdkStrings.DISABLING
    - typings.awsDashSdk.awsDashSdkStrings.DISABLING_FAILED
    - java.lang.String
  */
  type DeliveryStreamEncryptionStatus = _DeliveryStreamEncryptionStatus | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.RETIRE_KMS_GRANT_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_KMS_GRANT_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.KMS_ACCESS_DENIED
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED_KMS_KEY
    - typings.awsDashSdk.awsDashSdkStrings.INVALID_KMS_KEY
    - typings.awsDashSdk.awsDashSdkStrings.KMS_KEY_NOT_FOUND
    - typings.awsDashSdk.awsDashSdkStrings.KMS_OPT_IN_REQUIRED
    - typings.awsDashSdk.awsDashSdkStrings.UNKNOWN_ERROR
    - java.lang.String
  */
  type DeliveryStreamFailureType = _DeliveryStreamFailureType | String
  type DeliveryStreamName = String
  type DeliveryStreamNameList = js.Array[DeliveryStreamName]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.CREATING_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.DELETING_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - java.lang.String
  */
  type DeliveryStreamStatus = _DeliveryStreamStatus | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DirectPut
    - typings.awsDashSdk.awsDashSdkStrings.KinesisStreamAsSource
    - java.lang.String
  */
  type DeliveryStreamType = _DeliveryStreamType | String
  type DeliveryStreamVersionId = String
  type DescribeDeliveryStreamInputLimit = Double
  type DestinationDescriptionList = js.Array[DestinationDescription]
  type DestinationId = String
  type ElasticsearchBufferingIntervalInSeconds = Double
  type ElasticsearchBufferingSizeInMBs = Double
  type ElasticsearchClusterEndpoint = String
  type ElasticsearchDomainARN = String
  type ElasticsearchIndexName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NoRotation
    - typings.awsDashSdk.awsDashSdkStrings.OneHour
    - typings.awsDashSdk.awsDashSdkStrings.OneDay
    - typings.awsDashSdk.awsDashSdkStrings.OneWeek
    - typings.awsDashSdk.awsDashSdkStrings.OneMonth
    - java.lang.String
  */
  type ElasticsearchIndexRotationPeriod = _ElasticsearchIndexRotationPeriod | String
  type ElasticsearchRetryDurationInSeconds = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FailedDocumentsOnly
    - typings.awsDashSdk.awsDashSdkStrings.AllDocuments
    - java.lang.String
  */
  type ElasticsearchS3BackupMode = _ElasticsearchS3BackupMode | String
  type ElasticsearchTypeName = String
  type ErrorCode = String
  type ErrorMessage = String
  type ErrorOutputPrefix = String
  type HECAcknowledgmentTimeoutInSeconds = Double
  type HECEndpoint = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Raw_
    - typings.awsDashSdk.awsDashSdkStrings.Event_
    - java.lang.String
  */
  type HECEndpointType = _HECEndpointType | String
  type HECToken = String
  type IntervalInSeconds = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AWS_OWNED_CMK
    - typings.awsDashSdk.awsDashSdkStrings.CUSTOMER_MANAGED_CMK
    - java.lang.String
  */
  type KeyType = _KeyType | String
  type KinesisStreamARN = String
  type ListDeliveryStreamsInputLimit = Double
  type ListOfNonEmptyStrings = js.Array[NonEmptyString]
  type ListOfNonEmptyStringsWithoutWhitespace = js.Array[NonEmptyStringWithoutWhitespace]
  type ListTagsForDeliveryStreamInputLimit = Double
  type ListTagsForDeliveryStreamOutputTagList = js.Array[Tag]
  type LogGroupName = String
  type LogStreamName = String
  type NoEncryptionConfig = NoEncryption | String
  type NonEmptyString = String
  type NonEmptyStringWithoutWhitespace = String
  type NonNegativeIntegerObject = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.ZLIB
    - typings.awsDashSdk.awsDashSdkStrings.SNAPPY
    - java.lang.String
  */
  type OrcCompression = _OrcCompression | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.V0_11
    - typings.awsDashSdk.awsDashSdkStrings.V0_12
    - java.lang.String
  */
  type OrcFormatVersion = _OrcFormatVersion | String
  type OrcRowIndexStride = Double
  type OrcStripeSizeBytes = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.UNCOMPRESSED
    - typings.awsDashSdk.awsDashSdkStrings.GZIP
    - typings.awsDashSdk.awsDashSdkStrings.SNAPPY
    - java.lang.String
  */
  type ParquetCompression = _ParquetCompression | String
  type ParquetPageSizeBytes = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.V1
    - typings.awsDashSdk.awsDashSdkStrings.V2
    - java.lang.String
  */
  type ParquetWriterVersion = _ParquetWriterVersion | String
  type Password = String
  type Prefix = String
  type ProcessorList = js.Array[Processor]
  type ProcessorParameterList = js.Array[ProcessorParameter]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.LambdaArn
    - typings.awsDashSdk.awsDashSdkStrings.NumberOfRetries
    - typings.awsDashSdk.awsDashSdkStrings.RoleArn
    - typings.awsDashSdk.awsDashSdkStrings.BufferSizeInMBs
    - typings.awsDashSdk.awsDashSdkStrings.BufferIntervalInSeconds
    - java.lang.String
  */
  type ProcessorParameterName = _ProcessorParameterName | String
  type ProcessorParameterValue = String
  type ProcessorType = Lambda_ | String
  type Proportion = Double
  type PutRecordBatchRequestEntryList = js.Array[Record]
  type PutRecordBatchResponseEntryList = js.Array[PutRecordBatchResponseEntry]
  type PutResponseRecordId = String
  type RedshiftRetryDurationInSeconds = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Disabled_
    - typings.awsDashSdk.awsDashSdkStrings.Enabled_
    - java.lang.String
  */
  type RedshiftS3BackupMode = _RedshiftS3BackupMode | String
  type RoleARN = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Disabled_
    - typings.awsDashSdk.awsDashSdkStrings.Enabled_
    - java.lang.String
  */
  type S3BackupMode = _S3BackupMode | String
  type SizeInMBs = Double
  type SplunkRetryDurationInSeconds = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FailedEventsOnly
    - typings.awsDashSdk.awsDashSdkStrings.AllEvents
    - java.lang.String
  */
  type SplunkS3BackupMode = _SplunkS3BackupMode | String
  type TagDeliveryStreamInputTagList = js.Array[Tag]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagValue = String
  type Timestamp = Date
  type Username = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2015-08-04`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
