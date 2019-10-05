package typings.awsDashSdk.clientsHealthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventAggregate extends js.Object {
  /**
    * The issue type for the associated count.
    */
  var aggregateValue: js.UndefOr[typings.awsDashSdk.clientsHealthMod.aggregateValue] = js.undefined
  /**
    * The number of events of the associated issue type.
    */
  var count: js.UndefOr[typings.awsDashSdk.clientsHealthMod.count] = js.undefined
}

object EventAggregate {
  @scala.inline
  def apply(aggregateValue: aggregateValue = null, count: Int | Double = null): EventAggregate = {
    val __obj = js.Dynamic.literal()
    if (aggregateValue != null) __obj.updateDynamic("aggregateValue")(aggregateValue)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventAggregate]
  }
}

