package typings
package awsDashSdkLib.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/kinesis", "Kinesis")
@js.native
object KinesisNs extends js.Object {
  trait AddTagsToStreamInput extends js.Object {
    /**
      * The name of the stream.
      */
    var StreamName: StreamName
    /**
      * A set of up to 10 key-value pairs to use to create the tags.
      */
    var Tags: TagMap
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait Consumer extends js.Object {
    /**
      * When you register a consumer, Kinesis Data Streams generates an ARN for it. You need this ARN to be able to call SubscribeToShard. If you delete a consumer and then create a new one with the same name, it won't have the same ARN. That's because consumer ARNs contain the creation timestamp. This is important to keep in mind if you have IAM policies that reference consumer ARNs.
      */
    var ConsumerARN: ConsumerARN
    /**
      * 
      */
    var ConsumerCreationTimestamp: Timestamp
    /**
      * The name of the consumer is something you choose when you register the consumer.
      */
    var ConsumerName: ConsumerName
    /**
      * A consumer can't read data while in the CREATING or DELETING states.
      */
    var ConsumerStatus: ConsumerStatus
  }
  
  trait ConsumerDescription extends js.Object {
    /**
      * When you register a consumer, Kinesis Data Streams generates an ARN for it. You need this ARN to be able to call SubscribeToShard. If you delete a consumer and then create a new one with the same name, it won't have the same ARN. That's because consumer ARNs contain the creation timestamp. This is important to keep in mind if you have IAM policies that reference consumer ARNs.
      */
    var ConsumerARN: ConsumerARN
    /**
      * 
      */
    var ConsumerCreationTimestamp: Timestamp
    /**
      * The name of the consumer is something you choose when you register the consumer.
      */
    var ConsumerName: ConsumerName
    /**
      * A consumer can't read data while in the CREATING or DELETING states.
      */
    var ConsumerStatus: ConsumerStatus
    /**
      * The ARN of the stream with which you registered the consumer.
      */
    var StreamARN: StreamARN
  }
  
  trait CreateStreamInput extends js.Object {
    /**
      * The number of shards that the stream will use. The throughput of the stream is a function of the number of shards; more shards are required for greater provisioned throughput. DefaultShardLimit;
      */
    var ShardCount: PositiveIntegerObject
    /**
      * A name to identify the stream. The stream name is scoped to the AWS account used by the application that creates the stream. It is also scoped by AWS Region. That is, two streams in two different AWS accounts can have the same name. Two streams in the same AWS account but in two different Regions can also have the same name.
      */
    var StreamName: StreamName
  }
  
  trait DecreaseStreamRetentionPeriodInput extends js.Object {
    /**
      * The new retention period of the stream, in hours. Must be less than the current retention period.
      */
    var RetentionPeriodHours: RetentionPeriodHours
    /**
      * The name of the stream to modify.
      */
    var StreamName: StreamName
  }
  
  trait DeleteStreamInput extends js.Object {
    /**
      * If this parameter is unset (null) or if you set it to false, and the stream has registered consumers, the call to DeleteStream fails with a ResourceInUseException. 
      */
    var EnforceConsumerDeletion: js.UndefOr[BooleanObject] = js.undefined
    /**
      * The name of the stream to delete.
      */
    var StreamName: StreamName
  }
  
  trait DeregisterStreamConsumerInput extends js.Object {
    /**
      * The ARN returned by Kinesis Data Streams when you registered the consumer. If you don't know the ARN of the consumer that you want to deregister, you can use the ListStreamConsumers operation to get a list of the descriptions of all the consumers that are currently registered with a given data stream. The description of a consumer contains its ARN.
      */
    var ConsumerARN: js.UndefOr[ConsumerARN] = js.undefined
    /**
      * The name that you gave to the consumer.
      */
    var ConsumerName: js.UndefOr[ConsumerName] = js.undefined
    /**
      * The ARN of the Kinesis data stream that the consumer is registered with. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
      */
    var StreamARN: js.UndefOr[StreamARN] = js.undefined
  }
  
  trait DescribeLimitsInput extends js.Object
  
  trait DescribeLimitsOutput extends js.Object {
    /**
      * The number of open shards.
      */
    var OpenShardCount: ShardCountObject
    /**
      * The maximum number of shards.
      */
    var ShardLimit: ShardCountObject
  }
  
  trait DescribeStreamConsumerInput extends js.Object {
    /**
      * The ARN returned by Kinesis Data Streams when you registered the consumer.
      */
    var ConsumerARN: js.UndefOr[ConsumerARN] = js.undefined
    /**
      * The name that you gave to the consumer.
      */
    var ConsumerName: js.UndefOr[ConsumerName] = js.undefined
    /**
      * The ARN of the Kinesis data stream that the consumer is registered with. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
      */
    var StreamARN: js.UndefOr[StreamARN] = js.undefined
  }
  
  trait DescribeStreamConsumerOutput extends js.Object {
    /**
      * An object that represents the details of the consumer.
      */
    var ConsumerDescription: ConsumerDescription
  }
  
  trait DescribeStreamInput extends js.Object {
    /**
      * The shard ID of the shard to start with.
      */
    var ExclusiveStartShardId: js.UndefOr[ShardId] = js.undefined
    /**
      * The maximum number of shards to return in a single call. The default value is 100. If you specify a value greater than 100, at most 100 shards are returned.
      */
    var Limit: js.UndefOr[DescribeStreamInputLimit] = js.undefined
    /**
      * The name of the stream to describe.
      */
    var StreamName: StreamName
  }
  
  trait DescribeStreamOutput extends js.Object {
    /**
      * The current status of the stream, the stream Amazon Resource Name (ARN), an array of shard objects that comprise the stream, and whether there are more shards available.
      */
    var StreamDescription: StreamDescription
  }
  
  trait DescribeStreamSummaryInput extends js.Object {
    /**
      * The name of the stream to describe.
      */
    var StreamName: StreamName
  }
  
  trait DescribeStreamSummaryOutput extends js.Object {
    /**
      * A StreamDescriptionSummary containing information about the stream.
      */
    var StreamDescriptionSummary: StreamDescriptionSummary
  }
  
  trait DisableEnhancedMonitoringInput extends js.Object {
    /**
      * List of shard-level metrics to disable. The following are the valid shard-level metrics. The value "ALL" disables every metric.    IncomingBytes     IncomingRecords     OutgoingBytes     OutgoingRecords     WriteProvisionedThroughputExceeded     ReadProvisionedThroughputExceeded     IteratorAgeMilliseconds     ALL    For more information, see Monitoring the Amazon Kinesis Data Streams Service with Amazon CloudWatch in the Amazon Kinesis Data Streams Developer Guide.
      */
    var ShardLevelMetrics: MetricsNameList
    /**
      * The name of the Kinesis data stream for which to disable enhanced monitoring.
      */
    var StreamName: StreamName
  }
  
  trait EnableEnhancedMonitoringInput extends js.Object {
    /**
      * List of shard-level metrics to enable. The following are the valid shard-level metrics. The value "ALL" enables every metric.    IncomingBytes     IncomingRecords     OutgoingBytes     OutgoingRecords     WriteProvisionedThroughputExceeded     ReadProvisionedThroughputExceeded     IteratorAgeMilliseconds     ALL    For more information, see Monitoring the Amazon Kinesis Data Streams Service with Amazon CloudWatch in the Amazon Kinesis Data Streams Developer Guide.
      */
    var ShardLevelMetrics: MetricsNameList
    /**
      * The name of the stream for which to enable enhanced monitoring.
      */
    var StreamName: StreamName
  }
  
  trait EnhancedMetrics extends js.Object {
    /**
      * List of shard-level metrics. The following are the valid shard-level metrics. The value "ALL" enhances every metric.    IncomingBytes     IncomingRecords     OutgoingBytes     OutgoingRecords     WriteProvisionedThroughputExceeded     ReadProvisionedThroughputExceeded     IteratorAgeMilliseconds     ALL    For more information, see Monitoring the Amazon Kinesis Data Streams Service with Amazon CloudWatch in the Amazon Kinesis Data Streams Developer Guide.
      */
    var ShardLevelMetrics: js.UndefOr[MetricsNameList] = js.undefined
  }
  
  trait EnhancedMonitoringOutput extends js.Object {
    /**
      * Represents the current state of the metrics that are in the enhanced state before the operation.
      */
    var CurrentShardLevelMetrics: js.UndefOr[MetricsNameList] = js.undefined
    /**
      * Represents the list of all the metrics that would be in the enhanced state after the operation.
      */
    var DesiredShardLevelMetrics: js.UndefOr[MetricsNameList] = js.undefined
    /**
      * The name of the Kinesis data stream.
      */
    var StreamName: js.UndefOr[StreamName] = js.undefined
  }
  
  trait GetRecordsInput extends js.Object {
    /**
      * The maximum number of records to return. Specify a value of up to 10,000. If you specify a value that is greater than 10,000, GetRecords throws InvalidArgumentException.
      */
    var Limit: js.UndefOr[GetRecordsInputLimit] = js.undefined
    /**
      * The position in the shard from which you want to start sequentially reading data records. A shard iterator specifies this position using the sequence number of a data record in the shard.
      */
    var ShardIterator: ShardIterator
  }
  
  trait GetRecordsOutput extends js.Object {
    /**
      * The number of milliseconds the GetRecords response is from the tip of the stream, indicating how far behind current time the consumer is. A value of zero indicates that record processing is caught up, and there are no new records to process at this moment.
      */
    var MillisBehindLatest: js.UndefOr[MillisBehindLatest] = js.undefined
    /**
      * The next position in the shard from which to start sequentially reading data records. If set to null, the shard has been closed and the requested iterator does not return any more data. 
      */
    var NextShardIterator: js.UndefOr[ShardIterator] = js.undefined
    /**
      * The data records retrieved from the shard.
      */
    var Records: RecordList
  }
  
  trait GetShardIteratorInput extends js.Object {
    /**
      * The shard ID of the Kinesis Data Streams shard to get the iterator for.
      */
    var ShardId: ShardId
    /**
      * Determines how the shard iterator is used to start reading data records from the shard. The following are the valid Amazon Kinesis shard iterator types:   AT_SEQUENCE_NUMBER - Start reading from the position denoted by a specific sequence number, provided in the value StartingSequenceNumber.   AFTER_SEQUENCE_NUMBER - Start reading right after the position denoted by a specific sequence number, provided in the value StartingSequenceNumber.   AT_TIMESTAMP - Start reading from the position denoted by a specific time stamp, provided in the value Timestamp.   TRIM_HORIZON - Start reading at the last untrimmed record in the shard in the system, which is the oldest data record in the shard.   LATEST - Start reading just after the most recent record in the shard, so that you always read the most recent data in the shard.  
      */
    var ShardIteratorType: ShardIteratorType
    /**
      * The sequence number of the data record in the shard from which to start reading. Used with shard iterator type AT_SEQUENCE_NUMBER and AFTER_SEQUENCE_NUMBER.
      */
    var StartingSequenceNumber: js.UndefOr[SequenceNumber] = js.undefined
    /**
      * The name of the Amazon Kinesis data stream.
      */
    var StreamName: StreamName
    /**
      * The time stamp of the data record from which to start reading. Used with shard iterator type AT_TIMESTAMP. A time stamp is the Unix epoch date with precision in milliseconds. For example, 2016-04-04T19:58:46.480-00:00 or 1459799926.480. If a record with this exact time stamp does not exist, the iterator returned is for the next (later) record. If the time stamp is older than the current trim horizon, the iterator returned is for the oldest untrimmed data record (TRIM_HORIZON).
      */
    var Timestamp: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait GetShardIteratorOutput extends js.Object {
    /**
      * The position in the shard from which to start reading data records sequentially. A shard iterator specifies this position using the sequence number of a data record in a shard.
      */
    var ShardIterator: js.UndefOr[ShardIterator] = js.undefined
  }
  
