package typings
package awsDashSdkLib.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRecordsInput extends js.Object {
  /**
    * The maximum number of records to return. Specify a value of up to 10,000. If you specify a value that is greater than 10,000, GetRecords throws InvalidArgumentException.
    */
  var Limit: js.UndefOr[GetRecordsInputLimit] = js.undefined
  /**
    * The position in the shard from which you want to start sequentially reading data records. A shard iterator specifies this position using the sequence number of a data record in the shard.
    */
  var ShardIterator: awsDashSdkLib.clientsKinesisMod.ShardIterator
}

object GetRecordsInput {
  @scala.inline
  def apply(ShardIterator: ShardIterator, Limit: js.UndefOr[GetRecordsInputLimit] = js.undefined): GetRecordsInput = {
    val __obj = js.Dynamic.literal(ShardIterator = ShardIterator)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    __obj.asInstanceOf[GetRecordsInput]
  }
}

