package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Duration extends js.Object {
  /**
    * A unit of time.
    */
  var unit: js.UndefOr[DurationUnit] = js.native
  /**
    * A number of time units.
    */
  var value: js.UndefOr[DurationValue] = js.native
}

object Duration {
  @scala.inline
  def apply(unit: DurationUnit = null, value: js.UndefOr[DurationValue] = js.undefined): Duration = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
}

