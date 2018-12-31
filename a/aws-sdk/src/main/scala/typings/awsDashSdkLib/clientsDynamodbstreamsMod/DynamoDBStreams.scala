package typings
package awsDashSdkLib.clientsDynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamoDBStreams
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_DynamoDBStreams: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsDynamodbstreamsMod.DynamoDBStreamsNs.ClientConfiguration = js.native
  /**
    * Returns information about a stream, including the current status of the stream, its Amazon Resource Name (ARN), the composition of its shards, and its corresponding DynamoDB table.  You can call DescribeStream at a maximum rate of 10 times per second.  Each shard in the stream has a SequenceNumberRange associated with it. If the SequenceNumberRange has a StartingSequenceNumber but no EndingSequenceNumber, then the shard is still open (able to receive more stream records). If both StartingSequenceNumber and EndingSequenceNumber are present, then that shard is closed and can no longer receive more data.
    */
  def describeStream(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbstreamsMod.DynamoDBStreamsNs.DescribeStreamOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeStream(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbstreamsMod.DynamoDBStreamsNs.DescribeStreamOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbstreamsMod.DynamoDBStreamsNs.DescribeStreamOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a stream, including the current status of the stream, its Amazon Resource Name (ARN), the composition of its shards, and its corresponding DynamoDB table.  You can call DescribeStream at a maximum rate of 10 times per second.  Each shard in the stream has a SequenceNumberRange associated with it. If the SequenceNumberRange has a StartingSequenceNumber but no EndingSequenceNumber, then the shard is still open (able to receive more stream records). If both StartingSequenceNumber and EndingSequenceNumber are present, then that shard is closed and can no longer receive more data.
    */
  def describeStream(params: awsDashSdkLib.clientsDynamodbstreamsMod.DynamoDBStreamsNs.DescribeStreamInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbstreamsMod.DynamoDBStreamsNs.DescribeStreamOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeStream(
    params: awsDashSdkLib.clientsDynamodbstreamsMod.DynamoDBStreamsNs.DescribeStreamInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbstreamsMod.DynamoDBStreamsNs.DescribeStreamOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbstreamsMod.DynamoDBStreamsNs.DescribeStreamOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the stream records from a given shard. Specify a shard iterator using the ShardIterator parameter. The shard iterator specifies the position in the shard from which you want to start reading stream records sequentially. If there are no stream records available in the portion of the shard that the iterator points to, GetRecords returns an empty list. Note that it might take multiple calls to get to a portion of the shard that contains stream records.   GetRecords can retrieve a maximum of 1 MB of data or 1000 stream records, whichever comes first. 
    */
  def getRecords(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbstreamsMod.DynamoDBStreamsNs.GetRecordsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getRecords(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbstreamsMod.DynamoDBStreamsNs.GetRecordsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbstreamsMod.DynamoDBStreamsNs.GetRecordsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the stream records from a given shard. Specify a shard iterator using the ShardIterator parameter. The shard iterator specifies the position in the shard from which you want to start reading stream records sequentially. If there are no stream records available in the portion of the shard that the iterator points to, GetRecords returns an empty list. Note that it might take multiple calls to get to a portion of the shard that contains stream records.   GetRecords can retrieve a maximum of 1 MB of data or 1000 stream records, whichever comes first. 
    */
  def getRecords(params: awsDashSdkLib.clientsDynamodbstreamsMod.DynamoDBStreamsNs.GetRecordsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbstreamsMod.DynamoDBStreamsNs.GetRecordsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getRecords(
    params: awsDashSdkLib.clientsDynamodbstreamsMod.DynamoDBStreamsNs.GetRecordsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbstreamsMod.DynamoDBStreamsNs.GetRecordsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbstreamsMod.DynamoDBStreamsNs.GetRecordsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a shard iterator. A shard iterator provides information about how to retrieve the stream records from within a shard. Use the shard iterator in a subsequent GetRecords request to read the stream records from the shard.  A shard iterator expires 15 minutes after it is returned to the requester. 
    */
  def getShardIterator(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbstreamsMod.DynamoDBStreamsNs.GetShardIteratorOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getShardIterator(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbstreamsMod.DynamoDBStreamsNs.GetShardIteratorOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbstreamsMod.DynamoDBStreamsNs.GetShardIteratorOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a shard iterator. A shard iterator provides information about how to retrieve the stream records from within a shard. Use the shard iterator in a subsequent GetRecords request to read the stream records from the shard.  A shard iterator expires 15 minutes after it is returned to the requester. 
    */
  def getShardIterator(params: awsDashSdkLib.clientsDynamodbstreamsMod.DynamoDBStreamsNs.GetShardIteratorInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbstreamsMod.DynamoDBStreamsNs.GetShardIteratorOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getShardIterator(
    params: awsDashSdkLib.clientsDynamodbstreamsMod.DynamoDBStreamsNs.GetShardIteratorInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbstreamsMod.DynamoDBStreamsNs.GetShardIteratorOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbstreamsMod.DynamoDBStreamsNs.GetShardIteratorOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns an array of stream ARNs associated with the current account and endpoint. If the TableName parameter is present, then ListStreams will return only the streams ARNs for that table.  You can call ListStreams at a maximum rate of 5 times per second. 
    */
  def listStreams(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbstreamsMod.DynamoDBStreamsNs.ListStreamsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listStreams(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbstreamsMod.DynamoDBStreamsNs.ListStreamsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbstreamsMod.DynamoDBStreamsNs.ListStreamsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns an array of stream ARNs associated with the current account and endpoint. If the TableName parameter is present, then ListStreams will return only the streams ARNs for that table.  You can call ListStreams at a maximum rate of 5 times per second. 
    */
  def listStreams(params: awsDashSdkLib.clientsDynamodbstreamsMod.DynamoDBStreamsNs.ListStreamsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbstreamsMod.DynamoDBStreamsNs.ListStreamsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listStreams(
    params: awsDashSdkLib.clientsDynamodbstreamsMod.DynamoDBStreamsNs.ListStreamsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDynamodbstreamsMod.DynamoDBStreamsNs.ListStreamsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDynamodbstreamsMod.DynamoDBStreamsNs.ListStreamsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

