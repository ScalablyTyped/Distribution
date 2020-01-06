package typings.awsDashSdk.clientsSavingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlanOfferingProperty extends js.Object {
  /**
    * The property name.
    */
  var name: js.UndefOr[SavingsPlanOfferingPropertyKey] = js.native
  /**
    * The property value.
    */
  var value: js.UndefOr[JsonSafeFilterValueString] = js.native
}

object SavingsPlanOfferingProperty {
  @scala.inline
  def apply(name: SavingsPlanOfferingPropertyKey = null, value: JsonSafeFilterValueString = null): SavingsPlanOfferingProperty = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsPlanOfferingProperty]
  }
}

