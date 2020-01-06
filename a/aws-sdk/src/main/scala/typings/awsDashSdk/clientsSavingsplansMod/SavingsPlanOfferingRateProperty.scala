package typings.awsDashSdk.clientsSavingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlanOfferingRateProperty extends js.Object {
  /**
    * The property name.
    */
  var name: js.UndefOr[JsonSafeFilterValueString] = js.native
  /**
    * The property value.
    */
  var value: js.UndefOr[JsonSafeFilterValueString] = js.native
}

object SavingsPlanOfferingRateProperty {
  @scala.inline
  def apply(name: JsonSafeFilterValueString = null, value: JsonSafeFilterValueString = null): SavingsPlanOfferingRateProperty = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsPlanOfferingRateProperty]
  }
}

