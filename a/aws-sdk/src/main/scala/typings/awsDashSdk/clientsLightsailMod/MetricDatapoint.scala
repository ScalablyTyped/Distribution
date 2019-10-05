package typings.awsDashSdk.clientsLightsailMod

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
  var timestamp: js.UndefOr[typings.awsDashSdk.clientsLightsailMod.timestamp] = js.undefined
  /**
    * The unit. 
    */
  var unit: js.UndefOr[MetricUnit] = js.undefined
}

object MetricDatapoint {
  @scala.inline
  def apply(
    average: Int | Double = null,
    maximum: Int | Double = null,
    minimum: Int | Double = null,
    sampleCount: Int | Double = null,
    sum: Int | Double = null,
    timestamp: timestamp = null,
    unit: MetricUnit = null
  ): MetricDatapoint = {
    val __obj = js.Dynamic.literal()
    if (average != null) __obj.updateDynamic("average")(average.asInstanceOf[js.Any])
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (sampleCount != null) __obj.updateDynamic("sampleCount")(sampleCount.asInstanceOf[js.Any])
    if (sum != null) __obj.updateDynamic("sum")(sum.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricDatapoint]
  }
}

