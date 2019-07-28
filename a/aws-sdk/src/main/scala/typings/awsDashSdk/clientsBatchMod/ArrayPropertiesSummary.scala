package typings.awsDashSdk.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayPropertiesSummary extends js.Object {
  /**
    * The job index within the array that is associated with this job. This parameter is returned for children of array jobs.
    */
  var index: js.UndefOr[Integer] = js.undefined
  /**
    * The size of the array job. This parameter is returned for parent array jobs.
    */
  var size: js.UndefOr[Integer] = js.undefined
}

object ArrayPropertiesSummary {
  @scala.inline
  def apply(index: js.UndefOr[Integer] = js.undefined, size: js.UndefOr[Integer] = js.undefined): ArrayPropertiesSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index)
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[ArrayPropertiesSummary]
  }
}

