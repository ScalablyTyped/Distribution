package typings
package awsDashSdkLib.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Threshold extends js.Object {
  /**
    * The Threshold to use to compare service level metrics to. Only "Less than" (LT) comparisons are supported.
    */
  var Comparison: js.UndefOr[Comparison] = js.undefined
  /**
    * The value of the threshold to compare the metric to. Only "Less than" (LT) comparisons are supported.
    */
  var ThresholdValue: js.UndefOr[ThresholdValue] = js.undefined
}

object Threshold {
  @scala.inline
  def apply(Comparison: Comparison = null, ThresholdValue: js.UndefOr[ThresholdValue] = js.undefined): Threshold = {
    val __obj = js.Dynamic.literal()
    if (Comparison != null) __obj.updateDynamic("Comparison")(Comparison.asInstanceOf[js.Any])
    if (!js.isUndefined(ThresholdValue)) __obj.updateDynamic("ThresholdValue")(ThresholdValue)
    __obj.asInstanceOf[Threshold]
  }
}

