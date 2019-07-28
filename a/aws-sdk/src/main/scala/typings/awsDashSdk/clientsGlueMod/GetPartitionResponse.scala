package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPartitionResponse extends js.Object {
  /**
    * The requested information, in the form of a Partition object.
    */
  var Partition: js.UndefOr[typings.awsDashSdk.clientsGlueMod.Partition] = js.undefined
}

object GetPartitionResponse {
  @scala.inline
  def apply(Partition: Partition = null): GetPartitionResponse = {
    val __obj = js.Dynamic.literal()
    if (Partition != null) __obj.updateDynamic("Partition")(Partition)
    __obj.asInstanceOf[GetPartitionResponse]
  }
}

