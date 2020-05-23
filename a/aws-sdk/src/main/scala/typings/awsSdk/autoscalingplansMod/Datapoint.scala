package typings.awsSdk.autoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Datapoint extends js.Object {
  /**
    * The time stamp for the data point in UTC format.
    */
  var Timestamp: js.UndefOr[TimestampType] = js.native
  /**
    * The value of the data point.
    */
  var Value: js.UndefOr[MetricScale] = js.native
}

object Datapoint {
  @scala.inline
  def apply(Timestamp: TimestampType = null, Value: js.UndefOr[MetricScale] = js.undefined): Datapoint = {
    val __obj = js.Dynamic.literal()
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(Value)) __obj.updateDynamic("Value")(Value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Datapoint]
  }
}

