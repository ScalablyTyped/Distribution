package typings
package awsDashSdkLib.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

object ListShardsInput {
  @scala.inline
  def apply(
    ExclusiveStartShardId: ShardId = null,
    MaxResults: js.UndefOr[ListShardsInputLimit] = js.undefined,
    NextToken: NextToken = null,
    StreamCreationTimestamp: Timestamp = null,
    StreamName: StreamName = null
  ): ListShardsInput = {
    val __obj = js.Dynamic.literal()
    if (ExclusiveStartShardId != null) __obj.updateDynamic("ExclusiveStartShardId")(ExclusiveStartShardId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (StreamCreationTimestamp != null) __obj.updateDynamic("StreamCreationTimestamp")(StreamCreationTimestamp)
    if (StreamName != null) __obj.updateDynamic("StreamName")(StreamName)
    __obj.asInstanceOf[ListShardsInput]
  }
}

