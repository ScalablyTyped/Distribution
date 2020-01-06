package typings.awsDashSdk.clientsComputeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectedMetric extends js.Object {
  /**
    * The name of the projected utilization metric.  Memory metrics are only returned for resources that have the unified CloudWatch agent installed on them. For more information, see Enabling Memory Utilization with the CloudWatch Agent. 
    */
  var name: js.UndefOr[MetricName] = js.native
  /**
    * The time stamps of the projected utilization metric.
    */
  var timestamps: js.UndefOr[Timestamps] = js.native
  /**
    * The values of the projected utilization metrics.
    */
  var values: js.UndefOr[MetricValues] = js.native
}

object ProjectedMetric {
  @scala.inline
  def apply(name: MetricName = null, timestamps: Timestamps = null, values: MetricValues = null): ProjectedMetric = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (timestamps != null) __obj.updateDynamic("timestamps")(timestamps.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectedMetric]
  }
}

