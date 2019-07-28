package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricValue extends js.Object {
  /**
    * If the comparisonOperator calls for a set of CIDRs, use this to specify that set to be compared with the metric.
    */
  var cidrs: js.UndefOr[Cidrs] = js.undefined
  /**
    * If the comparisonOperator calls for a numeric value, use this to specify that numeric value to be compared with the metric.
    */
  var count: js.UndefOr[UnsignedLong] = js.undefined
  /**
    * If the comparisonOperator calls for a set of ports, use this to specify that set to be compared with the metric.
    */
  var ports: js.UndefOr[Ports] = js.undefined
}

object MetricValue {
  @scala.inline
  def apply(cidrs: Cidrs = null, count: js.UndefOr[UnsignedLong] = js.undefined, ports: Ports = null): MetricValue = {
    val __obj = js.Dynamic.literal()
    if (cidrs != null) __obj.updateDynamic("cidrs")(cidrs)
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count)
    if (ports != null) __obj.updateDynamic("ports")(ports)
    __obj.asInstanceOf[MetricValue]
  }
}

