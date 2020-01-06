package typings.awsDashSdk.clientsSavingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlanRateProperty extends js.Object {
  /**
    * The property name.
    */
  var name: js.UndefOr[SavingsPlanRatePropertyKey] = js.native
  /**
    * The property value.
    */
  var value: js.UndefOr[JsonSafeFilterValueString] = js.native
}

object SavingsPlanRateProperty {
  @scala.inline
  def apply(name: SavingsPlanRatePropertyKey = null, value: JsonSafeFilterValueString = null): SavingsPlanRateProperty = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsPlanRateProperty]
  }
}

