package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPartitionResponse extends js.Object {
  /**
    * The requested information, in the form of a Partition object.
    */
  var Partition: js.UndefOr[typings.awsDashSdk.clientsGlueMod.Partition] = js.native
}

object GetPartitionResponse {
  @scala.inline
  def apply(Partition: Partition = null): GetPartitionResponse = {
    val __obj = js.Dynamic.literal()
    if (Partition != null) __obj.updateDynamic("Partition")(Partition.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPartitionResponse]
  }
}

