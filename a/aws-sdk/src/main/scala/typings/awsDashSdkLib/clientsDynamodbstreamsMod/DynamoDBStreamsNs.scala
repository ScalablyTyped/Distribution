package typings
package awsDashSdkLib.clientsDynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/dynamodbstreams", "DynamoDBStreams")
@js.native
object DynamoDBStreamsNs extends js.Object {
  
  trait AttributeMap
    extends /* key */ ScalablyTyped.runtime.StringDictionary[AttributeValue]
  
  
  trait AttributeValue extends js.Object {
    /**
         * A Binary data type.
         */
    var B: js.UndefOr[BinaryAttributeValue] = js.undefined
    /**
         * A Boolean data type.
         */
    var BOOL: js.UndefOr[BooleanAttributeValue] = js.undefined
    /**
         * A Binary Set data type.
         */
    var BS: js.UndefOr[BinarySetAttributeValue] = js.undefined
    /**
         * A List data type.
         */
    var L: js.UndefOr[ListAttributeValue] = js.undefined
    /**
         * A Map data type.
         */
    var M: js.UndefOr[MapAttributeValue] = js.undefined
    /**
         * A Number data type.
         */
    var N: js.UndefOr[NumberAttributeValue] = js.undefined
    /**
         * A Number Set data type.
         */
    var NS: js.UndefOr[NumberSetAttributeValue] = js.undefined
    /**
         * A Null data type.
         */
    var NULL: js.UndefOr[NullAttributeValue] = js.undefined
    /**
         * A String data type.
         */
    var S: js.UndefOr[StringAttributeValue] = js.undefined
    /**
         * A String Set data type.
         */
    var SS: js.UndefOr[StringSetAttributeValue] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait DescribeStreamInput extends js.Object {
    /**
         * The shard ID of the first item that this operation will evaluate. Use the value that was returned for LastEvaluatedShardId in the previous operation. 
         */
    var ExclusiveStartShardId: js.UndefOr[ShardId] = js.undefined
    /**
         * The maximum number of shard objects to return. The upper limit is 100.
         */
    var Limit: js.UndefOr[PositiveIntegerObject] = js.undefined
    /**
         * The Amazon Resource Name (ARN) for the stream.
         */
    var StreamArn: StreamArn
  }
  
  
  trait DescribeStreamOutput extends js.Object {
    /**
         * A complete description of the stream, including its creation date and time, the DynamoDB table associated with the stream, the shard IDs within the stream, and the beginning and ending sequence numbers of stream records within the shards.
         */
    var StreamDescription: js.UndefOr[StreamDescription] = js.undefined
  }
  
  
  trait GetRecordsInput extends js.Object {
    /**
         * The maximum number of records to return from the shard. The upper limit is 1000.
         */
    var Limit: js.UndefOr[PositiveIntegerObject] = js.undefined
    /**
         * A shard iterator that was retrieved from a previous GetShardIterator operation. This iterator can be used to access the stream records in this shard.
         */
    var ShardIterator: ShardIterator
  }
  
  
  trait GetRecordsOutput extends js.Object {
    /**
         * The next position in the shard from which to start sequentially reading stream records. If set to null, the shard has been closed and the requested iterator will not return any more data.
         */
    var NextShardIterator: js.UndefOr[ShardIterator] = js.undefined
    /**
         * The stream records from the shard, which were retrieved using the shard iterator.
         */
    var Records: js.UndefOr[RecordList] = js.undefined
  }
  
  
  trait GetShardIteratorInput extends js.Object {
    /**
         * The sequence number of a stream record in the shard from which to start reading.
         */
    var SequenceNumber: js.UndefOr[SequenceNumber] = js.undefined
    /**
         * The identifier of the shard. The iterator will be returned for this shard ID.
         */
    var ShardId: ShardId
    /**
         * Determines how the shard iterator is used to start reading stream records from the shard:    AT_SEQUENCE_NUMBER - Start reading exactly from the position denoted by a specific sequence number.    AFTER_SEQUENCE_NUMBER - Start reading right after the position denoted by a specific sequence number.    TRIM_HORIZON - Start reading at the last (untrimmed) stream record, which is the oldest record in the shard. In DynamoDB Streams, there is a 24 hour limit on data retention. Stream records whose age exceeds this limit are subject to removal (trimming) from the stream.    LATEST - Start reading just after the most recent stream record in the shard, so that you always read the most recent data in the shard.  
         */
    var ShardIteratorType: ShardIteratorType
    /**
         * The Amazon Resource Name (ARN) for the stream.
         */
    var StreamArn: StreamArn
  }
  
  
  trait GetShardIteratorOutput extends js.Object {
    /**
         * The position in the shard from which to start reading stream records sequentially. A shard iterator specifies this position using the sequence number of a stream record in a shard.
         */
    var ShardIterator: js.UndefOr[ShardIterator] = js.undefined
  }
  
  
  trait Identity extends js.Object {
    /**
         * A unique identifier for the entity that made the call. For Time To Live, the principalId is "dynamodb.amazonaws.com".
         */
    var PrincipalId: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The type of the identity. For Time To Live, the type is "Service".
         */
    var Type: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait KeySchemaElement extends js.Object {
    /**
         * The name of a key attribute.
         */
    var AttributeName: KeySchemaAttributeName
    /**
         * The attribute data, consisting of the data type and the attribute value itself.
         */
    var KeyType: KeyType
  }
  
  
  trait ListStreamsInput extends js.Object {
    /**
         * The ARN (Amazon Resource Name) of the first item that this operation will evaluate. Use the value that was returned for LastEvaluatedStreamArn in the previous operation. 
         */
    var ExclusiveStartStreamArn: js.UndefOr[StreamArn] = js.undefined
    /**
         * The maximum number of streams to return. The upper limit is 100.
         */
    var Limit: js.UndefOr[PositiveIntegerObject] = js.undefined
    /**
         * If this parameter is provided, then only the streams associated with this table name are returned.
         */
    var TableName: js.UndefOr[TableName] = js.undefined
  }
  
  
  trait ListStreamsOutput extends js.Object {
    /**
         * The stream ARN of the item where the operation stopped, inclusive of the previous result set. Use this value to start a new operation, excluding this value in the new request. If LastEvaluatedStreamArn is empty, then the "last page" of results has been processed and there is no more data to be retrieved. If LastEvaluatedStreamArn is not empty, it does not necessarily mean that there is more data in the result set. The only way to know when you have reached the end of the result set is when LastEvaluatedStreamArn is empty.
         */
    var LastEvaluatedStreamArn: js.UndefOr[StreamArn] = js.undefined
    /**
         * A list of stream descriptors associated with the current account and endpoint.
         */
    var Streams: js.UndefOr[StreamList] = js.undefined
  }
  
  
  trait MapAttributeValue
    extends /* key */ ScalablyTyped.runtime.StringDictionary[AttributeValue]
  
  
  trait Record extends js.Object {
    /**
         * The region in which the GetRecords request was received.
         */
    var awsRegion: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The main body of the stream record, containing all of the DynamoDB-specific fields.
         */
    var dynamodb: js.UndefOr[StreamRecord] = js.undefined
    /**
         * A globally unique identifier for the event that was recorded in this stream record.
         */
    var eventID: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The type of data modification that was performed on the DynamoDB table:    INSERT - a new item was added to the table.    MODIFY - one or more of an existing item's attributes were modified.    REMOVE - the item was deleted from the table  
         */
    var eventName: js.UndefOr[OperationType] = js.undefined
    /**
         * The AWS service from which the stream record originated. For DynamoDB Streams, this is aws:dynamodb.
         */
    var eventSource: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The version number of the stream record format. This number is updated whenever the structure of Record is modified. Client applications must not assume that eventVersion will remain at a particular value, as this number is subject to change at any time. In general, eventVersion will only increase as the low-level DynamoDB Streams API evolves.
         */
    var eventVersion: js.UndefOr[java.lang.String] = js.undefined
    /**
         * Items that are deleted by the Time to Live process after expiration have the following fields:    Records[].userIdentity.type "Service"   Records[].userIdentity.principalId "dynamodb.amazonaws.com"  
         */
    var userIdentity: js.UndefOr[Identity] = js.undefined
  }
  
  
  trait SequenceNumberRange extends js.Object {
    /**
         * The last sequence number.
         */
    var EndingSequenceNumber: js.UndefOr[SequenceNumber] = js.undefined
    /**
         * The first sequence number.
         */
    var StartingSequenceNumber: js.UndefOr[SequenceNumber] = js.undefined
  }
  
  
  trait Shard extends js.Object {
    /**
         * The shard ID of the current shard's parent.
         */
    var ParentShardId: js.UndefOr[ShardId] = js.undefined
    /**
         * The range of possible sequence numbers for the shard.
         */
    var SequenceNumberRange: js.UndefOr[SequenceNumberRange] = js.undefined
    /**
         * The system-generated identifier for this shard.
         */
    var ShardId: js.UndefOr[ShardId] = js.undefined
  }
  
  
  trait Stream extends js.Object {
    /**
         * The Amazon Resource Name (ARN) for the stream.
         */
    var StreamArn: js.UndefOr[StreamArn] = js.undefined
    /**
         * A timestamp, in ISO 8601 format, for this stream. Note that LatestStreamLabel is not a unique identifier for the stream, because it is possible that a stream from another table might have the same timestamp. However, the combination of the following three elements is guaranteed to be unique:   the AWS customer ID.   the table name   the StreamLabel   
         */
    var StreamLabel: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The DynamoDB table with which the stream is associated.
         */
    var TableName: js.UndefOr[TableName] = js.undefined
  }
  
  
  trait StreamDescription extends js.Object {
    /**
         * The date and time when the request to create this stream was issued.
         */
    var CreationRequestDateTime: js.UndefOr[_Date] = js.undefined
    /**
         * The key attribute(s) of the stream's DynamoDB table.
         */
    var KeySchema: js.UndefOr[KeySchema] = js.undefined
    /**
         * The shard ID of the item where the operation stopped, inclusive of the previous result set. Use this value to start a new operation, excluding this value in the new request. If LastEvaluatedShardId is empty, then the "last page" of results has been processed and there is currently no more data to be retrieved. If LastEvaluatedShardId is not empty, it does not necessarily mean that there is more data in the result set. The only way to know when you have reached the end of the result set is when LastEvaluatedShardId is empty.
         */
    var LastEvaluatedShardId: js.UndefOr[ShardId] = js.undefined
    /**
         * The shards that comprise the stream.
         */
    var Shards: js.UndefOr[ShardDescriptionList] = js.undefined
    /**
         * The Amazon Resource Name (ARN) for the stream.
         */
    var StreamArn: js.UndefOr[StreamArn] = js.undefined
    /**
         * A timestamp, in ISO 8601 format, for this stream. Note that LatestStreamLabel is not a unique identifier for the stream, because it is possible that a stream from another table might have the same timestamp. However, the combination of the following three elements is guaranteed to be unique:   the AWS customer ID.   the table name   the StreamLabel   
         */
    var StreamLabel: js.UndefOr[java.lang.String] = js.undefined
    /**
         * Indicates the current status of the stream:    ENABLING - Streams is currently being enabled on the DynamoDB table.    ENABLED - the stream is enabled.    DISABLING - Streams is currently being disabled on the DynamoDB table.    DISABLED - the stream is disabled.  
         */
    var StreamStatus: js.UndefOr[StreamStatus] = js.undefined
    /**
         * Indicates the format of the records within this stream:    KEYS_ONLY - only the key attributes of items that were modified in the DynamoDB table.    NEW_IMAGE - entire items from the table, as they appeared after they were modified.    OLD_IMAGE - entire items from the table, as they appeared before they were modified.    NEW_AND_OLD_IMAGES - both the new and the old images of the items from the table.  
         */
    var StreamViewType: js.UndefOr[StreamViewType] = js.undefined
    /**
         * The DynamoDB table with which the stream is associated.
         */
    var TableName: js.UndefOr[TableName] = js.undefined
  }
  
  
  trait StreamRecord extends js.Object {
    /**
         * The approximate date and time when the stream record was created, in UNIX epoch time format.
         */
    var ApproximateCreationDateTime: js.UndefOr[_Date] = js.undefined
    /**
         * The primary key attribute(s) for the DynamoDB item that was modified.
         */
    var Keys: js.UndefOr[AttributeMap] = js.undefined
    /**
         * The item in the DynamoDB table as it appeared after it was modified.
         */
    var NewImage: js.UndefOr[AttributeMap] = js.undefined
    /**
         * The item in the DynamoDB table as it appeared before it was modified.
         */
    var OldImage: js.UndefOr[AttributeMap] = js.undefined
    /**
         * The sequence number of the stream record.
         */
    var SequenceNumber: js.UndefOr[SequenceNumber] = js.undefined
    /**
         * The size of the stream record, in bytes.
         */
    var SizeBytes: js.UndefOr[PositiveLongObject] = js.undefined
    /**
         * The type of data from the modified DynamoDB item that was captured in this stream record:    KEYS_ONLY - only the key attributes of the modified item.    NEW_IMAGE - the entire item, as it appeared after it was modified.    OLD_IMAGE - the entire item, as it appeared before it was modified.    NEW_AND_OLD_IMAGES - both the new and the old item images of the item.  
         */
    var StreamViewType: js.UndefOr[StreamViewType] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Returns information about a stream, including the current status of the stream, its Amazon Resource Name (ARN), the composition of its shards, and its corresponding DynamoDB table.  You can call DescribeStream at a maximum rate of 10 times per second.  Each shard in the stream has a SequenceNumberRange associated with it. If the SequenceNumberRange has a StartingSequenceNumber but no EndingSequenceNumber, then the shard is still open (able to receive more stream records). If both StartingSequenceNumber and EndingSequenceNumber are present, then that shard is closed and can no longer receive more data.
       */
    def describeStream(): awsDashSdkLib.libRequestMod.Request[DescribeStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about a stream, including the current status of the stream, its Amazon Resource Name (ARN), the composition of its shards, and its corresponding DynamoDB table.  You can call DescribeStream at a maximum rate of 10 times per second.  Each shard in the stream has a SequenceNumberRange associated with it. If the SequenceNumberRange has a StartingSequenceNumber but no EndingSequenceNumber, then the shard is still open (able to receive more stream records). If both StartingSequenceNumber and EndingSequenceNumber are present, then that shard is closed and can no longer receive more data.
       */
    def describeStream(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStreamOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about a stream, including the current status of the stream, its Amazon Resource Name (ARN), the composition of its shards, and its corresponding DynamoDB table.  You can call DescribeStream at a maximum rate of 10 times per second.  Each shard in the stream has a SequenceNumberRange associated with it. If the SequenceNumberRange has a StartingSequenceNumber but no EndingSequenceNumber, then the shard is still open (able to receive more stream records). If both StartingSequenceNumber and EndingSequenceNumber are present, then that shard is closed and can no longer receive more data.
       */
    def describeStream(params: DescribeStreamInput): awsDashSdkLib.libRequestMod.Request[DescribeStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about a stream, including the current status of the stream, its Amazon Resource Name (ARN), the composition of its shards, and its corresponding DynamoDB table.  You can call DescribeStream at a maximum rate of 10 times per second.  Each shard in the stream has a SequenceNumberRange associated with it. If the SequenceNumberRange has a StartingSequenceNumber but no EndingSequenceNumber, then the shard is still open (able to receive more stream records). If both StartingSequenceNumber and EndingSequenceNumber are present, then that shard is closed and can no longer receive more data.
       */
    def describeStream(
      params: DescribeStreamInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStreamOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStreamOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the stream records from a given shard. Specify a shard iterator using the ShardIterator parameter. The shard iterator specifies the position in the shard from which you want to start reading stream records sequentially. If there are no stream records available in the portion of the shard that the iterator points to, GetRecords returns an empty list. Note that it might take multiple calls to get to a portion of the shard that contains stream records.   GetRecords can retrieve a maximum of 1 MB of data or 1000 stream records, whichever comes first. 
       */
    def getRecords(): awsDashSdkLib.libRequestMod.Request[GetRecordsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the stream records from a given shard. Specify a shard iterator using the ShardIterator parameter. The shard iterator specifies the position in the shard from which you want to start reading stream records sequentially. If there are no stream records available in the portion of the shard that the iterator points to, GetRecords returns an empty list. Note that it might take multiple calls to get to a portion of the shard that contains stream records.   GetRecords can retrieve a maximum of 1 MB of data or 1000 stream records, whichever comes first. 
       */
    def getRecords(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetRecordsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetRecordsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the stream records from a given shard. Specify a shard iterator using the ShardIterator parameter. The shard iterator specifies the position in the shard from which you want to start reading stream records sequentially. If there are no stream records available in the portion of the shard that the iterator points to, GetRecords returns an empty list. Note that it might take multiple calls to get to a portion of the shard that contains stream records.   GetRecords can retrieve a maximum of 1 MB of data or 1000 stream records, whichever comes first. 
       */
    def getRecords(params: GetRecordsInput): awsDashSdkLib.libRequestMod.Request[GetRecordsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the stream records from a given shard. Specify a shard iterator using the ShardIterator parameter. The shard iterator specifies the position in the shard from which you want to start reading stream records sequentially. If there are no stream records available in the portion of the shard that the iterator points to, GetRecords returns an empty list. Note that it might take multiple calls to get to a portion of the shard that contains stream records.   GetRecords can retrieve a maximum of 1 MB of data or 1000 stream records, whichever comes first. 
       */
    def getRecords(
      params: GetRecordsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetRecordsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetRecordsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a shard iterator. A shard iterator provides information about how to retrieve the stream records from within a shard. Use the shard iterator in a subsequent GetRecords request to read the stream records from the shard.  A shard iterator expires 15 minutes after it is returned to the requester. 
       */
    def getShardIterator(): awsDashSdkLib.libRequestMod.Request[GetShardIteratorOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a shard iterator. A shard iterator provides information about how to retrieve the stream records from within a shard. Use the shard iterator in a subsequent GetRecords request to read the stream records from the shard.  A shard iterator expires 15 minutes after it is returned to the requester. 
       */
    def getShardIterator(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetShardIteratorOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetShardIteratorOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a shard iterator. A shard iterator provides information about how to retrieve the stream records from within a shard. Use the shard iterator in a subsequent GetRecords request to read the stream records from the shard.  A shard iterator expires 15 minutes after it is returned to the requester. 
       */
    def getShardIterator(params: GetShardIteratorInput): awsDashSdkLib.libRequestMod.Request[GetShardIteratorOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a shard iterator. A shard iterator provides information about how to retrieve the stream records from within a shard. Use the shard iterator in a subsequent GetRecords request to read the stream records from the shard.  A shard iterator expires 15 minutes after it is returned to the requester. 
       */
    def getShardIterator(
      params: GetShardIteratorInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetShardIteratorOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetShardIteratorOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of stream ARNs associated with the current account and endpoint. If the TableName parameter is present, then ListStreams will return only the streams ARNs for that table.  You can call ListStreams at a maximum rate of 5 times per second. 
       */
    def listStreams(): awsDashSdkLib.libRequestMod.Request[ListStreamsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of stream ARNs associated with the current account and endpoint. If the TableName parameter is present, then ListStreams will return only the streams ARNs for that table.  You can call ListStreams at a maximum rate of 5 times per second. 
       */
    def listStreams(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListStreamsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListStreamsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of stream ARNs associated with the current account and endpoint. If the TableName parameter is present, then ListStreams will return only the streams ARNs for that table.  You can call ListStreams at a maximum rate of 5 times per second. 
       */
    def listStreams(params: ListStreamsInput): awsDashSdkLib.libRequestMod.Request[ListStreamsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of stream ARNs associated with the current account and endpoint. If the TableName parameter is present, then ListStreams will return only the streams ARNs for that table.  You can call ListStreams at a maximum rate of 5 times per second. 
       */
    def listStreams(
      params: ListStreamsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListStreamsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListStreamsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  val TypesNs: this.type = js.native
  type AttributeName = java.lang.String
  type BinaryAttributeValue = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsDynamodbstreamsMod.Blob | java.lang.String
  type BinarySetAttributeValue = js.Array[BinaryAttributeValue]
  type BooleanAttributeValue = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type KeySchema = js.Array[KeySchemaElement]
  type KeySchemaAttributeName = java.lang.String
  type KeyType = awsDashSdkLib.awsDashSdkLibStrings.HASH | awsDashSdkLib.awsDashSdkLibStrings.RANGE | java.lang.String
  type ListAttributeValue = js.Array[AttributeValue]
  type NullAttributeValue = scala.Boolean
  type NumberAttributeValue = java.lang.String
  type NumberSetAttributeValue = js.Array[NumberAttributeValue]
  type OperationType = awsDashSdkLib.awsDashSdkLibStrings.INSERT | awsDashSdkLib.awsDashSdkLibStrings.MODIFY | awsDashSdkLib.awsDashSdkLibStrings.REMOVE | java.lang.String
  type PositiveIntegerObject = scala.Double
  type PositiveLongObject = scala.Double
  type RecordList = js.Array[Record]
  type SequenceNumber = java.lang.String
  type ShardDescriptionList = js.Array[Shard]
  type ShardId = java.lang.String
  type ShardIterator = java.lang.String
  type ShardIteratorType = awsDashSdkLib.awsDashSdkLibStrings.TRIM_HORIZON | awsDashSdkLib.awsDashSdkLibStrings.LATEST | awsDashSdkLib.awsDashSdkLibStrings.AT_SEQUENCE_NUMBER | awsDashSdkLib.awsDashSdkLibStrings.AFTER_SEQUENCE_NUMBER | java.lang.String
  type StreamArn = java.lang.String
  type StreamList = js.Array[Stream]
  type StreamStatus = awsDashSdkLib.awsDashSdkLibStrings.ENABLING | awsDashSdkLib.awsDashSdkLibStrings.ENABLED | awsDashSdkLib.awsDashSdkLibStrings.DISABLING | awsDashSdkLib.awsDashSdkLibStrings.DISABLED | java.lang.String
  type StreamViewType = awsDashSdkLib.awsDashSdkLibStrings.NEW_IMAGE | awsDashSdkLib.awsDashSdkLibStrings.OLD_IMAGE | awsDashSdkLib.awsDashSdkLibStrings.NEW_AND_OLD_IMAGES | awsDashSdkLib.awsDashSdkLibStrings.KEYS_ONLY | java.lang.String
  type String = java.lang.String
  type StringAttributeValue = java.lang.String
  type StringSetAttributeValue = js.Array[StringAttributeValue]
  type TableName = java.lang.String
  type _Date = stdLib.Date
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2012-08-10` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

