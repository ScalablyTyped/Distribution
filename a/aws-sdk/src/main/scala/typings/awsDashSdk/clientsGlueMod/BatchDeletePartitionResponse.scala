package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDeletePartitionResponse extends js.Object {
  /**
    * Errors encountered when trying to delete the requested partitions.
    */
  var Errors: js.UndefOr[PartitionErrors] = js.undefined
}

object BatchDeletePartitionResponse {
  @scala.inline
  def apply(Errors: PartitionErrors = null): BatchDeletePartitionResponse = {
    val __obj = js.Dynamic.literal()
    if (Errors != null) __obj.updateDynamic("Errors")(Errors)
    __obj.asInstanceOf[BatchDeletePartitionResponse]
  }
}

