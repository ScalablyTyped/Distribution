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
  def apply(unit: DurationUnit = null, value: Int | Double = null): Duration = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
}

