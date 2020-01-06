package typings.awsDashSdk.clientsDynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRecordsOutput extends js.Object {
  /**
    * The next position in the shard from which to start sequentially reading stream records. If set to null, the shard has been closed and the requested iterator will not return any more data.
    */
  var NextShardIterator: js.UndefOr[ShardIterator] = js.native
  /**
    * The stream records from the shard, which were retrieved using the shard iterator.
    */
  var Records: js.UndefOr[RecordList] = js.native
}

object GetRecordsOutput {
  @scala.inline
  def apply(NextShardIterator: ShardIterator = null, Records: RecordList = null): GetRecordsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextShardIterator != null) __obj.updateDynamic("NextShardIterator")(NextShardIterator.asInstanceOf[js.Any])
    if (Records != null) __obj.updateDynamic("Records")(Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecordsOutput]
  }
}

