package typings
package awsDashSdkLib.clientsHealthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventAggregate extends js.Object {
  /**
    * The issue type for the associated count.
    */
  var aggregateValue: js.UndefOr[aggregateValue] = js.undefined
  /**
    * The number of events of the associated issue type.
    */
  var count: js.UndefOr[count] = js.undefined
}

object EventAggregate {
  @scala.inline
  def apply(aggregateValue: aggregateValue = null, count: js.UndefOr[count] = js.undefined): EventAggregate = {
    val __obj = js.Dynamic.literal()
    if (aggregateValue != null) __obj.updateDynamic("aggregateValue")(aggregateValue)
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count)
    __obj.asInstanceOf[EventAggregate]
  }
}

