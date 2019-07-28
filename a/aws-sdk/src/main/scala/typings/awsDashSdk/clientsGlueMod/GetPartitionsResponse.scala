package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPartitionsResponse extends js.Object {
  /**
    * A continuation token, if the returned list of partitions does not does not include the last one.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  /**
    * A list of requested partitions.
    */
  var Partitions: js.UndefOr[PartitionList] = js.undefined
}

object GetPartitionsResponse {
  @scala.inline
  def apply(NextToken: Token = null, Partitions: PartitionList = null): GetPartitionsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Partitions != null) __obj.updateDynamic("Partitions")(Partitions)
    __obj.asInstanceOf[GetPartitionsResponse]
  }
}

