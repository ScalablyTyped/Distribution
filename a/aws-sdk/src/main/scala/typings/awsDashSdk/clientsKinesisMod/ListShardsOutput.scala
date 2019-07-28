package typings.awsDashSdk.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListShardsOutput extends js.Object {
  /**
    * When the number of shards in the data stream is greater than the default value for the MaxResults parameter, or if you explicitly specify a value for MaxResults that is less than the number of shards in the data stream, the response includes a pagination token named NextToken. You can specify this NextToken value in a subsequent call to ListShards to list the next set of shards. For more information about the use of this pagination token when calling the ListShards operation, see ListShardsInput$NextToken.  Tokens expire after 300 seconds. When you obtain a value for NextToken in the response to a call to ListShards, you have 300 seconds to use that value. If you specify an expired token in a call to ListShards, you get ExpiredNextTokenException. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsKinesisMod.NextToken] = js.undefined
  /**
    * An array of JSON objects. Each object represents one shard and specifies the IDs of the shard, the shard's parent, and the shard that's adjacent to the shard's parent. Each object also contains the starting and ending hash keys and the starting and ending sequence numbers for the shard.
    */
  var Shards: js.UndefOr[ShardList] = js.undefined
}

object ListShardsOutput {
  @scala.inline
  def apply(NextToken: NextToken = null, Shards: ShardList = null): ListShardsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Shards != null) __obj.updateDynamic("Shards")(Shards)
    __obj.asInstanceOf[ListShardsOutput]
  }
}

