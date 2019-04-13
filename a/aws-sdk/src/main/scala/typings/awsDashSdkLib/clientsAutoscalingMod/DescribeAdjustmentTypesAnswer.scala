package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAdjustmentTypesAnswer extends js.Object {
  /**
    * The policy adjustment types.
    */
  var AdjustmentTypes: js.UndefOr[AdjustmentTypes] = js.undefined
}

object DescribeAdjustmentTypesAnswer {
  @scala.inline
  def apply(AdjustmentTypes: AdjustmentTypes = null): DescribeAdjustmentTypesAnswer = {
    val __obj = js.Dynamic.literal()
    if (AdjustmentTypes != null) __obj.updateDynamic("AdjustmentTypes")(AdjustmentTypes)
    __obj.asInstanceOf[DescribeAdjustmentTypesAnswer]
  }
}

