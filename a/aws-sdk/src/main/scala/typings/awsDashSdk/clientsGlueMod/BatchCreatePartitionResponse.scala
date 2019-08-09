package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchCreatePartitionResponse extends js.Object {
  /**
    * The errors encountered when trying to create the requested partitions.
    */
  var Errors: js.UndefOr[PartitionErrors] = js.undefined
}

object BatchCreatePartitionResponse {
  @scala.inline
  def apply(Errors: PartitionErrors = null): BatchCreatePartitionResponse = {
    val __obj = js.Dynamic.literal()
    if (Errors != null) __obj.updateDynamic("Errors")(Errors)
    __obj.asInstanceOf[BatchCreatePartitionResponse]
  }
}

