package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsKinesisMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.UNIFORM_SCALING
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Date
  import typings.std.Uint8Array

  type BooleanObject = Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ConsumerARN = String
  type ConsumerCountObject = Double
  type ConsumerList = js.Array[Consumer]
  type ConsumerName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - java.lang.String
  */
  type ConsumerStatus = _ConsumerStatus | String
  type Data = Buffer | Uint8Array | Blob | String
  type DescribeStreamInputLimit = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.KMS
    - java.lang.String
  */
  type EncryptionType = _EncryptionType | String
  type EnhancedMonitoringList = js.Array[EnhancedMetrics]
  type ErrorCode = String
  type ErrorMessage = String
  type GetRecordsInputLimit = Double
  type HashKey = String
  type KeyId = String
  type ListShardsInputLimit = Double
  type ListStreamConsumersInputLimit = Double
  type ListStreamsInputLimit = Double
  type ListTagsForStreamInputLimit = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IncomingBytes
    - typings.awsDashSdk.awsDashSdkStrings.IncomingRecords
    - typings.awsDashSdk.awsDashSdkStrings.OutgoingBytes
    - typings.awsDashSdk.awsDashSdkStrings.OutgoingRecords
    - typings.awsDashSdk.awsDashSdkStrings.WriteProvisionedThroughputExceeded
    - typings.awsDashSdk.awsDashSdkStrings.ReadProvisionedThroughputExceeded
    - typings.awsDashSdk.awsDashSdkStrings.IteratorAgeMilliseconds
    - typings.awsDashSdk.awsDashSdkStrings.ALL
    - java.lang.String
  */
  type MetricsName = _MetricsName | String
  type MetricsNameList = js.Array[MetricsName]
  type MillisBehindLatest = Double
  type NextToken = String
  type PartitionKey = String
  type PositiveIntegerObject = Double
  type PutRecordsRequestEntryList = js.Array[PutRecordsRequestEntry]
  type PutRecordsResultEntryList = js.Array[PutRecordsResultEntry]
  type RecordList = js.Array[Record]
  type RetentionPeriodHours = Double
  type ScalingType = UNIFORM_SCALING | String
  type SequenceNumber = String
  type ShardCountObject = Double
  type ShardId = String
  type ShardIterator = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AT_SEQUENCE_NUMBER
    - typings.awsDashSdk.awsDashSdkStrings.AFTER_SEQUENCE_NUMBER
    - typings.awsDashSdk.awsDashSdkStrings.TRIM_HORIZON
    - typings.awsDashSdk.awsDashSdkStrings.LATEST
    - typings.awsDashSdk.awsDashSdkStrings.AT_TIMESTAMP
    - java.lang.String
  */
  type ShardIteratorType = _ShardIteratorType | String
  type ShardList = js.Array[Shard]
  type StreamARN = String
  type StreamName = String
  type StreamNameList = js.Array[StreamName]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.UPDATING
    - java.lang.String
  */
  type StreamStatus = _StreamStatus | String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagMap = StringDictionary[TagValue]
  type TagValue = String
  type Timestamp = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2013-12-02`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
