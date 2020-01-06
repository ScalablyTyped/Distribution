package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartitionError extends js.Object {
  /**
    * The details about the partition error.
    */
  var ErrorDetail: js.UndefOr[typings.awsDashSdk.clientsGlueMod.ErrorDetail] = js.native
  /**
    * The values that define the partition.
    */
  var PartitionValues: js.UndefOr[ValueStringList] = js.native
}

object PartitionError {
  @scala.inline
  def apply(ErrorDetail: ErrorDetail = null, PartitionValues: ValueStringList = null): PartitionError = {
    val __obj = js.Dynamic.literal()
    if (ErrorDetail != null) __obj.updateDynamic("ErrorDetail")(ErrorDetail.asInstanceOf[js.Any])
    if (PartitionValues != null) __obj.updateDynamic("PartitionValues")(PartitionValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartitionError]
  }
}