  trait HashKeyRange extends js.Object {
    /**
      * The ending hash key of the hash key range.
      */
    var EndingHashKey: HashKey
    /**
      * The starting hash key of the hash key range.
      */
    var StartingHashKey: HashKey
  }
  
  trait IncreaseStreamRetentionPeriodInput extends js.Object {
    /**
      * The new retention period of the stream, in hours. Must be more than the current retention period.
      */
    var RetentionPeriodHours: RetentionPeriodHours
    /**
      * The name of the stream to modify.
      */
    var StreamName: StreamName
  }
  
  trait ListShardsInput extends js.Object {
    /**
      * Specify this parameter to indicate that you want to list the shards starting with the shard whose ID immediately follows ExclusiveStartShardId. If you don't specify this parameter, the default behavior is for ListShards to list the shards starting with the first one in the stream. You cannot specify this parameter if you specify NextToken.
      */
    var ExclusiveStartShardId: js.UndefOr[ShardId] = js.undefined
    /**
      * The maximum number of shards to return in a single call to ListShards. The minimum value you can specify for this parameter is 1, and the maximum is 1,000, which is also the default. When the number of shards to be listed is greater than the value of MaxResults, the response contains a NextToken value that you can use in a subsequent call to ListShards to list the next set of shards.
      */
    var MaxResults: js.UndefOr[ListShardsInputLimit] = js.undefined
    /**
      * When the number of shards in the data stream is greater than the default value for the MaxResults parameter, or if you explicitly specify a value for MaxResults that is less than the number of shards in the data stream, the response includes a pagination token named NextToken. You can specify this NextToken value in a subsequent call to ListShards to list the next set of shards. Don't specify StreamName or StreamCreationTimestamp if you specify NextToken because the latter unambiguously identifies the stream. You can optionally specify a value for the MaxResults parameter when you specify NextToken. If you specify a MaxResults value that is less than the number of shards that the operation returns if you don't specify MaxResults, the response will contain a new NextToken value. You can use the new NextToken value in a subsequent call to the ListShards operation.  Tokens expire after 300 seconds. When you obtain a value for NextToken in the response to a call to ListShards, you have 300 seconds to use that value. If you specify an expired token in a call to ListShards, you get ExpiredNextTokenException. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Specify this input parameter to distinguish data streams that have the same name. For example, if you create a data stream and then delete it, and you later create another data stream with the same name, you can use this input parameter to specify which of the two streams you want to list the shards for. You cannot specify this parameter if you specify the NextToken parameter.
      */
    var StreamCreationTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
      * The name of the data stream whose shards you want to list.  You cannot specify this parameter if you specify the NextToken parameter.
      */
    var StreamName: js.UndefOr[StreamName] = js.undefined
  }
  
  trait ListShardsOutput extends js.Object {
    /**
      * When the number of shards in the data stream is greater than the default value for the MaxResults parameter, or if you explicitly specify a value for MaxResults that is less than the number of shards in the data stream, the response includes a pagination token named NextToken. You can specify this NextToken value in a subsequent call to ListShards to list the next set of shards. For more information about the use of this pagination token when calling the ListShards operation, see ListShardsInput$NextToken.  Tokens expire after 300 seconds. When you obtain a value for NextToken in the response to a call to ListShards, you have 300 seconds to use that value. If you specify an expired token in a call to ListShards, you get ExpiredNextTokenException. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * An array of JSON objects. Each object represents one shard and specifies the IDs of the shard, the shard's parent, and the shard that's adjacent to the shard's parent. Each object also contains the starting and ending hash keys and the starting and ending sequence numbers for the shard.
      */
    var Shards: js.UndefOr[ShardList] = js.undefined
  }
  
  trait ListStreamConsumersInput extends js.Object {
    /**
      * The maximum number of consumers that you want a single call of ListStreamConsumers to return.
      */
    var MaxResults: js.UndefOr[ListStreamConsumersInputLimit] = js.undefined
    /**
      * When the number of consumers that are registered with the data stream is greater than the default value for the MaxResults parameter, or if you explicitly specify a value for MaxResults that is less than the number of consumers that are registered with the data stream, the response includes a pagination token named NextToken. You can specify this NextToken value in a subsequent call to ListStreamConsumers to list the next set of registered consumers. Don't specify StreamName or StreamCreationTimestamp if you specify NextToken because the latter unambiguously identifies the stream. You can optionally specify a value for the MaxResults parameter when you specify NextToken. If you specify a MaxResults value that is less than the number of consumers that the operation returns if you don't specify MaxResults, the response will contain a new NextToken value. You can use the new NextToken value in a subsequent call to the ListStreamConsumers operation to list the next set of consumers.  Tokens expire after 300 seconds. When you obtain a value for NextToken in the response to a call to ListStreamConsumers, you have 300 seconds to use that value. If you specify an expired token in a call to ListStreamConsumers, you get ExpiredNextTokenException. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The ARN of the Kinesis data stream for which you want to list the registered consumers. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
      */
    var StreamARN: StreamARN
    /**
      * Specify this input parameter to distinguish data streams that have the same name. For example, if you create a data stream and then delete it, and you later create another data stream with the same name, you can use this input parameter to specify which of the two streams you want to list the consumers for.  You can't specify this parameter if you specify the NextToken parameter. 
      */
    var StreamCreationTimestamp: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait ListStreamConsumersOutput extends js.Object {
    /**
      * An array of JSON objects. Each object represents one registered consumer.
      */
    var Consumers: js.UndefOr[ConsumerList] = js.undefined
    /**
      * When the number of consumers that are registered with the data stream is greater than the default value for the MaxResults parameter, or if you explicitly specify a value for MaxResults that is less than the number of registered consumers, the response includes a pagination token named NextToken. You can specify this NextToken value in a subsequent call to ListStreamConsumers to list the next set of registered consumers. For more information about the use of this pagination token when calling the ListStreamConsumers operation, see ListStreamConsumersInput$NextToken.  Tokens expire after 300 seconds. When you obtain a value for NextToken in the response to a call to ListStreamConsumers, you have 300 seconds to use that value. If you specify an expired token in a call to ListStreamConsumers, you get ExpiredNextTokenException. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListStreamsInput extends js.Object {
    /**
      * The name of the stream to start the list with.
      */
    var ExclusiveStartStreamName: js.UndefOr[StreamName] = js.undefined
    /**
      * The maximum number of streams to list.
      */
    var Limit: js.UndefOr[ListStreamsInputLimit] = js.undefined
  }
  
  trait ListStreamsOutput extends js.Object {
    /**
      * If set to true, there are more streams available to list.
      */
    var HasMoreStreams: BooleanObject
    /**
      * The names of the streams that are associated with the AWS account making the ListStreams request.
      */
    var StreamNames: StreamNameList
  }
  
  trait ListTagsForStreamInput extends js.Object {
    /**
      * The key to use as the starting point for the list of tags. If this parameter is set, ListTagsForStream gets all tags that occur after ExclusiveStartTagKey. 
      */
    var ExclusiveStartTagKey: js.UndefOr[TagKey] = js.undefined
    /**
      * The number of tags to return. If this number is less than the total number of tags associated with the stream, HasMoreTags is set to true. To list additional tags, set ExclusiveStartTagKey to the last key in the response.
      */
    var Limit: js.UndefOr[ListTagsForStreamInputLimit] = js.undefined
    /**
      * The name of the stream.
      */
    var StreamName: StreamName
  }
  
  trait ListTagsForStreamOutput extends js.Object {
    /**
      * If set to true, more tags are available. To request additional tags, set ExclusiveStartTagKey to the key of the last tag returned.
      */
    var HasMoreTags: BooleanObject
    /**
      * A list of tags associated with StreamName, starting with the first tag after ExclusiveStartTagKey and up to the specified Limit. 
      */
    var Tags: TagList
  }
  
  trait MergeShardsInput extends js.Object {
    /**
      * The shard ID of the adjacent shard for the merge.
      */
    var AdjacentShardToMerge: ShardId
    /**
      * The shard ID of the shard to combine with the adjacent shard for the merge.
      */
    var ShardToMerge: ShardId
    /**
      * The name of the stream for the merge.
      */
    var StreamName: StreamName
  }
  
  trait PutRecordInput extends js.Object {
    /**
      * The data blob to put into the record, which is base64-encoded when the blob is serialized. When the data blob (the payload before base64-encoding) is added to the partition key size, the total size must not exceed the maximum record size (1 MB).
      */
    var Data: Data
    /**
      * The hash value used to explicitly determine the shard the data record is assigned to by overriding the partition key hash.
      */
    var ExplicitHashKey: js.UndefOr[HashKey] = js.undefined
    /**
      * Determines which shard in the stream the data record is assigned to. Partition keys are Unicode strings with a maximum length limit of 256 characters for each key. Amazon Kinesis Data Streams uses the partition key as input to a hash function that maps the partition key and associated data to a specific shard. Specifically, an MD5 hash function is used to map partition keys to 128-bit integer values and to map associated data records to shards. As a result of this hashing mechanism, all data records with the same partition key map to the same shard within the stream.
      */
    var PartitionKey: PartitionKey
    /**
      * Guarantees strictly increasing sequence numbers, for puts from the same client and to the same partition key. Usage: set the SequenceNumberForOrdering of record n to the sequence number of record n-1 (as returned in the result when putting record n-1). If this parameter is not set, records are coarsely ordered based on arrival time.
      */
    var SequenceNumberForOrdering: js.UndefOr[SequenceNumber] = js.undefined
    /**
      * The name of the stream to put the data record into.
      */
    var StreamName: StreamName
  }
  
  trait PutRecordOutput extends js.Object {
    /**
      * The encryption type to use on the record. This parameter can be one of the following values:    NONE: Do not encrypt the records in the stream.    KMS: Use server-side encryption on the records in the stream using a customer-managed AWS KMS key.  
      */
    var EncryptionType: js.UndefOr[EncryptionType] = js.undefined
    /**
      * The sequence number identifier that was assigned to the put data record. The sequence number for the record is unique across all records in the stream. A sequence number is the identifier associated with every record put into the stream.
      */
    var SequenceNumber: SequenceNumber
    /**
      * The shard ID of the shard where the data record was placed.
      */
    var ShardId: ShardId
  }
  
  trait PutRecordsInput extends js.Object {
    /**
      * The records associated with the request.
      */
    var Records: PutRecordsRequestEntryList
    /**
      * The stream name associated with the request.
      */
    var StreamName: StreamName
  }
  
