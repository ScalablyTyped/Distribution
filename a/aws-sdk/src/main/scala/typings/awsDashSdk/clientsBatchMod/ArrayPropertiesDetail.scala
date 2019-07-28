package typings.awsDashSdk.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayPropertiesDetail extends js.Object {
  /**
    * The job index within the array that is associated with this job. This parameter is returned for array job children.
    */
  var index: js.UndefOr[Integer] = js.undefined
  /**
    * The size of the array job. This parameter is returned for parent array jobs.
    */
  var size: js.UndefOr[Integer] = js.undefined
  /**
    * A summary of the number of array job children in each available job status. This parameter is returned for parent array jobs.
    */
  var statusSummary: js.UndefOr[ArrayJobStatusSummary] = js.undefined
}

object ArrayPropertiesDetail {
  @scala.inline
  def apply(
    index: js.UndefOr[Integer] = js.undefined,
    size: js.UndefOr[Integer] = js.undefined,
    statusSummary: ArrayJobStatusSummary = null
  ): ArrayPropertiesDetail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index)
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size)
    if (statusSummary != null) __obj.updateDynamic("statusSummary")(statusSummary)
    __obj.asInstanceOf[ArrayPropertiesDetail]
  }
}

