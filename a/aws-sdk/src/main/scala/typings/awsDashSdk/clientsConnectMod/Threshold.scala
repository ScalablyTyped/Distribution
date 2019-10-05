package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Threshold extends js.Object {
  /**
    * The Threshold to use to compare service level metrics to. Only "Less than" (LT) comparisons are supported.
    */
  var Comparison: js.UndefOr[typings.awsDashSdk.clientsConnectMod.Comparison] = js.undefined
  /**
    * The value of the threshold to compare the metric to. Only "Less than" (LT) comparisons are supported.
    */
  var ThresholdValue: js.UndefOr[typings.awsDashSdk.clientsConnectMod.ThresholdValue] = js.undefined
}

object Threshold {
  @scala.inline
  def apply(Comparison: Comparison = null, ThresholdValue: Int | Double = null): Threshold = {
    val __obj = js.Dynamic.literal()
    if (Comparison != null) __obj.updateDynamic("Comparison")(Comparison.asInstanceOf[js.Any])
    if (ThresholdValue != null) __obj.updateDynamic("ThresholdValue")(ThresholdValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Threshold]
  }
}

