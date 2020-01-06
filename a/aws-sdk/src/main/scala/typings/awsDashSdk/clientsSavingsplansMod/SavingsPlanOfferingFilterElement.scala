package typings.awsDashSdk.clientsSavingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlanOfferingFilterElement extends js.Object {
  /**
    * The filter name.
    */
  var name: js.UndefOr[SavingsPlanOfferingFilterAttribute] = js.native
  /**
    * The filter values.
    */
  var values: js.UndefOr[FilterValuesList] = js.native
}

object SavingsPlanOfferingFilterElement {
  @scala.inline
  def apply(name: SavingsPlanOfferingFilterAttribute = null, values: FilterValuesList = null): SavingsPlanOfferingFilterElement = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsPlanOfferingFilterElement]
  }
}

