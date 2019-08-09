package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartitionError extends js.Object {
  /**
    * The details about the partition error.
    */
  var ErrorDetail: js.UndefOr[typings.awsDashSdk.clientsGlueMod.ErrorDetail] = js.undefined
  /**
    * The values that define the partition.
    */
  var PartitionValues: js.UndefOr[ValueStringList] = js.undefined
}

object PartitionError {
  @scala.inline
  def apply(ErrorDetail: ErrorDetail = null, PartitionValues: ValueStringList = null): PartitionError = {
    val __obj = js.Dynamic.literal()
    if (ErrorDetail != null) __obj.updateDynamic("ErrorDetail")(ErrorDetail)
    if (PartitionValues != null) __obj.updateDynamic("PartitionValues")(PartitionValues)
    __obj.asInstanceOf[PartitionError]
  }
}

