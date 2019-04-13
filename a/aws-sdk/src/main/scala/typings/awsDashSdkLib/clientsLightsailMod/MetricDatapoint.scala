package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricDatapoint extends js.Object {
  /**
    * The average.
    */
  var average: js.UndefOr[double] = js.undefined
  /**
    * The maximum.
    */
  var maximum: js.UndefOr[double] = js.undefined
  /**
    * The minimum.
    */
  var minimum: js.UndefOr[double] = js.undefined
  /**
    * The sample count.
    */
  var sampleCount: js.UndefOr[double] = js.undefined
  /**
    * The sum.
    */
  var sum: js.UndefOr[double] = js.undefined
  /**
    * The timestamp (e.g., 1479816991.349).
    */
  var timestamp: js.UndefOr[timestamp] = js.undefined
  /**
    * The unit. 
    */
  var unit: js.UndefOr[MetricUnit] = js.undefined
}

object MetricDatapoint {
  @scala.inline
  def apply(
    average: js.UndefOr[double] = js.undefined,
    maximum: js.UndefOr[double] = js.undefined,
    minimum: js.UndefOr[double] = js.undefined,
    sampleCount: js.UndefOr[double] = js.undefined,
    sum: js.UndefOr[double] = js.undefined,
    timestamp: timestamp = null,
    unit: MetricUnit = null
  ): MetricDatapoint = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(average)) __obj.updateDynamic("average")(average)
    if (!js.isUndefined(maximum)) __obj.updateDynamic("maximum")(maximum)
    if (!js.isUndefined(minimum)) __obj.updateDynamic("minimum")(minimum)
    if (!js.isUndefined(sampleCount)) __obj.updateDynamic("sampleCount")(sampleCount)
    if (!js.isUndefined(sum)) __obj.updateDynamic("sum")(sum)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricDatapoint]
  }
}

