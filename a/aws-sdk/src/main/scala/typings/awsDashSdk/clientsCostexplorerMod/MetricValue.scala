package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricValue extends js.Object {
  /**
    * The actual number that represents the metric.
    */
  var Amount: js.UndefOr[MetricAmount] = js.native
  /**
    * The unit that the metric is given in.
    */
  var Unit: js.UndefOr[MetricUnit] = js.native
}

object MetricValue {
  @scala.inline
  def apply(Amount: MetricAmount = null, Unit: MetricUnit = null): MetricValue = {
    val __obj = js.Dynamic.literal()
    if (Amount != null) __obj.updateDynamic("Amount")(Amount.asInstanceOf[js.Any])
    if (Unit != null) __obj.updateDynamic("Unit")(Unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricValue]
  }
}

