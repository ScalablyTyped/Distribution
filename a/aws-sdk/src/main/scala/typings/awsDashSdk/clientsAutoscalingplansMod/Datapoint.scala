package typings.awsDashSdk.clientsAutoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Datapoint extends js.Object {
  /**
    * The time stamp for the data point in UTC format.
    */
  var Timestamp: js.UndefOr[TimestampType] = js.undefined
  /**
    * The value of the data point.
    */
  var Value: js.UndefOr[MetricScale] = js.undefined
}

object Datapoint {
  @scala.inline
  def apply(Timestamp: TimestampType = null, Value: js.UndefOr[MetricScale] = js.undefined): Datapoint = {
    val __obj = js.Dynamic.literal()
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp)
    if (!js.isUndefined(Value)) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[Datapoint]
  }
}

