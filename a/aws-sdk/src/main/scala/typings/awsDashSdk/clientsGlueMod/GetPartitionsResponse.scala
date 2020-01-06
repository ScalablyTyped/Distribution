package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPartitionsResponse extends js.Object {
  /**
    * A continuation token, if the returned list of partitions does not include the last one.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * A list of requested partitions.
    */
  var Partitions: js.UndefOr[PartitionList] = js.native
}

object GetPartitionsResponse {
  @scala.inline
  def apply(NextToken: Token = null, Partitions: PartitionList = null): GetPartitionsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Partitions != null) __obj.updateDynamic("Partitions")(Partitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPartitionsResponse]
  }
}

