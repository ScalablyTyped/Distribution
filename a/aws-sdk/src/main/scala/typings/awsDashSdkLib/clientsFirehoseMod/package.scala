package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsFirehoseMod {
  type AWSKMSKeyARN = java.lang.String
  type BlockSizeBytes = scala.Double
  type BooleanObject = scala.Boolean
  type BucketARN = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClusterJDBCURL = java.lang.String
  type ColumnToJsonKeyMappings = org.scalablytyped.runtime.StringDictionary[NonEmptyString]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.UNCOMPRESSED
    - awsDashSdkLib.awsDashSdkLibStrings.GZIP
    - awsDashSdkLib.awsDashSdkLibStrings.ZIP
    - awsDashSdkLib.awsDashSdkLibStrings.Snappy
    - java.lang.String
  */
  type CompressionFormat = _CompressionFormat | java.lang.String
  type CopyOptions = java.lang.String
  type Data = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  type DataTableColumns = java.lang.String
  type DataTableName = java.lang.String
  type DeliveryStartTimestamp = stdLib.Date
  type DeliveryStreamARN = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ENABLED
    - awsDashSdkLib.awsDashSdkLibStrings.ENABLING
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLED
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLING
    - java.lang.String
  */
  type DeliveryStreamEncryptionStatus = _DeliveryStreamEncryptionStatus | java.lang.String
  type DeliveryStreamName = java.lang.String
  type DeliveryStreamNameList = js.Array[DeliveryStreamName]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - java.lang.String
  */
  type DeliveryStreamStatus = _DeliveryStreamStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DirectPut
    - awsDashSdkLib.awsDashSdkLibStrings.KinesisStreamAsSource
    - java.lang.String
  */
  type DeliveryStreamType = _DeliveryStreamType | java.lang.String
  type DeliveryStreamVersionId = java.lang.String
  type DescribeDeliveryStreamInputLimit = scala.Double
  type DestinationDescriptionList = js.Array[DestinationDescription]
  type DestinationId = java.lang.String
  type ElasticsearchBufferingIntervalInSeconds = scala.Double
  type ElasticsearchBufferingSizeInMBs = scala.Double
  type ElasticsearchDomainARN = java.lang.String
  type ElasticsearchIndexName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NoRotation
    - awsDashSdkLib.awsDashSdkLibStrings.OneHour
    - awsDashSdkLib.awsDashSdkLibStrings.OneDay
    - awsDashSdkLib.awsDashSdkLibStrings.OneWeek
    - awsDashSdkLib.awsDashSdkLibStrings.OneMonth
    - java.lang.String
  */
  type ElasticsearchIndexRotationPeriod = _ElasticsearchIndexRotationPeriod | java.lang.String
  type ElasticsearchRetryDurationInSeconds = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.FailedDocumentsOnly
    - awsDashSdkLib.awsDashSdkLibStrings.AllDocuments
    - java.lang.String
  */
  type ElasticsearchS3BackupMode = _ElasticsearchS3BackupMode | java.lang.String
  type ElasticsearchTypeName = java.lang.String
  type ErrorCode = java.lang.String
  type ErrorMessage = java.lang.String
  type ErrorOutputPrefix = java.lang.String
  type HECAcknowledgmentTimeoutInSeconds = scala.Double
  type HECEndpoint = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Raw
    - awsDashSdkLib.awsDashSdkLibStrings.Event
    - java.lang.String
  */
  type HECEndpointType = _HECEndpointType | java.lang.String
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
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - awsDashSdkLib.awsDashSdkLibStrings.ZLIB
    - awsDashSdkLib.awsDashSdkLibStrings.SNAPPY
    - java.lang.String
  */
  type OrcCompression = _OrcCompression | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.V0_11
    - awsDashSdkLib.awsDashSdkLibStrings.V0_12
    - java.lang.String
  */
  type OrcFormatVersion = _OrcFormatVersion | java.lang.String
  type OrcRowIndexStride = scala.Double
  type OrcStripeSizeBytes = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.UNCOMPRESSED
    - awsDashSdkLib.awsDashSdkLibStrings.GZIP
    - awsDashSdkLib.awsDashSdkLibStrings.SNAPPY
    - java.lang.String
  */
  type ParquetCompression = _ParquetCompression | java.lang.String
  type ParquetPageSizeBytes = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.V1
    - awsDashSdkLib.awsDashSdkLibStrings.V2
    - java.lang.String
  */
  type ParquetWriterVersion = _ParquetWriterVersion | java.lang.String
  type Password = java.lang.String
  type Prefix = java.lang.String
  type ProcessorList = js.Array[Processor]
  type ProcessorParameterList = js.Array[ProcessorParameter]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.LambdaArn
    - awsDashSdkLib.awsDashSdkLibStrings.NumberOfRetries
    - awsDashSdkLib.awsDashSdkLibStrings.RoleArn
    - awsDashSdkLib.awsDashSdkLibStrings.BufferSizeInMBs
    - awsDashSdkLib.awsDashSdkLibStrings.BufferIntervalInSeconds
    - java.lang.String
  */
  type ProcessorParameterName = _ProcessorParameterName | java.lang.String
  type ProcessorParameterValue = java.lang.String
  type ProcessorType = awsDashSdkLib.awsDashSdkLibStrings.Lambda | java.lang.String
  type Proportion = scala.Double
  type PutRecordBatchRequestEntryList = js.Array[Record]
  type PutRecordBatchResponseEntryList = js.Array[PutRecordBatchResponseEntry]
  type PutResponseRecordId = java.lang.String
  type RedshiftRetryDurationInSeconds = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Disabled
    - awsDashSdkLib.awsDashSdkLibStrings.Enabled
    - java.lang.String
  */
  type RedshiftS3BackupMode = _RedshiftS3BackupMode | java.lang.String
  type RoleARN = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Disabled
    - awsDashSdkLib.awsDashSdkLibStrings.Enabled
    - java.lang.String
  */
  type S3BackupMode = _S3BackupMode | java.lang.String
  type SizeInMBs = scala.Double
  type SplunkRetryDurationInSeconds = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.FailedEventsOnly
    - awsDashSdkLib.awsDashSdkLibStrings.AllEvents
    - java.lang.String
  */
  type SplunkS3BackupMode = _SplunkS3BackupMode | java.lang.String
  type TagDeliveryStreamInputTagList = js.Array[Tag]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagValue = java.lang.String
  type Timestamp = stdLib.Date
  type Username = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2015-08-04`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
