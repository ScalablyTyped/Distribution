package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeletePartitionResponse extends js.Object {
  /**
    * The errors encountered when trying to delete the requested partitions.
    */
  var Errors: js.UndefOr[PartitionErrors] = js.native
}

object BatchDeletePartitionResponse {
  @scala.inline
  def apply(Errors: PartitionErrors = null): BatchDeletePartitionResponse = {
    val __obj = js.Dynamic.literal()
    if (Errors != null) __obj.updateDynamic("Errors")(Errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeletePartitionResponse]
  }
}

