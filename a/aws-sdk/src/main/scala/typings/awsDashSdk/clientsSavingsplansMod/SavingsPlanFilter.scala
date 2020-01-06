package typings.awsDashSdk.clientsSavingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlanFilter extends js.Object {
  /**
    * The filter name.
    */
  var name: js.UndefOr[SavingsPlansFilterName] = js.native
  /**
    * The filter value.
    */
  var values: js.UndefOr[ListOfStrings] = js.native
}

object SavingsPlanFilter {
  @scala.inline
  def apply(name: SavingsPlansFilterName = null, values: ListOfStrings = null): SavingsPlanFilter = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsPlanFilter]
  }
}

