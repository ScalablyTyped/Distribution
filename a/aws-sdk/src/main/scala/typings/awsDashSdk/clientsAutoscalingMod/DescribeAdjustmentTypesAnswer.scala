package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAdjustmentTypesAnswer extends js.Object {
  /**
    * The policy adjustment types.
    */
  var AdjustmentTypes: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.AdjustmentTypes] = js.native
}

object DescribeAdjustmentTypesAnswer {
  @scala.inline
  def apply(AdjustmentTypes: AdjustmentTypes = null): DescribeAdjustmentTypesAnswer = {
    val __obj = js.Dynamic.literal()
    if (AdjustmentTypes != null) __obj.updateDynamic("AdjustmentTypes")(AdjustmentTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAdjustmentTypesAnswer]
  }
}

