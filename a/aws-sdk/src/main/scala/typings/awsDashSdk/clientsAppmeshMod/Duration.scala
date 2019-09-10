package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duration extends js.Object {
  /**
    * The unit of time between retry attempts.
    */
  var unit: js.UndefOr[DurationUnit] = js.undefined
  /**
    * The duration of time between retry attempts.
    */
  var value: js.UndefOr[DurationValue] = js.undefined
}

object Duration {
  @scala.inline
  def apply(unit: DurationUnit = null, value: js.UndefOr[DurationValue] = js.undefined): Duration = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Duration]
  }
}

