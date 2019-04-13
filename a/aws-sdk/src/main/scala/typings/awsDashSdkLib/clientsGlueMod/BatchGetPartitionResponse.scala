package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetPartitionResponse extends js.Object {
  /**
    * A list of the requested partitions.
    */
  var Partitions: js.UndefOr[PartitionList] = js.undefined
  /**
    * A list of the partition values in the request for which partions were not returned.
    */
  var UnprocessedKeys: js.UndefOr[BatchGetPartitionValueList] = js.undefined
}

object BatchGetPartitionResponse {
  @scala.inline
  def apply(Partitions: PartitionList = null, UnprocessedKeys: BatchGetPartitionValueList = null): BatchGetPartitionResponse = {
    val __obj = js.Dynamic.literal()
    if (Partitions != null) __obj.updateDynamic("Partitions")(Partitions)
    if (UnprocessedKeys != null) __obj.updateDynamic("UnprocessedKeys")(UnprocessedKeys)
    __obj.asInstanceOf[BatchGetPartitionResponse]
  }
}