  trait PutRecordsOutput extends js.Object {
    /**
      * The encryption type used on the records. This parameter can be one of the following values:    NONE: Do not encrypt the records.    KMS: Use server-side encryption on the records using a customer-managed AWS KMS key.  
      */
    var EncryptionType: js.UndefOr[EncryptionType] = js.undefined
    /**
      * The number of unsuccessfully processed records in a PutRecords request.
      */
    var FailedRecordCount: js.UndefOr[PositiveIntegerObject] = js.undefined
    /**
      * An array of successfully and unsuccessfully processed record results, correlated with the request by natural ordering. A record that is successfully added to a stream includes SequenceNumber and ShardId in the result. A record that fails to be added to a stream includes ErrorCode and ErrorMessage in the result.
      */
    var Records: PutRecordsResultEntryList
  }
  
  trait PutRecordsRequestEntry extends js.Object {
    /**
      * The data blob to put into the record, which is base64-encoded when the blob is serialized. When the data blob (the payload before base64-encoding) is added to the partition key size, the total size must not exceed the maximum record size (1 MB).
      */
    var Data: Data
    /**
      * The hash value used to determine explicitly the shard that the data record is assigned to by overriding the partition key hash.
      */
    var ExplicitHashKey: js.UndefOr[HashKey] = js.undefined
    /**
      * Determines which shard in the stream the data record is assigned to. Partition keys are Unicode strings with a maximum length limit of 256 characters for each key. Amazon Kinesis Data Streams uses the partition key as input to a hash function that maps the partition key and associated data to a specific shard. Specifically, an MD5 hash function is used to map partition keys to 128-bit integer values and to map associated data records to shards. As a result of this hashing mechanism, all data records with the same partition key map to the same shard within the stream.
      */
    var PartitionKey: PartitionKey
  }
  
  trait PutRecordsResultEntry extends js.Object {
    /**
      * The error code for an individual record result. ErrorCodes can be either ProvisionedThroughputExceededException or InternalFailure.
      */
    var ErrorCode: js.UndefOr[ErrorCode] = js.undefined
    /**
      * The error message for an individual record result. An ErrorCode value of ProvisionedThroughputExceededException has an error message that includes the account ID, stream name, and shard ID. An ErrorCode value of InternalFailure has the error message "Internal Service Failure".
      */
    var ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined
    /**
      * The sequence number for an individual record result.
      */
    var SequenceNumber: js.UndefOr[SequenceNumber] = js.undefined
    /**
      * The shard ID for an individual record result.
      */
    var ShardId: js.UndefOr[ShardId] = js.undefined
  }
  
  trait Record extends js.Object {
    /**
      * The approximate time that the record was inserted into the stream.
      */
    var ApproximateArrivalTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
      * The data blob. The data in the blob is both opaque and immutable to Kinesis Data Streams, which does not inspect, interpret, or change the data in the blob in any way. When the data blob (the payload before base64-encoding) is added to the partition key size, the total size must not exceed the maximum record size (1 MB).
      */
    var Data: Data
    /**
      * The encryption type used on the record. This parameter can be one of the following values:    NONE: Do not encrypt the records in the stream.    KMS: Use server-side encryption on the records in the stream using a customer-managed AWS KMS key.  
      */
    var EncryptionType: js.UndefOr[EncryptionType] = js.undefined
    /**
      * Identifies which shard in the stream the data record is assigned to.
      */
    var PartitionKey: PartitionKey
    /**
      * The unique identifier of the record within its shard.
      */
    var SequenceNumber: SequenceNumber
  }
  
  trait RegisterStreamConsumerInput extends js.Object {
    /**
      * For a given Kinesis data stream, each consumer must have a unique name. However, consumer names don't have to be unique across data streams.
      */
    var ConsumerName: ConsumerName
    /**
      * The ARN of the Kinesis data stream that you want to register the consumer with. For more info, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
      */
    var StreamARN: StreamARN
  }
  
  trait RegisterStreamConsumerOutput extends js.Object {
    /**
      * An object that represents the details of the consumer you registered. When you register a consumer, it gets an ARN that is generated by Kinesis Data Streams.
      */
    var Consumer: Consumer
  }
  
  trait RemoveTagsFromStreamInput extends js.Object {
    /**
      * The name of the stream.
      */
    var StreamName: StreamName
    /**
      * A list of tag keys. Each corresponding tag is removed from the stream.
      */
    var TagKeys: TagKeyList
  }
  
  trait SequenceNumberRange extends js.Object {
    /**
      * The ending sequence number for the range. Shards that are in the OPEN state have an ending sequence number of null.
      */
    var EndingSequenceNumber: js.UndefOr[SequenceNumber] = js.undefined
    /**
      * The starting sequence number for the range.
      */
    var StartingSequenceNumber: SequenceNumber
  }
  
  trait Shard extends js.Object {
    /**
      * The shard ID of the shard adjacent to the shard's parent.
      */
    var AdjacentParentShardId: js.UndefOr[ShardId] = js.undefined
    /**
      * The range of possible hash key values for the shard, which is a set of ordered contiguous positive integers.
      */
    var HashKeyRange: HashKeyRange
    /**
      * The shard ID of the shard's parent.
      */
    var ParentShardId: js.UndefOr[ShardId] = js.undefined
    /**
      * The range of possible sequence numbers for the shard.
      */
    var SequenceNumberRange: SequenceNumberRange
    /**
      * The unique identifier of the shard within the stream.
      */
    var ShardId: ShardId
  }
  
  trait SplitShardInput extends js.Object {
    /**
      * A hash key value for the starting hash key of one of the child shards created by the split. The hash key range for a given shard constitutes a set of ordered contiguous positive integers. The value for NewStartingHashKey must be in the range of hash keys being mapped into the shard. The NewStartingHashKey hash key value and all higher hash key values in hash key range are distributed to one of the child shards. All the lower hash key values in the range are distributed to the other child shard.
      */
    var NewStartingHashKey: HashKey
    /**
      * The shard ID of the shard to split.
      */
    var ShardToSplit: ShardId
    /**
      * The name of the stream for the shard split.
      */
    var StreamName: StreamName
  }
  
  trait StartStreamEncryptionInput extends js.Object {
    /**
      * The encryption type to use. The only valid value is KMS.
      */
    var EncryptionType: EncryptionType
    /**
      * The GUID for the customer-managed AWS KMS key to use for encryption. This value can be a globally unique identifier, a fully specified Amazon Resource Name (ARN) to either an alias or a key, or an alias name prefixed by "alias/".You can also use a master key owned by Kinesis Data Streams by specifying the alias aws/kinesis.   Key ARN example: arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012    Alias ARN example: arn:aws:kms:us-east-1:123456789012:alias/MyAliasName    Globally unique key ID example: 12345678-1234-1234-1234-123456789012    Alias name example: alias/MyAliasName    Master key owned by Kinesis Data Streams: alias/aws/kinesis   
      */
    var KeyId: KeyId
    /**
      * The name of the stream for which to start encrypting records.
      */
    var StreamName: StreamName
  }
  
  trait StopStreamEncryptionInput extends js.Object {
    /**
      * The encryption type. The only valid value is KMS.
      */
    var EncryptionType: EncryptionType
    /**
      * The GUID for the customer-managed AWS KMS key to use for encryption. This value can be a globally unique identifier, a fully specified Amazon Resource Name (ARN) to either an alias or a key, or an alias name prefixed by "alias/".You can also use a master key owned by Kinesis Data Streams by specifying the alias aws/kinesis.   Key ARN example: arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012    Alias ARN example: arn:aws:kms:us-east-1:123456789012:alias/MyAliasName    Globally unique key ID example: 12345678-1234-1234-1234-123456789012    Alias name example: alias/MyAliasName    Master key owned by Kinesis Data Streams: alias/aws/kinesis   
      */
    var KeyId: KeyId
    /**
      * The name of the stream on which to stop encrypting records.
      */
    var StreamName: StreamName
  }
  
  trait StreamDescription extends js.Object {
    /**
      * The server-side encryption type used on the stream. This parameter can be one of the following values:    NONE: Do not encrypt the records in the stream.    KMS: Use server-side encryption on the records in the stream using a customer-managed AWS KMS key.  
      */
    var EncryptionType: js.UndefOr[EncryptionType] = js.undefined
    /**
      * Represents the current enhanced monitoring settings of the stream.
      */
    var EnhancedMonitoring: EnhancedMonitoringList
    /**
      * If set to true, more shards in the stream are available to describe.
      */
    var HasMoreShards: BooleanObject
    /**
      * The GUID for the customer-managed AWS KMS key to use for encryption. This value can be a globally unique identifier, a fully specified ARN to either an alias or a key, or an alias name prefixed by "alias/".You can also use a master key owned by Kinesis Data Streams by specifying the alias aws/kinesis.   Key ARN example: arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012    Alias ARN example: arn:aws:kms:us-east-1:123456789012:alias/MyAliasName    Globally unique key ID example: 12345678-1234-1234-1234-123456789012    Alias name example: alias/MyAliasName    Master key owned by Kinesis Data Streams: alias/aws/kinesis   
      */
    var KeyId: js.UndefOr[KeyId] = js.undefined
    /**
      * The current retention period, in hours.
      */
    var RetentionPeriodHours: RetentionPeriodHours
    /**
      * The shards that comprise the stream.
      */
    var Shards: ShardList
    /**
      * The Amazon Resource Name (ARN) for the stream being described.
      */
    var StreamARN: StreamARN
    /**
      * The approximate time that the stream was created.
      */
    var StreamCreationTimestamp: Timestamp
    /**
      * The name of the stream being described.
      */
    var StreamName: StreamName
    /**
      * The current status of the stream being described. The stream status is one of the following states:    CREATING - The stream is being created. Kinesis Data Streams immediately returns and sets StreamStatus to CREATING.    DELETING - The stream is being deleted. The specified stream is in the DELETING state until Kinesis Data Streams completes the deletion.    ACTIVE - The stream exists and is ready for read and write operations or deletion. You should perform read and write operations only on an ACTIVE stream.    UPDATING - Shards in the stream are being merged or split. Read and write operations continue to work while the stream is in the UPDATING state.  
      */
    var StreamStatus: StreamStatus
  }
  
  trait StreamDescriptionSummary extends js.Object {
    /**
      * The number of enhanced fan-out consumers registered with the stream.
      */
    var ConsumerCount: js.UndefOr[ConsumerCountObject] = js.undefined
    /**
      * The encryption type used. This value is one of the following:    KMS     NONE   
      */
    var EncryptionType: js.UndefOr[EncryptionType] = js.undefined
    /**
      * Represents the current enhanced monitoring settings of the stream.
      */
    var EnhancedMonitoring: EnhancedMonitoringList
    /**
      * The GUID for the customer-managed AWS KMS key to use for encryption. This value can be a globally unique identifier, a fully specified ARN to either an alias or a key, or an alias name prefixed by "alias/".You can also use a master key owned by Kinesis Data Streams by specifying the alias aws/kinesis.   Key ARN example: arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012    Alias ARN example:  arn:aws:kms:us-east-1:123456789012:alias/MyAliasName    Globally unique key ID example: 12345678-1234-1234-1234-123456789012    Alias name example: alias/MyAliasName    Master key owned by Kinesis Data Streams: alias/aws/kinesis   
      */
    var KeyId: js.UndefOr[KeyId] = js.undefined
    /**
      * The number of open shards in the stream.
      */
    var OpenShardCount: ShardCountObject
    /**
      * The current retention period, in hours.
      */
    var RetentionPeriodHours: PositiveIntegerObject
    /**
      * The Amazon Resource Name (ARN) for the stream being described.
      */
    var StreamARN: StreamARN
    /**
      * The approximate time that the stream was created.
      */
    var StreamCreationTimestamp: Timestamp
    /**
      * The name of the stream being described.
      */
    var StreamName: StreamName
    /**
      * The current status of the stream being described. The stream status is one of the following states:    CREATING - The stream is being created. Kinesis Data Streams immediately returns and sets StreamStatus to CREATING.    DELETING - The stream is being deleted. The specified stream is in the DELETING state until Kinesis Data Streams completes the deletion.    ACTIVE - The stream exists and is ready for read and write operations or deletion. You should perform read and write operations only on an ACTIVE stream.    UPDATING - Shards in the stream are being merged or split. Read and write operations continue to work while the stream is in the UPDATING state.  
      */
    var StreamStatus: StreamStatus
  }
  
