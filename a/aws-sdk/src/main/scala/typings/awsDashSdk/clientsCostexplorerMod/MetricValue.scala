package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricValue extends js.Object {
  /**
    * The actual number that represents the metric.
    */
  var Amount: js.UndefOr[MetricAmount] = js.undefined
  /**
    * The unit that the metric is given in.
    */
  var Unit: js.UndefOr[MetricUnit] = js.undefined
}

object MetricValue {
  @scala.inline
  def apply(Amount: MetricAmount = null, Unit: MetricUnit = null): MetricValue = {
    val __obj = js.Dynamic.literal()
    if (Amount != null) __obj.updateDynamic("Amount")(Amount)
    if (Unit != null) __obj.updateDynamic("Unit")(Unit)
    __obj.asInstanceOf[MetricValue]
  }
}

