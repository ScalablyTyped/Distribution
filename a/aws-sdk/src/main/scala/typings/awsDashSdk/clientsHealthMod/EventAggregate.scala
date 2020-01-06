package typings.awsDashSdk.clientsHealthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventAggregate extends js.Object {
  /**
    * The issue type for the associated count.
    */
  var aggregateValue: js.UndefOr[typings.awsDashSdk.clientsHealthMod.aggregateValue] = js.native
  /**
    * The number of events of the associated issue type.
    */
  var count: js.UndefOr[typings.awsDashSdk.clientsHealthMod.count] = js.native
}

object EventAggregate {
  @scala.inline
  def apply(aggregateValue: aggregateValue = null, count: Int | Double = null): EventAggregate = {
    val __obj = js.Dynamic.literal()
    if (aggregateValue != null) __obj.updateDynamic("aggregateValue")(aggregateValue.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventAggregate]
  }
}