  trait Tag extends js.Object {
    /**
      * A unique identifier for the tag. Maximum length: 128 characters. Valid characters: Unicode letters, digits, white space, _ . / = + - % @
      */
    var Key: TagKey
    /**
      * An optional string, typically used to describe or define the tag. Maximum length: 256 characters. Valid characters: Unicode letters, digits, white space, _ . / = + - % @
      */
    var Value: js.UndefOr[TagValue] = js.undefined
  }
  
  trait TagMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[TagValue]
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Adds or updates tags for the specified Kinesis data stream. Each time you invoke this operation, you can specify up to 10 tags. If you want to add more than 10 tags to your stream, you can invoke this operation multiple times. In total, each stream can have up to 50 tags. If tags have already been assigned to the stream, AddTagsToStream overwrites any existing tags that correspond to the specified tag keys.  AddTagsToStream has a limit of five transactions per second per account.
      */
    def addTagsToStream(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addTagsToStream(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds or updates tags for the specified Kinesis data stream. Each time you invoke this operation, you can specify up to 10 tags. If you want to add more than 10 tags to your stream, you can invoke this operation multiple times. In total, each stream can have up to 50 tags. If tags have already been assigned to the stream, AddTagsToStream overwrites any existing tags that correspond to the specified tag keys.  AddTagsToStream has a limit of five transactions per second per account.
      */
    def addTagsToStream(params: AddTagsToStreamInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addTagsToStream(
      params: AddTagsToStreamInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a Kinesis data stream. A stream captures and transports data records that are continuously emitted from different data sources or producers. Scale-out within a stream is explicitly supported by means of shards, which are uniquely identified groups of data records in a stream. You specify and control the number of shards that a stream is composed of. Each shard can support reads up to five transactions per second, up to a maximum data read total of 2 MB per second. Each shard can support writes up to 1,000 records per second, up to a maximum data write total of 1 MB per second. If the amount of data input increases or decreases, you can add or remove shards. The stream name identifies the stream. The name is scoped to the AWS account used by the application. It is also scoped by AWS Region. That is, two streams in two different accounts can have the same name, and two streams in the same account, but in two different Regions, can have the same name.  CreateStream is an asynchronous operation. Upon receiving a CreateStream request, Kinesis Data Streams immediately returns and sets the stream status to CREATING. After the stream is created, Kinesis Data Streams sets the stream status to ACTIVE. You should perform read and write operations only on an ACTIVE stream.  You receive a LimitExceededException when making a CreateStream request when you try to do one of the following:   Have more than five streams in the CREATING state at any point in time.   Create more shards than are authorized for your account.   For the default shard limit for an AWS account, see Amazon Kinesis Data Streams Limits in the Amazon Kinesis Data Streams Developer Guide. To increase this limit, contact AWS Support. You can use DescribeStream to check the stream status, which is returned in StreamStatus.  CreateStream has a limit of five transactions per second per account.
      */
    def createStream(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createStream(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a Kinesis data stream. A stream captures and transports data records that are continuously emitted from different data sources or producers. Scale-out within a stream is explicitly supported by means of shards, which are uniquely identified groups of data records in a stream. You specify and control the number of shards that a stream is composed of. Each shard can support reads up to five transactions per second, up to a maximum data read total of 2 MB per second. Each shard can support writes up to 1,000 records per second, up to a maximum data write total of 1 MB per second. If the amount of data input increases or decreases, you can add or remove shards. The stream name identifies the stream. The name is scoped to the AWS account used by the application. It is also scoped by AWS Region. That is, two streams in two different accounts can have the same name, and two streams in the same account, but in two different Regions, can have the same name.  CreateStream is an asynchronous operation. Upon receiving a CreateStream request, Kinesis Data Streams immediately returns and sets the stream status to CREATING. After the stream is created, Kinesis Data Streams sets the stream status to ACTIVE. You should perform read and write operations only on an ACTIVE stream.  You receive a LimitExceededException when making a CreateStream request when you try to do one of the following:   Have more than five streams in the CREATING state at any point in time.   Create more shards than are authorized for your account.   For the default shard limit for an AWS account, see Amazon Kinesis Data Streams Limits in the Amazon Kinesis Data Streams Developer Guide. To increase this limit, contact AWS Support. You can use DescribeStream to check the stream status, which is returned in StreamStatus.  CreateStream has a limit of five transactions per second per account.
      */
    def createStream(params: CreateStreamInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createStream(
      params: CreateStreamInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Decreases the Kinesis data stream's retention period, which is the length of time data records are accessible after they are added to the stream. The minimum value of a stream's retention period is 24 hours. This operation may result in lost data. For example, if the stream's retention period is 48 hours and is decreased to 24 hours, any data already in the stream that is older than 24 hours is inaccessible.
      */
    def decreaseStreamRetentionPeriod(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def decreaseStreamRetentionPeriod(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Decreases the Kinesis data stream's retention period, which is the length of time data records are accessible after they are added to the stream. The minimum value of a stream's retention period is 24 hours. This operation may result in lost data. For example, if the stream's retention period is 48 hours and is decreased to 24 hours, any data already in the stream that is older than 24 hours is inaccessible.
      */
    def decreaseStreamRetentionPeriod(params: DecreaseStreamRetentionPeriodInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def decreaseStreamRetentionPeriod(
      params: DecreaseStreamRetentionPeriodInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a Kinesis data stream and all its shards and data. You must shut down any applications that are operating on the stream before you delete the stream. If an application attempts to operate on a deleted stream, it receives the exception ResourceNotFoundException. If the stream is in the ACTIVE state, you can delete it. After a DeleteStream request, the specified stream is in the DELETING state until Kinesis Data Streams completes the deletion.  Note: Kinesis Data Streams might continue to accept data read and write operations, such as PutRecord, PutRecords, and GetRecords, on a stream in the DELETING state until the stream deletion is complete. When you delete a stream, any shards in that stream are also deleted, and any tags are dissociated from the stream. You can use the DescribeStream operation to check the state of the stream, which is returned in StreamStatus.  DeleteStream has a limit of five transactions per second per account.
      */
    def deleteStream(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteStream(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a Kinesis data stream and all its shards and data. You must shut down any applications that are operating on the stream before you delete the stream. If an application attempts to operate on a deleted stream, it receives the exception ResourceNotFoundException. If the stream is in the ACTIVE state, you can delete it. After a DeleteStream request, the specified stream is in the DELETING state until Kinesis Data Streams completes the deletion.  Note: Kinesis Data Streams might continue to accept data read and write operations, such as PutRecord, PutRecords, and GetRecords, on a stream in the DELETING state until the stream deletion is complete. When you delete a stream, any shards in that stream are also deleted, and any tags are dissociated from the stream. You can use the DescribeStream operation to check the state of the stream, which is returned in StreamStatus.  DeleteStream has a limit of five transactions per second per account.
      */
    def deleteStream(params: DeleteStreamInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteStream(
      params: DeleteStreamInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * To deregister a consumer, provide its ARN. Alternatively, you can provide the ARN of the data stream and the name you gave the consumer when you registered it. You may also provide all three parameters, as long as they don't conflict with each other. If you don't know the name or ARN of the consumer that you want to deregister, you can use the ListStreamConsumers operation to get a list of the descriptions of all the consumers that are currently registered with a given data stream. The description of a consumer contains its name and ARN. This operation has a limit of five transactions per second per account.
      */
    def deregisterStreamConsumer(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deregisterStreamConsumer(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * To deregister a consumer, provide its ARN. Alternatively, you can provide the ARN of the data stream and the name you gave the consumer when you registered it. You may also provide all three parameters, as long as they don't conflict with each other. If you don't know the name or ARN of the consumer that you want to deregister, you can use the ListStreamConsumers operation to get a list of the descriptions of all the consumers that are currently registered with a given data stream. The description of a consumer contains its name and ARN. This operation has a limit of five transactions per second per account.
      */
    def deregisterStreamConsumer(params: DeregisterStreamConsumerInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deregisterStreamConsumer(
      params: DeregisterStreamConsumerInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the shard limits and usage for the account. If you update your account limits, the old limits might be returned for a few minutes. This operation has a limit of one transaction per second per account.
      */
    def describeLimits(): awsDashSdkLib.libRequestMod.Request[DescribeLimitsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeLimits(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLimitsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLimitsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the shard limits and usage for the account. If you update your account limits, the old limits might be returned for a few minutes. This operation has a limit of one transaction per second per account.
      */
    def describeLimits(params: DescribeLimitsInput): awsDashSdkLib.libRequestMod.Request[DescribeLimitsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeLimits(
      params: DescribeLimitsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLimitsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLimitsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the specified Kinesis data stream. The information returned includes the stream name, Amazon Resource Name (ARN), creation time, enhanced metric configuration, and shard map. The shard map is an array of shard objects. For each shard object, there is the hash key and sequence number ranges that the shard spans, and the IDs of any earlier shards that played in a role in creating the shard. Every record ingested in the stream is identified by a sequence number, which is assigned when the record is put into the stream. You can limit the number of shards returned by each call. For more information, see Retrieving Shards from a Stream in the Amazon Kinesis Data Streams Developer Guide. There are no guarantees about the chronological order shards returned. To process shards in chronological order, use the ID of the parent shard to track the lineage to the oldest shard. This operation has a limit of 10 transactions per second per account.
      */
    def describeStream(): awsDashSdkLib.libRequestMod.Request[DescribeStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStream(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStreamOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the specified Kinesis data stream. The information returned includes the stream name, Amazon Resource Name (ARN), creation time, enhanced metric configuration, and shard map. The shard map is an array of shard objects. For each shard object, there is the hash key and sequence number ranges that the shard spans, and the IDs of any earlier shards that played in a role in creating the shard. Every record ingested in the stream is identified by a sequence number, which is assigned when the record is put into the stream. You can limit the number of shards returned by each call. For more information, see Retrieving Shards from a Stream in the Amazon Kinesis Data Streams Developer Guide. There are no guarantees about the chronological order shards returned. To process shards in chronological order, use the ID of the parent shard to track the lineage to the oldest shard. This operation has a limit of 10 transactions per second per account.
      */
    def describeStream(params: DescribeStreamInput): awsDashSdkLib.libRequestMod.Request[DescribeStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStream(
      params: DescribeStreamInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStreamOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * To get the description of a registered consumer, provide the ARN of the consumer. Alternatively, you can provide the ARN of the data stream and the name you gave the consumer when you registered it. You may also provide all three parameters, as long as they don't conflict with each other. If you don't know the name or ARN of the consumer that you want to describe, you can use the ListStreamConsumers operation to get a list of the descriptions of all the consumers that are currently registered with a given data stream. This operation has a limit of 20 transactions per second per account.
      */
    def describeStreamConsumer(): awsDashSdkLib.libRequestMod.Request[DescribeStreamConsumerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStreamConsumer(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStreamConsumerOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStreamConsumerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * To get the description of a registered consumer, provide the ARN of the consumer. Alternatively, you can provide the ARN of the data stream and the name you gave the consumer when you registered it. You may also provide all three parameters, as long as they don't conflict with each other. If you don't know the name or ARN of the consumer that you want to describe, you can use the ListStreamConsumers operation to get a list of the descriptions of all the consumers that are currently registered with a given data stream. This operation has a limit of 20 transactions per second per account.
      */
    def describeStreamConsumer(params: DescribeStreamConsumerInput): awsDashSdkLib.libRequestMod.Request[DescribeStreamConsumerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStreamConsumer(
      params: DescribeStreamConsumerInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStreamConsumerOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStreamConsumerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Provides a summarized description of the specified Kinesis data stream without the shard list. The information returned includes the stream name, Amazon Resource Name (ARN), status, record retention period, approximate creation time, monitoring, encryption details, and open shard count. 
      */
    def describeStreamSummary(): awsDashSdkLib.libRequestMod.Request[DescribeStreamSummaryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStreamSummary(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStreamSummaryOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStreamSummaryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Provides a summarized description of the specified Kinesis data stream without the shard list. The information returned includes the stream name, Amazon Resource Name (ARN), status, record retention period, approximate creation time, monitoring, encryption details, and open shard count. 
      */
    def describeStreamSummary(params: DescribeStreamSummaryInput): awsDashSdkLib.libRequestMod.Request[DescribeStreamSummaryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStreamSummary(
      params: DescribeStreamSummaryInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStreamSummaryOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStreamSummaryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disables enhanced monitoring.
      */
    def disableEnhancedMonitoring(): awsDashSdkLib.libRequestMod.Request[EnhancedMonitoringOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disableEnhancedMonitoring(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EnhancedMonitoringOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EnhancedMonitoringOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disables enhanced monitoring.
      */
    def disableEnhancedMonitoring(params: DisableEnhancedMonitoringInput): awsDashSdkLib.libRequestMod.Request[EnhancedMonitoringOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disableEnhancedMonitoring(
      params: DisableEnhancedMonitoringInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EnhancedMonitoringOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EnhancedMonitoringOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enables enhanced Kinesis data stream monitoring for shard-level metrics.
      */
    def enableEnhancedMonitoring(): awsDashSdkLib.libRequestMod.Request[EnhancedMonitoringOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def enableEnhancedMonitoring(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EnhancedMonitoringOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EnhancedMonitoringOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enables enhanced Kinesis data stream monitoring for shard-level metrics.
      */
    def enableEnhancedMonitoring(params: EnableEnhancedMonitoringInput): awsDashSdkLib.libRequestMod.Request[EnhancedMonitoringOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def enableEnhancedMonitoring(
      params: EnableEnhancedMonitoringInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EnhancedMonitoringOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EnhancedMonitoringOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets data records from a Kinesis data stream's shard. Specify a shard iterator using the ShardIterator parameter. The shard iterator specifies the position in the shard from which you want to start reading data records sequentially. If there are no records available in the portion of the shard that the iterator points to, GetRecords returns an empty list. It might take multiple calls to get to a portion of the shard that contains records. You can scale by provisioning multiple shards per stream while considering service limits (for more information, see Amazon Kinesis Data Streams Limits in the Amazon Kinesis Data Streams Developer Guide). Your application should have one thread per shard, each reading continuously from its stream. To read from a stream continually, call GetRecords in a loop. Use GetShardIterator to get the shard iterator to specify in the first GetRecords call. GetRecords returns a new shard iterator in NextShardIterator. Specify the shard iterator returned in NextShardIterator in subsequent calls to GetRecords. If the shard has been closed, the shard iterator can't return more data and GetRecords returns null in NextShardIterator. You can terminate the loop when the shard is closed, or when the shard iterator reaches the record with the sequence number or other attribute that marks it as the last record to process. Each data record can be up to 1 MiB in size, and each shard can read up to 2 MiB per second. You can ensure that your calls don't exceed the maximum supported size or throughput by using the Limit parameter to specify the maximum number of records that GetRecords can return. Consider your average record size when determining this limit. The maximum number of records that can be returned per call is 10,000. The size of the data returned by GetRecords varies depending on the utilization of the shard. The maximum size of data that GetRecords can return is 10 MiB. If a call returns this amount of data, subsequent calls made within the next 5 seconds throw ProvisionedThroughputExceededException. If there is insufficient provisioned throughput on the stream, subsequent calls made within the next 1 second throw ProvisionedThroughputExceededException. GetRecords doesn't return any data when it throws an exception. For this reason, we recommend that you wait 1 second between calls to GetRecords. However, it's possible that the application will get exceptions for longer than 1 second. To detect whether the application is falling behind in processing, you can use the MillisBehindLatest response attribute. You can also monitor the stream using CloudWatch metrics and other mechanisms (see Monitoring in the Amazon Kinesis Data Streams Developer Guide). Each Amazon Kinesis record includes a value, ApproximateArrivalTimestamp, that is set when a stream successfully receives and stores a record. This is commonly referred to as a server-side time stamp, whereas a client-side time stamp is set when a data producer creates or sends the record to a stream (a data producer is any data source putting data records into a stream, for example with PutRecords). The time stamp has millisecond precision. There are no guarantees about the time stamp accuracy, or that the time stamp is always increasing. For example, records in a shard or across a stream might have time stamps that are out of order. This operation has a limit of five transactions per second per account.
      */
    def getRecords(): awsDashSdkLib.libRequestMod.Request[GetRecordsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getRecords(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetRecordsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetRecordsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets data records from a Kinesis data stream's shard. Specify a shard iterator using the ShardIterator parameter. The shard iterator specifies the position in the shard from which you want to start reading data records sequentially. If there are no records available in the portion of the shard that the iterator points to, GetRecords returns an empty list. It might take multiple calls to get to a portion of the shard that contains records. You can scale by provisioning multiple shards per stream while considering service limits (for more information, see Amazon Kinesis Data Streams Limits in the Amazon Kinesis Data Streams Developer Guide). Your application should have one thread per shard, each reading continuously from its stream. To read from a stream continually, call GetRecords in a loop. Use GetShardIterator to get the shard iterator to specify in the first GetRecords call. GetRecords returns a new shard iterator in NextShardIterator. Specify the shard iterator returned in NextShardIterator in subsequent calls to GetRecords. If the shard has been closed, the shard iterator can't return more data and GetRecords returns null in NextShardIterator. You can terminate the loop when the shard is closed, or when the shard iterator reaches the record with the sequence number or other attribute that marks it as the last record to process. Each data record can be up to 1 MiB in size, and each shard can read up to 2 MiB per second. You can ensure that your calls don't exceed the maximum supported size or throughput by using the Limit parameter to specify the maximum number of records that GetRecords can return. Consider your average record size when determining this limit. The maximum number of records that can be returned per call is 10,000. The size of the data returned by GetRecords varies depending on the utilization of the shard. The maximum size of data that GetRecords can return is 10 MiB. If a call returns this amount of data, subsequent calls made within the next 5 seconds throw ProvisionedThroughputExceededException. If there is insufficient provisioned throughput on the stream, subsequent calls made within the next 1 second throw ProvisionedThroughputExceededException. GetRecords doesn't return any data when it throws an exception. For this reason, we recommend that you wait 1 second between calls to GetRecords. However, it's possible that the application will get exceptions for longer than 1 second. To detect whether the application is falling behind in processing, you can use the MillisBehindLatest response attribute. You can also monitor the stream using CloudWatch metrics and other mechanisms (see Monitoring in the Amazon Kinesis Data Streams Developer Guide). Each Amazon Kinesis record includes a value, ApproximateArrivalTimestamp, that is set when a stream successfully receives and stores a record. This is commonly referred to as a server-side time stamp, whereas a client-side time stamp is set when a data producer creates or sends the record to a stream (a data producer is any data source putting data records into a stream, for example with PutRecords). The time stamp has millisecond precision. There are no guarantees about the time stamp accuracy, or that the time stamp is always increasing. For example, records in a shard or across a stream might have time stamps that are out of order. This operation has a limit of five transactions per second per account.
      */
    def getRecords(params: GetRecordsInput): awsDashSdkLib.libRequestMod.Request[GetRecordsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getRecords(
      params: GetRecordsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetRecordsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetRecordsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets an Amazon Kinesis shard iterator. A shard iterator expires 5 minutes after it is returned to the requester. A shard iterator specifies the shard position from which to start reading data records sequentially. The position is specified using the sequence number of a data record in a shard. A sequence number is the identifier associated with every record ingested in the stream, and is assigned when a record is put into the stream. Each stream has one or more shards. You must specify the shard iterator type. For example, you can set the ShardIteratorType parameter to read exactly from the position denoted by a specific sequence number by using the AT_SEQUENCE_NUMBER shard iterator type. Alternatively, the parameter can read right after the sequence number by using the AFTER_SEQUENCE_NUMBER shard iterator type, using sequence numbers returned by earlier calls to PutRecord, PutRecords, GetRecords, or DescribeStream. In the request, you can specify the shard iterator type AT_TIMESTAMP to read records from an arbitrary point in time, TRIM_HORIZON to cause ShardIterator to point to the last untrimmed record in the shard in the system (the oldest data record in the shard), or LATEST so that you always read the most recent data in the shard.  When you read repeatedly from a stream, use a GetShardIterator request to get the first shard iterator for use in your first GetRecords request and for subsequent reads use the shard iterator returned by the GetRecords request in NextShardIterator. A new shard iterator is returned by every GetRecords request in NextShardIterator, which you use in the ShardIterator parameter of the next GetRecords request.  If a GetShardIterator request is made too often, you receive a ProvisionedThroughputExceededException. For more information about throughput limits, see GetRecords, and Streams Limits in the Amazon Kinesis Data Streams Developer Guide. If the shard is closed, GetShardIterator returns a valid iterator for the last sequence number of the shard. A shard can be closed as a result of using SplitShard or MergeShards.  GetShardIterator has a limit of five transactions per second per account per open shard.
      */
    def getShardIterator(): awsDashSdkLib.libRequestMod.Request[GetShardIteratorOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getShardIterator(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetShardIteratorOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetShardIteratorOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets an Amazon Kinesis shard iterator. A shard iterator expires 5 minutes after it is returned to the requester. A shard iterator specifies the shard position from which to start reading data records sequentially. The position is specified using the sequence number of a data record in a shard. A sequence number is the identifier associated with every record ingested in the stream, and is assigned when a record is put into the stream. Each stream has one or more shards. You must specify the shard iterator type. For example, you can set the ShardIteratorType parameter to read exactly from the position denoted by a specific sequence number by using the AT_SEQUENCE_NUMBER shard iterator type. Alternatively, the parameter can read right after the sequence number by using the AFTER_SEQUENCE_NUMBER shard iterator type, using sequence numbers returned by earlier calls to PutRecord, PutRecords, GetRecords, or DescribeStream. In the request, you can specify the shard iterator type AT_TIMESTAMP to read records from an arbitrary point in time, TRIM_HORIZON to cause ShardIterator to point to the last untrimmed record in the shard in the system (the oldest data record in the shard), or LATEST so that you always read the most recent data in the shard.  When you read repeatedly from a stream, use a GetShardIterator request to get the first shard iterator for use in your first GetRecords request and for subsequent reads use the shard iterator returned by the GetRecords request in NextShardIterator. A new shard iterator is returned by every GetRecords request in NextShardIterator, which you use in the ShardIterator parameter of the next GetRecords request.  If a GetShardIterator request is made too often, you receive a ProvisionedThroughputExceededException. For more information about throughput limits, see GetRecords, and Streams Limits in the Amazon Kinesis Data Streams Developer Guide. If the shard is closed, GetShardIterator returns a valid iterator for the last sequence number of the shard. A shard can be closed as a result of using SplitShard or MergeShards.  GetShardIterator has a limit of five transactions per second per account per open shard.
      */
    def getShardIterator(params: GetShardIteratorInput): awsDashSdkLib.libRequestMod.Request[GetShardIteratorOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getShardIterator(
      params: GetShardIteratorInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetShardIteratorOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetShardIteratorOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Increases the Kinesis data stream's retention period, which is the length of time data records are accessible after they are added to the stream. The maximum value of a stream's retention period is 168 hours (7 days). If you choose a longer stream retention period, this operation increases the time period during which records that have not yet expired are accessible. However, it does not make previous, expired data (older than the stream's previous retention period) accessible after the operation has been called. For example, if a stream's retention period is set to 24 hours and is increased to 168 hours, any data that is older than 24 hours remains inaccessible to consumer applications.
      */
    def increaseStreamRetentionPeriod(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def increaseStreamRetentionPeriod(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Increases the Kinesis data stream's retention period, which is the length of time data records are accessible after they are added to the stream. The maximum value of a stream's retention period is 168 hours (7 days). If you choose a longer stream retention period, this operation increases the time period during which records that have not yet expired are accessible. However, it does not make previous, expired data (older than the stream's previous retention period) accessible after the operation has been called. For example, if a stream's retention period is set to 24 hours and is increased to 168 hours, any data that is older than 24 hours remains inaccessible to consumer applications.
      */
    def increaseStreamRetentionPeriod(params: IncreaseStreamRetentionPeriodInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def increaseStreamRetentionPeriod(
      params: IncreaseStreamRetentionPeriodInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the shards in a stream and provides information about each shard. This operation has a limit of 100 transactions per second per data stream.  This API is a new operation that is used by the Amazon Kinesis Client Library (KCL). If you have a fine-grained IAM policy that only allows specific operations, you must update your policy to allow calls to this API. For more information, see Controlling Access to Amazon Kinesis Data Streams Resources Using IAM. 
      */
    def listShards(): awsDashSdkLib.libRequestMod.Request[ListShardsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listShards(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListShardsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListShardsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the shards in a stream and provides information about each shard. This operation has a limit of 100 transactions per second per data stream.  This API is a new operation that is used by the Amazon Kinesis Client Library (KCL). If you have a fine-grained IAM policy that only allows specific operations, you must update your policy to allow calls to this API. For more information, see Controlling Access to Amazon Kinesis Data Streams Resources Using IAM. 
      */
    def listShards(params: ListShardsInput): awsDashSdkLib.libRequestMod.Request[ListShardsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listShards(
      params: ListShardsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListShardsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListShardsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the consumers registered to receive data from a stream using enhanced fan-out, and provides information about each consumer. This operation has a limit of 10 transactions per second per account.
      */
    def listStreamConsumers(): awsDashSdkLib.libRequestMod.Request[ListStreamConsumersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listStreamConsumers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListStreamConsumersOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListStreamConsumersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the consumers registered to receive data from a stream using enhanced fan-out, and provides information about each consumer. This operation has a limit of 10 transactions per second per account.
      */
    def listStreamConsumers(params: ListStreamConsumersInput): awsDashSdkLib.libRequestMod.Request[ListStreamConsumersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listStreamConsumers(
      params: ListStreamConsumersInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListStreamConsumersOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListStreamConsumersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists your Kinesis data streams. The number of streams may be too large to return from a single call to ListStreams. You can limit the number of returned streams using the Limit parameter. If you do not specify a value for the Limit parameter, Kinesis Data Streams uses the default limit, which is currently 10. You can detect if there are more streams available to list by using the HasMoreStreams flag from the returned output. If there are more streams available, you can request more streams by using the name of the last stream returned by the ListStreams request in the ExclusiveStartStreamName parameter in a subsequent request to ListStreams. The group of stream names returned by the subsequent request is then added to the list. You can continue this process until all the stream names have been collected in the list.   ListStreams has a limit of five transactions per second per account.
      */
    def listStreams(): awsDashSdkLib.libRequestMod.Request[ListStreamsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listStreams(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListStreamsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListStreamsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists your Kinesis data streams. The number of streams may be too large to return from a single call to ListStreams. You can limit the number of returned streams using the Limit parameter. If you do not specify a value for the Limit parameter, Kinesis Data Streams uses the default limit, which is currently 10. You can detect if there are more streams available to list by using the HasMoreStreams flag from the returned output. If there are more streams available, you can request more streams by using the name of the last stream returned by the ListStreams request in the ExclusiveStartStreamName parameter in a subsequent request to ListStreams. The group of stream names returned by the subsequent request is then added to the list. You can continue this process until all the stream names have been collected in the list.   ListStreams has a limit of five transactions per second per account.
      */
    def listStreams(params: ListStreamsInput): awsDashSdkLib.libRequestMod.Request[ListStreamsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listStreams(
      params: ListStreamsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListStreamsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListStreamsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the tags for the specified Kinesis data stream. This operation has a limit of five transactions per second per account.
      */
    def listTagsForStream(): awsDashSdkLib.libRequestMod.Request[ListTagsForStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForStream(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForStreamOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the tags for the specified Kinesis data stream. This operation has a limit of five transactions per second per account.
      */
    def listTagsForStream(params: ListTagsForStreamInput): awsDashSdkLib.libRequestMod.Request[ListTagsForStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForStream(
      params: ListTagsForStreamInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForStreamOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Merges two adjacent shards in a Kinesis data stream and combines them into a single shard to reduce the stream's capacity to ingest and transport data. Two shards are considered adjacent if the union of the hash key ranges for the two shards form a contiguous set with no gaps. For example, if you have two shards, one with a hash key range of 276...381 and the other with a hash key range of 382...454, then you could merge these two shards into a single shard that would have a hash key range of 276...454. After the merge, the single child shard receives data for all hash key values covered by the two parent shards.  MergeShards is called when there is a need to reduce the overall capacity of a stream because of excess capacity that is not being used. You must specify the shard to be merged and the adjacent shard for a stream. For more information about merging shards, see Merge Two Shards in the Amazon Kinesis Data Streams Developer Guide. If the stream is in the ACTIVE state, you can call MergeShards. If a stream is in the CREATING, UPDATING, or DELETING state, MergeShards returns a ResourceInUseException. If the specified stream does not exist, MergeShards returns a ResourceNotFoundException.  You can use DescribeStream to check the state of the stream, which is returned in StreamStatus.  MergeShards is an asynchronous operation. Upon receiving a MergeShards request, Amazon Kinesis Data Streams immediately returns a response and sets the StreamStatus to UPDATING. After the operation is completed, Kinesis Data Streams sets the StreamStatus to ACTIVE. Read and write operations continue to work while the stream is in the UPDATING state.  You use DescribeStream to determine the shard IDs that are specified in the MergeShards request.  If you try to operate on too many streams in parallel using CreateStream, DeleteStream, MergeShards, or SplitShard, you receive a LimitExceededException.   MergeShards has a limit of five transactions per second per account.
      */
    def mergeShards(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def mergeShards(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Merges two adjacent shards in a Kinesis data stream and combines them into a single shard to reduce the stream's capacity to ingest and transport data. Two shards are considered adjacent if the union of the hash key ranges for the two shards form a contiguous set with no gaps. For example, if you have two shards, one with a hash key range of 276...381 and the other with a hash key range of 382...454, then you could merge these two shards into a single shard that would have a hash key range of 276...454. After the merge, the single child shard receives data for all hash key values covered by the two parent shards.  MergeShards is called when there is a need to reduce the overall capacity of a stream because of excess capacity that is not being used. You must specify the shard to be merged and the adjacent shard for a stream. For more information about merging shards, see Merge Two Shards in the Amazon Kinesis Data Streams Developer Guide. If the stream is in the ACTIVE state, you can call MergeShards. If a stream is in the CREATING, UPDATING, or DELETING state, MergeShards returns a ResourceInUseException. If the specified stream does not exist, MergeShards returns a ResourceNotFoundException.  You can use DescribeStream to check the state of the stream, which is returned in StreamStatus.  MergeShards is an asynchronous operation. Upon receiving a MergeShards request, Amazon Kinesis Data Streams immediately returns a response and sets the StreamStatus to UPDATING. After the operation is completed, Kinesis Data Streams sets the StreamStatus to ACTIVE. Read and write operations continue to work while the stream is in the UPDATING state.  You use DescribeStream to determine the shard IDs that are specified in the MergeShards request.  If you try to operate on too many streams in parallel using CreateStream, DeleteStream, MergeShards, or SplitShard, you receive a LimitExceededException.   MergeShards has a limit of five transactions per second per account.
      */
    def mergeShards(params: MergeShardsInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def mergeShards(
      params: MergeShardsInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Writes a single data record into an Amazon Kinesis data stream. Call PutRecord to send data into the stream for real-time ingestion and subsequent processing, one record at a time. Each shard can support writes up to 1,000 records per second, up to a maximum data write total of 1 MB per second. You must specify the name of the stream that captures, stores, and transports the data; a partition key; and the data blob itself. The data blob can be any type of data; for example, a segment from a log file, geographic/location data, website clickstream data, and so on. The partition key is used by Kinesis Data Streams to distribute data across shards. Kinesis Data Streams segregates the data records that belong to a stream into multiple shards, using the partition key associated with each data record to determine the shard to which a given data record belongs. Partition keys are Unicode strings, with a maximum length limit of 256 characters for each key. An MD5 hash function is used to map partition keys to 128-bit integer values and to map associated data records to shards using the hash key ranges of the shards. You can override hashing the partition key to determine the shard by explicitly specifying a hash value using the ExplicitHashKey parameter. For more information, see Adding Data to a Stream in the Amazon Kinesis Data Streams Developer Guide.  PutRecord returns the shard ID of where the data record was placed and the sequence number that was assigned to the data record. Sequence numbers increase over time and are specific to a shard within a stream, not across all shards within a stream. To guarantee strictly increasing ordering, write serially to a shard and use the SequenceNumberForOrdering parameter. For more information, see Adding Data to a Stream in the Amazon Kinesis Data Streams Developer Guide. If a PutRecord request cannot be processed because of insufficient provisioned throughput on the shard involved in the request, PutRecord throws ProvisionedThroughputExceededException.  By default, data records are accessible for 24 hours from the time that they are added to a stream. You can use IncreaseStreamRetentionPeriod or DecreaseStreamRetentionPeriod to modify this retention period.
      */
    def putRecord(): awsDashSdkLib.libRequestMod.Request[PutRecordOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putRecord(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ PutRecordOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[PutRecordOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Writes a single data record into an Amazon Kinesis data stream. Call PutRecord to send data into the stream for real-time ingestion and subsequent processing, one record at a time. Each shard can support writes up to 1,000 records per second, up to a maximum data write total of 1 MB per second. You must specify the name of the stream that captures, stores, and transports the data; a partition key; and the data blob itself. The data blob can be any type of data; for example, a segment from a log file, geographic/location data, website clickstream data, and so on. The partition key is used by Kinesis Data Streams to distribute data across shards. Kinesis Data Streams segregates the data records that belong to a stream into multiple shards, using the partition key associated with each data record to determine the shard to which a given data record belongs. Partition keys are Unicode strings, with a maximum length limit of 256 characters for each key. An MD5 hash function is used to map partition keys to 128-bit integer values and to map associated data records to shards using the hash key ranges of the shards. You can override hashing the partition key to determine the shard by explicitly specifying a hash value using the ExplicitHashKey parameter. For more information, see Adding Data to a Stream in the Amazon Kinesis Data Streams Developer Guide.  PutRecord returns the shard ID of where the data record was placed and the sequence number that was assigned to the data record. Sequence numbers increase over time and are specific to a shard within a stream, not across all shards within a stream. To guarantee strictly increasing ordering, write serially to a shard and use the SequenceNumberForOrdering parameter. For more information, see Adding Data to a Stream in the Amazon Kinesis Data Streams Developer Guide. If a PutRecord request cannot be processed because of insufficient provisioned throughput on the shard involved in the request, PutRecord throws ProvisionedThroughputExceededException.  By default, data records are accessible for 24 hours from the time that they are added to a stream. You can use IncreaseStreamRetentionPeriod or DecreaseStreamRetentionPeriod to modify this retention period.
      */
    def putRecord(params: PutRecordInput): awsDashSdkLib.libRequestMod.Request[PutRecordOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putRecord(
      params: PutRecordInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ PutRecordOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[PutRecordOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Writes multiple data records into a Kinesis data stream in a single call (also referred to as a PutRecords request). Use this operation to send data into the stream for data ingestion and processing.  Each PutRecords request can support up to 500 records. Each record in the request can be as large as 1 MB, up to a limit of 5 MB for the entire request, including partition keys. Each shard can support writes up to 1,000 records per second, up to a maximum data write total of 1 MB per second. You must specify the name of the stream that captures, stores, and transports the data; and an array of request Records, with each record in the array requiring a partition key and data blob. The record size limit applies to the total size of the partition key and data blob. The data blob can be any type of data; for example, a segment from a log file, geographic/location data, website clickstream data, and so on. The partition key is used by Kinesis Data Streams as input to a hash function that maps the partition key and associated data to a specific shard. An MD5 hash function is used to map partition keys to 128-bit integer values and to map associated data records to shards. As a result of this hashing mechanism, all data records with the same partition key map to the same shard within the stream. For more information, see Adding Data to a Stream in the Amazon Kinesis Data Streams Developer Guide. Each record in the Records array may include an optional parameter, ExplicitHashKey, which overrides the partition key to shard mapping. This parameter allows a data producer to determine explicitly the shard where the record is stored. For more information, see Adding Multiple Records with PutRecords in the Amazon Kinesis Data Streams Developer Guide. The PutRecords response includes an array of response Records. Each record in the response array directly correlates with a record in the request array using natural ordering, from the top to the bottom of the request and response. The response Records array always includes the same number of records as the request array. The response Records array includes both successfully and unsuccessfully processed records. Kinesis Data Streams attempts to process all records in each PutRecords request. A single record failure does not stop the processing of subsequent records. A successfully processed record includes ShardId and SequenceNumber values. The ShardId parameter identifies the shard in the stream where the record is stored. The SequenceNumber parameter is an identifier assigned to the put record, unique to all records in the stream. An unsuccessfully processed record includes ErrorCode and ErrorMessage values. ErrorCode reflects the type of error and can be one of the following values: ProvisionedThroughputExceededException or InternalFailure. ErrorMessage provides more detailed information about the ProvisionedThroughputExceededException exception including the account ID, stream name, and shard ID of the record that was throttled. For more information about partially successful responses, see Adding Multiple Records with PutRecords in the Amazon Kinesis Data Streams Developer Guide. By default, data records are accessible for 24 hours from the time that they are added to a stream. You can use IncreaseStreamRetentionPeriod or DecreaseStreamRetentionPeriod to modify this retention period.
      */
    def putRecords(): awsDashSdkLib.libRequestMod.Request[PutRecordsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putRecords(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutRecordsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutRecordsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Writes multiple data records into a Kinesis data stream in a single call (also referred to as a PutRecords request). Use this operation to send data into the stream for data ingestion and processing.  Each PutRecords request can support up to 500 records. Each record in the request can be as large as 1 MB, up to a limit of 5 MB for the entire request, including partition keys. Each shard can support writes up to 1,000 records per second, up to a maximum data write total of 1 MB per second. You must specify the name of the stream that captures, stores, and transports the data; and an array of request Records, with each record in the array requiring a partition key and data blob. The record size limit applies to the total size of the partition key and data blob. The data blob can be any type of data; for example, a segment from a log file, geographic/location data, website clickstream data, and so on. The partition key is used by Kinesis Data Streams as input to a hash function that maps the partition key and associated data to a specific shard. An MD5 hash function is used to map partition keys to 128-bit integer values and to map associated data records to shards. As a result of this hashing mechanism, all data records with the same partition key map to the same shard within the stream. For more information, see Adding Data to a Stream in the Amazon Kinesis Data Streams Developer Guide. Each record in the Records array may include an optional parameter, ExplicitHashKey, which overrides the partition key to shard mapping. This parameter allows a data producer to determine explicitly the shard where the record is stored. For more information, see Adding Multiple Records with PutRecords in the Amazon Kinesis Data Streams Developer Guide. The PutRecords response includes an array of response Records. Each record in the response array directly correlates with a record in the request array using natural ordering, from the top to the bottom of the request and response. The response Records array always includes the same number of records as the request array. The response Records array includes both successfully and unsuccessfully processed records. Kinesis Data Streams attempts to process all records in each PutRecords request. A single record failure does not stop the processing of subsequent records. A successfully processed record includes ShardId and SequenceNumber values. The ShardId parameter identifies the shard in the stream where the record is stored. The SequenceNumber parameter is an identifier assigned to the put record, unique to all records in the stream. An unsuccessfully processed record includes ErrorCode and ErrorMessage values. ErrorCode reflects the type of error and can be one of the following values: ProvisionedThroughputExceededException or InternalFailure. ErrorMessage provides more detailed information about the ProvisionedThroughputExceededException exception including the account ID, stream name, and shard ID of the record that was throttled. For more information about partially successful responses, see Adding Multiple Records with PutRecords in the Amazon Kinesis Data Streams Developer Guide. By default, data records are accessible for 24 hours from the time that they are added to a stream. You can use IncreaseStreamRetentionPeriod or DecreaseStreamRetentionPeriod to modify this retention period.
      */
    def putRecords(params: PutRecordsInput): awsDashSdkLib.libRequestMod.Request[PutRecordsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putRecords(
      params: PutRecordsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutRecordsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutRecordsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Registers a consumer with a Kinesis data stream. When you use this operation, the consumer you register can read data from the stream at a rate of up to 2 MiB per second. This rate is unaffected by the total number of consumers that read from the same stream. You can register up to 5 consumers per stream. A given consumer can only be registered with one stream. This operation has a limit of five transactions per second per account.
      */
    def registerStreamConsumer(): awsDashSdkLib.libRequestMod.Request[RegisterStreamConsumerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerStreamConsumer(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterStreamConsumerOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterStreamConsumerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Registers a consumer with a Kinesis data stream. When you use this operation, the consumer you register can read data from the stream at a rate of up to 2 MiB per second. This rate is unaffected by the total number of consumers that read from the same stream. You can register up to 5 consumers per stream. A given consumer can only be registered with one stream. This operation has a limit of five transactions per second per account.
      */
    def registerStreamConsumer(params: RegisterStreamConsumerInput): awsDashSdkLib.libRequestMod.Request[RegisterStreamConsumerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerStreamConsumer(
      params: RegisterStreamConsumerInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterStreamConsumerOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterStreamConsumerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes tags from the specified Kinesis data stream. Removed tags are deleted and cannot be recovered after this operation successfully completes. If you specify a tag that does not exist, it is ignored.  RemoveTagsFromStream has a limit of five transactions per second per account.
      */
    def removeTagsFromStream(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeTagsFromStream(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes tags from the specified Kinesis data stream. Removed tags are deleted and cannot be recovered after this operation successfully completes. If you specify a tag that does not exist, it is ignored.  RemoveTagsFromStream has a limit of five transactions per second per account.
      */
    def removeTagsFromStream(params: RemoveTagsFromStreamInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeTagsFromStream(
      params: RemoveTagsFromStreamInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Splits a shard into two new shards in the Kinesis data stream, to increase the stream's capacity to ingest and transport data. SplitShard is called when there is a need to increase the overall capacity of a stream because of an expected increase in the volume of data records being ingested.  You can also use SplitShard when a shard appears to be approaching its maximum utilization; for example, the producers sending data into the specific shard are suddenly sending more than previously anticipated. You can also call SplitShard to increase stream capacity, so that more Kinesis Data Streams applications can simultaneously read data from the stream for real-time processing.  You must specify the shard to be split and the new hash key, which is the position in the shard where the shard gets split in two. In many cases, the new hash key might be the average of the beginning and ending hash key, but it can be any hash key value in the range being mapped into the shard. For more information, see Split a Shard in the Amazon Kinesis Data Streams Developer Guide. You can use DescribeStream to determine the shard ID and hash key values for the ShardToSplit and NewStartingHashKey parameters that are specified in the SplitShard request.  SplitShard is an asynchronous operation. Upon receiving a SplitShard request, Kinesis Data Streams immediately returns a response and sets the stream status to UPDATING. After the operation is completed, Kinesis Data Streams sets the stream status to ACTIVE. Read and write operations continue to work while the stream is in the UPDATING state.  You can use DescribeStream to check the status of the stream, which is returned in StreamStatus. If the stream is in the ACTIVE state, you can call SplitShard. If a stream is in CREATING or UPDATING or DELETING states, DescribeStream returns a ResourceInUseException. If the specified stream does not exist, DescribeStream returns a ResourceNotFoundException. If you try to create more shards than are authorized for your account, you receive a LimitExceededException.  For the default shard limit for an AWS account, see Kinesis Data Streams Limits in the Amazon Kinesis Data Streams Developer Guide. To increase this limit, contact AWS Support. If you try to operate on too many streams simultaneously using CreateStream, DeleteStream, MergeShards, and/or SplitShard, you receive a LimitExceededException.   SplitShard has a limit of five transactions per second per account.
      */
    def splitShard(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def splitShard(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Splits a shard into two new shards in the Kinesis data stream, to increase the stream's capacity to ingest and transport data. SplitShard is called when there is a need to increase the overall capacity of a stream because of an expected increase in the volume of data records being ingested.  You can also use SplitShard when a shard appears to be approaching its maximum utilization; for example, the producers sending data into the specific shard are suddenly sending more than previously anticipated. You can also call SplitShard to increase stream capacity, so that more Kinesis Data Streams applications can simultaneously read data from the stream for real-time processing.  You must specify the shard to be split and the new hash key, which is the position in the shard where the shard gets split in two. In many cases, the new hash key might be the average of the beginning and ending hash key, but it can be any hash key value in the range being mapped into the shard. For more information, see Split a Shard in the Amazon Kinesis Data Streams Developer Guide. You can use DescribeStream to determine the shard ID and hash key values for the ShardToSplit and NewStartingHashKey parameters that are specified in the SplitShard request.  SplitShard is an asynchronous operation. Upon receiving a SplitShard request, Kinesis Data Streams immediately returns a response and sets the stream status to UPDATING. After the operation is completed, Kinesis Data Streams sets the stream status to ACTIVE. Read and write operations continue to work while the stream is in the UPDATING state.  You can use DescribeStream to check the status of the stream, which is returned in StreamStatus. If the stream is in the ACTIVE state, you can call SplitShard. If a stream is in CREATING or UPDATING or DELETING states, DescribeStream returns a ResourceInUseException. If the specified stream does not exist, DescribeStream returns a ResourceNotFoundException. If you try to create more shards than are authorized for your account, you receive a LimitExceededException.  For the default shard limit for an AWS account, see Kinesis Data Streams Limits in the Amazon Kinesis Data Streams Developer Guide. To increase this limit, contact AWS Support. If you try to operate on too many streams simultaneously using CreateStream, DeleteStream, MergeShards, and/or SplitShard, you receive a LimitExceededException.   SplitShard has a limit of five transactions per second per account.
      */
    def splitShard(params: SplitShardInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def splitShard(
      params: SplitShardInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enables or updates server-side encryption using an AWS KMS key for a specified stream.  Starting encryption is an asynchronous operation. Upon receiving the request, Kinesis Data Streams returns immediately and sets the status of the stream to UPDATING. After the update is complete, Kinesis Data Streams sets the status of the stream back to ACTIVE. Updating or applying encryption normally takes a few seconds to complete, but it can take minutes. You can continue to read and write data to your stream while its status is UPDATING. Once the status of the stream is ACTIVE, encryption begins for records written to the stream.  API Limits: You can successfully apply a new AWS KMS key for server-side encryption 25 times in a rolling 24-hour period. Note: It can take up to 5 seconds after the stream is in an ACTIVE status before all records written to the stream are encrypted. After you enable encryption, you can verify that encryption is applied by inspecting the API response from PutRecord or PutRecords.
      */
    def startStreamEncryption(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startStreamEncryption(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enables or updates server-side encryption using an AWS KMS key for a specified stream.  Starting encryption is an asynchronous operation. Upon receiving the request, Kinesis Data Streams returns immediately and sets the status of the stream to UPDATING. After the update is complete, Kinesis Data Streams sets the status of the stream back to ACTIVE. Updating or applying encryption normally takes a few seconds to complete, but it can take minutes. You can continue to read and write data to your stream while its status is UPDATING. Once the status of the stream is ACTIVE, encryption begins for records written to the stream.  API Limits: You can successfully apply a new AWS KMS key for server-side encryption 25 times in a rolling 24-hour period. Note: It can take up to 5 seconds after the stream is in an ACTIVE status before all records written to the stream are encrypted. After you enable encryption, you can verify that encryption is applied by inspecting the API response from PutRecord or PutRecords.
      */
    def startStreamEncryption(params: StartStreamEncryptionInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startStreamEncryption(
      params: StartStreamEncryptionInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disables server-side encryption for a specified stream.  Stopping encryption is an asynchronous operation. Upon receiving the request, Kinesis Data Streams returns immediately and sets the status of the stream to UPDATING. After the update is complete, Kinesis Data Streams sets the status of the stream back to ACTIVE. Stopping encryption normally takes a few seconds to complete, but it can take minutes. You can continue to read and write data to your stream while its status is UPDATING. Once the status of the stream is ACTIVE, records written to the stream are no longer encrypted by Kinesis Data Streams.  API Limits: You can successfully disable server-side encryption 25 times in a rolling 24-hour period.  Note: It can take up to 5 seconds after the stream is in an ACTIVE status before all records written to the stream are no longer subject to encryption. After you disabled encryption, you can verify that encryption is not applied by inspecting the API response from PutRecord or PutRecords.
      */
    def stopStreamEncryption(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopStreamEncryption(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disables server-side encryption for a specified stream.  Stopping encryption is an asynchronous operation. Upon receiving the request, Kinesis Data Streams returns immediately and sets the status of the stream to UPDATING. After the update is complete, Kinesis Data Streams sets the status of the stream back to ACTIVE. Stopping encryption normally takes a few seconds to complete, but it can take minutes. You can continue to read and write data to your stream while its status is UPDATING. Once the status of the stream is ACTIVE, records written to the stream are no longer encrypted by Kinesis Data Streams.  API Limits: You can successfully disable server-side encryption 25 times in a rolling 24-hour period.  Note: It can take up to 5 seconds after the stream is in an ACTIVE status before all records written to the stream are no longer subject to encryption. After you disabled encryption, you can verify that encryption is not applied by inspecting the API response from PutRecord or PutRecords.
      */
    def stopStreamEncryption(params: StopStreamEncryptionInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopStreamEncryption(
      params: StopStreamEncryptionInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the shard count of the specified stream to the specified number of shards. Updating the shard count is an asynchronous operation. Upon receiving the request, Kinesis Data Streams returns immediately and sets the status of the stream to UPDATING. After the update is complete, Kinesis Data Streams sets the status of the stream back to ACTIVE. Depending on the size of the stream, the scaling action could take a few minutes to complete. You can continue to read and write data to your stream while its status is UPDATING. To update the shard count, Kinesis Data Streams performs splits or merges on individual shards. This can cause short-lived shards to be created, in addition to the final shards. We recommend that you double or halve the shard count, as this results in the fewest number of splits or merges. This operation has the following default limits. By default, you cannot do the following:   Scale more than twice per rolling 24-hour period per stream   Scale up to more than double your current shard count for a stream   Scale down below half your current shard count for a stream   Scale up to more than 500 shards in a stream   Scale a stream with more than 500 shards down unless the result is less than 500 shards   Scale up to more than the shard limit for your account   For the default limits for an AWS account, see Streams Limits in the Amazon Kinesis Data Streams Developer Guide. To request an increase in the call rate limit, the shard limit for this API, or your overall shard limit, use the limits form.
      */
    def updateShardCount(): awsDashSdkLib.libRequestMod.Request[UpdateShardCountOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateShardCount(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateShardCountOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateShardCountOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the shard count of the specified stream to the specified number of shards. Updating the shard count is an asynchronous operation. Upon receiving the request, Kinesis Data Streams returns immediately and sets the status of the stream to UPDATING. After the update is complete, Kinesis Data Streams sets the status of the stream back to ACTIVE. Depending on the size of the stream, the scaling action could take a few minutes to complete. You can continue to read and write data to your stream while its status is UPDATING. To update the shard count, Kinesis Data Streams performs splits or merges on individual shards. This can cause short-lived shards to be created, in addition to the final shards. We recommend that you double or halve the shard count, as this results in the fewest number of splits or merges. This operation has the following default limits. By default, you cannot do the following:   Scale more than twice per rolling 24-hour period per stream   Scale up to more than double your current shard count for a stream   Scale down below half your current shard count for a stream   Scale up to more than 500 shards in a stream   Scale a stream with more than 500 shards down unless the result is less than 500 shards   Scale up to more than the shard limit for your account   For the default limits for an AWS account, see Streams Limits in the Amazon Kinesis Data Streams Developer Guide. To request an increase in the call rate limit, the shard limit for this API, or your overall shard limit, use the limits form.
      */
    def updateShardCount(params: UpdateShardCountInput): awsDashSdkLib.libRequestMod.Request[UpdateShardCountOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateShardCount(
      params: UpdateShardCountInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateShardCountOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateShardCountOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the streamExists state by periodically calling the underlying Kinesis.describeStreamoperation every 10 seconds (at most 18 times).
      */
    @JSName("waitFor")
    def waitFor_streamExists(state: awsDashSdkLib.awsDashSdkLibStrings.streamExists): awsDashSdkLib.libRequestMod.Request[DescribeStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_streamExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.streamExists,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStreamOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the streamExists state by periodically calling the underlying Kinesis.describeStreamoperation every 10 seconds (at most 18 times).
      */
    @JSName("waitFor")
    def waitFor_streamExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.streamExists,
      params: DescribeStreamInput with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_streamExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.streamExists,
      params: DescribeStreamInput with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStreamOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the streamNotExists state by periodically calling the underlying Kinesis.describeStreamoperation every 10 seconds (at most 18 times).
      */
    @JSName("waitFor")
    def waitFor_streamNotExists(state: awsDashSdkLib.awsDashSdkLibStrings.streamNotExists): awsDashSdkLib.libRequestMod.Request[DescribeStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_streamNotExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.streamNotExists,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStreamOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the streamNotExists state by periodically calling the underlying Kinesis.describeStreamoperation every 10 seconds (at most 18 times).
      */
    @JSName("waitFor")
    def waitFor_streamNotExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.streamNotExists,
      params: DescribeStreamInput with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_streamNotExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.streamNotExists,
      params: DescribeStreamInput with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStreamOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UpdateShardCountInput extends js.Object {
    /**
      * The scaling type. Uniform scaling creates shards of equal size.
      */
    var ScalingType: ScalingType
    /**
      * The name of the stream.
      */
    var StreamName: StreamName
    /**
      * The new number of shards.
      */
    var TargetShardCount: PositiveIntegerObject
  }
  
  trait UpdateShardCountOutput extends js.Object {
    /**
      * The current number of shards.
      */
    var CurrentShardCount: js.UndefOr[PositiveIntegerObject] = js.undefined
    /**
      * The name of the stream.
      */
    var StreamName: js.UndefOr[StreamName] = js.undefined
    /**
      * The updated number of shards.
      */
    var TargetShardCount: js.UndefOr[PositiveIntegerObject] = js.undefined
  }
  
  trait _ConsumerStatus extends js.Object
  
  trait _EncryptionType extends js.Object
  
  trait _MetricsName extends js.Object
  
  trait _ShardIteratorType extends js.Object
  
  trait _StreamStatus extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type BooleanObject = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ConsumerARN = java.lang.String
  type ConsumerCountObject = scala.Double
  type ConsumerList = js.Array[Consumer]
  type ConsumerName = java.lang.String
  type ConsumerStatus = _ConsumerStatus | java.lang.String
  type Data = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsKinesisMod.Blob | java.lang.String
  type DescribeStreamInputLimit = scala.Double
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
  type ShardIteratorType = _ShardIteratorType | java.lang.String
  type ShardList = js.Array[Shard]
  type StreamARN = java.lang.String
  type StreamName = java.lang.String
  type StreamNameList = js.Array[StreamName]
  type StreamStatus = _StreamStatus | java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type Timestamp = stdLib.Date
  type apiVersion = _apiVersion | java.lang.String
}

