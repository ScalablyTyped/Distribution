package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsKinesisMod {
  type BooleanObject = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ConsumerARN = java.lang.String
  type ConsumerCountObject = scala.Double
  type ConsumerList = js.Array[Consumer]
  type ConsumerName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - java.lang.String
  */
  type ConsumerStatus = _ConsumerStatus | java.lang.String
  type Data = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  type DescribeStreamInputLimit = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - awsDashSdkLib.awsDashSdkLibStrings.KMS
    - java.lang.String
  */
  type EncryptionType = _EncryptionType | java.lang.String
  type EnhancedMonitoringList = js.Array[EnhancedMetrics]
  type ErrorCode = java.lang.String
  type ErrorMessage = java.lang.String
  type GetRecordsInputLimit = scala.Double
  type HashKey = java.lang.String
  type KeyId = java.lang.String
  type ListShardsInputLimit = scala.Double
  type ListStreamConsumersInputLimit = scala.Double
  type ListStreamsInputLimit = scala.Double
  type ListTagsForStreamInputLimit = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IncomingBytes
    - awsDashSdkLib.awsDashSdkLibStrings.IncomingRecords
    - awsDashSdkLib.awsDashSdkLibStrings.OutgoingBytes
    - awsDashSdkLib.awsDashSdkLibStrings.OutgoingRecords
    - awsDashSdkLib.awsDashSdkLibStrings.WriteProvisionedThroughputExceeded
    - awsDashSdkLib.awsDashSdkLibStrings.ReadProvisionedThroughputExceeded
    - awsDashSdkLib.awsDashSdkLibStrings.IteratorAgeMilliseconds
    - awsDashSdkLib.awsDashSdkLibStrings.ALL
    - java.lang.String
  */
  type MetricsName = _MetricsName | java.lang.String
  type MetricsNameList = js.Array[MetricsName]
  type MillisBehindLatest = scala.Double
  type NextToken = java.lang.String
  type PartitionKey = java.lang.String
  type PositiveIntegerObject = scala.Double
  type PutRecordsRequestEntryList = js.Array[PutRecordsRequestEntry]
  type PutRecordsResultEntryList = js.Array[PutRecordsResultEntry]
  type RecordList = js.Array[Record]
  type RetentionPeriodHours = scala.Double
  type ScalingType = awsDashSdkLib.awsDashSdkLibStrings.UNIFORM_SCALING | java.lang.String
  type SequenceNumber = java.lang.String
  type ShardCountObject = scala.Double
  type ShardId = java.lang.String
  type ShardIterator = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AT_SEQUENCE_NUMBER
    - awsDashSdkLib.awsDashSdkLibStrings.AFTER_SEQUENCE_NUMBER
    - awsDashSdkLib.awsDashSdkLibStrings.TRIM_HORIZON
    - awsDashSdkLib.awsDashSdkLibStrings.LATEST
    - awsDashSdkLib.awsDashSdkLibStrings.AT_TIMESTAMP
    - java.lang.String
  */
  type ShardIteratorType = _ShardIteratorType | java.lang.String
  type ShardList = js.Array[Shard]
  type StreamARN = java.lang.String
  type StreamName = java.lang.String
  type StreamNameList = js.Array[StreamName]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATING
    - java.lang.String
  */
  type StreamStatus = _StreamStatus | java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagMap = org.scalablytyped.runtime.StringDictionary[TagValue]
  type TagValue = java.lang.String
  type Timestamp = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2013-12-02`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
